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
    @objid ("b06f990f-6b09-44e9-b501-e6ac8139a89c")
    @SmaMetaAttribute(metaName="FileName", type=String.class, smAttributeClass=Metadata.FileNameSmAttribute.class)
     Object mFileName = "";

    @objid ("0624eddd-12e6-479f-8ec9-9d04a611024b")
    @SmaMetaAssociation(metaName="Utilized", typeDataClass=ManifestationData.class, min=0, max=-1, smAssociationClass=Metadata.UtilizedSmDependency.class, component = true)
     List<SmObjectImpl> mUtilized = null;

    @objid ("36c68912-45f9-4fae-8c43-970b5d4fc638")
    @SmaMetaAssociation(metaName="DeploymentLocation", typeDataClass=NodeData.class, min=0, max=-1, smAssociationClass=Metadata.DeploymentLocationSmDependency.class)
     List<SmObjectImpl> mDeploymentLocation = null;

    @objid ("c374e182-1c50-4aaf-9d09-a755ee1bc667")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005945de-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("014d4a4e-4175-4bb7-ab6b-5f946ce242c4")
        private static SmClass smClass = null;

        @objid ("11bc9451-3298-4a1a-bd99-9757460cc1d7")
        private static SmAttribute FileNameAtt = null;

        @objid ("805dc9f2-8067-4baa-a838-21ad1c9c379a")
        private static SmDependency UtilizedDep = null;

        @objid ("484ec32d-09ab-449b-94e3-6a6a2c6c5668")
        private static SmDependency DeploymentLocationDep = null;

        @objid ("4fa73194-72be-4683-b684-45cdc7d3776e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ArtifactData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("10327712-188b-43b3-9c1b-abc23e47ef9f")
        public static SmAttribute FileNameAtt() {
            if (FileNameAtt == null) {
            	FileNameAtt = classof().getAttributeDef("FileName");
            }
            return FileNameAtt;
        }

        @objid ("510a4682-27c0-410b-ba7c-ddd331b332b7")
        public static SmDependency UtilizedDep() {
            if (UtilizedDep == null) {
            	UtilizedDep = classof().getDependencyDef("Utilized");
            }
            return UtilizedDep;
        }

        @objid ("7e71f6f1-158f-485f-bc8c-4e115ef2635e")
        public static SmDependency DeploymentLocationDep() {
            if (DeploymentLocationDep == null) {
            	DeploymentLocationDep = classof().getDependencyDef("DeploymentLocation");
            }
            return DeploymentLocationDep;
        }

        @objid ("f32a8a77-28fd-4fd0-82a4-dca317411c56")
        public static SmDependency getUtilizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UtilizedDep;
        }

        @objid ("13547c0b-a7e7-420a-a0b5-0947b2533724")
        public static SmDependency getDeploymentLocationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DeploymentLocationDep;
        }

        @objid ("7b88c243-d45e-444f-b4b8-ecb95eb6f6c8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("194ac342-0d68-4887-a4a7-12eebbcf4336")
        public static SmAttribute getFileNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FileNameAtt;
        }

        @objid ("0059868e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("23fe8df4-e27b-42d9-be5c-be1a0da3f640")
            public ISmObjectData createData() {
                return new ArtifactData();
            }

            @objid ("d7e8bf99-9a63-4dbb-b3c9-1209b1db086e")
            public SmObjectImpl createImpl() {
                return new ArtifactImpl();
            }

        }

        @objid ("0059e8c2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FileNameSmAttribute extends SmAttribute {
            @objid ("bafb67b1-4d78-498a-823c-292414c3bc5a")
            public Object getValue(ISmObjectData data) {
                return ((ArtifactData) data).mFileName;
            }

            @objid ("b91a0d65-03b8-4df1-b13d-3dbea06e831a")
            public void setValue(ISmObjectData data, Object value) {
                ((ArtifactData) data).mFileName = value;
            }

        }

        @objid ("005a4e02-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DeploymentLocationSmDependency extends SmMultipleDependency {
            @objid ("0c0f1a8c-e06f-4940-b29d-4fd478d105e5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ArtifactData)data).mDeploymentLocation != null)? ((ArtifactData)data).mDeploymentLocation:SmMultipleDependency.EMPTY;
            }

            @objid ("b052abbb-5e09-4bd6-bd3c-7e9ebd190ddc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ArtifactData) data).mDeploymentLocation = new ArrayList<>(initialCapacity);
                return ((ArtifactData) data).mDeploymentLocation;
            }

            @objid ("f735105b-6eca-4696-bf93-e15588ea53fb")
            @Override
            public SmDependency getSymetric() {
                return NodeData.Metadata.ResidentDep();
            }

        }

        @objid ("005ab1ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UtilizedSmDependency extends SmMultipleDependency {
            @objid ("525c1e2f-d792-445f-ae67-274d15366f62")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ArtifactData)data).mUtilized != null)? ((ArtifactData)data).mUtilized:SmMultipleDependency.EMPTY;
            }

            @objid ("d4f6290d-8054-48c1-9ac0-623a10bbfb4e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ArtifactData) data).mUtilized = new ArrayList<>(initialCapacity);
                return ((ArtifactData) data).mUtilized;
            }

            @objid ("69303056-b016-4359-8612-ca49788fe0d6")
            @Override
            public SmDependency getSymetric() {
                return ManifestationData.Metadata.OwnerDep();
            }

        }

    }

}
