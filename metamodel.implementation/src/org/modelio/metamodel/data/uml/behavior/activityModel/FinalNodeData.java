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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.FinalNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.FinalNode;
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

@objid ("0032c97c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=FinalNode.class, factory=FinalNodeData.Metadata.ObjectFactory.class)
public abstract class FinalNodeData extends ControlNodeData {
    @objid ("db99676b-b3de-444c-b408-e198f0e5cbb8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006fafae-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c7ac34eb-031a-4e9b-997a-bec9975c0341")
        private static SmClass smClass = null;

        @objid ("a2b07d02-e1cc-4cf7-aeb9-c6b936d88b66")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FinalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("01c4aced-2449-4e16-a844-75ddd7cb8688")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007000b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a976f00e-000a-4a91-9701-b3679939b1e5")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("e22198e8-4cfc-4630-8982-45d1ab883317")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
