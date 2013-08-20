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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.TaggedValueData;
import org.modelio.metamodel.impl.uml.infrastructure.TagParameterImpl;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
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

@objid ("008f0606-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TagParameter.class, factory=TagParameterData.Metadata.ObjectFactory.class)
public class TagParameterData extends ElementData {
    @objid ("3d7a1723-2458-42c4-be9a-b8910e53da51")
    @SmaMetaAssociation(metaName="Annoted", typeDataClass=TaggedValueData.class, min=0, max=1, smAssociationClass=Metadata.AnnotedSmDependency.class)
     SmObjectImpl mAnnoted;

    @objid ("809690ad-827f-478a-b140-c6fe221ae5be")
    @SmaMetaAssociation(metaName="Qualified", typeDataClass=TaggedValueData.class, min=0, max=1, smAssociationClass=Metadata.QualifiedSmDependency.class)
     SmObjectImpl mQualified;

    @objid ("20e4d730-848f-4c32-8e27-7b383abc41e7")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("c70f2288-3cc2-453e-83c2-7f46977087e1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004595ac-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("85a64884-72c1-4784-a1af-0101cb6bbe50")
        private static SmClass smClass = null;

        @objid ("6de8be52-d421-4f2b-8418-1337af37693a")
        private static SmAttribute ValueAtt = null;

        @objid ("0d1020ef-b1b0-4940-8187-9801cabeb41a")
        private static SmDependency AnnotedDep = null;

        @objid ("e61829d1-4754-4329-af2a-04a07a0cbe6c")
        private static SmDependency QualifiedDep = null;

        @objid ("762e1c24-b875-47c4-b10d-b25b7a756232")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TagParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4e284965-3f69-4758-973e-f63a82b9c174")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
                ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("3e4e7d4f-5920-4f09-ad9f-b137df7baea2")
        public static SmDependency AnnotedDep() {
            if (AnnotedDep == null) {
                AnnotedDep = classof().getDependencyDef("Annoted");
            }
            return AnnotedDep;
        }

        @objid ("38430d61-0a41-4da9-ba25-ceaf7367a641")
        public static SmDependency QualifiedDep() {
            if (QualifiedDep == null) {
                QualifiedDep = classof().getDependencyDef("Qualified");
            }
            return QualifiedDep;
        }

        @objid ("0650a868-ec4f-4609-995b-ebf07bac6668")
        public static SmDependency getAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotedDep;
        }

        @objid ("a790fdb6-bdd8-4934-9b39-4bfad885d522")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4e2a8fda-fbd9-4eba-b39a-84334c116724")
        public static SmDependency getQualifiedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifiedDep;
        }

        @objid ("b22d0c8a-8eb9-40ca-bdec-24bb574254d4")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("0045d6fc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("91e11499-9a2f-4719-9275-d5f519e096f4")
            public ISmObjectData createData() {
                return new TagParameterData();
            }

            @objid ("a5cccf85-2b56-46f0-b1c0-39d40d99002a")
            public SmObjectImpl createImpl() {
                return new TagParameterImpl();
            }

        }

        @objid ("00463818-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("addcc0dd-a73c-47f2-a76b-6c7c0dd3c35a")
            public Object getValue(ISmObjectData data) {
                return ((TagParameterData) data).mValue;
            }

            @objid ("833fd731-8867-4ef2-8129-f4e789103c87")
            public void setValue(ISmObjectData data, Object value) {
                ((TagParameterData) data).mValue = value;
            }

        }

        @objid ("00469bc8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AnnotedSmDependency extends SmSingleDependency {
            @objid ("e0673cda-3af3-4101-a96f-d8c6d31235fc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagParameterData) data).mAnnoted;
            }

            @objid ("9b7359dd-80be-4a7b-bd26-6a05a10efc22")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagParameterData) data).mAnnoted = value;
            }

            @objid ("ccace437-ab78-4b84-ae14-fe0e8ae9776e")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.ActualDep();
            }

        }

        @objid ("0047126a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class QualifiedSmDependency extends SmSingleDependency {
            @objid ("c17b3671-62dc-4214-95cd-b8c9142a94cf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagParameterData) data).mQualified;
            }

            @objid ("1d934784-f720-4d7c-81fa-44ea45e757ed")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagParameterData) data).mQualified = value;
            }

            @objid ("33146023-373b-4729-ad2f-c6928783d003")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.QualifierDep();
            }

        }

    }

}
