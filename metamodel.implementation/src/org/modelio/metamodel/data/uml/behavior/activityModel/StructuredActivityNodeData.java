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
    @objid ("f5811e62-556e-4fd5-8146-a819414c5177")
    @SmaMetaAttribute(metaName="MustIsolate", type=Boolean.class, smAttributeClass=Metadata.MustIsolateSmAttribute.class)
     Object mMustIsolate = false;

    @objid ("8aaccbae-7783-43b6-a6dc-2feb826ee6cc")
    @SmaMetaAssociation(metaName="Body", typeDataClass=ActivityNodeData.class, min=0, max=-1, smAssociationClass=Metadata.BodySmDependency.class, component = true)
     List<SmObjectImpl> mBody = null;

    @objid ("32012646-c8b6-4a50-a513-e37d2ae746e1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00564460-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9c04f218-9481-4bb1-9e25-007414be911c")
        private static SmClass smClass = null;

        @objid ("f3b0033d-2aec-4d13-a24f-6db69dd3e2cb")
        private static SmAttribute MustIsolateAtt = null;

        @objid ("db9ab359-e780-44d7-a98d-15569a3345a1")
        private static SmDependency BodyDep = null;

        @objid ("11e865e8-4e2f-4454-bc06-e2592552ecd6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StructuredActivityNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3b7dce3b-d7ee-4f88-abbb-f466011c7cde")
        public static SmAttribute MustIsolateAtt() {
            if (MustIsolateAtt == null) {
            	MustIsolateAtt = classof().getAttributeDef("MustIsolate");
            }
            return MustIsolateAtt;
        }

        @objid ("e29cc296-6044-48dd-949c-56b6b415dd50")
        public static SmDependency BodyDep() {
            if (BodyDep == null) {
            	BodyDep = classof().getDependencyDef("Body");
            }
            return BodyDep;
        }

        @objid ("382d2103-6b50-4962-a182-8da05f53c9a4")
        public static SmDependency getBodyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyDep;
        }

        @objid ("c4fe05ae-1eb1-42fb-abd1-c8fe31ab7976")
        public static SmAttribute getMustIsolateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MustIsolateAtt;
        }

        @objid ("61114764-a6fc-45a5-9d97-6bf1850d4024")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0056863c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a4e07187-73c3-43f3-8516-eb5b99c06f10")
            public ISmObjectData createData() {
                return new StructuredActivityNodeData();
            }

            @objid ("c760318c-da04-4e48-91d0-1818bb9ecf19")
            public SmObjectImpl createImpl() {
                return new StructuredActivityNodeImpl();
            }

        }

        @objid ("0056e8fc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MustIsolateSmAttribute extends SmAttribute {
            @objid ("a2f15ec6-1375-4b7a-b447-8e6e6d4a1ea5")
            public Object getValue(ISmObjectData data) {
                return ((StructuredActivityNodeData) data).mMustIsolate;
            }

            @objid ("66098696-f997-435e-9f8b-ca62236533f7")
            public void setValue(ISmObjectData data, Object value) {
                ((StructuredActivityNodeData) data).mMustIsolate = value;
            }

        }

        @objid ("00574c66-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmDependency extends SmMultipleDependency {
            @objid ("15e4834f-de1c-4009-bf8a-253781be43b8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StructuredActivityNodeData)data).mBody != null)? ((StructuredActivityNodeData)data).mBody:SmMultipleDependency.EMPTY;
            }

            @objid ("1faa9ba4-0848-42f4-843c-bbdfb050b151")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StructuredActivityNodeData) data).mBody = new ArrayList<>(initialCapacity);
                return ((StructuredActivityNodeData) data).mBody;
            }

            @objid ("6d11df68-967f-4e85-a4a2-db2ee9663e09")
            @Override
            public SmDependency getSymetric() {
                return ActivityNodeData.Metadata.OwnerNodeDep();
            }

        }

    }

}
