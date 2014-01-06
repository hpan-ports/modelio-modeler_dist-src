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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.CombinedFragmentData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionUseData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GateImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
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

@objid ("00459ffc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Gate.class, factory=GateData.Metadata.ObjectFactory.class)
public class GateData extends MessageEndData {
    @objid ("c13d7f90-28c8-4945-834f-be0041dd7ddf")
    @SmaMetaAssociation(metaName="OwnerUse", typeDataClass=InteractionUseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerUseSmDependency.class)
     SmObjectImpl mOwnerUse;

    @objid ("00d26a00-ad4e-4109-91e0-7cc22b96288e")
    @SmaMetaAssociation(metaName="Actual", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.ActualSmDependency.class)
     List<SmObjectImpl> mActual = null;

    @objid ("49795ba9-59bf-490b-9f8d-d81b2eb6806e")
    @SmaMetaAssociation(metaName="OwnerInteraction", typeDataClass=InteractionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerInteractionSmDependency.class)
     SmObjectImpl mOwnerInteraction;

    @objid ("24cc544a-aae9-40aa-8831-48d1379a6b43")
    @SmaMetaAssociation(metaName="OwnerFragment", typeDataClass=CombinedFragmentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerFragmentSmDependency.class)
     SmObjectImpl mOwnerFragment;

    @objid ("ac585ff3-e3a4-4294-aef9-a8230eeaeda3")
    @SmaMetaAssociation(metaName="Formal", typeDataClass=GateData.class, min=0, max=1, smAssociationClass=Metadata.FormalSmDependency.class, partof = true)
     SmObjectImpl mFormal;

    @objid ("11018a86-7b6e-40db-9e98-47a1c9aae1b1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0084f6de-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("15dc8397-711b-4c5a-997b-506758a74c49")
        private static SmClass smClass = null;

        @objid ("b9469e94-0091-4e34-b3d6-6a962cd2c2bd")
        private static SmDependency OwnerUseDep = null;

        @objid ("8296a45e-79d0-47dd-946d-42b12ac81d94")
        private static SmDependency ActualDep = null;

        @objid ("44bf48c8-809f-41c5-beb7-58a2fbdd01b1")
        private static SmDependency OwnerInteractionDep = null;

        @objid ("e7cf3b9e-fadd-4b17-8254-74619dca297f")
        private static SmDependency OwnerFragmentDep = null;

        @objid ("6b6b0f67-35ba-43e9-b803-670cd761f4b2")
        private static SmDependency FormalDep = null;

        @objid ("d38c2f54-73c3-4ef5-936f-1cce305e07ea")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d1bac70e-fed4-4d69-8c9d-9e934e090e45")
        public static SmDependency OwnerUseDep() {
            if (OwnerUseDep == null) {
            	OwnerUseDep = classof().getDependencyDef("OwnerUse");
            }
            return OwnerUseDep;
        }

        @objid ("81e500db-7300-45ab-be3e-4149e1dfeb58")
        public static SmDependency ActualDep() {
            if (ActualDep == null) {
            	ActualDep = classof().getDependencyDef("Actual");
            }
            return ActualDep;
        }

        @objid ("092d07f2-da79-400c-a1d7-38cb08dc9e70")
        public static SmDependency OwnerInteractionDep() {
            if (OwnerInteractionDep == null) {
            	OwnerInteractionDep = classof().getDependencyDef("OwnerInteraction");
            }
            return OwnerInteractionDep;
        }

        @objid ("06a1127e-ad8f-44ec-95bd-bffc18354ee2")
        public static SmDependency OwnerFragmentDep() {
            if (OwnerFragmentDep == null) {
            	OwnerFragmentDep = classof().getDependencyDef("OwnerFragment");
            }
            return OwnerFragmentDep;
        }

        @objid ("44293664-fd5c-4d36-9e64-0571a78bc544")
        public static SmDependency FormalDep() {
            if (FormalDep == null) {
            	FormalDep = classof().getDependencyDef("Formal");
            }
            return FormalDep;
        }

        @objid ("dbdbd8ce-b852-4bcc-88bc-573c311fa90a")
        public static SmDependency getOwnerUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerUseDep;
        }

        @objid ("ddf9cdb5-5192-4b5e-bcf7-0eed45ba4a4f")
        public static SmDependency getActualDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActualDep;
        }

        @objid ("f5971b5d-5c10-444d-a3ee-00480d78631b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0152dcbb-f2c1-42bd-b8b7-6f3ed1ed6ef6")
        public static SmDependency getOwnerFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerFragmentDep;
        }

        @objid ("62f3b171-f2d6-4f19-a0c0-c3da4884b1ed")
        public static SmDependency getFormalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FormalDep;
        }

        @objid ("cfbca639-e014-432a-8cac-05331bdf3752")
        public static SmDependency getOwnerInteractionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerInteractionDep;
        }

        @objid ("008537fc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ce719ebe-17b1-45c4-a819-387b75af166a")
            public ISmObjectData createData() {
                return new GateData();
            }

            @objid ("d5e4dc55-9c4c-41ad-9589-5cc93f39a348")
            public SmObjectImpl createImpl() {
                return new GateImpl();
            }

        }

        @objid ("00859b0c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerFragmentSmDependency extends SmSingleDependency {
            @objid ("151d6354-ebcf-4578-8d10-2f3e63b33bc7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerFragment;
            }

            @objid ("6232a423-e03f-4f5a-95f6-ee0d7d10f67d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerFragment = value;
            }

            @objid ("757532fc-1eb4-4ca3-b73a-4c4194db1fb7")
            @Override
            public SmDependency getSymetric() {
                return CombinedFragmentData.Metadata.FragmentGateDep();
            }

        }

        @objid ("00860f7e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class FormalSmDependency extends SmSingleDependency {
            @objid ("d4445bc8-3cbf-445a-9299-c31d51395f2e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mFormal;
            }

            @objid ("de017b18-6b3c-4ad1-aa6f-be73cb7e7fce")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mFormal = value;
            }

            @objid ("0685838e-117c-4b08-8f7a-9aa42c9fcdaa")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.ActualDep();
            }

        }

        @objid ("00868620-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ActualSmDependency extends SmMultipleDependency {
            @objid ("e2e9906d-09c9-48f8-a20a-de21bfe0ec46")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GateData)data).mActual != null)? ((GateData)data).mActual:SmMultipleDependency.EMPTY;
            }

            @objid ("6e21c417-9d56-4d4b-94b0-99dcd6f7b24d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GateData) data).mActual = new ArrayList<>(initialCapacity);
                return ((GateData) data).mActual;
            }

            @objid ("56ba6fe3-fb00-4a74-9e77-5f86ca40ab78")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.FormalDep();
            }

        }

        @objid ("0086e99e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerInteractionSmDependency extends SmSingleDependency {
            @objid ("52fb2f10-38f7-4305-8d96-bf6e24ae6a5e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerInteraction;
            }

            @objid ("7ff254ea-eeb1-41c7-99d0-10343ef776cf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerInteraction = value;
            }

            @objid ("fd79c290-3730-478d-8691-97575876fcb5")
            @Override
            public SmDependency getSymetric() {
                return InteractionData.Metadata.FormalGateDep();
            }

        }

        @objid ("00875f8c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerUseSmDependency extends SmSingleDependency {
            @objid ("da1701cf-fdca-4588-9316-c91704da4990")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GateData) data).mOwnerUse;
            }

            @objid ("99e606c4-66f0-4fe7-a488-3929e393d66b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GateData) data).mOwnerUse = value;
            }

            @objid ("00ad0e4a-48d8-47a3-a28f-9799bbbfca64")
            @Override
            public SmDependency getSymetric() {
                return InteractionUseData.Metadata.ActualGateDep();
            }

        }

    }

}
