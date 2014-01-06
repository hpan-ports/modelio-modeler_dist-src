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
    @objid ("365113e4-8b78-4240-9786-f67c5109ef49")
    @SmaMetaAttribute(metaName="Mode", type=ExpansionKind.class, smAttributeClass=Metadata.ModeSmAttribute.class)
     Object mMode = ExpansionKind.ITERATIVE;

    @objid ("38eb180c-c4fe-49ca-bc72-13d6d816389e")
    @SmaMetaAssociation(metaName="OutputElement", typeDataClass=ExpansionNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OutputElementSmDependency.class, component = true, partof = true)
     List<SmObjectImpl> mOutputElement = null;

    @objid ("919b7634-f28e-4d72-878f-e6f121bd935f")
    @SmaMetaAssociation(metaName="InputElement", typeDataClass=ExpansionNodeData.class, min=1, max=-1, smAssociationClass=Metadata.InputElementSmDependency.class, component = true, partof = true)
     List<SmObjectImpl> mInputElement = null;

    @objid ("8b836b26-a388-4f08-a322-d05d9ccb2444")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008dd3da-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f814d43d-4636-4bd2-a982-afee4e543343")
        private static SmClass smClass = null;

        @objid ("f3b02785-9e2b-465b-9baf-4d2112e87506")
        private static SmAttribute ModeAtt = null;

        @objid ("ee3afe22-19fc-4af9-99af-7dc0bd67064f")
        private static SmDependency OutputElementDep = null;

        @objid ("8bccacf4-77ac-42f1-84e5-0073d2da2b8f")
        private static SmDependency InputElementDep = null;

        @objid ("e878d11d-d2e9-4e47-a0ea-744c8fffd4f3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExpansionRegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4e0dd9d0-9cfd-4b2d-8648-34c4ff5d65e1")
        public static SmAttribute ModeAtt() {
            if (ModeAtt == null) {
            	ModeAtt = classof().getAttributeDef("Mode");
            }
            return ModeAtt;
        }

        @objid ("076f7c60-6632-483c-9ecf-5cf5814c4773")
        public static SmDependency OutputElementDep() {
            if (OutputElementDep == null) {
            	OutputElementDep = classof().getDependencyDef("OutputElement");
            }
            return OutputElementDep;
        }

        @objid ("e0775197-7407-4527-9a9c-40fff55bad9b")
        public static SmDependency InputElementDep() {
            if (InputElementDep == null) {
            	InputElementDep = classof().getDependencyDef("InputElement");
            }
            return InputElementDep;
        }

        @objid ("9662b1b6-6cd2-49e2-9d25-919d318a4f1f")
        public static SmDependency getInputElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputElementDep;
        }

        @objid ("a7295526-2457-4025-b123-54330150cd4f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("eb2a0ff1-78c9-4321-8332-7c329428bd7d")
        public static SmAttribute getModeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModeAtt;
        }

        @objid ("1676f918-3895-4e28-b346-c1bd95c20b13")
        public static SmDependency getOutputElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputElementDep;
        }

        @objid ("008e2a2e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4e2b4d6e-349d-4c80-8311-2f3cbbd13e1e")
            public ISmObjectData createData() {
                return new ExpansionRegionData();
            }

            @objid ("d72984e6-ddff-4d01-aeed-cea8eb0a2efb")
            public SmObjectImpl createImpl() {
                return new ExpansionRegionImpl();
            }

        }

        @objid ("008e9842-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModeSmAttribute extends SmAttribute {
            @objid ("541a276b-946d-44a0-9ea7-7bf0d1a50871")
            public Object getValue(ISmObjectData data) {
                return ((ExpansionRegionData) data).mMode;
            }

            @objid ("27d9bce9-711d-49f3-94b2-3524cc0f9f17")
            public void setValue(ISmObjectData data, Object value) {
                ((ExpansionRegionData) data).mMode = value;
            }

        }

        @objid ("008ff340-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InputElementSmDependency extends SmMultipleDependency {
            @objid ("ad45f755-6ccc-4213-9956-2f40941b5b81")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExpansionRegionData)data).mInputElement != null)? ((ExpansionRegionData)data).mInputElement:SmMultipleDependency.EMPTY;
            }

            @objid ("5b3e71cc-196c-4f3b-8e18-1a9bbef06717")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExpansionRegionData) data).mInputElement = new ArrayList<>(initialCapacity);
                return ((ExpansionRegionData) data).mInputElement;
            }

            @objid ("c244cf5c-aebc-42c6-9ad1-207b2c1c5903")
            @Override
            public SmDependency getSymetric() {
                return ExpansionNodeData.Metadata.RegionAsInputDep();
            }

        }

        @objid ("00907252-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutputElementSmDependency extends SmMultipleDependency {
            @objid ("e084766a-b3a6-4c9b-bd5b-aab70e899fd9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExpansionRegionData)data).mOutputElement != null)? ((ExpansionRegionData)data).mOutputElement:SmMultipleDependency.EMPTY;
            }

            @objid ("e08081fe-2124-4b0b-8175-543f125fd304")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExpansionRegionData) data).mOutputElement = new ArrayList<>(initialCapacity);
                return ((ExpansionRegionData) data).mOutputElement;
            }

            @objid ("981584f0-c2c1-4395-bcaa-23107ae58b45")
            @Override
            public SmDependency getSymetric() {
                return ExpansionNodeData.Metadata.RegionAsOutputDep();
            }

        }

    }

}
