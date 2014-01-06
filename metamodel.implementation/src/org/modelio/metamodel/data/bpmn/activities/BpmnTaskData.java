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
    @objid ("98e3fa63-2db1-4392-a72a-92859c8cc0a9")
    @SmaMetaAttribute(metaName="IsGlobal", type=Boolean.class, smAttributeClass=Metadata.IsGlobalSmAttribute.class)
     Object mIsGlobal = false;

    @objid ("18abf68e-dc6e-43ad-b835-bbd8dff50ff4")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("429592fc-6d7e-4c0a-bd7e-f684f3ea35e4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00537ac8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("69c7a2a5-e5e0-4b6e-aeec-6adc7e74762a")
        private static SmClass smClass = null;

        @objid ("f54bc0ea-f11d-4e57-b96e-21184fab2b5c")
        private static SmAttribute IsGlobalAtt = null;

        @objid ("4271a00a-bc57-42e0-815c-2f1e1f6d70ba")
        private static SmDependency CallerDep = null;

        @objid ("7e967b80-eee7-43f6-a00c-213d5bbd0a4f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ad86c400-ad10-48d4-a149-d95159ddefad")
        public static SmAttribute IsGlobalAtt() {
            if (IsGlobalAtt == null) {
            	IsGlobalAtt = classof().getAttributeDef("IsGlobal");
            }
            return IsGlobalAtt;
        }

        @objid ("98ae94be-ca67-4471-b2fe-f1f96824d931")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("eb3f0389-d154-483b-9a95-250b308c38d8")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("91909701-5eb0-4b48-8b22-6f3c9f192203")
        public static SmAttribute getIsGlobalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsGlobalAtt;
        }

        @objid ("c0b623d4-e5e9-4d4d-8c76-34cfe6df2748")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0053bae2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a1df4cba-14b9-4721-9124-b76ffa8c004a")
            public ISmObjectData createData() {
                return new BpmnTaskData();
            }

            @objid ("d0a92f0f-ae60-4727-9e9b-d8db7742f6f3")
            public SmObjectImpl createImpl() {
                return new BpmnTaskImpl();
            }

        }

        @objid ("00541f32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsGlobalSmAttribute extends SmAttribute {
            @objid ("7c75e88c-67c6-46a2-b974-dd82cec9d2ee")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTaskData) data).mIsGlobal;
            }

            @objid ("08307886-9922-465b-aacc-055b05fcffc0")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTaskData) data).mIsGlobal = value;
            }

        }

        @objid ("005492c8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("a8536be6-bf9e-441c-bd94-e304ac67cfcf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnTaskData)data).mCaller != null)? ((BpmnTaskData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("a2647002-4055-4eec-abe3-aa0fc573ca54")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnTaskData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnTaskData) data).mCaller;
            }

            @objid ("021cbc13-16ff-489c-b625-d502b4269e00")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledGlobalTaskDep();
            }

        }

    }

}
