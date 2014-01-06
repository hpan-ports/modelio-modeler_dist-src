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
    @objid ("100da602-bd42-4240-ac84-606f1ecc0677")
    @SmaMetaAttribute(metaName="ProjectContext", type=String.class, smAttributeClass=Metadata.ProjectContextSmAttribute.class)
     Object mProjectContext = "";

    @objid ("d732570a-9f3c-465f-8569-afbb4c3a80df")
    @SmaMetaAttribute(metaName="ProjectDescr", type=String.class, smAttributeClass=Metadata.ProjectDescrSmAttribute.class)
     Object mProjectDescr = "";

    @objid ("a63d1a7f-9410-48bf-89f5-1ade8bfc34b6")
    @SmaMetaAssociation(metaName="DiagramRoot", typeDataClass=DiagramSetData.class, min=1, max=1, smAssociationClass=Metadata.DiagramRootSmDependency.class, component = true)
     SmObjectImpl mDiagramRoot;

    @objid ("fb040e05-a95e-4447-8de3-dcba0317ff8c")
    @SmaMetaAssociation(metaName="Model", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ModelSmDependency.class, component = true)
     SmObjectImpl mModel;

    @objid ("21a39850-e7db-4bd7-a5d9-22ec5efd9d70")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005b5fa4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f2e05667-3a89-493b-a4ea-d9089aebd218")
        private static SmClass smClass = null;

        @objid ("fb27be1f-0f64-4ca8-aba1-28e8197526f0")
        private static SmAttribute ProjectContextAtt = null;

        @objid ("20f1e2c9-ecb0-4669-8657-0ec5f00c819d")
        private static SmAttribute ProjectDescrAtt = null;

        @objid ("524b89b3-bbb1-4f77-88be-aad42473f4e4")
        private static SmDependency DiagramRootDep = null;

        @objid ("f18ca95f-6896-4e48-a002-3b783995261a")
        private static SmDependency ModelDep = null;

        @objid ("5bb18139-db1e-4517-85ee-e76851620f10")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProjectData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4913548f-428e-4128-b996-b88e0f189d8a")
        public static SmAttribute ProjectContextAtt() {
            if (ProjectContextAtt == null) {
            	ProjectContextAtt = classof().getAttributeDef("ProjectContext");
            }
            return ProjectContextAtt;
        }

        @objid ("501b803f-092d-4f72-870a-61102868180a")
        public static SmAttribute ProjectDescrAtt() {
            if (ProjectDescrAtt == null) {
            	ProjectDescrAtt = classof().getAttributeDef("ProjectDescr");
            }
            return ProjectDescrAtt;
        }

        @objid ("fbc37de3-15c9-459e-9c16-319d4d3af8c0")
        public static SmDependency DiagramRootDep() {
            if (DiagramRootDep == null) {
            	DiagramRootDep = classof().getDependencyDef("DiagramRoot");
            }
            return DiagramRootDep;
        }

        @objid ("97c91e0a-99c5-4c70-acfa-c02db95673ae")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("3c96a32d-46be-468e-82d7-9f866ad1953e")
        public static SmDependency getDiagramRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiagramRootDep;
        }

        @objid ("fbffa266-b7b0-4bf5-9558-d525bbdee903")
        public static SmAttribute getProjectContextAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProjectContextAtt;
        }

        @objid ("2fb19685-92da-481f-96a9-0091b8d7cd4d")
        public static SmAttribute getProjectDescrAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProjectDescrAtt;
        }

        @objid ("13f286c9-6863-4c11-9eb8-d9d6e0253a94")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c3936c78-df7f-4933-8fbc-67c6654c86e0")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("005ba126-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9a477305-1463-45f5-8d96-af427535a72d")
            public ISmObjectData createData() {
                return new ProjectData();
            }

            @objid ("753a342f-417f-44dc-a678-9f120b839571")
            public SmObjectImpl createImpl() {
                return new ProjectImpl();
            }

        }

        @objid ("005c049a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProjectContextSmAttribute extends SmAttribute {
            @objid ("76b85869-3312-46b4-b7de-8042a4de62bc")
            public Object getValue(ISmObjectData data) {
                return ((ProjectData) data).mProjectContext;
            }

            @objid ("fe262630-306d-4edd-93ba-f80a54cbd6d0")
            public void setValue(ISmObjectData data, Object value) {
                ((ProjectData) data).mProjectContext = value;
            }

        }

        @objid ("005c69bc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProjectDescrSmAttribute extends SmAttribute {
            @objid ("fc5da64e-5d2d-4f3d-acbd-bdf28b3bfdcd")
            public Object getValue(ISmObjectData data) {
                return ((ProjectData) data).mProjectDescr;
            }

            @objid ("301c70ec-03ae-483c-aeb3-e3bde338bd10")
            public void setValue(ISmObjectData data, Object value) {
                ((ProjectData) data).mProjectDescr = value;
            }

        }

        @objid ("005ccf38-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("824a522b-b4bc-4fcd-b0ba-298f1b84fb4c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProjectData) data).mModel;
            }

            @objid ("4c211a49-87b0-422e-9520-17d53d1bd4fa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProjectData) data).mModel = value;
            }

            @objid ("b4339901-5786-4635-8dbe-472664b26f89")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.RepresentedDep();
            }

        }

        @objid ("005e2112-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DiagramRootSmDependency extends SmSingleDependency {
            @objid ("b51588c7-a341-45f1-a7f9-3a8cea4ac299")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProjectData) data).mDiagramRoot;
            }

            @objid ("01f79d67-81f3-4271-a5ff-b3e4732b028a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProjectData) data).mDiagramRoot = value;
            }

            @objid ("afb3482f-49e2-48ab-8b8d-812f2c955df8")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.OwnerDep();
            }

        }

    }

}
