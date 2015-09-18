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
    @objid ("be013895-187b-418c-bbe7-14ced4bd3544")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00362608-17f3-10a1-88a0-001ec947cd2a")
    public static class Metadata {
        @objid ("5b26b66f-af07-4cd9-af29-eee611959c96")
        private static SmClass smClass = null;

        @objid ("45e10ac4-ef60-44aa-874d-5f58cbffe97a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryConnectorEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1da3eb72-0fd1-4811-b4af-769ac25ce2de")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003669ba-17f3-10a1-88a0-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("976899e2-772a-4501-80d6-5cdf70546c12")
            public ISmObjectData createData() {
                return new NaryConnectorEndData();
            }

            @objid ("4f5f11cd-920f-4192-a0c7-cce619f5ef14")
            public SmObjectImpl createImpl() {
                return new NaryConnectorEndImpl();
            }

        }

    }

}
