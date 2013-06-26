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
                                    

package org.modelio.gproject.ramc.core.packaging;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.ramc.core.model.ModelComponent;
import org.modelio.gproject.ramc.core.packaging.filters.ConfigurableModelFilter;
import org.modelio.gproject.ramc.core.packaging.filters.RamcFilterBuilder;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.factory.ModelFactory;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.vcore.model.filter.IObjectFilter;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("5ff5fb2f-9e9e-11e1-a22d-001ec947ccaf")
class ModelExporter {
    @objid ("bb83a292-4467-11e2-b513-002564c97630")
    private ICoreSession targetSession;

    @objid ("9247aa1d-bb83-11e1-9fd3-001ec947ccaf")
    private Set<MObject> objectsToExternalize = new HashSet<>();

    @objid ("9247aa20-bb83-11e1-9fd3-001ec947ccaf")
    private Set<MObject> done = new HashSet<>();

    @objid ("9247aa27-bb83-11e1-9fd3-001ec947ccaf")
    private IRepository targetRepository;

    @objid ("f4801d3c-ae27-4ec4-af64-820b6adf6500")
    private Map<UUID, MObject> aliases = new HashMap<>();

    @objid ("968cea54-8776-492c-b216-20351dac32f3")
    private IObjectFilter modelFilter;

    @objid ("99625d2d-cc56-4e9c-aa46-3311ca599fe6")
    private final DepWalker depWalker = new DepWalker();

    @objid ("ac6e882e-a419-11e1-aa98-001ec947ccaf")
    public void addObject(final MObject o) {
        this.objectsToExternalize.add(o);
    }

    @objid ("ac70ea45-a419-11e1-aa98-001ec947ccaf")
    public void run(Metadatas metadatas) {
        assert (this.modelFilter != null);
        
        // Export the manifested objects
        for (MObject anObject : this.objectsToExternalize) {
            externalizeObject(anObject);
        }
        
        // Export the stub objects, this will also compute root elements
        Set<MObject> stubs = computeStubObjectsToExport(metadatas);
        externalizeStubObject(metadatas, stubs);
        
        // Remap roots: as some root elements might have been exported as
        // aliases...
        for (MRef root : metadatas.getRoots()) {
            if (this.aliases.containsKey(root.uuid)) {
                // remap it
                root.uuid = this.aliases.get(root.uuid).getUuid();
            }
        }
        
        this.done.clear();
    }

    @objid ("ac70ea4a-a419-11e1-aa98-001ec947ccaf")
    private MObject externalizeObject(final MObject obj) {
        //System.out.println("ModelExporter.externalizeObject() " + obj);
        
        // Look for 'obj' equivalent in the target session
        MObject targetObj = this.targetSession.getModel().findById(obj.getMClass(), obj.getUuid());
        
        // If 'obj' is known to have been already processed, return the target
        // equivalent object found above.
        if (this.done.contains(obj))
            return targetObj;
        
        // As we are about to process it, add 'obj' to done objects.
        // We have to mark it here because of the natural recursive behavior of
        // externalizeObject
        this.done.add(obj);
        
        // Create target object if necessary ie:
        // a) if targetObj is null, the case is straightforward => create the
        // object
        // b) if targetObj is not null but is a shell, the trick is that the
        // createObject() of the factory will take care of smartly "un-shelling"
        // the existing shell object into a plain viable object
        if (targetObj == null || targetObj.isShell()) {
            targetObj = ((CoreSession) this.targetSession).getSmFactory().createObject((SmClass) obj.getMClass(),
                    this.targetRepository, obj.getUuid());
        }
        
        // Copy meta-attribute values
        for (SmAttribute att : ((SmClass) obj.getMClass()).getAllAttDef()) {
            targetObj.mSet(att, obj.mGet(att));
        }
        
        // Export composition dependencies
        for (MDependency desc : this.depWalker.getCompositionDeps(obj)) {
            SmDependency smDep = (SmDependency) desc;
            for (MObject val : obj.mGet(smDep)) {
                if (this.modelFilter.accept(val)) {
                    MObject targetVal = externalizeObject(val);
                    targetObj.mGet(smDep).add(targetVal);
                }
            }
        }
        
        // Export non-composition dependencies
        for (MDependency desc : this.depWalker.getReferenceDeps(obj)) {
            SmDependency smDep = (SmDependency) desc;
            for (MObject val : obj.mGet(smDep)) {
                MObject targetVal = getTargetObject(val);
                targetObj.mGet(smDep).add(targetVal);
            }
        }
        return targetObj;
    }

    @objid ("ac70ea4f-a419-11e1-aa98-001ec947ccaf")
    private MObject getTargetObject(final MObject anObject) {
        MObject ret = ((CoreSession) this.targetSession).getModel().findById(anObject.getMClass(), anObject.getUuid());
        
        if (ret == null) {
            ret = ((CoreSession) this.targetSession).getSmFactory().createShellObject((SmClass) anObject.getMClass(),
                    ((CoreSession) this.targetSession).getShellRepository(), anObject.getUuid(), anObject.getName());
        }
        return ret;
    }

    @objid ("c2e03fe8-a5b8-11e1-aa98-001ec947ccaf")
    public ModelExporter(final ICoreSession targetSession, final IRepository targetRepository) {
        assert (targetSession != null);
        assert (targetRepository != null);
        
        this.targetSession = targetSession;
        this.targetRepository = targetRepository;
    }

    /**
     * Compute and return the stub objects to export. Register the found roots
     * in metadatas.
     * @param metadatas @return
     */
    @objid ("c2e03fee-a5b8-11e1-aa98-001ec947ccaf")
    private Set<MObject> computeStubObjectsToExport(Metadatas metadatas) {
        Set<MObject> stubObjectsToExport = new HashSet<>();
        
        for (MObject obj : this.objectsToExternalize) {
            MObject composed = obj.getCompositionOwner();
        
            // Add all parents that have not been serialized until the root
            // package, RequirementContainer, Dictionary or a MDA Modeler
            // Component.
            boolean more = true;
            MObject current = obj;
            do {
                if (composed == null) {
                    // Reached a root
                    metadatas.addRoot(new MRef(current));
                    more = false;
        
                } else if (stubObjectsToExport.contains(composed)) {
                    // Already in the set
                    more = false;
                } else {
                    // The element must not have been serialized in full mode
                    if (!this.done.contains(composed)) {
                        stubObjectsToExport.add(composed);
                        current = composed;
                        composed = composed.getCompositionOwner();
                    } else {
                        // Avoid infinite loop :)
                        more = false;
                    }
                }
        
            } while (more);
        }
        return stubObjectsToExport;
    }

    @objid ("e61232c9-d02c-11e1-a8eb-001ec947ccaf")
    public void setModelFilter(ConfigurableModelFilter modelFilter) {
        this.modelFilter = modelFilter;
    }

    @objid ("6dcca2cc-77f5-4860-9da4-ae5e9a6c4536")
    private void externalizeStubObject(Metadatas metadatas, Set<MObject> stubObjects) {
        if (stubObjects.isEmpty()) {
            return;
        }
        
        MObject firstStub = stubObjects.iterator().next();
        
        IModelFactory factory = ModelFactory.getFactory(firstStub);
        
        Stereotype aliasStereotype = null;
        List<Stereotype> stereotypes = factory.findStereotype("ModelerModule", "ModelComponentElementAlias",
                Metamodel.getMClass(ModelElement.class));
        if (!stereotypes.isEmpty())
            // Get the stereotype from the target session!
            aliasStereotype = (Stereotype) getTargetObject(stereotypes.get(0));
        
        TagType uuidTagType = null;
        List<TagType> tagTypes = factory.findTagType("ModelerModule", "uuid", Metamodel.getMClass(ModelElement.class));
        if (!tagTypes.isEmpty())
            // Get the tag type from the target session!
            uuidTagType = (TagType) getTargetObject(tagTypes.get(0));
        
        // First step: create all the objects
        for (MObject o : stubObjects) {
            // Look for 'obj' equivalent in the target session
            MObject alias = this.targetSession.getModel().findById(o.getMClass(), o.getUuid());
            // If 'obj' is known to have been already processed, return the
            // target
            // equivalent object found above.
            if (this.aliases.containsKey(o.getUuid()))
                continue;
        
            // Create target object if necessary,the created object is an alias
            if (alias == null) {
                alias = ((CoreSession) this.targetSession).getSmFactory().createObject((SmClass) o.getMClass(),
                        this.targetRepository);
                if (aliasStereotype != null) {
                    IModelFactory targetFactory = ModelFactory.getFactory(alias);
                    ((ModelElement) alias).getExtension().add(aliasStereotype);
                    TaggedValue tag = targetFactory.createTaggedValue(uuidTagType, (ModelElement) alias);
                    targetFactory.createTagParameter(o.getUuid().toString(), tag);
                }
        
                this.aliases.put(o.getUuid(), alias);
        
            }
        }
        
        // Second step branch the composition dependencies that are applicable.
        for (MObject o : stubObjects) {
        
            MObject alias = this.aliases.get(o.getUuid());
        
            // Copy meta-attribute values
            for (SmAttribute att : ((SmClass) o.getMClass()).getAllAttDef()) {
                alias.mSet(att, o.mGet(att));
            }
        
            // DO NOT export composition dependencies, unless to already
            // exported
            // objects or to other alias objects
            for (MDependency desc : this.depWalker.getCompositionDeps(o)) {
                SmDependency smDep = (SmDependency) desc;
                for (MObject val : o.mGet(smDep)) {
                    if (this.modelFilter.accept(val)) {
                        if (this.done.contains(val)) {
                            // composition towards a plain exported element
                            MObject target = this.targetSession.getModel().findById(val.getMClass(), val.getUuid());
                            alias.mGet(smDep).add(target);
                        } else if (this.aliases.containsKey(val.getUuid())) {
                            // composition towards another alias
                            alias.mGet(smDep).add(this.aliases.get(val.getUuid()));
                        } else {
                            // ignore
        
                        }
                    }
                }
            }
        
            // DO NOT Export non-composition dependencies
            // for (MDependency desc : this.modelFilter.getReferenceDeps(obj)) {
            // SmDependency smDep = (SmDependency) desc;
            // for (MObject val : obj.mGet(smDep)) {
            // MObject targetVal = getTargetObject(val);
            // targetObj.mGet(smDep).add(targetVal);
            // }
            // }
        
        }
    }

    @objid ("6e27ea41-a8d2-4e5c-aee7-dbc68daa1361")
    public void configureModelExporter(ModelComponent ramc, boolean exportArtifact, List<IModelComponentContributor> contributors) {
        // The ramc artifact itself
        if (exportArtifact)
            addObject(ramc.getArtifact());
        
        // Elements directly manifested by the RAMC
        for (Element e : ramc.getExportedElements()) {
            addObject(e);
        }
        
        RamcFilterBuilder builder = new RamcFilterBuilder(ramc.getArtifact());
        
        for (IModelComponentContributor contributor : contributors) {
            // System.out.printf("Contributions by '%s'\n",
            // contributor.toString());
            // Additional elements by contributor
            for (MObject o : contributor.getElements()) {
                if (o != null) {
                    addObject(o);
                    // System.out.printf("  - element '%s'\n", o.toString());
                }
            }
            // Filter configuration by contributor
            for (NoteType type : contributor.getNoteTypes()) {
                if (type != null) {
                    builder.addNoteType(type);
                    // System.out.printf("  - note type '%s'\n",
                    // type.toString());
                }
            }
            for (TagType type : contributor.getTagTypes()) {
                if (type != null) {
                    builder.addTagType(type);
                    // System.out.printf("  - tag type '%s'\n",
                    // type.toString());
                }
            }
            for (Stereotype type : contributor.getDependencyStereotypes()) {
                if (type != null) {
                    builder.addDependencyStereotype(type);
                    // System.out.printf("  - dep stereotype '%s'\n",
                    // type.toString());
                }
            }
        }
        
        // Filter configured by contributors
        setModelFilter(builder.getModelFilter());
    }

    @objid ("bc08eef2-d369-40c7-8a83-1a28ed412943")
    private static class DepWalker {
        @objid ("c4da04e5-2b54-4895-b60d-d0ea8abb5486")
        private Map<MClass, Collection<MDependency>> compositionDeps = new HashMap<>();

        @objid ("a12ec7d1-4454-49dd-9277-793bb68313ca")
        private Map<MClass, Collection<MDependency>> referenceDeps = new HashMap<>();

        /**
         * Get the metamodel relation to use as composition for a given object.
         * @param srcObject an object
         * @return the relations to use as composition.
         */
        @objid ("cbd6c07a-e76d-49de-af78-572ead491653")
        public Collection<MDependency> getCompositionDeps(MObject srcObject) {
            Collection<MDependency> ret = this.compositionDeps.get(srcObject.getMClass());
            if (ret != null)
                return ret;
            
            ret = new ArrayList<>();
            for (MDependency dep : srcObject.getMClass().getDependencies(true)) {
                if (dep.isComposition() || ((SmDependency) dep).isSharedComposition()) {
                    ret.add(dep);
                }
            }
            
            this.compositionDeps.put(srcObject.getMClass(), ret);
            return ret;
        }

        /**
         * Get the metamodel relation to use as reference for a given object.
         * @param srcObject an object
         * @return the relations to use as reference.
         */
        @objid ("1702baa3-addb-44e1-a883-d5fe8d315dbe")
        public Collection<MDependency> getReferenceDeps(MObject srcObject) {
            Collection<MDependency> ret = this.referenceDeps.get(srcObject.getMClass());
            if (ret != null)
                return ret;
            
            ret = new ArrayList<>();
            for (MDependency dep : srcObject.getMClass().getDependencies(true)) {
                if (!dep.isComposition() && !dep.isSharedComposition() && ((SmDependency) dep).isPartOf())
                    ret.add(dep);
            }
            
            this.referenceDeps.put(srcObject.getMClass(), ret);
            return ret;
        }

    }

}
