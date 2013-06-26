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
    @objid ("993fbecf-717a-4c2e-8984-7ad60def76a9")
    @SmaMetaAttribute(metaName="IsSynchronous", type=Boolean.class, smAttributeClass=Metadata.IsSynchronousSmAttribute.class)
     Object mIsSynchronous = true;

    @objid ("779275b9-ee7d-4a49-bb51-9fb6f9d219ff")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0080c50a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("70059232-e9a8-4a24-93c7-6de2b7535a69")
        private static SmClass smClass = null;

        @objid ("b83e8a8d-632a-45a8-96b7-01bd15af4d4a")
        private static SmAttribute IsSynchronousAtt = null;

        @objid ("21420b00-458e-4f25-a480-3a3ade63b8b8")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8a82ca8a-5a7b-4eed-9a06-69ef3394c14c")
        public static SmAttribute IsSynchronousAtt() {
            if (IsSynchronousAtt == null) {
            	IsSynchronousAtt = classof().getAttributeDef("IsSynchronous");
            }
            return IsSynchronousAtt;
        }

        @objid ("6eee7367-20e3-424d-a717-f80e1ed70b19")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7b35e013-3908-4dd6-8552-2277abb4e473")
        public static SmAttribute getIsSynchronousAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSynchronousAtt;
        }

        @objid ("0081063c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f45c150a-5d49-4ec1-9d83-1dfbe00d0275")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("456c8003-8704-4198-be92-a8db6079df59")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0081683e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSynchronousSmAttribute extends SmAttribute {
            @objid ("0cbe859d-594b-4a91-8fa0-ee83f9ee4b63")
            public Object getValue(ISmObjectData data) {
                return ((CallActionData) data).mIsSynchronous;
            }

            @objid ("1dc28a80-eae3-4f78-887e-505934f504c4")
            public void setValue(ISmObjectData data, Object value) {
                ((CallActionData) data).mIsSynchronous = value;
            }

        }

    }

}
