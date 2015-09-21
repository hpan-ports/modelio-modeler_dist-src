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
import org.modelio.metamodel.impl.uml.statik.ArtifactSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.uml.statik.Node;
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

@objid ("59646a2c-a1d3-48dc-b061-9200708cc332")
public class NodeSmClass extends ClassifierSmClass {
    @objid ("86c5d6c4-60f0-4b09-bc9c-db0f7ea899c9")
    private SmDependency residentDep;

    @objid ("18612e20-1a1e-424a-a2b6-3543ed86295a")
    public NodeSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("e2960c0a-3406-4f48-967d-901c0a7acc7d")
    @Override
    public String getName() {
        return "Node";
    }

    @objid ("9a79696d-4ce1-40f0-ab26-4981aeb88287")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("27ba4362-3578-4d88-a4fd-d7978dcc1573")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Node.class;
    }

    @objid ("5ca68af6-a1dd-4b7d-857a-3681f447ce3f")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("ae527f9f-bdc4-43e0-b3da-dbfc3ab7e9b2")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("3741e598-993f-443d-8039-107cfbbb43e7")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Classifier");
        this.registerFactory(new NodeObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.residentDep = new ResidentSmDependency();
        this.residentDep.init("Resident", this, metamodel.getMClass("Artifact"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.residentDep);
    }

    @objid ("1c4b63b2-4e87-428c-88e1-2a3fcc597a1b")
    public SmDependency getResidentDep() {
        if (this.residentDep == null) {
        	this.residentDep = this.getDependencyDef("Resident");
        }
        return this.residentDep;
    }

    @objid ("68e28633-be92-4522-be29-8a0ac92e5fb1")
    private static class NodeObjectFactory implements ISmObjectFactory {
        @objid ("21f15b3d-1e11-4b1e-b9c2-b442ca6c6625")
        private NodeSmClass smClass;

        @objid ("6bb68ee6-e018-4fef-9dc8-cb81a80185dc")
        public NodeObjectFactory(NodeSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("329fb53c-d1a8-41c8-b8ab-707726a29626")
        @Override
        public ISmObjectData createData() {
            return new NodeData(this.smClass);
        }

        @objid ("2083a16f-7209-4d20-9d6d-10f57935b378")
        @Override
        public SmObjectImpl createImpl() {
            return new NodeImpl();
        }

    }

    @objid ("074608a7-6c40-4d43-82ce-f29b3f6885ec")
    public static class ResidentSmDependency extends SmMultipleDependency {
        @objid ("44f328e6-dc5d-4d8c-80e9-7084d2b57f31")
        private SmDependency symetricDep;

        @objid ("2f95e846-7c8f-4207-96ec-00a3eafc8c60")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NodeData)data).mResident != null)? ((NodeData)data).mResident:SmMultipleDependency.EMPTY;
        }

        @objid ("da87cceb-4b73-4df8-b2b9-91db594580a3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NodeData) data).mResident = values;
        }

        @objid ("a22aad88-0f2d-4a05-979c-33afb38bc568")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ArtifactSmClass)this.getTarget()).getDeploymentLocationDep();
            }
            return this.symetricDep;
        }

    }

}
