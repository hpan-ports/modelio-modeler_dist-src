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
    @objid ("c9d95115-7b07-4e3e-ac1a-6eaff0be0834")
    @SmaMetaAttribute(metaName="IsControl", type=Boolean.class, smAttributeClass=Metadata.IsControlSmAttribute.class)
     Object mIsControl = false;

    @objid ("579173a9-3156-44cc-8863-988a7dc870c8")
    @SmaMetaAttribute(metaName="IsExpansion", type=Boolean.class, smAttributeClass=Metadata.IsExpansionSmAttribute.class)
     Object mIsExpansion = false;

    @objid ("31317e1f-b672-4a43-b1b3-4692d0fc3590")
    @SmaMetaAssociation(metaName="Matched", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.MatchedSmDependency.class, partof = true)
     SmObjectImpl mMatched;

    @objid ("fada0cb7-10ce-4a85-a2b4-a5d8dee0653a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002fdd34-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("63cca518-a903-4d10-84f5-bca8d95d3edd")
        private static SmClass smClass = null;

        @objid ("e86321ef-6c56-486d-849f-78e0ef0682ac")
        private static SmAttribute IsControlAtt = null;

        @objid ("0b35f10d-d710-4060-8cd4-d3402d7375a5")
        private static SmAttribute IsExpansionAtt = null;

        @objid ("71349e7c-b718-4382-bd00-f3cd5dbd6eb3")
        private static SmDependency MatchedDep = null;

        @objid ("d1cdf05e-e04a-4c07-b1f3-ea3b9a0072a7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8640a91d-0189-44a1-8153-4a664d3d60c6")
        public static SmAttribute IsControlAtt() {
            if (IsControlAtt == null) {
            	IsControlAtt = classof().getAttributeDef("IsControl");
            }
            return IsControlAtt;
        }

        @objid ("5cc3218f-06b8-4725-9ab6-1aa2d2051619")
        public static SmAttribute IsExpansionAtt() {
            if (IsExpansionAtt == null) {
            	IsExpansionAtt = classof().getAttributeDef("IsExpansion");
            }
            return IsExpansionAtt;
        }

        @objid ("4d7deea6-58e9-4385-81ef-5065e99fd495")
        public static SmDependency MatchedDep() {
            if (MatchedDep == null) {
            	MatchedDep = classof().getDependencyDef("Matched");
            }
            return MatchedDep;
        }

        @objid ("15d2fa84-d1b6-4cef-a4a1-0481fafc2a92")
        public static SmDependency getMatchedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatchedDep;
        }

        @objid ("28f7021f-d018-4fdc-8d26-c1fa3166d452")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("abcfce5f-a8e8-447f-be38-d2af509752e0")
        public static SmAttribute getIsControlAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsControlAtt;
        }

        @objid ("9e2a0537-c8f6-49e2-93e9-bf147772c469")
        public static SmAttribute getIsExpansionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExpansionAtt;
        }

        @objid ("0030205a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dc09706e-56ea-49f2-8eb8-7a05b2ff511d")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("9710ca48-ad56-4da7-8a23-65d06c0e3e71")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00308342-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsControlSmAttribute extends SmAttribute {
            @objid ("dcf3722b-3aa5-4c72-93cd-4033119c7e42")
            public Object getValue(ISmObjectData data) {
                return ((PinData) data).mIsControl;
            }

            @objid ("b00fd8de-265d-433d-be1e-ebca93540369")
            public void setValue(ISmObjectData data, Object value) {
                ((PinData) data).mIsControl = value;
            }

        }

        @objid ("0030e7ba-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsExpansionSmAttribute extends SmAttribute {
            @objid ("ac87dc3f-5bd9-47a2-ab54-5f7ca444dd17")
            public Object getValue(ISmObjectData data) {
                return ((PinData) data).mIsExpansion;
            }

            @objid ("4c43f3a5-322b-4b8e-a92e-5c8fa8e5b733")
            public void setValue(ISmObjectData data, Object value) {
                ((PinData) data).mIsExpansion = value;
            }

        }

        @objid ("00314c50-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MatchedSmDependency extends SmSingleDependency {
            @objid ("33b9d341-933d-4632-af9d-efd4e95c6444")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PinData) data).mMatched;
            }

            @objid ("51ad75db-0aa8-41e3-8840-fc2ffe57e761")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PinData) data).mMatched = value;
            }

            @objid ("15e204f2-fb04-4349-831e-780c64974383")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.MatchingDep();
            }

        }

    }

}
