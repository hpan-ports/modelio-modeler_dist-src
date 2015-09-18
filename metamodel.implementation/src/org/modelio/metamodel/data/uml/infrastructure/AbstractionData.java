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
    @objid ("1d04d386-ddf3-4d86-83b7-64f9a4f59c86")
    @SmaMetaAttribute(metaName="Mapping", type=String.class, smAttributeClass=Metadata.MappingSmAttribute.class)
     Object mMapping = "";

    @objid ("84e20468-9d62-469d-81e5-c793de608946")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008018c6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("01f4ca44-1c9e-4f72-b275-c58706fb52eb")
        private static SmClass smClass = null;

        @objid ("80cd889c-9c33-4ff3-9299-0855000a936e")
        private static SmAttribute MappingAtt = null;

        @objid ("53ad5c81-8d6e-4ab1-b847-a0fadd6a7d03")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AbstractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("39320c72-1347-4624-bd25-8a37b23ba558")
        public static SmAttribute MappingAtt() {
            if (MappingAtt == null) {
            	MappingAtt = classof().getAttributeDef("Mapping");
            }
            return MappingAtt;
        }

        @objid ("2eed576f-dfce-4de5-b5f7-49004219cf02")
        public static SmAttribute getMappingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MappingAtt;
        }

        @objid ("e2fc578e-5f0c-4b27-93f1-0bf0dff20aec")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00806830-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("851daadb-3012-4c49-984f-16dd4c092a0c")
            public ISmObjectData createData() {
                return new AbstractionData();
            }

            @objid ("e8627a77-1018-49d7-aaeb-06dfbe8d0c42")
            public SmObjectImpl createImpl() {
                return new AbstractionImpl();
            }

        }

        @objid ("0080db30-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MappingSmAttribute extends SmAttribute {
            @objid ("cfeea3fb-ea84-4385-8dd7-03d4e9c421c5")
            public Object getValue(ISmObjectData data) {
                return ((AbstractionData) data).mMapping;
            }

            @objid ("01f6ec0a-06dc-46e6-87e3-8490c86f2bc4")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractionData) data).mMapping = value;
            }

        }

    }

}
