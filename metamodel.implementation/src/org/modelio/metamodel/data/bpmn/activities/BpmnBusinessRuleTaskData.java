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
    @objid ("e69db1e9-5f44-4162-a32e-13928ad88724")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00218e82-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e19d9b99-c583-41d9-8560-5cbae991421f")
        private static SmClass smClass = null;

        @objid ("af28ddc6-92a6-4960-bbe8-c0fceebfbf38")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBusinessRuleTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6b4f81c8-a339-4f7a-9574-0ab69b4c6dc6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0022b5dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a562cee4-8e3e-42a3-adc1-1e2e317e5382")
            public ISmObjectData createData() {
                return new BpmnBusinessRuleTaskData();
            }

            @objid ("dc178858-5853-431d-a552-fd59a7f50945")
            public SmObjectImpl createImpl() {
                return new BpmnBusinessRuleTaskImpl();
            }

        }

    }

}
