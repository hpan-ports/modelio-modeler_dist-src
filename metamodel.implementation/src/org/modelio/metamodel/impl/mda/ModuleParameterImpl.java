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
    @objid ("9f1708e9-7f5f-4553-854f-dcb9b82d22d0")
    @Override
    public String getSetName() {
        return (String) getAttVal(ModuleParameterData.Metadata.SetNameAtt());
    }

    @objid ("b4482c35-2c71-4e78-9876-88b64d84ba7a")
    @Override
    public void setSetName(String value) {
        setAttVal(ModuleParameterData.Metadata.SetNameAtt(), value);
    }

    @objid ("cfe7b5c6-f402-41bb-9b5e-de3e1791d466")
    @Override
    public ModuleParameterType getAssociatedType() {
        return (ModuleParameterType) getAttVal(ModuleParameterData.Metadata.AssociatedTypeAtt());
    }

    @objid ("f7b20303-f930-478c-baf1-ec4e78c8af05")
    @Override
    public void setAssociatedType(ModuleParameterType value) {
        setAttVal(ModuleParameterData.Metadata.AssociatedTypeAtt(), value);
    }

    @objid ("9a38cfbf-3a49-40f0-8e8c-e38e328b1892")
    @Override
    public boolean isIsUserRead() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsUserReadAtt());
    }

    @objid ("02a914c7-a1cc-4f86-bfc5-885dc2cd4bb7")
    @Override
    public void setIsUserRead(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsUserReadAtt(), value);
    }

    @objid ("ea927c9c-d0ca-4826-861f-e5c0dede8973")
    @Override
    public boolean isIsUserWrite() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsUserWriteAtt());
    }

    @objid ("40cbaf04-22de-431e-9d30-ca1ab800e46d")
    @Override
    public void setIsUserWrite(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsUserWriteAtt(), value);
    }

    @objid ("297f069a-6d3f-40b1-9dca-d1ea85c43e96")
    @Override
    public boolean isIsApiRead() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsApiReadAtt());
    }

    @objid ("77cce948-36ab-422c-91f9-b8f4f3cd3139")
    @Override
    public void setIsApiRead(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsApiReadAtt(), value);
    }

    @objid ("4a04a562-fe7a-42d9-80f7-e52aa1a30a98")
    @Override
    public boolean isIsApiWrite() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsApiWriteAtt());
    }

    @objid ("98c04fd4-88c0-4ec9-a89a-dfdbdda4a2c7")
    @Override
    public void setIsApiWrite(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsApiWriteAtt(), value);
    }

    @objid ("f4896866-edbe-468a-86c7-c48e1bfe541b")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ModuleParameterData.Metadata.TypeDep());
    }

    @objid ("d98100fc-6779-4a0d-8f87-ff0025429075")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ModuleParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("f7a77d15-dc15-474e-8032-76fb030e0a5b")
    @Override
    public ModuleComponent getOwner() {
        return (ModuleComponent) getDepVal(ModuleParameterData.Metadata.OwnerDep());
    }

    @objid ("c0889d92-4fcf-45e4-b28a-4892c9780afc")
    @Override
    public void setOwner(ModuleComponent value) {
        appendDepVal(ModuleParameterData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("74eab3c9-2662-42d1-8848-5fc6923e30d7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModuleParameterData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("34885438-8690-4610-912b-80f24030ee5d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModuleParameterData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ModuleParameterData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("33128768-a71e-476c-8275-9c6f50d413df")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModuleParameter(this);
        else
          return null;
    }

}
