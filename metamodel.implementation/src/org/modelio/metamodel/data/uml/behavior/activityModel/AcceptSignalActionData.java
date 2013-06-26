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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptSignalActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
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

@objid ("00255da0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AcceptSignalAction.class, factory=AcceptSignalActionData.Metadata.ObjectFactory.class)
public class AcceptSignalActionData extends ActivityActionData {
    @objid ("9f3f14b2-9038-4235-9621-85909770fc35")
    @SmaMetaAssociation(metaName="Accepted", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.AcceptedSmDependency.class, partof = true)
     List<SmObjectImpl> mAccepted = null;

    @objid ("69e4b133-4de3-43b7-8f3e-a4b568f3dd95")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002cf362-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3e7068d7-ca9c-499a-8159-1719e9a810c7")
        private static SmClass smClass = null;

        @objid ("cafefadf-b91d-4531-927c-41882c090df5")
        private static SmDependency AcceptedDep = null;

        @objid ("f36bfd4d-df3b-4d94-926e-a2405ded5488")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AcceptSignalActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("57dfd87f-ed33-40ef-9a0a-acb88df1f66e")
        public static SmDependency AcceptedDep() {
            if (AcceptedDep == null) {
            	AcceptedDep = classof().getDependencyDef("Accepted");
            }
            return AcceptedDep;
        }

        @objid ("cc740c1d-387e-4e4d-afc3-b02af2b414ec")
        public static SmDependency getAcceptedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AcceptedDep;
        }

        @objid ("a231b42b-8c0c-476c-88ef-9da9e291e2cf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002d38ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("06a2a094-6173-4355-8f41-544bb75991e0")
            public ISmObjectData createData() {
                return new AcceptSignalActionData();
            }

            @objid ("d609901c-b5da-436b-8e50-fd291e149801")
            public SmObjectImpl createImpl() {
                return new AcceptSignalActionImpl();
            }

        }

        @objid ("002d9cd6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AcceptedSmDependency extends SmMultipleDependency {
            @objid ("83e6eeb1-7c76-41de-9abd-242f7c3a0a48")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AcceptSignalActionData)data).mAccepted != null)? ((AcceptSignalActionData)data).mAccepted:SmMultipleDependency.EMPTY;
            }

            @objid ("5e05a237-234b-4b5d-bfe7-559e53460e1c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AcceptSignalActionData) data).mAccepted = new ArrayList<>(initialCapacity);
                return ((AcceptSignalActionData) data).mAccepted;
            }

            @objid ("9999d574-ef1d-4b5b-908b-dff18b21c714")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.ReceiverDep();
            }

        }

    }

}
