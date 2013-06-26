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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityGroupImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
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

@objid ("0028695a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ActivityGroup.class, factory=ActivityGroupData.Metadata.ObjectFactory.class)
public abstract class ActivityGroupData extends ModelElementData {
    @objid ("bdaeb4d2-5a97-41b8-ae88-e67370d357e9")
    @SmaMetaAssociation(metaName="InActivity", typeDataClass=ActivityData.class, min=0, max=1, smAssociationClass=Metadata.InActivitySmDependency.class)
     SmObjectImpl mInActivity;

    @objid ("f67088db-c661-47fa-baeb-c2428ef7dd1a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001f39c0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3a25ff4a-af04-40c9-88fc-d4ea7f799f19")
        private static SmClass smClass = null;

        @objid ("7e5ed8a0-170c-4932-868d-05655ca7d515")
        private static SmDependency InActivityDep = null;

        @objid ("b0492a92-681d-4541-8a95-07d2692fe3e2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityGroupData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("baf7ce56-fadc-42aa-b489-09d4a0849f48")
        public static SmDependency InActivityDep() {
            if (InActivityDep == null) {
            	InActivityDep = classof().getDependencyDef("InActivity");
            }
            return InActivityDep;
        }

        @objid ("015b0294-3a6d-4b80-9e85-2f8d27475cd8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ad3c8524-3bab-40ab-8d77-372f5926a465")
        public static SmDependency getInActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InActivityDep;
        }

        @objid ("001f7b2e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("543f86a9-3ac4-46b1-b4c1-1e8b9f16d9f8")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("5e007d50-406a-46ab-a969-f8d4d2b68ccb")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("001fe096-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InActivitySmDependency extends SmSingleDependency {
            @objid ("500beb19-ee51-46f8-8f06-6c0d2f17c6a6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityGroupData) data).mInActivity;
            }

            @objid ("ba68fa76-c706-40fa-a6f6-a4e6e20de403")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityGroupData) data).mInActivity = value;
            }

            @objid ("273916be-41e1-4444-a425-9c382d0f96ae")
            @Override
            public SmDependency getSymetric() {
                return ActivityData.Metadata.OwnedGroupDep();
            }

        }

    }

}
