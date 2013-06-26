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
                                    

package org.modelio.gproject.model.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.facilities.CompositionInitializer;
import org.modelio.gproject.model.importer.defaultimporter.DefaultImporter;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("01f419b4-0000-291f-0000-000000000000")
public class CopyMachine extends DefaultImporter {
    @objid ("000c3348-5247-1091-8d81-001ec947cd2a")
    private boolean monoSession;

    @objid ("000c41da-5247-1091-8d81-001ec947cd2a")
    @Override
    protected void prepare(ICoreSession localSession, SmObjectImpl localRoot, ICoreSession refSession, List<SmObjectImpl> refRoots) {
        this.monoSession = localSession == refSession;
        
        CopierObjectFinder objectFinder = new CopierObjectFinder(this);
        setObjectFinder(objectFinder);
        
        ReferenceDependencyCopier depUpdater = new ReferenceDependencyCopier(localSession, objectFinder);
        setCompositionDepUpdater(depUpdater);
        setReferenceDepUpdater(depUpdater);
        
        // Filter children of elements already copied
        // e.g.: remove an operation from the source if its owner class is in the sources too.
        List<SmObjectImpl> reducedRefRoots = new ArrayList<>();
        for (SmObjectImpl obj1 : refRoots) {
            boolean found = false;
            for (SmObjectImpl obj2 : refRoots) {
                if ((obj1 != obj2) && obj1.equals(obj2.getCompositionOwner())) {
                    found = true;
                    break;
                }
            }
        
            if (!found) {
                reducedRefRoots.add(obj1);
            }
        }
        
        super.prepare(localSession, localRoot, refSession, reducedRefRoots);
    }

    @objid ("000c7f92-5247-1091-8d81-001ec947cd2a")
    SmObjectImpl getMappedObject(SmObjectImpl searchedObject) {
        return this.result.getObjectCreatedFrom(searchedObject);
    }

    @objid ("000ca274-5247-1091-8d81-001ec947cd2a")
    boolean isMonoSession() {
        return this.monoSession;
    }

    @objid ("000cc10a-5247-1091-8d81-001ec947cd2a")
    @Override
    protected void importElements(ICoreSession localSession, SmObjectImpl localRoot, ICoreSession refSession, List<SmObjectImpl> refRoots) {
        // Create all 'nodes' and update meta-attributes
        for (SmObjectImpl refToImport : getCompositionGetter().getAllChildren(refRoots)) {
            SmObjectImpl localObject = (SmObjectImpl) localSession.getModel().getGenericFactory().create(refToImport.getClassOf().getJavaInterface(), localSession.getRepositorySupport().getRepository(localRoot != null ? localRoot : refToImport));
        
            // Import attributes
            getAttributesImporter().importAttributes(refToImport, localObject);
        
            this.result.addCreatedObject(localObject, refToImport);
        }
    }

    @objid ("000cfcc4-5247-1091-8d81-001ec947cd2a")
    @Override
    protected void fixOrphanRoots(Map<SmObjectImpl, SmDependency> orphans, ICoreSession localSession, SmObjectImpl localRoot) {
        if (localRoot == null && isMonoSession()) {
            for (Entry<SmObjectImpl, SmDependency> orphanEntry : orphans.entrySet()) {
                SmObjectImpl orphan = orphanEntry.getKey();
                
                for (Entry<SmObjectImpl, SmObjectImpl> entry : this.result.getCreations().entrySet()) {
                    SmObjectImpl localObject = entry.getValue();
                    if (orphan.equals(localObject)) {
                        SmObjectImpl refObject = entry.getKey();
                        CompositionInitializer initializer = new CompositionInitializer(refObject.getCompositionOwner());
                        initializer.execute(orphan, orphanEntry.getValue());
                        break;
                    }
                }
            }
        } else {
            super.fixOrphanRoots(orphans, localSession, localRoot);
        }
    }

    @objid ("3cdea8f4-78b9-47a8-a2b6-4cfdd88910b4")
    @Override
    protected void fixElement(SmObjectImpl localObject, SmObjectImpl refObject) {
        DiagramsCopier diagramCopier = new DiagramsCopier();
        
        if (localObject instanceof AbstractDiagram) {
            diagramCopier.fixDiagram((AbstractDiagram) localObject, this.result.getCreations());
        }
    }

}
