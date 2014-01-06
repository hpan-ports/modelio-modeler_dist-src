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
package org.modelio.metamodel.data.bpmn.bpmnDiagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnSubProcessDiagram;
import org.modelio.metamodel.data.diagrams.BehaviorDiagramData;
import org.modelio.metamodel.impl.bpmn.bpmnDiagrams.BpmnSubProcessDiagramImpl;
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

@objid ("000cee8c-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnSubProcessDiagram.class, factory=BpmnSubProcessDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class BpmnSubProcessDiagramData extends BehaviorDiagramData {
    @objid ("d45c39a4-2a71-4bcb-819a-f6a266d159a6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008fd3b0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7cb43a70-409b-446c-9536-9b3076c7136a")
        private static SmClass smClass = null;

        @objid ("1ae2fe54-bc0c-47e8-bc3c-2265d8e87682")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSubProcessDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cb0832b1-ca77-4728-b9b4-064a58cc0af9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0090160e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2da86dd0-fba7-4389-946c-debe81f67c7d")
            public ISmObjectData createData() {
                return new BpmnSubProcessDiagramData();
            }

            @objid ("6ad50cfd-3a84-4c1d-a70a-53134927e81e")
            public SmObjectImpl createImpl() {
                return new BpmnSubProcessDiagramImpl();
            }

        }

    }

}
