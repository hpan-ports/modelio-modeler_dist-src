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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.statik.FeatureImpl;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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

@objid ("000b775a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Feature.class, factory=FeatureData.Metadata.ObjectFactory.class)
public abstract class FeatureData extends ModelElementData {
    @objid ("a48a99dc-69a5-43b6-81e6-096fbb5122fe")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("46a751e8-c6f8-4815-af97-7259c043bec6")
    @SmaMetaAttribute(metaName="IsClass", type=Boolean.class, smAttributeClass=Metadata.IsClassSmAttribute.class)
     Object mIsClass = false;

    @objid ("fdec6aa5-c259-43d2-85f7-83abaef8594f")
    @SmaMetaAttribute(metaName="IsAbstract", type=Boolean.class, smAttributeClass=Metadata.IsAbstractSmAttribute.class)
     Object mIsAbstract = false;

    @objid ("6c89b786-46a1-419a-9e48-7ebc6ba648ec")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00230b68-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("29d1b9a7-4532-45ac-8972-b0dc3ba38c82")
        private static SmClass smClass = null;

        @objid ("58a25ae0-9814-474c-a92f-3c98e91355da")
        private static SmAttribute VisibilityAtt = null;

        @objid ("343c72c7-d805-4d7a-a0e3-17dfaa66d66c")
        private static SmAttribute IsClassAtt = null;

        @objid ("a2571d1a-bdad-4704-b105-d140366b7934")
        private static SmAttribute IsAbstractAtt = null;

        @objid ("ac574ee4-6c13-4f04-ae78-3072e410d24d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("27f3c7a7-ae99-42a9-b511-20b2da339b55")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("56ab0ca2-69b1-429d-a9e3-1073c76ffbe3")
        public static SmAttribute IsClassAtt() {
            if (IsClassAtt == null) {
            	IsClassAtt = classof().getAttributeDef("IsClass");
            }
            return IsClassAtt;
        }

        @objid ("b7573e31-11cc-4a62-a8f0-eda8d2725de5")
        public static SmAttribute IsAbstractAtt() {
            if (IsAbstractAtt == null) {
            	IsAbstractAtt = classof().getAttributeDef("IsAbstract");
            }
            return IsAbstractAtt;
        }

        @objid ("ad765209-5294-41a8-8ab9-69dac66f1d3d")
        public static SmAttribute getIsClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClassAtt;
        }

        @objid ("01434d94-c95f-4791-a9b3-cce15fdc57cb")
        public static SmAttribute getIsAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAbstractAtt;
        }

        @objid ("f8a9a318-e77f-434d-8d91-5723fa9ba769")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ac84c31a-9c7f-418d-8da8-240acfbc9dcb")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("00234b8c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("34759224-8e99-4abc-8387-65227f744fea")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("07193587-efed-4b4d-88fb-68a7211656f9")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0023b0fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("81e5108c-110a-430e-b024-9f89914c5aa7")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mVisibility;
            }

            @objid ("9e1e4833-5ffc-40ab-89c5-8ca2b8ac1316")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mVisibility = value;
            }

        }

        @objid ("00241206-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsClassSmAttribute extends SmAttribute {
            @objid ("a3d4c13b-289b-474e-a5ee-44d2e71f5e67")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mIsClass;
            }

            @objid ("ef4ef323-514a-42cd-b4dd-ef7b9b3ae89d")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mIsClass = value;
            }

        }

        @objid ("002471ec-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsAbstractSmAttribute extends SmAttribute {
            @objid ("6cfd229a-6508-45f8-85e2-07a04d5eeaca")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mIsAbstract;
            }

            @objid ("6972838c-92b8-4401-9634-c83e9ec0d5a4")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mIsAbstract = value;
            }

        }

    }

}
