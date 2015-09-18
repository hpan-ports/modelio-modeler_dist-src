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
    @objid ("01746e0c-0251-4492-89f3-b3a8f89dbea3")
    @SmaMetaAttribute(metaName="IsCombineDuplicate", type=Boolean.class, smAttributeClass=Metadata.IsCombineDuplicateSmAttribute.class)
     Object mIsCombineDuplicate = true;

    @objid ("3816e6d1-d2bd-4b62-b426-cdc03a537410")
    @SmaMetaAttribute(metaName="JoinSpec", type=String.class, smAttributeClass=Metadata.JoinSpecSmAttribute.class)
     Object mJoinSpec = "and";

    @objid ("7fe51682-3519-4053-ac7d-c283a54a2efd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004db002-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("69931b19-308b-4ae9-a3ae-642ffa9bd378")
        private static SmClass smClass = null;

        @objid ("e5b98505-c367-4359-82ce-af36c3ebb4f0")
        private static SmAttribute IsCombineDuplicateAtt = null;

        @objid ("5b34be3c-6fe1-4bad-8c2c-5ce731135e08")
        private static SmAttribute JoinSpecAtt = null;

        @objid ("b337cc54-9bc8-4ec3-951e-5203b5515a8f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ForkJoinNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("24fc40e3-c8f7-4008-b151-4a2af04737d1")
        public static SmAttribute IsCombineDuplicateAtt() {
            if (IsCombineDuplicateAtt == null) {
            	IsCombineDuplicateAtt = classof().getAttributeDef("IsCombineDuplicate");
            }
            return IsCombineDuplicateAtt;
        }

        @objid ("ba516bdd-9d2a-4747-bf5a-89170cf8c043")
        public static SmAttribute JoinSpecAtt() {
            if (JoinSpecAtt == null) {
            	JoinSpecAtt = classof().getAttributeDef("JoinSpec");
            }
            return JoinSpecAtt;
        }

        @objid ("ca86769d-997a-485e-9079-78faaf15a32d")
        public static SmAttribute getJoinSpecAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JoinSpecAtt;
        }

        @objid ("bd21038a-83e8-41c9-96f7-6a0f46f3937f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e31ae9c0-fdb2-4a99-a526-e54b16a23d4b")
        public static SmAttribute getIsCombineDuplicateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsCombineDuplicateAtt;
        }

        @objid ("004df1b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f3995b75-e2c1-4d15-8281-8a78561f92c1")
            public ISmObjectData createData() {
                return new ForkJoinNodeData();
            }

            @objid ("f59965cd-4130-431f-8002-dfac7e4ed4df")
            public SmObjectImpl createImpl() {
                return new ForkJoinNodeImpl();
            }

        }

        @objid ("004e5a70-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsCombineDuplicateSmAttribute extends SmAttribute {
            @objid ("a0ac9352-fcd1-4288-85b1-3b23bcbb5285")
            public Object getValue(ISmObjectData data) {
                return ((ForkJoinNodeData) data).mIsCombineDuplicate;
            }

            @objid ("4994ad2f-55ef-4870-91a2-e2a7b5732910")
            public void setValue(ISmObjectData data, Object value) {
                ((ForkJoinNodeData) data).mIsCombineDuplicate = value;
            }

        }

        @objid ("004ebd44-c4c2-1fd8-97fe-001ec947cd2a")
        public static class JoinSpecSmAttribute extends SmAttribute {
            @objid ("722d6c6e-a62d-49fa-b7b3-bdb05222139e")
            public Object getValue(ISmObjectData data) {
                return ((ForkJoinNodeData) data).mJoinSpec;
            }

            @objid ("bd505611-4ffa-44b7-a881-7a7d77b683ff")
            public void setValue(ISmObjectData data, Object value) {
                ((ForkJoinNodeData) data).mJoinSpec = value;
            }

        }

    }

}
