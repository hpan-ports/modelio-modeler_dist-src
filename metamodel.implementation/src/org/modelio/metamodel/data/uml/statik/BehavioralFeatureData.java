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
import org.modelio.metamodel.impl.uml.statik.BehavioralFeatureImpl;
import org.modelio.metamodel.uml.statik.BehavioralFeature;
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

@objid ("00205526-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BehavioralFeature.class, factory=BehavioralFeatureData.Metadata.ObjectFactory.class)
public class BehavioralFeatureData extends FeatureData {
    @objid ("6c6ed682-aeac-4872-925d-bf3ec84c7f07")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00578b86-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("078d5b1d-f056-4058-bbf2-23b40844394d")
        private static SmClass smClass = null;

        @objid ("5efebcfe-3bf5-4844-b5b7-3707d4e6bc62")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehavioralFeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0a481ddd-b05e-4c9a-ad6f-451d6d9947bf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005895ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5cc2f806-cd10-426b-827e-a6c3eaac2c37")
            public ISmObjectData createData() {
                return new BehavioralFeatureData();
            }

            @objid ("88e09951-1496-4b99-ad83-18714c1d9db3")
            public SmObjectImpl createImpl() {
                return new BehavioralFeatureImpl();
            }

        }

    }

}
