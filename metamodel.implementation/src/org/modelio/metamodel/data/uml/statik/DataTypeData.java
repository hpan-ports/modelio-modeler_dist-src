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

    @objid ("ae6ecbe5-bf66-4aa1-8f4e-fce0e8a8e71a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00113e10-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("81747ba8-684d-43cd-b882-438edd75b490")
        private static SmClass smClass = null;

        @objid ("056df79a-b23b-4a69-b06c-5bea3d8c37a0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("19df7fdf-8463-4780-bbe0-f62fd5b7fda0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00117eac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2b3bc609-070d-49aa-8c42-96c0a578291c")
            public ISmObjectData createData() {
                return new DataTypeData();
            }

            @objid ("bc0adb0b-e9de-405d-afb8-1e79599cb71b")
            public SmObjectImpl createImpl() {
                return new DataTypeImpl();
            }

        }

    }

}
