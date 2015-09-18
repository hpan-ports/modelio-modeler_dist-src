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
package org.modelio.metamodel.data.mda;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.diagrams.DiagramSetData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.mda.ProjectImpl;
import org.modelio.metamodel.mda.Project;
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

@objid ("0066673c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Project.class, factory=ProjectData.Metadata.ObjectFactory.class, cmsnode=true)
public class ProjectData extends ModelElementData {
    @objid ("9ee23178-c15b-446b-8cde-8e60173921ad")
    @SmaMetaAttribute(metaName="ProjectContext", type=String.class, smAttributeClass=Metadata.ProjectContextSmAttribute.class)
     Object mProjectContext = "";

    @objid ("07e13c44-2919-482d-8efc-fbad630faef7")
    @SmaMetaAttribute(metaName="ProjectDescr", type=String.class, smAttributeClass=Metadata.ProjectDescrSmAttribute.class)
     Object mProjectDescr = "";

    @objid ("bcb73cf9-fce0-487e-9235-dfccdb9d01dc")
    @SmaMetaAssociation(metaName="DiagramRoot", typeDataClass=DiagramSetData.class, min=1, max=1, smAssociationClass=Metadata.DiagramRootSmDependency.class, component = true)
     SmObjectImpl mDiagramRoot;

    @objid ("d6a72c86-9b0d-484a-a09a-75e94e2e0cb7")
    @SmaMetaAssociation(metaName="Model", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ModelSmDependency.class, component = true)
     SmObjectImpl mModel;

    @objid ("2a97ccb9-0782-4b90-8958-0b70b4fa166b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005b5fa4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d6206744-7152-40de-88db-f571c4e0be73")
        private static SmClass smClass = null;

        @objid ("952d3919-6e64-40c6-9d5e-b52c54a987c8")
        private static SmAttribute ProjectContextAtt = null;

        @objid ("6e3ed90d-9553-4985-9221-1a7025886870")
        private static SmAttribute ProjectDescrAtt = null;

        @objid ("df6e9f0d-d427-41ad-bffb-c1419960d363")
        private static SmDependency DiagramRootDep = null;

        @objid ("2b8eea99-2728-4cde-8ddf-687dcee2f989")
        private static SmDependency ModelDep = null;

        @objid ("bffc24f1-35e4-4011-b510-2cc7b144acb8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProjectData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e3abf443-e78a-4b52-b325-045bbd585dad")
        public static SmAttribute ProjectContextAtt() {
            if (ProjectContextAtt == null) {
            	ProjectContextAtt = classof().getAttributeDef("ProjectContext");
            }
            return ProjectContextAtt;
        }

        @objid ("d4fc3488-7a7f-4c6a-8450-01bae6fabd2e")
        public static SmAttribute ProjectDescrAtt() {
            if (ProjectDescrAtt == null) {
            	ProjectDescrAtt = classof().getAttributeDef("ProjectDescr");
            }
            return ProjectDescrAtt;
        }

        @objid ("d72b9097-41cb-43f3-8d27-47fbb5d89c16")
        public static SmDependency DiagramRootDep() {
            if (DiagramRootDep == null) {
            	DiagramRootDep = classof().getDependencyDef("DiagramRoot");
            }
            return DiagramRootDep;
        }

        @objid ("e86fd05d-b1a8-4294-bbc6-04e54daa2bf1")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("51ae60cd-f830-4624-8000-772513b89848")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("770838df-a448-43e9-bec3-3d2c6003c76b")
        public static SmDependency getDiagramRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiagramRootDep;
        }

        @objid ("0980b053-76ba-4ff7-b68f-2624ac9e6251")
        public static SmAttribute getProjectDescrAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProjectDescrAtt;
        }

        @objid ("ee1a15e0-f90b-4048-a397-bd2dedcd678c")
        public static SmAttribute getProjectContextAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProjectContextAtt;
        }

        @objid ("556e516e-54db-4709-9aa4-1597e6163cc0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005ba126-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7c86be0e-11b7-40a1-a28a-45c00776f909")
            public ISmObjectData createData() {
                return new ProjectData();
            }

            @objid ("f929c009-d298-479a-94f0-60104d5053bd")
            public SmObjectImpl createImpl() {
                return new ProjectImpl();
            }

        }

        @objid ("005c049a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProjectContextSmAttribute extends SmAttribute {
            @objid ("f212c10b-e127-4d35-ad3f-727f0f2c0650")
            public Object getValue(ISmObjectData data) {
                return ((ProjectData) data).mProjectContext;
            }

            @objid ("2d01f3e9-e980-4f31-9752-422c84d3918b")
            public void setValue(ISmObjectData data, Object value) {
                ((ProjectData) data).mProjectContext = value;
            }

        }

        @objid ("005c69bc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProjectDescrSmAttribute extends SmAttribute {
            @objid ("b48e6b9f-7821-4e8b-af78-cd4cdf482fa4")
            public Object getValue(ISmObjectData data) {
                return ((ProjectData) data).mProjectDescr;
            }

            @objid ("55084366-bf23-4436-97ba-56d6366e1c40")
            public void setValue(ISmObjectData data, Object value) {
                ((ProjectData) data).mProjectDescr = value;
            }

        }

        @objid ("005ccf38-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("74838287-58d6-4874-8e37-ae6818084570")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProjectData) data).mModel;
            }

            @objid ("7ea423cc-702d-4879-b6cb-b435df849ba2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProjectData) data).mModel = value;
            }

            @objid ("5d4fee9a-68ad-40f5-b576-321c6fe13535")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.RepresentedDep();
            }

        }

        @objid ("005e2112-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DiagramRootSmDependency extends SmSingleDependency {
            @objid ("6a695179-df6b-4f4f-9fba-f10ddc497ad8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProjectData) data).mDiagramRoot;
            }

            @objid ("a4e07023-a465-4c49-8b17-b373908de97c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProjectData) data).mDiagramRoot = value;
            }

            @objid ("0a316bed-8b14-4bc1-8f79-7155a5808321")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.OwnerDep();
            }

        }

    }

}
