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
    @objid ("3ef603a6-d683-4346-94e7-f029e51147b4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00415adc-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("532fb1b1-7c95-4ada-849c-5586eb542efb")
        private static SmClass smClass = null;

        @objid ("072be4e3-b9d4-41d3-a380-91214dbcb30c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ControlFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("af6e26eb-9b8b-4690-9926-1c69bdec6a3c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0041a870-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("892830e1-cc05-4fee-b87d-b69c78899bc3")
            public ISmObjectData createData() {
                return new ControlFlowData();
            }

            @objid ("03f17203-b3b8-477f-a397-bdffe4faa57d")
            public SmObjectImpl createImpl() {
                return new ControlFlowImpl();
            }

        }

    }

}
