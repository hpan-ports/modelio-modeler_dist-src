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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ControlNodeSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionMergeNode;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionNodeKind;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("b33d2d1d-69c9-448e-8262-d8d45c47add2")
public class DecisionMergeNodeSmClass extends ControlNodeSmClass {
    @objid ("5ace1bb5-6a18-46c4-b2b1-88f0741a8e09")
    private SmAttribute decisionKindAtt;

    @objid ("ad171123-0ba0-49c2-9dc2-c1bffa4b6745")
    private SmAttribute decisionInputBehaviorAtt;

    @objid ("6556d7bb-d8cc-45f1-99d5-52d4c93f2ed9")
    public DecisionMergeNodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b0eee12c-7af7-4028-ac14-41e3b55eaa7d")
    @Override
    public String getName() {
        return "DecisionMergeNode";
    }

    @objid ("a2c00fdc-1485-4b30-81f8-0a587d6e6480")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("1eb10e05-c6e4-4c61-9365-b54c3380db57")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return DecisionMergeNode.class;
    }

    @objid ("fd2c5183-7fb5-4415-be8c-5382dbc5b257")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("fa3661f0-fbf9-4ba0-9152-68a2e57ee9a9")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("ac772442-5e40-4266-905e-131f5511d632")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ControlNode");
        this.registerFactory(new DecisionMergeNodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.decisionKindAtt = new DecisionKindSmAttribute();
        this.decisionKindAtt.init("DecisionKind", this, DecisionNodeKind.class );
        registerAttribute(this.decisionKindAtt);
        
        this.decisionInputBehaviorAtt = new DecisionInputBehaviorSmAttribute();
        this.decisionInputBehaviorAtt.init("DecisionInputBehavior", this, String.class );
        registerAttribute(this.decisionInputBehaviorAtt);
        
        
        // Initialize and register the SmDependency
    }

    @objid ("80bac105-7003-4f0b-8ebd-0eac96471958")
    public SmAttribute getDecisionKindAtt() {
        if (this.decisionKindAtt == null) {
        	this.decisionKindAtt = this.getAttributeDef("DecisionKind");
        }
        return this.decisionKindAtt;
    }

    @objid ("8707db87-992e-4ddd-a642-2191d9fb73f1")
    public SmAttribute getDecisionInputBehaviorAtt() {
        if (this.decisionInputBehaviorAtt == null) {
        	this.decisionInputBehaviorAtt = this.getAttributeDef("DecisionInputBehavior");
        }
        return this.decisionInputBehaviorAtt;
    }

    @objid ("0e8bd50a-37de-4b2f-b184-de181665418f")
    private static class DecisionMergeNodeObjectFactory implements ISmObjectFactory {
        @objid ("82d9a078-dfae-43d5-be11-fb3f5aa822fd")
        private DecisionMergeNodeSmClass smClass;

        @objid ("ce6dd6e2-f959-42c1-b072-4c2048c3105d")
        public DecisionMergeNodeObjectFactory(DecisionMergeNodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("8c8e72e7-1673-4250-ae6e-939d3d45cc5e")
        @Override
        public ISmObjectData createData() {
            return new DecisionMergeNodeData(this.smClass);
        }

        @objid ("e77bbed0-d069-42eb-9198-8db2c2c58a7e")
        @Override
        public SmObjectImpl createImpl() {
            return new DecisionMergeNodeImpl();
        }

    }

    @objid ("5a3381d7-3957-45f1-8da2-059ba90ac8ea")
    public static class DecisionKindSmAttribute extends SmAttribute {
        @objid ("26c3ac32-88b9-4ea9-b392-bb0d0f9cdabe")
        public Object getValue(ISmObjectData data) {
            return ((DecisionMergeNodeData) data).mDecisionKind;
        }

        @objid ("27392264-cffa-4fe2-89e3-c6ef68674e70")
        public void setValue(ISmObjectData data, Object value) {
            ((DecisionMergeNodeData) data).mDecisionKind = value;
        }

    }

    @objid ("36a0d4de-8470-41db-8c16-f60ba55207d1")
    public static class DecisionInputBehaviorSmAttribute extends SmAttribute {
        @objid ("55648859-6073-4eff-9c42-c14e50f67c2a")
        public Object getValue(ISmObjectData data) {
            return ((DecisionMergeNodeData) data).mDecisionInputBehavior;
        }

        @objid ("00bb0fa5-89fc-46b7-9110-8753ac119120")
        public void setValue(ISmObjectData data, Object value) {
            ((DecisionMergeNodeData) data).mDecisionInputBehavior = value;
        }

    }

}
