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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.impl.analyst.AnalystElementImpl;
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

@objid ("c469b8a6-17c2-4568-b3ee-39110eb6291b")
@SmaMetaClass(mmClass=AnalystElement.class, factory=AnalystElementData.Metadata.ObjectFactory.class)
public abstract class AnalystElementData extends AnalystItemData {
    @objid ("85de41b2-cc02-44b0-ba61-79931f836c4b")
    @SmaMetaAttribute(metaName="Version", type=Integer.class, smAttributeClass=Metadata.VersionSmAttribute.class)
     Object mVersion = 0;

    @objid ("85c5d49a-95c2-43e4-baab-c6aa143eb034")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("35ee7ca1-df47-49be-a357-598ee4c4efd2")
    public static class Metadata {
        @objid ("662557e2-5819-4e4e-9fef-d3a4f8cea6e5")
        private static SmClass smClass = null;

        @objid ("ea106081-2522-4d57-8487-6d5719b209a8")
        private static SmAttribute VersionAtt = null;

        @objid ("099b28d2-ff05-4010-b269-4ec4a806e9b1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b86f8712-2fbc-4b8c-a6d5-f29b33f5ee6f")
        public static SmAttribute VersionAtt() {
            if (VersionAtt == null) {
            	VersionAtt = classof().getAttributeDef("Version");
            }
            return VersionAtt;
        }

        @objid ("4c68beb2-fbb4-4526-bbd7-a31791056356")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2bb2bea2-8147-4376-9280-c3ee41e24b7f")
        public static SmAttribute getVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VersionAtt;
        }

        @objid ("10a7b11d-a7cb-4dfa-be29-d2f8c7d0664f")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6c827efc-3d64-437f-b9c0-c56bc5d498ce")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("10ed036d-ba67-475b-8bfc-d06f32851288")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("ddf3e6b1-a5ae-4d61-a56f-9f24fc09be38")
        public static class VersionSmAttribute extends SmAttribute {
            @objid ("435dcecb-b2de-44cb-b347-b0195cccd0c4")
            public Object getValue(ISmObjectData data) {
                return ((AnalystElementData) data).mVersion;
            }

            @objid ("2c8f6b69-bdcb-4d19-94e5-09767ea241fa")
            public void setValue(ISmObjectData data, Object value) {
                ((AnalystElementData) data).mVersion = value;
            }

        }

    }

}
