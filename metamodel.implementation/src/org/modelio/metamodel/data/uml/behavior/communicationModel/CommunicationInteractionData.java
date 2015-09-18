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
package org.modelio.metamodel.data.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationNodeData;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationInteractionImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
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

@objid ("005a6928-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CommunicationInteraction.class, factory=CommunicationInteractionData.Metadata.ObjectFactory.class, cmsnode=true)
public class CommunicationInteractionData extends BehaviorData {
    @objid ("bb5e74f5-c3c0-4879-9b6b-a1ad32159faf")
    @SmaMetaAssociation(metaName="Owned", typeDataClass=CommunicationNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedSmDependency.class, component = true)
     List<SmObjectImpl> mOwned = null;

    @objid ("20544c43-ec0e-41ef-affc-9a40066cd395")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001108b4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b74090b5-f235-4f26-8aeb-f1d3904f2fbd")
        private static SmClass smClass = null;

        @objid ("8a090690-7f61-4b7f-b651-bf1b4596c163")
        private static SmDependency OwnedDep = null;

        @objid ("0c15d817-d5ed-40b5-86d3-75df26fff406")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationInteractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2ffa336e-890b-4fd1-b4b6-24d915bad660")
        public static SmDependency OwnedDep() {
            if (OwnedDep == null) {
            	OwnedDep = classof().getDependencyDef("Owned");
            }
            return OwnedDep;
        }

        @objid ("90b0d3cf-5cdc-461a-a032-0e503cc2a033")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("cffceafe-9428-43b8-8ce6-f413c3af685b")
        public static SmDependency getOwnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDep;
        }

        @objid ("00114ad6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f7af150f-2d52-4058-8b3f-a143894a5ac3")
            public ISmObjectData createData() {
                return new CommunicationInteractionData();
            }

            @objid ("15b88416-8b10-49ad-96b6-d2c9ca7fe879")
            public SmObjectImpl createImpl() {
                return new CommunicationInteractionImpl();
            }

        }

        @objid ("0011ad6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedSmDependency extends SmMultipleDependency {
            @objid ("6995c95f-448f-4a4e-b135-00a7e16b87db")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationInteractionData)data).mOwned != null)? ((CommunicationInteractionData)data).mOwned:SmMultipleDependency.EMPTY;
            }

            @objid ("c8af658d-1329-4f8a-9cb1-f55ae81f2b23")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationInteractionData) data).mOwned = new ArrayList<>(initialCapacity);
                return ((CommunicationInteractionData) data).mOwned;
            }

            @objid ("2ddd067a-48f1-458e-9f48-20a9b81a08cb")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.OwnerDep();
            }

        }

    }

}
