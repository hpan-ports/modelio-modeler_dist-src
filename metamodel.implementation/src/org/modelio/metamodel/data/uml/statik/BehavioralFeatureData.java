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
    @objid ("f4b30226-79eb-4d4f-a949-6077b79e54ba")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00578b86-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f4bfb54c-576d-47a1-955b-de9ff7ffbeab")
        private static SmClass smClass = null;

        @objid ("41346bf5-d3fa-4c2d-99e9-004dbc878329")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BehavioralFeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3ba44945-febc-43a3-b770-1592d2ef1747")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("005895ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("13b79b7f-9948-42df-96ab-cf87fe7c3cb3")
            public ISmObjectData createData() {
                return new BehavioralFeatureData();
            }

            @objid ("763b37c6-37d9-4539-8fd5-b4996f482538")
            public SmObjectImpl createImpl() {
                return new BehavioralFeatureImpl();
            }

        }

    }

}
