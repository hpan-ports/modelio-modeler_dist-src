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
    @objid ("5ca11d2c-ad7d-4013-a17b-ed2238aaec63")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0082bd6a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8083457f-2d45-4ba5-90af-f44674e48a10")
        private static SmClass smClass = null;

        @objid ("8bb94b81-44e9-457f-8380-549edbb22901")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnProcessCollaborationDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bd079036-3e9f-4245-978e-696d5370463d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0082fe9c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("31ed32f4-d3dd-4c6e-99ba-1cc9171a22dc")
            public ISmObjectData createData() {
                return new BpmnProcessCollaborationDiagramData();
            }

            @objid ("57eb5625-8bd2-41ab-b658-d8fc4a026fda")
            public SmObjectImpl createImpl() {
                return new BpmnProcessCollaborationDiagramImpl();
            }

        }

    }

}
