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
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.mda.ModuleParameterData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleParameterType;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00650bb2-c4bf-1fd8-97fe-001ec947cd2a")
public class ModuleParameterImpl extends ModelElementImpl implements ModuleParameter {
    @objid ("15ef2731-20fd-45de-b100-ca32c8d1fd96")
    @Override
    public String getSetName() {
        return (String) getAttVal(ModuleParameterData.Metadata.SetNameAtt());
    }

    @objid ("0f0f2793-aabd-40fe-a66b-649fd4fa6edd")
    @Override
    public void setSetName(String value) {
        setAttVal(ModuleParameterData.Metadata.SetNameAtt(), value);
    }

    @objid ("a6420ccc-8e56-4770-82eb-d389b1ecc007")
    @Override
    public ModuleParameterType getAssociatedType() {
        return (ModuleParameterType) getAttVal(ModuleParameterData.Metadata.AssociatedTypeAtt());
    }

    @objid ("5b4384dc-170b-4a00-a37b-15541d339783")
    @Override
    public void setAssociatedType(ModuleParameterType value) {
        setAttVal(ModuleParameterData.Metadata.AssociatedTypeAtt(), value);
    }

    @objid ("a54d087c-334d-459f-8067-9bbbd629ad54")
    @Override
    public boolean isIsUserRead() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsUserReadAtt());
    }

    @objid ("3314a2d7-17ef-45f0-afdc-99d1deea3c8a")
    @Override
    public void setIsUserRead(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsUserReadAtt(), value);
    }

    @objid ("8f70bf55-f6e0-4023-bf19-f47e8fd936e0")
    @Override
    public boolean isIsUserWrite() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsUserWriteAtt());
    }

    @objid ("012fef1b-a904-4707-b01e-3ea082733b54")
    @Override
    public void setIsUserWrite(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsUserWriteAtt(), value);
    }

    @objid ("532bab0e-b107-4901-ae91-c36944a015dd")
    @Override
    public boolean isIsApiRead() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsApiReadAtt());
    }

    @objid ("e97bbbca-828b-4d97-8062-98dc0107eebd")
    @Override
    public void setIsApiRead(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsApiReadAtt(), value);
    }

    @objid ("9df3d3ad-f355-43f6-9d15-b2b56f45fe68")
    @Override
    public boolean isIsApiWrite() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsApiWriteAtt());
    }

    @objid ("3c1282be-230d-48d5-8ac3-333a4f18d8e2")
    @Override
    public void setIsApiWrite(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsApiWriteAtt(), value);
    }

    @objid ("354561a1-48ec-43e7-9047-5b2a60b88f08")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ModuleParameterData.Metadata.TypeDep());
    }

    @objid ("3dfa41bc-13f8-48a9-ac24-0a650dc465f4")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ModuleParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("7a49495b-f4e6-4869-81ce-ac2618d45cd0")
    @Override
    public ModuleComponent getOwner() {
        return (ModuleComponent) getDepVal(ModuleParameterData.Metadata.OwnerDep());
    }

    @objid ("f456335c-d24d-4c2e-bda1-68d1be85096e")
    @Override
    public void setOwner(ModuleComponent value) {
        appendDepVal(ModuleParameterData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("370d5e24-fce5-415f-9399-e8fb006596c9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModuleParameterData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2c3cc97e-36bc-4e46-b7bf-d697a3be3e33")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModuleParameterData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ModuleParameterData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("6815906f-1635-48c7-9b6c-3ccc0f92b496")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModuleParameter(this);
        else
          return null;
    }

}
