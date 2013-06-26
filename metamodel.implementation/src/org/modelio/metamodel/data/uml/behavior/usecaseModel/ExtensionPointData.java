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
    @objid ("10dff52d-12e3-42d7-979b-a59329dfce47")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("42690b2a-dafc-4d02-b0bb-efa9782d94c9")
    @SmaMetaAssociation(metaName="Extended", typeDataClass=UseCaseDependencyData.class, min=0, max=-1, smAssociationClass=Metadata.ExtendedSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mExtended = null;

    @objid ("e36baa8f-c59e-4763-9b8c-91874c1a257e")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=UseCaseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("797bba16-48d2-4de8-a7f1-91c9364fde7d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003f5322-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("60e2a736-af29-49c2-be25-1f24e7ed5727")
        private static SmClass smClass = null;

        @objid ("b85cf20c-e001-47cf-9ad8-39f79e8b44eb")
        private static SmAttribute VisibilityAtt = null;

        @objid ("428268d1-fcec-4861-a66a-b88039fe171e")
        private static SmDependency ExtendedDep = null;

        @objid ("2500c2ae-687a-4528-8eb6-d7fbae7ec8af")
        private static SmDependency OwnerDep = null;

        @objid ("0305f7a3-21f2-4825-8ad0-3222d49ec525")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExtensionPointData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fc0eb423-1441-4099-bfbd-200d2babcf27")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("7068e89c-bd5c-4632-8c9c-c2eabf9af372")
        public static SmDependency ExtendedDep() {
            if (ExtendedDep == null) {
            	ExtendedDep = classof().getDependencyDef("Extended");
            }
            return ExtendedDep;
        }

        @objid ("710f5875-c232-424c-a792-db5166ba7626")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("67656299-ace9-4cfb-b932-77b39206a6ad")
        public static SmDependency getExtendedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtendedDep;
        }

        @objid ("51202c6f-80c8-4a5b-b372-7d9d7f9ec135")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("15a4a8a9-6741-42ff-80e0-cc012733d705")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("78acbca2-745b-4f67-b8b8-f31e67b886b5")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("003f98e6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("10a24caf-4b75-45ac-8b0b-f34710410405")
            public ISmObjectData createData() {
                return new ExtensionPointData();
            }

            @objid ("1eaa3ace-73ae-4c02-b691-aaa03830d5f5")
            public SmObjectImpl createImpl() {
                return new ExtensionPointImpl();
            }

        }

        @objid ("003ffb92-c4c3-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("6b53bd60-14d1-43c4-adbb-2f53b1ee1fb3")
            public Object getValue(ISmObjectData data) {
                return ((ExtensionPointData) data).mVisibility;
            }

            @objid ("103c9c5c-057f-4c93-bb42-9b88c1c52676")
            public void setValue(ISmObjectData data, Object value) {
                ((ExtensionPointData) data).mVisibility = value;
            }

        }

        @objid ("00405fd8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("ed114673-246e-4960-bd69-1ebdcab14314")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExtensionPointData) data).mOwner;
            }

            @objid ("fcc3f331-3867-4b5b-884f-79cb3ee1d5f0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExtensionPointData) data).mOwner = value;
            }

            @objid ("564651f7-f405-4bd0-bcb3-ee4e8ed9c624")
            @Override
            public SmDependency getSymetric() {
                return UseCaseData.Metadata.OwnedExtensionDep();
            }

        }

        @objid ("00419ac4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ExtendedSmDependency extends SmMultipleDependency {
            @objid ("2d6a8f97-5b10-4b23-b39e-e018c07c3192")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExtensionPointData)data).mExtended != null)? ((ExtensionPointData)data).mExtended:SmMultipleDependency.EMPTY;
            }

            @objid ("510cdf12-1f64-4ed9-8a19-9cfc955d743a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExtensionPointData) data).mExtended = new ArrayList<>(initialCapacity);
                return ((ExtensionPointData) data).mExtended;
            }

            @objid ("a1f51d96-1600-4e42-9cab-2efb4df4eb37")
            @Override
            public SmDependency getSymetric() {
                return UseCaseDependencyData.Metadata.ExtensionLocationDep();
            }

        }

    }

}
