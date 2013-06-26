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
    @objid ("a717e087-1e13-4aef-acbf-d1a92669a509")
    @SmaMetaAttribute(metaName="Test", type=String.class, smAttributeClass=Metadata.TestSmAttribute.class)
     Object mTest = "";

    @objid ("b079c845-a9e3-47df-9b69-4e2d8863327d")
    @SmaMetaAssociation(metaName="Body", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.BodySmDependency.class, component = true)
     List<SmObjectImpl> mBody = null;

    @objid ("bcd489d1-20ee-4252-8dcc-a5a5884063a3")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ConditionalNodeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("1ce35192-21c1-4b14-b547-86eef961b975")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0039a526-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("48c4a94b-7c3b-4934-837e-dd0b11a215ca")
        private static SmClass smClass = null;

        @objid ("b3a72ddd-e395-49d0-af6f-1a6ef8baf88c")
        private static SmAttribute TestAtt = null;

        @objid ("d3d197e2-cb69-47ef-af27-4f2b0ac73560")
        private static SmDependency BodyDep = null;

        @objid ("2ee52916-3e1d-43af-96af-75781eaa48f7")
        private static SmDependency OwnerDep = null;

        @objid ("d1b4ffab-442f-480d-9118-1e159191ed8a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClauseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4819cfa6-085b-46c6-b278-02b874e9d13e")
        public static SmAttribute TestAtt() {
            if (TestAtt == null) {
            	TestAtt = classof().getAttributeDef("Test");
            }
            return TestAtt;
        }

        @objid ("82342be9-6839-46fe-9daa-8858b10f3888")
        public static SmDependency BodyDep() {
            if (BodyDep == null) {
            	BodyDep = classof().getDependencyDef("Body");
            }
            return BodyDep;
        }

        @objid ("50d59ac8-63b1-49c2-b749-704fc6e695f9")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("f967f77f-22c0-4059-80cd-cf3ecc610d6d")
        public static SmAttribute getTestAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TestAtt;
        }

        @objid ("e6e73a88-3906-4d57-a836-c34c2e3e35ce")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("a9de0a45-4688-4ad0-b655-fccaddc62d8e")
        public static SmDependency getBodyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyDep;
        }

        @objid ("31a0c885-9c11-4998-9cb3-2fb4fd3116ba")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0039f350-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c7d971bb-c61b-450c-9e44-3f4243cbfab9")
            public ISmObjectData createData() {
                return new ClauseData();
            }

            @objid ("355a45c8-c019-4fe8-b4ee-2fddbcc1adb2")
            public SmObjectImpl createImpl() {
                return new ClauseImpl();
            }

        }

        @objid ("003a5c64-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TestSmAttribute extends SmAttribute {
            @objid ("37157518-3642-4240-8602-ade176239a62")
            public Object getValue(ISmObjectData data) {
                return ((ClauseData) data).mTest;
            }

            @objid ("c83ccfbe-3e88-4095-9f0e-94e5bb74d4dd")
            public void setValue(ISmObjectData data, Object value) {
                ((ClauseData) data).mTest = value;
            }

        }

        @objid ("003abfe2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("452cf0c8-c151-4182-82bb-c37aabf5c01e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClauseData) data).mOwner;
            }

            @objid ("b9ce5713-7b28-4cca-af78-1e0e5590d133")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClauseData) data).mOwner = value;
            }

            @objid ("76fcac9c-d04d-4336-a2f1-13483f5e2a4f")
            @Override
            public SmDependency getSymetric() {
                return ConditionalNodeData.Metadata.OwnedClauseDep();
            }

        }

        @objid ("003b353a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BodySmDependency extends SmMultipleDependency {
            @objid ("6459a14f-4d85-4371-963f-8fa309116d22")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ClauseData)data).mBody != null)? ((ClauseData)data).mBody:SmMultipleDependency.EMPTY;
            }

            @objid ("dd4952a5-4382-41a0-9963-45f1a7606b08")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ClauseData) data).mBody = new ArrayList<>(initialCapacity);
                return ((ClauseData) data).mBody;
            }

            @objid ("3eefb35c-b29f-4906-9de9-740dea377f7b")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerClauseDep();
            }

        }

    }

}
