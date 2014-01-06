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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBehaviorData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
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

@objid ("007b00b6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnRootElement.class, factory=BpmnRootElementData.Metadata.ObjectFactory.class)
public abstract class BpmnRootElementData extends BpmnBaseElementData {
    @objid ("c589189a-26c8-4268-bde6-15dde10b2598")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnBehaviorData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("442b28f3-f759-48ca-a1ff-e4ce7f211633")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001b9b6c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b5daa46a-5097-4053-be7f-0e6d488bc506")
        private static SmClass smClass = null;

        @objid ("2d43fac8-9413-47fd-8528-60a9d22b1a77")
        private static SmDependency OwnerDep = null;

        @objid ("ebfb8dd5-76b6-4f0e-abc6-c11a95cf27e6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnRootElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("faf25a0e-93f1-4143-b174-f76445be8fb7")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("2c011210-2f00-4ab6-9c2a-a598204f8352")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("4d652692-393f-4bdd-a2ca-7e6c09d1416c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001be7c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("38721205-5c45-4613-9a5c-c5797c9689f8")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("d513637f-368d-4c80-b43e-50b46cfc349a")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("001c4f26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("a275f453-b5be-4119-b11d-6c007596ce7d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnRootElementData) data).mOwner;
            }

            @objid ("37008936-4ebe-4d23-b6dd-0a5b277d5b5f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnRootElementData) data).mOwner = value;
            }

            @objid ("2bb9d0db-2358-4b27-a1f1-67d3fbcd40d3")
            @Override
            public SmDependency getSymetric() {
                return BpmnBehaviorData.Metadata.RootElementDep();
            }

        }

    }

}
