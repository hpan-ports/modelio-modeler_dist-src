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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.InterfaceData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.impl.uml.statik.InterfaceRealizationImpl;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
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

@objid ("000f6478-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InterfaceRealization.class, factory=InterfaceRealizationData.Metadata.ObjectFactory.class)
public class InterfaceRealizationData extends ModelElementData {
    @objid ("4f40d458-55ee-41f3-83d6-b75d9b6c81f4")
    @SmaMetaAssociation(metaName="Implemented", typeDataClass=InterfaceData.class, min=1, max=1, smAssociationClass=Metadata.ImplementedSmDependency.class, partof = true)
     SmObjectImpl mImplemented;

    @objid ("6562d308-9245-4c95-a247-bacd835666d3")
    @SmaMetaAssociation(metaName="Implementer", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.ImplementerSmDependency.class)
     SmObjectImpl mImplementer;

    @objid ("497eb034-b9ce-4738-aed4-199210eb08e6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ebae8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8c4a5cd5-c8f4-4c44-9505-c61607cc9f9a")
        private static SmClass smClass = null;

        @objid ("c68ef76c-0f58-402a-894a-af46a06b2088")
        private static SmDependency ImplementedDep = null;

        @objid ("52e7eefc-e585-46d5-8df9-610841157ead")
        private static SmDependency ImplementerDep = null;

        @objid ("5dc65dde-73e9-4343-89b8-a9df1e3fdec3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InterfaceRealizationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2e933bd2-f8fc-43d7-94bc-7bf41c8b6daa")
        public static SmDependency ImplementedDep() {
            if (ImplementedDep == null) {
            	ImplementedDep = classof().getDependencyDef("Implemented");
            }
            return ImplementedDep;
        }

        @objid ("312bb7ba-843a-470c-91ed-9c7c1dcd2d9d")
        public static SmDependency ImplementerDep() {
            if (ImplementerDep == null) {
            	ImplementerDep = classof().getDependencyDef("Implementer");
            }
            return ImplementerDep;
        }

        @objid ("67e8701c-3023-40e6-8f9f-b9d54e419703")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8794d6a4-97ea-4c15-a435-ce02d742f92d")
        public static SmDependency getImplementedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementedDep;
        }

        @objid ("e1268d5e-f2ce-4a92-b888-2b0a363a9cbf")
        public static SmDependency getImplementerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementerDep;
        }

        @objid ("003efb02-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("842c6b2b-bb05-4cd3-b91a-800c17063d2d")
            public ISmObjectData createData() {
                return new InterfaceRealizationData();
            }

            @objid ("1140fd13-becf-4c7b-acc5-a06d251dceaa")
            public SmObjectImpl createImpl() {
                return new InterfaceRealizationImpl();
            }

        }

        @objid ("003f5c50-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementerSmDependency extends SmSingleDependency {
            @objid ("bfe80959-9b25-4b01-b2ab-558a521d60b4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InterfaceRealizationData) data).mImplementer;
            }

            @objid ("da59d22b-d3c5-46fc-b615-feb8b2897e95")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InterfaceRealizationData) data).mImplementer = value;
            }

            @objid ("11941526-a87a-4064-a36d-79a3de902610")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.RealizedDep();
            }

        }

        @objid ("003fd00e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementedSmDependency extends SmSingleDependency {
            @objid ("aed84850-eeaf-4d2d-bacc-bb0216187a4f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InterfaceRealizationData) data).mImplemented;
            }

            @objid ("85fd4606-f665-4013-8764-30f35b1cb833")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InterfaceRealizationData) data).mImplemented = value;
            }

            @objid ("10e60695-e752-4511-a9b2-7a170127ec3f")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.ImplementedLinkDep();
            }

        }

    }

}
