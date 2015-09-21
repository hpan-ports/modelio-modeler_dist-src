/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.diagrams.AbstractDiagramSmClass;
import org.modelio.metamodel.impl.diagrams.DiagramSetSmClass;
import org.modelio.metamodel.impl.mda.ProjectSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("631adaa3-d7f7-47b1-8dba-62b2b07541c7")
public class DiagramSetSmClass extends ModelElementSmClass {
    @objid ("162a519b-c189-4827-9b32-df9bf03834eb")
    private SmDependency subDep;

    @objid ("6b77df31-47df-449e-8afd-b4800716a956")
    private SmDependency parentDep;

    @objid ("6ea036b3-1209-4ec8-862e-fc61123d1db2")
    private SmDependency referencedDiagramDep;

    @objid ("fc07a577-a05a-45c5-a3e2-575707c2001b")
    private SmDependency ownerDep;

    @objid ("0609d7d3-89d3-47fe-afb6-4076926deb7a")
    public DiagramSetSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7450b037-2d14-4b12-a1c9-f1cf762ff479")
    @Override
    public String getName() {
        return "DiagramSet";
    }

    @objid ("f3442d91-586a-47ed-9b1d-cc9355ec8707")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("b0cec14a-190c-44ac-ab66-226bbcb8efc7")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return DiagramSet.class;
    }

    @objid ("37fe948b-9d48-4743-be34-1f4e034aeaeb")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("907de441-d2bc-468c-b5bd-22634cde867f")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("ac105e58-d096-4532-a024-172fbe4a4617")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new DiagramSetObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.subDep = new SubSmDependency();
        this.subDep.init("Sub", this, metamodel.getMClass("DiagramSet"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.subDep);
        
        this.parentDep = new ParentSmDependency();
        this.parentDep.init("Parent", this, metamodel.getMClass("DiagramSet"), 0, 1 );
        registerDependency(this.parentDep);
        
        this.referencedDiagramDep = new ReferencedDiagramSmDependency();
        this.referencedDiagramDep.init("ReferencedDiagram", this, metamodel.getMClass("AbstractDiagram"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.referencedDiagramDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("Project"), 0, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("d66f31d2-45b9-4a79-b76b-c7944d088045")
    public SmDependency getSubDep() {
        if (this.subDep == null) {
        	this.subDep = this.getDependencyDef("Sub");
        }
        return this.subDep;
    }

    @objid ("4589ac75-5c02-412d-8a71-75d1aa9153a8")
    public SmDependency getParentDep() {
        if (this.parentDep == null) {
        	this.parentDep = this.getDependencyDef("Parent");
        }
        return this.parentDep;
    }

    @objid ("7c5ce2a2-5359-4612-bd21-4fa06938633d")
    public SmDependency getReferencedDiagramDep() {
        if (this.referencedDiagramDep == null) {
        	this.referencedDiagramDep = this.getDependencyDef("ReferencedDiagram");
        }
        return this.referencedDiagramDep;
    }

    @objid ("05aee03f-24c6-4af4-8449-bff6c2e6b84e")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("7c2a13ba-df51-4852-8d99-66508dee7059")
    private static class DiagramSetObjectFactory implements ISmObjectFactory {
        @objid ("cd39ed96-94b6-4f2d-8fd9-d153642341cc")
        private DiagramSetSmClass smClass;

        @objid ("0fe2b8d0-5a47-4a26-b05c-a13ab0beb64f")
        public DiagramSetObjectFactory(DiagramSetSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("dab41e59-facd-4306-a10c-48e6c26e93c5")
        @Override
        public ISmObjectData createData() {
            return new DiagramSetData(this.smClass);
        }

        @objid ("5413e6df-05db-49aa-8fcb-1e2af33dc2bb")
        @Override
        public SmObjectImpl createImpl() {
            return new DiagramSetImpl();
        }

    }

    @objid ("805d0dd9-14d5-495d-8d1e-ca44cb7d77ad")
    public static class SubSmDependency extends SmMultipleDependency {
        @objid ("479831cc-1c3f-47ea-9b60-fa6d60995e3c")
        private SmDependency symetricDep;

        @objid ("72b613e4-06a4-46b8-b1e1-65723dc0a811")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((DiagramSetData)data).mSub != null)? ((DiagramSetData)data).mSub:SmMultipleDependency.EMPTY;
        }

        @objid ("aeea708d-2654-43ca-a4f8-d224fc3457ad")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((DiagramSetData) data).mSub = values;
        }

        @objid ("38e5a427-2b57-45e4-a9cb-a17120fd9469")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DiagramSetSmClass)this.getTarget()).getParentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4a6006a0-a05e-4271-a7c8-2fe39dd34da1")
    public static class ParentSmDependency extends SmSingleDependency {
        @objid ("39b676cc-cc8f-43b5-bdc9-41a090222ec7")
        private SmDependency symetricDep;

        @objid ("54af59af-3524-4859-9114-0ca987781de1")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((DiagramSetData) data).mParent;
        }

        @objid ("30018d62-d7bf-4965-93e7-eed3bb71e579")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((DiagramSetData) data).mParent = value;
        }

        @objid ("1f60b8aa-a209-4174-8b56-bc1efbf21fdb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DiagramSetSmClass)this.getTarget()).getSubDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("647b3b6e-2030-48a9-b255-747ab2f65066")
    public static class ReferencedDiagramSmDependency extends SmMultipleDependency {
        @objid ("a4eb3a07-8fa2-4658-8fac-5a68899a398c")
        private SmDependency symetricDep;

        @objid ("aa2899ad-9676-4ab3-8edf-0ba931718d84")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((DiagramSetData)data).mReferencedDiagram != null)? ((DiagramSetData)data).mReferencedDiagram:SmMultipleDependency.EMPTY;
        }

        @objid ("7dd6c0d9-a8c2-4906-9690-6f92bf8beaf5")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((DiagramSetData) data).mReferencedDiagram = values;
        }

        @objid ("3af0c7be-7282-487a-9191-6ed044dd5204")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AbstractDiagramSmClass)this.getTarget()).getReferencingSetDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3507c439-8c27-4ade-a51a-4aed949e16b1")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("34bed83f-684c-4057-9e5d-c3bebb2eb859")
        private SmDependency symetricDep;

        @objid ("a3bdf5e4-1e59-4480-aa5f-66717ee5c52c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((DiagramSetData) data).mOwner;
        }

        @objid ("68281a93-443a-4e3e-a74f-2c5b0d4e7d68")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((DiagramSetData) data).mOwner = value;
        }

        @objid ("db85b000-4282-4a51-a615-fcb9671a258c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ProjectSmClass)this.getTarget()).getDiagramRootDep();
            }
            return this.symetricDep;
        }

    }

}
