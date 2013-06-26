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
import org.modelio.metamodel.impl.uml.statik.ComponentImpl;
import org.modelio.metamodel.uml.statik.Component;
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

@objid ("00058f48-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Component.class, factory=ComponentData.Metadata.ObjectFactory.class, cmsnode=true)
public class ComponentData extends ClassData {
    @objid ("2eeab3c6-4415-4d16-a9f2-62802e2da170")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002e8efc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("12155d87-64a0-4a4a-97fc-f0c466c83277")
        private static SmClass smClass = null;

        @objid ("48b1e64d-9ff5-4355-a5c1-a8be70bb96b0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ComponentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f7f7285d-30dc-41b5-adc0-d2ebdd53874d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002ecfb6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("aafc48d1-5c5d-4c53-ae1e-d9a05978b883")
            public ISmObjectData createData() {
                return new ComponentData();
            }

            @objid ("d67b03c3-7c65-442b-9492-801054c404f9")
            public SmObjectImpl createImpl() {
                return new ComponentImpl();
            }

        }

    }

}
