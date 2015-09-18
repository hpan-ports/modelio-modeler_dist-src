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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.impl.analyst.AnalystContainerImpl;
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

@objid ("ff7ecd90-d1b2-4c61-90fa-2fb3db4bfb66")
@SmaMetaClass(mmClass=AnalystContainer.class, factory=AnalystContainerData.Metadata.ObjectFactory.class)
public abstract class AnalystContainerData extends AnalystItemData {
    @objid ("54916c98-e7fd-4309-b700-3d063b98b58b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("b72be232-efc6-47c2-874d-3173316a5e6d")
    public static class Metadata {
        @objid ("c17aa446-6610-4c88-b678-510fae458c95")
        private static SmClass smClass = null;

        @objid ("c2478940-8eb9-4b62-8dad-c6961ed9584a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c8b8a85f-e4f1-4686-9360-67314e28c41e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c1994255-df1e-488b-b75a-9d96aa394613")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c7d6f07d-f8f3-4184-a910-73d32e31fc70")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("badaacdd-b92b-4dfb-ac00-8368289554ad")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
