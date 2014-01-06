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
/*   Metamodel version: 9019              */
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
    @objid ("9092b14f-1454-4753-abf2-76f764dda14d")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("21a04b05-2368-43fa-ac4b-c24deef21766")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class)
     SmObjectImpl mRepresented;

    @objid ("6f53d398-1a48-4bd7-9855-02ecb7c98818")
    @SmaMetaAssociation(metaName="Sub", typeDataClass=StateVertexData.class, min=0, max=-1, smAssociationClass=Metadata.SubSmDependency.class, component = true)
     List<SmObjectImpl> mSub = null;

    @objid ("b4b9d548-e0de-4f1b-8d2e-bdaec85945a6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00772356-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a513c798-1b3b-4ccd-b9f7-9bf1f39cf6a3")
        private static SmClass smClass = null;

        @objid ("2f0d91cf-3838-4f4b-837f-1767ea494068")
        private static SmDependency ParentDep = null;

        @objid ("70ef86a4-787f-44d5-89f4-83c823221e83")
        private static SmDependency RepresentedDep = null;

        @objid ("6542b4f6-a588-48b7-bc8b-2f7b52b3093e")
        private static SmDependency SubDep = null;

        @objid ("c83e5345-f7de-48b3-85f3-fc0c2e08e216")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("565709b1-cdbe-40f3-a31b-a2b2e5bb3e95")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("d9f63418-95cb-4485-bdca-9d07a6e8b300")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("bc2cc866-90de-4989-a7c9-a0b7568ad40e")
        public static SmDependency SubDep() {
            if (SubDep == null) {
            	SubDep = classof().getDependencyDef("Sub");
            }
            return SubDep;
        }

        @objid ("26c8cc55-b43c-4c70-9a1c-997f49319177")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("70f744b9-4607-4fb6-a714-4c901d12502f")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("358b0f85-c9a3-495c-a16f-6324a6f0edaf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e9855911-0d26-4b9f-bd32-3c2cbbfc69f4")
        public static SmDependency getSubDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubDep;
        }

        @objid ("00776604-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("33435aa7-31c5-442f-9933-24844efb69b9")
            public ISmObjectData createData() {
                return new RegionData();
            }

            @objid ("592d66b2-55a4-4497-943c-434cd1527306")
            public SmObjectImpl createImpl() {
                return new RegionImpl();
            }

        }

        @objid ("0077ca40-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("895cb3cf-0332-497d-ba6a-b76de3e83690")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RegionData) data).mRepresented;
            }

            @objid ("1e961688-1bbe-456b-be88-4db5de7e0917")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RegionData) data).mRepresented = value;
            }

            @objid ("182229da-9a42-43da-8ffa-d5cf01c7f966")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.TopDep();
            }

        }

        @objid ("00783fc0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("11f642d8-d7b8-477c-a2fb-29406b0bfeb3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RegionData) data).mParent;
            }

            @objid ("8422b26d-7b24-4612-829a-0808cbb144ac")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RegionData) data).mParent = value;
            }

            @objid ("c0de272e-1e36-4036-ad98-b408c5637eca")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.OwnedRegionDep();
            }

        }

        @objid ("0078b4fa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubSmDependency extends SmMultipleDependency {
            @objid ("84d8e5cf-ede0-41d9-b931-bce607bab36f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RegionData)data).mSub != null)? ((RegionData)data).mSub:SmMultipleDependency.EMPTY;
            }

            @objid ("83ce090a-ace1-4961-957c-bcecf0572382")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RegionData) data).mSub = new ArrayList<>(initialCapacity);
                return ((RegionData) data).mSub;
            }

            @objid ("c698202b-3f41-43ec-bce3-7771d78e226a")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.ParentDep();
            }

        }

    }

}
