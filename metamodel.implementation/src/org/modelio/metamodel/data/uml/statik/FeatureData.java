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
    @objid ("8d2f029e-07a6-46a6-8951-68dfb2787c48")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("3f518e29-681f-4a7e-aee8-9f57a5e7f16e")
    @SmaMetaAttribute(metaName="IsClass", type=Boolean.class, smAttributeClass=Metadata.IsClassSmAttribute.class)
     Object mIsClass = false;

    @objid ("8abe2494-c580-479c-91cd-6d0aace31c2f")
    @SmaMetaAttribute(metaName="IsAbstract", type=Boolean.class, smAttributeClass=Metadata.IsAbstractSmAttribute.class)
     Object mIsAbstract = false;

    @objid ("6545646c-d7a9-40b1-a46a-2dc1dd7827e5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00230b68-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c5955a67-432e-4e69-9b17-4e4305b94ef8")
        private static SmClass smClass = null;

        @objid ("5c5c7b30-7d30-461f-a30d-378afdc67731")
        private static SmAttribute VisibilityAtt = null;

        @objid ("a1851d4b-7f9b-4d7d-9618-f39daabc8933")
        private static SmAttribute IsClassAtt = null;

        @objid ("8617aec9-8798-45d3-8f8a-cd4576a7ae5b")
        private static SmAttribute IsAbstractAtt = null;

        @objid ("9d92a728-326d-4451-ba20-4167a2e72337")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b323c4d1-44dd-4670-a08e-15f0826d4be8")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("771b35e8-54ad-4911-bc51-86d414e59fb0")
        public static SmAttribute IsClassAtt() {
            if (IsClassAtt == null) {
            	IsClassAtt = classof().getAttributeDef("IsClass");
            }
            return IsClassAtt;
        }

        @objid ("1307318c-8848-4f7c-ac61-0f5dbd44f7cd")
        public static SmAttribute IsAbstractAtt() {
            if (IsAbstractAtt == null) {
            	IsAbstractAtt = classof().getAttributeDef("IsAbstract");
            }
            return IsAbstractAtt;
        }

        @objid ("4f553774-21f0-4590-8e52-b1b24512f9b7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c8c8e9bb-3e8e-4608-aff9-2455e58b68fc")
        public static SmAttribute getIsAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAbstractAtt;
        }

        @objid ("0a1ecf09-7eba-4f13-b6c0-8fbc37f2151e")
        public static SmAttribute getIsClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClassAtt;
        }

        @objid ("032e7cfa-5670-46de-a244-876ec8cb0c39")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("00234b8c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("02623bb0-3ff7-4ff7-b9ac-e43eef5b5374")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("8eb20ed4-6b78-4e50-be53-b5a47ec67169")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0023b0fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("5f1bcfa3-a3e5-46b2-a720-fe2790cc49e0")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mVisibility;
            }

            @objid ("f985a4f7-b391-44e7-8945-4a8d9702e93f")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mVisibility = value;
            }

        }

        @objid ("00241206-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsClassSmAttribute extends SmAttribute {
            @objid ("b9ede04e-db15-4acc-b41a-ac669bfefe63")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mIsClass;
            }

            @objid ("25d215c4-7da1-4f74-b535-31f0441f4496")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mIsClass = value;
            }

        }

        @objid ("002471ec-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsAbstractSmAttribute extends SmAttribute {
            @objid ("42ea8f11-ed27-4f01-95dd-e1bf3b7786c4")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mIsAbstract;
            }

            @objid ("b9f2d65e-fd63-4693-825f-91b9d32c96c2")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mIsAbstract = value;
            }

        }

    }

}
