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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.ManifestationSmClass;
import org.modelio.metamodel.impl.uml.statik.NodeSmClass;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1cf1c572-23cc-4aa8-b86c-f4409fc31cba")
public class ArtifactSmClass extends ClassifierSmClass {
    @objid ("1c7c32af-4356-4524-b867-cabf8f2a813d")
    private SmAttribute fileNameAtt;

    @objid ("30813c90-7bf0-4f9d-9d50-c3a87adb88c7")
    private SmDependency utilizedDep;

    @objid ("e1efdbc6-4491-4ae0-b2b0-9ae011a33acd")
    private SmDependency deploymentLocationDep;

    @objid ("082df1d3-b89c-4c56-869f-107c92da8df3")
    public ArtifactSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("6fe32a14-a40e-430b-984f-09478c29f580")
    @Override
    public String getName() {
        return "Artifact";
    }

    @objid ("60d95d4d-3591-4820-8830-6950966fe633")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("19de2c57-3195-4835-92f4-d80d4004beaa")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Artifact.class;
    }

    @objid ("59d8e3de-5f3d-4242-b7dc-8e3e3b4633ab")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("caf7dfdd-0ee9-4799-937c-e9d27a19e77b")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("7358d722-0c30-4204-b7d0-577ebfae1a75")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Classifier");
        this.registerFactory(new ArtifactObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.fileNameAtt = new FileNameSmAttribute();
        this.fileNameAtt.init("FileName", this, String.class );
        registerAttribute(this.fileNameAtt);
        
        
        // Initialize and register the SmDependency
        this.utilizedDep = new UtilizedSmDependency();
        this.utilizedDep.init("Utilized", this, metamodel.getMClass("Manifestation"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.utilizedDep);
        
        this.deploymentLocationDep = new DeploymentLocationSmDependency();
        this.deploymentLocationDep.init("DeploymentLocation", this, metamodel.getMClass("Node"), 0, -1 );
        registerDependency(this.deploymentLocationDep);
    }

    @objid ("a14991e3-66c6-4472-a02f-9220f949aeb9")
    public SmAttribute getFileNameAtt() {
        if (this.fileNameAtt == null) {
        	this.fileNameAtt = this.getAttributeDef("FileName");
        }
        return this.fileNameAtt;
    }

    @objid ("8d83babb-342b-4d6c-bc7e-d44be37bf432")
    public SmDependency getUtilizedDep() {
        if (this.utilizedDep == null) {
        	this.utilizedDep = this.getDependencyDef("Utilized");
        }
        return this.utilizedDep;
    }

    @objid ("d60012c3-d0c9-478a-8b48-2dbf2bd2e37f")
    public SmDependency getDeploymentLocationDep() {
        if (this.deploymentLocationDep == null) {
        	this.deploymentLocationDep = this.getDependencyDef("DeploymentLocation");
        }
        return this.deploymentLocationDep;
    }

    @objid ("cc4b1148-3f24-4732-8a2c-a00ab68bda03")
    private static class ArtifactObjectFactory implements ISmObjectFactory {
        @objid ("d3f9e304-aba4-4c99-a142-070651229060")
        private ArtifactSmClass smClass;

        @objid ("0a15b2d0-d934-427f-9265-79428a6aaf8e")
        public ArtifactObjectFactory(ArtifactSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4ffe75f4-6e7e-421e-91f1-e05e7f284049")
        @Override
        public ISmObjectData createData() {
            return new ArtifactData(this.smClass);
        }

        @objid ("97d8423b-2236-4ba4-9df4-58206573ebf5")
        @Override
        public SmObjectImpl createImpl() {
            return new ArtifactImpl();
        }

    }

    @objid ("a183d0f8-feb3-43ec-b4a5-3c4a5716c4dd")
    public static class FileNameSmAttribute extends SmAttribute {
        @objid ("f51e97f0-932b-4733-9017-fcfd01d16174")
        public Object getValue(ISmObjectData data) {
            return ((ArtifactData) data).mFileName;
        }

        @objid ("c4528f2e-3d20-4dd4-b49d-238dede3ad0c")
        public void setValue(ISmObjectData data, Object value) {
            ((ArtifactData) data).mFileName = value;
        }

    }

    @objid ("01f730c9-a454-42a2-bcb6-d24fd24f5da8")
    public static class UtilizedSmDependency extends SmMultipleDependency {
        @objid ("d4ad402c-7fa6-42e2-a70e-d95a2f2d12a5")
        private SmDependency symetricDep;

        @objid ("5d4cb983-fd83-4d8c-9fca-61299700a68d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ArtifactData)data).mUtilized != null)? ((ArtifactData)data).mUtilized:SmMultipleDependency.EMPTY;
        }

        @objid ("4da8e98b-46d3-42f9-91bb-79702d81ab0a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ArtifactData) data).mUtilized = values;
        }

        @objid ("c4023d7b-70c2-4edf-a693-cf08a26aae15")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ManifestationSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ece02e9d-60f1-4093-ba1c-26ceed9b1e99")
    public static class DeploymentLocationSmDependency extends SmMultipleDependency {
        @objid ("e0da033c-a7e7-41a0-8105-12756049fe81")
        private SmDependency symetricDep;

        @objid ("a7e5ae6a-8353-4d37-8cb8-62ee25dd5a45")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ArtifactData)data).mDeploymentLocation != null)? ((ArtifactData)data).mDeploymentLocation:SmMultipleDependency.EMPTY;
        }

        @objid ("84e8fe42-9e66-447f-a31e-37ac6d041750")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ArtifactData) data).mDeploymentLocation = values;
        }

        @objid ("a24bdc64-f76a-4448-abc5-c47d4b1fc2ea")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NodeSmClass)this.getTarget()).getResidentDep();
            }
            return this.symetricDep;
        }

    }

}
