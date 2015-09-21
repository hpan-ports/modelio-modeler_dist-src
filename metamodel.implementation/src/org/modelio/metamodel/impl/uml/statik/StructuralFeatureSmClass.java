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
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowSmClass;
import org.modelio.metamodel.impl.uml.statik.FeatureSmClass;
import org.modelio.metamodel.uml.statik.KindOfAccess;
import org.modelio.metamodel.uml.statik.StructuralFeature;
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

@objid ("cabc3fc3-c50a-4f12-8364-eadf0fa37a73")
public class StructuralFeatureSmClass extends FeatureSmClass {
    @objid ("a56db83e-4f09-4a36-83d9-c55b546baad4")
    private SmAttribute changeableAtt;

    @objid ("3600edb6-cdea-4ef0-af4e-d64ddad11e56")
    private SmAttribute isDerivedAtt;

    @objid ("3893b767-8b5b-4dcd-8c38-e3c3fde0daf0")
    private SmAttribute isOrderedAtt;

    @objid ("9d09971b-c8ec-4ea7-9fb1-6f1b42f0ab7a")
    private SmAttribute isUniqueAtt;

    @objid ("de9078b0-cadc-484c-8c89-71e640993639")
    private SmAttribute multiplicityMinAtt;

    @objid ("48370c1a-8715-48e7-bc93-9d193293fbc3")
    private SmAttribute multiplicityMaxAtt;

    @objid ("ac37adc1-40a0-4fdd-8847-379419456358")
    private SmDependency realizedInformationFlowDep;

    @objid ("14529bf3-9865-4083-855f-381846557da1")
    public StructuralFeatureSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("afe1bdc5-1a77-4210-9b78-df3036629e17")
    @Override
    public String getName() {
        return "StructuralFeature";
    }

    @objid ("ec1aa8bc-0864-4b65-9125-27a584c9c7db")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("bcadb79e-235c-4b2a-907d-79a5154e2294")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return StructuralFeature.class;
    }

    @objid ("c8673618-8675-435b-bec9-22a7a960434f")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("81b42725-b7da-4302-9dbb-7d6793fb5697")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("48028210-9c8d-445b-a092-fa9e62b80638")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Feature");
        this.registerFactory(new StructuralFeatureObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.changeableAtt = new ChangeableSmAttribute();
        this.changeableAtt.init("Changeable", this, KindOfAccess.class );
        registerAttribute(this.changeableAtt);
        
        this.isDerivedAtt = new IsDerivedSmAttribute();
        this.isDerivedAtt.init("IsDerived", this, Boolean.class );
        registerAttribute(this.isDerivedAtt);
        
        this.isOrderedAtt = new IsOrderedSmAttribute();
        this.isOrderedAtt.init("IsOrdered", this, Boolean.class );
        registerAttribute(this.isOrderedAtt);
        
        this.isUniqueAtt = new IsUniqueSmAttribute();
        this.isUniqueAtt.init("IsUnique", this, Boolean.class );
        registerAttribute(this.isUniqueAtt);
        
        this.multiplicityMinAtt = new MultiplicityMinSmAttribute();
        this.multiplicityMinAtt.init("MultiplicityMin", this, String.class );
        registerAttribute(this.multiplicityMinAtt);
        
        this.multiplicityMaxAtt = new MultiplicityMaxSmAttribute();
        this.multiplicityMaxAtt.init("MultiplicityMax", this, String.class );
        registerAttribute(this.multiplicityMaxAtt);
        
        
        // Initialize and register the SmDependency
        this.realizedInformationFlowDep = new RealizedInformationFlowSmDependency();
        this.realizedInformationFlowDep.init("RealizedInformationFlow", this, metamodel.getMClass("InformationFlow"), 0, -1 );
        registerDependency(this.realizedInformationFlowDep);
    }

    @objid ("ac00d28c-834a-4bb2-945c-f89eb3cc824b")
    public SmAttribute getChangeableAtt() {
        if (this.changeableAtt == null) {
        	this.changeableAtt = this.getAttributeDef("Changeable");
        }
        return this.changeableAtt;
    }

    @objid ("d8e2606c-e0d6-4b20-8eba-f37f8b315083")
    public SmAttribute getIsDerivedAtt() {
        if (this.isDerivedAtt == null) {
        	this.isDerivedAtt = this.getAttributeDef("IsDerived");
        }
        return this.isDerivedAtt;
    }

    @objid ("e214e42c-b907-434b-ac22-5edc09842836")
    public SmAttribute getIsOrderedAtt() {
        if (this.isOrderedAtt == null) {
        	this.isOrderedAtt = this.getAttributeDef("IsOrdered");
        }
        return this.isOrderedAtt;
    }

    @objid ("7aca5165-364e-4adf-85b5-baa22ea89e21")
    public SmAttribute getIsUniqueAtt() {
        if (this.isUniqueAtt == null) {
        	this.isUniqueAtt = this.getAttributeDef("IsUnique");
        }
        return this.isUniqueAtt;
    }

    @objid ("00d69f88-6ad9-4371-964a-8c35e09b1f1b")
    public SmAttribute getMultiplicityMinAtt() {
        if (this.multiplicityMinAtt == null) {
        	this.multiplicityMinAtt = this.getAttributeDef("MultiplicityMin");
        }
        return this.multiplicityMinAtt;
    }

    @objid ("cc56b531-8490-46c1-8731-0185e16269a9")
    public SmAttribute getMultiplicityMaxAtt() {
        if (this.multiplicityMaxAtt == null) {
        	this.multiplicityMaxAtt = this.getAttributeDef("MultiplicityMax");
        }
        return this.multiplicityMaxAtt;
    }

    @objid ("93878a85-3eb0-41b7-b924-05aaecca1d7a")
    public SmDependency getRealizedInformationFlowDep() {
        if (this.realizedInformationFlowDep == null) {
        	this.realizedInformationFlowDep = this.getDependencyDef("RealizedInformationFlow");
        }
        return this.realizedInformationFlowDep;
    }

    @objid ("e72895e9-192f-4043-8165-053d1245e820")
    private static class StructuralFeatureObjectFactory implements ISmObjectFactory {
        @objid ("a99d41f1-726a-4409-992c-0e63b19c1379")
        private StructuralFeatureSmClass smClass;

        @objid ("89c47a80-76fb-42c4-a46f-91bdb7ff1b5b")
        public StructuralFeatureObjectFactory(StructuralFeatureSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("1fa64b60-75be-4c8c-93fd-7f51f93836a3")
        @Override
        public ISmObjectData createData() {
            return new StructuralFeatureData(this.smClass);
        }

        @objid ("ce67f456-5192-4edd-90a7-03b8db6f6cc6")
        @Override
        public SmObjectImpl createImpl() {
            return new StructuralFeatureImpl();
        }

    }

    @objid ("ea369268-9165-437a-b8db-ea1a3036dd81")
    public static class ChangeableSmAttribute extends SmAttribute {
        @objid ("1ff30056-7f89-481d-ad63-55a2e4d6059e")
        public Object getValue(ISmObjectData data) {
            return ((StructuralFeatureData) data).mChangeable;
        }

        @objid ("ce9e4d2e-ab5f-40a4-91ff-b0730d162075")
        public void setValue(ISmObjectData data, Object value) {
            ((StructuralFeatureData) data).mChangeable = value;
        }

    }

    @objid ("fbd106e8-ac57-4fd8-b627-290b621c3a4c")
    public static class IsDerivedSmAttribute extends SmAttribute {
        @objid ("955a8d73-f393-4368-8486-e7ba1c2c7317")
        public Object getValue(ISmObjectData data) {
            return ((StructuralFeatureData) data).mIsDerived;
        }

        @objid ("c62e3615-a039-400c-b523-5bdc63481e92")
        public void setValue(ISmObjectData data, Object value) {
            ((StructuralFeatureData) data).mIsDerived = value;
        }

    }

    @objid ("e90f64ef-959b-48ab-b452-3dcef8218d64")
    public static class IsOrderedSmAttribute extends SmAttribute {
        @objid ("1cfd9c10-e333-492b-bffe-c65f988e8859")
        public Object getValue(ISmObjectData data) {
            return ((StructuralFeatureData) data).mIsOrdered;
        }

        @objid ("a8317cdf-470e-4e21-8416-106338a8210e")
        public void setValue(ISmObjectData data, Object value) {
            ((StructuralFeatureData) data).mIsOrdered = value;
        }

    }

    @objid ("641ac2c4-5c81-4d28-ac1b-66cf0c483f20")
    public static class IsUniqueSmAttribute extends SmAttribute {
        @objid ("23831be0-51a5-4fab-9c15-fa18708bd0ea")
        public Object getValue(ISmObjectData data) {
            return ((StructuralFeatureData) data).mIsUnique;
        }

        @objid ("ae8a1fe2-b45a-45ea-b452-90ccfc3b676a")
        public void setValue(ISmObjectData data, Object value) {
            ((StructuralFeatureData) data).mIsUnique = value;
        }

    }

    @objid ("566b81b8-e4f8-4f2e-ba9a-d6e28a8b9aaa")
    public static class MultiplicityMinSmAttribute extends SmAttribute {
        @objid ("1bcedc2f-7e1c-4112-9545-f3ad292b855d")
        public Object getValue(ISmObjectData data) {
            return ((StructuralFeatureData) data).mMultiplicityMin;
        }

        @objid ("b94233e1-d162-45c2-92d5-277d0ff8d6d0")
        public void setValue(ISmObjectData data, Object value) {
            ((StructuralFeatureData) data).mMultiplicityMin = value;
        }

    }

    @objid ("6f575c66-7c94-4bcb-a801-8e92cb584551")
    public static class MultiplicityMaxSmAttribute extends SmAttribute {
        @objid ("04b19612-3409-491a-bef0-2a960df403f3")
        public Object getValue(ISmObjectData data) {
            return ((StructuralFeatureData) data).mMultiplicityMax;
        }

        @objid ("c9e14bcb-ce4c-4707-a870-6a0ac3735e1b")
        public void setValue(ISmObjectData data, Object value) {
            ((StructuralFeatureData) data).mMultiplicityMax = value;
        }

    }

    @objid ("aaff07d6-28e5-4dcd-b8af-48393dd86c46")
    public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
        @objid ("e5be3491-1b20-460f-9d7b-adfbfc30d6dd")
        private SmDependency symetricDep;

        @objid ("1327e33c-7975-4849-8b0d-c8fb908cf0c0")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StructuralFeatureData)data).mRealizedInformationFlow != null)? ((StructuralFeatureData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
        }

        @objid ("20a67fe3-4964-4279-8df0-d1b8ac35827d")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StructuralFeatureData) data).mRealizedInformationFlow = values;
        }

        @objid ("a58980e9-7214-4220-a3aa-c9c6adff7fb6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getRealizingFeatureDep();
            }
            return this.symetricDep;
        }

    }

}
