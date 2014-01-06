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

    @objid ("a11d1212-8520-4742-950a-8767ce8f409a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00113e10-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8283e78c-a34d-45ba-9bc1-c71fba709546")
        private static SmClass smClass = null;

        @objid ("07179935-2d35-4899-b91c-37babdd399cf")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DataTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("434ca53e-10e0-4504-a6c0-42b73422a717")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00117eac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ffae66d8-6cb9-43a8-b503-510d0b5b190b")
            public ISmObjectData createData() {
                return new DataTypeData();
            }

            @objid ("cf561a77-d4e3-44e2-89ce-eed645eb9d38")
            public SmObjectImpl createImpl() {
                return new DataTypeImpl();
            }

        }

    }

}
