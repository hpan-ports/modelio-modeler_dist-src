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
    @objid ("cc9ff304-4040-48aa-916e-928c9b67a532")
    @SmaMetaAttribute(metaName="Mode", type=ExpansionKind.class, smAttributeClass=Metadata.ModeSmAttribute.class)
     Object mMode = ExpansionKind.ITERATIVE;

    @objid ("fa610c3d-ce17-42e3-8f16-6edb7b690ef6")
    @SmaMetaAssociation(metaName="OutputElement", typeDataClass=ExpansionNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OutputElementSmDependency.class, component = true, partof = true)
     List<SmObjectImpl> mOutputElement = null;

    @objid ("f9cf5b88-89e8-409b-a315-7a7e562acae7")
    @SmaMetaAssociation(metaName="InputElement", typeDataClass=ExpansionNodeData.class, min=1, max=-1, smAssociationClass=Metadata.InputElementSmDependency.class, component = true, partof = true)
     List<SmObjectImpl> mInputElement = null;

    @objid ("bf8bf0eb-eda5-41d1-a966-916f60e066ae")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008dd3da-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a9155dcf-5058-43f9-b0cc-b7beade53bdc")
        private static SmClass smClass = null;

        @objid ("7ee2d5a7-ef91-47b8-9410-9c6f7e578415")
        private static SmAttribute ModeAtt = null;

        @objid ("cc300ab2-be8a-47d8-9636-16aa90a68ed5")
        private static SmDependency OutputElementDep = null;

        @objid ("ec8e7d45-9a15-485c-bbb4-d1e2c385c359")
        private static SmDependency InputElementDep = null;

        @objid ("3f829370-822c-44c2-be27-6c520e137e54")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExpansionRegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0e96bbb2-d1f0-4ade-92c6-a04fbd38dd0c")
        public static SmAttribute ModeAtt() {
            if (ModeAtt == null) {
            	ModeAtt = classof().getAttributeDef("Mode");
            }
            return ModeAtt;
        }

        @objid ("01f38fbf-cc32-4828-8a30-05e1380c9edb")
        public static SmDependency OutputElementDep() {
            if (OutputElementDep == null) {
            	OutputElementDep = classof().getDependencyDef("OutputElement");
            }
            return OutputElementDep;
        }

        @objid ("77ff3e03-5dda-44d3-be8c-a394a638cbc4")
        public static SmDependency InputElementDep() {
            if (InputElementDep == null) {
            	InputElementDep = classof().getDependencyDef("InputElement");
            }
            return InputElementDep;
        }

        @objid ("cfc07761-6ea6-447d-8151-a3253effe15d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b049d6d1-c233-43c7-acd8-b15db762818b")
        public static SmDependency getInputElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputElementDep;
        }

        @objid ("7639befb-3917-4971-8de6-cffbdf4d8f45")
        public static SmAttribute getModeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModeAtt;
        }

        @objid ("414faab7-8520-4933-8094-adec4be7ac21")
        public static SmDependency getOutputElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputElementDep;
        }

        @objid ("008e2a2e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("34810ed7-cc1b-4473-8687-7376e22981e5")
            public ISmObjectData createData() {
                return new ExpansionRegionData();
            }

            @objid ("bb4b7eb1-1191-45fc-8698-1d104defbe84")
            public SmObjectImpl createImpl() {
                return new ExpansionRegionImpl();
            }

        }

        @objid ("008e9842-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModeSmAttribute extends SmAttribute {
            @objid ("a9521202-9cb9-440e-918b-8f3f4b54fa47")
            public Object getValue(ISmObjectData data) {
                return ((ExpansionRegionData) data).mMode;
            }

            @objid ("7000cf39-2338-4e5a-9670-c8bb60d48f25")
            public void setValue(ISmObjectData data, Object value) {
                ((ExpansionRegionData) data).mMode = value;
            }

        }

        @objid ("008ff340-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InputElementSmDependency extends SmMultipleDependency {
            @objid ("b12ca069-0fd9-4db8-93f2-42a2a139de57")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExpansionRegionData)data).mInputElement != null)? ((ExpansionRegionData)data).mInputElement:SmMultipleDependency.EMPTY;
            }

            @objid ("94af7047-1a4c-4b7b-807d-656936e7cad8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExpansionRegionData) data).mInputElement = new ArrayList<>(initialCapacity);
                return ((ExpansionRegionData) data).mInputElement;
            }

            @objid ("9bc6dcb9-84dc-4454-a44e-9f1f8248a530")
            @Override
            public SmDependency getSymetric() {
                return ExpansionNodeData.Metadata.RegionAsInputDep();
            }

        }

        @objid ("00907252-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutputElementSmDependency extends SmMultipleDependency {
            @objid ("543ce33c-a0ea-4e28-a312-1d0b2ff6c9b4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExpansionRegionData)data).mOutputElement != null)? ((ExpansionRegionData)data).mOutputElement:SmMultipleDependency.EMPTY;
            }

            @objid ("40da1a2f-5565-474e-88bb-73eb4673e28c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExpansionRegionData) data).mOutputElement = new ArrayList<>(initialCapacity);
                return ((ExpansionRegionData) data).mOutputElement;
            }

            @objid ("de44a705-96b4-4cf3-9430-1b6109cca3a7")
            @Override
            public SmDependency getSymetric() {
                return ExpansionNodeData.Metadata.RegionAsOutputDep();
            }

        }

    }

}
