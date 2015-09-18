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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.impl.uml.statik.LinkImpl;
import org.modelio.metamodel.uml.statik.Link;
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

@objid ("2eae30e5-5566-403a-a2fc-fb71b87360b4")
@SmaMetaClass(mmClass=Link.class, factory=LinkData.Metadata.ObjectFactory.class)
public class LinkData extends ModelElementData {
    @objid ("1c427aaa-cb2d-413e-aa20-09e020c349b2")
    @SmaMetaAssociation(metaName="Model", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("91c012eb-5c81-49bf-b27d-d830eb8c71c4")
    @SmaMetaAssociation(metaName="LinkEnd", typeDataClass=LinkEndData.class, min=2, max=2, smAssociationClass=Metadata.LinkEndSmDependency.class)
     List<SmObjectImpl> mLinkEnd = null;

    @objid ("eacafe09-1257-4911-99f5-f2f71157f396")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.SentSmDependency.class)
     SmObjectImpl mSent;

    @objid ("626f504c-8a0a-4590-b8d3-7c2dddb30361")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("7094e4fd-2afb-4b93-8f27-ba8b04f50a93")
    public static class Metadata {
        @objid ("36479da3-b1b4-44a1-88d0-c04b56a60250")
        private static SmClass smClass = null;

        @objid ("76728297-424a-4dbf-9a78-7ccec8e67741")
        private static SmDependency ModelDep = null;

        @objid ("6e866282-1d2a-4e2b-8f98-52158ae9191f")
        private static SmDependency LinkEndDep = null;

        @objid ("d2b0acbc-4bf2-4de0-b64c-fd48f77a004a")
        private static SmDependency SentDep = null;

        @objid ("d2a83aeb-0eef-41ea-bef3-465c76196789")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("284786c6-7c78-4f91-b0f3-bd484b7f6185")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("3e4cbcec-c295-43da-8956-bacea851ba57")
        public static SmDependency LinkEndDep() {
            if (LinkEndDep == null) {
            	LinkEndDep = classof().getDependencyDef("LinkEnd");
            }
            return LinkEndDep;
        }

        @objid ("612d1eb3-e488-4907-b3c3-95ed83f028c1")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("1dbbc277-2606-42fe-b7e5-acfd2aba10fe")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("798f612c-2e80-496a-9ff7-381d803a9029")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("cee5e3b3-cef0-4877-8179-2c8379304083")
        public static SmDependency getLinkEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkEndDep;
        }

        @objid ("c370151f-35de-40dd-b52f-e9f169594150")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("8d98c367-8266-4168-b8a3-271093a7ee09")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7a08bf48-8347-47a0-8b8b-a588c5536da4")
            public ISmObjectData createData() {
                return new LinkData();
            }

            @objid ("f0958f28-90f3-4124-b4fd-4fdc1615e77c")
            public SmObjectImpl createImpl() {
                return new LinkImpl();
            }

        }

        @objid ("34799fbc-28e8-473c-8320-544cb526ece1")
        public static class LinkEndSmDependency extends SmMultipleDependency {
            @objid ("e9a0906f-f1d6-47de-973d-5eedb7f555d7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LinkData)data).mLinkEnd != null)? ((LinkData)data).mLinkEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("edc246a5-98c2-43d9-b27f-e94c2ce2b6cf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LinkData) data).mLinkEnd = new ArrayList<>(initialCapacity);
                return ((LinkData) data).mLinkEnd;
            }

            @objid ("1354e48a-da02-4d00-93e0-8adc326fedb0")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.LinkDep();
            }

        }

        @objid ("6fb40a60-29f0-4ac4-9d99-e5cb1a3b3713")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("49321877-8931-4bc7-81c0-59f26b277b0e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkData) data).mModel;
            }

            @objid ("293ec14f-9786-49d6-9033-c9c1b64c3807")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkData) data).mModel = value;
            }

            @objid ("67b357ce-0e9d-4d7c-8fe5-86f0828b82aa")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.OccurenceDep();
            }

        }

        @objid ("4e086983-d159-4675-aa67-c691b60873d6")
        public static class SentSmDependency extends SmSingleDependency {
            @objid ("350aa847-5877-4464-9b5c-507866f8bbd0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkData) data).mSent;
            }

            @objid ("e59f4076-3157-4265-9f47-27f7b79d8407")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkData) data).mSent = value;
            }

            @objid ("64e27707-a1cc-4138-a98c-dc751bc42b76")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.ChannelDep();
            }

        }

    }

}
