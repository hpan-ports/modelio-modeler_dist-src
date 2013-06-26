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
import org.modelio.metamodel.impl.uml.statik.ConnectorEndImpl;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
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

@objid ("000701ac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ConnectorEnd.class, factory=ConnectorEndData.Metadata.ObjectFactory.class)
public class ConnectorEndData extends LinkEndData {
    @objid ("c2772152-785f-4981-b261-4a4affca2da2")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("fc672bc0-b71d-4a92-be20-bc9416ea237a")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("a61f07c4-9fb5-4627-95a8-17554b306247")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00972548-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("20fcd059-49c3-4be4-a96d-ec9194ab32bb")
        private static SmClass smClass = null;

        @objid ("7669bffb-84cd-4e6d-a849-d3f1bf982292")
        private static SmDependency RepresentationDep = null;

        @objid ("219076e2-58eb-41e2-aa27-2ec96a6030bd")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("19ead086-91f8-4190-9577-bc9bddd8abf6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectorEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0a588111-0383-455e-8e63-8bfef58f6fa3")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("86bd6374-833a-43b1-b898-bfbbefed3cfc")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("401ca917-890a-4426-a53d-ad0ae46a928b")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("29445c41-081a-4b43-8404-d38a81d660cd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("bff18964-b348-41d6-a884-627e78060b7f")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("009775f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("812b7cc1-c688-4587-8b02-3f182d66b926")
            public ISmObjectData createData() {
                return new ConnectorEndData();
            }

            @objid ("1144f568-e194-4089-9be8-3170cfffb097")
            public SmObjectImpl createImpl() {
                return new ConnectorEndImpl();
            }

        }

        @objid ("0097ef82-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("0e2a4d41-5856-40d2-8637-7b39f3b084af")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectorEndData) data).mRepresentedFeature;
            }

            @objid ("96d79169-6bb0-47d2-a1f8-d3a7a52e54cf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectorEndData) data).mRepresentedFeature = value;
            }

            @objid ("ec91b925-6037-40fe-9ea2-d1c19337779c")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingEndDep();
            }

        }

        @objid ("009879c0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("46ed54dd-6bf3-4c51-9f0d-741c9f3aeec7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConnectorEndData)data).mRepresentation != null)? ((ConnectorEndData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("b8ee67da-bc7e-44f5-937e-7a867c8bc592")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConnectorEndData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((ConnectorEndData) data).mRepresentation;
            }

            @objid ("d496b8c2-3f39-43c1-9910-c71aef704275")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.ConnectorEndRoleDep();
            }

        }

    }

}
