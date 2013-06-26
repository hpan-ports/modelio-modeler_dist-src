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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ExpansionRegionData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExpansionNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
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

@objid ("00318170-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExpansionNode.class, factory=ExpansionNodeData.Metadata.ObjectFactory.class)
public class ExpansionNodeData extends ObjectNodeData {
    @objid ("51eb7df7-9918-4b4b-8ff2-33151f19d039")
    @SmaMetaAssociation(metaName="RegionAsOutput", typeDataClass=ExpansionRegionData.class, min=0, max=1, smAssociationClass=Metadata.RegionAsOutputSmDependency.class)
     SmObjectImpl mRegionAsOutput;

    @objid ("8e9b834c-f21a-4388-a018-626fee867ec9")
    @SmaMetaAssociation(metaName="RegionAsInput", typeDataClass=ExpansionRegionData.class, min=0, max=1, smAssociationClass=Metadata.RegionAsInputSmDependency.class)
     SmObjectImpl mRegionAsInput;

    @objid ("6a88714a-c8fa-4467-9e18-7cb8edad782a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00374c86-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("469a5d1f-9b73-44ee-a27d-8e47f769d3f7")
        private static SmClass smClass = null;

        @objid ("f1896708-f6bc-4f3c-8efc-9aab20ab262b")
        private static SmDependency RegionAsOutputDep = null;

        @objid ("8491e472-cdd7-4723-ba05-4b9a17c77b23")
        private static SmDependency RegionAsInputDep = null;

        @objid ("8d02f196-edc1-4e50-bc47-8c05ebf67a8a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExpansionNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0520444f-5ee8-4d88-9758-668eb8329b5a")
        public static SmDependency RegionAsOutputDep() {
            if (RegionAsOutputDep == null) {
            	RegionAsOutputDep = classof().getDependencyDef("RegionAsOutput");
            }
            return RegionAsOutputDep;
        }

        @objid ("fce62b31-0e97-40eb-b987-74c5edc8d634")
        public static SmDependency RegionAsInputDep() {
            if (RegionAsInputDep == null) {
            	RegionAsInputDep = classof().getDependencyDef("RegionAsInput");
            }
            return RegionAsInputDep;
        }

        @objid ("fed5c953-b948-40be-abcb-1eb2a140b08b")
        public static SmDependency getRegionAsInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RegionAsInputDep;
        }

        @objid ("e3032e20-cb02-42ed-b144-fa168bbef4cc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4e282f47-2214-4082-961d-247f65f2b439")
        public static SmDependency getRegionAsOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RegionAsOutputDep;
        }

        @objid ("0037998e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b341d75d-c716-4899-a686-270fc49714dc")
            public ISmObjectData createData() {
                return new ExpansionNodeData();
            }

            @objid ("2428304a-7ab3-4457-9bbe-a32fad4d2d56")
            public SmObjectImpl createImpl() {
                return new ExpansionNodeImpl();
            }

        }

        @objid ("003807fc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RegionAsInputSmDependency extends SmSingleDependency {
            @objid ("2c7afc83-c020-4579-aaa2-d5c112623fcf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExpansionNodeData) data).mRegionAsInput;
            }

            @objid ("2e0e9950-a05a-4461-bc03-2a3cdb9d8ddd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExpansionNodeData) data).mRegionAsInput = value;
            }

            @objid ("b1222974-9b39-4015-9c3a-5c56f3b0ed5b")
            @Override
            public SmDependency getSymetric() {
                return ExpansionRegionData.Metadata.InputElementDep();
            }

        }

        @objid ("0038892a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RegionAsOutputSmDependency extends SmSingleDependency {
            @objid ("08175ede-a1ca-451a-9210-afc9e1c880a9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExpansionNodeData) data).mRegionAsOutput;
            }

            @objid ("36859b20-f652-4ef3-8c2d-7a8f6edc5f7c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExpansionNodeData) data).mRegionAsOutput = value;
            }

            @objid ("cce1e867-0ea7-4e7c-ac0f-3e17df893556")
            @Override
            public SmDependency getSymetric() {
                return ExpansionRegionData.Metadata.OutputElementDep();
            }

        }

    }

}
