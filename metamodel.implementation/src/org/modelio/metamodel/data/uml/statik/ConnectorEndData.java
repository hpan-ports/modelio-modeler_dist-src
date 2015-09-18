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
    @objid ("85a7db21-aba2-4979-b5ce-19e312463535")
    @SmaMetaAssociation(metaName="Representation", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentationSmDependency.class)
     List<SmObjectImpl> mRepresentation = null;

    @objid ("b3cef623-21e4-414e-b278-c8bb3a990124")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("8df84f15-8058-496e-b055-986fa89c7a85")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00972548-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3e34bffa-e141-4e77-ac64-606dda966370")
        private static SmClass smClass = null;

        @objid ("00f86c5b-c685-4019-b695-886563cd7280")
        private static SmDependency RepresentationDep = null;

        @objid ("786811df-a08b-468a-926f-7cb8e71d3c60")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("ea5844c1-5910-4e62-84f5-9b0fa88adcaa")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectorEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8c59858f-8a19-4ecd-9ec6-6f5fb034212f")
        public static SmDependency RepresentationDep() {
            if (RepresentationDep == null) {
            	RepresentationDep = classof().getDependencyDef("Representation");
            }
            return RepresentationDep;
        }

        @objid ("fefeb226-717e-4083-979a-85914f246fc1")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("fe104268-0580-4a4d-984d-a867eca75fa3")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("76db58b3-0299-4712-81ab-b004cbd91790")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7d54b69f-1f88-4ed9-b285-7e4d5c3618f1")
        public static SmDependency getRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentationDep;
        }

        @objid ("009775f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7b6a6b55-862a-4357-8277-523dcf05ab7f")
            public ISmObjectData createData() {
                return new ConnectorEndData();
            }

            @objid ("d84b82bc-76b3-4ac3-8c21-97890e741137")
            public SmObjectImpl createImpl() {
                return new ConnectorEndImpl();
            }

        }

        @objid ("0097ef82-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("44ec9748-ec4b-4469-b3a1-f8a456d4538c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectorEndData) data).mRepresentedFeature;
            }

            @objid ("fc7f090b-bb80-403c-80e3-5e95624c9d1f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectorEndData) data).mRepresentedFeature = value;
            }

            @objid ("a487a6af-d418-4686-8d66-edbda8d9b5ec")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentingEndDep();
            }

        }

        @objid ("009879c0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentationSmDependency extends SmMultipleDependency {
            @objid ("628189d7-76d1-42a4-b9dd-967d2c75a5ca")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConnectorEndData)data).mRepresentation != null)? ((ConnectorEndData)data).mRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("3ba8363f-c284-405e-af3c-6b37570b15f9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConnectorEndData) data).mRepresentation = new ArrayList<>(initialCapacity);
                return ((ConnectorEndData) data).mRepresentation;
            }

            @objid ("cf6685ba-fa22-475b-a359-762e931abcda")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.ConnectorEndRoleDep();
            }

        }

    }

}
