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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.LifelineData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.PartDecompositionImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
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

@objid ("004b4588-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=PartDecomposition.class, factory=PartDecompositionData.Metadata.ObjectFactory.class)
public class PartDecompositionData extends InteractionUseData {
    @objid ("7383f63f-c512-40bd-9fda-ca80e6055f99")
    @SmaMetaAssociation(metaName="Decomposed", typeDataClass=LifelineData.class, min=1, max=1, smAssociationClass=Metadata.DecomposedSmDependency.class)
     SmObjectImpl mDecomposed;

    @objid ("e5f9a9a7-c965-4e20-97b6-92a8791007fc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00719e54-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("949546c4-8608-4512-b643-7d1d3a5fbc60")
        private static SmClass smClass = null;

        @objid ("622670f6-e941-49ac-a85b-10509b4820bf")
        private static SmDependency DecomposedDep = null;

        @objid ("77536bcd-9999-4d84-b2fc-4487479a9811")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PartDecompositionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ec43301b-c219-40f2-8fea-5e82bed85ae5")
        public static SmDependency DecomposedDep() {
            if (DecomposedDep == null) {
            	DecomposedDep = classof().getDependencyDef("Decomposed");
            }
            return DecomposedDep;
        }

        @objid ("57832843-e608-4d63-bf8b-43ab815c94ee")
        public static SmDependency getDecomposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecomposedDep;
        }

        @objid ("c659491a-742e-43ab-8ed0-6b0813927cad")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0071f03e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d7a3bc46-8902-4adf-85e5-491ce33d367b")
            public ISmObjectData createData() {
                return new PartDecompositionData();
            }

            @objid ("51fc7014-cb52-413f-8f64-e5580bead6b6")
            public SmObjectImpl createImpl() {
                return new PartDecompositionImpl();
            }

        }

        @objid ("00726280-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DecomposedSmDependency extends SmSingleDependency {
            @objid ("cef2ec4f-4c37-40ae-bd4f-913aac41770f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PartDecompositionData) data).mDecomposed;
            }

            @objid ("5b280800-722b-4fc9-87ec-3c3cb89283ba")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PartDecompositionData) data).mDecomposed = value;
            }

            @objid ("bbab28c1-b52f-4f87-8169-8f73b661e551")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.DecomposedAsDep();
            }

        }

    }

}
