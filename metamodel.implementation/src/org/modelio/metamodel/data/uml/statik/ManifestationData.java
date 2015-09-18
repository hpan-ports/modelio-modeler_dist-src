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
    @objid ("5f6f39c9-3bb1-407d-a8f8-d176cfaef9db")
    @SmaMetaAssociation(metaName="UtilizedElement", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.UtilizedElementSmDependency.class, partof = true)
     SmObjectImpl mUtilizedElement;

    @objid ("ae6e7521-c1e3-42be-8025-d5d0f173bfcd")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ArtifactData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("895d2e67-b61d-41fd-8353-14dd71832214")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004f44a8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("31fd945e-3e92-4e88-bcca-b2135546f618")
        private static SmClass smClass = null;

        @objid ("83e53eff-8b78-4187-8def-480f6fec3280")
        private static SmDependency UtilizedElementDep = null;

        @objid ("17064608-962d-4e3a-9d7f-fb8bba9fa1f5")
        private static SmDependency OwnerDep = null;

        @objid ("3ba47fa7-cc95-4126-bea1-f86bf2930834")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ManifestationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d19aa66b-8cd0-4447-8927-73b0c8b763e0")
        public static SmDependency UtilizedElementDep() {
            if (UtilizedElementDep == null) {
            	UtilizedElementDep = classof().getDependencyDef("UtilizedElement");
            }
            return UtilizedElementDep;
        }

        @objid ("1c6b8f27-b6e3-4e55-891a-9988b1c60562")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("e1713d6e-2a73-48c7-b147-7a17d4e067ff")
        public static SmDependency getUtilizedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UtilizedElementDep;
        }

        @objid ("61ca56fd-309e-4d9a-be86-02cae6fecefd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dd699355-6583-4bc4-be19-888fef0d255f")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("004f865c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e6b8a081-8185-49ef-842a-c073ed041d37")
            public ISmObjectData createData() {
                return new ManifestationData();
            }

            @objid ("dd171859-9a2e-4260-9965-6400a15ecaac")
            public SmObjectImpl createImpl() {
                return new ManifestationImpl();
            }

        }

        @objid ("004fe87c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("4af360b8-26c0-4867-a764-4ad2055790a2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ManifestationData) data).mOwner;
            }

            @objid ("045ccaa2-6165-4c78-98de-9a6fec67f034")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ManifestationData) data).mOwner = value;
            }

            @objid ("4cc206b7-d483-4a17-9448-4bc37245f2bb")
            @Override
            public SmDependency getSymetric() {
                return ArtifactData.Metadata.UtilizedDep();
            }

        }

        @objid ("00505d98-c4c3-1fd8-97fe-001ec947cd2a")
        public static class UtilizedElementSmDependency extends SmSingleDependency {
            @objid ("ea087dc8-9155-4f16-abb2-767ba44cfb7a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ManifestationData) data).mUtilizedElement;
            }

            @objid ("5ccc7990-c404-44f1-8634-7b119577b67f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ManifestationData) data).mUtilizedElement = value;
            }

            @objid ("d597d6aa-6ea2-4dfd-ad46-c8fd30d2dde6")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ManifestingDep();
            }

        }

    }

}
