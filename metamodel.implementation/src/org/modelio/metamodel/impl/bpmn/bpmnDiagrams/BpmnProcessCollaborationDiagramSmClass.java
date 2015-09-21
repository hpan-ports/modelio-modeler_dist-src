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
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnProcessCollaborationDiagram;
import org.modelio.metamodel.impl.diagrams.BehaviorDiagramSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("226a58ba-6af0-42d1-8b64-93f2d9615af2")
public class BpmnProcessCollaborationDiagramSmClass extends BehaviorDiagramSmClass {
    @objid ("c441fa1a-369d-418a-9bfa-0ac161475011")
    public BpmnProcessCollaborationDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("962b377c-232b-4715-acef-afc7e54b522f")
    @Override
    public String getName() {
        return "BpmnProcessCollaborationDiagram";
    }

    @objid ("608ce58c-c263-44b6-a45b-182d571cefdf")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("72cd8a1e-7d13-41d5-855f-5b5d6b5b00fa")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnProcessCollaborationDiagram.class;
    }

    @objid ("3fd3b414-27e8-460a-a531-13cd122aea61")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("dcc56bf2-5b31-4b28-9461-c32ba85e081d")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("8d381e8d-2901-4812-969b-95686020c453")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BehaviorDiagram");
        this.registerFactory(new BpmnProcessCollaborationDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
    }

    @objid ("83c01d7e-7c02-4c60-9853-a2fcbd892a0d")
    private static class BpmnProcessCollaborationDiagramObjectFactory implements ISmObjectFactory {
        @objid ("c8e786d5-97ac-457a-98a9-dd0869ec3e21")
        private BpmnProcessCollaborationDiagramSmClass smClass;

        @objid ("6dae1699-ce3f-402f-9784-a78a62c89480")
        public BpmnProcessCollaborationDiagramObjectFactory(BpmnProcessCollaborationDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ae5aafd5-ef51-4191-b886-f51be8f55d09")
        @Override
        public ISmObjectData createData() {
            return new BpmnProcessCollaborationDiagramData(this.smClass);
        }

        @objid ("b3688eea-2c4d-4e52-8c45-06e56198e11a")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnProcessCollaborationDiagramImpl();
        }

    }

}
