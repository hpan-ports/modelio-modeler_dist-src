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
    @objid ("c033519f-c517-4e5d-9df3-729357859bb4")
    @SmaMetaAttribute(metaName="IsGlobal", type=Boolean.class, smAttributeClass=Metadata.IsGlobalSmAttribute.class)
     Object mIsGlobal = false;

    @objid ("ccdd0f03-9abd-4851-a412-48c5ba49a411")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("4527cab4-bf90-4da0-bf34-6019666c3264")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00537ac8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("381aad72-6460-4ea0-b17b-b9e71224fca6")
        private static SmClass smClass = null;

        @objid ("133010e8-b208-41a4-9205-142d718ed150")
        private static SmAttribute IsGlobalAtt = null;

        @objid ("e304cdec-2fc0-4560-8aad-6cfda65c5d94")
        private static SmDependency CallerDep = null;

        @objid ("1d07a48b-c50a-4fc8-9c97-28befb38ce2e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bd6f902c-b656-42e8-a7f6-dff969c46d1a")
        public static SmAttribute IsGlobalAtt() {
            if (IsGlobalAtt == null) {
            	IsGlobalAtt = classof().getAttributeDef("IsGlobal");
            }
            return IsGlobalAtt;
        }

        @objid ("426a2b6a-ef6c-4a28-bd7a-bf758699b9f2")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("f02c267c-3e67-4d10-876b-9f4b4f20ce54")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("c8ae1c6c-e3ce-436d-9bfa-30e3743d31c1")
        public static SmAttribute getIsGlobalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsGlobalAtt;
        }

        @objid ("7f373c16-967b-43c1-92e6-61b2cbd71853")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0053bae2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0ad55e5b-c4dd-43df-9dc8-ce023b9ec22e")
            public ISmObjectData createData() {
                return new BpmnTaskData();
            }

            @objid ("b3d676d8-cef8-4348-ba62-53fdd7fe6827")
            public SmObjectImpl createImpl() {
                return new BpmnTaskImpl();
            }

        }

        @objid ("00541f32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsGlobalSmAttribute extends SmAttribute {
            @objid ("825c5ae3-4bad-4c6a-8151-12319e501c66")
            public Object getValue(ISmObjectData data) {
                return ((BpmnTaskData) data).mIsGlobal;
            }

            @objid ("507c7b61-6cf2-4cdf-8495-2bece3ad8df4")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnTaskData) data).mIsGlobal = value;
            }

        }

        @objid ("005492c8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("9078bfdd-1835-450c-9b01-531ba36e7e56")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnTaskData)data).mCaller != null)? ((BpmnTaskData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("42f99e3e-d132-4a55-a89a-7225bc3c7880")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnTaskData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnTaskData) data).mCaller;
            }

            @objid ("44502cf7-2ef0-489a-a9ac-5dac054e4ef0")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledGlobalTaskDep();
            }

        }

    }

}
