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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.StructuredActivityNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.LoopNode;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("205ae75c-6818-4c12-8295-cb1fb852bc5d")
public class LoopNodeSmClass extends StructuredActivityNodeSmClass {
    @objid ("82749ad1-02e0-4c7f-b749-cc90ec46b799")
    private SmAttribute isTestedFirstAtt;

    @objid ("94417fb0-add3-48db-a0bf-fe0be25247ca")
    private SmAttribute setupAtt;

    @objid ("bb684def-7e82-49d5-9ad1-c9f3838a0d7f")
    private SmAttribute testAtt;

    @objid ("ed1fff50-81f6-4bd6-9167-34e225308c59")
    public LoopNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("35a3142b-4560-4ef0-8a4e-1452a702fabd")
    @Override
    public String getName() {
        return "LoopNode";
    }

    @objid ("c639b407-31c5-4523-9692-db66a7124b6d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("44c82a72-a11d-42ab-9907-7531a66b95bf")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return LoopNode.class;
    }

    @objid ("60c368fb-d753-4967-a15d-6ee783038bca")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("592a16e9-99ee-4bb9-b5bd-975c862a043a")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("fdddb9f4-1e6f-4871-8a90-2b2c21f9ecc9")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("StructuredActivityNode");
        this.registerFactory(new LoopNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isTestedFirstAtt = new IsTestedFirstSmAttribute();
        this.isTestedFirstAtt.init("IsTestedFirst", this, Boolean.class );
        registerAttribute(this.isTestedFirstAtt);
        
        this.setupAtt = new SetupSmAttribute();
        this.setupAtt.init("Setup", this, String.class );
        registerAttribute(this.setupAtt);
        
        this.testAtt = new TestSmAttribute();
        this.testAtt.init("Test", this, String.class );
        registerAttribute(this.testAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("1d116fd9-f520-413e-b0ea-6821eaa19ec1")
    public SmAttribute getIsTestedFirstAtt() {
        if (this.isTestedFirstAtt == null) {
        	this.isTestedFirstAtt = this.getAttributeDef("IsTestedFirst");
        }
        return this.isTestedFirstAtt;
    }

    @objid ("c10a89f8-b51a-49b6-916a-6f5e000d699a")
    public SmAttribute getSetupAtt() {
        if (this.setupAtt == null) {
        	this.setupAtt = this.getAttributeDef("Setup");
        }
        return this.setupAtt;
    }

    @objid ("725fbac8-bef0-49d6-9d7b-bef07594686a")
    public SmAttribute getTestAtt() {
        if (this.testAtt == null) {
        	this.testAtt = this.getAttributeDef("Test");
        }
        return this.testAtt;
    }

    @objid ("a193b9b7-dfd1-4539-b5e5-10b9179000cf")
    private static class LoopNodeObjectFactory implements ISmObjectFactory {
        @objid ("f9252306-7a5f-42e8-ac43-a11cc1ab6aa4")
        private LoopNodeSmClass smClass;

        @objid ("bada8e74-a4da-4d72-947c-e8addc648917")
        public LoopNodeObjectFactory(LoopNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("62fb1ddd-df2d-4fa0-9842-1eb52fdf35ff")
        @Override
        public ISmObjectData createData() {
            return new LoopNodeData(this.smClass);
        }

        @objid ("637d325c-777b-4069-9744-c6bc3799e4f2")
        @Override
        public SmObjectImpl createImpl() {
            return new LoopNodeImpl();
        }

    }

    @objid ("3b230962-fb6f-43ab-9840-e3d09ec11b04")
    public static class IsTestedFirstSmAttribute extends SmAttribute {
        @objid ("4c9b1ceb-e5c7-4f1c-9e5b-5a022d8d14f0")
        public Object getValue(ISmObjectData data) {
            return ((LoopNodeData) data).mIsTestedFirst;
        }

        @objid ("35911219-4ee0-4fa0-ac7a-330452cf796c")
        public void setValue(ISmObjectData data, Object value) {
            ((LoopNodeData) data).mIsTestedFirst = value;
        }

    }

    @objid ("b9e5a326-20bc-4dac-9089-d9e72a90464b")
    public static class SetupSmAttribute extends SmAttribute {
        @objid ("2e3dd26a-ddef-47f2-845c-6b578189a7da")
        public Object getValue(ISmObjectData data) {
            return ((LoopNodeData) data).mSetup;
        }

        @objid ("fe9cb015-6581-4401-9117-f724d64c4639")
        public void setValue(ISmObjectData data, Object value) {
            ((LoopNodeData) data).mSetup = value;
        }

    }

    @objid ("421415e1-adc9-4e2f-ac58-4dea571ebe56")
    public static class TestSmAttribute extends SmAttribute {
        @objid ("0a2a57be-19b6-48a1-922a-7c876a7dcde0")
        public Object getValue(ISmObjectData data) {
            return ((LoopNodeData) data).mTest;
        }

        @objid ("088bc8b7-88dd-4a20-bde0-822a38be46bd")
        public void setValue(ISmObjectData data, Object value) {
            ((LoopNodeData) data).mTest = value;
        }

    }

}
