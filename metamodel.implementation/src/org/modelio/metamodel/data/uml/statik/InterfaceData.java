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
    @objid ("bcb572bf-d83e-4c02-9eef-b4e664ca883d")
    @SmaMetaAssociation(metaName="Requiring", typeDataClass=RequiredInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiringSmDependency.class)
     List<SmObjectImpl> mRequiring = null;

    @objid ("f2b54bf5-35c1-4018-9bae-9f23ee56d5bb")
    @SmaMetaAssociation(metaName="ImplementedLink", typeDataClass=InterfaceRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.ImplementedLinkSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mImplementedLink = null;

    @objid ("925fc115-a2f7-418f-9c8e-4bd3d6309852")
    @SmaMetaAssociation(metaName="Providing", typeDataClass=ProvidedInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidingSmDependency.class)
     List<SmObjectImpl> mProviding = null;

    @objid ("a8b3faf7-ccef-11e1-a996-001ec947ccaf")
    public InterfaceData() {
        this.mIsAbstract = Boolean.TRUE;
    }

    @objid ("6298ee6c-327c-459e-9bb9-e3f9dae1dfd5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00548940-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("24e3973b-ed19-42e6-a79e-571ccad858ba")
        private static SmClass smClass = null;

        @objid ("a61124bd-c4e4-4c59-bd2b-298d6e498d34")
        private static SmDependency RequiringDep = null;

        @objid ("ef1c28fc-4db3-4fe2-8202-47ce3d2a85f1")
        private static SmDependency ImplementedLinkDep = null;

        @objid ("aec6129b-290b-4b25-bff8-957597a93964")
        private static SmDependency ProvidingDep = null;

        @objid ("62451ac0-d95b-4b4d-920a-3724e3f47996")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("beca87b5-4a5c-4220-a138-aff143af10d4")
        public static SmDependency RequiringDep() {
            if (RequiringDep == null) {
            	RequiringDep = classof().getDependencyDef("Requiring");
            }
            return RequiringDep;
        }

        @objid ("5903779b-a604-4e3b-9061-fb92eaa9872c")
        public static SmDependency ImplementedLinkDep() {
            if (ImplementedLinkDep == null) {
            	ImplementedLinkDep = classof().getDependencyDef("ImplementedLink");
            }
            return ImplementedLinkDep;
        }

        @objid ("321c3268-a357-4eae-a948-c6ab1d6d31d9")
        public static SmDependency ProvidingDep() {
            if (ProvidingDep == null) {
            	ProvidingDep = classof().getDependencyDef("Providing");
            }
            return ProvidingDep;
        }

        @objid ("3fda76a8-ebe3-44d3-b4e7-5bd20e4cf43d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c2df1611-bde2-4921-b9ff-ea8e4428dda9")
        public static SmDependency getProvidingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidingDep;
        }

        @objid ("b2824e3d-70cc-4e14-9e4c-27734486c0bd")
        public static SmDependency getImplementedLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementedLinkDep;
        }

        @objid ("a4052bd4-2766-40d1-9314-d26d5ba61725")
        public static SmDependency getRequiringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiringDep;
        }

        @objid ("0054ca18-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("59a272b4-6960-491a-89fb-ea3f146437bb")
            public ISmObjectData createData() {
                return new InterfaceData();
            }

            @objid ("c523457c-137a-45fc-b4ed-f0b5fff82a83")
            public SmObjectImpl createImpl() {
                return new InterfaceImpl();
            }

        }

        @objid ("00552cec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementedLinkSmDependency extends SmMultipleDependency {
            @objid ("27566421-32e4-4033-95d6-06a404d200d3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mImplementedLink != null)? ((InterfaceData)data).mImplementedLink:SmMultipleDependency.EMPTY;
            }

            @objid ("a2271498-befb-4dcf-9cb8-74383c60f001")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mImplementedLink = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mImplementedLink;
            }

            @objid ("8da782f3-e40c-4192-b523-7f0fdfbfdf2a")
            @Override
            public SmDependency getSymetric() {
                return InterfaceRealizationData.Metadata.ImplementedDep();
            }

        }

        @objid ("00558fb6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RequiringSmDependency extends SmMultipleDependency {
            @objid ("f90b6d2b-8d3b-4f70-b523-2c469abc49c5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mRequiring != null)? ((InterfaceData)data).mRequiring:SmMultipleDependency.EMPTY;
            }

            @objid ("180a9db3-9624-4697-8db1-6385da1fd9f9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mRequiring = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mRequiring;
            }

            @objid ("746530c4-a98e-4504-9d70-9ae3ad4b8f04")
            @Override
            public SmDependency getSymetric() {
                return RequiredInterfaceData.Metadata.RequiredElementDep();
            }

        }

        @objid ("0055f2bc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProvidingSmDependency extends SmMultipleDependency {
            @objid ("125b03a1-dca4-4beb-a5ea-4a8ab3e666ad")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InterfaceData)data).mProviding != null)? ((InterfaceData)data).mProviding:SmMultipleDependency.EMPTY;
            }

            @objid ("9999a43c-e7eb-4ac1-8940-32c04f363143")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InterfaceData) data).mProviding = new ArrayList<>(initialCapacity);
                return ((InterfaceData) data).mProviding;
            }

            @objid ("214dcadc-b214-4e3c-9657-38d10122ef67")
            @Override
            public SmDependency getSymetric() {
                return ProvidedInterfaceData.Metadata.ProvidedElementDep();
            }

        }

    }

}
