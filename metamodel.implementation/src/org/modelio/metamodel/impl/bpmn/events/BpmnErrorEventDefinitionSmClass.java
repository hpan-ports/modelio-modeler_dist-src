/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnErrorEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("2f63a229-7bed-4137-91ae-8558d497558a")
public class BpmnErrorEventDefinitionSmClass extends BpmnEventDefinitionSmClass {
    @objid ("e0de1034-5597-4ead-b142-4aa4198eec7f")
    private SmAttribute errorCodeAtt;

    @objid ("cca23746-737f-4362-84ff-0928298d3865")
    public BpmnErrorEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("35f51513-2325-4c9e-85ce-2a60237aee8a")
    @Override
    public String getName() {
        return "BpmnErrorEventDefinition";
    }

    @objid ("ec8e9cd9-d517-402f-a949-8a121f58c2ad")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("57e2cd3a-dcbb-447f-9960-9e4da2015bf8")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnErrorEventDefinition.class;
    }

    @objid ("00665d15-919e-436d-afc4-4868792f123b")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("af1cdcbd-d6fd-4a64-ae4b-3d3557597175")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("f19455fa-db17-4787-8328-9c970b0120b9")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEventDefinition");
        this.registerFactory(new BpmnErrorEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.errorCodeAtt = new ErrorCodeSmAttribute();
        this.errorCodeAtt.init("ErrorCode", this, String.class );
        registerAttribute(this.errorCodeAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("e761423d-9744-4784-b511-3f8e6b92b772")
    public SmAttribute getErrorCodeAtt() {
        if (this.errorCodeAtt == null) {
        	this.errorCodeAtt = this.getAttributeDef("ErrorCode");
        }
        return this.errorCodeAtt;
    }

    @objid ("76ac01ef-7937-4546-98ea-a9b01eda4ed3")
    private static class BpmnErrorEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("6887b074-bfa9-46a5-805b-28dcc3cd5298")
        private BpmnErrorEventDefinitionSmClass smClass;

        @objid ("b9758f8a-0521-4726-a462-6445bf9d7d29")
        public BpmnErrorEventDefinitionObjectFactory(BpmnErrorEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("109cb818-4414-4df6-9641-48a45cabbb45")
        @Override
        public ISmObjectData createData() {
            return new BpmnErrorEventDefinitionData(this.smClass);
        }

        @objid ("13fe3afe-5d99-400e-861d-711bff4cbd55")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnErrorEventDefinitionImpl();
        }

    }

    @objid ("f9ec62da-d359-439d-a769-9316a5284591")
    public static class ErrorCodeSmAttribute extends SmAttribute {
        @objid ("d828d8ad-14de-42cf-848d-2327ee95c3bc")
        public Object getValue(ISmObjectData data) {
            return ((BpmnErrorEventDefinitionData) data).mErrorCode;
        }

        @objid ("52d165d4-fc55-4f92-8475-37ec11f77cc7")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnErrorEventDefinitionData) data).mErrorCode = value;
        }

    }

}
