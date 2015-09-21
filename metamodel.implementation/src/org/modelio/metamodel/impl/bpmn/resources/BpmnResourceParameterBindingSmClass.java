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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterSmClass;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceRoleSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("1b609f5e-944b-4853-9119-aa7754ed0e90")
public class BpmnResourceParameterBindingSmClass extends BpmnBaseElementSmClass {
    @objid ("dd1e2ea0-a427-4e59-96a8-2f8af2a586de")
    private SmAttribute expressionAtt;

    @objid ("daa5b03b-e4a9-42ef-8de1-ad91c5bf1c94")
    private SmDependency resourceRoleDep;

    @objid ("588d91f8-9ccd-4f73-9267-c665461c7694")
    private SmDependency parameterRefDep;

    @objid ("497e2f24-8bfa-4b40-a176-cb41d293a7bc")
    public BpmnResourceParameterBindingSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("4dccd06f-318f-4814-a402-2fdaef678eac")
    @Override
    public String getName() {
        return "BpmnResourceParameterBinding";
    }

    @objid ("4f5ce04a-64d9-4801-a83b-2201ed6a1f6f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("6ddf79e6-6390-4876-ad21-d54eabbd3d0d")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnResourceParameterBinding.class;
    }

    @objid ("a6494395-f979-46ea-8378-5079416f634c")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("dc82c294-820c-4d26-aa92-d460fdb7e63e")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("341d57e1-93eb-4cd3-bf27-00b780fbb418")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnResourceParameterBindingObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.expressionAtt = new ExpressionSmAttribute();
        this.expressionAtt.init("Expression", this, String.class );
        registerAttribute(this.expressionAtt);
        
        
        // Initialize and register the SmDependency
        this.resourceRoleDep = new ResourceRoleSmDependency();
        this.resourceRoleDep.init("ResourceRole", this, metamodel.getMClass("BpmnResourceRole"), 1, 1 );
        registerDependency(this.resourceRoleDep);
        
        this.parameterRefDep = new ParameterRefSmDependency();
        this.parameterRefDep.init("ParameterRef", this, metamodel.getMClass("BpmnResourceParameter"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.parameterRefDep);
    }

    @objid ("6c6c1caa-e0d3-4918-9228-ccc2f141d1f3")
    public SmAttribute getExpressionAtt() {
        if (this.expressionAtt == null) {
        	this.expressionAtt = this.getAttributeDef("Expression");
        }
        return this.expressionAtt;
    }

    @objid ("baa0fe83-2740-448a-b2a3-79e49f7e7617")
    public SmDependency getResourceRoleDep() {
        if (this.resourceRoleDep == null) {
        	this.resourceRoleDep = this.getDependencyDef("ResourceRole");
        }
        return this.resourceRoleDep;
    }

    @objid ("93503b15-9160-4e91-ab29-8469872fe254")
    public SmDependency getParameterRefDep() {
        if (this.parameterRefDep == null) {
        	this.parameterRefDep = this.getDependencyDef("ParameterRef");
        }
        return this.parameterRefDep;
    }

    @objid ("b87c28bf-0da7-4f6b-96ee-82b68b35ca09")
    private static class BpmnResourceParameterBindingObjectFactory implements ISmObjectFactory {
        @objid ("182a43c9-5b0a-4458-a97e-badac02a5b90")
        private BpmnResourceParameterBindingSmClass smClass;

        @objid ("463b85f9-d761-4537-97a9-90bace7b7a3b")
        public BpmnResourceParameterBindingObjectFactory(BpmnResourceParameterBindingSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("09dac63f-5225-45c3-81e9-01e8d38df203")
        @Override
        public ISmObjectData createData() {
            return new BpmnResourceParameterBindingData(this.smClass);
        }

        @objid ("bcd2f6d5-6065-45b9-b961-5f5add9c11ac")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnResourceParameterBindingImpl();
        }

    }

    @objid ("31a791bd-5ab8-4316-a3db-c71a6a2dc266")
    public static class ExpressionSmAttribute extends SmAttribute {
        @objid ("ee391f17-6bde-4821-b6db-790046ad57a9")
        public Object getValue(ISmObjectData data) {
            return ((BpmnResourceParameterBindingData) data).mExpression;
        }

        @objid ("e39399f7-0c68-4141-903c-932d0584b157")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnResourceParameterBindingData) data).mExpression = value;
        }

    }

    @objid ("9f8fdca5-12eb-48c7-878b-20679a8e6389")
    public static class ResourceRoleSmDependency extends SmSingleDependency {
        @objid ("b6abfbce-df9e-40bd-8234-fd3884b456be")
        private SmDependency symetricDep;

        @objid ("7d0daf6c-0392-4c01-942c-e29245128d78")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnResourceParameterBindingData) data).mResourceRole;
        }

        @objid ("75a81dae-1a6d-42a7-a82d-a5121d1eaf4d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnResourceParameterBindingData) data).mResourceRole = value;
        }

        @objid ("71556337-b6c0-454c-9844-2c82fd0042ea")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceRoleSmClass)this.getTarget()).getResourceParameterBindingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b344f8f6-129a-4711-ab87-e91dec35692f")
    public static class ParameterRefSmDependency extends SmSingleDependency {
        @objid ("1c2ffabc-5b1a-4fb3-9fba-d8e68b53b04b")
        private SmDependency symetricDep;

        @objid ("1ec4147f-0981-4162-993d-d30110286ea5")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnResourceParameterBindingData) data).mParameterRef;
        }

        @objid ("24a41a9e-b793-49be-ba35-2ffb09145d85")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnResourceParameterBindingData) data).mParameterRef = value;
        }

        @objid ("a62ef60b-5bb7-4984-b86e-4809321a16b5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnResourceParameterSmClass)this.getTarget()).getParameterBindingRefsDep();
            }
            return this.symetricDep;
        }

    }

}
