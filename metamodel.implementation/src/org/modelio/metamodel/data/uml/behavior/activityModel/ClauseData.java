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
    @objid ("9267019a-9db5-43ea-9af3-88f42845a32c")
    @SmaMetaAttribute(metaName="Test", type=String.class, smAttributeClass=Metadata.TestSmAttribute.class)
     Object mTest = "";

    @objid ("cf4033f3-d8e0-478c-b65f-ebb7d09209cb")
    @SmaMetaAssociation(metaName="Body", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.BodySmDependency.class, component = true)
     List<SmObjectImpl> mBody = null;

    @objid ("53d80c03-bcee-48b9-9b6e-ee1b19079498")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ConditionalNodeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("cb5189ae-9960-4d7a-bea0-9739abbcc1c4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0039a526-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("680c4a61-bcb5-4b1b-b79b-561e5d91b432")
        private static SmClass smClass = null;

        @objid ("afb6ae7a-dfed-471f-814a-1c0f41a3206d")
        private static SmAttribute TestAtt = null;

        @objid ("a0d92178-021b-435a-a3b7-10bb1f09b885")
        private static SmDependency BodyDep = null;

        @objid ("4530cf21-dfa7-456b-85aa-084d02809092")
        private static SmDependency OwnerDep = null;

        @objid ("8fa6549f-09da-4007-aeb9-3e5301614337")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClauseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ef469d51-cade-49c3-a475-909efa69e83e")
        public static SmAttribute TestAtt() {
            if (TestAtt == null) {
            	TestAtt = classof().getAttributeDef("Test");
            }
            return TestAtt;
        }

        @objid ("4865d045-3c82-4bdd-b68b-0c32a11fa4d5")
        public static SmDependency BodyDep() {
            if (BodyDep == null) {
            	BodyDep = classof().getDependencyDef("Body");
            }
            return BodyDep;
        }

        @objid ("f1cf0128-8c2f-460d-b3fd-02fce6bab4f4")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("13ea0fb0-0e65-4420-b44a-3fcb76c74b7d")
        public static SmDependency getBodyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyDep;
        }

        @objid ("48dc73f2-1342-4e14-bdce-95e2edd4cd9e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1f74484f-62da-480a-994d-f1a2b12dd170")
        public static SmAttribute getTestAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestAtt;
        }

        @objid ("59de03ef-fc6a-400c-85e8-bfd9a9445eab")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("0039f350-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ea6a9249-f1db-46a4-a080-e86bb37e7d2d")
            public ISmObjectData createData() {
                return new ClauseData();
            }

            @objid ("e886c574-629c-4645-98f1-fb673cc31c51")
            public SmObjectImpl createImpl() {
                return new ClauseImpl();
            }

        }

        @objid ("003a5c64-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TestSmAttribute extends SmAttribute {
            @objid ("f5c0e8b4-85cc-4fb8-8e76-96ae6c07b4ca")
            public Object getValue(ISmObjectData data) {
                return ((ClauseData) data).mTest;
            }

            @objid ("1a15b3f6-9bf4-4dc0-8b8e-99f7b333ae64")
            public void setValue(ISmObjectData data, Object value) {
                ((ClauseData) data).mTest = value;
            }

        }

        @objid ("003abfe2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("28ab8cab-0e49-48fe-b027-9147dbe7ffd3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClauseData) data).mOwner;
            }

            @objid ("5765a292-f56e-49e9-9c09-df24338de0b6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClauseData) data).mOwner = value;
            }

            @objid ("9c4b64ff-21c6-4de0-98ea-f84846607d83")
            @Override
            public SmDependency getSymetric() {
                return ConditionalNodeData.Metadata.OwnedClauseDep();
            }

        }

        @objid ("003b353a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BodySmDependency extends SmMultipleDependency {
            @objid ("d73af9ef-8c78-4489-89fe-aa2bb7b73ade")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClauseData)data).mBody != null)? ((ClauseData)data).mBody:SmMultipleDependency.EMPTY;
            }

            @objid ("063ede37-aea2-4f24-b89c-a92de8f8b54a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClauseData) data).mBody = new ArrayList<>(initialCapacity);
                return ((ClauseData) data).mBody;
            }

            @objid ("e6af09a3-f1a4-4134-a66f-21d684b7a6c9")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerClauseDep();
            }

        }

    }

}
