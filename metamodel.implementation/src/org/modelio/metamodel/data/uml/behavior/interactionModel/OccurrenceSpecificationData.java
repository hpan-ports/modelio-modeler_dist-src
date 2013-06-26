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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GeneralOrderingData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.OccurrenceSpecificationImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
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

@objid ("004ab5e6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=OccurrenceSpecification.class, factory=OccurrenceSpecificationData.Metadata.ObjectFactory.class)
public abstract class OccurrenceSpecificationData extends InteractionFragmentData {
    @objid ("12f99964-455c-46a7-a2d4-9cd0c431ae74")
    @SmaMetaAssociation(metaName="ToAfter", typeDataClass=GeneralOrderingData.class, min=0, max=-1, smAssociationClass=Metadata.ToAfterSmDependency.class, component = true)
     List<SmObjectImpl> mToAfter = null;

    @objid ("a48e30a3-955e-4e2e-911e-c535d92e86e9")
    @SmaMetaAssociation(metaName="ToBefore", typeDataClass=GeneralOrderingData.class, min=0, max=-1, smAssociationClass=Metadata.ToBeforeSmDependency.class, istodelete = true)
     List<SmObjectImpl> mToBefore = null;

    @objid ("457ff8bb-bfc6-4e25-a95f-f49905e6318b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004edf68-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8f965875-1368-4817-9723-5c2b874b3f62")
        private static SmClass smClass = null;

        @objid ("48d97b37-e9b3-49d3-83f7-dd90722a8d09")
        private static SmDependency ToAfterDep = null;

        @objid ("174f62f5-5619-4a65-b245-9e2ee844a09e")
        private static SmDependency ToBeforeDep = null;

        @objid ("aea26de1-1bbc-43e5-8532-f296a280c657")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OccurrenceSpecificationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f0ba477b-aa79-4154-ac65-bf60ae80a2f4")
        public static SmDependency ToAfterDep() {
            if (ToAfterDep == null) {
            	ToAfterDep = classof().getDependencyDef("ToAfter");
            }
            return ToAfterDep;
        }

        @objid ("5f5ec9b2-da15-4c55-85ef-a63bf4ff0f03")
        public static SmDependency ToBeforeDep() {
            if (ToBeforeDep == null) {
            	ToBeforeDep = classof().getDependencyDef("ToBefore");
            }
            return ToBeforeDep;
        }

        @objid ("7045540a-d389-4720-9623-618a658afa2d")
        public static SmDependency getToBeforeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ToBeforeDep;
        }

        @objid ("3211fcc7-62e5-4857-abb5-043aa3eafebe")
        public static SmDependency getToAfterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ToAfterDep;
        }

        @objid ("7bafc9ef-c78a-4422-ab53-065ed8ccad6f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("004f202c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("88d161dc-ed36-40e2-a369-f918ffef7cf8")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("376f7090-0730-49dd-b9d7-379ee01013d4")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004f82a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ToBeforeSmDependency extends SmMultipleDependency {
            @objid ("d71a0b28-7b3d-4b6b-ae78-2f67dcc108de")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OccurrenceSpecificationData)data).mToBefore != null)? ((OccurrenceSpecificationData)data).mToBefore:SmMultipleDependency.EMPTY;
            }

            @objid ("2ebc62ea-79ec-44ab-af4c-9a6321c748bf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OccurrenceSpecificationData) data).mToBefore = new ArrayList<>(initialCapacity);
                return ((OccurrenceSpecificationData) data).mToBefore;
            }

            @objid ("390ca730-00a6-477b-903f-bcac885fabc1")
            @Override
            public SmDependency getSymetric() {
                return GeneralOrderingData.Metadata.AfterDep();
            }

        }

        @objid ("004fe462-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ToAfterSmDependency extends SmMultipleDependency {
            @objid ("f619c67c-8dde-4342-85f2-73ab5f3b4720")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OccurrenceSpecificationData)data).mToAfter != null)? ((OccurrenceSpecificationData)data).mToAfter:SmMultipleDependency.EMPTY;
            }

            @objid ("6a05ee9c-f22a-4485-9ee0-e7ab700e6ec3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OccurrenceSpecificationData) data).mToAfter = new ArrayList<>(initialCapacity);
                return ((OccurrenceSpecificationData) data).mToAfter;
            }

            @objid ("8a312344-a0bc-486f-8b42-94e3d72a986f")
            @Override
            public SmDependency getSymetric() {
                return GeneralOrderingData.Metadata.BeforeDep();
            }

        }

    }

}
