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
package org.modelio.metamodel.data.diagrams;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.diagrams.DiagramSetData;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.impl.diagrams.AbstractDiagramImpl;
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

@objid ("00678cde-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AbstractDiagram.class, factory=AbstractDiagramData.Metadata.ObjectFactory.class)
public abstract class AbstractDiagramData extends ModelElementData {
    @objid ("1a38eca6-5990-4818-831e-38af48f07491")
    @SmaMetaAttribute(metaName="UiDataVersion", type=Integer.class, smAttributeClass=Metadata.UiDataVersionSmAttribute.class)
     Object mUiDataVersion = 0;

    @objid ("8a7f9b63-41fc-4002-a602-17a0b1c32df4")
    @SmaMetaAttribute(metaName="UiData", type=String.class, smAttributeClass=Metadata.UiDataSmAttribute.class)
     Object mUiData = "";

    @objid ("e5ad57f5-0f0c-408e-9edc-1316434d31c9")
    @SmaMetaAttribute(metaName="PdeProperties", type=String.class, smAttributeClass=Metadata.PdePropertiesSmAttribute.class)
     Object mPdeProperties = "";

    @objid ("4a4d08c0-287c-4627-9cb3-5205221dce6f")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OriginSmDependency.class, partof = true)
     SmObjectImpl mOrigin;

    @objid ("cbed1c1a-a9b7-43f1-aa09-36fda20214aa")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     List<SmObjectImpl> mRepresented = null;

    @objid ("d0a5109a-9d64-4d07-8378-d2589c87ce27")
    @SmaMetaAssociation(metaName="ReferencingSet", typeDataClass=DiagramSetData.class, min=0, max=-1, smAssociationClass=Metadata.ReferencingSetSmDependency.class)
     List<SmObjectImpl> mReferencingSet = null;

    @objid ("bb4425e3-2620-453c-ac14-c73520c997f6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000913f2-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f07af0cf-6efc-4d21-b3c2-bd2102ffcac8")
        private static SmClass smClass = null;

        @objid ("635315e5-aa2f-4d1b-b327-ce2b770f0e53")
        private static SmAttribute UiDataVersionAtt = null;

        @objid ("ee2bb002-4b6e-48f3-a6b5-5ca6843dc9ca")
        private static SmAttribute UiDataAtt = null;

        @objid ("4fd96c42-900e-444b-b401-f9d69b764945")
        private static SmAttribute PdePropertiesAtt = null;

        @objid ("4023d842-e5a1-403c-b418-f8be4ccfe550")
        private static SmDependency OriginDep = null;

        @objid ("6a7a5e33-3f34-441a-8087-11f4d35cd6fe")
        private static SmDependency RepresentedDep = null;

        @objid ("ae2dd9b0-8af8-4e8a-a947-2debccc4952d")
        private static SmDependency ReferencingSetDep = null;

        @objid ("72b26bda-bf85-4c45-84f4-083472f9a26c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AbstractDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5b3d6557-7f69-4f04-9c3a-bd1cc4f1e3ed")
        public static SmAttribute UiDataVersionAtt() {
            if (UiDataVersionAtt == null) {
            	UiDataVersionAtt = classof().getAttributeDef("UiDataVersion");
            }
            return UiDataVersionAtt;
        }

        @objid ("3f1fa136-bbff-4ecf-a587-70de604579a5")
        public static SmAttribute UiDataAtt() {
            if (UiDataAtt == null) {
            	UiDataAtt = classof().getAttributeDef("UiData");
            }
            return UiDataAtt;
        }

        @objid ("03eff5be-b28f-4ca2-88ef-806ea4f3b8de")
        public static SmAttribute PdePropertiesAtt() {
            if (PdePropertiesAtt == null) {
            	PdePropertiesAtt = classof().getAttributeDef("PdeProperties");
            }
            return PdePropertiesAtt;
        }

        @objid ("0e342732-63d3-4cde-9087-2f66519b933e")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("49e92954-7f17-4ba9-bf6f-38f14253aa2c")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("5306944a-1b1f-4db6-8b82-bc6a35c5cb39")
        public static SmDependency ReferencingSetDep() {
            if (ReferencingSetDep == null) {
            	ReferencingSetDep = classof().getDependencyDef("ReferencingSet");
            }
            return ReferencingSetDep;
        }

        @objid ("d335a870-f029-475e-b62e-2910f44aba91")
        public static SmDependency getReferencingSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencingSetDep;
        }

        @objid ("97257023-4e09-4ace-8bb1-327b5e770da6")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("6d39804a-3b3e-4433-958c-480e8d056109")
        public static SmAttribute getPdePropertiesAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PdePropertiesAtt;
        }

        @objid ("7529c731-7cdf-4c36-b694-469b04799dc0")
        public static SmAttribute getUiDataAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UiDataAtt;
        }

        @objid ("58085cbd-bed3-4692-ba6f-08da817d446f")
        public static SmAttribute getUiDataVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UiDataVersionAtt;
        }

        @objid ("e3c61328-4598-4110-955b-fb11b5e11cf8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("32f3de74-966b-437d-8927-304ed3dec6ca")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("000952d6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("431a949a-2c07-4206-b147-fc472497fd6c")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("2ab74e62-8552-4dd9-a17b-123e13a81212")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0009b280-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UiDataSmAttribute extends SmAttribute {
            @objid ("ff75cf8e-3de1-4d19-8a27-3450f78b80c2")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mUiData;
            }

            @objid ("158d2834-2250-4d69-8b7e-0740875b355d")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mUiData = value;
            }

        }

        @objid ("000a11e4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class PdePropertiesSmAttribute extends SmAttribute {
            @objid ("3a0abd00-5898-49aa-b2fe-9c7ff35754d1")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mPdeProperties;
            }

            @objid ("e8cf086c-63fb-417d-8504-f0673310399f")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mPdeProperties = value;
            }

        }

        @objid ("000a740e-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmMultipleDependency {
            @objid ("52a150ce-53ce-4abf-a007-69eb26f71299")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AbstractDiagramData)data).mRepresented != null)? ((AbstractDiagramData)data).mRepresented:SmMultipleDependency.EMPTY;
            }

            @objid ("64138aba-591d-433c-b497-b28a32f4c41a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AbstractDiagramData) data).mRepresented = new ArrayList<>(initialCapacity);
                return ((AbstractDiagramData) data).mRepresented;
            }

            @objid ("bc4aa89e-05f4-4d25-88b1-57b89dbf6e5f")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.DiagramElementDep();
            }

        }

        @objid ("000ad5b6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("933ff8b4-f244-4714-b2ad-069f8dbfda0f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mOrigin;
            }

            @objid ("93886b9c-59ec-4bab-8383-557b547ea6f0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AbstractDiagramData) data).mOrigin = value;
            }

            @objid ("5766e1c3-71b6-4e88-aa6e-14c25b83a4d8")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ProductDep();
            }

        }

        @objid ("000bbfd0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ReferencingSetSmDependency extends SmMultipleDependency {
            @objid ("837cc4ec-6e59-4b0f-86aa-cd2849e61a55")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AbstractDiagramData)data).mReferencingSet != null)? ((AbstractDiagramData)data).mReferencingSet:SmMultipleDependency.EMPTY;
            }

            @objid ("789e717d-656b-4380-ba64-52d0e03c069a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AbstractDiagramData) data).mReferencingSet = new ArrayList<>(initialCapacity);
                return ((AbstractDiagramData) data).mReferencingSet;
            }

            @objid ("b9c3f061-ca85-432b-a4fc-14a7cc5aa574")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.ReferencedDiagramDep();
            }

        }

        @objid ("e9904bc6-c5d6-4d5e-ab2a-92df477da72e")
        public static class UiDataVersionSmAttribute extends SmAttribute {
            @objid ("fdb63159-0270-4ad6-a534-a911a1911de2")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mUiDataVersion;
            }

            @objid ("7e175a5d-3c54-4934-8164-dd185215cd7c")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mUiDataVersion = value;
            }

        }

    }

}
