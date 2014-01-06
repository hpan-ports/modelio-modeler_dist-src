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
    @objid ("ada39d99-ba75-4ca3-86e8-f697db540c28")
    @SmaMetaAssociation(metaName="RegionAsOutput", typeDataClass=ExpansionRegionData.class, min=0, max=1, smAssociationClass=Metadata.RegionAsOutputSmDependency.class)
     SmObjectImpl mRegionAsOutput;

    @objid ("17d79872-ba65-4190-8a34-b1425f3e04af")
    @SmaMetaAssociation(metaName="RegionAsInput", typeDataClass=ExpansionRegionData.class, min=0, max=1, smAssociationClass=Metadata.RegionAsInputSmDependency.class)
     SmObjectImpl mRegionAsInput;

    @objid ("48a79880-beb0-42c0-a406-cab87a391508")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00374c86-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("31954bdf-0dcf-4e92-bdb5-685fc951c896")
        private static SmClass smClass = null;

        @objid ("a9057694-da61-4653-9df7-4840b6e6509e")
        private static SmDependency RegionAsOutputDep = null;

        @objid ("2fd6a108-a3b4-4327-a362-b6489a12126e")
        private static SmDependency RegionAsInputDep = null;

        @objid ("4354a320-cda3-4acb-9872-f2d6762bbfee")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExpansionNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4fef06c8-d0d9-41c2-b4c9-140d7199aa91")
        public static SmDependency RegionAsOutputDep() {
            if (RegionAsOutputDep == null) {
            	RegionAsOutputDep = classof().getDependencyDef("RegionAsOutput");
            }
            return RegionAsOutputDep;
        }

        @objid ("b88b7619-21bf-4e06-9d1e-09380a8ba87a")
        public static SmDependency RegionAsInputDep() {
            if (RegionAsInputDep == null) {
            	RegionAsInputDep = classof().getDependencyDef("RegionAsInput");
            }
            return RegionAsInputDep;
        }

        @objid ("6529eb39-a3dd-49c2-8426-997755ce4af2")
        public static SmDependency getRegionAsOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RegionAsOutputDep;
        }

        @objid ("65daf233-3a3f-4ab3-bf07-5bec51673462")
        public static SmDependency getRegionAsInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RegionAsInputDep;
        }

        @objid ("3ba003b4-fc93-4098-9e52-2c3ffe1e0026")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0037998e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d72f6f4a-4008-42a0-a0be-b34810446835")
            public ISmObjectData createData() {
                return new ExpansionNodeData();
            }

            @objid ("5dd7fb41-809f-4d68-a039-496aa82c74be")
            public SmObjectImpl createImpl() {
                return new ExpansionNodeImpl();
            }

        }

        @objid ("003807fc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RegionAsInputSmDependency extends SmSingleDependency {
            @objid ("692dfde3-33ed-42cd-84f9-658a83e9cfa5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExpansionNodeData) data).mRegionAsInput;
            }

            @objid ("5082a541-b312-420f-ac46-8d1b229a294a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExpansionNodeData) data).mRegionAsInput = value;
            }

            @objid ("2e0e49a8-fc63-4660-abac-6389a1f9267c")
            @Override
            public SmDependency getSymetric() {
                return ExpansionRegionData.Metadata.InputElementDep();
            }

        }

        @objid ("0038892a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RegionAsOutputSmDependency extends SmSingleDependency {
            @objid ("ff75e152-8d85-44eb-be78-68869b569e73")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExpansionNodeData) data).mRegionAsOutput;
            }

            @objid ("57af5b07-bc7e-4bbe-bca5-686a841600fa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExpansionNodeData) data).mRegionAsOutput = value;
            }

            @objid ("c6b5cb92-2057-49ed-88e5-cc0353bb98ea")
            @Override
            public SmDependency getSymetric() {
                return ExpansionRegionData.Metadata.OutputElementDep();
            }

        }

    }

}
