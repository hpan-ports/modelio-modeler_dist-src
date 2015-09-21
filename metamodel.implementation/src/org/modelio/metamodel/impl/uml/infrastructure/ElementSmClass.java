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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.diagrams.AbstractDiagramSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.QueryDefinitionSmClass;
import org.modelio.metamodel.impl.uml.statik.NamespaceUseSmClass;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.SmObjectSmClass;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("5e35cfc3-aa81-4d13-bfe8-4dc4d833f6aa")
public class ElementSmClass extends SmObjectSmClass {
    @objid ("1da75991-3896-4aa3-af27-370f8a11254d")
    private SmDependency diagramElementDep;

    @objid ("e888edaf-4255-4334-9b55-c853f1bae77b")
    private SmDependency causingDep;

    @objid ("bae41e91-5d77-4a02-9d57-880ad0ac46f8")
    private SmDependency addedToQueryDep;

    @objid ("e9b968fd-6b34-4f42-a8a6-43428226b36f")
    public ElementSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("a2a5f173-b566-4ad6-b3b2-219a26273e04")
    @Override
    public String getName() {
        return "Element";
    }

    @objid ("10f37a12-ceb1-4664-8080-981cc2a9faf4")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("af27e865-007e-4b23-b354-2b87092aa622")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Element.class;
    }

    @objid ("c0eaa592-13cd-4cf1-b094-5c6ecdc970cb")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("af837d08-d087-4f99-a8ea-234217482dd6")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("be670df3-8d57-44ea-849b-cff09218eb40")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("SmObject");
        this.registerFactory(new ElementObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.diagramElementDep = new DiagramElementSmDependency();
        this.diagramElementDep.init("DiagramElement", this, metamodel.getMClass("AbstractDiagram"), 0, -1 );
        registerDependency(this.diagramElementDep);
        
        this.causingDep = new CausingSmDependency();
        this.causingDep.init("Causing", this, metamodel.getMClass("NamespaceUse"), 0, -1 );
        registerDependency(this.causingDep);
        
        this.addedToQueryDep = new AddedToQuerySmDependency();
        this.addedToQueryDep.init("AddedToQuery", this, metamodel.getMClass("QueryDefinition"), 0, -1 , SmDirective.SMCDDYNAMIC);
        registerDependency(this.addedToQueryDep);
    }

    @objid ("4c3be4aa-6d92-4af0-b4ff-47cf26ddd3ab")
    public SmDependency getDiagramElementDep() {
        if (this.diagramElementDep == null) {
        	this.diagramElementDep = this.getDependencyDef("DiagramElement");
        }
        return this.diagramElementDep;
    }

    @objid ("408e9375-3f35-4e44-bd72-44b11017004d")
    public SmDependency getCausingDep() {
        if (this.causingDep == null) {
        	this.causingDep = this.getDependencyDef("Causing");
        }
        return this.causingDep;
    }

    @objid ("262001e2-96eb-45d0-ae31-e6184980b616")
    public SmDependency getAddedToQueryDep() {
        if (this.addedToQueryDep == null) {
        	this.addedToQueryDep = this.getDependencyDef("AddedToQuery");
        }
        return this.addedToQueryDep;
    }

    @objid ("a6db2268-e707-4125-91bc-8401d3c29801")
    private static class ElementObjectFactory implements ISmObjectFactory {
        @objid ("d88ff6f5-4e60-46f9-98b2-67284fb40019")
        private ElementSmClass smClass;

        @objid ("9a5c6dde-d6f3-4faa-b3ec-153abcda07e6")
        public ElementObjectFactory(ElementSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("90403601-c215-4a15-b6d3-13ff0ff09bec")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("7b8b3cc1-d4d0-459f-93ba-f6085177e5dd")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("cff14e2a-0874-4dd4-83b5-577a9f0302ae")
    public static class DiagramElementSmDependency extends SmMultipleDependency {
        @objid ("6657f512-aabe-48e1-aeb0-2df77b42b0b0")
        private SmDependency symetricDep;

        @objid ("f7a5e0ce-b9c4-44b7-a3f0-7745c01a85b2")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ElementData)data).mDiagramElement != null)? ((ElementData)data).mDiagramElement:SmMultipleDependency.EMPTY;
        }

        @objid ("ee292902-9e22-4f7e-83bd-6565bc482821")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ElementData) data).mDiagramElement = values;
        }

        @objid ("c4bf9f87-d153-4f8f-9ebd-a9576e203032")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AbstractDiagramSmClass)this.getTarget()).getRepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0e66f172-9e7a-4f69-9eec-a391498b1fa1")
    public static class CausingSmDependency extends SmMultipleDependency {
        @objid ("566eaed4-523c-4aa8-af8f-390d423c715f")
        private SmDependency symetricDep;

        @objid ("895aebf9-9ac1-48d2-82db-f6c7bb5c6131")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ElementData)data).mCausing != null)? ((ElementData)data).mCausing:SmMultipleDependency.EMPTY;
        }

        @objid ("89c29b6e-10cc-4c69-9cfe-58b3280e7605")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ElementData) data).mCausing = values;
        }

        @objid ("91e3da3c-8b5b-45af-883c-218e4e57c9d7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NamespaceUseSmClass)this.getTarget()).getCauseDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("327bfe53-1851-4507-b0e3-0f2f3127a611")
    public static class AddedToQuerySmDependency extends SmMultipleDependency {
        @objid ("0d33b5ee-fd66-481d-be57-2f461f059175")
        private SmDependency symetricDep;

        @objid ("acdbdef0-b3ee-44dc-bd8c-b3c47229b5ea")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ElementData)data).mAddedToQuery != null)? ((ElementData)data).mAddedToQuery:SmMultipleDependency.EMPTY;
        }

        @objid ("cd755613-e25e-43ed-a814-eea8d1e7846e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ElementData) data).mAddedToQuery = values;
        }

        @objid ("e41de24e-6916-499b-8f36-a3a884c127c6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((QueryDefinitionSmClass)this.getTarget()).getAddedDep();
            }
            return this.symetricDep;
        }

    }

}
