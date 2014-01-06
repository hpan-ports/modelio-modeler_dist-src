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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnBusinessRuleTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnBusinessRuleTaskImpl;
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

@objid ("007ec354-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnBusinessRuleTask.class, factory=BpmnBusinessRuleTaskData.Metadata.ObjectFactory.class)
public class BpmnBusinessRuleTaskData extends BpmnTaskData {
    @objid ("98b17c5d-8bff-4c60-b2fa-dcaf4d52683c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00218e82-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f724558b-b138-4f05-b243-ea0c26729ad8")
        private static SmClass smClass = null;

        @objid ("1d55e570-2cb6-4dd1-96b9-588e4be864cb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBusinessRuleTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3816a1f5-6179-4668-a538-7ccc7f33f5c9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0022b5dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f677ea0d-31ef-463c-9739-4567ac29ab34")
            public ISmObjectData createData() {
                return new BpmnBusinessRuleTaskData();
            }

            @objid ("09d0405a-e5d2-4ec5-9caf-b5a0aa2bf11d")
            public SmObjectImpl createImpl() {
                return new BpmnBusinessRuleTaskImpl();
            }

        }

    }

}
