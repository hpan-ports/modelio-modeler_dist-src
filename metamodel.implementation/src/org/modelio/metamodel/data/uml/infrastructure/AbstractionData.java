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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.AbstractionImpl;
import org.modelio.metamodel.uml.infrastructure.Abstraction;
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

@objid ("0084fefe-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Abstraction.class, factory=AbstractionData.Metadata.ObjectFactory.class)
public class AbstractionData extends DependencyData {
    @objid ("0bd13cbd-a07e-4ee5-a4f8-440efc46623f")
    @SmaMetaAttribute(metaName="Mapping", type=String.class, smAttributeClass=Metadata.MappingSmAttribute.class)
     Object mMapping = "";

    @objid ("e8fc0f06-7efb-4263-955c-643386b351fc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008018c6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6920a720-2141-4da6-b49c-46de16712bd5")
        private static SmClass smClass = null;

        @objid ("3d462fe3-2259-45d2-be6e-da2ba73ba840")
        private static SmAttribute MappingAtt = null;

        @objid ("4b66a0b0-54bc-4bfe-80d8-f043bbe06c05")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AbstractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bf1835c3-f029-4aae-9a0a-b64dfdfda409")
        public static SmAttribute MappingAtt() {
            if (MappingAtt == null) {
            	MappingAtt = classof().getAttributeDef("Mapping");
            }
            return MappingAtt;
        }

        @objid ("79965b13-579e-4444-8e3c-e580660c16a3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e58b454e-e8f0-4150-b6f0-ba2bf8571bba")
        public static SmAttribute getMappingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MappingAtt;
        }

        @objid ("00806830-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1e79dc00-b135-4dd6-83bf-092f1c72d8b2")
            public ISmObjectData createData() {
                return new AbstractionData();
            }

            @objid ("f53a41c9-dceb-4d4b-b5cc-a684769262b4")
            public SmObjectImpl createImpl() {
                return new AbstractionImpl();
            }

        }

        @objid ("0080db30-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MappingSmAttribute extends SmAttribute {
            @objid ("0b6ceaba-a58c-45c7-8a72-13073cef6e34")
            public Object getValue(ISmObjectData data) {
                return ((AbstractionData) data).mMapping;
            }

            @objid ("467e63fd-127c-4792-ad8e-6507850a1b1b")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractionData) data).mMapping = value;
            }

        }

    }

}
