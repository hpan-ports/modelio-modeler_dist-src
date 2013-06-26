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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.data.analyst.BusinessRuleContainerData;
import org.modelio.metamodel.impl.analyst.BusinessRuleImpl;
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

@objid ("4da7b9f3-596c-4989-b28e-a35e40d48073")
@SmaMetaClass(mmClass=BusinessRule.class, factory=BusinessRuleData.Metadata.ObjectFactory.class)
public class BusinessRuleData extends AnalystElementData {
    @objid ("ea0c2d0d-b952-41c7-83ee-e25b25cc87f8")
    @SmaMetaAssociation(metaName="SubRule", typeDataClass=BusinessRuleData.class, min=0, max=-1, smAssociationClass=Metadata.SubRuleSmDependency.class, component = true)
     List<SmObjectImpl> mSubRule = null;

    @objid ("bc09e4b7-06b5-42ef-a97e-4519bd29ecbf")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=BusinessRuleContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("b8c16d4f-c878-4c68-b7ec-c9fc406d3d80")
    @SmaMetaAssociation(metaName="ParentRule", typeDataClass=BusinessRuleData.class, min=0, max=1, smAssociationClass=Metadata.ParentRuleSmDependency.class)
     SmObjectImpl mParentRule;

    @objid ("9a96882d-5c0f-4183-b15e-c77236761edc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("785300db-57ee-4e9e-8380-59b5550f902c")
    public static class Metadata {
        @objid ("b3870450-de00-4e6c-8606-2e292758fd42")
        private static SmClass smClass = null;

        @objid ("79546bd3-35cc-47cb-a6eb-ee7b86752af5")
        private static SmDependency SubRuleDep = null;

        @objid ("471be905-98df-41b6-a43e-96b87527f91f")
        private static SmDependency OwnerContainerDep = null;

        @objid ("4be87f3f-dd5d-459a-b917-3c0ba0650696")
        private static SmDependency ParentRuleDep = null;

        @objid ("d50b47fc-02e2-4116-8919-8caab1773c88")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BusinessRuleData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f4f0a751-dbbd-47dd-b616-95b7e597ed1d")
        public static SmDependency SubRuleDep() {
            if (SubRuleDep == null) {
            	SubRuleDep = classof().getDependencyDef("SubRule");
            }
            return SubRuleDep;
        }

        @objid ("f1b0946c-1af2-4d08-a1b1-1dfafe0c7b1d")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("b4360df7-a4c1-4902-a579-4a9478506ec6")
        public static SmDependency ParentRuleDep() {
            if (ParentRuleDep == null) {
            	ParentRuleDep = classof().getDependencyDef("ParentRule");
            }
            return ParentRuleDep;
        }

        @objid ("d58bea35-5a0c-411b-a6ae-9ce421bd6cf7")
        public static SmDependency getParentRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentRuleDep;
        }

        @objid ("cab4eb97-6128-48d4-bb08-541a059b0db4")
        public static SmDependency getSubRuleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubRuleDep;
        }

        @objid ("9dde2d61-1a92-4182-b055-15d65ad37af9")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("6ebc6e32-1c45-4761-924e-be3074215e99")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("89f134e8-1104-4a8f-8f98-c2c2fc658691")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8fa10f0f-b819-48da-907b-36b128d09f47")
            public ISmObjectData createData() {
                return new BusinessRuleData();
            }

            @objid ("64d3b693-f9b5-4e25-8b42-6782e37e78a8")
            public SmObjectImpl createImpl() {
                return new BusinessRuleImpl();
            }

        }

        @objid ("415085fe-8305-48ba-823b-cfe61e2be578")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("3ee8f743-e2f0-422f-af95-e6f29bdba5d0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mOwnerContainer;
            }

            @objid ("5bd8ff5d-5160-4312-917d-af18622920f2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mOwnerContainer = value;
            }

            @objid ("cb90ddf5-34f5-4c5c-b586-543b07a8f5f2")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleContainerData.Metadata.OwnedRuleDep();
            }

        }

        @objid ("3405a99c-020c-4223-8372-bc73f519d55a")
        public static class ParentRuleSmDependency extends SmSingleDependency {
            @objid ("18beb2fd-0dbd-4f81-99aa-579b8c83abe1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BusinessRuleData) data).mParentRule;
            }

            @objid ("63a676dc-fcf3-4d2c-94f5-e12d3bce817c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BusinessRuleData) data).mParentRule = value;
            }

            @objid ("688a4d5c-4a7f-4729-b85b-796a8d0b46d1")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.SubRuleDep();
            }

        }

        @objid ("8e4029b8-e2ad-418a-90b7-315612b06ca9")
        public static class SubRuleSmDependency extends SmMultipleDependency {
            @objid ("39d46fa3-cf00-4c58-b070-5c50d2f15ca4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BusinessRuleData)data).mSubRule != null)? ((BusinessRuleData)data).mSubRule:SmMultipleDependency.EMPTY;
            }

            @objid ("2df53f29-c2f2-42b2-ae6d-f3952ed42858")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BusinessRuleData) data).mSubRule = new ArrayList<>(initialCapacity);
                return ((BusinessRuleData) data).mSubRule;
            }

            @objid ("bb996948-09a6-47a5-984f-6e7903f2ee0e")
            @Override
            public SmDependency getSymetric() {
                return BusinessRuleData.Metadata.ParentRuleDep();
            }

        }

    }

}
