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
    @objid ("ac816f88-5b50-4d1c-a5ba-28533802cba9")
    @SmaMetaAssociation(metaName="UtilizedElement", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.UtilizedElementSmDependency.class, partof = true)
     SmObjectImpl mUtilizedElement;

    @objid ("f8e63111-65b5-4553-a0ff-0e0f32579968")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ArtifactData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("f857c7f4-dd64-4c64-bfcd-08eac34a84b7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f44a8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b62c1f46-5899-42eb-8250-4dfd9eaaf26e")
        private static SmClass smClass = null;

        @objid ("6d4bd051-991e-447e-bca4-f2261cc09111")
        private static SmDependency UtilizedElementDep = null;

        @objid ("65b4f812-d19e-4f89-b096-a4319727084c")
        private static SmDependency OwnerDep = null;

        @objid ("f0c9794c-3b4c-4ce4-bcce-2d57fd84e9f4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ManifestationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("76f7f7a1-f32d-4fd5-8ee8-a3fbcfe2e91d")
        public static SmDependency UtilizedElementDep() {
            if (UtilizedElementDep == null) {
            	UtilizedElementDep = classof().getDependencyDef("UtilizedElement");
            }
            return UtilizedElementDep;
        }

        @objid ("44f6375e-fa98-47cb-913d-ede470fdfa88")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("7a63d057-e641-44d7-bfcf-f38fd816bd3e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f76e4d52-2dd4-4f4c-8abe-b30bb4157820")
        public static SmDependency getUtilizedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UtilizedElementDep;
        }

        @objid ("362dc241-94bf-4b9a-aa05-358ca2fcd4cf")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("004f865c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b4da1491-e10f-4125-8ca1-8abf9cdfd1f2")
            public ISmObjectData createData() {
                return new ManifestationData();
            }

            @objid ("74439f96-7cae-41ae-917c-add8e3b6d2e6")
            public SmObjectImpl createImpl() {
                return new ManifestationImpl();
            }

        }

        @objid ("004fe87c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("9f406003-b4ad-4c0b-9f3a-ab9113ac0b08")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ManifestationData) data).mOwner;
            }

            @objid ("08a73659-5cf5-4104-b19d-b252a4678448")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ManifestationData) data).mOwner = value;
            }

            @objid ("ebd601c0-3444-4a94-8395-34d99cc77f07")
            @Override
            public SmDependency getSymetric() {
                return ArtifactData.Metadata.UtilizedDep();
            }

        }

        @objid ("00505d98-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UtilizedElementSmDependency extends SmSingleDependency {
            @objid ("15e7a6aa-eb2f-4c31-b69e-7210c2baa74b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ManifestationData) data).mUtilizedElement;
            }

            @objid ("564e401c-a3e6-47d3-bcb7-dc83c6f867b3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ManifestationData) data).mUtilizedElement = value;
            }

            @objid ("c27a34a3-df99-4e20-bc49-90fedb86610f")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ManifestingDep();
            }

        }

    }

}
