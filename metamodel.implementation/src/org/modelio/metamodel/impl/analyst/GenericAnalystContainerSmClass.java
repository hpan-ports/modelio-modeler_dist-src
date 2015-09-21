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
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.impl.analyst.AnalystContainerSmClass;
import org.modelio.metamodel.impl.analyst.AnalystProjectSmClass;
import org.modelio.metamodel.impl.analyst.GenericAnalystContainerSmClass;
import org.modelio.metamodel.impl.analyst.GenericAnalystElementSmClass;
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

@objid ("2f36c9e7-80f4-49cd-a134-79d767c6f72e")
public class GenericAnalystContainerSmClass extends AnalystContainerSmClass {
    @objid ("e09aeb72-d484-4650-a457-e7e719287de6")
    private SmDependency ownedElementDep;

    @objid ("65b9766e-5b58-4d16-96d6-9e0469945aa2")
    private SmDependency ownerContainerDep;

    @objid ("ac8da098-1952-4d44-8aeb-1aaad2e6545f")
    private SmDependency ownedContainerDep;

    @objid ("0ba3eb92-7cdd-4dcb-877c-e5f6dd550bce")
    private SmDependency ownerProjectDep;

    @objid ("17eaea5e-a3b4-4efe-9240-aef3549fd164")
    public GenericAnalystContainerSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("f1d1f256-ace1-4668-a270-04ab4cbaa784")
    @Override
    public String getName() {
        return "GenericAnalystContainer";
    }

    @objid ("51de5e0d-8512-4ca2-a17a-e7401694ab1a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("756c1c98-76ea-4968-b3cd-7b2a3ca22c60")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return GenericAnalystContainer.class;
    }

    @objid ("9fedc196-9f68-4440-84ea-13c83c689219")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("3a0ed6dc-ad71-4a4f-8f7a-ee347b865d10")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a90cf56b-0692-4010-b7ec-7918c6dadd4a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystContainer");
        this.registerFactory(new GenericAnalystContainerObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownedElementDep = new OwnedElementSmDependency();
        this.ownedElementDep.init("OwnedElement", this, metamodel.getMClass("GenericAnalystElement"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedElementDep);
        
        this.ownerContainerDep = new OwnerContainerSmDependency();
        this.ownerContainerDep.init("OwnerContainer", this, metamodel.getMClass("GenericAnalystContainer"), 0, 1 );
        registerDependency(this.ownerContainerDep);
        
        this.ownedContainerDep = new OwnedContainerSmDependency();
        this.ownedContainerDep.init("OwnedContainer", this, metamodel.getMClass("GenericAnalystContainer"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedContainerDep);
        
        this.ownerProjectDep = new OwnerProjectSmDependency();
        this.ownerProjectDep.init("OwnerProject", this, metamodel.getMClass("AnalystProject"), 0, 1 );
        registerDependency(this.ownerProjectDep);
    }

    @objid ("035e1b05-82f6-4d93-b58c-2c9e3972c3d0")
    public SmDependency getOwnedElementDep() {
        if (this.ownedElementDep == null) {
        	this.ownedElementDep = this.getDependencyDef("OwnedElement");
        }
        return this.ownedElementDep;
    }

    @objid ("1a430bd1-33dc-467c-a679-f5dc186f7e46")
    public SmDependency getOwnerContainerDep() {
        if (this.ownerContainerDep == null) {
        	this.ownerContainerDep = this.getDependencyDef("OwnerContainer");
        }
        return this.ownerContainerDep;
    }

    @objid ("0f7259cb-3258-4ddb-a419-965a0522fd29")
    public SmDependency getOwnedContainerDep() {
        if (this.ownedContainerDep == null) {
        	this.ownedContainerDep = this.getDependencyDef("OwnedContainer");
        }
        return this.ownedContainerDep;
    }

    @objid ("718bd04f-20a4-48cd-9869-e3d1e192e664")
    public SmDependency getOwnerProjectDep() {
        if (this.ownerProjectDep == null) {
        	this.ownerProjectDep = this.getDependencyDef("OwnerProject");
        }
        return this.ownerProjectDep;
    }

    @objid ("bceae186-7228-4baa-8afe-f97f134e7c66")
    private static class GenericAnalystContainerObjectFactory implements ISmObjectFactory {
        @objid ("f4873edb-9b07-452a-90b9-768994810993")
        private GenericAnalystContainerSmClass smClass;

        @objid ("e6b258fb-2032-4a36-97f3-ee00d120bdd7")
        public GenericAnalystContainerObjectFactory(GenericAnalystContainerSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("f962f1c9-b624-4ef4-a0de-cfbeae2c34cf")
        @Override
        public ISmObjectData createData() {
            return new GenericAnalystContainerData(this.smClass);
        }

        @objid ("262d5c18-a9ac-43de-b0f5-27d8f3708f5d")
        @Override
        public SmObjectImpl createImpl() {
            return new GenericAnalystContainerImpl();
        }

    }

    @objid ("4e34edc0-890f-48fa-8fb0-c98ef81af509")
    public static class OwnedElementSmDependency extends SmMultipleDependency {
        @objid ("07c07205-d4b2-46c6-b9bd-756f8731e64f")
        private SmDependency symetricDep;

        @objid ("d38f869c-014e-4ad2-b95b-af50d11dbf9a")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GenericAnalystContainerData)data).mOwnedElement != null)? ((GenericAnalystContainerData)data).mOwnedElement:SmMultipleDependency.EMPTY;
        }

        @objid ("7f4a1e3b-c965-43ef-b338-48472b898d5c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GenericAnalystContainerData) data).mOwnedElement = values;
        }

        @objid ("773d0ffc-731d-417e-b9bb-ac7c82d6ca40")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GenericAnalystElementSmClass)this.getTarget()).getOwnerContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2435c43c-1b87-4dc7-aa67-06d268fb967b")
    public static class OwnerContainerSmDependency extends SmSingleDependency {
        @objid ("2c1e547d-6032-479c-9a71-96a06976a944")
        private SmDependency symetricDep;

        @objid ("f5cd4e33-77a0-4142-a96a-7b9bb465ca02")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GenericAnalystContainerData) data).mOwnerContainer;
        }

        @objid ("7796c2ad-3a8c-431a-b773-1c8df1857237")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GenericAnalystContainerData) data).mOwnerContainer = value;
        }

        @objid ("79a52073-f301-40f1-8e59-4d4d4e46a760")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GenericAnalystContainerSmClass)this.getTarget()).getOwnedContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a63b19e9-a7ba-4932-a0d3-7a1588ecadc8")
    public static class OwnedContainerSmDependency extends SmMultipleDependency {
        @objid ("a5c55403-616c-4f64-8238-af664bb69431")
        private SmDependency symetricDep;

        @objid ("748a2193-fcb0-492b-9691-e47671b119b4")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GenericAnalystContainerData)data).mOwnedContainer != null)? ((GenericAnalystContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
        }

        @objid ("4b515f3f-f6c3-41e2-a8e1-1b4d6fa2c92c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GenericAnalystContainerData) data).mOwnedContainer = values;
        }

        @objid ("6f38a463-31ff-4f19-847c-2609cea15b37")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GenericAnalystContainerSmClass)this.getTarget()).getOwnerContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2e2dc447-bcba-471d-886a-766a6381caa8")
    public static class OwnerProjectSmDependency extends SmSingleDependency {
        @objid ("6b92fb25-d83e-4100-a643-08b49790a56f")
        private SmDependency symetricDep;

        @objid ("8069299b-a969-45cf-b2b7-6bee43d8d793")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GenericAnalystContainerData) data).mOwnerProject;
        }

        @objid ("3f472ceb-54d6-48fb-a28d-8d754138e883")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GenericAnalystContainerData) data).mOwnerProject = value;
        }

        @objid ("1cd9162f-70b1-4256-9167-fa245f5e5274")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AnalystProjectSmClass)this.getTarget()).getGenericRootDep();
            }
            return this.symetricDep;
        }

    }

}
