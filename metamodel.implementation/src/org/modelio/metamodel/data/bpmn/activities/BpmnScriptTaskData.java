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
    @objid ("f935bf55-23fd-4043-a567-c51644321933")
    @SmaMetaAttribute(metaName="ScriptLanguage", type=String.class, smAttributeClass=Metadata.ScriptLanguageSmAttribute.class)
     Object mScriptLanguage = "";

    @objid ("f9d729ac-f09e-4c24-9af9-a923c78a2b6f")
    @SmaMetaAttribute(metaName="Script", type=String.class, smAttributeClass=Metadata.ScriptSmAttribute.class)
     Object mScript = "";

    @objid ("5b098651-842a-45a1-a3a7-a907ade9ef43")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006662b4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("330aa8fe-8054-486c-bd89-4444ee35f9ca")
        private static SmClass smClass = null;

        @objid ("e93cb1af-022b-46aa-8270-2ee0dcfcc125")
        private static SmAttribute ScriptLanguageAtt = null;

        @objid ("acd59712-9016-42b6-8dad-ed1a38681788")
        private static SmAttribute ScriptAtt = null;

        @objid ("a3a83825-b46f-4295-a532-c2bd6b5ce07e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnScriptTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b0761f4c-a839-4801-8189-51b5759f3c5b")
        public static SmAttribute ScriptLanguageAtt() {
            if (ScriptLanguageAtt == null) {
            	ScriptLanguageAtt = classof().getAttributeDef("ScriptLanguage");
            }
            return ScriptLanguageAtt;
        }

        @objid ("c2ad0f61-e1fa-42f8-aa9a-ce1d17a44fa3")
        public static SmAttribute ScriptAtt() {
            if (ScriptAtt == null) {
            	ScriptAtt = classof().getAttributeDef("Script");
            }
            return ScriptAtt;
        }

        @objid ("8a53cc39-28c7-4044-9e64-272c74bb6bc8")
        public static SmAttribute getScriptAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ScriptAtt;
        }

        @objid ("12add608-b072-46ed-8d17-100c531e3a38")
        public static SmAttribute getScriptLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ScriptLanguageAtt;
        }

        @objid ("60d4e2c5-01d5-4e2f-a6a4-beda2aa4c1e6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0066abd4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("77bfc9c5-3971-490a-bcd2-30f6b667bf55")
            public ISmObjectData createData() {
                return new BpmnScriptTaskData();
            }

            @objid ("2acb9995-f941-4582-9afd-6c164cc8e391")
            public SmObjectImpl createImpl() {
                return new BpmnScriptTaskImpl();
            }

        }

        @objid ("00670f84-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ScriptLanguageSmAttribute extends SmAttribute {
            @objid ("9be9f3a2-593d-4612-98d3-1d80d0bf0cfc")
            public Object getValue(ISmObjectData data) {
                return ((BpmnScriptTaskData) data).mScriptLanguage;
            }

            @objid ("28f7e410-ccaf-4cf2-88a9-bc04e29f17d3")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnScriptTaskData) data).mScriptLanguage = value;
            }

        }

        @objid ("00677118-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ScriptSmAttribute extends SmAttribute {
            @objid ("2ce6662e-6d79-4604-b6b5-66e13118c29b")
            public Object getValue(ISmObjectData data) {
                return ((BpmnScriptTaskData) data).mScript;
            }

            @objid ("70be9891-919d-432c-a29f-360eb7517ccf")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnScriptTaskData) data).mScript = value;
            }

        }

    }

}
