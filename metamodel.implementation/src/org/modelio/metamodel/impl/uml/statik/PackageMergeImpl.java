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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.PackageMergeData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00172b86-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageMergeImpl extends ModelElementImpl implements PackageMerge {
    @objid ("db899603-2976-4ddc-942b-566ce879ce35")
    @Override
    public Package getMergedPackage() {
        return (Package) getDepVal(PackageMergeData.Metadata.MergedPackageDep());
    }

    @objid ("2a2183ea-8388-478c-aa2a-514197c95929")
    @Override
    public void setMergedPackage(Package value) {
        appendDepVal(PackageMergeData.Metadata.MergedPackageDep(), (SmObjectImpl)value);
    }

    @objid ("e9c5c7cb-28ab-4868-ac15-0a00bfe19ac7")
    @Override
    public Package getReceivingPackage() {
        return (Package) getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
    }

    @objid ("6e35ff36-e19c-440b-aae6-fec524749cf7")
    @Override
    public void setReceivingPackage(Package value) {
        appendDepVal(PackageMergeData.Metadata.ReceivingPackageDep(), (SmObjectImpl)value);
    }

    @objid ("659534b0-e870-43bf-8392-72b3927384f0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9e823782-79ea-4bcc-bd49-8b02ca3838bb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
        if (obj != null)
          return new SmDepVal(PackageMergeData.Metadata.ReceivingPackageDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e14abfe3-b64b-4bb7-96fb-e00f92bc911c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackageMerge(this);
        else
          return null;
    }

}
