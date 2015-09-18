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
    @objid ("e204a072-d8dc-455d-8333-ea98e81b8b59")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnBehaviorData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("7c670742-25e5-4163-816b-82aa0f8a9fc0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001b9b6c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("800c056a-3df4-436e-9f65-4dae407ac573")
        private static SmClass smClass = null;

        @objid ("263fd8cc-b17c-4a22-a185-86edff004bf3")
        private static SmDependency OwnerDep = null;

        @objid ("cc13195d-8f72-4e8e-a2c6-423d229b373f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnRootElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("38198fff-9886-428f-99a6-04972485b4ce")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("d664cfcd-cf62-4268-9878-748b9db41806")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("7a94ba8b-3e96-4797-9928-2b4fe4537bd8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001be7c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("39924504-d673-4be8-8d97-d7c9ed3507e0")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("8512f491-9a5b-4068-9b69-a8442fd4e540")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("001c4f26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("e93495ed-3036-4468-a64f-533ac1d0b4ff")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnRootElementData) data).mOwner;
            }

            @objid ("9502bed0-8dd0-4cd5-8cbc-ec5325a22c0d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnRootElementData) data).mOwner = value;
            }

            @objid ("e34a691a-9856-4542-9e54-c6f93d95e7ce")
            @Override
            public SmDependency getSymetric() {
                return BpmnBehaviorData.Metadata.RootElementDep();
            }

        }

    }

}
