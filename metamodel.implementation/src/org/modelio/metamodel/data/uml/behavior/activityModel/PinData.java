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
    @objid ("4a43cb08-acec-4a12-b98d-cffa1c2c6d9c")
    @SmaMetaAttribute(metaName="IsControl", type=Boolean.class, smAttributeClass=Metadata.IsControlSmAttribute.class)
     Object mIsControl = false;

    @objid ("b0dbbb6c-aa0b-423b-9ad2-c22fb43abb0b")
    @SmaMetaAttribute(metaName="IsExpansion", type=Boolean.class, smAttributeClass=Metadata.IsExpansionSmAttribute.class)
     Object mIsExpansion = false;

    @objid ("017286aa-7e85-47a5-9287-8721fdf80c03")
    @SmaMetaAssociation(metaName="Matched", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.MatchedSmDependency.class, partof = true)
     SmObjectImpl mMatched;

    @objid ("56ee54ce-19ea-422c-9d81-0a129ddb455d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002fdd34-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("99ba830f-1f4a-441c-882c-2f4935dd8601")
        private static SmClass smClass = null;

        @objid ("cdcb4823-bb15-46ac-8221-55142bc9c8fb")
        private static SmAttribute IsControlAtt = null;

        @objid ("b6b32b43-255d-4178-a41b-ea997d8a5c5e")
        private static SmAttribute IsExpansionAtt = null;

        @objid ("00df1f8a-80ed-4285-b4c2-220614fe73a3")
        private static SmDependency MatchedDep = null;

        @objid ("0832bbea-68fa-47c2-a30b-8645dd9e6115")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9d67bc1e-0a69-47f4-b207-613ee792e640")
        public static SmAttribute IsControlAtt() {
            if (IsControlAtt == null) {
            	IsControlAtt = classof().getAttributeDef("IsControl");
            }
            return IsControlAtt;
        }

        @objid ("2412566f-4d63-46ea-bdab-c133050bc905")
        public static SmAttribute IsExpansionAtt() {
            if (IsExpansionAtt == null) {
            	IsExpansionAtt = classof().getAttributeDef("IsExpansion");
            }
            return IsExpansionAtt;
        }

        @objid ("0a43802c-5e3f-4bda-a281-5d8f8e3cc05e")
        public static SmDependency MatchedDep() {
            if (MatchedDep == null) {
            	MatchedDep = classof().getDependencyDef("Matched");
            }
            return MatchedDep;
        }

        @objid ("1c381a79-21f7-4b12-8d48-fac94e24f83f")
        public static SmAttribute getIsExpansionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExpansionAtt;
        }

        @objid ("b021cc44-4ec4-4cbb-9658-e9fb146fe9b5")
        public static SmAttribute getIsControlAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsControlAtt;
        }

        @objid ("19f23d1c-be55-4399-bda2-66464bd7897e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("af97b2f3-17e7-4c4b-86e6-4bc9b969cda3")
        public static SmDependency getMatchedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatchedDep;
        }

        @objid ("0030205a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ffe5c153-40b7-4a89-b189-ee592382abe6")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("17364400-ace7-42dd-ae4e-1b2de5b5a68a")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00308342-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsControlSmAttribute extends SmAttribute {
            @objid ("c95d715c-9a45-49d3-bedf-d90bbbe7d932")
            public Object getValue(ISmObjectData data) {
                return ((PinData) data).mIsControl;
            }

            @objid ("7eee699f-a004-483a-a8ea-2a5e671c26a8")
            public void setValue(ISmObjectData data, Object value) {
                ((PinData) data).mIsControl = value;
            }

        }

        @objid ("0030e7ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsExpansionSmAttribute extends SmAttribute {
            @objid ("619c0269-226e-4036-8253-ebc0cd15f653")
            public Object getValue(ISmObjectData data) {
                return ((PinData) data).mIsExpansion;
            }

            @objid ("e87be127-f8bf-4ecd-996b-6015152f3cca")
            public void setValue(ISmObjectData data, Object value) {
                ((PinData) data).mIsExpansion = value;
            }

        }

        @objid ("00314c50-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MatchedSmDependency extends SmSingleDependency {
            @objid ("b08f89c4-a796-472b-84fa-8b75cc6229a5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PinData) data).mMatched;
            }

            @objid ("78ef0426-9d95-4e87-8a91-08c260dcda2d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PinData) data).mMatched = value;
            }

            @objid ("3cbe14e1-4526-4cbe-b7f6-7ed5fdd1a174")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.MatchingDep();
            }

        }

    }

}
