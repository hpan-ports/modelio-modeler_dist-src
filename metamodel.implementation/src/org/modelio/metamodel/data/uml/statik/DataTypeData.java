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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.DataTypeImpl;
import org.modelio.metamodel.uml.statik.DataType;
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

@objid ("0007bea8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=DataType.class, factory=DataTypeData.Metadata.ObjectFactory.class, cmsnode=true)
public class DataTypeData extends GeneralClassData {
    @objid ("16e38009-ccef-11e1-a996-001ec947ccaf")
    public DataTypeData() {
        this.mIsElementary = Boolean.TRUE;
    }

    @objid ("8d42c29f-0572-449d-8a14-99e6e77931a9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00113e10-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ccd9976c-8521-4b96-9ccb-71af134a2946")
        private static SmClass smClass = null;

        @objid ("7d6c77ef-fac0-4c9d-b4ac-9dc85c7f42a1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("390e8499-f82e-43b8-b783-c8b2bc092c24")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00117eac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("31b7a69a-db4c-455e-a044-2db7e73ebc35")
            public ISmObjectData createData() {
                return new DataTypeData();
            }

            @objid ("82978fcc-05da-43be-90a9-1faa0f42e601")
            public SmObjectImpl createImpl() {
                return new DataTypeImpl();
            }

        }

    }

}
