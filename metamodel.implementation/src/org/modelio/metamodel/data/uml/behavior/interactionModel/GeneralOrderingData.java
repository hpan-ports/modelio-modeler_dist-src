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
    @objid ("5b9abea2-7825-446d-a9df-d32e6b050a04")
    @SmaMetaAssociation(metaName="Before", typeDataClass=OccurrenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.BeforeSmDependency.class)
     SmObjectImpl mBefore;

    @objid ("6b0ef597-6285-4476-b476-0197d445d251")
    @SmaMetaAssociation(metaName="After", typeDataClass=OccurrenceSpecificationData.class, min=1, max=1, smAssociationClass=Metadata.AfterSmDependency.class, partof = true)
     SmObjectImpl mAfter;

    @objid ("4c7fbb90-6e6b-4f28-8998-1f9287c60892")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0015b59e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c28d6da5-7245-4cfb-ace2-7d1706afe317")
        private static SmClass smClass = null;

        @objid ("6d5bf46a-42fb-44d0-8c54-6b6a380b80c8")
        private static SmDependency BeforeDep = null;

        @objid ("28c86795-d708-4351-a6dc-f7275adc4b5b")
        private static SmDependency AfterDep = null;

        @objid ("ff649870-fb9c-4ddb-86a3-b4065cf0c0d6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralOrderingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("de5d433c-c995-46e6-b09c-cb1172f35494")
        public static SmDependency BeforeDep() {
            if (BeforeDep == null) {
            	BeforeDep = classof().getDependencyDef("Before");
            }
            return BeforeDep;
        }

        @objid ("8f40531d-c352-4f47-8a24-4991ae1b94b8")
        public static SmDependency AfterDep() {
            if (AfterDep == null) {
            	AfterDep = classof().getDependencyDef("After");
            }
            return AfterDep;
        }

        @objid ("d2d6afd0-dc7a-4630-ad59-fd7ec1a2112c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("94888b07-7e5d-4d56-ad14-92aa9483db84")
        public static SmDependency getAfterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AfterDep;
        }

        @objid ("6770eb5a-c8b1-4eef-981c-dda28658fac5")
        public static SmDependency getBeforeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BeforeDep;
        }

        @objid ("0015f6d0-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0d85ca1e-2dbe-4e57-a398-7232ecab1ca2")
            public ISmObjectData createData() {
                return new GeneralOrderingData();
            }

            @objid ("8886447b-662d-46bd-9082-e9020724199a")
            public SmObjectImpl createImpl() {
                return new GeneralOrderingImpl();
            }

        }

        @objid ("00165bca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AfterSmDependency extends SmSingleDependency {
            @objid ("de50b671-9346-4a47-b4b4-b6505de98bd6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralOrderingData) data).mAfter;
            }

            @objid ("e1a76376-1a27-4d36-a037-9951ebacd67d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralOrderingData) data).mAfter = value;
            }

            @objid ("4f0c87ae-44b6-4006-a6e6-2f61aa8074e0")
            @Override
            public SmDependency getSymetric() {
                return OccurrenceSpecificationData.Metadata.ToBeforeDep();
            }

        }

        @objid ("0016d078-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BeforeSmDependency extends SmSingleDependency {
            @objid ("666b228b-89b5-4f56-99b9-66b848f4d8b8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralOrderingData) data).mBefore;
            }

            @objid ("3a4bdca5-a1af-410a-a70c-c944a5b88352")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralOrderingData) data).mBefore = value;
            }

            @objid ("08c3ca6e-4fa1-436a-9590-2062816dceab")
            @Override
            public SmDependency getSymetric() {
                return OccurrenceSpecificationData.Metadata.ToAfterDep();
            }

        }

    }

}
