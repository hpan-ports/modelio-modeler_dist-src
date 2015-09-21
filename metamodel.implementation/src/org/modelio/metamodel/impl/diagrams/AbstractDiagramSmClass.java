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
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.impl.diagrams.DiagramSetSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
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

@objid ("aa6381c6-52b5-44e0-a8e3-06e0f2ea2012")
public class AbstractDiagramSmClass extends ModelElementSmClass {
    @objid ("eaefdfa0-ef40-4adf-b09f-e079458c9e01")
    private SmAttribute uiDataVersionAtt;

    @objid ("327a6f50-c3da-4327-bee4-7aff1a7e3b8f")
    private SmAttribute uiDataAtt;

    @objid ("4114e9d5-be91-44cf-980b-4f756e60119b")
    private SmAttribute pdePropertiesAtt;

    @objid ("654a7d98-a2e7-4fe4-a85d-978cf5fbc736")
    private SmDependency originDep;

    @objid ("47314d32-e4cf-42e6-bd10-afe0feb185c4")
    private SmDependency representedDep;

    @objid ("ea92be85-104c-45f9-9558-48e3c91f0901")
    private SmDependency referencingSetDep;

    @objid ("263486d1-b813-43db-b4db-b6a29a383b18")
    public AbstractDiagramSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3911d551-6a24-45c5-aca4-991441d4fe8e")
    @Override
    public String getName() {
        return "AbstractDiagram";
    }

    @objid ("f81781e8-0149-4135-bcf6-462ceae0987e")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d73a25d4-ec09-46df-a86c-47fa4c2230b2")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return AbstractDiagram.class;
    }

    @objid ("137164e7-31c7-43a1-9b1a-b230dbaa313b")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("f3546c03-8467-4a25-bf92-40b096979395")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("c71f8274-64e0-47f0-a436-5bcac9f578cb")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new AbstractDiagramObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.uiDataVersionAtt = new UiDataVersionSmAttribute();
        this.uiDataVersionAtt.init("UiDataVersion", this, Integer.class );
        registerAttribute(this.uiDataVersionAtt);
        
        this.uiDataAtt = new UiDataSmAttribute();
        this.uiDataAtt.init("UiData", this, String.class );
        registerAttribute(this.uiDataAtt);
        
        this.pdePropertiesAtt = new PdePropertiesSmAttribute();
        this.pdePropertiesAtt.init("PdeProperties", this, String.class );
        registerAttribute(this.pdePropertiesAtt);
        
        
        // Initialize and register the SmDependency
        this.originDep = new OriginSmDependency();
        this.originDep.init("Origin", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.originDep);
        
        this.representedDep = new RepresentedSmDependency();
        this.representedDep.init("Represented", this, metamodel.getMClass("Element"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedDep);
        
        this.referencingSetDep = new ReferencingSetSmDependency();
        this.referencingSetDep.init("ReferencingSet", this, metamodel.getMClass("DiagramSet"), 0, -1 );
        registerDependency(this.referencingSetDep);
    }

    @objid ("02a1815a-7c76-461b-9e12-6e053a60c718")
    public SmAttribute getUiDataVersionAtt() {
        if (this.uiDataVersionAtt == null) {
        	this.uiDataVersionAtt = this.getAttributeDef("UiDataVersion");
        }
        return this.uiDataVersionAtt;
    }

    @objid ("20360b0f-189c-4b01-88c8-8d43c598800d")
    public SmAttribute getUiDataAtt() {
        if (this.uiDataAtt == null) {
        	this.uiDataAtt = this.getAttributeDef("UiData");
        }
        return this.uiDataAtt;
    }

    @objid ("af7d7c45-56ac-478f-8bb1-c1f3b1525041")
    public SmAttribute getPdePropertiesAtt() {
        if (this.pdePropertiesAtt == null) {
        	this.pdePropertiesAtt = this.getAttributeDef("PdeProperties");
        }
        return this.pdePropertiesAtt;
    }

    @objid ("08e019c1-29e7-4023-a661-63a3270c201d")
    public SmDependency getOriginDep() {
        if (this.originDep == null) {
        	this.originDep = this.getDependencyDef("Origin");
        }
        return this.originDep;
    }

    @objid ("09a6b5bd-b6a9-4f9a-8f2b-26e58e4140ce")
    public SmDependency getRepresentedDep() {
        if (this.representedDep == null) {
        	this.representedDep = this.getDependencyDef("Represented");
        }
        return this.representedDep;
    }

    @objid ("e19c1a6b-db84-4113-9b4a-f9a4da300307")
    public SmDependency getReferencingSetDep() {
        if (this.referencingSetDep == null) {
        	this.referencingSetDep = this.getDependencyDef("ReferencingSet");
        }
        return this.referencingSetDep;
    }

    @objid ("e8a926b7-34ea-4873-a1e8-363c351ee8fc")
    private static class AbstractDiagramObjectFactory implements ISmObjectFactory {
        @objid ("5c53e2a4-8982-42e1-a40c-f2a0795528b1")
        private AbstractDiagramSmClass smClass;

        @objid ("77014df4-ce37-42ff-80c9-7ec84217924e")
        public AbstractDiagramObjectFactory(AbstractDiagramSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("60c04804-7a27-4138-b9fa-b849e2dc66a0")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("cbd945de-255e-4393-9da3-5b4ebc66bc98")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("267ab672-535e-4bcc-a7a9-b48435fd9645")
    public static class UiDataVersionSmAttribute extends SmAttribute {
        @objid ("d576f7c0-15a0-4ea2-a09e-5cc4643f3a5c")
        public Object getValue(ISmObjectData data) {
            return ((AbstractDiagramData) data).mUiDataVersion;
        }

        @objid ("6fc83a5b-bf24-4646-8480-eb7f0719d16f")
        public void setValue(ISmObjectData data, Object value) {
            ((AbstractDiagramData) data).mUiDataVersion = value;
        }

    }

    @objid ("582eccc1-755e-4c35-9697-8b112fe6877e")
    public static class UiDataSmAttribute extends SmAttribute {
        @objid ("cb7fce6b-97f2-49f0-aa10-214573b08e8c")
        public Object getValue(ISmObjectData data) {
            return ((AbstractDiagramData) data).mUiData;
        }

        @objid ("a7df7b7f-38be-485f-a086-173429b4b32e")
        public void setValue(ISmObjectData data, Object value) {
            ((AbstractDiagramData) data).mUiData = value;
        }

    }

    @objid ("5e3530e8-a66f-4d60-b642-1a3ca9191f74")
    public static class PdePropertiesSmAttribute extends SmAttribute {
        @objid ("e956a749-d9dd-407f-839a-6ea71aa9ecb0")
        public Object getValue(ISmObjectData data) {
            return ((AbstractDiagramData) data).mPdeProperties;
        }

        @objid ("a97ba049-9833-4baf-8ec7-ff702a4f2357")
        public void setValue(ISmObjectData data, Object value) {
            ((AbstractDiagramData) data).mPdeProperties = value;
        }

    }

    @objid ("c39bad85-5dd9-4423-bc61-22161657d5e6")
    public static class OriginSmDependency extends SmSingleDependency {
        @objid ("19f52f1c-30f2-49d8-a59c-98520a974d63")
        private SmDependency symetricDep;

        @objid ("758538c0-bf58-4de5-965e-ee5ad2a0a5cb")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((AbstractDiagramData) data).mOrigin;
        }

        @objid ("c9dab959-4a24-4980-9465-c0f837be0228")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((AbstractDiagramData) data).mOrigin = value;
        }

        @objid ("0d452159-2369-43e8-bd4c-111d4e6fdb4c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getProductDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c9eb88f0-7c19-4f64-9da8-fb0453ebedc2")
    public static class RepresentedSmDependency extends SmMultipleDependency {
        @objid ("c164da69-d3c9-450e-b2e5-98c94e125058")
        private SmDependency symetricDep;

        @objid ("cb53c98b-8c03-4d1e-9225-65c8713bff3d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AbstractDiagramData)data).mRepresented != null)? ((AbstractDiagramData)data).mRepresented:SmMultipleDependency.EMPTY;
        }

        @objid ("f95093ad-3e1e-4d35-8c5b-829147b636fa")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AbstractDiagramData) data).mRepresented = values;
        }

        @objid ("fc6d373f-44e8-497c-8fcd-e0d60b5ec604")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ElementSmClass)this.getTarget()).getDiagramElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3826a2af-0afe-48ac-90f1-79a3e6c9586b")
    public static class ReferencingSetSmDependency extends SmMultipleDependency {
        @objid ("95505435-e7e5-468e-8e0f-11e25c6047fd")
        private SmDependency symetricDep;

        @objid ("f83be901-dd2a-4b5a-b43c-1a91830e36ea")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((AbstractDiagramData)data).mReferencingSet != null)? ((AbstractDiagramData)data).mReferencingSet:SmMultipleDependency.EMPTY;
        }

        @objid ("4438f2a8-4437-4b26-9eda-f0ea31dc5f11")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((AbstractDiagramData) data).mReferencingSet = values;
        }

        @objid ("e5da0197-f8a4-4a02-949e-5ed7f569b4e7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DiagramSetSmClass)this.getTarget()).getReferencedDiagramDep();
            }
            return this.symetricDep;
        }

    }

}
