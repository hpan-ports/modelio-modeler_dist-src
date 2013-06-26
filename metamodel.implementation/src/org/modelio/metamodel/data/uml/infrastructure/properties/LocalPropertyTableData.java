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
package org.modelio.metamodel.data.uml.infrastructure.properties;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.LocalPropertyTableImpl;
import org.modelio.metamodel.uml.infrastructure.properties.LocalPropertyTable;
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

@objid ("006d9110-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=LocalPropertyTable.class, factory=LocalPropertyTableData.Metadata.ObjectFactory.class, cmsnode=true)
public class LocalPropertyTableData extends PropertyTableData {
    @objid ("376efd46-20db-482e-8a76-80e5855f283e")
    @SmaMetaAssociation(metaName="LocalAnnoted", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.LocalAnnotedSmDependency.class, partof = true)
     SmObjectImpl mLocalAnnoted;

    @objid ("40afffb9-03a3-42bb-be5b-2dc3c51a40da")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0069776a-ec97-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("ca77e298-7c61-4968-b799-2f99ef979793")
        private static SmClass smClass = null;

        @objid ("b111f047-d8b8-41ab-a6e1-802cf7093742")
        private static SmDependency LocalAnnotedDep = null;

        @objid ("9b081366-cffd-4135-b0fc-ba4036b3d212")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LocalPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cd431fca-b68d-4095-8ce6-7790bf8dc3f6")
        public static SmDependency LocalAnnotedDep() {
            if (LocalAnnotedDep == null) {
            	LocalAnnotedDep = classof().getDependencyDef("LocalAnnoted");
            }
            return LocalAnnotedDep;
        }

        @objid ("bcdc1404-3ee3-4715-b269-9315c9d35430")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b5deb6b8-fc7b-48f7-8293-33c2f01f1c21")
        public static SmDependency getLocalAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalAnnotedDep;
        }

        @objid ("006a0202-ec97-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9622cc16-a75c-41ad-837b-ab806df6ae57")
            public ISmObjectData createData() {
                return new LocalPropertyTableData();
            }

            @objid ("2d81d3a5-06cb-46ef-a63f-ce0732f777dc")
            public SmObjectImpl createImpl() {
                return new LocalPropertyTableImpl();
            }

        }

        @objid ("006af61c-ec97-1098-b22e-001ec947cd2a")
        public static class LocalAnnotedSmDependency extends SmSingleDependency {
            @objid ("d49947f6-246f-4261-8a16-a78e525c55e1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LocalPropertyTableData) data).mLocalAnnoted;
            }

            @objid ("8603fc16-c513-464b-ba16-97ce55a5d9f3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LocalPropertyTableData) data).mLocalAnnoted = value;
            }

            @objid ("d631197e-0ccc-44e8-aeca-989708a43254")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.LocalPropertiesDep();
            }

        }

    }

}
