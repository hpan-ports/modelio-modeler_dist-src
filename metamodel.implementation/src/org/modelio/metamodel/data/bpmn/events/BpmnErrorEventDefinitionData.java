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
    @objid ("512d0b44-9cb9-44bd-8f62-d38a9ea54aa8")
    @SmaMetaAttribute(metaName="ErrorCode", type=String.class, smAttributeClass=Metadata.ErrorCodeSmAttribute.class)
     Object mErrorCode = "";

    @objid ("b6e1449a-a5a9-469f-891d-cbef17c4a3a8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0014bd06-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e15ce480-b534-402f-b726-c800b869d06c")
        private static SmClass smClass = null;

        @objid ("d4490aec-a503-4609-a8c7-f1582ad98aaf")
        private static SmAttribute ErrorCodeAtt = null;

        @objid ("8e27ac96-b59b-496e-945c-b3c154f08a7e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnErrorEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("033710d7-d2ca-4020-ac36-4df74d337e7c")
        public static SmAttribute ErrorCodeAtt() {
            if (ErrorCodeAtt == null) {
            	ErrorCodeAtt = classof().getAttributeDef("ErrorCode");
            }
            return ErrorCodeAtt;
        }

        @objid ("39e8c50f-395c-4711-a0ab-84c2ee4b4709")
        public static SmAttribute getErrorCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ErrorCodeAtt;
        }

        @objid ("8d1a2394-6ea5-4a56-9c73-7748b55c38cf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0014ff6e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c7b57fae-d4eb-492c-8aae-3ae6cdaf5bd7")
            public ISmObjectData createData() {
                return new BpmnErrorEventDefinitionData();
            }

            @objid ("41ca8d2d-baa5-4eb6-8b65-f2f316d8ce6c")
            public SmObjectImpl createImpl() {
                return new BpmnErrorEventDefinitionImpl();
            }

        }

        @objid ("0015644a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ErrorCodeSmAttribute extends SmAttribute {
            @objid ("96a7cbe9-7aef-459c-9b71-96638c7fd008")
            public Object getValue(ISmObjectData data) {
                return ((BpmnErrorEventDefinitionData) data).mErrorCode;
            }

            @objid ("9eb23fdf-d024-4e84-bfb5-82a8163eca9a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnErrorEventDefinitionData) data).mErrorCode = value;
            }

        }

    }

}
