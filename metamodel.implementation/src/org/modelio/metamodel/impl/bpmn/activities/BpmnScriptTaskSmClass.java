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
import org.modelio.metamodel.bpmn.activities.BpmnScriptTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTaskSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("498e9253-4950-4494-b75b-60929dff9589")
public class BpmnScriptTaskSmClass extends BpmnTaskSmClass {
    @objid ("eaa33d27-6921-4cc5-9622-70272d7dd863")
    private SmAttribute scriptLanguageAtt;

    @objid ("d57a8fef-1df0-4e08-a301-e1fd8f48d68f")
    private SmAttribute scriptAtt;

    @objid ("ae4e6fba-f586-4511-ab16-6a89e552593d")
    public BpmnScriptTaskSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4e2534b8-4ce4-45cb-a339-5617364a859d")
    @Override
    public String getName() {
        return "BpmnScriptTask";
    }

    @objid ("bd5f9392-66b2-491d-80a5-0f0a4dd43fae")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("87ff7dfd-2224-4368-b15e-040749a8d629")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnScriptTask.class;
    }

    @objid ("29562928-4449-4e99-abfe-28bcab19ef96")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("88dd71d2-7594-4de1-9de5-edd71efe76b8")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("de4c5549-d9ee-49b4-a15e-59cfee1d6bb2")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnTask");
        this.registerFactory(new BpmnScriptTaskObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.scriptLanguageAtt = new ScriptLanguageSmAttribute();
        this.scriptLanguageAtt.init("ScriptLanguage", this, String.class );
        registerAttribute(this.scriptLanguageAtt);
        
        this.scriptAtt = new ScriptSmAttribute();
        this.scriptAtt.init("Script", this, String.class );
        registerAttribute(this.scriptAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("7b190a1d-1878-41b8-8c09-8a19c9d9f86d")
    public SmAttribute getScriptLanguageAtt() {
        if (this.scriptLanguageAtt == null) {
        	this.scriptLanguageAtt = this.getAttributeDef("ScriptLanguage");
        }
        return this.scriptLanguageAtt;
    }

    @objid ("dd535ec5-1d6a-47ea-b869-b973437f4f36")
    public SmAttribute getScriptAtt() {
        if (this.scriptAtt == null) {
        	this.scriptAtt = this.getAttributeDef("Script");
        }
        return this.scriptAtt;
    }

    @objid ("73d4b319-d5d8-48e0-8554-a2f350d9c9a5")
    private static class BpmnScriptTaskObjectFactory implements ISmObjectFactory {
        @objid ("715289c7-c2de-4116-ac44-cec37ecfa27e")
        private BpmnScriptTaskSmClass smClass;

        @objid ("4f53e648-e288-4e08-8520-72dff60445c3")
        public BpmnScriptTaskObjectFactory(BpmnScriptTaskSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("44293ce4-8913-43b6-a6d3-db2caccb68a7")
        @Override
        public ISmObjectData createData() {
            return new BpmnScriptTaskData(this.smClass);
        }

        @objid ("67b855e6-74d6-4e99-9ada-5719ed95a9f6")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnScriptTaskImpl();
        }

    }

    @objid ("4ad7652b-62e0-4d95-80b3-4d6a7583c712")
    public static class ScriptLanguageSmAttribute extends SmAttribute {
        @objid ("28d1be28-b1ce-4529-81b4-9bd10e1f3471")
        public Object getValue(ISmObjectData data) {
            return ((BpmnScriptTaskData) data).mScriptLanguage;
        }

        @objid ("d882b1ad-e692-4788-a71a-41761e78506a")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnScriptTaskData) data).mScriptLanguage = value;
        }

    }

    @objid ("8b877363-ffef-4524-86db-7775159531f0")
    public static class ScriptSmAttribute extends SmAttribute {
        @objid ("a1c303c3-60ed-450c-a40b-d18f7529b77f")
        public Object getValue(ISmObjectData data) {
            return ((BpmnScriptTaskData) data).mScript;
        }

        @objid ("b86e8567-f86e-4c63-9a49-bac7ea24a6ca")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnScriptTaskData) data).mScript = value;
        }

    }

}
