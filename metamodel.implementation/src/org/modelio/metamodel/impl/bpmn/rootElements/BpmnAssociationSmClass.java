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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnArtifactSmClass;
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

@objid ("2fa1359f-9d07-4dd6-a0c4-8956cffbb1a4")
public class BpmnAssociationSmClass extends BpmnArtifactSmClass {
    @objid ("15ddce53-f89d-49a9-9aba-4f7c3c14b061")
    private SmAttribute associationDirectionAtt;

    @objid ("8bd50b9c-2669-4b6a-8428-d371bc5aa8d1")
    private SmDependency targetRefDep;

    @objid ("264f6e4e-0fb8-4fa9-bc86-4068d7b63369")
    private SmDependency sourceRefDep;

    @objid ("05bb94ab-cb86-4b0e-970a-1faa20248ca7")
    public BpmnAssociationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("cad9ffea-a683-4838-aab1-6987c6bb5b91")
    @Override
    public String getName() {
        return "BpmnAssociation";
    }

    @objid ("52b79bbd-7a1a-478b-8382-1846333eec84")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("3b932759-2543-4f08-8270-a363b6c3c239")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnAssociation.class;
    }

    @objid ("4badce21-8788-4791-8313-1c1aac342260")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("af07c0ea-18b1-4659-9201-893a6b090fa1")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("7fca6b02-4596-493b-81f6-6d0b1c0f09ef")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnArtifact");
        this.registerFactory(new BpmnAssociationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.associationDirectionAtt = new AssociationDirectionSmAttribute();
        this.associationDirectionAtt.init("AssociationDirection", this, BpmnAssociationDirection.class );
        registerAttribute(this.associationDirectionAtt);
        
        
        // Initialize and register the SmDependency
        this.targetRefDep = new TargetRefSmDependency();
        this.targetRefDep.init("TargetRef", this, metamodel.getMClass("BpmnBaseElement"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetRefDep);
        
        this.sourceRefDep = new SourceRefSmDependency();
        this.sourceRefDep.init("SourceRef", this, metamodel.getMClass("BpmnBaseElement"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.sourceRefDep);
    }

    @objid ("7c7b6eef-ad40-4ec8-8c7f-ea438984be57")
    public SmAttribute getAssociationDirectionAtt() {
        if (this.associationDirectionAtt == null) {
        	this.associationDirectionAtt = this.getAttributeDef("AssociationDirection");
        }
        return this.associationDirectionAtt;
    }

    @objid ("d2c930d4-a44a-4c9a-bec1-384dfbe6ffd9")
    public SmDependency getTargetRefDep() {
        if (this.targetRefDep == null) {
        	this.targetRefDep = this.getDependencyDef("TargetRef");
        }
        return this.targetRefDep;
    }

    @objid ("1f0a1f80-f23d-4e57-92ad-bea9b164d698")
    public SmDependency getSourceRefDep() {
        if (this.sourceRefDep == null) {
        	this.sourceRefDep = this.getDependencyDef("SourceRef");
        }
        return this.sourceRefDep;
    }

    @objid ("026c3255-dee9-4bb5-ad52-eaed2b0ce003")
    private static class BpmnAssociationObjectFactory implements ISmObjectFactory {
        @objid ("58a36c27-c738-4880-8871-953ecb6881a1")
        private BpmnAssociationSmClass smClass;

        @objid ("a1ae8a48-51c9-408f-8109-650411168e11")
        public BpmnAssociationObjectFactory(BpmnAssociationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("25bbb9f8-6af0-4dab-8eff-2027683815c8")
        @Override
        public ISmObjectData createData() {
            return new BpmnAssociationData(this.smClass);
        }

        @objid ("a0dc8ef0-ffe6-4ab8-adcc-ad264b08f16c")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnAssociationImpl();
        }

    }

    @objid ("8499eaae-19ae-4bdc-81ce-18586df9fc15")
    public static class AssociationDirectionSmAttribute extends SmAttribute {
        @objid ("911938b6-5905-40a3-875c-7d826b693eb7")
        public Object getValue(ISmObjectData data) {
            return ((BpmnAssociationData) data).mAssociationDirection;
        }

        @objid ("0c278a2b-8344-47d8-a224-c7cab6a7e9a5")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnAssociationData) data).mAssociationDirection = value;
        }

    }

    @objid ("82a29ea6-e383-4e3e-8cb5-bc923322a317")
    public static class TargetRefSmDependency extends SmSingleDependency {
        @objid ("1bc0466b-9bb1-4474-91a7-d292b94fb0af")
        private SmDependency symetricDep;

        @objid ("ee20816f-84c1-4f40-8477-20fd22a596d5")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnAssociationData) data).mTargetRef;
        }

        @objid ("b895d2ef-3e5e-4514-965d-f930c73ad249")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnAssociationData) data).mTargetRef = value;
        }

        @objid ("af4376fb-b099-45e4-9c01-d9d6987e6d5a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnBaseElementSmClass)this.getTarget()).getIncomingAssocDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a6357066-ad93-4fc8-9558-00b40588221f")
    public static class SourceRefSmDependency extends SmSingleDependency {
        @objid ("a0ee4e35-b378-472f-9c94-1a2835329ac6")
        private SmDependency symetricDep;

        @objid ("06f85c0a-dde6-42e6-b94d-cee9ef6e7cfb")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnAssociationData) data).mSourceRef;
        }

        @objid ("d399e089-5b85-42af-9ca6-d7112fc0c86b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnAssociationData) data).mSourceRef = value;
        }

        @objid ("32327d8c-0801-4cf2-838a-c2fbdbfb2bdc")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnBaseElementSmClass)this.getTarget()).getOutgoingAssocDep();
            }
            return this.symetricDep;
        }

    }

}
