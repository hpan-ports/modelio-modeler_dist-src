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
    @objid ("e12bf4d9-244a-4e98-968e-65430da3b910")
    @SmaMetaAttribute(metaName="Mapping", type=String.class, smAttributeClass=Metadata.MappingSmAttribute.class)
     Object mMapping = "";

    @objid ("46635576-5438-4766-88a6-950e17d3edff")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008018c6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2d235e32-a5b7-4dc7-bb0b-b19a967dc02d")
        private static SmClass smClass = null;

        @objid ("c5bac8e3-c2be-4560-81ba-1676e255cdb3")
        private static SmAttribute MappingAtt = null;

        @objid ("bca937a9-3c5e-44db-8d6d-6fa4f15f175e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AbstractionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e8e09c25-835c-4fb1-ae48-3fbde76d607f")
        public static SmAttribute MappingAtt() {
            if (MappingAtt == null) {
            	MappingAtt = classof().getAttributeDef("Mapping");
            }
            return MappingAtt;
        }

        @objid ("5aee10b3-296c-44e7-a491-0de418520560")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("698417a8-8877-4684-ad0a-68c33616865b")
        public static SmAttribute getMappingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MappingAtt;
        }

        @objid ("00806830-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("35e6aa90-655f-4817-8a06-06203e10d23f")
            public ISmObjectData createData() {
                return new AbstractionData();
            }

            @objid ("ebba6638-10f5-425f-a6e2-3481ed4e3437")
            public SmObjectImpl createImpl() {
                return new AbstractionImpl();
            }

        }

        @objid ("0080db30-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MappingSmAttribute extends SmAttribute {
            @objid ("3317e091-7064-4992-9358-510d0d340402")
            public Object getValue(ISmObjectData data) {
                return ((AbstractionData) data).mMapping;
            }

            @objid ("f78726b2-c392-491d-b710-637d5e004c38")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractionData) data).mMapping = value;
            }

        }

    }

}
