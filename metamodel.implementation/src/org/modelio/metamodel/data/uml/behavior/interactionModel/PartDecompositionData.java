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
    @objid ("0df3e6d6-cdff-4c91-9e8b-24a2fd6ac2c3")
    @SmaMetaAssociation(metaName="Decomposed", typeDataClass=LifelineData.class, min=1, max=1, smAssociationClass=Metadata.DecomposedSmDependency.class)
     SmObjectImpl mDecomposed;

    @objid ("196fd943-7973-4109-9bbb-99974e69d6dc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00719e54-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7787e169-8aa7-4875-a434-c8fca90c366c")
        private static SmClass smClass = null;

        @objid ("a565458d-7e95-40bd-8c7c-6af1ff9445a2")
        private static SmDependency DecomposedDep = null;

        @objid ("c5a863c5-0316-46bf-af79-f2e9adc9f595")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PartDecompositionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("576b4f75-6668-419e-8d7f-9462b075c487")
        public static SmDependency DecomposedDep() {
            if (DecomposedDep == null) {
            	DecomposedDep = classof().getDependencyDef("Decomposed");
            }
            return DecomposedDep;
        }

        @objid ("970677e3-3cc1-472a-a9cc-2ec6b01e1887")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f5a9ffd5-4f67-41d6-92df-ebbda930a1b0")
        public static SmDependency getDecomposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DecomposedDep;
        }

        @objid ("0071f03e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1f414cde-ea7f-4bbf-b5a9-dae8bf09ee9e")
            public ISmObjectData createData() {
                return new PartDecompositionData();
            }

            @objid ("3bd50160-7107-4897-9790-26039881dd35")
            public SmObjectImpl createImpl() {
                return new PartDecompositionImpl();
            }

        }

        @objid ("00726280-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DecomposedSmDependency extends SmSingleDependency {
            @objid ("e069986f-17e7-4acf-ad90-fc8e709ae5cd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PartDecompositionData) data).mDecomposed;
            }

            @objid ("167f51ed-9fd2-4130-a46a-d08a8c9f4334")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PartDecompositionData) data).mDecomposed = value;
            }

            @objid ("4a2c3017-3bb1-4c72-ac64-69ce257c9ccc")
            @Override
            public SmDependency getSymetric() {
                return LifelineData.Metadata.DecomposedAsDep();
            }

        }

    }

}
