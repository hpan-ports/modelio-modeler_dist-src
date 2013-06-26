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
import org.modelio.metamodel.bpmn.activities.BpmnScriptTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnScriptTaskImpl;
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

@objid ("00825802-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnScriptTask.class, factory=BpmnScriptTaskData.Metadata.ObjectFactory.class)
public class BpmnScriptTaskData extends BpmnTaskData {
    @objid ("0d558bb7-9e5c-4b21-9bb6-08b08e5bad7f")
    @SmaMetaAttribute(metaName="ScriptLanguage", type=String.class, smAttributeClass=Metadata.ScriptLanguageSmAttribute.class)
     Object mScriptLanguage = "";

    @objid ("4b8e913c-61e8-4b6f-8ac5-4a26604676a5")
    @SmaMetaAttribute(metaName="Script", type=String.class, smAttributeClass=Metadata.ScriptSmAttribute.class)
     Object mScript = "";

    @objid ("1abcc48b-750c-4c1c-98fb-f1edd150618f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006662b4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e4f758a3-73a2-4d31-8ca5-09b75e38b73d")
        private static SmClass smClass = null;

        @objid ("6df85793-0dbd-436b-8e3e-6a87dbe40a26")
        private static SmAttribute ScriptLanguageAtt = null;

        @objid ("b0745b6f-e79d-43c2-987d-a55d2d759f3b")
        private static SmAttribute ScriptAtt = null;

        @objid ("9fbef9df-12e2-4420-a677-064224b2040d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnScriptTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7560a0e0-716f-4224-b74a-58279ec28a90")
        public static SmAttribute ScriptLanguageAtt() {
            if (ScriptLanguageAtt == null) {
            	ScriptLanguageAtt = classof().getAttributeDef("ScriptLanguage");
            }
            return ScriptLanguageAtt;
        }

        @objid ("13e9596a-a643-4c8c-bce3-77c1788c779d")
        public static SmAttribute ScriptAtt() {
            if (ScriptAtt == null) {
            	ScriptAtt = classof().getAttributeDef("Script");
            }
            return ScriptAtt;
        }

        @objid ("e97d328f-dee8-4d08-9e1c-2100835b97aa")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("183e7982-69e9-411d-987c-a8c67158ca35")
        public static SmAttribute getScriptAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ScriptAtt;
        }

        @objid ("8bc5f78f-76f7-4293-87b7-484c41f909b9")
        public static SmAttribute getScriptLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ScriptLanguageAtt;
        }

        @objid ("0066abd4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9f5466f8-968e-4cd8-83fb-aa1db50a6b86")
            public ISmObjectData createData() {
                return new BpmnScriptTaskData();
            }

            @objid ("adf26245-8436-4029-a7d6-f73189300d21")
            public SmObjectImpl createImpl() {
                return new BpmnScriptTaskImpl();
            }

        }

        @objid ("00670f84-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ScriptLanguageSmAttribute extends SmAttribute {
            @objid ("77047776-5a00-4fba-9b65-b7b76f478979")
            public Object getValue(ISmObjectData data) {
                return ((BpmnScriptTaskData) data).mScriptLanguage;
            }

            @objid ("fc0293b9-0ec2-48dd-8895-db52932e2df6")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnScriptTaskData) data).mScriptLanguage = value;
            }

        }

        @objid ("00677118-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ScriptSmAttribute extends SmAttribute {
            @objid ("c392fc01-772c-4aca-9ab9-221f5661eb62")
            public Object getValue(ISmObjectData data) {
                return ((BpmnScriptTaskData) data).mScript;
            }

            @objid ("a001d552-e009-491b-acbd-625cf5625444")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnScriptTaskData) data).mScript = value;
            }

        }

    }

}
