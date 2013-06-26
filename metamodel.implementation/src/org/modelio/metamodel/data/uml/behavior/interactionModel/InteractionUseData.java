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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GateData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionUseImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
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

@objid ("0048846a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InteractionUse.class, factory=InteractionUseData.Metadata.ObjectFactory.class)
public class InteractionUseData extends InteractionFragmentData {
    @objid ("b3834586-de0e-40c3-803d-ff1ebb10af52")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("7bf0c9ee-bb34-40d9-9b76-ad2a4e8da0b2")
    @SmaMetaAssociation(metaName="ActualGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.ActualGateSmDependency.class, component = true)
     List<SmObjectImpl> mActualGate = null;

    @objid ("1705d292-411a-4e0c-8b17-72c238b5e46d")
    @SmaMetaAssociation(metaName="RefersTo", typeDataClass=InteractionData.class, min=1, max=1, smAssociationClass=Metadata.RefersToSmDependency.class, partof = true)
     SmObjectImpl mRefersTo;

    @objid ("571d0db4-23f6-422a-9a00-27cca31a0de4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0075f526-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a45b1394-7ffc-43a5-a754-e3ad9c22fc5c")
        private static SmClass smClass = null;

        @objid ("f2f24e6b-3507-4465-84b0-94a2f6ae239c")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("ce83b173-55c2-4fa5-aae8-af0182486f5d")
        private static SmDependency ActualGateDep = null;

        @objid ("954e5624-dc4e-450b-97be-3a75e0d6e38a")
        private static SmDependency RefersToDep = null;

        @objid ("115214c2-3f4d-4bdd-9960-d667408986e3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d3842355-7b6c-4e7b-9124-d66ed0419394")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("0492c02c-fd2e-4eb2-b6ed-ddf90e4b0ad2")
        public static SmDependency ActualGateDep() {
            if (ActualGateDep == null) {
            	ActualGateDep = classof().getDependencyDef("ActualGate");
            }
            return ActualGateDep;
        }

        @objid ("bf94d10a-96fa-44a1-8001-e8080aafb036")
        public static SmDependency RefersToDep() {
            if (RefersToDep == null) {
            	RefersToDep = classof().getDependencyDef("RefersTo");
            }
            return RefersToDep;
        }

        @objid ("2c091ee8-f1a5-4770-8a0c-91838f433ecb")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("e3484957-b2a3-40f1-a1ed-cd5e0f406eee")
        public static SmDependency getActualGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualGateDep;
        }

        @objid ("c86af8dd-bf51-410c-8b54-da366b649533")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4afc773a-25be-4f00-98c0-3d13c15c3a48")
        public static SmDependency getRefersToDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RefersToDep;
        }

        @objid ("00763720-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("446a4d00-7092-4204-8241-ea2e565a7e59")
            public ISmObjectData createData() {
                return new InteractionUseData();
            }

            @objid ("694d51e5-7495-4770-bb64-e2ea321cad2b")
            public SmObjectImpl createImpl() {
                return new InteractionUseImpl();
            }

        }

        @objid ("007699c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("7316a593-d32f-4d14-a13a-dbbe5b2069f3")
            public Object getValue(ISmObjectData data) {
                return ((InteractionUseData) data).mEndLineNumber;
            }

            @objid ("44e420a8-b556-4b8f-8ee2-993616ab6d06")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionUseData) data).mEndLineNumber = value;
            }

        }

        @objid ("0076fce6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RefersToSmDependency extends SmSingleDependency {
            @objid ("bcbeb65a-b1b9-4019-8b6a-4c2fc7bebb2e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionUseData) data).mRefersTo;
            }

            @objid ("bdc73239-288e-4ee3-b9fe-a02f8d3f2bd7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionUseData) data).mRefersTo = value;
            }

            @objid ("eeba8356-f912-437a-90a9-c10a56cdf7f9")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.ReferedUseDep();
            }

        }

        @objid ("007773ce-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActualGateSmDependency extends SmMultipleDependency {
            @objid ("6bae8e7f-147f-4060-9801-49c36d4d7cb5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionUseData)data).mActualGate != null)? ((InteractionUseData)data).mActualGate:SmMultipleDependency.EMPTY;
            }

            @objid ("eb4712a0-b2ff-4309-89db-cc00567fbf72")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionUseData) data).mActualGate = new ArrayList<>(initialCapacity);
                return ((InteractionUseData) data).mActualGate;
            }

            @objid ("8f5f4ca6-6250-443d-ace7-c12b16e71c91")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerUseDep();
            }

        }

    }

}
