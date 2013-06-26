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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBehaviorData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
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

@objid ("007b00b6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnRootElement.class, factory=BpmnRootElementData.Metadata.ObjectFactory.class)
public abstract class BpmnRootElementData extends BpmnBaseElementData {
    @objid ("50589d0e-0462-4e01-995d-d663a5a8efec")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=BpmnBehaviorData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("f390755b-1752-409e-8b28-3ed012bdbd26")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001b9b6c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a6d107af-335c-4063-8a82-e638bb2449e0")
        private static SmClass smClass = null;

        @objid ("83bb1e7b-0012-46dc-8cfa-a6b0036f2fb8")
        private static SmDependency OwnerDep = null;

        @objid ("7adede2c-c1a7-4142-920c-2188a55a04a3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnRootElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("39766325-fa05-4535-b7e3-d74a25215786")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("46a4b76f-902d-484a-9328-11409317349c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("21819786-2ad3-45bd-bc7d-d4a19422c864")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("001be7c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("849205f8-6275-42d7-b3c9-1ab062bcbb4f")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("84635619-664e-49ed-b604-e9252ef55409")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("001c4f26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("45d7e9fd-2566-4d96-818f-d62ab90e09f7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnRootElementData) data).mOwner;
            }

            @objid ("1b8ffb0b-d744-43a3-85a3-c8c9dc0ee61d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnRootElementData) data).mOwner = value;
            }

            @objid ("40d5e164-b390-4f40-95c2-5522098c64c2")
            @Override
            public SmDependency getSymetric() {
                return BpmnBehaviorData.Metadata.RootElementDep();
            }

        }

    }

}
