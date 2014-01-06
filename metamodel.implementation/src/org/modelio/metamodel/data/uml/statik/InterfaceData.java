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
    @objid ("f749670d-ca06-4a8f-8348-8ac26b412e86")
    @SmaMetaAssociation(metaName="Requiring", typeDataClass=RequiredInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiringSmDependency.class)
     List<SmObjectImpl> mRequiring = null;

    @objid ("934137a0-66f3-45b2-9c3c-0a90a0572640")
    @SmaMetaAssociation(metaName="ImplementedLink", typeDataClass=InterfaceRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.ImplementedLinkSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mImplementedLink = null;

    @objid ("c2785517-605f-4267-874e-3214a6d3776b")
    @SmaMetaAssociation(metaName="Providing", typeDataClass=ProvidedInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidingSmDependency.class)
     List<SmObjectImpl> mProviding = null;

    @objid ("a8b3faf7-ccef-11e1-a996-001ec947ccaf")
    public InterfaceData() {
        this.mIsAbstract = Boolean.TRUE;
    }

    @objid ("3e4c1020-dbdb-4503-b307-3fafec7f8421")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00548940-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b92a5f86-3f94-47ad-bfb5-6e52fab32d7b")
        private static SmClass smClass = null;

        @objid ("c3807f0d-c5b6-45ee-a034-01b42dad1c58")
        private static SmDependency RequiringDep = null;

        @objid ("8a09d34e-6e13-4916-9cab-9a441018300c")
        private static SmDependency ImplementedLinkDep = null;

        @objid ("3024f818-aa83-40e1-9ac0-47ac0d5ec153")
        private static SmDependency ProvidingDep = null;

        @objid ("f383a6d3-75e3-4ad8-a5fc-63b65ff4aa12")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1965bbd7-a62f-4e13-b658-833a0da44a36")
        public static SmDependency RequiringDep() {
            if (RequiringDep == null) {
            	RequiringDep = classof().getDependencyDef("Requiring");
            }
            return RequiringDep;
        }

        @objid ("32e11074-8208-4e72-ab4d-2533a3edb8ec")
        public static SmDependency ImplementedLinkDep() {
            if (ImplementedLinkDep == null) {
            	ImplementedLinkDep = classof().getDependencyDef("ImplementedLink");
            }
            return ImplementedLinkDep;
        }

        @objid ("e370a061-21dd-48a5-b824-e1041a79f097")
        public static SmDependency ProvidingDep() {
            if (ProvidingDep == null) {
            	ProvidingDep = classof().getDependencyDef("Providing");
            }
            return ProvidingDep;
        }

        @objid ("c53c98ea-2600-41ce-81bb-138e240e888a")
        public static SmDependency getImplementedLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementedLinkDep;
        }

        @objid ("c952bb9a-126c-419c-8cd4-97c0739747c1")
        public static SmDependency getProvidingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidingDep;
        }

        @objid ("997c711c-b39d-4d4b-b5ce-e458cf666549")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2749f80a-549b-4850-b49c-235c98ebaf77")
        public static SmDependency getRequiringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiringDep;
        }

        @objid ("0054ca18-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3ecc79b9-092e-4c3b-bc93-709f3babaef1")
            public ISmObjectData createData() {
                return new InterfaceData();
            }

            @objid ("8100bd01-8ac2-4c16-9723-bceeca4e9b4c")
            public SmObjectImpl createImpl() {
                return new InterfaceImpl();
            }

        }

        @objid ("00552cec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementedLinkSmDependency extends SmMultipleDependency {
            @objid ("ec25e3c5-e1e6-4af3-b84c-4aba15ceec13")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mImplementedLink != null)? ((InterfaceData)data).mImplementedLink:SmMultipleDependency.EMPTY;
            }

            @objid ("9b28f5b2-0190-460d-8fd6-c66b312c79d2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mImplementedLink = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mImplementedLink;
            }

            @objid ("cbd45484-2fe4-4f43-a64f-8330ff021650")
            @Override
            public SmDependency getSymetric() {
                return InterfaceRealizationData.Metadata.ImplementedDep();
            }

        }

        @objid ("00558fb6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RequiringSmDependency extends SmMultipleDependency {
            @objid ("a838f3a8-bb60-43b3-8f4d-f09a0b1b4227")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mRequiring != null)? ((InterfaceData)data).mRequiring:SmMultipleDependency.EMPTY;
            }

            @objid ("ce3cc4da-a440-4c28-8d65-a7bf922693c3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mRequiring = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mRequiring;
            }

            @objid ("4b5c08dc-08a6-4c3e-9634-6661f589ec70")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.RequiredElementDep();
            }

        }

        @objid ("0055f2bc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProvidingSmDependency extends SmMultipleDependency {
            @objid ("f1641515-a36a-4c40-90dc-044e48ab5f25")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mProviding != null)? ((InterfaceData)data).mProviding:SmMultipleDependency.EMPTY;
            }

            @objid ("2609d61f-f04d-44fb-a74a-62ac850c9efa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mProviding = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mProviding;
            }

            @objid ("4a08104d-da9e-4368-adc3-6738f43cc97a")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ProvidedElementDep();
            }

        }

    }

}
