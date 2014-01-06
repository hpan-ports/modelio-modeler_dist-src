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
    @objid ("790764b0-ebab-4aa6-b039-d331d94b9311")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("a9401d50-b2a5-4a35-a24a-ca1dee9360cf")
    @SmaMetaAssociation(metaName="ActualGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.ActualGateSmDependency.class, component = true)
     List<SmObjectImpl> mActualGate = null;

    @objid ("46717e15-1ae0-451c-a172-6fa4cdd63679")
    @SmaMetaAssociation(metaName="RefersTo", typeDataClass=InteractionData.class, min=1, max=1, smAssociationClass=Metadata.RefersToSmDependency.class, partof = true)
     SmObjectImpl mRefersTo;

    @objid ("66c7c278-a13b-4522-b730-57c0408cf976")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0075f526-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ac5df0af-b5fc-40f4-96e8-1000322c7ff7")
        private static SmClass smClass = null;

        @objid ("2798ec65-4984-4826-bf5e-2d4726988d1c")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("4de2ebff-771d-4df1-b615-63acc5366448")
        private static SmDependency ActualGateDep = null;

        @objid ("2a70fbfc-8df5-41f5-bbfb-7d9366207af9")
        private static SmDependency RefersToDep = null;

        @objid ("abf43b7c-8371-44f0-863c-c61f550140ee")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("47e7a44c-d9ca-499a-bee4-d98da7789564")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("b72c3245-b311-419c-af20-960ce79d9b92")
        public static SmDependency ActualGateDep() {
            if (ActualGateDep == null) {
            	ActualGateDep = classof().getDependencyDef("ActualGate");
            }
            return ActualGateDep;
        }

        @objid ("5d2e4d61-ccca-4852-818a-f4dd1a036acb")
        public static SmDependency RefersToDep() {
            if (RefersToDep == null) {
            	RefersToDep = classof().getDependencyDef("RefersTo");
            }
            return RefersToDep;
        }

        @objid ("83499a2f-908f-45b8-8096-a6596e938c9d")
        public static SmDependency getActualGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualGateDep;
        }

        @objid ("3d9bdd1f-0959-4b39-b633-d690c9db7196")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c419b5d5-3068-4b68-90ea-21e1faffd91a")
        public static SmDependency getRefersToDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RefersToDep;
        }

        @objid ("23b1ffdb-b1a8-4f2f-9bc0-ee28375beff5")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("00763720-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8943617f-93f4-4303-8151-90ab7d11d045")
            public ISmObjectData createData() {
                return new InteractionUseData();
            }

            @objid ("849f4733-3977-4e0f-a77a-256c4315b43d")
            public SmObjectImpl createImpl() {
                return new InteractionUseImpl();
            }

        }

        @objid ("007699c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("964ac526-b57c-4794-b231-7dcc8cb6940e")
            public Object getValue(ISmObjectData data) {
                return ((InteractionUseData) data).mEndLineNumber;
            }

            @objid ("4ecf841f-870a-4bf3-8748-077c53316020")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionUseData) data).mEndLineNumber = value;
            }

        }

        @objid ("0076fce6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RefersToSmDependency extends SmSingleDependency {
            @objid ("73cd1748-3da5-4aa5-ab38-9e88c20d1e22")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionUseData) data).mRefersTo;
            }

            @objid ("2081b9fd-e33a-4151-93eb-68f67ad4dddf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionUseData) data).mRefersTo = value;
            }

            @objid ("9be3905d-a972-4c78-8893-1044b667eb16")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.ReferedUseDep();
            }

        }

        @objid ("007773ce-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActualGateSmDependency extends SmMultipleDependency {
            @objid ("7df65e5a-cbd7-4b9d-a770-9ff8831f934f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionUseData)data).mActualGate != null)? ((InteractionUseData)data).mActualGate:SmMultipleDependency.EMPTY;
            }

            @objid ("2691499b-49e0-46b2-9008-33a828f552ee")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionUseData) data).mActualGate = new ArrayList<>(initialCapacity);
                return ((InteractionUseData) data).mActualGate;
            }

            @objid ("4ab4d4ec-beec-4d17-8097-10017feea77f")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerUseDep();
            }

        }

    }

}
