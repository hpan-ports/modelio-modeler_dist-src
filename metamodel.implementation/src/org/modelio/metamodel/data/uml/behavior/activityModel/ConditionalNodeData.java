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
    @objid ("e17a727a-0bbb-428e-8e1a-3a3f120d5873")
    @SmaMetaAttribute(metaName="IsDeterminate", type=Boolean.class, smAttributeClass=Metadata.IsDeterminateSmAttribute.class)
     Object mIsDeterminate = false;

    @objid ("566aa28f-242d-479a-b2e0-c8b00a07cbcb")
    @SmaMetaAttribute(metaName="IsAssured", type=Boolean.class, smAttributeClass=Metadata.IsAssuredSmAttribute.class)
     Object mIsAssured = false;

    @objid ("3b0f3d71-ee09-414f-835e-52b4b9f6684e")
    @SmaMetaAssociation(metaName="OwnedClause", typeDataClass=ClauseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedClauseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedClause = null;

    @objid ("9b6060e4-f52f-4092-b247-a05281c1bc45")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0003d1a8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b33c6ff0-09d0-4f67-b7f2-e9df9166f4a3")
        private static SmClass smClass = null;

        @objid ("f0c37c10-ca7d-4105-be14-c31d4929595e")
        private static SmAttribute IsDeterminateAtt = null;

        @objid ("503a0e7f-aeb1-4fcd-b4fd-f2ff55e9b0bf")
        private static SmAttribute IsAssuredAtt = null;

        @objid ("edac5deb-1d3e-440b-b3bc-683e3d9034fc")
        private static SmDependency OwnedClauseDep = null;

        @objid ("0c8a19c7-6b85-4fee-9dad-3681056c45c9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConditionalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("93b470a7-9e6a-4c00-bd60-56084fd6bae3")
        public static SmAttribute IsDeterminateAtt() {
            if (IsDeterminateAtt == null) {
            	IsDeterminateAtt = classof().getAttributeDef("IsDeterminate");
            }
            return IsDeterminateAtt;
        }

        @objid ("89cfa0a8-3999-48d1-a85a-167095171cbd")
        public static SmAttribute IsAssuredAtt() {
            if (IsAssuredAtt == null) {
            	IsAssuredAtt = classof().getAttributeDef("IsAssured");
            }
            return IsAssuredAtt;
        }

        @objid ("a0feb2ba-ee6e-4cd6-9392-36eaf6bce691")
        public static SmDependency OwnedClauseDep() {
            if (OwnedClauseDep == null) {
            	OwnedClauseDep = classof().getDependencyDef("OwnedClause");
            }
            return OwnedClauseDep;
        }

        @objid ("91f05a5e-0335-469e-9792-4d3382b7443b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c50242d6-62c5-42c6-b556-3330bf328f1e")
        public static SmAttribute getIsAssuredAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAssuredAtt;
        }

        @objid ("bf93c054-05b5-43de-87a6-e6ee168e2299")
        public static SmDependency getOwnedClauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedClauseDep;
        }

        @objid ("a1122398-d572-4d7e-b383-72eacb3f7dd4")
        public static SmAttribute getIsDeterminateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDeterminateAtt;
        }

        @objid ("0004248c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("562373ab-1b48-45d7-8a6d-049b76133e9c")
            public ISmObjectData createData() {
                return new ConditionalNodeData();
            }

            @objid ("6b105fb6-a7e3-4c8b-bcaa-c24e11ed5189")
            public SmObjectImpl createImpl() {
                return new ConditionalNodeImpl();
            }

        }

        @objid ("0004897c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsDeterminateSmAttribute extends SmAttribute {
            @objid ("2772fa00-efb8-4f37-9a08-e41270a838d8")
            public Object getValue(ISmObjectData data) {
                return ((ConditionalNodeData) data).mIsDeterminate;
            }

            @objid ("83f5ddf9-dbfa-4dbe-af0b-8bf0d540447e")
            public void setValue(ISmObjectData data, Object value) {
                ((ConditionalNodeData) data).mIsDeterminate = value;
            }

        }

        @objid ("0004f786-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsAssuredSmAttribute extends SmAttribute {
            @objid ("9da09010-3300-4f09-81de-3e96c9d7303f")
            public Object getValue(ISmObjectData data) {
                return ((ConditionalNodeData) data).mIsAssured;
            }

            @objid ("8b9732bd-ce27-473a-94f6-2b43b8d516c9")
            public void setValue(ISmObjectData data, Object value) {
                ((ConditionalNodeData) data).mIsAssured = value;
            }

        }

        @objid ("00055d7a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedClauseSmDependency extends SmMultipleDependency {
            @objid ("d19985b7-bc77-4d97-887f-b7bc0b374b34")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConditionalNodeData)data).mOwnedClause != null)? ((ConditionalNodeData)data).mOwnedClause:SmMultipleDependency.EMPTY;
            }

            @objid ("471f3b3a-9ee8-45a1-b4a3-f8237d9aa5e8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConditionalNodeData) data).mOwnedClause = new ArrayList<>(initialCapacity);
                return ((ConditionalNodeData) data).mOwnedClause;
            }

            @objid ("fead89e2-198e-46b3-85bf-d0773d667a01")
            @Override
            public SmDependency getSymetric() {
                return ClauseData.Metadata.OwnerDep();
            }

        }

    }

}
