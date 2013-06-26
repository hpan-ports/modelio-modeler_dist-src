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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.OccurrenceSpecificationData;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GeneralOrderingImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
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

@objid ("0046463c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=GeneralOrdering.class, factory=GeneralOrderingData.Metadata.ObjectFactory.class)
public class GeneralOrderingData extends ElementData {
    @objid ("314071df-6771-4630-bb97-8ae418d77b6a")
    @SmaMetaAssociation(metaName="Before", typeDataClass=OccurrenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.BeforeSmDependency.class)
     SmObjectImpl mBefore;

    @objid ("15923f3d-efd4-4c88-8a5c-fef3922acf7d")
    @SmaMetaAssociation(metaName="After", typeDataClass=OccurrenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.AfterSmDependency.class, partof = true)
     SmObjectImpl mAfter;

    @objid ("9d3fdc99-0df7-4312-9880-cb4cf0b1a7e7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0015b59e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("417c1e59-6cbf-4bab-9357-4dad4aace363")
        private static SmClass smClass = null;

        @objid ("458d9752-4e14-4693-8b17-faa510230588")
        private static SmDependency BeforeDep = null;

        @objid ("3fe19258-68e2-4893-a677-fb33954050ef")
        private static SmDependency AfterDep = null;

        @objid ("0922ee96-3747-47b9-b13d-fdbfc314caee")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralOrderingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1cef6f09-1696-40cf-99e6-487bdb09da35")
        public static SmDependency BeforeDep() {
            if (BeforeDep == null) {
            	BeforeDep = classof().getDependencyDef("Before");
            }
            return BeforeDep;
        }

        @objid ("0158b4b1-d8c2-4577-837e-403657091284")
        public static SmDependency AfterDep() {
            if (AfterDep == null) {
            	AfterDep = classof().getDependencyDef("After");
            }
            return AfterDep;
        }

        @objid ("bd556f81-6796-4fe7-b89f-915a86cafa00")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b0945c14-04be-4592-85f8-68d379c5c6c3")
        public static SmDependency getAfterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AfterDep;
        }

        @objid ("299732d8-569d-4a79-9987-1cd0c5926c87")
        public static SmDependency getBeforeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BeforeDep;
        }

        @objid ("0015f6d0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5a0a0dc0-83b2-4f4d-819d-f2c323aeff40")
            public ISmObjectData createData() {
                return new GeneralOrderingData();
            }

            @objid ("2c971a8f-e670-44e7-8af0-c327c697029f")
            public SmObjectImpl createImpl() {
                return new GeneralOrderingImpl();
            }

        }

        @objid ("00165bca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AfterSmDependency extends SmSingleDependency {
            @objid ("a6dfec92-17a5-497b-969e-a7483a13564f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralOrderingData) data).mAfter;
            }

            @objid ("abb548a5-2c77-4a58-ae55-75421d62cd97")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralOrderingData) data).mAfter = value;
            }

            @objid ("4455068f-5692-4624-960e-42ce8e36ff94")
            @Override
            public SmDependency getSymetric() {
                return OccurrenceSpecificationData.Metadata.ToBeforeDep();
            }

        }

        @objid ("0016d078-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BeforeSmDependency extends SmSingleDependency {
            @objid ("bf00e7ac-4741-4b53-a328-b9c687ccc6c5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralOrderingData) data).mBefore;
            }

            @objid ("e8f718cb-4b67-4540-98b4-e375603988cc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralOrderingData) data).mBefore = value;
            }

            @objid ("1faec55a-0d91-4282-ad65-d77f6de976dd")
            @Override
            public SmDependency getSymetric() {
                return OccurrenceSpecificationData.Metadata.ToAfterDep();
            }

        }

    }

}
