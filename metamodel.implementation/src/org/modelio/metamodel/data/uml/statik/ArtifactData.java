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
    @objid ("497be1a1-6bd7-46b2-ae19-5a5719833c45")
    @SmaMetaAttribute(metaName="FileName", type=String.class, smAttributeClass=Metadata.FileNameSmAttribute.class)
     Object mFileName = "";

    @objid ("d42b8420-a9fc-4386-8728-268f0e8b8c57")
    @SmaMetaAssociation(metaName="Utilized", typeDataClass=ManifestationData.class, min=0, max=-1, smAssociationClass=Metadata.UtilizedSmDependency.class, component = true)
     List<SmObjectImpl> mUtilized = null;

    @objid ("8a11e9de-229a-495e-a7d6-a56f3f6bde25")
    @SmaMetaAssociation(metaName="DeploymentLocation", typeDataClass=NodeData.class, min=0, max=-1, smAssociationClass=Metadata.DeploymentLocationSmDependency.class)
     List<SmObjectImpl> mDeploymentLocation = null;

    @objid ("43c66d04-fc5f-417f-aead-ec80bd76e87f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005945de-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f57bce88-a10d-4ffc-a65f-5ba02441eea5")
        private static SmClass smClass = null;

        @objid ("bffa7a0a-f646-4302-b0ad-b1817f141df0")
        private static SmAttribute FileNameAtt = null;

        @objid ("a50dea0e-92d2-4d64-862a-299161bcbac8")
        private static SmDependency UtilizedDep = null;

        @objid ("b2f7c38b-7595-4232-95ae-40518070c955")
        private static SmDependency DeploymentLocationDep = null;

        @objid ("797fda40-30d2-4279-959f-0e2ca3a72e87")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ArtifactData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bc1eecdd-5bcc-47db-9912-5366c588d849")
        public static SmAttribute FileNameAtt() {
            if (FileNameAtt == null) {
            	FileNameAtt = classof().getAttributeDef("FileName");
            }
            return FileNameAtt;
        }

        @objid ("ece5103a-dbed-4ed2-98a2-4b50e39cfaca")
        public static SmDependency UtilizedDep() {
            if (UtilizedDep == null) {
            	UtilizedDep = classof().getDependencyDef("Utilized");
            }
            return UtilizedDep;
        }

        @objid ("e2057b32-2bab-44a7-bc38-3c66368a9aed")
        public static SmDependency DeploymentLocationDep() {
            if (DeploymentLocationDep == null) {
            	DeploymentLocationDep = classof().getDependencyDef("DeploymentLocation");
            }
            return DeploymentLocationDep;
        }

        @objid ("7a1fa498-5f44-490b-85e9-8eef5315ab05")
        public static SmAttribute getFileNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FileNameAtt;
        }

        @objid ("01fd1dde-9301-4c6f-b045-9dcefba00f84")
        public static SmDependency getDeploymentLocationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DeploymentLocationDep;
        }

        @objid ("82bed505-31d1-476f-bb5c-f23a6102278b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c12b384b-7a34-46b5-9a29-4b1647535f53")
        public static SmDependency getUtilizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UtilizedDep;
        }

        @objid ("0059868e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("48dd7bb6-2af8-46c6-bf94-6ef8a618dfb9")
            public ISmObjectData createData() {
                return new ArtifactData();
            }

            @objid ("fa233858-fe2b-46f4-8d4e-3b40a4835b12")
            public SmObjectImpl createImpl() {
                return new ArtifactImpl();
            }

        }

        @objid ("0059e8c2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FileNameSmAttribute extends SmAttribute {
            @objid ("70f8240d-4bf8-4999-81b6-162843d86dc2")
            public Object getValue(ISmObjectData data) {
                return ((ArtifactData) data).mFileName;
            }

            @objid ("f11f4b8f-09f9-4b63-84ef-67a9da3c636c")
            public void setValue(ISmObjectData data, Object value) {
                ((ArtifactData) data).mFileName = value;
            }

        }

        @objid ("005a4e02-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DeploymentLocationSmDependency extends SmMultipleDependency {
            @objid ("938a2e18-12a3-42da-a011-9336339c047e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ArtifactData)data).mDeploymentLocation != null)? ((ArtifactData)data).mDeploymentLocation:SmMultipleDependency.EMPTY;
            }

            @objid ("75b71521-f7a0-4892-8f24-574579aafdde")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ArtifactData) data).mDeploymentLocation = new ArrayList<>(initialCapacity);
                return ((ArtifactData) data).mDeploymentLocation;
            }

            @objid ("1a841610-b705-4a7a-b25b-10b9f5979f9d")
            @Override
            public SmDependency getSymetric() {
                return NodeData.Metadata.ResidentDep();
            }

        }

        @objid ("005ab1ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UtilizedSmDependency extends SmMultipleDependency {
            @objid ("4593a23b-5699-4305-87d0-2f3b491c89e8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ArtifactData)data).mUtilized != null)? ((ArtifactData)data).mUtilized:SmMultipleDependency.EMPTY;
            }

            @objid ("821d98f7-d216-49b2-a716-ba35844c343b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ArtifactData) data).mUtilized = new ArrayList<>(initialCapacity);
                return ((ArtifactData) data).mUtilized;
            }

            @objid ("3b275016-6a61-4079-a6ec-1f1d57883092")
            @Override
            public SmDependency getSymetric() {
                return ManifestationData.Metadata.OwnerDep();
            }

        }

    }

}
