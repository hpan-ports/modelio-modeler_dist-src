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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.diagrams.AbstractDiagramData;
import org.modelio.metamodel.data.uml.statik.NamespaceUseData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectData;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("0086e58e-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Element.class, factory=ElementData.Metadata.ObjectFactory.class)
public abstract class ElementData extends SmObjectData {
    @objid ("1c9f2d3e-0e3f-4423-9665-7dd2193959e8")
    @SmaMetaAssociation(metaName="DiagramElement", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.DiagramElementSmDependency.class)
     List<SmObjectImpl> mDiagramElement = null;

    @objid ("5bd36f81-0352-4d45-bcc5-706bd3d3e3a4")
    @SmaMetaAssociation(metaName="Causing", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.CausingSmDependency.class)
     List<SmObjectImpl> mCausing = null;

    @objid ("51574c37-9258-44fd-a035-148259f31dae")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000669ae-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("253cbe67-29d5-4609-9b37-11de7a535c6d")
        private static SmClass smClass = null;

        @objid ("24bdd599-5297-427d-ab0c-148f1232aa43")
        private static SmDependency DiagramElementDep = null;

        @objid ("3efca7ac-ffc0-4279-9170-abd4597e9d41")
        private static SmDependency CausingDep = null;

        @objid ("bbb13f32-ffe2-4f8d-ac04-07e5161e69e6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b26c032d-0557-470a-bfe9-9314eaf8ad4d")
        public static SmDependency DiagramElementDep() {
            if (DiagramElementDep == null) {
            	DiagramElementDep = classof().getDependencyDef("DiagramElement");
            }
            return DiagramElementDep;
        }

        @objid ("7365e125-b1f6-40f7-91f1-2353a145d576")
        public static SmDependency CausingDep() {
            if (CausingDep == null) {
            	CausingDep = classof().getDependencyDef("Causing");
            }
            return CausingDep;
        }

        @objid ("dc0c7d05-8bbd-4349-a08f-0cf43b9c5580")
        public static SmDependency getDiagramElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DiagramElementDep;
        }

        @objid ("a794a921-6960-471e-998b-34b048faa7a6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("66023f99-f304-4665-84a1-6ce6f40b4901")
        public static SmDependency getCausingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CausingDep;
        }

        @objid ("0006aa22-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("29e494cf-fa06-45cc-9bad-419e67a77091")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("d09f8d61-4592-4559-b4c7-41f926865522")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00070c6a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CausingSmDependency extends SmMultipleDependency {
            @objid ("6822db95-dcb5-4af8-ac11-d7d136e73c8e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mCausing != null)? ((ElementData)data).mCausing:SmMultipleDependency.EMPTY;
            }

            @objid ("1530ac20-675d-4f30-9276-973eeb0571b4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mCausing = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mCausing;
            }

            @objid ("f665f870-8a7c-4b38-953a-5aff00d2d0d7")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.CauseDep();
            }

        }

        @objid ("00077042-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DiagramElementSmDependency extends SmMultipleDependency {
            @objid ("deb18e25-fa8f-4c1c-b82f-15b08a9d73f5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ElementData)data).mDiagramElement != null)? ((ElementData)data).mDiagramElement:SmMultipleDependency.EMPTY;
            }

            @objid ("873be970-d934-4598-9779-af28bd69d145")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ElementData) data).mDiagramElement = new ArrayList<>(initialCapacity);
                return ((ElementData) data).mDiagramElement;
            }

            @objid ("7d55e378-87ca-4292-a26d-e3509bdf4c6c")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.RepresentedDep();
            }

        }

    }

}
