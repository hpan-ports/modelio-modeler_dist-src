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
    @objid ("2cabd8de-0a9c-4a6b-8579-f0f1f69a21f4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("08b3d3f4-aa75-4b25-9b20-148b992d0173")
    public static class Metadata {
        @objid ("45df6623-815b-49f0-9bb5-715615333a29")
        private static SmClass smClass = null;

        @objid ("9d119a61-4b45-4d1c-97f7-9517970d4816")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b9ecd42e-4719-49ea-9032-62b8e363b171")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c7c3d260-7c0e-4c05-8e48-e1fead0968ac")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8314b569-e5c2-4d27-a922-f4ecbd29c052")
            public ISmObjectData createData() {
                return new ConnectorData();
            }

            @objid ("34b0f830-ded0-4401-b5a4-36288cb84379")
            public SmObjectImpl createImpl() {
                return new ConnectorImpl();
            }

        }

    }

}
