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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.data.bpmn.activities.BpmnCallActivityData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTaskImpl;
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

@objid ("00852208-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnTask.class, factory=BpmnTaskData.Metadata.ObjectFactory.class)
public class BpmnTaskData extends BpmnActivityData {
    @objid ("71a9568b-2aac-4bcc-b8b7-021815691258")
    @SmaMetaAttribute(metaName="IsGlobal", type=Boolean.class, smAttributeClass=Metadata.IsGlobalSmAttribute.class)
     Object mIsGlobal = false;

    @objid ("d4526dd1-fb6c-49ce-bda7-73eb46efdd15")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("a062a193-ec32-408d-ad6f-62a5b2397064")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00537ac8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ced39251-f08b-493e-ae41-355db4007046")
        private static SmClass smClass = null;

        @objid ("59f91b01-5e26-484a-b7bd-8074ab9cbc5d")
        private static SmAttribute IsGlobalAtt = null;

        @objid ("973d0da5-919f-467d-a25f-06492ed2c8e9")
        private static SmDependency CallerDep = null;

        @objid ("792706b1-baf2-4e88-9127-14b274faceef")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5bef066c-cacf-4978-854d-54d1b357c096")
        public static SmAttribute IsGlobalAtt() {
            if (IsGlobalAtt == null) {
            	IsGlobalAtt = classof().getAttributeDef("IsGlobal");
            }
            return IsGlobalAtt;
        }

        @objid ("89c9e9b8-aa5f-43b8-9b0a-416f680d8ada")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("527a4ab3-1a9f-442a-9a0e-7fe430ee1c91")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("747a9e06-89ca-4fc1-bf9e-fdfdb64127b0")
        public static SmAttribute getIsGlobalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsGlobalAtt;
        }

        @objid ("e8198e4a-176d-4c4c-adaa-13944c91551b")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("0053bae2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("432cff95-053f-4e8d-983e-5f29596c3dc5")
            public ISmObjectData createData() {
                return new BpmnTaskData();
            }

            @objid ("ec947eea-775a-4d6c-a0a0-9e4c45e6759e")
            public SmObjectImpl createImpl() {
                return new BpmnTaskImpl();
            }

        }

        @objid ("00541f32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsGlobalSmAttribute extends SmAttribute {
            @objid ("e67ff84e-273c-48f1-9329-4891c47534db")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTaskData) data).mIsGlobal;
            }

            @objid ("9c162b9c-2dcf-4aa2-8fd8-4fd73fe9e1df")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTaskData) data).mIsGlobal = value;
            }

        }

        @objid ("005492c8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("b33ab163-6bd6-4ceb-9725-68f241a10c37")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnTaskData)data).mCaller != null)? ((BpmnTaskData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("d5b3f164-210c-4b29-99d3-0d68a1a3dc72")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnTaskData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnTaskData) data).mCaller;
            }

            @objid ("7435d03a-9370-443e-bcd4-cd09c7d47ce8")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledGlobalTaskDep();
            }

        }

    }

}
