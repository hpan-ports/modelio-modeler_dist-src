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
import org.modelio.metamodel.data.uml.infrastructure.AbstractionData;
import org.modelio.metamodel.impl.uml.statik.ElementRealizationImpl;
import org.modelio.metamodel.uml.statik.ElementRealization;
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

@objid ("00093b2a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ElementRealization.class, factory=ElementRealizationData.Metadata.ObjectFactory.class)
public class ElementRealizationData extends AbstractionData {
    @objid ("ba6fd0c9-f28c-4d82-aec1-aa37072cb205")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000927de-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5a2f7e49-ccce-4561-b7e0-34e8228b5ce6")
        private static SmClass smClass = null;

        @objid ("ee0ac67f-c9a7-40af-8813-8f664ba0d2b4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementRealizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("27306ad3-92da-4709-9f1a-8f3948d4ae29")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000968b6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("10fd4e6b-c17e-47e0-bfa2-e9b2705ad37d")
            public ISmObjectData createData() {
                return new ElementRealizationData();
            }

            @objid ("e6704cd0-fb09-469b-973b-cbb6e9232564")
            public SmObjectImpl createImpl() {
                return new ElementRealizationImpl();
            }

        }

    }

}
