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
    @objid ("66847e03-ccb9-492a-933a-3d7c96bab779")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00415adc-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b551e04f-a39c-458c-b18a-459d4838abcf")
        private static SmClass smClass = null;

        @objid ("5eb0c4ea-b5a6-43b9-be4a-ece27c6c852a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ControlFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1e375b83-f870-43d5-b778-16102713804c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0041a870-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4e2c8061-907b-4377-88eb-41295abbc864")
            public ISmObjectData createData() {
                return new ControlFlowData();
            }

            @objid ("365e48d7-00b5-4f2c-bf14-22c2bd1050ea")
            public SmObjectImpl createImpl() {
                return new ControlFlowImpl();
            }

        }

    }

}
