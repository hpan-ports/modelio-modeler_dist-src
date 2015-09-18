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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.CallActionImpl;
import org.modelio.metamodel.uml.behavior.activityModel.CallAction;
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

@objid ("002ac010-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CallAction.class, factory=CallActionData.Metadata.ObjectFactory.class)
public abstract class CallActionData extends ActivityActionData {
    @objid ("3b56c393-4a48-4ef6-ab4d-9b926faac501")
    @SmaMetaAttribute(metaName="IsSynchronous", type=Boolean.class, smAttributeClass=Metadata.IsSynchronousSmAttribute.class)
     Object mIsSynchronous = true;

    @objid ("315082f4-959c-4858-b458-3bcccddea41a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0080c50a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("880a087f-84ea-41bb-beb4-c14d427655e4")
        private static SmClass smClass = null;

        @objid ("4021e086-dbdd-4858-9769-ea507d704f0b")
        private static SmAttribute IsSynchronousAtt = null;

        @objid ("09da62d9-8daa-455a-ba61-c52588064e6a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("da892bf1-6849-497c-9371-ad90c0397972")
        public static SmAttribute IsSynchronousAtt() {
            if (IsSynchronousAtt == null) {
            	IsSynchronousAtt = classof().getAttributeDef("IsSynchronous");
            }
            return IsSynchronousAtt;
        }

        @objid ("2db6e8cf-4d26-471e-80f1-dc50e01e07df")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a1bfe0b6-7dcf-40f2-a6f5-9e3f8d7eb224")
        public static SmAttribute getIsSynchronousAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSynchronousAtt;
        }

        @objid ("0081063c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("aad40b5a-df3b-4512-b812-17bf1d896f08")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("03ff07ae-7f6d-4d78-b6bb-9807f484e4a2")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0081683e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSynchronousSmAttribute extends SmAttribute {
            @objid ("0eb3fcb4-2f4a-4ee7-944b-8cc47e03d472")
            public Object getValue(ISmObjectData data) {
                return ((CallActionData) data).mIsSynchronous;
            }

            @objid ("2fba628e-6341-4014-83d7-70e7832b7851")
            public void setValue(ISmObjectData data, Object value) {
                ((CallActionData) data).mIsSynchronous = value;
            }

        }

    }

}
