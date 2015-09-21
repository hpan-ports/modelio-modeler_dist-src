/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.bpmn.bpmnDiagrams;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnSubProcessDiagram;
import org.modelio.metamodel.impl.diagrams.BehaviorDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("a7dbfe06-55c5-408b-acf6-07a470a082f9")
public class BpmnSubProcessDiagramSmClass extends BehaviorDiagramSmClass {
    @objid ("1361a4f1-bb22-4dc8-9856-69f2261948dd")
    public BpmnSubProcessDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a7efd361-c471-4263-8e79-0bf1e74cf59f")
    @Override
    public String getName() {
        return "BpmnSubProcessDiagram";
    }

    @objid ("9376ef20-1d2b-4e0c-b4e8-f44cd5e79bbc")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("455b6655-5bec-4bab-9a01-b6f5e6cb15b8")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnSubProcessDiagram.class;
    }

    @objid ("f96677cd-af16-41cb-9de3-5f5e3d3fb757")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("ce98b1dc-e83b-41b1-9958-f69e11d5ea8a")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("4b494cb2-6671-4c05-84f5-6d7d2d2715a6")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BehaviorDiagram");
        this.registerFactory(new BpmnSubProcessDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("8fbc2469-3184-4185-ad63-2a34b12d7e47")
    private static class BpmnSubProcessDiagramObjectFactory implements ISmObjectFactory {
        @objid ("2a5e7700-1fcd-415f-8b13-bda1c94918cc")
        private BpmnSubProcessDiagramSmClass smClass;

        @objid ("c2dfbbb8-4761-4f85-9bbe-7cec32a8d7c6")
        public BpmnSubProcessDiagramObjectFactory(BpmnSubProcessDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d93d0cb7-2b3b-47a0-a696-b6fb76545ab5")
        @Override
        public ISmObjectData createData() {
            return new BpmnSubProcessDiagramData(this.smClass);
        }

        @objid ("6254fbff-3323-4b30-aeb9-cf568c28b73a")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnSubProcessDiagramImpl();
        }

    }

}
