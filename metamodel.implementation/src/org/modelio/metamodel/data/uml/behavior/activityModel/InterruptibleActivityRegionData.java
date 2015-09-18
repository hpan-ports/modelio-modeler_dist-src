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
/*   Metamodel version: 9022              */
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
    @objid ("058dfd35-0c60-4b53-8720-99f26a7ce9de")
    @SmaMetaAssociation(metaName="InterruptingEdge", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.InterruptingEdgeSmDependency.class, partof = true)
     List<SmObjectImpl> mInterruptingEdge = null;

    @objid ("2dcc8ca4-e925-4442-a530-f820445648b8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006e2fb2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7f4c0a3d-8c5d-4715-9a15-086db209a7d4")
        private static SmClass smClass = null;

        @objid ("054d4e87-7bb7-49c9-9c31-8c30705a1f79")
        private static SmDependency InterruptingEdgeDep = null;

        @objid ("e1e48200-329e-4d51-a53d-0b0b4020c802")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterruptibleActivityRegionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e1f3b129-55bd-4667-9001-503d5112cd83")
        public static SmDependency InterruptingEdgeDep() {
            if (InterruptingEdgeDep == null) {
            	InterruptingEdgeDep = classof().getDependencyDef("InterruptingEdge");
            }
            return InterruptingEdgeDep;
        }

        @objid ("d88b5c9d-8931-4e8e-b97a-757f4fec1b8c")
        public static SmDependency getInterruptingEdgeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterruptingEdgeDep;
        }

        @objid ("ec4c8944-f669-48d7-90d0-717dc9328724")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("006e706c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f1ad118b-7ba7-41d6-8110-4deff211c7f2")
            public ISmObjectData createData() {
                return new InterruptibleActivityRegionData();
            }

            @objid ("e4b88d69-4498-4404-b130-b5d6b7127a86")
            public SmObjectImpl createImpl() {
                return new InterruptibleActivityRegionImpl();
            }

        }

        @objid ("006ed2a0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InterruptingEdgeSmDependency extends SmMultipleDependency {
            @objid ("49950cfd-e55d-47fc-a4ae-8234155c7ae7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterruptibleActivityRegionData)data).mInterruptingEdge != null)? ((InterruptibleActivityRegionData)data).mInterruptingEdge:SmMultipleDependency.EMPTY;
            }

            @objid ("ca822b1e-cf02-46e1-88e9-f1a0d71d8d0e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterruptibleActivityRegionData) data).mInterruptingEdge = new ArrayList<>(initialCapacity);
                return ((InterruptibleActivityRegionData) data).mInterruptingEdge;
            }

            @objid ("583f3639-f49b-4058-b1f3-d3249323bf31")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.InterruptsDep();
            }

        }

    }

}
