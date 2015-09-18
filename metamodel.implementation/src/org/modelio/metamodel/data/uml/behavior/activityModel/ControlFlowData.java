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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ControlFlowImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ControlFlow;
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

@objid ("002e4dac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ControlFlow.class, factory=ControlFlowData.Metadata.ObjectFactory.class)
public class ControlFlowData extends ActivityEdgeData {
    @objid ("44365901-0de4-4790-9e09-5302b77272da")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00415adc-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e6fe7c75-ef99-4a33-8557-4a34e414e9ad")
        private static SmClass smClass = null;

        @objid ("257df2da-1e30-4c61-8ab1-54bb6df4e8f3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ControlFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("dc5b53cc-45aa-4a00-914c-e2e45ccd64d0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0041a870-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("63b87de2-0613-4585-ae08-a895c4f17233")
            public ISmObjectData createData() {
                return new ControlFlowData();
            }

            @objid ("1a536818-873c-472f-b32a-ef8c600b3a2c")
            public SmObjectImpl createImpl() {
                return new ControlFlowImpl();
            }

        }

    }

}
