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
    @objid ("bb7ec1c9-4fb8-4f90-b5df-e76712889975")
    @SmaMetaAssociation(metaName="RootElement", typeDataClass=BpmnRootElementData.class, min=0, max=-1, smAssociationClass=Metadata.RootElementSmDependency.class, component = true)
     List<SmObjectImpl> mRootElement = null;

    @objid ("8a043cb0-b152-4a48-ba24-340832c27875")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006b8f00-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("557f429a-0241-4d1d-83c0-fece8c760d6c")
        private static SmClass smClass = null;

        @objid ("d20fffa9-e51c-48ef-a4f4-9a7a9b1a3bc0")
        private static SmDependency RootElementDep = null;

        @objid ("a8ca302c-0a4b-49ef-980b-3979e8121de6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d94917bf-ffad-4cd6-8951-a4c35e318dc1")
        public static SmDependency RootElementDep() {
            if (RootElementDep == null) {
            	RootElementDep = classof().getDependencyDef("RootElement");
            }
            return RootElementDep;
        }

        @objid ("2b35ef75-763c-4595-b4d4-45f44cfdba67")
        public static SmDependency getRootElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RootElementDep;
        }

        @objid ("1756aeb0-c732-47fe-afee-9ec621c4c40d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("006bced4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0629551b-9f85-4729-b0f8-3cc5a364f923")
            public ISmObjectData createData() {
                return new BpmnBehaviorData();
            }

            @objid ("d45d2163-ac7b-484b-8379-262f68c74472")
            public SmObjectImpl createImpl() {
                return new BpmnBehaviorImpl();
            }

        }

        @objid ("006c3086-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RootElementSmDependency extends SmMultipleDependency {
            @objid ("0d3b23eb-b8d3-4d06-a982-55d03143d66b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBehaviorData)data).mRootElement != null)? ((BpmnBehaviorData)data).mRootElement:SmMultipleDependency.EMPTY;
            }

            @objid ("2b778daa-4566-4846-a68c-40416af59ddb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBehaviorData) data).mRootElement = new ArrayList<>(initialCapacity);
                return ((BpmnBehaviorData) data).mRootElement;
            }

            @objid ("8309e0c8-d2e1-449a-ab08-ed9136bd8a0d")
            @Override
            public SmDependency getSymetric() {
                return BpmnRootElementData.Metadata.OwnerDep();
            }

        }

    }

}
