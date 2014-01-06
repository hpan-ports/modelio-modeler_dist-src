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
    @objid ("c9b0dcc7-8eb7-44ae-b0e1-b78106fe62d7")
    @SmaMetaAttribute(metaName="IsCombineDuplicate", type=Boolean.class, smAttributeClass=Metadata.IsCombineDuplicateSmAttribute.class)
     Object mIsCombineDuplicate = true;

    @objid ("24538f4d-348a-4a5e-b325-cb9d78c0e700")
    @SmaMetaAttribute(metaName="JoinSpec", type=String.class, smAttributeClass=Metadata.JoinSpecSmAttribute.class)
     Object mJoinSpec = "and";

    @objid ("1bc19c5b-12f5-41d2-a9d5-ba01da872451")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004db002-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1c5bb0cd-df73-469c-bc92-173ca5ed279c")
        private static SmClass smClass = null;

        @objid ("6dee731b-3165-43a0-bf7d-0331987003cb")
        private static SmAttribute IsCombineDuplicateAtt = null;

        @objid ("cfa19316-024a-4655-bf37-ec4361d32c4e")
        private static SmAttribute JoinSpecAtt = null;

        @objid ("623efa1b-6a0c-4860-8af2-626b3f180c91")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ForkJoinNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("04a3e042-7b27-48a7-9956-b96abc7c430a")
        public static SmAttribute IsCombineDuplicateAtt() {
            if (IsCombineDuplicateAtt == null) {
            	IsCombineDuplicateAtt = classof().getAttributeDef("IsCombineDuplicate");
            }
            return IsCombineDuplicateAtt;
        }

        @objid ("cec00c65-2f19-4c07-940d-7214bb60d26a")
        public static SmAttribute JoinSpecAtt() {
            if (JoinSpecAtt == null) {
            	JoinSpecAtt = classof().getAttributeDef("JoinSpec");
            }
            return JoinSpecAtt;
        }

        @objid ("57901f45-7b44-4531-9f51-11524cd45dcb")
        public static SmAttribute getJoinSpecAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JoinSpecAtt;
        }

        @objid ("093b4a72-f157-42ca-abf5-5f6f8bd88e5c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("52a5dfd0-50ff-4422-a066-f66f8a59f6f8")
        public static SmAttribute getIsCombineDuplicateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCombineDuplicateAtt;
        }

        @objid ("004df1b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("37315b4c-968b-4b8e-a04d-0eba763d4c25")
            public ISmObjectData createData() {
                return new ForkJoinNodeData();
            }

            @objid ("c7005180-fc1d-4be4-b55a-750fff12089f")
            public SmObjectImpl createImpl() {
                return new ForkJoinNodeImpl();
            }

        }

        @objid ("004e5a70-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsCombineDuplicateSmAttribute extends SmAttribute {
            @objid ("23572a77-d7b5-45e4-96d3-d9e73fe59919")
            public Object getValue(ISmObjectData data) {
                return ((ForkJoinNodeData) data).mIsCombineDuplicate;
            }

            @objid ("86fe98d5-cf5e-492c-b1df-73a52fbc3875")
            public void setValue(ISmObjectData data, Object value) {
                ((ForkJoinNodeData) data).mIsCombineDuplicate = value;
            }

        }

        @objid ("004ebd44-c4c2-1fd8-97fe-001ec947cd2a")
        public static class JoinSpecSmAttribute extends SmAttribute {
            @objid ("30a33d4b-f1e2-4691-ae24-1b1749c33dfd")
            public Object getValue(ISmObjectData data) {
                return ((ForkJoinNodeData) data).mJoinSpec;
            }

            @objid ("bed62482-98be-4604-98cc-1265ff1cbe40")
            public void setValue(ISmObjectData data, Object value) {
                ((ForkJoinNodeData) data).mJoinSpec = value;
            }

        }

    }

}
