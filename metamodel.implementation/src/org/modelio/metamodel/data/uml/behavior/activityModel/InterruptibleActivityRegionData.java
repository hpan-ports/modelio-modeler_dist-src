/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityEdgeData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.InterruptibleActivityRegionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("0036eb56-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InterruptibleActivityRegion.class, factory=InterruptibleActivityRegionData.Metadata.ObjectFactory.class)
public class InterruptibleActivityRegionData extends ActivityGroupData {
    @objid ("21694848-745c-41c6-8104-423626cf6e6a")
    @SmaMetaAssociation(metaName="InterruptingEdge", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.InterruptingEdgeSmDependency.class, partof = true)
     List<SmObjectImpl> mInterruptingEdge = null;

    @objid ("49b38b34-daf5-407a-ab85-59471baddc57")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006e2fb2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0e10e54b-bc99-454a-9cfc-5147209853c0")
        private static SmClass smClass = null;

        @objid ("adcf19cc-407f-4da3-88ba-40c6261156d9")
        private static SmDependency InterruptingEdgeDep = null;

        @objid ("cff72445-11b3-4e36-affe-feabad54e800")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterruptibleActivityRegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("786f490b-b524-4928-87e2-225c8439d1d9")
        public static SmDependency InterruptingEdgeDep() {
            if (InterruptingEdgeDep == null) {
            	InterruptingEdgeDep = classof().getDependencyDef("InterruptingEdge");
            }
            return InterruptingEdgeDep;
        }

        @objid ("39cd46ff-26ef-4011-aa5a-46fae00e66ff")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("09d13256-d0a0-4f91-87fe-1e45fc1c284b")
        public static SmDependency getInterruptingEdgeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterruptingEdgeDep;
        }

        @objid ("006e706c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("08d0090c-8d7f-4f2b-8ee1-70c712abe394")
            public ISmObjectData createData() {
                return new InterruptibleActivityRegionData();
            }

            @objid ("a1bea877-6e15-4187-abf4-8c9cc0bea7de")
            public SmObjectImpl createImpl() {
                return new InterruptibleActivityRegionImpl();
            }

        }

        @objid ("006ed2a0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InterruptingEdgeSmDependency extends SmMultipleDependency {
            @objid ("de30fb61-1596-4cfc-aa1f-998fb4e62e83")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterruptibleActivityRegionData)data).mInterruptingEdge != null)? ((InterruptibleActivityRegionData)data).mInterruptingEdge:SmMultipleDependency.EMPTY;
            }

            @objid ("5b382971-88a4-453f-b92b-4a0b75592bc6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterruptibleActivityRegionData) data).mInterruptingEdge = new ArrayList<>(initialCapacity);
                return ((InterruptibleActivityRegionData) data).mInterruptingEdge;
            }

            @objid ("45c8ee13-a7f9-4937-88df-beebd44d0f77")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.InterruptsDep();
            }

        }

    }

}
