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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("3831905b-153c-4067-922c-a024421c0c3b")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class)
     SmObjectImpl mParent;

    @objid ("d63190a5-e0a4-4ae3-8bce-46a4bbe9d5c6")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedSmDependency.class)
     SmObjectImpl mRepresented;

    @objid ("b4073f72-9389-4ebd-8813-88a9f10a8871")
    @SmaMetaAssociation(metaName="Sub", typeDataClass=StateVertexData.class, min=0, max=-1, smAssociationClass=Metadata.SubSmDependency.class, component = true)
     List<SmObjectImpl> mSub = null;

    @objid ("b5f6b806-1e5c-4a93-bc3b-86233d777f89")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00772356-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a38afcae-6c7f-4825-9c27-56c291cc5951")
        private static SmClass smClass = null;

        @objid ("1d2cae5b-2d06-4869-91be-70065f96bd7b")
        private static SmDependency ParentDep = null;

        @objid ("5bd3b5d9-7d77-4352-a284-91559a805bca")
        private static SmDependency RepresentedDep = null;

        @objid ("b7d18e26-2b15-4490-ba59-6efc4efa64d3")
        private static SmDependency SubDep = null;

        @objid ("9486a96e-42a5-44b8-8c25-508af6337710")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("36968804-0e40-4323-b8e8-6d63c1aece70")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("f4213450-5b66-4f4d-88fe-041c88b67a11")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("e8923e46-cdb9-4152-b653-426c8e8b52b8")
        public static SmDependency SubDep() {
            if (SubDep == null) {
            	SubDep = classof().getDependencyDef("Sub");
            }
            return SubDep;
        }

        @objid ("bb2799ae-f7bb-4b51-906a-b1538a711569")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("78a91df2-23e8-415c-b1fa-570a5307cfce")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("a2e8a1b1-d955-4b1a-8247-2c960362cfca")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("698c7e57-c5e5-4331-9821-d65a8efb9cf4")
        public static SmDependency getSubDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubDep;
        }

        @objid ("00776604-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("98af200c-3476-41d6-a332-cae23b922a28")
            public ISmObjectData createData() {
                return new RegionData();
            }

            @objid ("04f0485d-71f9-4dea-921c-b27e1f24d16e")
            public SmObjectImpl createImpl() {
                return new RegionImpl();
            }

        }

        @objid ("0077ca40-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmSingleDependency {
            @objid ("2e13cbcf-aedf-4945-b023-360c3650838e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RegionData) data).mRepresented;
            }

            @objid ("870c43d7-a25f-4066-87fd-7d0087a51567")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RegionData) data).mRepresented = value;
            }

            @objid ("f0dfcaac-2d28-4174-9a53-4d562e007062")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.TopDep();
            }

        }

        @objid ("00783fc0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("381307bb-5617-4997-9052-6c934738b318")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RegionData) data).mParent;
            }

            @objid ("b437acf0-3594-4c1a-b1c2-2d7f064dd7b7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RegionData) data).mParent = value;
            }

            @objid ("b62d2566-325b-4cda-9976-ed7be81e145e")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.OwnedRegionDep();
            }

        }

        @objid ("0078b4fa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubSmDependency extends SmMultipleDependency {
            @objid ("a6ad014b-ea1b-4833-8713-cce4d04142e8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RegionData)data).mSub != null)? ((RegionData)data).mSub:SmMultipleDependency.EMPTY;
            }

            @objid ("dbb5d82c-4c98-4a75-ae8b-4f57190e9090")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RegionData) data).mSub = new ArrayList<>(initialCapacity);
                return ((RegionData) data).mSub;
            }

            @objid ("e6eeb026-065f-4e38-ab2c-3f247ace8bcd")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.ParentDep();
            }

        }

    }

}
