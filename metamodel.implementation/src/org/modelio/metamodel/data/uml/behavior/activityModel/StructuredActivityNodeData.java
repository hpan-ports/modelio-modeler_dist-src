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
import org.modelio.metamodel.impl.uml.behavior.activityModel.StructuredActivityNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
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

@objid ("003e80d2-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=StructuredActivityNode.class, factory=StructuredActivityNodeData.Metadata.ObjectFactory.class)
public class StructuredActivityNodeData extends ActivityActionData {
    @objid ("c8dcc259-cef2-4ec7-bfc9-decbe64c6fb8")
    @SmaMetaAttribute(metaName="MustIsolate", type=Boolean.class, smAttributeClass=Metadata.MustIsolateSmAttribute.class)
     Object mMustIsolate = false;

    @objid ("e5bfa63f-2498-4cdb-91dc-7200598fc440")
    @SmaMetaAssociation(metaName="Body", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.BodySmDependency.class, component = true)
     List<SmObjectImpl> mBody = null;

    @objid ("a3c0b3ea-80dd-4dd4-8f98-6ac0081dcb8d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00564460-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f3116d59-3078-4eea-8834-0bc56ae19aae")
        private static SmClass smClass = null;

        @objid ("b5e145df-e4ac-4bf3-bf75-19a6a4595f5d")
        private static SmAttribute MustIsolateAtt = null;

        @objid ("659eccc8-69fe-465e-8beb-aa909ec56c21")
        private static SmDependency BodyDep = null;

        @objid ("c150c195-5794-420d-a778-934a48b77f4f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StructuredActivityNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("abe00cb6-5cef-4572-a7dd-409e7222672f")
        public static SmAttribute MustIsolateAtt() {
            if (MustIsolateAtt == null) {
            	MustIsolateAtt = classof().getAttributeDef("MustIsolate");
            }
            return MustIsolateAtt;
        }

        @objid ("b5c2cfb0-d660-4fd1-90cb-28d6d5305fd9")
        public static SmDependency BodyDep() {
            if (BodyDep == null) {
            	BodyDep = classof().getDependencyDef("Body");
            }
            return BodyDep;
        }

        @objid ("1765fbbc-02aa-4b96-bd40-87f6a601e9f3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1b861249-3c24-42f6-9b51-4715845cacfd")
        public static SmAttribute getMustIsolateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MustIsolateAtt;
        }

        @objid ("00ca00b8-4c74-4466-8cab-91ccc4fff61b")
        public static SmDependency getBodyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyDep;
        }

        @objid ("0056863c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("db5dbdf7-cd10-41c4-8265-ab639360f1d3")
            public ISmObjectData createData() {
                return new StructuredActivityNodeData();
            }

            @objid ("ead68441-98ff-49ec-bb45-d4ade2a3bb53")
            public SmObjectImpl createImpl() {
                return new StructuredActivityNodeImpl();
            }

        }

        @objid ("0056e8fc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MustIsolateSmAttribute extends SmAttribute {
            @objid ("733f84e6-bd39-4c0f-afb0-860590f220c3")
            public Object getValue(ISmObjectData data) {
                return ((StructuredActivityNodeData) data).mMustIsolate;
            }

            @objid ("57868c53-6ff6-42d4-8686-3640044feba7")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuredActivityNodeData) data).mMustIsolate = value;
            }

        }

        @objid ("00574c66-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmDependency extends SmMultipleDependency {
            @objid ("0384b382-bc86-4577-b1b2-a006867d8745")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StructuredActivityNodeData)data).mBody != null)? ((StructuredActivityNodeData)data).mBody:SmMultipleDependency.EMPTY;
            }

            @objid ("f476f600-a46d-4c2f-b5e4-3c3d2077c37e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StructuredActivityNodeData) data).mBody = new ArrayList<>(initialCapacity);
                return ((StructuredActivityNodeData) data).mBody;
            }

            @objid ("d4431e2e-a9ed-4075-a0bb-322312755312")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerNodeDep();
            }

        }

    }

}
