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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.statik.ComponentRealizationData;
import org.modelio.metamodel.impl.uml.statik.ComponentImpl;
import org.modelio.metamodel.uml.statik.Component;
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

@objid ("00058f48-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Component.class, factory=ComponentData.Metadata.ObjectFactory.class, cmsnode=true)
public class ComponentData extends ClassData {
    @objid ("1d78ad23-4247-4246-ab51-ca2753e518fc")
    @SmaMetaAssociation(metaName="Realization", typeDataClass=ComponentRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.RealizationSmDependency.class, component = true)
     List<SmObjectImpl> mRealization = null;

    @objid ("d33f1b54-344c-47f6-9c14-e55cf07d717d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002e8efc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bb40ebb4-68cc-4e62-9856-8729ba1aa2bf")
        private static SmClass smClass = null;

        @objid ("d6efd142-1a8b-482d-b6ef-74efa9ecdc5b")
        private static SmDependency RealizationDep = null;

        @objid ("2e6ad505-b79d-4f64-acfe-68ad5131353c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ComponentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9452114d-3958-4913-8510-eb60c2bb95a9")
        public static SmDependency RealizationDep() {
            if (RealizationDep == null) {
            	RealizationDep = classof().getDependencyDef("Realization");
            }
            return RealizationDep;
        }

        @objid ("83ccbc5d-caa3-4adf-b474-b1ffbebb80bf")
        public static SmDependency getRealizationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizationDep;
        }

        @objid ("d8d335ab-db6a-4e0d-a8e8-506f2af8f58b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002ecfb6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a2902e3e-32c7-4989-acd2-c7d76892fcb5")
            public ISmObjectData createData() {
                return new ComponentData();
            }

            @objid ("ee205fff-b7f8-4341-9e77-5a1caea28353")
            public SmObjectImpl createImpl() {
                return new ComponentImpl();
            }

        }

        @objid ("20c1eac7-3feb-44c9-b5e0-20c5f30638e1")
        public static class RealizationSmDependency extends SmMultipleDependency {
            @objid ("04b4e2cf-f99e-4cef-9e66-2655bdac901c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ComponentData)data).mRealization != null)? ((ComponentData)data).mRealization:SmMultipleDependency.EMPTY;
            }

            @objid ("b29f19f9-aa3c-4c37-afed-b22892119873")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ComponentData) data).mRealization = new ArrayList<>(initialCapacity);
                return ((ComponentData) data).mRealization;
            }

            @objid ("b7cb680b-958c-4cff-8312-c91d69b0b41b")
            @Override
            public SmDependency getSymetric() {
                return ComponentRealizationData.Metadata.AbstractionDep();
            }

        }

    }

}
