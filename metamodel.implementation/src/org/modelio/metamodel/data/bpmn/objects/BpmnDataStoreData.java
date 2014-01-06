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
    @objid ("cf463f87-4b1c-407a-aafd-d18563e8c7f7")
    @SmaMetaAttribute(metaName="Capacity", type=Integer.class, smAttributeClass=Metadata.CapacitySmAttribute.class)
     Object mCapacity = 0;

    @objid ("6ec529c4-7c8d-42c0-b858-2ecf851d015c")
    @SmaMetaAttribute(metaName="IsUnlimited", type=Boolean.class, smAttributeClass=Metadata.IsUnlimitedSmAttribute.class)
     Object mIsUnlimited = false;

    @objid ("50aa54dc-0178-42c3-8631-68fc7dd145bd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ea3a0-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bb7d6d59-7566-420d-a7d2-cdcbb53da561")
        private static SmClass smClass = null;

        @objid ("4f0f47f5-cebf-4997-89d8-5b2741c95048")
        private static SmAttribute CapacityAtt = null;

        @objid ("79899813-2945-4767-bdf8-bff5772309a8")
        private static SmAttribute IsUnlimitedAtt = null;

        @objid ("df10059a-9f36-4394-a9d3-61185ceaeda0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataStoreData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c10c5be0-6d15-4349-bca1-70b23a0b268e")
        public static SmAttribute CapacityAtt() {
            if (CapacityAtt == null) {
            	CapacityAtt = classof().getAttributeDef("Capacity");
            }
            return CapacityAtt;
        }

        @objid ("c7fac0e1-5824-45ef-ba36-32284e421b0e")
        public static SmAttribute IsUnlimitedAtt() {
            if (IsUnlimitedAtt == null) {
            	IsUnlimitedAtt = classof().getAttributeDef("IsUnlimited");
            }
            return IsUnlimitedAtt;
        }

        @objid ("7b27f9a7-af51-424e-8077-1ecce14e9487")
        public static SmAttribute getCapacityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CapacityAtt;
        }

        @objid ("b7127cfd-07e5-4704-8251-4d7a8ce603ae")
        public static SmAttribute getIsUnlimitedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUnlimitedAtt;
        }

        @objid ("892499a8-e720-4d20-82a5-cfff4273f2bb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003ee388-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("13b075b5-50b3-48ea-9e22-6e42ab1bbe60")
            public ISmObjectData createData() {
                return new BpmnDataStoreData();
            }

            @objid ("f2293e29-3bdc-43f4-8804-39a31d2e7a04")
            public SmObjectImpl createImpl() {
                return new BpmnDataStoreImpl();
            }

        }

        @objid ("003f4404-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CapacitySmAttribute extends SmAttribute {
            @objid ("8af2ea5f-4936-4b50-a281-49e27251892f")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataStoreData) data).mCapacity;
            }

            @objid ("7ac9ab33-a6e9-4574-ba55-03b69d8dc534")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataStoreData) data).mCapacity = value;
            }

        }

        @objid ("003fa66a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsUnlimitedSmAttribute extends SmAttribute {
            @objid ("7c129916-8de1-413d-88a5-f7eb641d2bfe")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataStoreData) data).mIsUnlimited;
            }

            @objid ("4c44f9c4-5cfb-463d-a280-d57df7be2149")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataStoreData) data).mIsUnlimited = value;
            }

        }

    }

}
