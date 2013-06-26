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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.BindingData;
import org.modelio.metamodel.impl.uml.statik.NaryConnectorImpl;
import org.modelio.metamodel.uml.statik.NaryConnector;
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

@objid ("0006480c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NaryConnector.class, factory=NaryConnectorData.Metadata.ObjectFactory.class)
public class NaryConnectorData extends NaryLinkData {
    @objid ("a4dbfe68-9de7-4b09-bb1a-63ad914fbf73")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("17458a8b-8f19-41d2-ab26-de1e14c416e7")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("cb337529-8efa-483c-aa6e-1f3050a23296")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00297b9c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1a6df009-0527-470b-a337-f9f69ab9444d")
        private static SmClass smClass = null;

        @objid ("5b9263e4-e9e1-4b35-b342-1e1b0c307e12")
        private static SmDependency RepresentationDep = null;

        @objid ("7be3965d-4886-4103-a028-df9d4d55609a")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("8cdfc62b-8a78-4648-b1d3-4627182d8357")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryConnectorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("126af994-0f6b-4689-93fd-ab1df103171d")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("51ef7d9d-a43f-41d2-af5c-da13c0302b15")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("c1f5a3b1-d46c-4bf3-b177-6cbeb5128b2e")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("2a13bb8a-be09-49ff-ad88-6d2ff43857b1")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("dd054265-3fa3-4b75-b50a-cfd5549cc1d4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0029bee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7b6bec36-f0d7-4e9a-a18b-44ad259ee685")
            public ISmObjectData createData() {
                return new NaryConnectorData();
            }

            @objid ("6607408a-4566-4862-9a4e-4c41e55f7221")
            public SmObjectImpl createImpl() {
                return new NaryConnectorImpl();
            }

        }

        @objid ("002a2178-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("0b4e042e-15d9-4ead-bcf0-8d39ea0dccff")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryConnectorData) data).mRepresentedFeature;
            }

            @objid ("2fc2d576-3f9c-4834-9b0e-510224f2353f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryConnectorData) data).mRepresentedFeature = value;
            }

            @objid ("aecae34b-8600-41a9-8dda-02d8a85d7357")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingConnectorDep();
            }

        }

        @objid ("002a9612-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("859469d9-38d4-40b4-b274-26cc0b60d911")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryConnectorData)data).mRepresentation != null)? ((NaryConnectorData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("15aeb37b-7062-4af2-afad-8d20871ce19e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryConnectorData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((NaryConnectorData) data).mRepresentation;
            }

            @objid ("35c289b8-8003-4e2c-80da-9ee9f384d589")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.ConnectorRoleDep();
            }

        }

    }

}
