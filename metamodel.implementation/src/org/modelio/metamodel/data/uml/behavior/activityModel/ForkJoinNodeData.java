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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ForkJoinNodeImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
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

@objid ("00341f8e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ForkJoinNode.class, factory=ForkJoinNodeData.Metadata.ObjectFactory.class)
public class ForkJoinNodeData extends ControlNodeData {
    @objid ("9025d91b-f125-46c9-a398-fc2d351c678d")
    @SmaMetaAttribute(metaName="IsCombineDuplicate", type=Boolean.class, smAttributeClass=Metadata.IsCombineDuplicateSmAttribute.class)
     Object mIsCombineDuplicate = true;

    @objid ("93c36812-94f8-46d7-8ea2-3dad497597ec")
    @SmaMetaAttribute(metaName="JoinSpec", type=String.class, smAttributeClass=Metadata.JoinSpecSmAttribute.class)
     Object mJoinSpec = "and";

    @objid ("ffe08e1b-42f4-439a-937f-e97c5f9a7e0b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004db002-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("29527abc-8048-4eaa-9e2d-2fef60058bba")
        private static SmClass smClass = null;

        @objid ("137d5821-fb8d-42aa-87c4-617d5d1faf55")
        private static SmAttribute IsCombineDuplicateAtt = null;

        @objid ("06964a05-10ff-4467-8adb-bfc0a78de0e3")
        private static SmAttribute JoinSpecAtt = null;

        @objid ("21ca023f-bd45-4052-aa7d-6a5aa76bd0ae")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ForkJoinNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8ac8d3d9-2218-4231-8d53-6ab26cbf9423")
        public static SmAttribute IsCombineDuplicateAtt() {
            if (IsCombineDuplicateAtt == null) {
            	IsCombineDuplicateAtt = classof().getAttributeDef("IsCombineDuplicate");
            }
            return IsCombineDuplicateAtt;
        }

        @objid ("44f9ab20-9b4e-4699-a441-e246d4c51dc1")
        public static SmAttribute JoinSpecAtt() {
            if (JoinSpecAtt == null) {
            	JoinSpecAtt = classof().getAttributeDef("JoinSpec");
            }
            return JoinSpecAtt;
        }

        @objid ("05116c40-04e7-43ea-b4a2-87c6bc65cf4d")
        public static SmAttribute getIsCombineDuplicateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCombineDuplicateAtt;
        }

        @objid ("9511d111-6267-45d2-998b-2f50b3d9bccd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3b462d48-8909-49a1-9a3e-690325a9c510")
        public static SmAttribute getJoinSpecAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JoinSpecAtt;
        }

        @objid ("004df1b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9d4ee9cb-860c-4eab-a426-fd536f189673")
            public ISmObjectData createData() {
                return new ForkJoinNodeData();
            }

            @objid ("5a9455a9-f091-4734-953d-5e9fff0ce828")
            public SmObjectImpl createImpl() {
                return new ForkJoinNodeImpl();
            }

        }

        @objid ("004e5a70-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsCombineDuplicateSmAttribute extends SmAttribute {
            @objid ("23f777e4-be07-47fe-b3a5-71232f0718e9")
            public Object getValue(ISmObjectData data) {
                return ((ForkJoinNodeData) data).mIsCombineDuplicate;
            }

            @objid ("b590ab52-66a0-4d34-b554-cdcf5ef3ff6e")
            public void setValue(ISmObjectData data, Object value) {
                ((ForkJoinNodeData) data).mIsCombineDuplicate = value;
            }

        }

        @objid ("004ebd44-c4c2-1fd8-97fe-001ec947cd2a")
        public static class JoinSpecSmAttribute extends SmAttribute {
            @objid ("2d0d024e-96ae-4c9c-8fde-5bb01135fe57")
            public Object getValue(ISmObjectData data) {
                return ((ForkJoinNodeData) data).mJoinSpec;
            }

            @objid ("b72c4a20-2dc2-4b1c-aeb8-31c86c8d5a2c")
            public void setValue(ISmObjectData data, Object value) {
                ((ForkJoinNodeData) data).mJoinSpec = value;
            }

        }

    }

}
