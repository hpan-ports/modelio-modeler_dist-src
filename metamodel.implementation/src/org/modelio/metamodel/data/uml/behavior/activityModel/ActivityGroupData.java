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
    @objid ("5012d779-572d-448b-8e56-f25bddfb2b7b")
    @SmaMetaAssociation(metaName="InActivity", typeDataClass=ActivityData.class, min=0, max=1, smAssociationClass=Metadata.InActivitySmDependency.class)
     SmObjectImpl mInActivity;

    @objid ("03893808-6c47-44d9-89af-cd9d5bb0c9dd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001f39c0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6cfaac21-8274-4d10-90c8-c6ee4333c03f")
        private static SmClass smClass = null;

        @objid ("a2ef6b43-5bc4-4978-bfbd-227e1cf5e859")
        private static SmDependency InActivityDep = null;

        @objid ("55dfea8a-6255-4d6b-bdf6-adf6fdc135bc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityGroupData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("df4b2b70-f8a8-4441-9ec4-cdd3e6e4ff23")
        public static SmDependency InActivityDep() {
            if (InActivityDep == null) {
            	InActivityDep = classof().getDependencyDef("InActivity");
            }
            return InActivityDep;
        }

        @objid ("2ae4c7a4-c86c-4492-ac38-d59abf5c8da4")
        public static SmDependency getInActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InActivityDep;
        }

        @objid ("3968c5a5-b570-4855-8c95-4a36086ae571")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("001f7b2e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f86ed4b2-273d-4113-859f-390095bcc344")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("10b9d357-249d-4afe-94db-6105da1d22ed")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("001fe096-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InActivitySmDependency extends SmSingleDependency {
            @objid ("751a2a0a-e8fc-453c-89ee-7b90b1e41451")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityGroupData) data).mInActivity;
            }

            @objid ("796edf3f-6697-4205-b188-5a0e12d7ddd3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityGroupData) data).mInActivity = value;
            }

            @objid ("1c06aacb-cd9b-429e-9475-0101ec226202")
            @Override
            public SmDependency getSymetric() {
                return ActivityData.Metadata.OwnedGroupDep();
            }

        }

    }

}
