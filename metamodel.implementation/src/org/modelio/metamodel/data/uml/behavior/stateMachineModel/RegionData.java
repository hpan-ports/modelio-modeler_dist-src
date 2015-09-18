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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateMachineData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateVertexData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.RegionImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("005749aa-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Region.class, factory=RegionData.Metadata.ObjectFactory.class)
public class RegionData extends ModelElementData {
    @objid ("4bd62494-4af8-4edd-bbb3-708a70c6efca")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("391b46f2-ec02-4347-bd99-b2b4655de061")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class)
     SmObjectImpl mRepresented;

    @objid ("4321d6c1-2215-44c5-81a3-9600d0d0e3de")
    @SmaMetaAssociation(metaName="Sub", typeDataClass=StateVertexData.class, min=0, max=-1, smAssociationClass=Metadata.SubSmDependency.class, component = true)
     List<SmObjectImpl> mSub = null;

    @objid ("ac12daa7-84d8-4f53-9247-ba07ba5f016b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00772356-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1b88e310-2b78-4eda-a57d-812f10573020")
        private static SmClass smClass = null;

        @objid ("627927db-c9fd-417b-9fcb-6f31224e770a")
        private static SmDependency ParentDep = null;

        @objid ("5e6597b7-7ed0-4ce3-b9c3-23102f5e0824")
        private static SmDependency RepresentedDep = null;

        @objid ("7bf10e09-4168-458a-b0f6-31303d318559")
        private static SmDependency SubDep = null;

        @objid ("a6b6066c-0dbe-44fc-843d-8e826b19f475")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5b05de2c-1079-44f3-ba06-d0d0245c53cb")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("6905e4db-d2da-4f76-bcac-2dd4b2df20e4")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("be9dd51e-a465-43d8-9c13-e6bda5a5dd8a")
        public static SmDependency SubDep() {
            if (SubDep == null) {
            	SubDep = classof().getDependencyDef("Sub");
            }
            return SubDep;
        }

        @objid ("582193db-f1f1-411a-85d1-34531bb26bbf")
        public static SmDependency getSubDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubDep;
        }

        @objid ("72819353-5df2-4dd7-b706-21751b27bb11")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("fb2a14da-10b4-4f84-828e-35d21f9cfa21")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("b5fba6d3-c448-4a53-aa36-59261ba5353a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00776604-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("eefbc949-9e5a-468c-95fa-1d764755afae")
            public ISmObjectData createData() {
                return new RegionData();
            }

            @objid ("534becbb-52be-44af-875c-2204b6f6ea55")
            public SmObjectImpl createImpl() {
                return new RegionImpl();
            }

        }

        @objid ("0077ca40-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("73a1e01e-12a4-4ad4-af4e-e2a530404e9d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RegionData) data).mRepresented;
            }

            @objid ("1c6f0889-691e-42e0-b1b6-c92997211ab2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RegionData) data).mRepresented = value;
            }

            @objid ("bfd33149-8f1a-4ddd-8a6c-0aca27d0a4d7")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.TopDep();
            }

        }

        @objid ("00783fc0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("3fe2ed7c-8920-41c8-a0f7-1e04ffeab987")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RegionData) data).mParent;
            }

            @objid ("b8c898e7-5748-425c-b067-cab6ae908769")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RegionData) data).mParent = value;
            }

            @objid ("2d81353f-691c-483b-8d5a-88af476be793")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.OwnedRegionDep();
            }

        }

        @objid ("0078b4fa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubSmDependency extends SmMultipleDependency {
            @objid ("39a869bb-a64a-4480-9c1b-6fbbea69b3b2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RegionData)data).mSub != null)? ((RegionData)data).mSub:SmMultipleDependency.EMPTY;
            }

            @objid ("f450f279-2596-4059-a6d1-23b6798320ee")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RegionData) data).mSub = new ArrayList<>(initialCapacity);
                return ((RegionData) data).mSub;
            }

            @objid ("f1f9e01f-77db-4d30-b239-722dc494d151")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.ParentDep();
            }

        }

    }

}
