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
    @objid ("6478b9f9-143c-4496-a6d2-a83f68241cad")
    @SmaMetaAssociation(metaName="Model", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("1fa0c152-f385-463f-8a3f-e34705cce82c")
    @SmaMetaAssociation(metaName="LinkEnd", typeDataClass=LinkEndData.class, min=2, max=2, smAssociationClass=Metadata.LinkEndSmDependency.class)
     List<SmObjectImpl> mLinkEnd = null;

    @objid ("88cb0e3b-5e87-4928-b996-3cc31765b1bb")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.SentSmDependency.class)
     SmObjectImpl mSent;

    @objid ("2be9c246-0f72-4c70-9c50-fcf74b99cb6e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("7094e4fd-2afb-4b93-8f27-ba8b04f50a93")
    public static class Metadata {
        @objid ("6fa270ce-6cf6-4ddc-adec-bbdcd19a578a")
        private static SmClass smClass = null;

        @objid ("dbef3113-b0b7-469a-911f-b8d9023175b9")
        private static SmDependency ModelDep = null;

        @objid ("2c245bb9-00f0-47af-8d2c-c531069f974f")
        private static SmDependency LinkEndDep = null;

        @objid ("c516e4cc-79c1-4760-9976-4b10c45a3ef7")
        private static SmDependency SentDep = null;

        @objid ("367da4f0-be18-4f25-91a2-609f8b82ae8b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("253f4cff-b9a3-4eaf-b56c-17e91fb4488c")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("255c1717-8585-4b86-be8d-c713cda5f3e8")
        public static SmDependency LinkEndDep() {
            if (LinkEndDep == null) {
            	LinkEndDep = classof().getDependencyDef("LinkEnd");
            }
            return LinkEndDep;
        }

        @objid ("765f2728-1988-4d5c-85d5-b7328b2a6d39")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("e88ea0ea-a2b6-4f75-968f-946ab2f7451a")
        public static SmDependency getLinkEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkEndDep;
        }

        @objid ("786306c9-680d-4ae7-843e-413dc71ad1bf")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("c876a96e-1edf-4564-a3b9-64187a30b9c2")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("fd62af86-369a-4be1-bbe7-8bc964f4ce8c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8d98c367-8266-4168-b8a3-271093a7ee09")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7a40adac-cf58-4018-93e4-54f05ac18df9")
            public ISmObjectData createData() {
                return new LinkData();
            }

            @objid ("c11936b0-9f0d-452e-b1ee-5c99ca1d5d8b")
            public SmObjectImpl createImpl() {
                return new LinkImpl();
            }

        }

        @objid ("34799fbc-28e8-473c-8320-544cb526ece1")
        public static class LinkEndSmDependency extends SmMultipleDependency {
            @objid ("e8be90c2-4f8e-40ea-b66d-3c2ae6d18b06")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LinkData)data).mLinkEnd != null)? ((LinkData)data).mLinkEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("9ee16b84-8271-4ebe-9ed6-8a79568ff1c6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LinkData) data).mLinkEnd = new ArrayList<>(initialCapacity);
                return ((LinkData) data).mLinkEnd;
            }

            @objid ("73e18150-244f-4395-996e-65f7f786a307")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.LinkDep();
            }

        }

        @objid ("6fb40a60-29f0-4ac4-9d99-e5cb1a3b3713")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("73027923-014d-4512-ae91-1b5ce83055c4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkData) data).mModel;
            }

            @objid ("35aa47a6-6879-4ece-b500-b9790d900bc0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkData) data).mModel = value;
            }

            @objid ("cbbbef2e-c32a-4e94-8777-503b3ff0ac76")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.OccurenceDep();
            }

        }

        @objid ("4e086983-d159-4675-aa67-c691b60873d6")
        public static class SentSmDependency extends SmSingleDependency {
            @objid ("bfed0be3-86b6-4646-b967-3c5fd85a15c1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkData) data).mSent;
            }

            @objid ("3dafdff9-b714-495a-8f1d-0d210ce2fa2b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkData) data).mSent = value;
            }

            @objid ("c33c2810-4667-4c08-a79b-8716a662d482")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.ChannelDep();
            }

        }

    }

}
