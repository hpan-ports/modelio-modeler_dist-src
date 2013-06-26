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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnErrorEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnErrorEventDefinitionImpl;
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

@objid ("008ba8e4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnErrorEventDefinition.class, factory=BpmnErrorEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnErrorEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("727e1bb8-60f2-4317-8f3d-79662867a6b0")
    @SmaMetaAttribute(metaName="ErrorCode", type=String.class, smAttributeClass=Metadata.ErrorCodeSmAttribute.class)
     Object mErrorCode = "";

    @objid ("6bee2ba9-7152-4592-9f3d-501251af3cb1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0014bd06-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("54001c7c-c13b-4580-bf2c-9330805b68e1")
        private static SmClass smClass = null;

        @objid ("693d2430-cb9a-4118-ae4f-a7223be7e7dd")
        private static SmAttribute ErrorCodeAtt = null;

        @objid ("f1bec48e-fdcb-432e-ad85-e154369a93fb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnErrorEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1ef1a286-7a37-4000-8bd6-fc47251dc58b")
        public static SmAttribute ErrorCodeAtt() {
            if (ErrorCodeAtt == null) {
            	ErrorCodeAtt = classof().getAttributeDef("ErrorCode");
            }
            return ErrorCodeAtt;
        }

        @objid ("e7adb158-5220-4773-aa5f-f4c946e7e4d6")
        public static SmAttribute getErrorCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ErrorCodeAtt;
        }

        @objid ("753c2fe6-44bf-48aa-b9d6-0b77753691ef")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0014ff6e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9747d6a5-802e-4ac1-92b9-72654dcdd56d")
            public ISmObjectData createData() {
                return new BpmnErrorEventDefinitionData();
            }

            @objid ("25cd488c-8615-40ce-9ef0-e9923a3f98b6")
            public SmObjectImpl createImpl() {
                return new BpmnErrorEventDefinitionImpl();
            }

        }

        @objid ("0015644a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ErrorCodeSmAttribute extends SmAttribute {
            @objid ("070684ef-0b57-48dd-adce-f9d524b9a6eb")
            public Object getValue(ISmObjectData data) {
                return ((BpmnErrorEventDefinitionData) data).mErrorCode;
            }

            @objid ("e27fb8d2-664c-4c90-9fa5-e111ad7d06f1")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnErrorEventDefinitionData) data).mErrorCode = value;
            }

        }

    }

}
