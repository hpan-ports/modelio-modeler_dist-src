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
import org.modelio.metamodel.bpmn.events.BpmnConditionalEventDefinition;
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

@objid ("2b15ed8a-3d33-499c-91c7-4c52a79fdacd")
public class BpmnConditionalEventDefinitionSmClass extends BpmnEventDefinitionSmClass {
    @objid ("cf2a93d4-2f6d-47ca-8959-9fe697c8eec7")
    private SmAttribute conditionAtt;

    @objid ("ec590887-a71b-47d0-ae1c-ecc86a5b2925")
    public BpmnConditionalEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("2f42334a-698b-486e-ad6a-a22134bd58e3")
    @Override
    public String getName() {
        return "BpmnConditionalEventDefinition";
    }

    @objid ("c830badd-bad6-4039-a392-18a487c54394")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("97366d58-8b63-4def-817e-5c3152fe016c")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnConditionalEventDefinition.class;
    }

    @objid ("5565ed5a-1415-4635-9806-d388206bd69f")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("42f40d29-5764-4b66-802f-2ea7ed516d27")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("bf222688-fa6e-4174-a0a3-726465f1bae3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEventDefinition");
        this.registerFactory(new BpmnConditionalEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.conditionAtt = new ConditionSmAttribute();
        this.conditionAtt.init("Condition", this, String.class );
        registerAttribute(this.conditionAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("298df067-5786-4e62-a1fe-b99c87c1a91d")
    public SmAttribute getConditionAtt() {
        if (this.conditionAtt == null) {
        	this.conditionAtt = this.getAttributeDef("Condition");
        }
        return this.conditionAtt;
    }

    @objid ("505bb1ae-2d37-47f9-9a17-11781398dd46")
    private static class BpmnConditionalEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("e525ac6a-719d-4e2c-86cc-6d1370675eba")
        private BpmnConditionalEventDefinitionSmClass smClass;

        @objid ("b3c10f4b-35cb-4b70-bd63-22c3fd2d648c")
        public BpmnConditionalEventDefinitionObjectFactory(BpmnConditionalEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("81795df5-2bdf-47b5-bbfe-c66f595d8408")
        @Override
        public ISmObjectData createData() {
            return new BpmnConditionalEventDefinitionData(this.smClass);
        }

        @objid ("00aaa350-009f-4ab8-ae84-287aba80c8f7")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnConditionalEventDefinitionImpl();
        }

    }

    @objid ("439e59ff-c5ce-495e-bb95-b93e73693077")
    public static class ConditionSmAttribute extends SmAttribute {
        @objid ("60ddbb3d-5c8a-4fb0-9023-dd61f5392615")
        public Object getValue(ISmObjectData data) {
            return ((BpmnConditionalEventDefinitionData) data).mCondition;
        }

        @objid ("ba9953e4-1c61-4264-a331-27258e3fbd30")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnConditionalEventDefinitionData) data).mCondition = value;
        }

    }

}
