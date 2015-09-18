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
    @objid ("9e4af010-2f71-48b8-b56c-980436bc35e6")
    @SmaMetaAttribute(metaName="MustIsolate", type=Boolean.class, smAttributeClass=Metadata.MustIsolateSmAttribute.class)
     Object mMustIsolate = false;

    @objid ("284df6ab-fba5-41f2-9e96-0c4798602784")
    @SmaMetaAssociation(metaName="Body", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.BodySmDependency.class, component = true)
     List<SmObjectImpl> mBody = null;

    @objid ("54aa60b3-5669-4a44-ba8b-dd465d700cb8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00564460-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1f2b2d5f-a14c-4831-b77d-84846568cb0e")
        private static SmClass smClass = null;

        @objid ("cd489768-4365-4cc7-9284-e1988c171d84")
        private static SmAttribute MustIsolateAtt = null;

        @objid ("958196e7-2ee1-4ee6-ac15-9cc70130c800")
        private static SmDependency BodyDep = null;

        @objid ("18f44d0f-e471-4f36-89d9-a00b32ccde8f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StructuredActivityNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("79ef1a68-fd66-4dac-b397-a12d805a7032")
        public static SmAttribute MustIsolateAtt() {
            if (MustIsolateAtt == null) {
            	MustIsolateAtt = classof().getAttributeDef("MustIsolate");
            }
            return MustIsolateAtt;
        }

        @objid ("a9562367-dc03-451d-ac44-5de095104e36")
        public static SmDependency BodyDep() {
            if (BodyDep == null) {
            	BodyDep = classof().getDependencyDef("Body");
            }
            return BodyDep;
        }

        @objid ("d564e49d-e48b-4c11-bf16-5a53329c8b91")
        public static SmDependency getBodyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyDep;
        }

        @objid ("74b4b386-58df-4725-a324-79f01976e689")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c05e8b20-e9db-473f-979d-a9792c2539b7")
        public static SmAttribute getMustIsolateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MustIsolateAtt;
        }

        @objid ("0056863c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0529b881-7b40-464d-81cf-2c8ec2e03e42")
            public ISmObjectData createData() {
                return new StructuredActivityNodeData();
            }

            @objid ("0ef8b0af-871a-490a-8578-34bda8b6a1cb")
            public SmObjectImpl createImpl() {
                return new StructuredActivityNodeImpl();
            }

        }

        @objid ("0056e8fc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MustIsolateSmAttribute extends SmAttribute {
            @objid ("98a5368a-34fa-4a4f-ab4f-a9916947a1d4")
            public Object getValue(ISmObjectData data) {
                return ((StructuredActivityNodeData) data).mMustIsolate;
            }

            @objid ("9c7f8514-5109-49aa-92c2-1988c9beb656")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuredActivityNodeData) data).mMustIsolate = value;
            }

        }

        @objid ("00574c66-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmDependency extends SmMultipleDependency {
            @objid ("9e0c06b4-4997-49e2-bd7c-18fdce797f5b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StructuredActivityNodeData)data).mBody != null)? ((StructuredActivityNodeData)data).mBody:SmMultipleDependency.EMPTY;
            }

            @objid ("aec93b5e-2b4e-4037-b476-5ff58dcf6941")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StructuredActivityNodeData) data).mBody = new ArrayList<>(initialCapacity);
                return ((StructuredActivityNodeData) data).mBody;
            }

            @objid ("db6f1f03-5380-47fc-b764-76a884d69559")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerNodeDep();
            }

        }

    }

}
