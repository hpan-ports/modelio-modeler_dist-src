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
    @objid ("1b327891-48b4-4621-8f8c-43675cd7bfd7")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("5522525d-79d0-475b-be0c-593e2037613c")
    @SmaMetaAssociation(metaName="Annoted", typeDataClass=TaggedValueData.class, min=0, max=1, smAssociationClass=Metadata.AnnotedSmDependency.class)
     SmObjectImpl mAnnoted;

    @objid ("acef9b6f-9e9e-4b78-a49a-880f5e498076")
    @SmaMetaAssociation(metaName="Qualified", typeDataClass=TaggedValueData.class, min=0, max=1, smAssociationClass=Metadata.QualifiedSmDependency.class)
     SmObjectImpl mQualified;

    @objid ("235694b8-0eff-448c-a2bd-a468fe2a7b4d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004595ac-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a85694a5-5b33-406a-a28e-7bec08d2a298")
        private static SmClass smClass = null;

        @objid ("5899f2d2-7441-4cb5-9796-e272b982e98f")
        private static SmAttribute ValueAtt = null;

        @objid ("d403056e-f918-40a2-9a37-39cd30c45c94")
        private static SmDependency AnnotedDep = null;

        @objid ("06714670-c26d-4723-b378-dd2862944740")
        private static SmDependency QualifiedDep = null;

        @objid ("2d353d4b-2793-4b27-b2ab-5ad9cc2e659d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TagParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fe416136-5b7b-4b55-b2d1-f5ca9c8c0356")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("320efe03-2652-429c-9c64-a0d32ea2dfc3")
        public static SmDependency AnnotedDep() {
            if (AnnotedDep == null) {
            	AnnotedDep = classof().getDependencyDef("Annoted");
            }
            return AnnotedDep;
        }

        @objid ("ecfc10f4-8048-4600-9f21-4129e4fa434f")
        public static SmDependency QualifiedDep() {
            if (QualifiedDep == null) {
            	QualifiedDep = classof().getDependencyDef("Qualified");
            }
            return QualifiedDep;
        }

        @objid ("0a17229d-c6f5-4b99-b8b4-077b7f671e23")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4cac430c-2af7-444f-815e-ffa2685321dc")
        public static SmDependency getQualifiedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifiedDep;
        }

        @objid ("aa1bfa70-1b88-4825-a61a-5307f362ae7e")
        public static SmDependency getAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotedDep;
        }

        @objid ("ac9778fd-a90c-4db9-87c8-21c987c64cd6")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("0045d6fc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a355e00a-b9f6-4fd4-bd99-5190a25c82d9")
            public ISmObjectData createData() {
                return new TagParameterData();
            }

            @objid ("3bd1199a-06a4-4887-8ab9-d19288af9622")
            public SmObjectImpl createImpl() {
                return new TagParameterImpl();
            }

        }

        @objid ("00463818-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("16f4e4c9-7d73-48c6-b5ce-a190a1391fa4")
            public Object getValue(ISmObjectData data) {
                return ((TagParameterData) data).mValue;
            }

            @objid ("f585d12d-430c-44c5-9616-f21470edc908")
            public void setValue(ISmObjectData data, Object value) {
                ((TagParameterData) data).mValue = value;
            }

        }

        @objid ("00469bc8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AnnotedSmDependency extends SmSingleDependency {
            @objid ("b2291c52-8da0-49e7-ad8d-8645b460cc6d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagParameterData) data).mAnnoted;
            }

            @objid ("1c966305-8e9b-437e-8442-5964e76310c8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagParameterData) data).mAnnoted = value;
            }

            @objid ("a8862e7f-09bc-43ff-ad85-4ad7fc819481")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.ActualDep();
            }

        }

        @objid ("0047126a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class QualifiedSmDependency extends SmSingleDependency {
            @objid ("5d30de6e-bc90-4061-8a36-85e32858036e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagParameterData) data).mQualified;
            }

            @objid ("4be6505b-749a-4b6c-b297-84155837bf6b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagParameterData) data).mQualified = value;
            }

            @objid ("9046999d-2cd3-47f5-8857-ae12c51726c1")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.QualifierDep();
            }

        }

    }

}
