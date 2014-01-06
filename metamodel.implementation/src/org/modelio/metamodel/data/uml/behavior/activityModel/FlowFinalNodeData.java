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
    @objid ("727bbbca-c12b-4d80-8de7-45106646a525")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0072be60-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("57449257-2241-4490-8d2b-b0fc41c82016")
        private static SmClass smClass = null;

        @objid ("35c95078-040b-4d7d-aafb-b54be5d850bc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FlowFinalNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f7ca9885-ed62-41cb-9219-e18a7f4e03ac")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("007300a0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8de87dd8-70fc-451b-bf3e-c319d144663c")
            public ISmObjectData createData() {
                return new FlowFinalNodeData();
            }

            @objid ("3a3a15ff-69c8-4619-847f-20ac415ed262")
            public SmObjectImpl createImpl() {
                return new FlowFinalNodeImpl();
            }

        }

    }

}
