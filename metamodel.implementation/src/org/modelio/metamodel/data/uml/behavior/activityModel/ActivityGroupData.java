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
    @objid ("9d9c7396-adec-4dab-924b-7e21ee20c9e3")
    @SmaMetaAssociation(metaName="InActivity", typeDataClass=ActivityData.class, min=0, max=1, smAssociationClass=Metadata.InActivitySmDependency.class)
     SmObjectImpl mInActivity;

    @objid ("ac88382b-224b-4ddf-ba01-e88c35238780")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001f39c0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d749934e-8545-4c06-bd00-78f2631cfa5e")
        private static SmClass smClass = null;

        @objid ("356acaf4-1054-4478-9012-41b0858bbed7")
        private static SmDependency InActivityDep = null;

        @objid ("71639c09-89ae-4f86-9414-fc3085ee789c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ActivityGroupData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("98437753-f23d-4c70-9c89-3732a151838c")
        public static SmDependency InActivityDep() {
            if (InActivityDep == null) {
            	InActivityDep = classof().getDependencyDef("InActivity");
            }
            return InActivityDep;
        }

        @objid ("d8467bbb-f474-4437-a0f9-f69f680336cb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("56a70334-3061-41e4-beca-d8e5695e2a38")
        public static SmDependency getInActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InActivityDep;
        }

        @objid ("001f7b2e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f6d0cb24-9318-4a0e-80ba-c0cefe88a04e")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("a88d7d75-ca9f-4760-9e67-18ac453bc39f")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("001fe096-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InActivitySmDependency extends SmSingleDependency {
            @objid ("06d11721-f711-44eb-b1e8-f21434d1d925")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ActivityGroupData) data).mInActivity;
            }

            @objid ("90a37000-a50c-4738-9222-ed4aedecbe87")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ActivityGroupData) data).mInActivity = value;
            }

            @objid ("84b61a07-1305-4d0d-bdf6-903e900964f2")
            @Override
            public SmDependency getSymetric() {
                return ActivityData.Metadata.OwnedGroupDep();
            }

        }

    }

}
