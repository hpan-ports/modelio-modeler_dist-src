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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.impl.bpmn.events.BpmnCompensateEventDefinitionImpl;
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

@objid ("0089ac74-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCompensateEventDefinition.class, factory=BpmnCompensateEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnCompensateEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("1b1dc373-bc52-430d-aab2-14689f506031")
    @SmaMetaAssociation(metaName="ActivityRef", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.ActivityRefSmDependency.class, partof = true)
     SmObjectImpl mActivityRef;

    @objid ("f42150da-154b-4e26-9369-d643dd0c8bd6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008e31a4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c5d5c889-3ecd-4821-9165-bd1268660bc7")
        private static SmClass smClass = null;

        @objid ("8431fdfd-e758-4047-a77f-7f6479a546b5")
        private static SmDependency ActivityRefDep = null;

        @objid ("8a862597-1b74-457b-a846-fafe5b716764")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCompensateEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ab0dcade-b38a-4bb6-9c94-818d29e52b84")
        public static SmDependency ActivityRefDep() {
            if (ActivityRefDep == null) {
            	ActivityRefDep = classof().getDependencyDef("ActivityRef");
            }
            return ActivityRefDep;
        }

        @objid ("e6feced3-3e28-439e-9e5c-e70eb6af190a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8c684569-6354-40db-a508-017ad30126e4")
        public static SmDependency getActivityRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActivityRefDep;
        }

        @objid ("008e74e8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1fb322cb-e904-4cdf-b406-f916fba33c43")
            public ISmObjectData createData() {
                return new BpmnCompensateEventDefinitionData();
            }

            @objid ("8742a7f1-ad41-4c63-b895-0a3d8308ea42")
            public SmObjectImpl createImpl() {
                return new BpmnCompensateEventDefinitionImpl();
            }

        }

        @objid ("008edb7c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActivityRefSmDependency extends SmSingleDependency {
            @objid ("a069be18-0d19-41ec-9e84-b3cba8ddfe0c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCompensateEventDefinitionData) data).mActivityRef;
            }

            @objid ("92ee5bfd-85b6-48e6-9f63-40b456ca04b5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCompensateEventDefinitionData) data).mActivityRef = value;
            }

            @objid ("bd54323d-b186-4824-b1e6-382ce1e70351")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.CompensateEventDefinitionsDep();
            }

        }

    }

}
