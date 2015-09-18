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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.FlowFinalNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.FlowFinalNode;
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

@objid ("00337692-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=FlowFinalNode.class, factory=FlowFinalNodeData.Metadata.ObjectFactory.class)
public class FlowFinalNodeData extends FinalNodeData {
    @objid ("0ac746c8-83b9-463d-b9a8-f29f96ed4d52")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0072be60-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1f760a0a-8c5d-45f2-b227-32e803de54e1")
        private static SmClass smClass = null;

        @objid ("1174b82e-0d4f-43ef-a59b-4ef30da2663f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FlowFinalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8f4a5a87-c917-4e51-a265-f0740bcc5ecb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007300a0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9f77d7f2-9a14-47c4-a212-384a1e0d4e30")
            public ISmObjectData createData() {
                return new FlowFinalNodeData();
            }

            @objid ("533afd88-24a4-43ae-afaf-5f3d1e44f657")
            public SmObjectImpl createImpl() {
                return new FlowFinalNodeImpl();
            }

        }

    }

}
