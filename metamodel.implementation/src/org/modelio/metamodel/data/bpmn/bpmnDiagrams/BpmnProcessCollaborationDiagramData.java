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
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnProcessCollaborationDiagram;
import org.modelio.metamodel.data.diagrams.BehaviorDiagramData;
import org.modelio.metamodel.impl.bpmn.bpmnDiagrams.BpmnProcessCollaborationDiagramImpl;
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

@objid ("000c5094-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnProcessCollaborationDiagram.class, factory=BpmnProcessCollaborationDiagramData.Metadata.ObjectFactory.class, cmsnode=true)
public class BpmnProcessCollaborationDiagramData extends BehaviorDiagramData {
    @objid ("d9f8ddb0-d1b8-4670-9a71-4bf89f9e0d06")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0082bd6a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2e70a2f3-4bd5-44e7-8179-a50646d90439")
        private static SmClass smClass = null;

        @objid ("d3e3628e-8b4c-4304-b73b-f4e1e6baf67e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnProcessCollaborationDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fa51b7bd-fc55-4c61-a67c-b52e90660c61")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0082fe9c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("89a5872e-0168-44e3-b4a6-5aec564693e9")
            public ISmObjectData createData() {
                return new BpmnProcessCollaborationDiagramData();
            }

            @objid ("6f6f5c61-7cbe-4e67-87ba-a18bd8ee28d1")
            public SmObjectImpl createImpl() {
                return new BpmnProcessCollaborationDiagramImpl();
            }

        }

    }

}
