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
    @objid ("9ce6800c-f20c-4145-9615-9bfbd906be64")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002e8efc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0e5d2881-63c4-4da2-ac5f-c0363c156f71")
        private static SmClass smClass = null;

        @objid ("a2a78f62-39be-4ac3-b448-df9b5963557a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ComponentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("502e3e19-f9c0-4c91-bf8c-0009b582bacd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002ecfb6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bcb86748-8406-4cb7-82b7-477988e2e478")
            public ISmObjectData createData() {
                return new ComponentData();
            }

            @objid ("9eaaa367-d3fb-4d76-8ee8-cbf33818cc9f")
            public SmObjectImpl createImpl() {
                return new ComponentImpl();
            }

        }

    }

}
