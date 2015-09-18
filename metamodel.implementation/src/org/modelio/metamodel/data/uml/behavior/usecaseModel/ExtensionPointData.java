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
package org.modelio.metamodel.data.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseData;
import org.modelio.metamodel.data.uml.behavior.usecaseModel.UseCaseDependencyData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.ExtensionPointImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
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

@objid ("0059d030-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExtensionPoint.class, factory=ExtensionPointData.Metadata.ObjectFactory.class)
public class ExtensionPointData extends ModelElementData {
    @objid ("9ea83741-3434-450a-901f-bb956b4d5a46")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("920e3ae4-ecfe-482c-9912-28ea78f244b4")
    @SmaMetaAssociation(metaName="Extended", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.ExtendedSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mExtended = null;

    @objid ("1207248c-bed1-444f-8dad-f1f56ef01a28")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=UseCaseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("10255ef8-5daa-4dc4-bb70-77c47f6a035c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003f5322-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("901e1151-1d31-4bf0-aee4-e23fe2edfe12")
        private static SmClass smClass = null;

        @objid ("6ca09123-ea19-41c3-bee0-3706700fefbd")
        private static SmAttribute VisibilityAtt = null;

        @objid ("f613e748-cc50-4c89-8aa8-fa776438f808")
        private static SmDependency ExtendedDep = null;

        @objid ("9f230d8f-e736-42f3-86d3-225351e11476")
        private static SmDependency OwnerDep = null;

        @objid ("ec2c9741-02c9-428a-b7dd-d6011c4eaae3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExtensionPointData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("aee1a868-5f60-4099-ac0d-8e388185800d")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("d83b5774-1720-4d13-8d35-679ee9bdde53")
        public static SmDependency ExtendedDep() {
            if (ExtendedDep == null) {
            	ExtendedDep = classof().getDependencyDef("Extended");
            }
            return ExtendedDep;
        }

        @objid ("2bbf3f66-dc3f-4901-a570-0d29fd8dc3d3")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("5e62bfc8-5e5b-42ed-8bac-7c6133813334")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("8bcf4071-6ff4-4b2e-a569-435d931c28f6")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("1f66cbe2-6c64-4a4e-8ba8-b3fc3b6a106e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8ad0857e-ab18-4538-96a2-dfab0f7ec82b")
        public static SmDependency getExtendedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtendedDep;
        }

        @objid ("003f98e6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("812cb3b5-99a9-4168-a666-af978a97c5a5")
            public ISmObjectData createData() {
                return new ExtensionPointData();
            }

            @objid ("2e236115-b386-457d-b6f5-9e6968267f3b")
            public SmObjectImpl createImpl() {
                return new ExtensionPointImpl();
            }

        }

        @objid ("003ffb92-c4c3-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("34acdbf0-a6ba-49ce-b99f-eff29bcdd6f8")
            public Object getValue(ISmObjectData data) {
                return ((ExtensionPointData) data).mVisibility;
            }

            @objid ("cc2ed6b2-0cf3-4a7b-ae8c-e0946664884f")
            public void setValue(ISmObjectData data, Object value) {
                ((ExtensionPointData) data).mVisibility = value;
            }

        }

        @objid ("00405fd8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("075e12a7-ec61-4ad9-837b-7d2785f6fae1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExtensionPointData) data).mOwner;
            }

            @objid ("73833519-ff28-46bc-ab4c-4b49ec0862fc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExtensionPointData) data).mOwner = value;
            }

            @objid ("dd8dc5db-504e-4a39-8905-f132b4302641")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.OwnedExtensionDep();
            }

        }

        @objid ("00419ac4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ExtendedSmDependency extends SmMultipleDependency {
            @objid ("cd771a00-f1c9-4b17-aa23-a57f5ae00df9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExtensionPointData)data).mExtended != null)? ((ExtensionPointData)data).mExtended:SmMultipleDependency.EMPTY;
            }

            @objid ("674f28f9-ed5c-4877-a737-60836c1da156")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExtensionPointData) data).mExtended = new ArrayList<>(initialCapacity);
                return ((ExtensionPointData) data).mExtended;
            }

            @objid ("733ebf1d-fa37-4c29-a94a-0ec2accf0f91")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.ExtensionLocationDep();
            }

        }

    }

}
