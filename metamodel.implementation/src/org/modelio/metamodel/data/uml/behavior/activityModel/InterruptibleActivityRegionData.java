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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("b6ad9db5-1ee1-4a04-9dd1-68ffef3ab8a4")
    @SmaMetaAssociation(metaName="InterruptingEdge", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.InterruptingEdgeSmDependency.class, partof = true)
     List<SmObjectImpl> mInterruptingEdge = null;

    @objid ("a3cf8ce8-ec5f-416b-be67-07477b79a42c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006e2fb2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("af1bd3d3-6b13-48e4-a51d-8d76a1ff4d9f")
        private static SmClass smClass = null;

        @objid ("0d901cb4-a507-4f1d-804e-8e6d509d6ca2")
        private static SmDependency InterruptingEdgeDep = null;

        @objid ("704a41d3-792a-4c5e-ad57-1759cd84eb6e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterruptibleActivityRegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("91ae8eaa-ff6c-489a-9429-78e6934f29c1")
        public static SmDependency InterruptingEdgeDep() {
            if (InterruptingEdgeDep == null) {
            	InterruptingEdgeDep = classof().getDependencyDef("InterruptingEdge");
            }
            return InterruptingEdgeDep;
        }

        @objid ("af9aa81f-36ee-44c7-ae32-2bc9b9f7ba72")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e50911cb-794e-4a92-9dfc-bd9e6dd6c8f9")
        public static SmDependency getInterruptingEdgeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterruptingEdgeDep;
        }

        @objid ("006e706c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("85a8a631-bf0d-48d7-bda6-5830fd546494")
            public ISmObjectData createData() {
                return new InterruptibleActivityRegionData();
            }

            @objid ("1c392fb0-cdd7-4723-a376-4d25ef7e2aec")
            public SmObjectImpl createImpl() {
                return new InterruptibleActivityRegionImpl();
            }

        }

        @objid ("006ed2a0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InterruptingEdgeSmDependency extends SmMultipleDependency {
            @objid ("989db65e-980e-42d7-8cd0-3a5a6b436f0c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterruptibleActivityRegionData)data).mInterruptingEdge != null)? ((InterruptibleActivityRegionData)data).mInterruptingEdge:SmMultipleDependency.EMPTY;
            }

            @objid ("a0f5bdd8-0877-4cbe-8918-df96f0ad2a97")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterruptibleActivityRegionData) data).mInterruptingEdge = new ArrayList<>(initialCapacity);
                return ((InterruptibleActivityRegionData) data).mInterruptingEdge;
            }

            @objid ("97aa7cc0-1208-47f6-aca1-ac622a7d4159")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.InterruptsDep();
            }

        }

    }

}
