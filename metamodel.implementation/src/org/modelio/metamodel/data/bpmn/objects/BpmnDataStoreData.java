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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataStore;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataStoreImpl;
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

@objid ("000442fa-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataStore.class, factory=BpmnDataStoreData.Metadata.ObjectFactory.class)
public class BpmnDataStoreData extends BpmnItemAwareElementData {
    @objid ("53d6fc68-08d0-4ea4-acf4-4f0b628155db")
    @SmaMetaAttribute(metaName="Capacity", type=Integer.class, smAttributeClass=Metadata.CapacitySmAttribute.class)
     Object mCapacity = 0;

    @objid ("24997362-3d96-494d-adbc-9d438bbc269d")
    @SmaMetaAttribute(metaName="IsUnlimited", type=Boolean.class, smAttributeClass=Metadata.IsUnlimitedSmAttribute.class)
     Object mIsUnlimited = false;

    @objid ("042566ca-1353-47d3-a72e-91e464ddf62f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ea3a0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1ccd7a2d-9b23-4f1c-aa38-c891507c01bc")
        private static SmClass smClass = null;

        @objid ("0d27056e-f82d-439f-a137-21263f59f0ab")
        private static SmAttribute CapacityAtt = null;

        @objid ("31940f47-95f4-43d3-97ac-166a2418369c")
        private static SmAttribute IsUnlimitedAtt = null;

        @objid ("d145ae23-65a3-41a1-97c6-21513d40e888")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataStoreData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("19e60445-7a5d-49e4-a06a-6387fccfcd86")
        public static SmAttribute CapacityAtt() {
            if (CapacityAtt == null) {
            	CapacityAtt = classof().getAttributeDef("Capacity");
            }
            return CapacityAtt;
        }

        @objid ("ed75d7ca-9e64-4f74-9c2d-a3bd58cbecde")
        public static SmAttribute IsUnlimitedAtt() {
            if (IsUnlimitedAtt == null) {
            	IsUnlimitedAtt = classof().getAttributeDef("IsUnlimited");
            }
            return IsUnlimitedAtt;
        }

        @objid ("2befea52-416d-4b5d-a351-3c89ba333c2f")
        public static SmAttribute getCapacityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CapacityAtt;
        }

        @objid ("6beecfaf-6893-4329-a25f-a9e8c2a25d2d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a8aa750b-152b-4f58-a3ee-d034099b1456")
        public static SmAttribute getIsUnlimitedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUnlimitedAtt;
        }

        @objid ("003ee388-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ff214435-6918-42c4-a858-1784b72a3717")
            public ISmObjectData createData() {
                return new BpmnDataStoreData();
            }

            @objid ("eb3e4c51-140d-4acd-8350-7fcdb9a52c16")
            public SmObjectImpl createImpl() {
                return new BpmnDataStoreImpl();
            }

        }

        @objid ("003f4404-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CapacitySmAttribute extends SmAttribute {
            @objid ("35f8eda3-40a8-4966-9b1c-72a079665645")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataStoreData) data).mCapacity;
            }

            @objid ("7fb9cc50-8068-4021-b2cc-9f18444a8cc1")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataStoreData) data).mCapacity = value;
            }

        }

        @objid ("003fa66a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsUnlimitedSmAttribute extends SmAttribute {
            @objid ("fd212e09-4e3f-42d8-959c-44c27a5907e7")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataStoreData) data).mIsUnlimited;
            }

            @objid ("2feed6b2-d117-4df9-bcd9-1d1c989837bb")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataStoreData) data).mIsUnlimited = value;
            }

        }

    }

}
