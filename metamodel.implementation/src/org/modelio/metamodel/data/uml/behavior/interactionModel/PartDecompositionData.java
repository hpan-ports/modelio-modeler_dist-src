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
    @objid ("750d98f7-bc3a-4cf6-b9d2-a95c4fe19bfd")
    @SmaMetaAssociation(metaName="Decomposed", typeDataClass=LifelineData.class, min=1, max=1, smAssociationClass=Metadata.DecomposedSmDependency.class)
     SmObjectImpl mDecomposed;

    @objid ("f9c2165f-6a39-4de4-95ad-45bbe81c2ba3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00719e54-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("eee647e3-5593-4ad6-8b2c-3805bac00bd4")
        private static SmClass smClass = null;

        @objid ("741aa1c3-09f6-4af0-bc0f-f7a9cca76ef1")
        private static SmDependency DecomposedDep = null;

        @objid ("fcda82a4-bb88-43a9-874e-a8214a8545dd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PartDecompositionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0fbb93f3-2a08-40d4-bde6-bbc6d4e3ce1d")
        public static SmDependency DecomposedDep() {
            if (DecomposedDep == null) {
            	DecomposedDep = classof().getDependencyDef("Decomposed");
            }
            return DecomposedDep;
        }

        @objid ("188b5175-fbd3-4c19-9f9a-a8d4c0df0b27")
        public static SmDependency getDecomposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecomposedDep;
        }

        @objid ("c9e074f6-653b-44cd-92f8-f30089989a4b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0071f03e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("43cb8cdf-d59d-4579-9a5d-34d585355079")
            public ISmObjectData createData() {
                return new PartDecompositionData();
            }

            @objid ("fdcd9df2-41c9-4d65-b9d9-d020d87b59ec")
            public SmObjectImpl createImpl() {
                return new PartDecompositionImpl();
            }

        }

        @objid ("00726280-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DecomposedSmDependency extends SmSingleDependency {
            @objid ("b1b30b06-04a1-4ae6-8b20-374fbd1ed7f7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PartDecompositionData) data).mDecomposed;
            }

            @objid ("0d734cb1-fa14-4dc7-a58b-5294ea2bc23b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PartDecompositionData) data).mDecomposed = value;
            }

            @objid ("89475d2f-79c2-4188-9249-d247dd3a4017")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.DecomposedAsDep();
            }

        }

    }

}
