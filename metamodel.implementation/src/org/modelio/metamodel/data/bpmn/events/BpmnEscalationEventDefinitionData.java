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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnEscalationEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnEscalationEventDefinitionImpl;
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

@objid ("008c5122-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnEscalationEventDefinition.class, factory=BpmnEscalationEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnEscalationEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("d79cc19d-c9e8-4faa-a4ae-93ac178d0ebc")
    @SmaMetaAttribute(metaName="EscalationCode", type=String.class, smAttributeClass=Metadata.EscalationCodeSmAttribute.class)
     Object mEscalationCode = "";

    @objid ("00a53734-9523-4a22-b162-04c8aced192c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000c0f80-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6251eb13-0095-43a3-9ef0-a14145b03bef")
        private static SmClass smClass = null;

        @objid ("6595ea55-b08b-4130-bcf6-da33433d9ef8")
        private static SmAttribute EscalationCodeAtt = null;

        @objid ("75719c32-bdbc-4fe7-a4d2-02c7d1dce212")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnEscalationEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f8db5803-db95-46b9-99ab-cccf2aa704c1")
        public static SmAttribute EscalationCodeAtt() {
            if (EscalationCodeAtt == null) {
            	EscalationCodeAtt = classof().getAttributeDef("EscalationCode");
            }
            return EscalationCodeAtt;
        }

        @objid ("e228fea0-1ff6-41e7-87f7-84054b0d9770")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00f8ea5a-b408-43d8-b789-57a6ed8e9412")
        public static SmAttribute getEscalationCodeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EscalationCodeAtt;
        }

        @objid ("000c5026-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("478a2ba5-1b89-4bdf-9341-d5b3af7ad974")
            public ISmObjectData createData() {
                return new BpmnEscalationEventDefinitionData();
            }

            @objid ("da7966dd-ef68-4cf3-b2a1-8a0e2f77bc70")
            public SmObjectImpl createImpl() {
                return new BpmnEscalationEventDefinitionImpl();
            }

        }

        @objid ("000cb07a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class EscalationCodeSmAttribute extends SmAttribute {
            @objid ("7cfc72c6-794e-446d-b4e5-90408c8208fe")
            public Object getValue(ISmObjectData data) {
                return ((BpmnEscalationEventDefinitionData) data).mEscalationCode;
            }

            @objid ("84a832c8-660f-41b4-b76f-f39bea32feff")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnEscalationEventDefinitionData) data).mEscalationCode = value;
            }

        }

    }

}
