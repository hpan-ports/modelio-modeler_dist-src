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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.BindingSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkEndSmClass;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
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

@objid ("9be2b5a2-c153-473d-878e-f3214b6f8407")
public class ConnectorEndSmClass extends LinkEndSmClass {
    @objid ("48dec8f8-eec9-4317-9d30-62e429222312")
    private SmDependency representationDep;

    @objid ("c11bf4a4-1111-4e14-b645-b25a1358574b")
    private SmDependency representedFeatureDep;

    @objid ("5ebcc26f-56e4-474c-997c-80de31320f30")
    public ConnectorEndSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("bdf74eca-14e7-4a10-bef4-b8cfdeeaa264")
    @Override
    public String getName() {
        return "ConnectorEnd";
    }

    @objid ("7e3e53a1-9635-49e0-9750-ffc7994963c1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("0ac938ad-236f-4ddf-9537-ec529190492c")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ConnectorEnd.class;
    }

    @objid ("abac3c58-7a43-4d22-8732-eb495181d0c4")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("10e10b23-6e35-44a4-a7ac-b94586e98bff")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("3535f85a-9511-4421-a70d-92ad5157540a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("LinkEnd");
        this.registerFactory(new ConnectorEndObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.representationDep = new RepresentationSmDependency();
        this.representationDep.init("Representation", this, metamodel.getMClass("Binding"), 0, -1 );
        registerDependency(this.representationDep);
        
        this.representedFeatureDep = new RepresentedFeatureSmDependency();
        this.representedFeatureDep.init("RepresentedFeature", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedFeatureDep);
    }

    @objid ("e66c7014-6f21-47e5-9e92-889970fa05d3")
    public SmDependency getRepresentationDep() {
        if (this.representationDep == null) {
        	this.representationDep = this.getDependencyDef("Representation");
        }
        return this.representationDep;
    }

    @objid ("ca438ac6-b1b7-4b52-accb-0d4a424effa2")
    public SmDependency getRepresentedFeatureDep() {
        if (this.representedFeatureDep == null) {
        	this.representedFeatureDep = this.getDependencyDef("RepresentedFeature");
        }
        return this.representedFeatureDep;
    }

    @objid ("6e2f1a9b-68a8-491e-904a-6e54c6cd7a05")
    private static class ConnectorEndObjectFactory implements ISmObjectFactory {
        @objid ("df97d5fd-0239-408c-87ef-b57c5aecb905")
        private ConnectorEndSmClass smClass;

        @objid ("4315e882-8beb-43c3-b81f-6be92d1c9149")
        public ConnectorEndObjectFactory(ConnectorEndSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("cba89c27-b749-4ebe-82b0-af12af054b00")
        @Override
        public ISmObjectData createData() {
            return new ConnectorEndData(this.smClass);
        }

        @objid ("a4768b11-9386-4c98-822b-edd40c60c838")
        @Override
        public SmObjectImpl createImpl() {
            return new ConnectorEndImpl();
        }

    }

    @objid ("b47255d3-97bf-4426-9d36-d568645aa29d")
    public static class RepresentationSmDependency extends SmMultipleDependency {
        @objid ("e26d41e5-d436-4172-a54f-732e42e0d45e")
        private SmDependency symetricDep;

        @objid ("fdab4a30-aebc-47a3-a9a2-97f4547db550")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ConnectorEndData)data).mRepresentation != null)? ((ConnectorEndData)data).mRepresentation:SmMultipleDependency.EMPTY;
        }

        @objid ("2b0d5689-c72d-45a1-9d0b-98f33cc90050")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ConnectorEndData) data).mRepresentation = values;
        }

        @objid ("ae81b7fc-fb25-4c49-b8ac-44f313079440")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BindingSmClass)this.getTarget()).getConnectorEndRoleDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("eaf82976-ebea-4e32-bbd0-e89f62c0b172")
    public static class RepresentedFeatureSmDependency extends SmSingleDependency {
        @objid ("6df38d9b-df56-4afb-8a8b-0f59690c5fea")
        private SmDependency symetricDep;

        @objid ("f53e9728-a419-4e1e-b156-216e567e22c6")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ConnectorEndData) data).mRepresentedFeature;
        }

        @objid ("b076e28b-ab53-4117-b18c-5d57fa4bc2ec")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ConnectorEndData) data).mRepresentedFeature = value;
        }

        @objid ("316948c3-f872-4ed2-871f-cb1c9714847e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getRepresentingEndDep();
            }
            return this.symetricDep;
        }

    }

}
