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
    @objid ("89b19a9c-ca48-4707-a616-8151636b573c")
    @SmaMetaAttribute(metaName="IsSynchronous", type=Boolean.class, smAttributeClass=Metadata.IsSynchronousSmAttribute.class)
     Object mIsSynchronous = true;

    @objid ("bd088e2f-23f6-454d-88ba-81640e1fbb5d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0080c50a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("11546ca9-fbf4-40ba-821d-01aee0ae295e")
        private static SmClass smClass = null;

        @objid ("cff22058-c3e4-4a14-b152-44c30bd1e8b0")
        private static SmAttribute IsSynchronousAtt = null;

        @objid ("e37d9c9c-57a1-45d7-a061-bb976457e71a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CallActionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bc2c03ae-4609-45d1-915e-3e4431bfbf8f")
        public static SmAttribute IsSynchronousAtt() {
            if (IsSynchronousAtt == null) {
            	IsSynchronousAtt = classof().getAttributeDef("IsSynchronous");
            }
            return IsSynchronousAtt;
        }

        @objid ("8fc49a12-df4c-47ce-8e6e-8715a4eaba0b")
        public static SmAttribute getIsSynchronousAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSynchronousAtt;
        }

        @objid ("86b2a41b-9596-4980-bf70-605403095b4f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0081063c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d8204ca0-e556-4d87-8e3a-56035c78bc1e")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("c2c651e1-089b-409a-b52b-cc830a9bf1e5")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0081683e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSynchronousSmAttribute extends SmAttribute {
            @objid ("fec2425e-1dd8-467a-9dd7-8e9df8899fb6")
            public Object getValue(ISmObjectData data) {
                return ((CallActionData) data).mIsSynchronous;
            }

            @objid ("765344cc-4bf4-4ae6-b4b4-5a9f35f8a7fa")
            public void setValue(ISmObjectData data, Object value) {
                ((CallActionData) data).mIsSynchronous = value;
            }

        }

    }

}
