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
    @objid ("b55ae2c1-9ef2-4444-a4c1-a96e3b4b53dd")
    @SmaMetaAttribute(metaName="ErrorCode", type=String.class, smAttributeClass=Metadata.ErrorCodeSmAttribute.class)
     Object mErrorCode = "";

    @objid ("cdd3f2eb-fd08-42ee-b43b-89c528590c08")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0014bd06-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("54eb1fc9-4fac-403b-92b5-a9abe9eff4de")
        private static SmClass smClass = null;

        @objid ("11c712af-066a-4b01-936f-9cdd62300360")
        private static SmAttribute ErrorCodeAtt = null;

        @objid ("9a50f44d-6116-44ca-a6b9-8b238b185ea7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnErrorEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5ee4b18d-7e90-44e8-a413-016877470f95")
        public static SmAttribute ErrorCodeAtt() {
            if (ErrorCodeAtt == null) {
            	ErrorCodeAtt = classof().getAttributeDef("ErrorCode");
            }
            return ErrorCodeAtt;
        }

        @objid ("7208cbcc-1fba-49c2-8d91-cffe2ad6dbc1")
        public static SmAttribute getErrorCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ErrorCodeAtt;
        }

        @objid ("4c575fdf-4f21-47f8-bf6f-40d27a7b5028")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0014ff6e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("42132200-dd86-4b64-a77a-a67d6bbca51d")
            public ISmObjectData createData() {
                return new BpmnErrorEventDefinitionData();
            }

            @objid ("6f7c2850-a53a-4e99-af5b-b81d159a5210")
            public SmObjectImpl createImpl() {
                return new BpmnErrorEventDefinitionImpl();
            }

        }

        @objid ("0015644a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ErrorCodeSmAttribute extends SmAttribute {
            @objid ("a5ce7486-0b98-4c82-bc89-41e15e54e9d0")
            public Object getValue(ISmObjectData data) {
                return ((BpmnErrorEventDefinitionData) data).mErrorCode;
            }

            @objid ("fb17e82d-6624-4d17-bc5d-fcf8ee026786")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnErrorEventDefinitionData) data).mErrorCode = value;
            }

        }

    }

}
