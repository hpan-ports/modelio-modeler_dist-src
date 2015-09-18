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
import org.modelio.metamodel.data.uml.statik.InterfaceRealizationData;
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.statik.InterfaceImpl;
import org.modelio.metamodel.uml.statik.Interface;
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

@objid ("000e976e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Interface.class, factory=InterfaceData.Metadata.ObjectFactory.class, cmsnode=true)
public class InterfaceData extends GeneralClassData {
    @objid ("d1056ccf-2dd7-47a6-bcff-66becca4b1ed")
    @SmaMetaAssociation(metaName="Requiring", typeDataClass=RequiredInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiringSmDependency.class)
     List<SmObjectImpl> mRequiring = null;

    @objid ("dd98ae1e-6386-40fd-9e6e-9e924474e592")
    @SmaMetaAssociation(metaName="ImplementedLink", typeDataClass=InterfaceRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.ImplementedLinkSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mImplementedLink = null;

    @objid ("be31db9f-dd7a-4198-9b7f-f2420b4c5952")
    @SmaMetaAssociation(metaName="Providing", typeDataClass=ProvidedInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidingSmDependency.class)
     List<SmObjectImpl> mProviding = null;

    @objid ("a8b3faf7-ccef-11e1-a996-001ec947ccaf")
    public InterfaceData() {
        this.mIsAbstract = Boolean.TRUE;
    }

    @objid ("235130d3-e383-456f-b100-4c65b4cff8ed")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00548940-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("24f3d0d6-954d-4823-aaf5-c0151a8b5eaf")
        private static SmClass smClass = null;

        @objid ("5a11c7a4-09c1-46eb-823a-0c441f2a64e0")
        private static SmDependency RequiringDep = null;

        @objid ("f4f62eea-fc34-449a-bbb2-fdb2b912e280")
        private static SmDependency ImplementedLinkDep = null;

        @objid ("f404ddf2-45d6-4211-ae74-815a56e74baf")
        private static SmDependency ProvidingDep = null;

        @objid ("c8d1af7b-7277-47dd-8804-28e46fcfd2ef")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4af2801e-c712-4834-a822-0d2ade784af4")
        public static SmDependency RequiringDep() {
            if (RequiringDep == null) {
            	RequiringDep = classof().getDependencyDef("Requiring");
            }
            return RequiringDep;
        }

        @objid ("40761a05-611b-483f-ba1d-293f29319dac")
        public static SmDependency ImplementedLinkDep() {
            if (ImplementedLinkDep == null) {
            	ImplementedLinkDep = classof().getDependencyDef("ImplementedLink");
            }
            return ImplementedLinkDep;
        }

        @objid ("fa96d75d-54ac-4839-ab33-9f47c0a56acb")
        public static SmDependency ProvidingDep() {
            if (ProvidingDep == null) {
            	ProvidingDep = classof().getDependencyDef("Providing");
            }
            return ProvidingDep;
        }

        @objid ("0b2dc436-3955-413a-8365-616d13d94751")
        public static SmDependency getProvidingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidingDep;
        }

        @objid ("8b32cc38-a65b-4564-8c00-6dbcb47366ad")
        public static SmDependency getRequiringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiringDep;
        }

        @objid ("3dfbc1b1-f5e0-40c1-ac43-16267d7f219f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("670f1046-a1cf-4d89-b569-f44eca44578d")
        public static SmDependency getImplementedLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementedLinkDep;
        }

        @objid ("0054ca18-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5eb46b03-9c1c-4e57-9bfe-b8d56f9c45f2")
            public ISmObjectData createData() {
                return new InterfaceData();
            }

            @objid ("19e14679-a546-4681-98f1-5bbac682edab")
            public SmObjectImpl createImpl() {
                return new InterfaceImpl();
            }

        }

        @objid ("00552cec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementedLinkSmDependency extends SmMultipleDependency {
            @objid ("73edbe96-888a-4b01-b64c-1470f93990dc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mImplementedLink != null)? ((InterfaceData)data).mImplementedLink:SmMultipleDependency.EMPTY;
            }

            @objid ("5334e6b4-0a2e-4d17-b521-e9d4ebb92495")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mImplementedLink = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mImplementedLink;
            }

            @objid ("ddd23624-e8cd-4fd6-8101-2c3447d544e4")
            @Override
            public SmDependency getSymetric() {
                return InterfaceRealizationData.Metadata.ImplementedDep();
            }

        }

        @objid ("00558fb6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RequiringSmDependency extends SmMultipleDependency {
            @objid ("5a7af1c7-6919-46dc-bdb1-8adf780388e7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mRequiring != null)? ((InterfaceData)data).mRequiring:SmMultipleDependency.EMPTY;
            }

            @objid ("a7d0321d-37a8-4f03-b02f-d19075b173c0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mRequiring = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mRequiring;
            }

            @objid ("0e016c2f-29ba-430e-82af-da69948a3885")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.RequiredElementDep();
            }

        }

        @objid ("0055f2bc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProvidingSmDependency extends SmMultipleDependency {
            @objid ("13bd0f86-8c71-481d-b608-33a31264f5ae")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mProviding != null)? ((InterfaceData)data).mProviding:SmMultipleDependency.EMPTY;
            }

            @objid ("7dda0bc3-3417-4350-b297-d7ab5552a02a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mProviding = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mProviding;
            }

            @objid ("364e2813-33c4-49b9-9374-8f99f14ea7df")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ProvidedElementDep();
            }

        }

    }

}
