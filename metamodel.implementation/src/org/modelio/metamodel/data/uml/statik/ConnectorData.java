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
import org.modelio.metamodel.impl.uml.statik.ConnectorImpl;
import org.modelio.metamodel.uml.statik.Connector;
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

@objid ("83b26800-924c-4c83-b588-26b199d89d79")
@SmaMetaClass(mmClass=Connector.class, factory=ConnectorData.Metadata.ObjectFactory.class)
public class ConnectorData extends LinkData {
    @objid ("3e862d2c-8c36-423d-a896-132c0799a1f4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("08b3d3f4-aa75-4b25-9b20-148b992d0173")
    public static class Metadata {
        @objid ("494aa424-863a-40d1-a599-7e7ec81c875d")
        private static SmClass smClass = null;

        @objid ("a8dba588-bbfa-4037-9080-333cc14ed05b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f94241de-359b-42d8-9c3c-d91fc4aeef7c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c7c3d260-7c0e-4c05-8e48-e1fead0968ac")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e8524839-1293-41e0-842c-1e6321969f3e")
            public ISmObjectData createData() {
                return new ConnectorData();
            }

            @objid ("cc76f716-804c-4a28-b696-871088e50bfa")
            public SmObjectImpl createImpl() {
                return new ConnectorImpl();
            }

        }

    }

}
