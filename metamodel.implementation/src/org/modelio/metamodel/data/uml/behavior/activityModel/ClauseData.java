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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityNodeData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ConditionalNodeData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ClauseImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
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

@objid ("002d1d10-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Clause.class, factory=ClauseData.Metadata.ObjectFactory.class)
public class ClauseData extends ModelElementData {
    @objid ("db5df8b4-7d5f-45f3-9d0e-3ce987606dde")
    @SmaMetaAttribute(metaName="Test", type=String.class, smAttributeClass=Metadata.TestSmAttribute.class)
     Object mTest = "";

    @objid ("06cada2a-ac81-473b-97e5-60dca67a9682")
    @SmaMetaAssociation(metaName="Body", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.BodySmDependency.class, component = true)
     List<SmObjectImpl> mBody = null;

    @objid ("1f121071-d3b0-49ed-be83-5ea5ca42e809")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ConditionalNodeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("50c25df0-3f77-43b7-8aca-48acb241d7c7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0039a526-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fc0cd8fc-47ae-4c1b-8023-30ae4211877c")
        private static SmClass smClass = null;

        @objid ("b9189f60-07ee-4d43-b4f6-e097f3e2c639")
        private static SmAttribute TestAtt = null;

        @objid ("01dc8bbf-76ec-4f4c-b0ca-c3a5bcd1dc00")
        private static SmDependency BodyDep = null;

        @objid ("c6b5754f-5ed2-4b8c-9786-b6272567c997")
        private static SmDependency OwnerDep = null;

        @objid ("074b3e81-efbe-4eba-9519-49c89ce4d8a2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClauseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d0997973-7388-4fc4-84db-4b21ba2809a4")
        public static SmAttribute TestAtt() {
            if (TestAtt == null) {
            	TestAtt = classof().getAttributeDef("Test");
            }
            return TestAtt;
        }

        @objid ("ac59a3c8-8447-4ba3-93df-d5fa34fea644")
        public static SmDependency BodyDep() {
            if (BodyDep == null) {
            	BodyDep = classof().getDependencyDef("Body");
            }
            return BodyDep;
        }

        @objid ("e3c81aad-db74-4335-9f29-3e0d89f34fe5")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("68bc0d9a-48e1-405f-80d7-128123bdf534")
        public static SmDependency getBodyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyDep;
        }

        @objid ("f3531d55-ecfa-4870-9cce-e6585ed1b593")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("5f3e7891-84a9-4dc1-89ff-b28bafc8bd57")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("05d1c709-bcdb-4a3a-9dae-3c0e9c611041")
        public static SmAttribute getTestAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestAtt;
        }

        @objid ("0039f350-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("72c71438-a3f4-4c01-9a4d-0e9a01498e5a")
            public ISmObjectData createData() {
                return new ClauseData();
            }

            @objid ("13aac6b8-d4c5-44b2-a156-c1d74bdb8568")
            public SmObjectImpl createImpl() {
                return new ClauseImpl();
            }

        }

        @objid ("003a5c64-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TestSmAttribute extends SmAttribute {
            @objid ("73226429-2006-42c2-9b31-236b307c43a4")
            public Object getValue(ISmObjectData data) {
                return ((ClauseData) data).mTest;
            }

            @objid ("7254910b-b2cb-4252-af62-267b07d521ce")
            public void setValue(ISmObjectData data, Object value) {
                ((ClauseData) data).mTest = value;
            }

        }

        @objid ("003abfe2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("d2f9e786-8b51-480d-ade9-557514759200")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClauseData) data).mOwner;
            }

            @objid ("17f52052-eeb1-4bcf-9ef0-1b378042c9c9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClauseData) data).mOwner = value;
            }

            @objid ("9d23c155-3a00-49c1-b2a1-7e8df2a3e9ed")
            @Override
            public SmDependency getSymetric() {
                return ConditionalNodeData.Metadata.OwnedClauseDep();
            }

        }

        @objid ("003b353a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BodySmDependency extends SmMultipleDependency {
            @objid ("961fe72c-8def-429d-8614-1c743ddb5487")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClauseData)data).mBody != null)? ((ClauseData)data).mBody:SmMultipleDependency.EMPTY;
            }

            @objid ("b69b21ef-9f61-4385-887a-8dad2f172afc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClauseData) data).mBody = new ArrayList<>(initialCapacity);
                return ((ClauseData) data).mBody;
            }

            @objid ("302f767f-b9a4-4355-bdfa-047b94c1086b")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerClauseDep();
            }

        }

    }

}
