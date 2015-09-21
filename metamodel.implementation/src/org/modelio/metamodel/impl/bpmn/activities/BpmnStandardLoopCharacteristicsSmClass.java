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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnStandardLoopCharacteristics;
import org.modelio.metamodel.impl.bpmn.activities.BpmnLoopCharacteristicsSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("c015d3f2-1b6d-4184-822a-251f1714a2c3")
public class BpmnStandardLoopCharacteristicsSmClass extends BpmnLoopCharacteristicsSmClass {
    @objid ("ce385e15-857c-4102-94ea-98ac8b7620c0")
    private SmAttribute testBeforeAtt;

    @objid ("a6fdc45c-2111-49c7-8283-d9c0e926cd88")
    private SmAttribute loopConditionAtt;

    @objid ("7f6abd0c-e21e-4f06-9fa6-9ab6d13c1f75")
    private SmAttribute loopMaximumAtt;

    @objid ("13cb7d1c-8189-4690-9447-518aae403761")
    public BpmnStandardLoopCharacteristicsSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f3fcbb7c-9bf0-4f8f-8cc2-e9fc5ba311c2")
    @Override
    public String getName() {
        return "BpmnStandardLoopCharacteristics";
    }

    @objid ("b8471772-cac9-46a2-a91a-1a9b8eb103ae")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("5deecd02-c665-4f86-8df1-54cb39361548")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnStandardLoopCharacteristics.class;
    }

    @objid ("533380b1-9f21-4f7b-83bd-44798e314467")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("362ea0d9-6fc9-4887-9cf3-b4841ac2ad0f")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("b9401f1e-d26d-4369-83e6-5985a0743f69")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnLoopCharacteristics");
        this.registerFactory(new BpmnStandardLoopCharacteristicsObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.testBeforeAtt = new TestBeforeSmAttribute();
        this.testBeforeAtt.init("TestBefore", this, Boolean.class );
        registerAttribute(this.testBeforeAtt);
        
        this.loopConditionAtt = new LoopConditionSmAttribute();
        this.loopConditionAtt.init("LoopCondition", this, String.class );
        registerAttribute(this.loopConditionAtt);
        
        this.loopMaximumAtt = new LoopMaximumSmAttribute();
        this.loopMaximumAtt.init("LoopMaximum", this, String.class );
        registerAttribute(this.loopMaximumAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("8c633422-f423-4004-a899-1e4afebe0152")
    public SmAttribute getTestBeforeAtt() {
        if (this.testBeforeAtt == null) {
        	this.testBeforeAtt = this.getAttributeDef("TestBefore");
        }
        return this.testBeforeAtt;
    }

    @objid ("09e4cfb6-b15d-484e-810b-a11772705ce2")
    public SmAttribute getLoopConditionAtt() {
        if (this.loopConditionAtt == null) {
        	this.loopConditionAtt = this.getAttributeDef("LoopCondition");
        }
        return this.loopConditionAtt;
    }

    @objid ("1f76a544-b0bf-4d4a-bc04-dcee8302715c")
    public SmAttribute getLoopMaximumAtt() {
        if (this.loopMaximumAtt == null) {
        	this.loopMaximumAtt = this.getAttributeDef("LoopMaximum");
        }
        return this.loopMaximumAtt;
    }

    @objid ("5ecd9b78-d846-4fd7-8ab3-0b415ca8ab80")
    private static class BpmnStandardLoopCharacteristicsObjectFactory implements ISmObjectFactory {
        @objid ("ff730c7c-76d0-42c9-9d41-a7b15b65e14f")
        private BpmnStandardLoopCharacteristicsSmClass smClass;

        @objid ("194ad1e4-e85a-4ccc-bd4d-46feb47a9c95")
        public BpmnStandardLoopCharacteristicsObjectFactory(BpmnStandardLoopCharacteristicsSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("6a891297-0493-4379-8517-664829454a9c")
        @Override
        public ISmObjectData createData() {
            return new BpmnStandardLoopCharacteristicsData(this.smClass);
        }

        @objid ("3b43db63-a8b3-40b0-bedc-a8179c4abb8b")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnStandardLoopCharacteristicsImpl();
        }

    }

    @objid ("4ba1d556-5626-473c-8dc9-f9eb947b6425")
    public static class TestBeforeSmAttribute extends SmAttribute {
        @objid ("a2578ad2-b786-4bb0-974c-c68787bb0af7")
        public Object getValue(ISmObjectData data) {
            return ((BpmnStandardLoopCharacteristicsData) data).mTestBefore;
        }

        @objid ("8d5bf2bb-c7c8-42e5-a545-c3c669ff05f1")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnStandardLoopCharacteristicsData) data).mTestBefore = value;
        }

    }

    @objid ("b71a7fd6-6eaa-4729-aca5-a1d3c2a95cf7")
    public static class LoopConditionSmAttribute extends SmAttribute {
        @objid ("2be1f9c0-cb53-47ad-8e8a-e22e12bd36cf")
        public Object getValue(ISmObjectData data) {
            return ((BpmnStandardLoopCharacteristicsData) data).mLoopCondition;
        }

        @objid ("1687aa3e-b33e-4dd4-9a28-532175ed108e")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnStandardLoopCharacteristicsData) data).mLoopCondition = value;
        }

    }

    @objid ("205eedb4-4162-4a0f-84a7-567a0b1c683d")
    public static class LoopMaximumSmAttribute extends SmAttribute {
        @objid ("697f8675-b656-4e15-bab6-4aeff1475d75")
        public Object getValue(ISmObjectData data) {
            return ((BpmnStandardLoopCharacteristicsData) data).mLoopMaximum;
        }

        @objid ("617435b7-1310-440f-8431-941ae423a76a")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnStandardLoopCharacteristicsData) data).mLoopMaximum = value;
        }

    }

}
