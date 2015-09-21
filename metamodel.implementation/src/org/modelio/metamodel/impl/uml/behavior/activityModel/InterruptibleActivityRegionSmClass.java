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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityEdgeSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityGroupSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
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

@objid ("cb39a5fc-03ec-4547-aa99-c2186f242602")
public class InterruptibleActivityRegionSmClass extends ActivityGroupSmClass {
    @objid ("72da8aa8-1274-4c00-931e-6526bb514330")
    private SmDependency interruptingEdgeDep;

    @objid ("31088f31-3470-41cd-9d94-56074b4484e8")
    public InterruptibleActivityRegionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("dfd692e4-e4e8-4097-b03a-f6e60cb9e61e")
    @Override
    public String getName() {
        return "InterruptibleActivityRegion";
    }

    @objid ("65c1bc06-94e1-4f1a-9686-bc9be4425407")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("c7c31e25-fe4a-488c-aa20-e5a32988d1f9")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InterruptibleActivityRegion.class;
    }

    @objid ("493723dd-bfd8-4c05-b617-d2f2556ad262")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("298c3414-0798-41bc-b377-47116e6624cc")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("537da378-e478-4944-ae5f-a32421e3d54d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ActivityGroup");
        this.registerFactory(new InterruptibleActivityRegionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.interruptingEdgeDep = new InterruptingEdgeSmDependency();
        this.interruptingEdgeDep.init("InterruptingEdge", this, metamodel.getMClass("ActivityEdge"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.interruptingEdgeDep);
    }

    @objid ("b77b90d9-5062-416f-ac12-3be26f9d7e92")
    public SmDependency getInterruptingEdgeDep() {
        if (this.interruptingEdgeDep == null) {
        	this.interruptingEdgeDep = this.getDependencyDef("InterruptingEdge");
        }
        return this.interruptingEdgeDep;
    }

    @objid ("708b377b-998c-44a0-ab45-0a9794ecf4d4")
    private static class InterruptibleActivityRegionObjectFactory implements ISmObjectFactory {
        @objid ("ff761149-3280-4fd1-9d8f-a5f7cb70c981")
        private InterruptibleActivityRegionSmClass smClass;

        @objid ("dfb092b9-f60c-4bd4-a5c7-dc600c911bb6")
        public InterruptibleActivityRegionObjectFactory(InterruptibleActivityRegionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("81423540-9754-4994-a701-7c074c73c573")
        @Override
        public ISmObjectData createData() {
            return new InterruptibleActivityRegionData(this.smClass);
        }

        @objid ("2046767c-a8c7-491e-8edb-d0a2bbb61529")
        @Override
        public SmObjectImpl createImpl() {
            return new InterruptibleActivityRegionImpl();
        }

    }

    @objid ("468fbcb1-5687-46e7-9733-bd15a620a07c")
    public static class InterruptingEdgeSmDependency extends SmMultipleDependency {
        @objid ("59fe0f18-ace4-45e7-8602-25589e7b527f")
        private SmDependency symetricDep;

        @objid ("98bafec2-ed0c-45aa-8d49-f1ad2f173005")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InterruptibleActivityRegionData)data).mInterruptingEdge != null)? ((InterruptibleActivityRegionData)data).mInterruptingEdge:SmMultipleDependency.EMPTY;
        }

        @objid ("20381783-b43c-48d9-a777-dd3c94d8ba13")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InterruptibleActivityRegionData) data).mInterruptingEdge = values;
        }

        @objid ("7f1cc99f-2ad7-4cad-b007-bae968604df0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityEdgeSmClass)this.getTarget()).getInterruptsDep();
            }
            return this.symetricDep;
        }

    }

}
