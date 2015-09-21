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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.AbstractPseudoStateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ConnectionPointReferenceSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateMachineSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
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

@objid ("72567f2c-7474-4d71-b8d7-a1e8576d3aa1")
public class ExitPointPseudoStateSmClass extends AbstractPseudoStateSmClass {
    @objid ("f4f46c37-7dd0-42d4-a07a-1104d4988c0e")
    private SmDependency exitOfDep;

    @objid ("e8abf0fb-0f15-4af5-8173-9639e88524b3")
    private SmDependency connectionDep;

    @objid ("e640feff-7e04-4530-8f07-f4af829d6d1f")
    private SmDependency exitOfMachineDep;

    @objid ("12a4034d-54db-4784-bbc5-efc8ad430819")
    public ExitPointPseudoStateSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("149cedc8-48df-470c-8cc8-05859cb9af97")
    @Override
    public String getName() {
        return "ExitPointPseudoState";
    }

    @objid ("d902c7af-a302-4182-a4c4-f69dd4122607")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8b6c1fae-8a54-4522-8085-55dd0cb9c359")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ExitPointPseudoState.class;
    }

    @objid ("d57b242f-4381-4796-ba9f-787272e63492")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("98f4f91b-4787-4be7-992d-a741b8a4ef85")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("82016db7-404e-4f11-b4aa-26f41d461c2a")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AbstractPseudoState");
        this.registerFactory(new ExitPointPseudoStateObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.exitOfDep = new ExitOfSmDependency();
        this.exitOfDep.init("ExitOf", this, metamodel.getMClass("State"), 0, 1 );
        registerDependency(this.exitOfDep);
        
        this.connectionDep = new ConnectionSmDependency();
        this.connectionDep.init("Connection", this, metamodel.getMClass("ConnectionPointReference"), 0, -1 );
        registerDependency(this.connectionDep);
        
        this.exitOfMachineDep = new ExitOfMachineSmDependency();
        this.exitOfMachineDep.init("ExitOfMachine", this, metamodel.getMClass("StateMachine"), 0, 1 );
        registerDependency(this.exitOfMachineDep);
    }

    @objid ("8bcea944-eb7e-4fdb-8739-b2095d74ad92")
    public SmDependency getExitOfDep() {
        if (this.exitOfDep == null) {
        	this.exitOfDep = this.getDependencyDef("ExitOf");
        }
        return this.exitOfDep;
    }

    @objid ("ecece863-3bc5-44df-b32d-d580c8bb5c39")
    public SmDependency getConnectionDep() {
        if (this.connectionDep == null) {
        	this.connectionDep = this.getDependencyDef("Connection");
        }
        return this.connectionDep;
    }

    @objid ("3d949257-cd99-4a7f-a9d0-a58a965d92be")
    public SmDependency getExitOfMachineDep() {
        if (this.exitOfMachineDep == null) {
        	this.exitOfMachineDep = this.getDependencyDef("ExitOfMachine");
        }
        return this.exitOfMachineDep;
    }

    @objid ("887617c2-2235-475c-9751-5548da622d5d")
    private static class ExitPointPseudoStateObjectFactory implements ISmObjectFactory {
        @objid ("78d21e6d-7985-460e-9386-41c0da257e52")
        private ExitPointPseudoStateSmClass smClass;

        @objid ("76384b20-cb2f-47c0-8668-63dac2c50c2f")
        public ExitPointPseudoStateObjectFactory(ExitPointPseudoStateSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("be439265-0dc8-483d-a2da-af53541ee84a")
        @Override
        public ISmObjectData createData() {
            return new ExitPointPseudoStateData(this.smClass);
        }

        @objid ("ddc70e92-2a17-444f-8df9-1ae460c6fb33")
        @Override
        public SmObjectImpl createImpl() {
            return new ExitPointPseudoStateImpl();
        }

    }

    @objid ("23e4fc2d-4734-4dfb-9c6a-c9ca3239353e")
    public static class ExitOfSmDependency extends SmSingleDependency {
        @objid ("c1ac997a-9e1e-4eca-aebf-bd98c0ea9024")
        private SmDependency symetricDep;

        @objid ("a366a4d5-e9f9-48ce-86ea-19ed4fd8c8fb")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExitPointPseudoStateData) data).mExitOf;
        }

        @objid ("cfdac150-d8d8-4a01-a61c-ff8f61e92563")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExitPointPseudoStateData) data).mExitOf = value;
        }

        @objid ("55d1eab4-c6e8-4a19-84bc-3918f4f027fe")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getExitPointDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("cd03b672-d84e-48b9-b3e5-30cb2d1e59ab")
    public static class ConnectionSmDependency extends SmMultipleDependency {
        @objid ("a189b12d-50f7-4727-8fd7-6c6aec4f03af")
        private SmDependency symetricDep;

        @objid ("6b834f43-5f11-48a6-95e5-56fa3ba60ca1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ExitPointPseudoStateData)data).mConnection != null)? ((ExitPointPseudoStateData)data).mConnection:SmMultipleDependency.EMPTY;
        }

        @objid ("7c6ca9d3-dea9-4628-bb23-4be3668e680f")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ExitPointPseudoStateData) data).mConnection = values;
        }

        @objid ("7fcff640-4962-48d3-8e16-e931bcc4efe3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ConnectionPointReferenceSmClass)this.getTarget()).getExitDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("61ba5213-726d-4b15-ad81-e5e1f96886bc")
    public static class ExitOfMachineSmDependency extends SmSingleDependency {
        @objid ("9a5308f9-c800-4083-b0cf-ce7886d7d750")
        private SmDependency symetricDep;

        @objid ("3e9fe732-108b-4413-8928-33f28d764589")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ExitPointPseudoStateData) data).mExitOfMachine;
        }

        @objid ("7256e30b-38b5-4503-847d-3252950c8e6b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ExitPointPseudoStateData) data).mExitOfMachine = value;
        }

        @objid ("b67e43dc-b759-4990-9990-8be2e00042d4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateMachineSmClass)this.getTarget()).getExitPointDep();
            }
            return this.symetricDep;
        }

    }

}
