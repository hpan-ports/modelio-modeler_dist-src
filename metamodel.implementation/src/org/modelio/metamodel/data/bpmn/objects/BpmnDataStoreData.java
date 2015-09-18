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
    @objid ("06510edb-9492-477c-8432-0904467e2e8c")
    @SmaMetaAttribute(metaName="Capacity", type=Integer.class, smAttributeClass=Metadata.CapacitySmAttribute.class)
     Object mCapacity = 0;

    @objid ("04ece452-aa49-4089-a31c-7f50c1b4b8ea")
    @SmaMetaAttribute(metaName="IsUnlimited", type=Boolean.class, smAttributeClass=Metadata.IsUnlimitedSmAttribute.class)
     Object mIsUnlimited = false;

    @objid ("74c98f1c-7c20-447e-b289-6b04bc656673")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ea3a0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f2c5c0fc-8bec-4503-ab9d-14c28388c57d")
        private static SmClass smClass = null;

        @objid ("119a5d45-daf6-48ac-b6bf-61fa9aef4c31")
        private static SmAttribute CapacityAtt = null;

        @objid ("aa23c141-52bc-490a-96e3-3fcdbd7da01c")
        private static SmAttribute IsUnlimitedAtt = null;

        @objid ("ba8565ae-7702-44e4-929a-5cfcbf4842bf")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataStoreData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a5fcb8da-2738-4980-861d-57a07a3b5e7f")
        public static SmAttribute CapacityAtt() {
            if (CapacityAtt == null) {
            	CapacityAtt = classof().getAttributeDef("Capacity");
            }
            return CapacityAtt;
        }

        @objid ("3e2f5045-bcd0-4080-8722-18855636e945")
        public static SmAttribute IsUnlimitedAtt() {
            if (IsUnlimitedAtt == null) {
            	IsUnlimitedAtt = classof().getAttributeDef("IsUnlimited");
            }
            return IsUnlimitedAtt;
        }

        @objid ("73ee97cb-a3c9-43c1-9440-c22617e5c177")
        public static SmAttribute getCapacityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CapacityAtt;
        }

        @objid ("7d8cb932-02a7-4852-b83b-c228fef5c2ba")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("27a57cb2-8c00-433b-bac8-6959824b7ad7")
        public static SmAttribute getIsUnlimitedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUnlimitedAtt;
        }

        @objid ("003ee388-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("94bce2cb-3b0d-4cb3-9c31-7d27de676846")
            public ISmObjectData createData() {
                return new BpmnDataStoreData();
            }

            @objid ("6ca079e6-92e9-455e-83fe-8bf25d2f26e0")
            public SmObjectImpl createImpl() {
                return new BpmnDataStoreImpl();
            }

        }

        @objid ("003f4404-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CapacitySmAttribute extends SmAttribute {
            @objid ("6b648d2d-de1a-4845-80ac-eb47f0c80ce2")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataStoreData) data).mCapacity;
            }

            @objid ("62823de8-8ca8-4d7f-9cb3-de30289543b9")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataStoreData) data).mCapacity = value;
            }

        }

        @objid ("003fa66a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsUnlimitedSmAttribute extends SmAttribute {
            @objid ("b229a025-b3b6-4ba4-9a17-708a1df08884")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataStoreData) data).mIsUnlimited;
            }

            @objid ("73a9901b-ca94-43fc-bb38-126bf4472289")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataStoreData) data).mIsUnlimited = value;
            }

        }

    }

}
