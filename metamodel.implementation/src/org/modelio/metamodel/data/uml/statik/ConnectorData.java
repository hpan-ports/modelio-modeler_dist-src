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
    @objid ("2d332523-aad9-453d-8f88-21da902e5b9e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("08b3d3f4-aa75-4b25-9b20-148b992d0173")
    public static class Metadata {
        @objid ("bb159992-b7f6-469c-b227-83afe7ce678e")
        private static SmClass smClass = null;

        @objid ("7501b504-ed49-47e5-98b8-53d8fea2a1e2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8c68ab69-afcb-4ca8-9de2-7fba3efc725b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c7c3d260-7c0e-4c05-8e48-e1fead0968ac")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7e77fd16-7f2d-4602-b9cb-a4cccefdf1e3")
            public ISmObjectData createData() {
                return new ConnectorData();
            }

            @objid ("7a82be23-f95f-4609-851a-06fd8d9425d7")
            public SmObjectImpl createImpl() {
                return new ConnectorImpl();
            }

        }

    }

}
