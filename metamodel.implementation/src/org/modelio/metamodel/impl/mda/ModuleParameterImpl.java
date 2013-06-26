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
    @objid ("f38d5fce-9c74-424c-a428-c5a05f6d16b3")
    @Override
    public String getSetName() {
        return (String) getAttVal(ModuleParameterData.Metadata.SetNameAtt());
    }

    @objid ("721297da-d5fc-4374-914c-42e3ab675eff")
    @Override
    public void setSetName(String value) {
        setAttVal(ModuleParameterData.Metadata.SetNameAtt(), value);
    }

    @objid ("91df6967-9a07-4a18-b02a-7f5d7902aac7")
    @Override
    public ModuleParameterType getAssociatedType() {
        return (ModuleParameterType) getAttVal(ModuleParameterData.Metadata.AssociatedTypeAtt());
    }

    @objid ("3fd629c3-75d2-4b73-8650-08c9d23adb11")
    @Override
    public void setAssociatedType(ModuleParameterType value) {
        setAttVal(ModuleParameterData.Metadata.AssociatedTypeAtt(), value);
    }

    @objid ("288c1d24-fe6c-4375-b8e9-e567b86023d8")
    @Override
    public boolean isIsUserRead() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsUserReadAtt());
    }

    @objid ("9cf37c72-8510-4347-818b-34f24ad0fa93")
    @Override
    public void setIsUserRead(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsUserReadAtt(), value);
    }

    @objid ("202dd06b-9abc-4821-a458-57277abe5461")
    @Override
    public boolean isIsUserWrite() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsUserWriteAtt());
    }

    @objid ("cc2c71d2-1d21-47d7-ab67-066f265d4c8a")
    @Override
    public void setIsUserWrite(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsUserWriteAtt(), value);
    }

    @objid ("c26249e6-ca4e-4531-a7ca-8df29ca14129")
    @Override
    public boolean isIsApiRead() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsApiReadAtt());
    }

    @objid ("712f31f4-cc1b-40e4-897f-f4f5e4567dd8")
    @Override
    public void setIsApiRead(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsApiReadAtt(), value);
    }

    @objid ("3f5184a6-15a4-4592-8036-f0fbb26b1c21")
    @Override
    public boolean isIsApiWrite() {
        return (Boolean) getAttVal(ModuleParameterData.Metadata.IsApiWriteAtt());
    }

    @objid ("6076bc3d-9073-40f1-8823-1d0250877e1e")
    @Override
    public void setIsApiWrite(boolean value) {
        setAttVal(ModuleParameterData.Metadata.IsApiWriteAtt(), value);
    }

    @objid ("c7ceb9bb-4144-4a8a-8c4f-f5cda6d40a6f")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(ModuleParameterData.Metadata.TypeDep());
    }

    @objid ("bd889e8b-9036-41aa-8e73-8f2ef6a3e755")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(ModuleParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("d4ef2b78-ffe3-4a5a-b32a-65981d1bcf33")
    @Override
    public ModuleComponent getOwner() {
        return (ModuleComponent) getDepVal(ModuleParameterData.Metadata.OwnerDep());
    }

    @objid ("81702a44-2885-4e41-8519-51af9c04e5d8")
    @Override
    public void setOwner(ModuleComponent value) {
        appendDepVal(ModuleParameterData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("7efed869-2b74-4ad1-bdce-344fe6300a4c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModuleParameterData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7a7f82e4-8bd7-4710-b523-ef223f688c6e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModuleParameterData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ModuleParameterData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("5aab598d-a6d4-4ff5-a0e8-839e38ad424a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModuleParameter(this);
        else
          return null;
    }

}
