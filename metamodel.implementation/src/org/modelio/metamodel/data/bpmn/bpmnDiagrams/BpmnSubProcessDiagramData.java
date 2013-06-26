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
    @objid ("67b3161e-793a-49fc-8416-6925b9b0bdc5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008fd3b0-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6bda2e6d-563e-4e30-8082-4f982ecd03cd")
        private static SmClass smClass = null;

        @objid ("eb5482ef-72a3-49e0-b0ae-32e9ea828ff9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSubProcessDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("817cef4e-17d2-44aa-9547-b26a38b85e66")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0090160e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7230a9a7-4167-4932-aa0e-28ad8cb1c5ec")
            public ISmObjectData createData() {
                return new BpmnSubProcessDiagramData();
            }

            @objid ("955539e9-146f-4a09-97af-48904073af5e")
            public SmObjectImpl createImpl() {
                return new BpmnSubProcessDiagramImpl();
            }

        }

    }

}
