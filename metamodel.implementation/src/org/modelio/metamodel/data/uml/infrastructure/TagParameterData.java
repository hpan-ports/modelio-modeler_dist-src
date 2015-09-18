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
    @objid ("436779be-9232-4818-81f9-50af535489dd")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("80b4c33d-7133-4c8d-915f-77278c958379")
    @SmaMetaAssociation(metaName="Annoted", typeDataClass=TaggedValueData.class, min=0, max=1, smAssociationClass=Metadata.AnnotedSmDependency.class)
     SmObjectImpl mAnnoted;

    @objid ("e81de356-3dca-4b11-9e1f-0e19743a5f94")
    @SmaMetaAssociation(metaName="Qualified", typeDataClass=TaggedValueData.class, min=0, max=1, smAssociationClass=Metadata.QualifiedSmDependency.class)
     SmObjectImpl mQualified;

    @objid ("b54e06cb-0a67-4a19-92f3-31093fc567e7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004595ac-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d186bc60-33ce-4420-8519-1dedcff49dea")
        private static SmClass smClass = null;

        @objid ("2039ab42-cbc5-41be-bda4-db2f79371e07")
        private static SmAttribute ValueAtt = null;

        @objid ("246bee51-8709-4ca9-bf2c-d46eb171936a")
        private static SmDependency AnnotedDep = null;

        @objid ("5113c77e-0074-4301-a0e9-fa86364deb9c")
        private static SmDependency QualifiedDep = null;

        @objid ("71d93654-081f-401a-814f-7390103133c1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TagParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("441a88d5-1db1-4227-8e6e-366a501e1244")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("3b011d8c-798d-43dd-88e9-0a685f82dd75")
        public static SmDependency AnnotedDep() {
            if (AnnotedDep == null) {
            	AnnotedDep = classof().getDependencyDef("Annoted");
            }
            return AnnotedDep;
        }

        @objid ("f4bc735a-0331-4596-a2d5-8539071d1128")
        public static SmDependency QualifiedDep() {
            if (QualifiedDep == null) {
            	QualifiedDep = classof().getDependencyDef("Qualified");
            }
            return QualifiedDep;
        }

        @objid ("536a20b7-800b-402c-949d-3aaf370819ee")
        public static SmDependency getAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotedDep;
        }

        @objid ("89466a1b-4b2d-4bc5-aed5-702edfdfc349")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("820cc18a-8d87-44bd-b82e-abddb5382574")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2fabc8a7-49fb-4657-865d-67908f4513f7")
        public static SmDependency getQualifiedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifiedDep;
        }

        @objid ("0045d6fc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("aaaccf01-7751-45e7-9d6e-821dbe04a99a")
            public ISmObjectData createData() {
                return new TagParameterData();
            }

            @objid ("7cc3bd07-f121-4d50-87af-9a3b86ceda77")
            public SmObjectImpl createImpl() {
                return new TagParameterImpl();
            }

        }

        @objid ("00463818-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("5c3f9dc2-c354-4892-954d-e5f1b53e46d0")
            public Object getValue(ISmObjectData data) {
                return ((TagParameterData) data).mValue;
            }

            @objid ("ae98a3b4-fd4b-4a7d-a23e-bcec60a89fb7")
            public void setValue(ISmObjectData data, Object value) {
                ((TagParameterData) data).mValue = value;
            }

        }

        @objid ("00469bc8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AnnotedSmDependency extends SmSingleDependency {
            @objid ("c09b4ea4-6ccf-499a-a676-789ba3d31088")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagParameterData) data).mAnnoted;
            }

            @objid ("067e6f0b-ca56-4356-be0e-7f404e597344")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagParameterData) data).mAnnoted = value;
            }

            @objid ("be0d0630-dd5b-44b3-83d8-90050202782d")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.ActualDep();
            }

        }

        @objid ("0047126a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class QualifiedSmDependency extends SmSingleDependency {
            @objid ("36f1a703-b454-445b-ad75-ce8d83d7dfab")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagParameterData) data).mQualified;
            }

            @objid ("b6a3b0e2-b8dc-43f3-9842-eefdbc4631c5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagParameterData) data).mQualified = value;
            }

            @objid ("dc66f326-b4fe-4f64-b4ff-f7a1715fbf90")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.QualifierDep();
            }

        }

    }

}
