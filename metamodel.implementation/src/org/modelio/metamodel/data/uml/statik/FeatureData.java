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
    @objid ("b0443063-63f2-4a90-ac19-99e7e919ce49")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("217fe7b0-9f13-4c9c-825b-3a5f8a8808cf")
    @SmaMetaAttribute(metaName="IsClass", type=Boolean.class, smAttributeClass=Metadata.IsClassSmAttribute.class)
     Object mIsClass = false;

    @objid ("e5581681-d1ec-4de4-adb7-43838c17ba69")
    @SmaMetaAttribute(metaName="IsAbstract", type=Boolean.class, smAttributeClass=Metadata.IsAbstractSmAttribute.class)
     Object mIsAbstract = false;

    @objid ("91ead244-a4a5-4e18-ba7a-dc26a7a87743")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00230b68-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("dc9ed288-d276-4144-8f7f-d036ccc82cd6")
        private static SmClass smClass = null;

        @objid ("6ffed4fd-9cbc-4d58-9827-787839469878")
        private static SmAttribute VisibilityAtt = null;

        @objid ("cd673e09-340d-4720-84a6-97c92b7cd02a")
        private static SmAttribute IsClassAtt = null;

        @objid ("124b5afc-0f25-41d7-be7f-65dfdfb7ae80")
        private static SmAttribute IsAbstractAtt = null;

        @objid ("44d18e93-4b2e-470f-a59e-57ebe0798427")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(FeatureData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("792052ca-bae5-4e63-98de-8c2090148653")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("ba9b636f-e749-4eb8-8abd-698980b83c86")
        public static SmAttribute IsClassAtt() {
            if (IsClassAtt == null) {
            	IsClassAtt = classof().getAttributeDef("IsClass");
            }
            return IsClassAtt;
        }

        @objid ("cfa2219a-2b98-443f-a538-19a62b87f31c")
        public static SmAttribute IsAbstractAtt() {
            if (IsAbstractAtt == null) {
            	IsAbstractAtt = classof().getAttributeDef("IsAbstract");
            }
            return IsAbstractAtt;
        }

        @objid ("69eff208-1954-4998-87b7-406825f74bf9")
        public static SmAttribute getIsClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClassAtt;
        }

        @objid ("683b29d9-bab6-41d9-9941-49b9588a932c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("33456232-138f-42ad-9972-8fa886752ff9")
        public static SmAttribute getIsAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAbstractAtt;
        }

        @objid ("28ae7c60-5aeb-4264-91ca-33ab4ad6dd85")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("00234b8c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("96bbf690-4262-4249-afb1-5f6d8bb588f1")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("96ea70ae-2ba3-4d72-8045-133ce333133f")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0023b0fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("eed631d9-4239-4dce-abb1-7e8c64b4edc5")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mVisibility;
            }

            @objid ("259300a9-4b48-4f3f-975d-e6ae36787abe")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mVisibility = value;
            }

        }

        @objid ("00241206-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsClassSmAttribute extends SmAttribute {
            @objid ("46434431-bf66-4373-bd8b-be9d91c1c043")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mIsClass;
            }

            @objid ("7f6b8d9c-ba27-40c6-8b17-f3dc8ab09067")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mIsClass = value;
            }

        }

        @objid ("002471ec-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsAbstractSmAttribute extends SmAttribute {
            @objid ("062d8dec-2e8e-4663-8fd7-c7692e9f152d")
            public Object getValue(ISmObjectData data) {
                return ((FeatureData) data).mIsAbstract;
            }

            @objid ("c8692e7b-9345-40ca-95d9-314d3cda0ccb")
            public void setValue(ISmObjectData data, Object value) {
                ((FeatureData) data).mIsAbstract = value;
            }

        }

    }

}
