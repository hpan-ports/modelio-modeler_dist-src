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
    @objid ("c573f04e-1b9c-4448-851d-0fb3e0283cca")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("1305919c-8bef-4d90-8c08-c35da36d5eb9")
    @SmaMetaAssociation(metaName="ActualGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.ActualGateSmDependency.class, component = true)
     List<SmObjectImpl> mActualGate = null;

    @objid ("2e4e0909-eb4f-43f3-90cc-10e3069fcc10")
    @SmaMetaAssociation(metaName="RefersTo", typeDataClass=InteractionData.class, min=1, max=1, smAssociationClass=Metadata.RefersToSmDependency.class, partof = true)
     SmObjectImpl mRefersTo;

    @objid ("83c81410-6ddb-4f3a-901e-d60606db8f4a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0075f526-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e42c3824-821f-420a-976e-9e1915a1f3fd")
        private static SmClass smClass = null;

        @objid ("8fd79815-da5c-460f-9be5-e56b0160fd9d")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("ddc4aef3-f876-4016-afe0-7cd85d6b716e")
        private static SmDependency ActualGateDep = null;

        @objid ("172910d0-51f1-4d6e-a156-48445d0d4786")
        private static SmDependency RefersToDep = null;

        @objid ("c45472a8-8a44-4eca-858f-81033aadfa54")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("13d8ecd9-4421-4187-8d0a-0ca3f144a4ba")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("13f27a07-459f-497e-96b5-80ad70d0faad")
        public static SmDependency ActualGateDep() {
            if (ActualGateDep == null) {
            	ActualGateDep = classof().getDependencyDef("ActualGate");
            }
            return ActualGateDep;
        }

        @objid ("e7d320be-92a4-4488-b86e-7bf96788a007")
        public static SmDependency RefersToDep() {
            if (RefersToDep == null) {
            	RefersToDep = classof().getDependencyDef("RefersTo");
            }
            return RefersToDep;
        }

        @objid ("f620d876-0ae5-4e80-89b2-01c2ec3394f3")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("3311c015-9f59-4e96-a2c4-b3e4b2b78444")
        public static SmDependency getRefersToDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RefersToDep;
        }

        @objid ("1b9e6bce-0620-431f-ab87-958f764cb077")
        public static SmDependency getActualGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualGateDep;
        }

        @objid ("cb9154d9-c4b3-4588-803f-2a6e527dd923")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00763720-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("51b86e21-a631-4534-9e98-275b5c589054")
            public ISmObjectData createData() {
                return new InteractionUseData();
            }

            @objid ("4d4ab082-3145-4634-adc8-ea41d2cca82f")
            public SmObjectImpl createImpl() {
                return new InteractionUseImpl();
            }

        }

        @objid ("007699c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("4162e674-95d5-4976-8d6d-fef8b913ee2a")
            public Object getValue(ISmObjectData data) {
                return ((InteractionUseData) data).mEndLineNumber;
            }

            @objid ("2ed7b0e9-e9ed-470b-8f53-fab1ac84ea5f")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionUseData) data).mEndLineNumber = value;
            }

        }

        @objid ("0076fce6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RefersToSmDependency extends SmSingleDependency {
            @objid ("176b990c-2416-44d0-9d01-7bc59b6ff47e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionUseData) data).mRefersTo;
            }

            @objid ("f0ed6e57-6d49-4af2-b389-086d0784d500")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionUseData) data).mRefersTo = value;
            }

            @objid ("becae6e8-ce2d-48ed-9925-6f095c0fd0a1")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.ReferedUseDep();
            }

        }

        @objid ("007773ce-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActualGateSmDependency extends SmMultipleDependency {
            @objid ("3d350d14-8896-4320-bc48-a71f3dbc0968")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionUseData)data).mActualGate != null)? ((InteractionUseData)data).mActualGate:SmMultipleDependency.EMPTY;
            }

            @objid ("0cec4528-8c31-4512-b3d7-341cab99291a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionUseData) data).mActualGate = new ArrayList<>(initialCapacity);
                return ((InteractionUseData) data).mActualGate;
            }

            @objid ("0e12a9a2-c722-41dc-98a6-3c2a4095ce92")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerUseDep();
            }

        }

    }

}
