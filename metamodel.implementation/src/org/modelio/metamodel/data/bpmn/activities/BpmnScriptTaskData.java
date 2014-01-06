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
    @objid ("fc9294fe-e62d-4642-9add-65bce9e7f6d9")
    @SmaMetaAttribute(metaName="ScriptLanguage", type=String.class, smAttributeClass=Metadata.ScriptLanguageSmAttribute.class)
     Object mScriptLanguage = "";

    @objid ("362f702a-8c65-4740-a307-23aa84dd20da")
    @SmaMetaAttribute(metaName="Script", type=String.class, smAttributeClass=Metadata.ScriptSmAttribute.class)
     Object mScript = "";

    @objid ("163559a7-552a-42ac-afc0-187affb932b9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006662b4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a1b72a81-10df-4606-8062-74679d128a27")
        private static SmClass smClass = null;

        @objid ("ce3faba9-69e7-4175-a1b1-bbc4abaa719e")
        private static SmAttribute ScriptLanguageAtt = null;

        @objid ("940ad760-8fb9-4705-9293-9bcbf1278898")
        private static SmAttribute ScriptAtt = null;

        @objid ("ada35a0a-6d2b-4e1f-8121-484d563b9bbe")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnScriptTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2aeeb36e-5b0d-4acc-a18e-e53b96e62a3e")
        public static SmAttribute ScriptLanguageAtt() {
            if (ScriptLanguageAtt == null) {
            	ScriptLanguageAtt = classof().getAttributeDef("ScriptLanguage");
            }
            return ScriptLanguageAtt;
        }

        @objid ("7a0efcfe-18fa-4ad5-96df-dff80ce9ee5b")
        public static SmAttribute ScriptAtt() {
            if (ScriptAtt == null) {
            	ScriptAtt = classof().getAttributeDef("Script");
            }
            return ScriptAtt;
        }

        @objid ("a5525e46-c787-4b16-a751-cc53219c0d27")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("38c934d1-171e-43bf-9312-ccd975c2c964")
        public static SmAttribute getScriptLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ScriptLanguageAtt;
        }

        @objid ("291afcca-acb5-4419-8d31-e470aa9d992f")
        public static SmAttribute getScriptAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ScriptAtt;
        }

        @objid ("0066abd4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c6c59557-90d7-472a-93d6-a2c660dca71d")
            public ISmObjectData createData() {
                return new BpmnScriptTaskData();
            }

            @objid ("50b1a74b-dc33-4b3b-b756-7c9fcfd339f4")
            public SmObjectImpl createImpl() {
                return new BpmnScriptTaskImpl();
            }

        }

        @objid ("00670f84-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ScriptLanguageSmAttribute extends SmAttribute {
            @objid ("8d9e4e7f-4345-41e3-b9a7-363dbca68b8a")
            public Object getValue(ISmObjectData data) {
                return ((BpmnScriptTaskData) data).mScriptLanguage;
            }

            @objid ("1bcafd2a-3dab-4a8a-9d2a-937e76a65ec9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnScriptTaskData) data).mScriptLanguage = value;
            }

        }

        @objid ("00677118-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ScriptSmAttribute extends SmAttribute {
            @objid ("cd9a235a-7f69-4cad-a2d7-fee4c78c30aa")
            public Object getValue(ISmObjectData data) {
                return ((BpmnScriptTaskData) data).mScript;
            }

            @objid ("a8bc8445-1681-4325-8967-38f85034adc9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnScriptTaskData) data).mScript = value;
            }

        }

    }

}
