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
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.diagrams.DiagramSetSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.PackageSmClass;
import org.modelio.metamodel.mda.Project;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("89372670-8d71-4434-8d2f-26ea95be7263")
public class ProjectSmClass extends ModelElementSmClass {
    @objid ("08d8be8b-4988-4116-b13c-c2be0fec3c89")
    private SmAttribute projectContextAtt;

    @objid ("365076fc-9c61-433b-8629-edba53feabd3")
    private SmAttribute projectDescrAtt;

    @objid ("5650570f-6e71-4f19-8436-0f1ab0fa3633")
    private SmDependency diagramRootDep;

    @objid ("4d5a6aac-46f2-4d8e-bb72-7bf6c00f36e1")
    private SmDependency modelDep;

    @objid ("56c64414-1aed-47a9-ab6b-182cad767e03")
    public ProjectSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("5ba217f7-72ef-44d3-ae61-70ca9de4d38e")
    @Override
    public String getName() {
        return "Project";
    }

    @objid ("d09ee6dd-2270-451c-846e-6336368d6bbb")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d009bdf8-ff89-4cc6-a8af-cc686b7b7a75")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Project.class;
    }

    @objid ("0bbcc2e6-d1e7-4c46-a690-a583e52b4b1e")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("2fefe422-5b4f-4ce4-87e2-6f18f6aad029")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("de1f4572-48c2-460b-88ad-dc94ad10ea95")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ProjectObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.projectContextAtt = new ProjectContextSmAttribute();
        this.projectContextAtt.init("ProjectContext", this, String.class );
        registerAttribute(this.projectContextAtt);
        
        this.projectDescrAtt = new ProjectDescrSmAttribute();
        this.projectDescrAtt.init("ProjectDescr", this, String.class );
        registerAttribute(this.projectDescrAtt);
        
        
        // Initialize and register the SmDependency
        this.diagramRootDep = new DiagramRootSmDependency();
        this.diagramRootDep.init("DiagramRoot", this, metamodel.getMClass("DiagramSet"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.diagramRootDep);
        
        this.modelDep = new ModelSmDependency();
        this.modelDep.init("Model", this, metamodel.getMClass("Package"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.modelDep);
    }

    @objid ("e4bc3176-5db7-4d17-ae2b-cd49f646af11")
    public SmAttribute getProjectContextAtt() {
        if (this.projectContextAtt == null) {
        	this.projectContextAtt = this.getAttributeDef("ProjectContext");
        }
        return this.projectContextAtt;
    }

    @objid ("2e88884e-46ef-4870-8494-723ecf579841")
    public SmAttribute getProjectDescrAtt() {
        if (this.projectDescrAtt == null) {
        	this.projectDescrAtt = this.getAttributeDef("ProjectDescr");
        }
        return this.projectDescrAtt;
    }

    @objid ("df071876-fc4a-4ea0-bbda-3e3f94a025ad")
    public SmDependency getDiagramRootDep() {
        if (this.diagramRootDep == null) {
        	this.diagramRootDep = this.getDependencyDef("DiagramRoot");
        }
        return this.diagramRootDep;
    }

    @objid ("4073330e-c27e-4d2c-b0f8-d33382293ca9")
    public SmDependency getModelDep() {
        if (this.modelDep == null) {
        	this.modelDep = this.getDependencyDef("Model");
        }
        return this.modelDep;
    }

    @objid ("1b07c50d-93c4-46d6-8d34-f233aca6b0e0")
    private static class ProjectObjectFactory implements ISmObjectFactory {
        @objid ("7d8beb98-df0e-4553-ab6d-b79f49bca252")
        private ProjectSmClass smClass;

        @objid ("2c716591-c9eb-45b6-9b4b-ba9eb3e71d53")
        public ProjectObjectFactory(ProjectSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ece2f2b4-6493-48b0-b203-b04516734da0")
        @Override
        public ISmObjectData createData() {
            return new ProjectData(this.smClass);
        }

        @objid ("649085b1-df05-4abb-b613-01c61da4efa5")
        @Override
        public SmObjectImpl createImpl() {
            return new ProjectImpl();
        }

    }

    @objid ("d8feada1-672d-4cbb-99d6-d6ef069d4b44")
    public static class ProjectContextSmAttribute extends SmAttribute {
        @objid ("43143dec-601e-415e-a89a-91fd323b6517")
        public Object getValue(ISmObjectData data) {
            return ((ProjectData) data).mProjectContext;
        }

        @objid ("36a261bc-821d-48a1-9db1-eb025103a9fa")
        public void setValue(ISmObjectData data, Object value) {
            ((ProjectData) data).mProjectContext = value;
        }

    }

    @objid ("593dac72-d7cc-493c-90ec-b5f7fb364ab7")
    public static class ProjectDescrSmAttribute extends SmAttribute {
        @objid ("5852f14c-cd48-4980-91d1-8eb3af413d9d")
        public Object getValue(ISmObjectData data) {
            return ((ProjectData) data).mProjectDescr;
        }

        @objid ("49a87770-9697-4d41-a5fe-3a681fd3e2bc")
        public void setValue(ISmObjectData data, Object value) {
            ((ProjectData) data).mProjectDescr = value;
        }

    }

    @objid ("a9f1230e-0ab0-4d90-97dc-4ab1fe989a93")
    public static class DiagramRootSmDependency extends SmSingleDependency {
        @objid ("06c538c9-a2cd-4af9-a0f7-a9ac72505f8b")
        private SmDependency symetricDep;

        @objid ("6369e36e-9348-4af5-a753-4d2efbd2f016")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ProjectData) data).mDiagramRoot;
        }

        @objid ("bdb0cf16-985c-42f1-a882-9c914a49893c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ProjectData) data).mDiagramRoot = value;
        }

        @objid ("8e074fe5-9b4a-4f1a-a6b4-fe6e40f469b5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DiagramSetSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("377b8556-1f2a-4ace-b6d7-dd5fa6c9b09f")
    public static class ModelSmDependency extends SmSingleDependency {
        @objid ("e1c50510-31e3-442d-b36e-14693d2eee06")
        private SmDependency symetricDep;

        @objid ("bb57d8df-a635-44f5-b9d4-6d4f92bd2d03")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ProjectData) data).mModel;
        }

        @objid ("50339165-1d61-42b1-934d-3be5b7f497bc")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ProjectData) data).mModel = value;
        }

        @objid ("dc932ff0-c797-42d3-9eea-51d2e6221537")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PackageSmClass)this.getTarget()).getRepresentedDep();
            }
            return this.symetricDep;
        }

    }

}
