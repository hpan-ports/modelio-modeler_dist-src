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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ManifestationData;
import org.modelio.metamodel.data.uml.statik.NodeData;
import org.modelio.metamodel.impl.uml.statik.ArtifactImpl;
import org.modelio.metamodel.uml.statik.Artifact;
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

@objid ("009712f6-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Artifact.class, factory=ArtifactData.Metadata.ObjectFactory.class, cmsnode=true)
public class ArtifactData extends ClassifierData {
    @objid ("42a71b8d-fad7-4b5f-9524-085183ff2fe1")
    @SmaMetaAttribute(metaName="FileName", type=String.class, smAttributeClass=Metadata.FileNameSmAttribute.class)
     Object mFileName = "";

    @objid ("28cd0954-e021-4caa-9da5-c48f29ea3e49")
    @SmaMetaAssociation(metaName="Utilized", typeDataClass=ManifestationData.class, min=0, max=-1, smAssociationClass=Metadata.UtilizedSmDependency.class, component = true)
     List<SmObjectImpl> mUtilized = null;

    @objid ("428627df-f081-46ad-8ebf-de1a09995ef5")
    @SmaMetaAssociation(metaName="DeploymentLocation", typeDataClass=NodeData.class, min=0, max=-1, smAssociationClass=Metadata.DeploymentLocationSmDependency.class)
     List<SmObjectImpl> mDeploymentLocation = null;

    @objid ("b76fa68e-db3f-49df-91d9-c3e576ea5e06")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005945de-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("72e2e3e5-20ea-4dec-b7cc-80623e62ceb6")
        private static SmClass smClass = null;

        @objid ("74219835-92b5-4d74-9f4f-9a64cd228327")
        private static SmAttribute FileNameAtt = null;

        @objid ("7d3f9f76-600f-45b7-81dc-682b80aac53b")
        private static SmDependency UtilizedDep = null;

        @objid ("6c7198b7-14ea-4872-8143-442a8b3e6539")
        private static SmDependency DeploymentLocationDep = null;

        @objid ("d7d3fc2a-e432-4b39-bfcd-8f4e9edb372a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ArtifactData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3736f7b4-6067-46d2-b72f-ab917027fd40")
        public static SmAttribute FileNameAtt() {
            if (FileNameAtt == null) {
            	FileNameAtt = classof().getAttributeDef("FileName");
            }
            return FileNameAtt;
        }

        @objid ("f6f089d2-d9c2-442a-a272-1bcbae2aff73")
        public static SmDependency UtilizedDep() {
            if (UtilizedDep == null) {
            	UtilizedDep = classof().getDependencyDef("Utilized");
            }
            return UtilizedDep;
        }

        @objid ("53fdb071-d6c8-4aad-968e-7c85091209bd")
        public static SmDependency DeploymentLocationDep() {
            if (DeploymentLocationDep == null) {
            	DeploymentLocationDep = classof().getDependencyDef("DeploymentLocation");
            }
            return DeploymentLocationDep;
        }

        @objid ("ba922280-07fc-4f89-9ff8-227bd6fe02e4")
        public static SmDependency getDeploymentLocationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DeploymentLocationDep;
        }

        @objid ("0e04e1c5-b950-4b43-a691-5f083ae81444")
        public static SmAttribute getFileNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FileNameAtt;
        }

        @objid ("e56e828b-ab17-4df9-a75e-981f58e0f42e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("80a5435c-a301-497a-84eb-5e14285e06c0")
        public static SmDependency getUtilizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UtilizedDep;
        }

        @objid ("0059868e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9cdbd9b4-9258-4504-bb82-6f1896241953")
            public ISmObjectData createData() {
                return new ArtifactData();
            }

            @objid ("d61f45c5-ce63-4cd0-9a12-b12d75d02fda")
            public SmObjectImpl createImpl() {
                return new ArtifactImpl();
            }

        }

        @objid ("0059e8c2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FileNameSmAttribute extends SmAttribute {
            @objid ("ebec6fec-cc8f-4316-a3ce-f5d611db0be7")
            public Object getValue(ISmObjectData data) {
                return ((ArtifactData) data).mFileName;
            }

            @objid ("ca1a8317-17c9-491b-9bd1-558feb1af6d0")
            public void setValue(ISmObjectData data, Object value) {
                ((ArtifactData) data).mFileName = value;
            }

        }

        @objid ("005a4e02-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DeploymentLocationSmDependency extends SmMultipleDependency {
            @objid ("4e766021-c652-4578-aa0a-85040bc166d4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ArtifactData)data).mDeploymentLocation != null)? ((ArtifactData)data).mDeploymentLocation:SmMultipleDependency.EMPTY;
            }

            @objid ("748adb20-f0af-4774-a4f0-8a73659594da")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ArtifactData) data).mDeploymentLocation = new ArrayList<>(initialCapacity);
                return ((ArtifactData) data).mDeploymentLocation;
            }

            @objid ("e9520d6f-1c7e-4fff-8a19-7e1197ee1d18")
            @Override
            public SmDependency getSymetric() {
                return NodeData.Metadata.ResidentDep();
            }

        }

        @objid ("005ab1ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UtilizedSmDependency extends SmMultipleDependency {
            @objid ("c01c5849-c194-45aa-8399-f78dd136a672")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ArtifactData)data).mUtilized != null)? ((ArtifactData)data).mUtilized:SmMultipleDependency.EMPTY;
            }

            @objid ("a720a865-22da-4d6a-8b0b-6270f01fc44e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ArtifactData) data).mUtilized = new ArrayList<>(initialCapacity);
                return ((ArtifactData) data).mUtilized;
            }

            @objid ("16fdcd90-1b3e-4c97-b82d-74c8255ee8da")
            @Override
            public SmDependency getSymetric() {
                return ManifestationData.Metadata.OwnerDep();
            }

        }

    }

}
