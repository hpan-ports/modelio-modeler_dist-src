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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ConstraintData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.DurationConstraintImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.DurationConstraint;
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

@objid ("00441e70-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DurationConstraint.class, factory=DurationConstraintData.Metadata.ObjectFactory.class)
public class DurationConstraintData extends ConstraintData {
    @objid ("2d7f5532-7e22-4683-91e8-7a331388ffe3")
    @SmaMetaAttribute(metaName="DurationMin", type=String.class, smAttributeClass=Metadata.DurationMinSmAttribute.class)
     Object mDurationMin = "";

    @objid ("42cfe6cd-4e0f-40dc-b566-23ec6b19aacb")
    @SmaMetaAttribute(metaName="DurationMax", type=String.class, smAttributeClass=Metadata.DurationMaxSmAttribute.class)
     Object mDurationMax = "";

    @objid ("cb3d94e5-f224-40b8-9004-7a8cd3dc8360")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0042d6fa-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("38cd0a02-00e4-4b4f-8a4e-87b9dc34d911")
        private static SmClass smClass = null;

        @objid ("c091c30b-1317-4679-9dc6-ea115b3e428f")
        private static SmAttribute DurationMinAtt = null;

        @objid ("1b00fcf2-022f-4a83-91b8-8ab729b30f92")
        private static SmAttribute DurationMaxAtt = null;

        @objid ("7b1c5230-a063-4020-a7fe-448049ddb40a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DurationConstraintData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dd57b69e-316c-44f5-98c7-21aa3dca52dc")
        public static SmAttribute DurationMinAtt() {
            if (DurationMinAtt == null) {
            	DurationMinAtt = classof().getAttributeDef("DurationMin");
            }
            return DurationMinAtt;
        }

        @objid ("e15aa572-f2e4-440b-bda5-2e69c6699b20")
        public static SmAttribute DurationMaxAtt() {
            if (DurationMaxAtt == null) {
            	DurationMaxAtt = classof().getAttributeDef("DurationMax");
            }
            return DurationMaxAtt;
        }

        @objid ("8a4290d6-edda-4a8c-86db-2f3cdda1a12b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("19688bbe-fa04-4ab9-9159-8059c19bb767")
        public static SmAttribute getDurationMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DurationMinAtt;
        }

        @objid ("7f302dba-30fc-400f-ae96-76d76b942266")
        public static SmAttribute getDurationMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DurationMaxAtt;
        }

        @objid ("00432452-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("80426b8f-dc46-47c4-8454-a2eab1b8718f")
            public ISmObjectData createData() {
                return new DurationConstraintData();
            }

            @objid ("c73eb5cf-4ea1-43bd-ba24-d9058f8c169f")
            public SmObjectImpl createImpl() {
                return new DurationConstraintImpl();
            }

        }

        @objid ("004387e4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DurationMinSmAttribute extends SmAttribute {
            @objid ("606d12c7-8053-4f38-a042-446910103e2f")
            public Object getValue(ISmObjectData data) {
                return ((DurationConstraintData) data).mDurationMin;
            }

            @objid ("508e6d01-964c-4852-bd6a-70f25c6c170d")
            public void setValue(ISmObjectData data, Object value) {
                ((DurationConstraintData) data).mDurationMin = value;
            }

        }

        @objid ("0043e996-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DurationMaxSmAttribute extends SmAttribute {
            @objid ("1bbb6f8e-1dad-4631-8063-01a869a719df")
            public Object getValue(ISmObjectData data) {
                return ((DurationConstraintData) data).mDurationMax;
            }

            @objid ("d082bf97-18be-4703-b9a3-99db32804625")
            public void setValue(ISmObjectData data, Object value) {
                ((DurationConstraintData) data).mDurationMax = value;
            }

        }

    }

}
