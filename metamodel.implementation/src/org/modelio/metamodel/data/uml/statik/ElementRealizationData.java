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
    @objid ("acc035e4-23f4-4970-aafe-6a460dff62e5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000927de-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f9efafca-f531-4e27-b0fd-ab6123b7715d")
        private static SmClass smClass = null;

        @objid ("c05ef7a6-64f1-446c-8a73-ff5b2e4a2dff")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementRealizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a9e4e8dc-9b38-4944-a420-e3bb6b5dfc77")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("000968b6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c2f4e45c-432d-466d-a750-07089b843224")
            public ISmObjectData createData() {
                return new ElementRealizationData();
            }

            @objid ("e57149de-2368-4999-918c-41fc8cd3ceb3")
            public SmObjectImpl createImpl() {
                return new ElementRealizationImpl();
            }

        }

    }

}
