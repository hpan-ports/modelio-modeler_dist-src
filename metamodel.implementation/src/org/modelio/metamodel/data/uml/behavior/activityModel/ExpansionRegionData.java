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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ExpansionNodeData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExpansionRegionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
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

@objid ("00322346-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExpansionRegion.class, factory=ExpansionRegionData.Metadata.ObjectFactory.class)
public class ExpansionRegionData extends StructuredActivityNodeData {
    @objid ("4585581c-5def-4ed6-b9db-da4fe8169f73")
    @SmaMetaAttribute(metaName="Mode", type=ExpansionKind.class, smAttributeClass=Metadata.ModeSmAttribute.class)
     Object mMode = ExpansionKind.ITERATIVE;

    @objid ("fb6ed034-c1e9-4a41-a9ec-ab061720001a")
    @SmaMetaAssociation(metaName="OutputElement", typeDataClass=ExpansionNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OutputElementSmDependency.class, component = true, partof = true)
     List<SmObjectImpl> mOutputElement = null;

    @objid ("d6c66609-bc0e-4bb2-a0ae-152b3379f9be")
    @SmaMetaAssociation(metaName="InputElement", typeDataClass=ExpansionNodeData.class, min=1, max=-1, smAssociationClass=Metadata.InputElementSmDependency.class, component = true, partof = true)
     List<SmObjectImpl> mInputElement = null;

    @objid ("555d846a-970d-4562-9e42-caa09b0fc1fb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008dd3da-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("44b2d0ca-c248-4c9f-baaf-be88b0f44958")
        private static SmClass smClass = null;

        @objid ("4dd0f2b1-e0df-4773-a9d8-1021b198c5c2")
        private static SmAttribute ModeAtt = null;

        @objid ("1eb2204f-e14e-4f57-94d2-ddd810733fb7")
        private static SmDependency OutputElementDep = null;

        @objid ("2431bb26-e4f9-4e50-b09b-d6cddbb7a79b")
        private static SmDependency InputElementDep = null;

        @objid ("33b16b5a-7595-4859-acd2-d69abc6138ab")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExpansionRegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3ed75672-9bd5-409f-bd8f-fc9b6edf8f36")
        public static SmAttribute ModeAtt() {
            if (ModeAtt == null) {
            	ModeAtt = classof().getAttributeDef("Mode");
            }
            return ModeAtt;
        }

        @objid ("494db3b6-aadc-41da-9636-d6d7b85bbeb1")
        public static SmDependency OutputElementDep() {
            if (OutputElementDep == null) {
            	OutputElementDep = classof().getDependencyDef("OutputElement");
            }
            return OutputElementDep;
        }

        @objid ("fc9d2a15-f1ee-4f82-8abe-963ac971f49f")
        public static SmDependency InputElementDep() {
            if (InputElementDep == null) {
            	InputElementDep = classof().getDependencyDef("InputElement");
            }
            return InputElementDep;
        }

        @objid ("4be8f77c-2cd0-4e50-ab94-46ce98ab01b6")
        public static SmDependency getInputElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputElementDep;
        }

        @objid ("b96519c3-dd7c-4b5c-a217-d1fa774a6361")
        public static SmAttribute getModeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModeAtt;
        }

        @objid ("d8d1b55c-ef4b-43b5-a013-a2d0707a0c67")
        public static SmDependency getOutputElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputElementDep;
        }

        @objid ("be1f8abd-11f1-42ff-bdb2-f7033908437b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008e2a2e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79fca017-f3b7-4e74-9fba-0e03b6e33ced")
            public ISmObjectData createData() {
                return new ExpansionRegionData();
            }

            @objid ("7cfaf578-7328-43f7-8821-b96773d0af60")
            public SmObjectImpl createImpl() {
                return new ExpansionRegionImpl();
            }

        }

        @objid ("008e9842-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModeSmAttribute extends SmAttribute {
            @objid ("9a7805fe-b5bc-46a3-8121-abba8d21042e")
            public Object getValue(ISmObjectData data) {
                return ((ExpansionRegionData) data).mMode;
            }

            @objid ("9b38c99f-83e0-431e-ac23-6c21701648a3")
            public void setValue(ISmObjectData data, Object value) {
                ((ExpansionRegionData) data).mMode = value;
            }

        }

        @objid ("008ff340-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InputElementSmDependency extends SmMultipleDependency {
            @objid ("1e8f45a2-fff4-47ad-a538-c58444c3b217")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExpansionRegionData)data).mInputElement != null)? ((ExpansionRegionData)data).mInputElement:SmMultipleDependency.EMPTY;
            }

            @objid ("6a76d851-049e-4d31-b05b-141267b0cc95")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExpansionRegionData) data).mInputElement = new ArrayList<>(initialCapacity);
                return ((ExpansionRegionData) data).mInputElement;
            }

            @objid ("d00a0e5e-84bd-43e6-811a-ddf5abe61751")
            @Override
            public SmDependency getSymetric() {
                return ExpansionNodeData.Metadata.RegionAsInputDep();
            }

        }

        @objid ("00907252-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutputElementSmDependency extends SmMultipleDependency {
            @objid ("dcc92e9a-6166-49d5-8720-d52029bc1e79")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExpansionRegionData)data).mOutputElement != null)? ((ExpansionRegionData)data).mOutputElement:SmMultipleDependency.EMPTY;
            }

            @objid ("131bd1bc-35c7-44cb-8d80-40e3eac74b46")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExpansionRegionData) data).mOutputElement = new ArrayList<>(initialCapacity);
                return ((ExpansionRegionData) data).mOutputElement;
            }

            @objid ("9aa35515-62a1-4072-8be2-a56d23f8baee")
            @Override
            public SmDependency getSymetric() {
                return ExpansionNodeData.Metadata.RegionAsOutputDep();
            }

        }

    }

}
