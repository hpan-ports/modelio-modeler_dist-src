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
    @objid ("056e4a99-6208-44d3-969e-57c96aa88ab4")
    @SmaMetaAttribute(metaName="IsDeterminate", type=Boolean.class, smAttributeClass=Metadata.IsDeterminateSmAttribute.class)
     Object mIsDeterminate = false;

    @objid ("1e966c1a-4353-4d73-b942-ff649e96f1e8")
    @SmaMetaAttribute(metaName="IsAssured", type=Boolean.class, smAttributeClass=Metadata.IsAssuredSmAttribute.class)
     Object mIsAssured = false;

    @objid ("574a88af-2cb8-4159-a14c-91e00a7bb8ea")
    @SmaMetaAssociation(metaName="OwnedClause", typeDataClass=ClauseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedClauseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedClause = null;

    @objid ("140756d8-feff-471f-85e1-a1a4106d6def")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0003d1a8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f73ad6b6-aa02-41d7-8b2e-a5d0073c1fcf")
        private static SmClass smClass = null;

        @objid ("b35bb02e-92e3-4c3e-b20a-9b35f1f728ce")
        private static SmAttribute IsDeterminateAtt = null;

        @objid ("4fd6ab9a-3e70-4655-8ce9-15d542c638b2")
        private static SmAttribute IsAssuredAtt = null;

        @objid ("8c67032c-3b81-4136-a748-868c81f2d90b")
        private static SmDependency OwnedClauseDep = null;

        @objid ("393da900-2209-4b10-972c-7f790c33d9a9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConditionalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("67b4c1a4-3284-478d-9034-35c7ce1c9427")
        public static SmAttribute IsDeterminateAtt() {
            if (IsDeterminateAtt == null) {
            	IsDeterminateAtt = classof().getAttributeDef("IsDeterminate");
            }
            return IsDeterminateAtt;
        }

        @objid ("9ab63d8f-5121-4128-b27d-dc1acb123acc")
        public static SmAttribute IsAssuredAtt() {
            if (IsAssuredAtt == null) {
            	IsAssuredAtt = classof().getAttributeDef("IsAssured");
            }
            return IsAssuredAtt;
        }

        @objid ("cf3a0af4-012b-4dd4-89b2-00aea38c0eeb")
        public static SmDependency OwnedClauseDep() {
            if (OwnedClauseDep == null) {
            	OwnedClauseDep = classof().getDependencyDef("OwnedClause");
            }
            return OwnedClauseDep;
        }

        @objid ("7ce75167-0da3-452b-b4fb-0bcf712d5e2c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("add9904c-a30d-4d10-812b-e117bea746a7")
        public static SmAttribute getIsAssuredAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAssuredAtt;
        }

        @objid ("187b4fc0-5a4e-4ee6-8c18-20352e763666")
        public static SmDependency getOwnedClauseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedClauseDep;
        }

        @objid ("9aa89ed3-866e-48b1-a173-5ccc2bc3f7fc")
        public static SmAttribute getIsDeterminateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsDeterminateAtt;
        }

        @objid ("0004248c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f696f00b-9bcd-420e-9c1b-86fc61fa7f57")
            public ISmObjectData createData() {
                return new ConditionalNodeData();
            }

            @objid ("2509099b-759a-4a5e-8f2b-874061045a09")
            public SmObjectImpl createImpl() {
                return new ConditionalNodeImpl();
            }

        }

        @objid ("0004897c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsDeterminateSmAttribute extends SmAttribute {
            @objid ("dde55044-20ab-423a-9006-336cdb4930bd")
            public Object getValue(ISmObjectData data) {
                return ((ConditionalNodeData) data).mIsDeterminate;
            }

            @objid ("c50b03e3-b81c-4068-afd0-3705cc4bf8f4")
            public void setValue(ISmObjectData data, Object value) {
                ((ConditionalNodeData) data).mIsDeterminate = value;
            }

        }

        @objid ("0004f786-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsAssuredSmAttribute extends SmAttribute {
            @objid ("bbac542a-ef55-44aa-ac00-6b1772c12843")
            public Object getValue(ISmObjectData data) {
                return ((ConditionalNodeData) data).mIsAssured;
            }

            @objid ("fcec87dc-6546-4c2f-94dd-efc1f5813dc0")
            public void setValue(ISmObjectData data, Object value) {
                ((ConditionalNodeData) data).mIsAssured = value;
            }

        }

        @objid ("00055d7a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedClauseSmDependency extends SmMultipleDependency {
            @objid ("3860a828-248d-49d0-903d-d8ea27fcbc98")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConditionalNodeData)data).mOwnedClause != null)? ((ConditionalNodeData)data).mOwnedClause:SmMultipleDependency.EMPTY;
            }

            @objid ("995fa312-98ea-4c63-a30f-101c1efa2760")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConditionalNodeData) data).mOwnedClause = new ArrayList<>(initialCapacity);
                return ((ConditionalNodeData) data).mOwnedClause;
            }

            @objid ("ecded0f5-82c7-4ff6-9717-90ae7d0eeb40")
            @Override
            public SmDependency getSymetric() {
                return ClauseData.Metadata.OwnerDep();
            }

        }

    }

}
