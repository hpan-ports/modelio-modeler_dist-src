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
import org.modelio.metamodel.bpmn.events.BpmnTimerEventDefinition;
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

@objid ("c3a0ab51-036c-4b61-a9f8-2990d9c1f220")
public class BpmnTimerEventDefinitionSmClass extends BpmnEventDefinitionSmClass {
    @objid ("f8a02606-bfb1-453d-8326-f28c167bb301")
    private SmAttribute timeCycleAtt;

    @objid ("ce2fb698-bc68-4d98-90f3-ea39e114c5de")
    private SmAttribute timeDAtt;

    @objid ("df43ab66-ff88-4a81-826e-e99b1d6f5a68")
    public BpmnTimerEventDefinitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("6b3968e8-be3f-4f65-b639-dc310f39d50e")
    @Override
    public String getName() {
        return "BpmnTimerEventDefinition";
    }

    @objid ("020d27dd-ab4b-474d-9c13-54336dc6446a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d2492f98-ed9c-4f33-abe6-8c8148483902")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnTimerEventDefinition.class;
    }

    @objid ("87f02d5f-7c4c-4d4e-a837-92b290df3e53")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("708b94c1-8277-4cb0-ad03-fa9e7473c023")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a8e50247-57f3-43d3-a395-f0d7ed993754")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnEventDefinition");
        this.registerFactory(new BpmnTimerEventDefinitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.timeCycleAtt = new TimeCycleSmAttribute();
        this.timeCycleAtt.init("TimeCycle", this, String.class );
        registerAttribute(this.timeCycleAtt);
        
        this.timeDAtt = new TimeDSmAttribute();
        this.timeDAtt.init("TimeD", this, String.class );
        registerAttribute(this.timeDAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("b7aa7de9-e1ca-46b6-ba06-ce989be83f17")
    public SmAttribute getTimeCycleAtt() {
        if (this.timeCycleAtt == null) {
        	this.timeCycleAtt = this.getAttributeDef("TimeCycle");
        }
        return this.timeCycleAtt;
    }

    @objid ("2bf6e961-1c04-4836-ab61-603d7a749baf")
    public SmAttribute getTimeDAtt() {
        if (this.timeDAtt == null) {
        	this.timeDAtt = this.getAttributeDef("TimeD");
        }
        return this.timeDAtt;
    }

    @objid ("be0339b0-2cc2-448d-b57b-bc16e948e9dc")
    private static class BpmnTimerEventDefinitionObjectFactory implements ISmObjectFactory {
        @objid ("e8b9056f-013e-461a-a6c6-75fa53116036")
        private BpmnTimerEventDefinitionSmClass smClass;

        @objid ("3420862c-e15f-420b-a06b-dafe7da568cc")
        public BpmnTimerEventDefinitionObjectFactory(BpmnTimerEventDefinitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("c3df706d-5ecf-4720-890a-00d248ce9373")
        @Override
        public ISmObjectData createData() {
            return new BpmnTimerEventDefinitionData(this.smClass);
        }

        @objid ("30020711-e983-4522-9e5b-d626ffc841f4")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnTimerEventDefinitionImpl();
        }

    }

    @objid ("c90d3928-e0a2-4cc5-86a0-be2d911bbbd2")
    public static class TimeCycleSmAttribute extends SmAttribute {
        @objid ("b24db9ba-bb5a-46d1-bb21-59cc16a33a5c")
        public Object getValue(ISmObjectData data) {
            return ((BpmnTimerEventDefinitionData) data).mTimeCycle;
        }

        @objid ("2cb29522-0600-442b-907f-6d558e93e78d")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnTimerEventDefinitionData) data).mTimeCycle = value;
        }

    }

    @objid ("d85aefa9-8315-481c-bcf1-588b63d6ef24")
    public static class TimeDSmAttribute extends SmAttribute {
        @objid ("1f515ae5-8bcd-42be-8257-349f3ab15987")
        public Object getValue(ISmObjectData data) {
            return ((BpmnTimerEventDefinitionData) data).mTimeD;
        }

        @objid ("7d3f7c1b-5933-4b2b-93b8-6d3869292cce")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnTimerEventDefinitionData) data).mTimeD = value;
        }

    }

}
