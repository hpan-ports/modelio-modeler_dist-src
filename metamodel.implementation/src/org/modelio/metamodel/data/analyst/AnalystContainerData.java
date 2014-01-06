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
    @objid ("7b1343d0-9aa5-4b5c-a747-f27dc9061d46")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("b72be232-efc6-47c2-874d-3173316a5e6d")
    public static class Metadata {
        @objid ("0bcf9fc7-d67e-4145-999d-001834ca83f4")
        private static SmClass smClass = null;

        @objid ("fad965ed-c967-466a-97a8-cfd005b95229")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("009c390f-75d5-4da2-935a-1ae40efee330")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c1994255-df1e-488b-b75a-9d96aa394613")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("09f69f4b-d1d0-42ab-b24c-4c6c1d2066e8")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("c6c835b9-41c8-4969-b179-3b4cf54ad2cf")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
