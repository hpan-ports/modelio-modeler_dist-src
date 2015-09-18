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
    @objid ("c18d5a23-90b4-4997-b11b-2048eafe14fc")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("1e778ff9-8bb0-4d01-b1f1-e7f5307d4e12")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("9121787e-e3df-44dc-8d4d-58737f61549f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00297b9c-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("03ac7aaf-44b8-4550-b7d5-fdef52f198dc")
        private static SmClass smClass = null;

        @objid ("1a7ce725-f206-4b39-a472-c0306df4f0e1")
        private static SmDependency RepresentationDep = null;

        @objid ("d846c495-a4e2-4f39-b085-8d6e49a8e1f5")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("323015f8-9f99-45c5-8b0e-4a1b4867f793")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryConnectorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("16a71529-03fc-4909-84f7-c0d62947859e")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("4c997720-3dda-4614-8a9b-709c3dea6e58")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("c28882d9-3937-45d1-a0a4-a06d4aeb8d9f")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("7f2ece58-d5f1-4b57-9f2b-5e7343622513")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d9db1151-88a6-4f22-87a5-ea68a8bbd37f")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("0029bee0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8573f375-b972-4eed-8b72-b71e4a490181")
            public ISmObjectData createData() {
                return new NaryConnectorData();
            }

            @objid ("f94e0eb3-70b6-4f8e-80cd-de2674566e8f")
            public SmObjectImpl createImpl() {
                return new NaryConnectorImpl();
            }

        }

        @objid ("002a2178-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("acd162bb-8a60-4d45-9615-8e67c82f5978")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryConnectorData) data).mRepresentedFeature;
            }

            @objid ("4a92c710-2f6a-475e-b54d-4c060506e16a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryConnectorData) data).mRepresentedFeature = value;
            }

            @objid ("ce3916ec-c86b-4dfa-bce5-5b53be356740")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingConnectorDep();
            }

        }

        @objid ("002a9612-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("44bde794-17f4-40ea-8624-533faad2f246")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryConnectorData)data).mRepresentation != null)? ((NaryConnectorData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("81dd6e1f-8840-4163-a1ac-838d2bbe78d2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryConnectorData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((NaryConnectorData) data).mRepresentation;
            }

            @objid ("d8a11a8e-c703-4e80-856c-4764e053161e")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.ConnectorRoleDep();
            }

        }

    }

}
