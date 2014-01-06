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
    @objid ("1f217b1a-bb33-4221-932d-b92a2f0eaf89")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("7a1a4467-80c0-4b4c-89cd-e79772a3aeef")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("e5dc352a-226f-42a0-8884-2cda3002f3c3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00297b9c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("53d5d29d-a250-4f91-8ff8-5cea8a3dc808")
        private static SmClass smClass = null;

        @objid ("93951b98-8216-47b1-96cb-90f88cd1c5bf")
        private static SmDependency RepresentationDep = null;

        @objid ("460e6ca8-d3af-43b9-89e5-880d11672d53")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("e949d2ea-a27a-4543-9c1e-de24ada90ac6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryConnectorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8a7dea12-7849-4fa7-824e-be80b551f0e8")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("60c2758f-8255-4a5b-9816-91db7dfc9763")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("81bd1de2-d65c-4d64-9877-b939ba76dac7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("757efcf6-4625-49e3-bb1b-010b2c29ac98")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("d1a08a86-c56b-45a8-9f6e-9875f0c7e8cc")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("0029bee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3d75c2c0-a843-4e5a-837a-349c49e84a17")
            public ISmObjectData createData() {
                return new NaryConnectorData();
            }

            @objid ("bbaab6f1-745c-4b6a-8caf-a2d75e47b785")
            public SmObjectImpl createImpl() {
                return new NaryConnectorImpl();
            }

        }

        @objid ("002a2178-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("cb668cdc-9fec-4a0d-8d11-ee72d9d67258")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryConnectorData) data).mRepresentedFeature;
            }

            @objid ("1e6806ff-add2-4db2-b7b5-38857d7b306a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryConnectorData) data).mRepresentedFeature = value;
            }

            @objid ("4ab09b39-03ce-4832-959b-77a0f174a3be")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingConnectorDep();
            }

        }

        @objid ("002a9612-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("42881964-ce78-4837-bf1e-68a99ee8c17b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryConnectorData)data).mRepresentation != null)? ((NaryConnectorData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("ca220d48-9f95-44a1-865d-8699d46d1fdf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryConnectorData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((NaryConnectorData) data).mRepresentation;
            }

            @objid ("4ae9e0ad-5890-4a2a-b5ff-a0e70fa665ad")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.ConnectorRoleDep();
            }

        }

    }

}
