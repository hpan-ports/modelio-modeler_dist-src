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
package org.modelio.metamodel.impl.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnEndPointSmClass;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnInterfaceSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnCollaborationSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnProcessSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.PackageSmClass;
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

@objid ("5db43980-04e8-4f81-91a7-b9b3b1c4e86e")
public class BpmnParticipantSmClass extends BpmnBaseElementSmClass {
    @objid ("e0634ca8-d78e-459d-b8d3-41a36142309b")
    private SmAttribute multiplicityMinAtt;

    @objid ("445ac531-9ff5-457a-83f4-0a2bd690a247")
    private SmAttribute multiplicityMaxAtt;

    @objid ("55f37a8e-ea1c-42c1-bd19-d756ca3c2c37")
    private SmDependency processDep;

    @objid ("a123f592-4dc4-4dbf-9922-27a79f2d3462")
    private SmDependency containerDep;

    @objid ("e46968c1-9068-4b7a-806d-69e7bf5bdad3")
    private SmDependency typeDep;

    @objid ("ba15fb25-7bf1-4e54-992f-fd6f850f7df9")
    private SmDependency endPointRefsDep;

    @objid ("23a222d7-09bf-4e96-a5ce-a480ca0df1f1")
    private SmDependency interfaceRefsDep;

    @objid ("b84272e5-3881-46b8-9aa9-74fcd124f1e4")
    private SmDependency packageRefDep;

    @objid ("b93feea4-42ce-4c0a-bb27-3b529e076183")
    public BpmnParticipantSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("d0b65645-c63d-4e87-a07e-941b87a4a62f")
    @Override
    public String getName() {
        return "BpmnParticipant";
    }

    @objid ("22ddde71-2036-47b8-9baa-0cc108a6c6ae")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("a3dc23cf-1850-47eb-9008-8201022ebfc6")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnParticipant.class;
    }

    @objid ("c604fe6a-ea8e-433a-bbe4-25946b6ff04f")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("fc575292-0ec1-4c35-998e-170db1c61757")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a2f43aac-3238-4fbc-857d-0e727266d270")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnParticipantObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.multiplicityMinAtt = new MultiplicityMinSmAttribute();
        this.multiplicityMinAtt.init("MultiplicityMin", this, Integer.class );
        registerAttribute(this.multiplicityMinAtt);
        
        this.multiplicityMaxAtt = new MultiplicityMaxSmAttribute();
        this.multiplicityMaxAtt.init("MultiplicityMax", this, Integer.class );
        registerAttribute(this.multiplicityMaxAtt);
        
        
        // Initialize and register the SmDependency
        this.processDep = new ProcessSmDependency();
        this.processDep.init("Process", this, metamodel.getMClass("BpmnProcess"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.processDep);
        
        this.containerDep = new ContainerSmDependency();
        this.containerDep.init("Container", this, metamodel.getMClass("BpmnCollaboration"), 1, 1 );
        registerDependency(this.containerDep);
        
        this.typeDep = new TypeSmDependency();
        this.typeDep.init("Type", this, metamodel.getMClass("Classifier"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.typeDep);
        
        this.endPointRefsDep = new EndPointRefsSmDependency();
        this.endPointRefsDep.init("EndPointRefs", this, metamodel.getMClass("BpmnEndPoint"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.endPointRefsDep);
        
        this.interfaceRefsDep = new InterfaceRefsSmDependency();
        this.interfaceRefsDep.init("InterfaceRefs", this, metamodel.getMClass("BpmnInterface"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.interfaceRefsDep);
        
        this.packageRefDep = new PackageRefSmDependency();
        this.packageRefDep.init("PackageRef", this, metamodel.getMClass("Package"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.packageRefDep);
    }

    @objid ("0d496333-5e79-4622-8e23-201f6b9fd8e3")
    public SmAttribute getMultiplicityMinAtt() {
        if (this.multiplicityMinAtt == null) {
        	this.multiplicityMinAtt = this.getAttributeDef("MultiplicityMin");
        }
        return this.multiplicityMinAtt;
    }

    @objid ("8e3dec5c-993b-45d8-8d6e-971ce01e1e5a")
    public SmAttribute getMultiplicityMaxAtt() {
        if (this.multiplicityMaxAtt == null) {
        	this.multiplicityMaxAtt = this.getAttributeDef("MultiplicityMax");
        }
        return this.multiplicityMaxAtt;
    }

    @objid ("37067b2a-aaa6-44fb-b9a9-646144d4571a")
    public SmDependency getProcessDep() {
        if (this.processDep == null) {
        	this.processDep = this.getDependencyDef("Process");
        }
        return this.processDep;
    }

    @objid ("5e1dda7c-ee30-4950-b2e1-c6a447dee2ac")
    public SmDependency getContainerDep() {
        if (this.containerDep == null) {
        	this.containerDep = this.getDependencyDef("Container");
        }
        return this.containerDep;
    }

    @objid ("57ca24e4-5ac9-4bcf-adbe-eac55e028829")
    public SmDependency getTypeDep() {
        if (this.typeDep == null) {
        	this.typeDep = this.getDependencyDef("Type");
        }
        return this.typeDep;
    }

    @objid ("de56ec76-2d0f-446d-a6d0-f26bef6309a4")
    public SmDependency getEndPointRefsDep() {
        if (this.endPointRefsDep == null) {
        	this.endPointRefsDep = this.getDependencyDef("EndPointRefs");
        }
        return this.endPointRefsDep;
    }

    @objid ("e357baea-bc0f-4414-894b-281d4d0ff967")
    public SmDependency getInterfaceRefsDep() {
        if (this.interfaceRefsDep == null) {
        	this.interfaceRefsDep = this.getDependencyDef("InterfaceRefs");
        }
        return this.interfaceRefsDep;
    }

    @objid ("0904e281-e76c-42e7-be40-e5bb83fc929b")
    public SmDependency getPackageRefDep() {
        if (this.packageRefDep == null) {
        	this.packageRefDep = this.getDependencyDef("PackageRef");
        }
        return this.packageRefDep;
    }

    @objid ("66d18bfc-3b46-4fb7-9512-3249902c3775")
    private static class BpmnParticipantObjectFactory implements ISmObjectFactory {
        @objid ("e3bd7432-3955-4439-96a0-964f48875010")
        private BpmnParticipantSmClass smClass;

        @objid ("95361072-3b13-4543-9798-51d72a342452")
        public BpmnParticipantObjectFactory(BpmnParticipantSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("a18aa5e8-792d-4de0-acde-1d3f48415c08")
        @Override
        public ISmObjectData createData() {
            return new BpmnParticipantData(this.smClass);
        }

        @objid ("e5ffcd0f-f1f0-4ab0-ac35-3a723558a1fd")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnParticipantImpl();
        }

    }

    @objid ("ea02bf72-4bc7-4a05-bf27-0ae418cb1497")
    public static class MultiplicityMinSmAttribute extends SmAttribute {
        @objid ("d940e117-81d5-4d4d-aae4-8468ea7d847c")
        public Object getValue(ISmObjectData data) {
            return ((BpmnParticipantData) data).mMultiplicityMin;
        }

        @objid ("585a2f1f-1913-4e29-b141-82d6b4530c18")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnParticipantData) data).mMultiplicityMin = value;
        }

    }

    @objid ("e8b37e4f-3e3b-4b73-b8cc-cc244d2e283e")
    public static class MultiplicityMaxSmAttribute extends SmAttribute {
        @objid ("dd203fdb-2109-4976-85c6-1d7dff1764c9")
        public Object getValue(ISmObjectData data) {
            return ((BpmnParticipantData) data).mMultiplicityMax;
        }

        @objid ("311e1220-933c-4c6b-892c-4d441a2b8785")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnParticipantData) data).mMultiplicityMax = value;
        }

    }

    @objid ("f2c9fcd0-1518-475e-b2b9-188aae16ac79")
    public static class ProcessSmDependency extends SmSingleDependency {
        @objid ("bb9fe30c-bd17-4f16-bc2c-6b82ada98a4f")
        private SmDependency symetricDep;

        @objid ("570c7030-51ea-41c9-9644-5bf0c7d6aa4c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnParticipantData) data).mProcess;
        }

        @objid ("344129ef-7c6a-4a91-bf80-ca38a182ebc1")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnParticipantData) data).mProcess = value;
        }

        @objid ("ea7b6d47-a80a-4adb-a952-7aa96b5dca99")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnProcessSmClass)this.getTarget()).getParticipantDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3066075e-bcff-4bda-bfaf-c3bcaa6c274f")
    public static class ContainerSmDependency extends SmSingleDependency {
        @objid ("3ee3bdcb-f441-4323-8f95-a562bfd0d8d1")
        private SmDependency symetricDep;

        @objid ("b5372894-41fd-4dfe-b12c-cf61da4a4281")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnParticipantData) data).mContainer;
        }

        @objid ("5e563a87-091d-4144-ad48-9233a8e9f9c4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnParticipantData) data).mContainer = value;
        }

        @objid ("9fe73e6a-3fc0-4282-8e2a-f01f0b14327a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnCollaborationSmClass)this.getTarget()).getParticipantsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1dd9483e-480e-440b-a663-ef5f37ba0775")
    public static class TypeSmDependency extends SmSingleDependency {
        @objid ("ce0ffc02-e7b4-4fda-a8d3-2a51c827c5f9")
        private SmDependency symetricDep;

        @objid ("0337ef9d-f4b3-412e-9211-594164f3fcf6")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnParticipantData) data).mType;
        }

        @objid ("6255ba25-8c58-4555-b895-f2791eef0697")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnParticipantData) data).mType = value;
        }

        @objid ("f7963537-7ac1-4b81-869a-4d653698f198")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getBpmnRepresentsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7b6464a9-9b8e-4668-bb95-6d19f1d6a4c6")
    public static class EndPointRefsSmDependency extends SmMultipleDependency {
        @objid ("d467b362-be04-478a-92c5-a13317c30306")
        private SmDependency symetricDep;

        @objid ("5f378079-4e6e-4914-ad30-c57549859991")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnParticipantData)data).mEndPointRefs != null)? ((BpmnParticipantData)data).mEndPointRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("503604ac-5270-4e76-878a-fa25dd651603")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnParticipantData) data).mEndPointRefs = values;
        }

        @objid ("7c8a69a8-ff72-4a52-96f4-2628acfad849")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnEndPointSmClass)this.getTarget()).getParticipantRefsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7c59ac52-7272-4d7d-877e-31f7e97dfd50")
    public static class InterfaceRefsSmDependency extends SmMultipleDependency {
        @objid ("a21b446f-586f-4325-8771-87d60585aa56")
        private SmDependency symetricDep;

        @objid ("62c3f069-3875-4458-a336-416da9055d6a")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnParticipantData)data).mInterfaceRefs != null)? ((BpmnParticipantData)data).mInterfaceRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("7b2a3f38-d949-4f3d-8fe3-a932b69df2cb")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnParticipantData) data).mInterfaceRefs = values;
        }

        @objid ("35333b6a-5fe1-40c5-bdce-a364c7add514")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnInterfaceSmClass)this.getTarget()).getParticipantRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2c523b06-0cc2-4b3d-97ff-e159edf48448")
    public static class PackageRefSmDependency extends SmSingleDependency {
        @objid ("876013ce-db9e-44a2-8c86-f6e93ef0bd09")
        private SmDependency symetricDep;

        @objid ("f7e0e448-0b0b-4166-ae3d-95966bc7a6fc")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnParticipantData) data).mPackageRef;
        }

        @objid ("79a86c13-7a47-48ba-905a-7d06a9a02190")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnParticipantData) data).mPackageRef = value;
        }

        @objid ("13f69f3e-f246-4aaa-a26b-cee1b56c2a03")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PackageSmClass)this.getTarget()).getBpmnRepresentsDep();
            }
            return this.symetricDep;
        }

    }

}
