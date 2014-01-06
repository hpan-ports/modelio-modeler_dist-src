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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBehaviorImpl;
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

@objid ("007b8856-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnBehavior.class, factory=BpmnBehaviorData.Metadata.ObjectFactory.class, cmsnode=true)
public class BpmnBehaviorData extends BehaviorData {
    @objid ("c24dbdd8-df6d-49fe-b7c3-9efec57449ef")
    @SmaMetaAssociation(metaName="RootElement", typeDataClass=BpmnRootElementData.class, min=0, max=-1, smAssociationClass=Metadata.RootElementSmDependency.class, component = true)
     List<SmObjectImpl> mRootElement = null;

    @objid ("84df8a9a-39e7-4450-af70-f9000d34078f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006b8f00-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d382fe0b-d203-477d-b4c6-3ed70a9d527f")
        private static SmClass smClass = null;

        @objid ("96519184-95e1-4280-b013-b1a565b4ec21")
        private static SmDependency RootElementDep = null;

        @objid ("a68812bf-91bf-4cc8-9699-237dad657658")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3783de95-b183-4475-95c2-9e09d2b9a3a6")
        public static SmDependency RootElementDep() {
            if (RootElementDep == null) {
            	RootElementDep = classof().getDependencyDef("RootElement");
            }
            return RootElementDep;
        }

        @objid ("ca5330a0-337e-4f8e-bacf-dd6c16968b81")
        public static SmDependency getRootElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RootElementDep;
        }

        @objid ("310ca721-affb-425a-bf03-7a353607d5cb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("006bced4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("89ec7e22-84b2-41e5-ba6c-cd4cb3802ed2")
            public ISmObjectData createData() {
                return new BpmnBehaviorData();
            }

            @objid ("73cc8653-b391-4a0d-b2f9-2ff7152e121e")
            public SmObjectImpl createImpl() {
                return new BpmnBehaviorImpl();
            }

        }

        @objid ("006c3086-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RootElementSmDependency extends SmMultipleDependency {
            @objid ("b6c8b433-4d64-4238-80c8-7e38edd2b748")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBehaviorData)data).mRootElement != null)? ((BpmnBehaviorData)data).mRootElement:SmMultipleDependency.EMPTY;
            }

            @objid ("45d33f4f-a195-47cd-85df-6c40334d1004")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBehaviorData) data).mRootElement = new ArrayList<>(initialCapacity);
                return ((BpmnBehaviorData) data).mRootElement;
            }

            @objid ("dbd8a992-5350-4cb2-90e2-39a0391fee86")
            @Override
            public SmDependency getSymetric() {
                return BpmnRootElementData.Metadata.OwnerDep();
            }

        }

    }

}
