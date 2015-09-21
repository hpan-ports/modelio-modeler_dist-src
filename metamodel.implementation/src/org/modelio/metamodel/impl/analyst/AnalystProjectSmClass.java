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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.impl.analyst.BusinessRuleContainerSmClass;
import org.modelio.metamodel.impl.analyst.DictionarySmClass;
import org.modelio.metamodel.impl.analyst.GenericAnalystContainerSmClass;
import org.modelio.metamodel.impl.analyst.GoalContainerSmClass;
import org.modelio.metamodel.impl.analyst.PropertyContainerSmClass;
import org.modelio.metamodel.impl.analyst.RequirementContainerSmClass;
import org.modelio.metamodel.impl.analyst.RiskContainerSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("442fc57f-f23c-476a-8ea1-a17dac46bd61")
public class AnalystProjectSmClass extends ModelElementSmClass {
    @objid ("9d06becc-41c1-4b3c-8725-9b4946c60a94")
    private SmDependency propertyRootDep;

    @objid ("658b8edf-2ab0-4a4f-8156-641df9b42965")
    private SmDependency goalRootDep;

    @objid ("a849695a-db25-49f9-8881-0a001a3b0338")
    private SmDependency businessRuleRootDep;

    @objid ("c4637fee-d1ff-4ac3-b9a2-56fa1467875f")
    private SmDependency dictionaryRootDep;

    @objid ("deb9eb7b-85a2-4dff-8bbc-ed7ccd3d527d")
    private SmDependency requirementRootDep;

    @objid ("77a48877-cce9-4534-9e25-a6bcbf8a42e9")
    private SmDependency genericRootDep;

    @objid ("ab9eca80-d9a8-4b10-bfff-3dc9101ec966")
    private SmDependency riskRootDep;

    @objid ("0f562cd6-5824-4f96-9809-533dd8a342c7")
    public AnalystProjectSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f75a91bb-65d1-421e-8358-54e3cb95cb24")
    @Override
    public String getName() {
        return "AnalystProject";
    }

    @objid ("69cb3b57-d3ab-47c7-87cc-139ceabbf96e")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("198d0c26-fb3c-4641-954e-b8bbba5e9468")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AnalystProject.class;
    }

    @objid ("cfaf86d7-8cee-47f3-90f7-8ac8014f8915")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("2bbb8dc0-4e71-4ca9-b793-4cbbceb7aca9")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("0e2d1f59-7308-40c6-9b5c-3de8b2e69c2a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new AnalystProjectObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.propertyRootDep = new PropertyRootSmDependency();
        this.propertyRootDep.init("PropertyRoot", this, metamodel.getMClass("PropertyContainer"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.propertyRootDep);
        
        this.goalRootDep = new GoalRootSmDependency();
        this.goalRootDep.init("GoalRoot", this, metamodel.getMClass("GoalContainer"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.goalRootDep);
        
        this.businessRuleRootDep = new BusinessRuleRootSmDependency();
        this.businessRuleRootDep.init("BusinessRuleRoot", this, metamodel.getMClass("BusinessRuleContainer"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.businessRuleRootDep);
        
        this.dictionaryRootDep = new DictionaryRootSmDependency();
        this.dictionaryRootDep.init("DictionaryRoot", this, metamodel.getMClass("Dictionary"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.dictionaryRootDep);
        
        this.requirementRootDep = new RequirementRootSmDependency();
        this.requirementRootDep.init("RequirementRoot", this, metamodel.getMClass("RequirementContainer"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.requirementRootDep);
        
        this.genericRootDep = new GenericRootSmDependency();
        this.genericRootDep.init("GenericRoot", this, metamodel.getMClass("GenericAnalystContainer"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.genericRootDep);
        
        this.riskRootDep = new RiskRootSmDependency();
        this.riskRootDep.init("RiskRoot", this, metamodel.getMClass("RiskContainer"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.riskRootDep);
    }

    @objid ("b8655d22-fe17-4ef7-badd-50b3e1c6920f")
    public SmDependency getPropertyRootDep() {
        if (this.propertyRootDep == null) {
        	this.propertyRootDep = this.getDependencyDef("PropertyRoot");
        }
        return this.propertyRootDep;
    }

    @objid ("60d5561e-0fd9-4c8d-a54b-15e49ada5d2b")
    public SmDependency getGoalRootDep() {
        if (this.goalRootDep == null) {
        	this.goalRootDep = this.getDependencyDef("GoalRoot");
        }
        return this.goalRootDep;
    }

    @objid ("2999d964-7458-47b9-b2ad-b96ec2bb5275")
    public SmDependency getBusinessRuleRootDep() {
        if (this.businessRuleRootDep == null) {
        	this.businessRuleRootDep = this.getDependencyDef("BusinessRuleRoot");
        }
        return this.businessRuleRootDep;
    }

    @objid ("dde015d4-8e34-41f8-8ac8-9a5ad3dc71f5")
    public SmDependency getDictionaryRootDep() {
        if (this.dictionaryRootDep == null) {
        	this.dictionaryRootDep = this.getDependencyDef("DictionaryRoot");
        }
        return this.dictionaryRootDep;
    }

    @objid ("0d0f6927-19a2-4323-bc40-769c2fa0d962")
    public SmDependency getRequirementRootDep() {
        if (this.requirementRootDep == null) {
        	this.requirementRootDep = this.getDependencyDef("RequirementRoot");
        }
        return this.requirementRootDep;
    }

    @objid ("f02b7edb-a9d5-4dab-a77b-65c414b22957")
    public SmDependency getGenericRootDep() {
        if (this.genericRootDep == null) {
        	this.genericRootDep = this.getDependencyDef("GenericRoot");
        }
        return this.genericRootDep;
    }

    @objid ("cd45cb5f-4aa1-409d-972f-22c327d42543")
    public SmDependency getRiskRootDep() {
        if (this.riskRootDep == null) {
        	this.riskRootDep = this.getDependencyDef("RiskRoot");
        }
        return this.riskRootDep;
    }

    @objid ("4bc46673-6444-4fdd-8805-e12e40e89dc6")
    private static class AnalystProjectObjectFactory implements ISmObjectFactory {
        @objid ("d92795b3-99e1-4d92-aa3f-5bfd6a19585f")
        private AnalystProjectSmClass smClass;

        @objid ("3b65cacd-7a7a-4be1-853f-c51d902754d0")
        public AnalystProjectObjectFactory(AnalystProjectSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4ba2a17e-2df6-46dc-bd77-4f0eea25371c")
        @Override
        public ISmObjectData createData() {
            return new AnalystProjectData(this.smClass);
        }

        @objid ("1c40f214-11e2-4645-a08d-1204c45b2fbf")
        @Override
        public SmObjectImpl createImpl() {
            return new AnalystProjectImpl();
        }

    }

    @objid ("585eeccb-1af5-40e2-90cd-be958f74e851")
    public static class PropertyRootSmDependency extends SmSingleDependency {
        @objid ("3ab9a371-1878-48e3-bb9e-909e78a99948")
        private SmDependency symetricDep;

        @objid ("ec76afcf-4271-4d2d-b169-f6f16f3330c6")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AnalystProjectData) data).mPropertyRoot;
        }

        @objid ("ef7a1417-89c7-44c7-9107-3b44c6cccab2")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AnalystProjectData) data).mPropertyRoot = value;
        }

        @objid ("aa585b1f-1a08-4cc0-a39e-987cef78ab47")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyContainerSmClass)this.getTarget()).getOwnerProjectDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("70962ec6-a8bd-4d9d-8780-0fae9dfad789")
    public static class GoalRootSmDependency extends SmMultipleDependency {
        @objid ("3460a7dc-eed7-4370-a2f4-b0e098ed0896")
        private SmDependency symetricDep;

        @objid ("1a42dd58-6225-4ee3-9832-79b5a7ced495")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AnalystProjectData)data).mGoalRoot != null)? ((AnalystProjectData)data).mGoalRoot:SmMultipleDependency.EMPTY;
        }

        @objid ("178adc68-94aa-4fcd-bfd3-93d3bced5d9c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AnalystProjectData) data).mGoalRoot = values;
        }

        @objid ("b413c5cd-cdc1-45d5-a4d9-4af755c43512")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GoalContainerSmClass)this.getTarget()).getOwnerProjectDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9d434b37-a461-4be4-a9dc-5a55fee45a1b")
    public static class BusinessRuleRootSmDependency extends SmMultipleDependency {
        @objid ("c1b0d556-a5fc-4089-a186-53907a81f242")
        private SmDependency symetricDep;

        @objid ("66ad56a5-1bd2-41ee-9e01-a810487e6cdb")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AnalystProjectData)data).mBusinessRuleRoot != null)? ((AnalystProjectData)data).mBusinessRuleRoot:SmMultipleDependency.EMPTY;
        }

        @objid ("8daf492b-cd48-44ae-b6ee-6252dd4fd738")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AnalystProjectData) data).mBusinessRuleRoot = values;
        }

        @objid ("e643fc7e-884c-4a3a-802d-8e4f27f0fad5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BusinessRuleContainerSmClass)this.getTarget()).getOwnerProjectDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a32378f4-5a55-4de7-b6f1-f447f0640016")
    public static class DictionaryRootSmDependency extends SmMultipleDependency {
        @objid ("4cbb171b-49ee-47ea-b8cb-b1a146932e06")
        private SmDependency symetricDep;

        @objid ("ac13c66e-155e-4078-9856-482deca1d1df")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AnalystProjectData)data).mDictionaryRoot != null)? ((AnalystProjectData)data).mDictionaryRoot:SmMultipleDependency.EMPTY;
        }

        @objid ("ce93c951-7710-4be0-a303-cb04caff5841")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AnalystProjectData) data).mDictionaryRoot = values;
        }

        @objid ("a3301e21-b9e6-46fd-93dc-3fb07ca09de7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DictionarySmClass)this.getTarget()).getOwnerProjectDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("fd434606-86a2-40b5-97d4-d7887d537bb1")
    public static class RequirementRootSmDependency extends SmMultipleDependency {
        @objid ("c364db05-bb83-4052-97b1-ebb3e8b7c24f")
        private SmDependency symetricDep;

        @objid ("4427729d-0c40-47e2-b65f-99d594003fbb")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AnalystProjectData)data).mRequirementRoot != null)? ((AnalystProjectData)data).mRequirementRoot:SmMultipleDependency.EMPTY;
        }

        @objid ("23d32257-e989-442c-a49f-7309b2a83294")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AnalystProjectData) data).mRequirementRoot = values;
        }

        @objid ("86c041ed-3bcb-458f-93d6-6c70c2ee6422")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequirementContainerSmClass)this.getTarget()).getOwnerProjectDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("816f7a06-6de5-4f97-8839-a0140bbfe696")
    public static class GenericRootSmDependency extends SmMultipleDependency {
        @objid ("3e8d584c-5fe1-40e2-bd7b-bb12efc95893")
        private SmDependency symetricDep;

        @objid ("f906cf27-ebf1-4fc1-b492-df4acee7c486")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AnalystProjectData)data).mGenericRoot != null)? ((AnalystProjectData)data).mGenericRoot:SmMultipleDependency.EMPTY;
        }

        @objid ("8db7d506-e9dd-4db2-86fe-f7562db3365c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AnalystProjectData) data).mGenericRoot = values;
        }

        @objid ("10bb175d-1c8d-492c-b6bb-ee915192a39b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GenericAnalystContainerSmClass)this.getTarget()).getOwnerProjectDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ade40276-0e61-4514-9421-c689730d0243")
    public static class RiskRootSmDependency extends SmMultipleDependency {
        @objid ("f4db15a8-95ac-4620-87f5-e4b0d8465bdf")
        private SmDependency symetricDep;

        @objid ("70d42dea-2d84-4783-8502-2609450cb8db")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AnalystProjectData)data).mRiskRoot != null)? ((AnalystProjectData)data).mRiskRoot:SmMultipleDependency.EMPTY;
        }

        @objid ("769cc744-57d7-4d93-a394-b2217c90edb7")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AnalystProjectData) data).mRiskRoot = values;
        }

        @objid ("d67e3fbb-44f0-4693-858c-f52c5fe41ff2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RiskContainerSmClass)this.getTarget()).getOwnerProjectDep();
            }
            return this.symetricDep;
        }

    }

}
