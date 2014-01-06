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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ShallowHistoryPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ShallowHistoryPseudoState;
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

@objid ("00534670-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ShallowHistoryPseudoState.class, factory=ShallowHistoryPseudoStateData.Metadata.ObjectFactory.class)
public class ShallowHistoryPseudoStateData extends AbstractPseudoStateData {
    @objid ("7d23a78b-40a5-4a68-93d2-e0a15d5a3c90")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007858ca-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5f98b66d-dc0e-4305-8db1-4e96edd5ce70")
        private static SmClass smClass = null;

        @objid ("118b0bc9-446c-4bca-b525-0c7426cd454e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ShallowHistoryPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1db48fdc-2b58-4705-bc25-ef638e1cafdd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00789d62-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7859b4b0-b2f2-4efe-b0f1-b1a01ceba956")
            public ISmObjectData createData() {
                return new ShallowHistoryPseudoStateData();
            }

            @objid ("5a3f3734-04e5-4940-b01d-739b1611ad0c")
            public SmObjectImpl createImpl() {
                return new ShallowHistoryPseudoStateImpl();
            }

        }

    }

}
