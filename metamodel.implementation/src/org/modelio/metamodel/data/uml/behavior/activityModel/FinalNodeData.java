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
    @objid ("5a00761c-5362-4fda-b2cf-ce722bf8da49")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006fafae-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c17c2896-b4fb-40d1-9d0c-badee8d6031e")
        private static SmClass smClass = null;

        @objid ("ef0a1642-d3a2-4847-83f9-f66e3e0dfb8b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FinalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d10b7fc5-0d9c-43e8-9f04-ba2a579e35f7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007000b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("45c44ba5-cb4d-4b34-b11b-219167f47e99")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("5f8136d9-31e4-46a3-9b7f-d31902241051")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
