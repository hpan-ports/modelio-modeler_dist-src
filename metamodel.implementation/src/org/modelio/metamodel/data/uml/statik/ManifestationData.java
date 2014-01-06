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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.ArtifactData;
import org.modelio.metamodel.impl.uml.statik.ManifestationImpl;
import org.modelio.metamodel.uml.statik.Manifestation;
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

@objid ("001106d4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Manifestation.class, factory=ManifestationData.Metadata.ObjectFactory.class)
public class ManifestationData extends ModelElementData {
    @objid ("76d111cc-ce44-45f2-89ca-c567d821ae9c")
    @SmaMetaAssociation(metaName="UtilizedElement", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.UtilizedElementSmDependency.class, partof = true)
     SmObjectImpl mUtilizedElement;

    @objid ("b504419e-7fa4-40f5-95b4-254e1e2d27a7")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ArtifactData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("336d70c3-2d19-44cb-8d8b-35b700a93974")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f44a8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b12d7a08-6b37-41df-b2cd-42319b1d2878")
        private static SmClass smClass = null;

        @objid ("2beccf4a-7270-489b-937e-719cb81faeac")
        private static SmDependency UtilizedElementDep = null;

        @objid ("dd42bd9d-1d0a-4315-b89f-c1cc18926669")
        private static SmDependency OwnerDep = null;

        @objid ("eecf221f-9727-4da9-949f-a02b370691d8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ManifestationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3dc88d61-2b83-4df6-8ac7-a50223c92ba7")
        public static SmDependency UtilizedElementDep() {
            if (UtilizedElementDep == null) {
            	UtilizedElementDep = classof().getDependencyDef("UtilizedElement");
            }
            return UtilizedElementDep;
        }

        @objid ("de4923b6-de50-48b9-b0c2-a3ce1f4d3546")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("9777aba4-3e98-4037-a691-bc9489dd82fa")
        public static SmDependency getUtilizedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UtilizedElementDep;
        }

        @objid ("a1cc3bc8-a8ca-4254-a2c1-ce99384b2dfa")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("93dc12b0-3b10-4b58-bf5e-cd80e21b726f")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("004f865c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6193332c-974b-4503-aa73-8e333f08445e")
            public ISmObjectData createData() {
                return new ManifestationData();
            }

            @objid ("dad3ee6b-efa5-4315-a6b1-eb05cf4a73fb")
            public SmObjectImpl createImpl() {
                return new ManifestationImpl();
            }

        }

        @objid ("004fe87c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("c8d114c6-93cf-4c47-b3ff-55b46254acce")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ManifestationData) data).mOwner;
            }

            @objid ("39091545-321e-49a9-b006-5894db54d203")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ManifestationData) data).mOwner = value;
            }

            @objid ("ad166f0f-eaed-4d47-a962-d5d712922e9b")
            @Override
            public SmDependency getSymetric() {
                return ArtifactData.Metadata.UtilizedDep();
            }

        }

        @objid ("00505d98-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UtilizedElementSmDependency extends SmSingleDependency {
            @objid ("976fcf15-83a9-4ad0-a9b9-3a10912f1975")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ManifestationData) data).mUtilizedElement;
            }

            @objid ("6fbee5da-eec8-4da8-afeb-bf8ff2e080f3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ManifestationData) data).mUtilizedElement = value;
            }

            @objid ("e9e3b39b-13e2-4d51-a768-f2148cf0285c")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ManifestingDep();
            }

        }

    }

}
