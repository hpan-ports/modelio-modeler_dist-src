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
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnParticipantSmClass;
import org.modelio.metamodel.impl.mda.ProjectSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.impl.uml.statik.PackageImportSmClass;
import org.modelio.metamodel.impl.uml.statik.PackageMergeSmClass;
import org.modelio.metamodel.uml.statik.Package;
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
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("a668a077-8567-41a2-ba8a-f0ce875e4f05")
public class PackageSmClass extends NameSpaceSmClass {
    @objid ("480c5a2f-adf7-4836-8ebc-32a62216634f")
    private SmAttribute isInstantiableAtt;

    @objid ("f2f08679-0093-4f17-970b-62d1714424ec")
    private SmDependency bpmnRepresentsDep;

    @objid ("74c1cb08-7232-406b-9261-1864f6b55898")
    private SmDependency receivingMergeDep;

    @objid ("34cb9fff-7cb4-4594-be54-30a4c2caa5f5")
    private SmDependency representedDep;

    @objid ("3ecefcb3-ae1c-4ebd-9db3-d5416676a007")
    private SmDependency mergeDep;

    @objid ("9f2bb402-6d8a-46c5-be17-2e6c12ac1b63")
    private SmDependency packageImportingDep;

    @objid ("d52d3d41-2706-40bf-aef2-410f16c61304")
    public PackageSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e88d7b1c-2ca6-4ae2-9b6b-cbf528552597")
    @Override
    public String getName() {
        return "Package";
    }

    @objid ("29dfe98e-9f17-4003-9cbf-6b2dda5c214f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("e4e5a5f3-804a-42a3-b48b-ec14c230a472")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Package.class;
    }

    @objid ("669934c0-81e7-4880-9a97-5c9e68faeee1")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("68cc4834-70d9-4a16-86c2-450a3e882b0a")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("9e2a6c97-187c-40de-a4ec-78f905837fb1")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("NameSpace");
        this.registerFactory(new PackageObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isInstantiableAtt = new IsInstantiableSmAttribute();
        this.isInstantiableAtt.init("IsInstantiable", this, Boolean.class );
        registerAttribute(this.isInstantiableAtt);
        
        
        // Initialize and register the SmDependency
        this.bpmnRepresentsDep = new BpmnRepresentsSmDependency();
        this.bpmnRepresentsDep.init("BpmnRepresents", this, metamodel.getMClass("BpmnParticipant"), 0, -1 );
        registerDependency(this.bpmnRepresentsDep);
        
        this.receivingMergeDep = new ReceivingMergeSmDependency();
        this.receivingMergeDep.init("ReceivingMerge", this, metamodel.getMClass("PackageMerge"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.receivingMergeDep);
        
        this.representedDep = new RepresentedSmDependency();
        this.representedDep.init("Represented", this, metamodel.getMClass("Project"), 0, 1 );
        registerDependency(this.representedDep);
        
        this.mergeDep = new MergeSmDependency();
        this.mergeDep.init("Merge", this, metamodel.getMClass("PackageMerge"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.mergeDep);
        
        this.packageImportingDep = new PackageImportingSmDependency();
        this.packageImportingDep.init("PackageImporting", this, metamodel.getMClass("PackageImport"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.packageImportingDep);
    }

    @objid ("51e354b1-26dd-4e2e-b00f-076fa5e70ce6")
    public SmAttribute getIsInstantiableAtt() {
        if (this.isInstantiableAtt == null) {
        	this.isInstantiableAtt = this.getAttributeDef("IsInstantiable");
        }
        return this.isInstantiableAtt;
    }

    @objid ("486d039c-2e7d-4478-b185-4b1ade727181")
    public SmDependency getBpmnRepresentsDep() {
        if (this.bpmnRepresentsDep == null) {
        	this.bpmnRepresentsDep = this.getDependencyDef("BpmnRepresents");
        }
        return this.bpmnRepresentsDep;
    }

    @objid ("aa6dcc2f-559f-4161-8f50-cb62f72e64ef")
    public SmDependency getReceivingMergeDep() {
        if (this.receivingMergeDep == null) {
        	this.receivingMergeDep = this.getDependencyDef("ReceivingMerge");
        }
        return this.receivingMergeDep;
    }

    @objid ("ac3aaf6a-ce4e-49fc-a68f-6d1771a2ca1a")
    public SmDependency getRepresentedDep() {
        if (this.representedDep == null) {
        	this.representedDep = this.getDependencyDef("Represented");
        }
        return this.representedDep;
    }

    @objid ("24eea410-f044-44c8-8183-c71ef7302164")
    public SmDependency getMergeDep() {
        if (this.mergeDep == null) {
        	this.mergeDep = this.getDependencyDef("Merge");
        }
        return this.mergeDep;
    }

    @objid ("de5a41a4-1977-466f-adf2-0d1cf3e62b0c")
    public SmDependency getPackageImportingDep() {
        if (this.packageImportingDep == null) {
        	this.packageImportingDep = this.getDependencyDef("PackageImporting");
        }
        return this.packageImportingDep;
    }

    @objid ("dd2b4690-eb52-47ed-a32a-7fe4f0c6e9fe")
    private static class PackageObjectFactory implements ISmObjectFactory {
        @objid ("27a0df35-64ff-4796-9c2a-4cb2b7cb6329")
        private PackageSmClass smClass;

        @objid ("27cab395-8fa3-472e-a423-9db8669891ea")
        public PackageObjectFactory(PackageSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("350f8f42-2dd4-4fc2-8d7c-7265b71f3078")
        @Override
        public ISmObjectData createData() {
            return new PackageData(this.smClass);
        }

        @objid ("ba9239aa-5bc5-4d1d-845f-e88c7a933486")
        @Override
        public SmObjectImpl createImpl() {
            return new PackageImpl();
        }

    }

    @objid ("a6d7a2bf-9258-44f1-b8ab-c0f5dbfbc419")
    public static class IsInstantiableSmAttribute extends SmAttribute {
        @objid ("70453eda-b795-4a44-ab6c-df24d6355b2c")
        public Object getValue(ISmObjectData data) {
            return ((PackageData) data).mIsInstantiable;
        }

        @objid ("35c14fe9-d2c7-48e5-93e4-f334f21bf9ab")
        public void setValue(ISmObjectData data, Object value) {
            ((PackageData) data).mIsInstantiable = value;
        }

    }

    @objid ("b9710bf6-6c2d-4a12-b9fc-b226f29dec79")
    public static class BpmnRepresentsSmDependency extends SmMultipleDependency {
        @objid ("e64d6753-cbab-460e-a527-80b303b1a7f1")
        private SmDependency symetricDep;

        @objid ("9afb57b8-6928-434d-854f-5484118f95fd")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PackageData)data).mBpmnRepresents != null)? ((PackageData)data).mBpmnRepresents:SmMultipleDependency.EMPTY;
        }

        @objid ("348f4174-774a-41c0-a1eb-d0b911253945")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PackageData) data).mBpmnRepresents = values;
        }

        @objid ("fcf4a173-1cf5-4ce5-8b01-00b2b06d64e0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnParticipantSmClass)this.getTarget()).getPackageRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6f22c172-67a6-43e8-9fc7-6ff0af640959")
    public static class ReceivingMergeSmDependency extends SmMultipleDependency {
        @objid ("3c9aabfd-acd1-48d2-9170-67b211abe927")
        private SmDependency symetricDep;

        @objid ("b41e5c54-5915-4bc9-9a1b-a27500acf05b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PackageData)data).mReceivingMerge != null)? ((PackageData)data).mReceivingMerge:SmMultipleDependency.EMPTY;
        }

        @objid ("e05a0fcb-3394-479c-b061-8810c6b190f5")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PackageData) data).mReceivingMerge = values;
        }

        @objid ("9bd7cf40-122d-4f04-8d8c-a2374495d68e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PackageMergeSmClass)this.getTarget()).getMergedPackageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("43efc11a-3916-4320-827d-dd522742b37e")
    public static class RepresentedSmDependency extends SmSingleDependency {
        @objid ("0a4728ed-0b8f-4390-90f5-336d0319511d")
        private SmDependency symetricDep;

        @objid ("8de0bf4e-3e19-4e52-b8eb-a2d1b3c64732")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((PackageData) data).mRepresented;
        }

        @objid ("ae320183-4788-4822-a422-8e441e7e4b7b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((PackageData) data).mRepresented = value;
        }

        @objid ("97b86bbb-611e-40d3-8669-b72ae125b883")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ProjectSmClass)this.getTarget()).getModelDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ef1cf77e-127d-4061-9402-a8a7b8e74797")
    public static class MergeSmDependency extends SmMultipleDependency {
        @objid ("c4f14aec-52f6-41c4-86bb-065a1c67cbcf")
        private SmDependency symetricDep;

        @objid ("3afd555f-e5f6-480d-b297-6efadb4b0b0e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PackageData)data).mMerge != null)? ((PackageData)data).mMerge:SmMultipleDependency.EMPTY;
        }

        @objid ("3d2276e5-b73f-4a2e-90da-66188d29e25c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PackageData) data).mMerge = values;
        }

        @objid ("f6568721-05c6-4439-93f6-be7e62e7fdf0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PackageMergeSmClass)this.getTarget()).getReceivingPackageDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("4fd6bc43-4aae-43b2-b28f-d2fafbe27134")
    public static class PackageImportingSmDependency extends SmMultipleDependency {
        @objid ("426ad1a1-f210-4b07-984a-a561eea38a62")
        private SmDependency symetricDep;

        @objid ("f83cefc8-5d6a-4437-8ed8-25d643aa3bd4")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((PackageData)data).mPackageImporting != null)? ((PackageData)data).mPackageImporting:SmMultipleDependency.EMPTY;
        }

        @objid ("98bc5f52-2508-40e7-92f5-9cd2bf6b1941")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((PackageData) data).mPackageImporting = values;
        }

        @objid ("3ab4169c-80cf-4948-b3dc-57af18fbb81e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PackageImportSmClass)this.getTarget()).getImportedPackageDep();
            }
            return this.symetricDep;
        }

    }

}
