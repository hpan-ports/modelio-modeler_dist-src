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
    @objid ("68077223-abf3-4ae3-99b1-56fe060f7141")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00362608-17f3-10a1-88a0-001ec947cd2a")
    public static class Metadata {
        @objid ("5ce07b42-4527-4494-8480-2732068c6eb9")
        private static SmClass smClass = null;

        @objid ("cf043a3c-3a3e-4757-aae1-3119dc389cbc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryConnectorEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3757050a-755c-4f33-9a17-0add361edb2e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003669ba-17f3-10a1-88a0-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0acf8676-6a8e-4d7f-9a03-50a77e715895")
            public ISmObjectData createData() {
                return new NaryConnectorEndData();
            }

            @objid ("0e29a148-294b-4f0c-a854-60890f53e6b2")
            public SmObjectImpl createImpl() {
                return new NaryConnectorEndImpl();
            }

        }

    }

}
