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
    @objid ("b47ffd93-123c-4325-9b45-80ba087fd966")
    @SmaMetaAssociation(metaName="RegionAsOutput", typeDataClass=ExpansionRegionData.class, min=0, max=1, smAssociationClass=Metadata.RegionAsOutputSmDependency.class)
     SmObjectImpl mRegionAsOutput;

    @objid ("fea7a2eb-70b5-4d3c-b096-25bbc662131f")
    @SmaMetaAssociation(metaName="RegionAsInput", typeDataClass=ExpansionRegionData.class, min=0, max=1, smAssociationClass=Metadata.RegionAsInputSmDependency.class)
     SmObjectImpl mRegionAsInput;

    @objid ("7a8eb6af-822f-4c95-8a2f-afb65aef6c37")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00374c86-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8b870c18-aebe-4930-bef9-e86feed7ca10")
        private static SmClass smClass = null;

        @objid ("8f11da2c-c01b-48d1-a85a-40a3580a42c8")
        private static SmDependency RegionAsOutputDep = null;

        @objid ("60463db2-701c-4e7d-83e4-bc01b4241d83")
        private static SmDependency RegionAsInputDep = null;

        @objid ("41600e0b-82d5-41c7-b5a4-7c35f2371e34")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExpansionNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("15e0af09-be1d-47e2-94f6-c3da4e89f356")
        public static SmDependency RegionAsOutputDep() {
            if (RegionAsOutputDep == null) {
            	RegionAsOutputDep = classof().getDependencyDef("RegionAsOutput");
            }
            return RegionAsOutputDep;
        }

        @objid ("1f080df8-71bd-4484-9db3-fcbac043111f")
        public static SmDependency RegionAsInputDep() {
            if (RegionAsInputDep == null) {
            	RegionAsInputDep = classof().getDependencyDef("RegionAsInput");
            }
            return RegionAsInputDep;
        }

        @objid ("b19a4de6-a243-42b1-8747-e45eb07de7f4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("622bcb30-e625-475e-a839-2b92a7556a20")
        public static SmDependency getRegionAsInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RegionAsInputDep;
        }

        @objid ("8222b093-3522-4dc9-9c93-a6c455b89242")
        public static SmDependency getRegionAsOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RegionAsOutputDep;
        }

        @objid ("0037998e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bee0e320-53f8-4f2a-8521-166b26cb50a8")
            public ISmObjectData createData() {
                return new ExpansionNodeData();
            }

            @objid ("02838445-ef66-442e-97d5-e1e0c2b21ca7")
            public SmObjectImpl createImpl() {
                return new ExpansionNodeImpl();
            }

        }

        @objid ("003807fc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RegionAsInputSmDependency extends SmSingleDependency {
            @objid ("a6099d4f-7233-4373-8406-48e13725b19c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExpansionNodeData) data).mRegionAsInput;
            }

            @objid ("4fd3db10-8320-4102-a67c-e57f71bcb4b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExpansionNodeData) data).mRegionAsInput = value;
            }

            @objid ("89a3d1c1-dfb1-477a-adba-365e6c933903")
            @Override
            public SmDependency getSymetric() {
                return ExpansionRegionData.Metadata.InputElementDep();
            }

        }

        @objid ("0038892a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RegionAsOutputSmDependency extends SmSingleDependency {
            @objid ("ebc642c0-2a52-45e1-a108-322a04301833")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExpansionNodeData) data).mRegionAsOutput;
            }

            @objid ("ff72bb8f-b9f8-40af-acf1-24267246c4d8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExpansionNodeData) data).mRegionAsOutput = value;
            }

            @objid ("6b9ad966-7670-476f-a22a-c55df12c07e7")
            @Override
            public SmDependency getSymetric() {
                return ExpansionRegionData.Metadata.OutputElementDep();
            }

        }

    }

}
