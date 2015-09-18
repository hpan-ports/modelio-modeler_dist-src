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
import org.modelio.metamodel.data.uml.behavior.activityModel.ClauseData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ConditionalNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
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

@objid ("002db2e8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ConditionalNode.class, factory=ConditionalNodeData.Metadata.ObjectFactory.class)
public class ConditionalNodeData extends StructuredActivityNodeData {
    @objid ("e95cc386-eb26-4ed0-9614-260244629816")
    @SmaMetaAttribute(metaName="IsDeterminate", type=Boolean.class, smAttributeClass=Metadata.IsDeterminateSmAttribute.class)
     Object mIsDeterminate = false;

    @objid ("a8a03ae8-cf60-4754-a31b-4bba77c9affa")
    @SmaMetaAttribute(metaName="IsAssured", type=Boolean.class, smAttributeClass=Metadata.IsAssuredSmAttribute.class)
     Object mIsAssured = false;

    @objid ("0ae09e52-5949-41cd-b48b-7b7e786bbe28")
    @SmaMetaAssociation(metaName="OwnedClause", typeDataClass=ClauseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedClauseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedClause = null;

    @objid ("a7357e40-15fd-4c77-a616-80b6328f9021")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0003d1a8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d3d32b90-6ab8-4e9e-b72b-d320da828dcd")
        private static SmClass smClass = null;

        @objid ("355e5e38-8362-467e-a48f-9f613154ab81")
        private static SmAttribute IsDeterminateAtt = null;

        @objid ("94af0087-7e41-4baa-8606-4f12ad01243e")
        private static SmAttribute IsAssuredAtt = null;

        @objid ("dc0f7575-c6e4-42fd-8f4d-a794e282304c")
        private static SmDependency OwnedClauseDep = null;

        @objid ("101d9943-9a54-4dc0-8019-5603667df1a8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConditionalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("85a26737-cff9-4372-a3af-8b1c0a80476e")
        public static SmAttribute IsDeterminateAtt() {
            if (IsDeterminateAtt == null) {
            	IsDeterminateAtt = classof().getAttributeDef("IsDeterminate");
            }
            return IsDeterminateAtt;
        }

        @objid ("e97037dd-0a8b-4fc0-8bf4-fb9b632f904c")
        public static SmAttribute IsAssuredAtt() {
            if (IsAssuredAtt == null) {
            	IsAssuredAtt = classof().getAttributeDef("IsAssured");
            }
            return IsAssuredAtt;
        }

        @objid ("2d12e220-fe9f-492d-961e-13d512eec186")
        public static SmDependency OwnedClauseDep() {
            if (OwnedClauseDep == null) {
            	OwnedClauseDep = classof().getDependencyDef("OwnedClause");
            }
            return OwnedClauseDep;
        }

        @objid ("8319dcbb-df88-4a59-b1a4-c757002812cf")
        public static SmAttribute getIsDeterminateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDeterminateAtt;
        }

        @objid ("b1c2987a-b084-435d-a38c-000776b2a97f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3c3e5b59-2e01-4cc1-b131-6c2442f53d98")
        public static SmAttribute getIsAssuredAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAssuredAtt;
        }

        @objid ("1664fe09-9361-4952-b937-b7281ffaa5d4")
        public static SmDependency getOwnedClauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedClauseDep;
        }

        @objid ("0004248c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("814361df-3b4c-4cbf-a87b-5c2cafeac711")
            public ISmObjectData createData() {
                return new ConditionalNodeData();
            }

            @objid ("c81a99a1-17e6-47fd-97bf-a9bc378b726a")
            public SmObjectImpl createImpl() {
                return new ConditionalNodeImpl();
            }

        }

        @objid ("0004897c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsDeterminateSmAttribute extends SmAttribute {
            @objid ("7bce00fd-f109-49be-ae97-b82eb4dd8ea4")
            public Object getValue(ISmObjectData data) {
                return ((ConditionalNodeData) data).mIsDeterminate;
            }

            @objid ("5f27ce52-2047-464c-9141-5549b80368d9")
            public void setValue(ISmObjectData data, Object value) {
                ((ConditionalNodeData) data).mIsDeterminate = value;
            }

        }

        @objid ("0004f786-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsAssuredSmAttribute extends SmAttribute {
            @objid ("fc77b0dd-67c5-41f0-af13-19a6b5e5fdf5")
            public Object getValue(ISmObjectData data) {
                return ((ConditionalNodeData) data).mIsAssured;
            }

            @objid ("5738aff4-0cdd-4d00-8d1d-651a7531ea20")
            public void setValue(ISmObjectData data, Object value) {
                ((ConditionalNodeData) data).mIsAssured = value;
            }

        }

        @objid ("00055d7a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedClauseSmDependency extends SmMultipleDependency {
            @objid ("4049ea83-fa8b-4630-9c88-900f0ed4a54d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConditionalNodeData)data).mOwnedClause != null)? ((ConditionalNodeData)data).mOwnedClause:SmMultipleDependency.EMPTY;
            }

            @objid ("64a061dd-1219-4cde-8624-d8f581519420")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConditionalNodeData) data).mOwnedClause = new ArrayList<>(initialCapacity);
                return ((ConditionalNodeData) data).mOwnedClause;
            }

            @objid ("eae462b7-bc6a-4f05-b8fe-3c66289ae58f")
            @Override
            public SmDependency getSymetric() {
                return ClauseData.Metadata.OwnerDep();
            }

        }

    }

}
