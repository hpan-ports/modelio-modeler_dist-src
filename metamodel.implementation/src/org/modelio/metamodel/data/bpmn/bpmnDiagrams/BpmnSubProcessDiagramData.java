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
    @objid ("91d11f44-b9f0-49b5-9991-0189e39792f6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008fd3b0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b27a2040-205e-4365-9405-a7aff529100e")
        private static SmClass smClass = null;

        @objid ("78dd53d9-be20-4776-ac42-119655270a2b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSubProcessDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9c4296b2-e6c8-402c-b81a-2be02a193ee9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0090160e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("147b95c1-ef61-4d3e-acc5-e5b80a9433e0")
            public ISmObjectData createData() {
                return new BpmnSubProcessDiagramData();
            }

            @objid ("cb5866e4-c3ad-4187-aa8e-36c809d7c157")
            public SmObjectImpl createImpl() {
                return new BpmnSubProcessDiagramImpl();
            }

        }

    }

}
