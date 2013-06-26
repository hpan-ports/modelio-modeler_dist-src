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
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.PinImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
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

@objid ("003cf4e2-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Pin.class, factory=PinData.Metadata.ObjectFactory.class)
public abstract class PinData extends ObjectNodeData {
    @objid ("c0092a5d-1cdf-404f-a3d8-99d4e6d6ec4a")
    @SmaMetaAttribute(metaName="IsControl", type=Boolean.class, smAttributeClass=Metadata.IsControlSmAttribute.class)
     Object mIsControl = false;

    @objid ("48a46fef-305e-4ebf-975c-5b64e61d5fc9")
    @SmaMetaAttribute(metaName="IsExpansion", type=Boolean.class, smAttributeClass=Metadata.IsExpansionSmAttribute.class)
     Object mIsExpansion = false;

    @objid ("6fc0898e-675c-433b-924c-c3afb98b0c53")
    @SmaMetaAssociation(metaName="Matched", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.MatchedSmDependency.class, partof = true)
     SmObjectImpl mMatched;

    @objid ("7912a554-5f7e-4801-a60a-03d055af7463")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002fdd34-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("47e25433-4c2f-4f3b-ba0b-8441270ab0a3")
        private static SmClass smClass = null;

        @objid ("633cf368-cbbb-4a53-b5b6-0ebdba8fd2a6")
        private static SmAttribute IsControlAtt = null;

        @objid ("17b8fee5-c779-47e4-abbd-ceff1c3e483c")
        private static SmAttribute IsExpansionAtt = null;

        @objid ("1da5df66-a8a6-4204-9d98-23ebdcdca3b2")
        private static SmDependency MatchedDep = null;

        @objid ("78341cd8-f849-49f3-8e40-66966e530a58")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("59f5471c-f0b1-4a01-a816-9d0036c6e109")
        public static SmAttribute IsControlAtt() {
            if (IsControlAtt == null) {
            	IsControlAtt = classof().getAttributeDef("IsControl");
            }
            return IsControlAtt;
        }

        @objid ("4244d2eb-1871-4e62-9793-6940a0d3b7ec")
        public static SmAttribute IsExpansionAtt() {
            if (IsExpansionAtt == null) {
            	IsExpansionAtt = classof().getAttributeDef("IsExpansion");
            }
            return IsExpansionAtt;
        }

        @objid ("f40959ba-c9de-4b40-97a9-cd6ff4157774")
        public static SmDependency MatchedDep() {
            if (MatchedDep == null) {
            	MatchedDep = classof().getDependencyDef("Matched");
            }
            return MatchedDep;
        }

        @objid ("ff1fc069-062f-4303-8302-a2cd32e33d8f")
        public static SmDependency getMatchedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatchedDep;
        }

        @objid ("0a8b1b38-e683-4c61-b60f-b9c8888822cc")
        public static SmAttribute getIsExpansionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExpansionAtt;
        }

        @objid ("b017b30e-634a-4b2c-ab0d-239eb6e4e603")
        public static SmAttribute getIsControlAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsControlAtt;
        }

        @objid ("8ae5b559-6060-459b-b840-e3e68eff7879")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0030205a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("29e941aa-43c1-4c8c-b80a-f7f8c9903660")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("b92331b7-ddda-4448-807b-ad0bbab8c10f")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00308342-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsControlSmAttribute extends SmAttribute {
            @objid ("c875de82-69e1-4ef2-aa51-020bbcb8f7b6")
            public Object getValue(ISmObjectData data) {
                return ((PinData) data).mIsControl;
            }

            @objid ("73e9ee56-8105-4796-96a6-396eb0109dd2")
            public void setValue(ISmObjectData data, Object value) {
                ((PinData) data).mIsControl = value;
            }

        }

        @objid ("0030e7ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsExpansionSmAttribute extends SmAttribute {
            @objid ("4a3c4f01-451e-48ba-8107-997eedc7009e")
            public Object getValue(ISmObjectData data) {
                return ((PinData) data).mIsExpansion;
            }

            @objid ("b9cd1b03-436d-4b97-8989-4cf4a67b80ae")
            public void setValue(ISmObjectData data, Object value) {
                ((PinData) data).mIsExpansion = value;
            }

        }

        @objid ("00314c50-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MatchedSmDependency extends SmSingleDependency {
            @objid ("0863f2b7-9547-4023-a3be-52719857f0c3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PinData) data).mMatched;
            }

            @objid ("02f09ce8-20d6-4504-bde7-e13f6b3ee3e3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PinData) data).mMatched = value;
            }

            @objid ("8db0433e-f88d-4d31-8a03-44f78abeea48")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.MatchingDep();
            }

        }

    }

}
