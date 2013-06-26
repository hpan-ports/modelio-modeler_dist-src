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
    @objid ("0b93b302-e467-45ca-955c-8176db1bdd71")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("b72be232-efc6-47c2-874d-3173316a5e6d")
    public static class Metadata {
        @objid ("4ccc4092-8ef8-4609-b580-3a2c0146461f")
        private static SmClass smClass = null;

        @objid ("b59d244f-b610-4c85-8647-1fc966dd9100")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0e4b09f1-2cf8-4de2-83ad-0d92472f296c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c1994255-df1e-488b-b75a-9d96aa394613")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f972d52b-10ac-48a0-9dc5-ad69f11cfd45")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("8ae86be4-7d5d-4b55-b5b3-ed491e98bc3b")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
