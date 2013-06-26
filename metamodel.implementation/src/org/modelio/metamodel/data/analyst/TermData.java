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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.data.analyst.DictionaryData;
import org.modelio.metamodel.impl.analyst.TermImpl;
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

@objid ("0062a7fa-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Term.class, factory=TermData.Metadata.ObjectFactory.class)
public class TermData extends AnalystElementData {
    @objid ("d40d19f0-e6b7-4054-9b37-6d91b0f1840e")
    @SmaMetaAssociation(metaName="OwnerDictionary", typeDataClass=DictionaryData.class, min=0, max=1, smAssociationClass=Metadata.OwnerDictionarySmDependency.class)
     SmObjectImpl mOwnerDictionary;

    @objid ("8690b5f3-64c8-4cf4-b8f8-73e28effc70a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078ee66-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6f0262de-7e47-48f0-ba03-d5e9c214c943")
        private static SmClass smClass = null;

        @objid ("67a715a8-a108-4cfe-b428-723361287a17")
        private static SmDependency OwnerDictionaryDep = null;

        @objid ("8bdd4876-146b-4439-bb47-a92dcfb9cfc2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TermData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("99744fbd-0d34-463c-8f51-efaf53ae8b87")
        public static SmDependency OwnerDictionaryDep() {
            if (OwnerDictionaryDep == null) {
            	OwnerDictionaryDep = classof().getDependencyDef("OwnerDictionary");
            }
            return OwnerDictionaryDep;
        }

        @objid ("8cefe31e-aa12-4990-8cad-9f9cea9041b7")
        public static SmDependency getOwnerDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDictionaryDep;
        }

        @objid ("27c02166-790e-4576-9a6a-375fbf0868b3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00792ef8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8f52e9d7-5cc9-4300-88be-2d7f261c28a6")
            public ISmObjectData createData() {
                return new TermData();
            }

            @objid ("f604cc74-bec2-4a18-9de6-03c71efa024d")
            public SmObjectImpl createImpl() {
                return new TermImpl();
            }

        }

        @objid ("18a5e5d5-88af-42b2-bba3-87f60b5b8886")
        public static class OwnerDictionarySmDependency extends SmSingleDependency {
            @objid ("a4c2350c-df59-4eac-8fff-d95520a8eb56")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TermData) data).mOwnerDictionary;
            }

            @objid ("99a187db-965f-4b86-bb71-79d945d28e5b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TermData) data).mOwnerDictionary = value;
            }

            @objid ("af0c8ad3-3727-4d0f-938b-a3be1ace5cb6")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnedTermDep();
            }

        }

    }

}
