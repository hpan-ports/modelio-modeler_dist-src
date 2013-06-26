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
    @objid ("adfbfb55-c384-4486-bf82-ac26f97a62d6")
    @SmaMetaAttribute(metaName="ProjectContext", type=String.class, smAttributeClass=Metadata.ProjectContextSmAttribute.class)
     Object mProjectContext = "";

    @objid ("525e7b39-3354-4726-89f0-227321beebf2")
    @SmaMetaAttribute(metaName="ProjectDescr", type=String.class, smAttributeClass=Metadata.ProjectDescrSmAttribute.class)
     Object mProjectDescr = "";

    @objid ("f65f32c7-9447-4fdc-9e98-1f509a7f1b5a")
    @SmaMetaAssociation(metaName="DiagramRoot", typeDataClass=DiagramSetData.class, min=1, max=1, smAssociationClass=Metadata.DiagramRootSmDependency.class, component = true)
     SmObjectImpl mDiagramRoot;

    @objid ("987b7434-a395-42bf-ae55-199d5667f7b4")
    @SmaMetaAssociation(metaName="Model", typeDataClass=PackageData.class, min=1, max=1, smAssociationClass=Metadata.ModelSmDependency.class, component = true)
     SmObjectImpl mModel;

    @objid ("b08644ce-3099-488d-9874-ddc26739f72c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005b5fa4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b6ea12d9-cc0f-4cc9-8f74-82e0be54b0d6")
        private static SmClass smClass = null;

        @objid ("bc0a98c2-7a40-455a-9ca4-895b1861c21b")
        private static SmAttribute ProjectContextAtt = null;

        @objid ("1c50775c-2e19-4a84-8d07-3169a9e873db")
        private static SmAttribute ProjectDescrAtt = null;

        @objid ("32c68ec8-92cb-4bfc-a20e-58a14385099e")
        private static SmDependency DiagramRootDep = null;

        @objid ("cb4b9c78-53ac-40bc-afbd-3c3f3f0ac20d")
        private static SmDependency ModelDep = null;

        @objid ("9f7ba343-0680-4e93-b253-e36f1b8c3d83")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProjectData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("addf873f-7a65-41d7-9a30-33046747c260")
        public static SmAttribute ProjectContextAtt() {
            if (ProjectContextAtt == null) {
            	ProjectContextAtt = classof().getAttributeDef("ProjectContext");
            }
            return ProjectContextAtt;
        }

        @objid ("df888982-4492-4530-8c58-60e724681680")
        public static SmAttribute ProjectDescrAtt() {
            if (ProjectDescrAtt == null) {
            	ProjectDescrAtt = classof().getAttributeDef("ProjectDescr");
            }
            return ProjectDescrAtt;
        }

        @objid ("fe4cfb37-5869-41c2-8e3b-e5173e162457")
        public static SmDependency DiagramRootDep() {
            if (DiagramRootDep == null) {
            	DiagramRootDep = classof().getDependencyDef("DiagramRoot");
            }
            return DiagramRootDep;
        }

        @objid ("ba1a794f-2e57-402a-9347-509332fd95a0")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("91875f1d-ed33-4de0-969c-9cd62454d9ed")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("cd92ef53-3d41-43a0-a318-da799cb4705b")
        public static SmAttribute getProjectContextAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProjectContextAtt;
        }

        @objid ("519fc331-e188-4d3f-9e53-23c91115d7bd")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("612ce061-a985-4413-aeb4-ccc8a5e2ec84")
        public static SmDependency getDiagramRootDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiagramRootDep;
        }

        @objid ("66f54fe1-c1ea-4888-a498-3a7fd18a5a5a")
        public static SmAttribute getProjectDescrAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProjectDescrAtt;
        }

        @objid ("005ba126-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9491b667-f9c4-42b4-b38d-73e0560bbd8e")
            public ISmObjectData createData() {
                return new ProjectData();
            }

            @objid ("08d52d9e-2114-42b5-b169-e3c5fe9e3004")
            public SmObjectImpl createImpl() {
                return new ProjectImpl();
            }

        }

        @objid ("005c049a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProjectContextSmAttribute extends SmAttribute {
            @objid ("56dcc50a-4ce2-465a-bd74-9c14d12fab90")
            public Object getValue(ISmObjectData data) {
                return ((ProjectData) data).mProjectContext;
            }

            @objid ("aae3509f-52eb-4518-a62e-adc8b849550f")
            public void setValue(ISmObjectData data, Object value) {
                ((ProjectData) data).mProjectContext = value;
            }

        }

        @objid ("005c69bc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProjectDescrSmAttribute extends SmAttribute {
            @objid ("4bc485fc-11e2-45ac-a649-cc849dd68582")
            public Object getValue(ISmObjectData data) {
                return ((ProjectData) data).mProjectDescr;
            }

            @objid ("49598fec-e83f-4615-be40-6fe588410db7")
            public void setValue(ISmObjectData data, Object value) {
                ((ProjectData) data).mProjectDescr = value;
            }

        }

        @objid ("005ccf38-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("9eadfc5a-a360-48c8-ac9c-87170851a382")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProjectData) data).mModel;
            }

            @objid ("f654d786-d448-4528-a441-5139733030b1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProjectData) data).mModel = value;
            }

            @objid ("1ab912d4-72c9-4b58-9363-c0fd7f39dc31")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.RepresentedDep();
            }

        }

        @objid ("005e2112-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DiagramRootSmDependency extends SmSingleDependency {
            @objid ("d27b059b-0356-40ea-a729-0985b8b10fa6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProjectData) data).mDiagramRoot;
            }

            @objid ("e230131c-ebfc-44d0-baa5-97346bd61f40")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProjectData) data).mDiagramRoot = value;
            }

            @objid ("ee678ef3-f316-437a-a03d-7d5d773bc30f")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.OwnerDep();
            }

        }

    }

}
