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
    @objid ("484bf3b9-e1cb-4dbc-9469-0c1147377680")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0082bd6a-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ab741911-41e0-419a-8ba1-a60e5ad714c5")
        private static SmClass smClass = null;

        @objid ("2dd15a3b-352c-44dd-8815-6e416ffb5e9a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnProcessCollaborationDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a511acf0-9326-4d43-aabd-6d1e90f15b3c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0082fe9c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("41f2764a-23a3-4b1e-b20f-5f6c1040707e")
            public ISmObjectData createData() {
                return new BpmnProcessCollaborationDiagramData();
            }

            @objid ("55e75205-c781-4b14-b717-6243e897dd6c")
            public SmObjectImpl createImpl() {
                return new BpmnProcessCollaborationDiagramImpl();
            }

        }

    }

}
