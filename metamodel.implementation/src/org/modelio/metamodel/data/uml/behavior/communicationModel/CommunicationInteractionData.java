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
    @objid ("39db5e36-3d9b-4a04-ac46-dd3bf6d8d253")
    @SmaMetaAssociation(metaName="Owned", typeDataClass=CommunicationNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedSmDependency.class, component = true)
     List<SmObjectImpl> mOwned = null;

    @objid ("37d8d7f8-086a-4339-afc5-596040c7a5b9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001108b4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("46c8fd87-721b-4565-8446-c0d6cc1fc947")
        private static SmClass smClass = null;

        @objid ("ed54561a-2cad-46e4-943b-23d92921f914")
        private static SmDependency OwnedDep = null;

        @objid ("e87c0e5a-b760-4ae6-9815-8e70e557a966")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationInteractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0930c6e0-0c39-4dfe-9f4b-ce27a40971c5")
        public static SmDependency OwnedDep() {
            if (OwnedDep == null) {
            	OwnedDep = classof().getDependencyDef("Owned");
            }
            return OwnedDep;
        }

        @objid ("5a1d3080-ced6-439a-9a3a-e8c394b83160")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c5f0dfb1-117a-4d26-bdad-d94f6a1afe06")
        public static SmDependency getOwnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDep;
        }

        @objid ("00114ad6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("78c9e6fc-3918-4bdb-9f28-977f325864d5")
            public ISmObjectData createData() {
                return new CommunicationInteractionData();
            }

            @objid ("8609e1a2-225a-4981-8040-12f6983de7c5")
            public SmObjectImpl createImpl() {
                return new CommunicationInteractionImpl();
            }

        }

        @objid ("0011ad6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedSmDependency extends SmMultipleDependency {
            @objid ("fc9c57bc-13f3-4b55-9c8a-b9f339f4882d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationInteractionData)data).mOwned != null)? ((CommunicationInteractionData)data).mOwned:SmMultipleDependency.EMPTY;
            }

            @objid ("c9d66e09-2e76-4843-8934-4b1a875450c2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationInteractionData) data).mOwned = new ArrayList<>(initialCapacity);
                return ((CommunicationInteractionData) data).mOwned;
            }

            @objid ("c7088637-a071-487c-9b99-a1dce9f72a6d")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.OwnerDep();
            }

        }

    }

}
