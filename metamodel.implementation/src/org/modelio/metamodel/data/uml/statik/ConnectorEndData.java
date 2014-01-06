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
    @objid ("016dd2b4-6a83-4056-8b36-14de11ec6353")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("fc046bd3-6f50-4eb1-9ff5-0bfcdcd40bd6")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("a8a93242-74cd-4fd1-baa8-16d19739a3ea")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00972548-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f89356f8-f81d-414f-8fcf-68268dfa51cb")
        private static SmClass smClass = null;

        @objid ("73d5b69c-7553-422f-8dd6-6ea41261afaa")
        private static SmDependency RepresentationDep = null;

        @objid ("e134bf7a-bc3c-4369-9500-b76289bb6a0e")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("8a6ffcac-17e6-4711-86fc-9c131b60d969")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectorEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("299a2e3b-c44a-477b-ae74-e928266749f8")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("71abd88d-6196-4d0f-b0d8-c189c857a826")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("c2ff6b3a-243e-4302-9d5a-14d46847254a")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("f2867f93-8057-40e4-a09c-42210161bc1b")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("1bc242cf-aa5a-430b-99c1-5faef04e10c4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("009775f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1cdca751-295b-45da-a347-664b9e46e056")
            public ISmObjectData createData() {
                return new ConnectorEndData();
            }

            @objid ("51ba19ba-7934-48c6-a3cd-1af92f975bc1")
            public SmObjectImpl createImpl() {
                return new ConnectorEndImpl();
            }

        }

        @objid ("0097ef82-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("cbf640eb-f098-4b33-9a7c-7aa48cec6e94")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectorEndData) data).mRepresentedFeature;
            }

            @objid ("8fbc5ffd-1326-4b3b-a58a-c15ed89660be")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectorEndData) data).mRepresentedFeature = value;
            }

            @objid ("744de7d0-f347-4b63-a180-898af5d103dc")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingEndDep();
            }

        }

        @objid ("009879c0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("27f56420-ffb8-43bc-8de0-6baa8e97d999")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConnectorEndData)data).mRepresentation != null)? ((ConnectorEndData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("5d4b6974-28e6-44f1-9340-7f17e5afc510")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConnectorEndData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((ConnectorEndData) data).mRepresentation;
            }

            @objid ("4ea838d6-d0c6-4a80-95d9-f5798e8fcac8")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.ConnectorEndRoleDep();
            }

        }

    }

}
