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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("53bc6622-f8c3-4959-b0a0-2eebb4cfb043")
public class BpmnBehaviorSmClass extends BehaviorSmClass {
    @objid ("28f6e214-c7b6-43fe-b8d5-7361408fa2f6")
    private SmDependency rootElementDep;

    @objid ("c892284f-3862-4114-9648-54f67c95c3df")
    public BpmnBehaviorSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d791d106-8995-4843-bb8c-b97d75c0a5c5")
    @Override
    public String getName() {
        return "BpmnBehavior";
    }

    @objid ("f099ee97-c44c-4f9c-9253-951658b507f2")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("032da5e1-df64-4c9f-b4f7-e789acef098b")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnBehavior.class;
    }

    @objid ("593f2b3d-5ee3-4bf4-8499-a06577acae1d")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("f92a872c-c879-46b0-9948-2a2ca2f10331")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("cd43293d-de65-4060-8629-42ab21aa6f8f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Behavior");
        this.registerFactory(new BpmnBehaviorObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.rootElementDep = new RootElementSmDependency();
        this.rootElementDep.init("RootElement", this, metamodel.getMClass("BpmnRootElement"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.rootElementDep);
    }

    @objid ("ce15a306-2a23-409f-8dd4-917412b2e4f9")
    public SmDependency getRootElementDep() {
        if (this.rootElementDep == null) {
        	this.rootElementDep = this.getDependencyDef("RootElement");
        }
        return this.rootElementDep;
    }

    @objid ("09c9a6c0-b98c-4d97-9ddd-2faa683ea48d")
    private static class BpmnBehaviorObjectFactory implements ISmObjectFactory {
        @objid ("ee9b5e1b-7d68-4cb7-9063-3b649a0582af")
        private BpmnBehaviorSmClass smClass;

        @objid ("86989ca8-7d0f-4ea9-b0a7-23eedabf36f1")
        public BpmnBehaviorObjectFactory(BpmnBehaviorSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4425819b-21b2-4432-b386-2ff6b987b54a")
        @Override
        public ISmObjectData createData() {
            return new BpmnBehaviorData(this.smClass);
        }

        @objid ("d246307c-6531-4a74-b0a2-cd324504bab0")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnBehaviorImpl();
        }

    }

    @objid ("44d6f975-f246-4911-9515-04a44c98c0a3")
    public static class RootElementSmDependency extends SmMultipleDependency {
        @objid ("d6d8552a-5290-4e75-942f-b8c6e2d8a751")
        private SmDependency symetricDep;

        @objid ("d93a09fb-a732-44d5-a03e-f5ef00e141d0")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnBehaviorData)data).mRootElement != null)? ((BpmnBehaviorData)data).mRootElement:SmMultipleDependency.EMPTY;
        }

        @objid ("811093c1-a4af-4e48-8fc7-d702bfdc0795")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnBehaviorData) data).mRootElement = values;
        }

        @objid ("5b121fdb-4b3c-4462-9d92-0c2af2582de2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnRootElementSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
