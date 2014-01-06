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
    @objid ("28fea689-5a20-4049-9c38-341acc93efbd")
    @SmaMetaAssociation(metaName="LocalAnnoted", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.LocalAnnotedSmDependency.class, partof = true)
     SmObjectImpl mLocalAnnoted;

    @objid ("02deee26-1b60-4568-b162-5dc92eceece5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0069776a-ec97-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("f3464cb1-030f-46ae-9537-6a281e72b86b")
        private static SmClass smClass = null;

        @objid ("8b489860-08bf-4998-a49c-83b31b9203d5")
        private static SmDependency LocalAnnotedDep = null;

        @objid ("e41d4a01-4323-46e6-818b-292a28d5145e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LocalPropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cce61a2a-e1f0-4371-b67e-4ef309d6f49b")
        public static SmDependency LocalAnnotedDep() {
            if (LocalAnnotedDep == null) {
            	LocalAnnotedDep = classof().getDependencyDef("LocalAnnoted");
            }
            return LocalAnnotedDep;
        }

        @objid ("32980f1d-ab56-4976-bf61-74360979f4c7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8102beaa-c930-4794-a769-79dc0d944676")
        public static SmDependency getLocalAnnotedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalAnnotedDep;
        }

        @objid ("006a0202-ec97-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("90b7a59e-f14e-4581-b94e-c8586b61e59c")
            public ISmObjectData createData() {
                return new LocalPropertyTableData();
            }

            @objid ("daee2695-7bf3-4487-aa46-2e8c95cdc364")
            public SmObjectImpl createImpl() {
                return new LocalPropertyTableImpl();
            }

        }

        @objid ("006af61c-ec97-1098-b22e-001ec947cd2a")
        public static class LocalAnnotedSmDependency extends SmSingleDependency {
            @objid ("2ce97838-cfd9-436a-ab6b-54fde507ccea")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LocalPropertyTableData) data).mLocalAnnoted;
            }

            @objid ("31d5369b-a1de-4042-82ce-95579d389b2f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LocalPropertyTableData) data).mLocalAnnoted = value;
            }

            @objid ("42c57cb4-e0e5-4231-bf91-9ec0ed78dd42")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.LocalPropertiesDep();
            }

        }

    }

}
