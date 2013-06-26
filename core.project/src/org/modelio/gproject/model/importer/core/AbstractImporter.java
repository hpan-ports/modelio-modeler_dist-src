/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.gproject.model.importer.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.facilities.BrokenElementTester;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.mda.Project;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("008d8740-5246-1091-8d81-001ec947cd2a")
public abstract class AbstractImporter {
    @objid ("008d8f6a-5246-1091-8d81-001ec947cd2a")
    protected Result result;

    @objid ("008d96f4-5246-1091-8d81-001ec947cd2a")
    public final IImportReport execute(final ICoreSession localSession, final SmObjectImpl localRoot, final ICoreSession refSession, List<SmObjectImpl> refRoots) {
        this.result = new Result();
        
        // STEP 1:
        prepare(localSession, localRoot, refSession, refRoots);
        
        // STEP 2: Create or find all 'nodes' and update meta-attributes
        importElements(localSession, localRoot, refSession, refRoots);
        
        // STEP 3: fill links between nodes
        importDependencies();
        
        // STEP 4: Process orphan roots
        fixOrphanRoots(localSession, localRoot, refRoots);
        
        // STEP 5: Fix broken elements
        fixElements();
        
        // STEP 6: Mark all remaining orphan elements as 'to delete'
        collectGarbage();
        
        // STEP 7: Definitively delete unwanted elements
        deleteGarbage();
        
        // STEP 8: Build the import report
        return new ImportReport(this.result);
    }

    @objid ("008ebcfa-5246-1091-8d81-001ec947cd2a")
    protected abstract void prepare(final ICoreSession localSession, final SmObjectImpl localRoot, final ICoreSession refSession, List<SmObjectImpl> refRoots);

    @objid ("008efe40-5246-1091-8d81-001ec947cd2a")
    protected abstract void importElements(final ICoreSession localSession, final SmObjectImpl localRoot, final ICoreSession refSession, List<SmObjectImpl> refRoots);

    @objid ("008f857c-5246-1091-8d81-001ec947cd2a")
    private void importDependencies() {
        // Import dependencies for the created objects
        for (Entry<SmObjectImpl, SmObjectImpl> entry : this.result.getCreations().entrySet()) {
            SmObjectImpl refObject = entry.getKey();
            SmObjectImpl localObject = entry.getValue();
        
            importCompositionDependencies(refObject, localObject);
            importReferenceDependencies(refObject, localObject);
        }
        
        // Import dependencies for the updated objects
        for (Entry<SmObjectImpl, SmObjectImpl> entry : this.result.getUpdates().entrySet()) {
            SmObjectImpl refObject = entry.getKey();
            SmObjectImpl localObject = entry.getValue();
        
            importCompositionDependencies(refObject, localObject);
            importReferenceDependencies(refObject, localObject);
        }
    }

    @objid ("008e8bfe-5246-1091-8d81-001ec947cd2a")
    protected abstract void importCompositionDependencies(final SmObjectImpl refObject, SmObjectImpl localObject);

    @objid ("008ea44a-5246-1091-8d81-001ec947cd2a")
    protected abstract void importReferenceDependencies(final SmObjectImpl refObject, SmObjectImpl localObject);

    @objid ("008df932-5246-1091-8d81-001ec947cd2a")
    private void fixOrphanRoots(final ICoreSession localSession, final SmObjectImpl localRoot, List<SmObjectImpl> refRoots) {
        // Gather all root orphans
        Map<SmObjectImpl, SmDependency> rootOrphans = new HashMap<>();
        for (SmObjectImpl refRoot : refRoots) {
            SmObjectImpl localObject = this.result.getObjectCreatedFrom(refRoot);
        
            if (localObject == null) {
                localObject = this.result.getObjectUpdatedFrom(refRoot);
            }
        
            if (localObject!=null && localObject.getCompositionOwner() == null) {
                rootOrphans.put(localObject, refRoot.getCompositionRelation().dep);
            }
        }
        
        fixOrphanRoots(rootOrphans, localSession, localRoot);
    }

    @objid ("008e597c-5246-1091-8d81-001ec947cd2a")
    protected abstract void fixOrphanRoots(Map<SmObjectImpl, SmDependency> orphans, ICoreSession localSession, SmObjectImpl localRoot);

    @objid ("008debcc-5246-1091-8d81-001ec947cd2a")
    private void fixElements() {
        for (Entry<SmObjectImpl, SmObjectImpl> entry : this.result.getCreations().entrySet()) {
            SmObjectImpl refObject = entry.getKey();
            SmObjectImpl localObject = entry.getValue();
        
            if (localObject != null && !localObject.isDeleted()) {
                fixElement(localObject, refObject);
            }
        }
        
        for (Entry<SmObjectImpl, SmObjectImpl> entry : this.result.getUpdates().entrySet()) {
            SmObjectImpl refObject = entry.getKey();
            SmObjectImpl localObject = entry.getValue();
        
            if (localObject != null && !localObject.isDeleted()) {
                fixElement(localObject, refObject);
            }
        }
    }

    @objid ("008e4112-5246-1091-8d81-001ec947cd2a")
    protected abstract void fixElement(SmObjectImpl localObject, final SmObjectImpl refObject);

    @objid ("008789c6-e548-108f-8d81-001ec947cd2a")
    private final void collectGarbage() {
        // Iterates ~garbaged~ elements,
        // Finds the orphan elements that are not root elements,
        // then delete them.
        BrokenElementTester tester = new BrokenElementTester();
        
        // Get rid of orphan
        for (SmObjectImpl localObject : this.result.getGarbage()) {
            if (localObject.getCompositionOwner() == null && !isRoot(localObject)) {
                // delete it
                this.result.addObjectToDelete(localObject);
            }
        }
        
        // Find broken created elements and mark them deleted
        for (SmObjectImpl localObject : this.result.getCreations().values()) {
            if (localObject != null && localObject.isValid() && tester.isBroken(localObject)) {
                this.result.addObjectToDelete(localObject);
            }
        }
        
        // Find broken updated elements and mark them deleted
        for (SmObjectImpl localObject : this.result.getUpdates().values()) {
            if (localObject != null && localObject.isValid() && tester.isBroken(localObject)) {
                this.result.addObjectToDelete(localObject);
            }
        }
    }

    @objid ("008e3334-5246-1091-8d81-001ec947cd2a")
    private void deleteGarbage() {
        for (SmObjectImpl localObjectToDelete : this.result.getDeletions()) {
            // FIXME was: localObjectToDelete.Remove();
            localObjectToDelete.delete();
        }
    }

    @objid ("0087a488-e548-108f-8d81-001ec947cd2a")
    protected static boolean isRoot(final SmObjectImpl obj) {
        return obj.getMClass() == Metamodel.getMClass(Project.class);
    }

    @objid ("00924ae6-5246-1091-8d81-001ec947cd2a")
    private static class ImportReport implements IImportReport {
        @objid ("00925b9e-5246-1091-8d81-001ec947cd2a")
        private final Result result;

        @objid ("00926ab2-5246-1091-8d81-001ec947cd2a")
        public ImportReport(org.modelio.gproject.model.importer.core.AbstractImporter.Result result) {
            this.result = result;
        }

        @objid ("009285ba-5246-1091-8d81-001ec947cd2a")
        @Override
        public List<SmObjectImpl> getCreatedObjects() {
            return this.result.getCreatedObjects();
        }

        @objid ("0092b4e0-5246-1091-8d81-001ec947cd2a")
        @Override
        public List<SmObjectImpl> getUpdatedObjects() {
            return this.result.getUpdatedObjects();
        }

        @objid ("0092e3de-5246-1091-8d81-001ec947cd2a")
        @Override
        public List<SmObjectImpl> getDeletedObjects() {
            return this.result.getDeletions();
        }

    }

    @objid ("0082901a-e548-108f-8d81-001ec947cd2a")
    protected static class Result {
        @objid ("0082a23a-e548-108f-8d81-001ec947cd2a")
        protected Map<SmObjectImpl, SmObjectImpl> createdObjects = new HashMap<>();

        @objid ("0082bcd4-e548-108f-8d81-001ec947cd2a")
        protected List<SmObjectImpl> objectsToDelete = new ArrayList<>();

        @objid ("0082ded0-e548-108f-8d81-001ec947cd2a")
        protected List<SmObjectImpl> objectsToGarbage = new ArrayList<>();

        @objid ("0082fa96-e548-108f-8d81-001ec947cd2a")
        protected Map<SmObjectImpl, SmObjectImpl> replacedObjects = new HashMap<>();

        @objid ("00157c14-e70c-108f-8d81-001ec947cd2a")
        public Result() {
        }

        @objid ("0083135a-e548-108f-8d81-001ec947cd2a")
        public void addCreatedObject(SmObjectImpl localObject, SmObjectImpl refObject) {
            this.createdObjects.put(refObject, localObject);
        }

        @objid ("00832a5c-e548-108f-8d81-001ec947cd2a")
        public void addObjectToDelete(SmObjectImpl localObject) {
            this.objectsToDelete.add(localObject);
        }

        @objid ("00833c54-e548-108f-8d81-001ec947cd2a")
        public void addObjectToGarbage(SmObjectImpl localObject) {
            this.objectsToGarbage.add(localObject);
        }

        @objid ("00834e92-e548-108f-8d81-001ec947cd2a")
        public void addUpdatedObject(SmObjectImpl localObject, SmObjectImpl refObject) {
            // Add updated SmObjectImpl only if it has not been created
            if (getObjectCreatedFrom(refObject) == null) {
                this.replacedObjects.put(refObject, localObject);
            }
        }

        @objid ("00836620-e548-108f-8d81-001ec947cd2a")
        public List<SmObjectImpl> getCreatedObjects() {
            return new ArrayList<>(this.createdObjects.values());
        }

        @objid ("00838c68-e548-108f-8d81-001ec947cd2a")
        public List<SmObjectImpl> getObjectsToDelete() {
            return new ArrayList<>(this.objectsToDelete);
        }

        @objid ("0083b292-e548-108f-8d81-001ec947cd2a")
        public List<SmObjectImpl> getUpdatedObjects() {
            return new ArrayList<>(this.replacedObjects.values());
        }

        @objid ("0083d8ee-e548-108f-8d81-001ec947cd2a")
        public Map<SmObjectImpl, SmObjectImpl> getCreations() {
            return this.createdObjects;
        }

        @objid ("00840134-e548-108f-8d81-001ec947cd2a")
        public List<SmObjectImpl> getDeletions() {
            return this.objectsToDelete;
        }

        @objid ("00842a42-e548-108f-8d81-001ec947cd2a")
        public List<SmObjectImpl> getGarbage() {
            return this.objectsToGarbage;
        }

        @objid ("00845bc0-e548-108f-8d81-001ec947cd2a")
        public SmObjectImpl getObjectCreatedFrom(final SmObjectImpl refObject) {
            return this.createdObjects.get(refObject);
        }

        @objid ("008485be-e548-108f-8d81-001ec947cd2a")
        public SmObjectImpl getObjectUpdatedFrom(final SmObjectImpl refObject) {
            return this.replacedObjects.get(refObject);
        }

        @objid ("0084b070-e548-108f-8d81-001ec947cd2a")
        public Map<SmObjectImpl, SmObjectImpl> getUpdates() {
            return this.replacedObjects;
        }

        @objid ("0084d9ce-e548-108f-8d81-001ec947cd2a")
        public boolean isCreated(final SmObjectImpl localObject) {
            return this.createdObjects.containsValue(localObject);
        }

        @objid ("0085044e-e548-108f-8d81-001ec947cd2a")
        public boolean isDeleted(final SmObjectImpl localObject) {
            return this.objectsToDelete.contains(localObject);
        }

        @objid ("00852f32-e548-108f-8d81-001ec947cd2a")
        public boolean isImported(final SmObjectImpl localObject) {
            return isCreated(localObject) || isUpdated(localObject);
        }

        @objid ("00855a98-e548-108f-8d81-001ec947cd2a")
        public boolean isUpdated(final SmObjectImpl localObject) {
            return this.replacedObjects.containsValue(localObject);
        }

        @objid ("00858612-e548-108f-8d81-001ec947cd2a")
        public void mergeListsFrom(final Result result) {
            this.createdObjects.putAll(result.getCreations());
            this.replacedObjects.putAll(result.getUpdates());
            this.objectsToDelete.addAll(result.getDeletions());
        }

        @objid ("0085a5d4-e548-108f-8d81-001ec947cd2a")
        private void removeCreatedObject(final SmObjectImpl localObject) {
            SmObjectImpl key = null;
            for (Entry<SmObjectImpl, SmObjectImpl> entry : this.createdObjects.entrySet()) {
                if (entry.getValue().equals(localObject)) {
                    key = entry.getKey();
                    break;
                }
            }
            if (key != null) {
                this.createdObjects.remove(key);
            }
        }

        @objid ("0085c604-e548-108f-8d81-001ec947cd2a")
        public void removeCreation(final SmObjectImpl refObject) {
            this.createdObjects.remove(refObject);
        }

        @objid ("0085e684-e548-108f-8d81-001ec947cd2a")
        public void removeObjectToDelete(final SmObjectImpl localObject) {
            this.objectsToDelete.remove(localObject);
        }

        @objid ("00860722-e548-108f-8d81-001ec947cd2a")
        public void removeUpdate(final SmObjectImpl refObject) {
            this.replacedObjects.remove(refObject);
        }

        @objid ("008627e8-e548-108f-8d81-001ec947cd2a")
        private void removeUpdatedObject(final SmObjectImpl localObject) {
            SmObjectImpl key = null;
            for (Entry<SmObjectImpl, SmObjectImpl> entry : this.replacedObjects.entrySet()) {
                if (entry.getValue().equals(localObject)) {
                    key = entry.getKey();
                    break;
                }
            }
            if (key != null) {
                this.replacedObjects.remove(key);
            }
        }

    }

}
