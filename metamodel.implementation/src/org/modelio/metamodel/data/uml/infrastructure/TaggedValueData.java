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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.TagParameterData;
import org.modelio.metamodel.data.uml.infrastructure.TagTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.TaggedValueImpl;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
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

@objid ("00907a4a-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TaggedValue.class, factory=TaggedValueData.Metadata.ObjectFactory.class)
public class TaggedValueData extends ModelElementData {
    @objid ("0c29e93a-e65c-4e50-824c-2cbcdd21cf54")
    @SmaMetaAssociation(metaName="Annoted", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.AnnotedSmDependency.class)
     SmObjectImpl mAnnoted;

    @objid ("f5436f63-39ab-42e1-97ce-ead8746f9ccd")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=TagParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ActualSmDependency.class, component = true)
     List<SmObjectImpl> mActual = null;

    @objid ("a4762ea2-bc04-4c8c-9713-952bba6e84db")
    @SmaMetaAssociation(metaName="Qualifier", typeDataClass=TagParameterData.class, min=0, max=1, smAssociationClass=Metadata.QualifierSmDependency.class, component = true)
     SmObjectImpl mQualifier;

    @objid ("d6e973b1-2cc1-41d0-a18f-29e662f2c103")
    @SmaMetaAssociation(metaName="Definition", typeDataClass=TagTypeData.class, min=1, max=1, smAssociationClass=Metadata.DefinitionSmDependency.class, partof = true)
     SmObjectImpl mDefinition;

    @objid ("6cb466b9-7d4b-485a-89df-37ab09e772d3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00818b0c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d735fcb9-3dfe-4a9b-b150-8a2d767da93e")
        private static SmClass smClass = null;

        @objid ("64329dfc-a026-4177-b4f6-6ae4c1e9b4f9")
        private static SmDependency AnnotedDep = null;

        @objid ("514cd995-937f-40f1-b6e6-f66d0081b01b")
        private static SmDependency ActualDep = null;

        @objid ("2681e37d-0f51-4ffa-8e0e-1b568932315d")
        private static SmDependency QualifierDep = null;

        @objid ("3652ff4c-622e-49af-98b4-fc3a1f7e12a9")
        private static SmDependency DefinitionDep = null;

        @objid ("276bc434-60fc-4061-86ac-8b6e26c270b5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TaggedValueData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("576cfb57-d7bf-4e8e-9c62-4e839ec8a2d0")
        public static SmDependency AnnotedDep() {
            if (AnnotedDep == null) {
            	AnnotedDep = classof().getDependencyDef("Annoted");
            }
            return AnnotedDep;
        }

        @objid ("90100136-dff8-4b6d-926c-1606567279f2")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("b30ab8ff-e2da-436b-8438-ed8f30aebeda")
        public static SmDependency QualifierDep() {
            if (QualifierDep == null) {
            	QualifierDep = classof().getDependencyDef("Qualifier");
            }
            return QualifierDep;
        }

        @objid ("8c05dd85-bbcd-459d-ad54-b5437de2c438")
        public static SmDependency DefinitionDep() {
            if (DefinitionDep == null) {
            	DefinitionDep = classof().getDependencyDef("Definition");
            }
            return DefinitionDep;
        }

        @objid ("e280c61f-012c-4231-b403-a8daf87d2f60")
        public static SmDependency getQualifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifierDep;
        }

        @objid ("3ab66914-75ef-470e-a235-613a8e23780d")
        public static SmDependency getDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinitionDep;
        }

        @objid ("2f518427-4278-4786-8146-4ebc00245ebb")
        public static SmDependency getAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotedDep;
        }

        @objid ("d5c8e14d-af4b-4aeb-8e74-a42109038f94")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("42fe9479-79bd-4a34-a7ff-b93366278696")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("0081cc2a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0af95dc2-ac0c-49ea-918f-f7a8c64baa00")
            public ISmObjectData createData() {
                return new TaggedValueData();
            }

            @objid ("6709f937-afee-482f-9d53-db6a11325fd7")
            public SmObjectImpl createImpl() {
                return new TaggedValueImpl();
            }

        }

        @objid ("00822eae-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AnnotedSmDependency extends SmSingleDependency {
            @objid ("095aae52-f77f-4278-a82a-be8970278495")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mAnnoted;
            }

            @objid ("a11955a3-b343-4bac-8d74-aaeed0655f05")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mAnnoted = value;
            }

            @objid ("3adf692d-b691-40fc-a844-f5bc4fb678a8")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.TagDep();
            }

        }

        @objid ("0082a2b2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmMultipleDependency {
            @objid ("29e4d5ce-e1ae-4fc1-b195-d22479db149b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TaggedValueData)data).mActual != null)? ((TaggedValueData)data).mActual:SmMultipleDependency.EMPTY;
            }

            @objid ("77b5ddaf-c528-43a8-bd35-efc83806d7e9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TaggedValueData) data).mActual = new ArrayList<>(initialCapacity);
                return ((TaggedValueData) data).mActual;
            }

            @objid ("a7f84cf0-87db-4367-9fd5-69d488050e30")
            @Override
            public SmDependency getSymetric() {
                return TagParameterData.Metadata.AnnotedDep();
            }

        }

        @objid ("008305c2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class QualifierSmDependency extends SmSingleDependency {
            @objid ("11d84b48-a1d4-43de-aff9-8e36095d9bac")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mQualifier;
            }

            @objid ("628e77cc-c171-408e-921c-a5802331cdac")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mQualifier = value;
            }

            @objid ("3da9153e-085c-4554-b5c9-86ce44ae861c")
            @Override
            public SmDependency getSymetric() {
                return TagParameterData.Metadata.QualifiedDep();
            }

        }

        @objid ("00837bc4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinitionSmDependency extends SmSingleDependency {
            @objid ("ad4ea28c-2bfa-4cd0-a132-e6f423d3e6ae")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TaggedValueData) data).mDefinition;
            }

            @objid ("229e12ba-a970-40ed-b550-5671039d2b92")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TaggedValueData) data).mDefinition = value;
            }

            @objid ("836632bc-7a39-4ab1-951f-5ae49c892fa9")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.TagOccurenceDep();
            }

        }

    }

}
