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
import org.modelio.metamodel.impl.uml.statik.NaryConnectorEndImpl;
import org.modelio.metamodel.uml.statik.NaryConnectorEnd;
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

@objid ("00789d08-17e8-10a1-88a0-001ec947cd2a")
@SmaMetaClass(mmClass=NaryConnectorEnd.class, factory=NaryConnectorEndData.Metadata.ObjectFactory.class)
public class NaryConnectorEndData extends NaryLinkEndData {
    @objid ("f73135af-dc72-4735-b953-03fecf09d6b9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00362608-17f3-10a1-88a0-001ec947cd2a")
    public static class Metadata {
        @objid ("210fb03b-b345-41bc-9cbc-a5be7983e449")
        private static SmClass smClass = null;

        @objid ("cbc0b4e1-8352-4de2-8cbc-57f2134a1567")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryConnectorEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("16193258-09d6-45a6-a584-b72c8d0b40af")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003669ba-17f3-10a1-88a0-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("41636594-0361-4f1c-91d2-dc2ba1de7dc7")
            public ISmObjectData createData() {
                return new NaryConnectorEndData();
            }

            @objid ("55e1fc9e-c327-44a1-8d29-53ab39b4a6c9")
            public SmObjectImpl createImpl() {
                return new NaryConnectorEndImpl();
            }

        }

    }

}
