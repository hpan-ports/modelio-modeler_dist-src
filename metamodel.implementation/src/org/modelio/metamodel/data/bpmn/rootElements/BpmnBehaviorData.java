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
    @objid ("195e015a-b57d-4f0d-95c8-fd061a0c922f")
    @SmaMetaAssociation(metaName="RootElement", typeDataClass=BpmnRootElementData.class, min=0, max=-1, smAssociationClass=Metadata.RootElementSmDependency.class, component = true)
     List<SmObjectImpl> mRootElement = null;

    @objid ("3906de31-46fa-4666-af2e-244fe44cb0ba")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006b8f00-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c040d158-2f40-4798-a154-3f15d90e7e27")
        private static SmClass smClass = null;

        @objid ("db26c72e-a004-45be-99a6-34e9a006253c")
        private static SmDependency RootElementDep = null;

        @objid ("1dfdfeb0-5970-4680-9a5b-f186cb6a7b58")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBehaviorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d85b1c91-1e62-41bb-82fa-36119a554c81")
        public static SmDependency RootElementDep() {
            if (RootElementDep == null) {
            	RootElementDep = classof().getDependencyDef("RootElement");
            }
            return RootElementDep;
        }

        @objid ("889e4694-75cd-4253-ba9a-e83f77993ce2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5d00aaa3-0e70-4543-bef8-10310a91fc44")
        public static SmDependency getRootElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RootElementDep;
        }

        @objid ("006bced4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8350009e-4d13-4bfe-9832-cdca6c78a2f5")
            public ISmObjectData createData() {
                return new BpmnBehaviorData();
            }

            @objid ("e8d75888-8cd8-4f31-b73c-1e9014e0c8f1")
            public SmObjectImpl createImpl() {
                return new BpmnBehaviorImpl();
            }

        }

        @objid ("006c3086-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RootElementSmDependency extends SmMultipleDependency {
            @objid ("f1c0ae2d-ad5d-4374-98be-994f37fdb988")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBehaviorData)data).mRootElement != null)? ((BpmnBehaviorData)data).mRootElement:SmMultipleDependency.EMPTY;
            }

            @objid ("2fc75efe-25ed-4e8f-a8fb-c9f22268d35d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBehaviorData) data).mRootElement = new ArrayList<>(initialCapacity);
                return ((BpmnBehaviorData) data).mRootElement;
            }

            @objid ("bc3a4c72-21f1-4259-b679-251f41fa59df")
            @Override
            public SmDependency getSymetric() {
                return BpmnRootElementData.Metadata.OwnerDep();
            }

        }

    }

}
