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
    @objid ("b844644b-aa32-4257-b7cd-335a0905f6d1")
    @SmaMetaAssociation(metaName="Owned", typeDataClass=CommunicationNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedSmDependency.class, component = true)
     List<SmObjectImpl> mOwned = null;

    @objid ("c85b4799-6672-4d3e-83a7-3b9ed62f6391")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001108b4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("24183e32-be5f-4cf0-b239-5e1f0d0d5106")
        private static SmClass smClass = null;

        @objid ("f5dd2951-58d5-487a-b050-8c86ec3fe85c")
        private static SmDependency OwnedDep = null;

        @objid ("2081d4d7-b4c0-41c2-b26d-6a1adb1c1a1e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationInteractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0c7a5432-8f50-40eb-97af-6f5474df9e6d")
        public static SmDependency OwnedDep() {
            if (OwnedDep == null) {
            	OwnedDep = classof().getDependencyDef("Owned");
            }
            return OwnedDep;
        }

        @objid ("5fcd1d18-4ecb-440d-857d-6974302ede3c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("01b00c29-be7e-463e-8c11-18d8b444835f")
        public static SmDependency getOwnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDep;
        }

        @objid ("00114ad6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2e4c2228-ec2c-46e1-a4a6-244535ac1aee")
            public ISmObjectData createData() {
                return new CommunicationInteractionData();
            }

            @objid ("77636f08-6b42-4e43-afb8-704d04c71348")
            public SmObjectImpl createImpl() {
                return new CommunicationInteractionImpl();
            }

        }

        @objid ("0011ad6e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedSmDependency extends SmMultipleDependency {
            @objid ("68190752-4d6c-4795-9c33-6df417bf04c0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationInteractionData)data).mOwned != null)? ((CommunicationInteractionData)data).mOwned:SmMultipleDependency.EMPTY;
            }

            @objid ("3d9baa29-df9a-494e-86cd-238eeb0f3e36")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationInteractionData) data).mOwned = new ArrayList<>(initialCapacity);
                return ((CommunicationInteractionData) data).mOwned;
            }

            @objid ("0cf85c95-4414-468f-b3ae-9d281b32574a")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.OwnerDep();
            }

        }

    }

}
