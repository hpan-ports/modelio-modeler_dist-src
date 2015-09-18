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
    @objid ("cf236499-b605-4768-aa1f-9c87e594df9b")
    @Override
    public Package getMergedPackage() {
        return (Package) getDepVal(PackageMergeData.Metadata.MergedPackageDep());
    }

    @objid ("a5dd5230-a284-4875-8401-e7d42408267c")
    @Override
    public void setMergedPackage(Package value) {
        appendDepVal(PackageMergeData.Metadata.MergedPackageDep(), (SmObjectImpl)value);
    }

    @objid ("ccc5a76b-72cc-415f-8406-1ade82a8963e")
    @Override
    public Package getReceivingPackage() {
        return (Package) getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
    }

    @objid ("4a22d3f3-6a6b-454f-af32-ae4254f88e8e")
    @Override
    public void setReceivingPackage(Package value) {
        appendDepVal(PackageMergeData.Metadata.ReceivingPackageDep(), (SmObjectImpl)value);
    }

    @objid ("eaf4e989-5bc1-431b-a3f7-e1ab2ef0f868")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("cab73ec3-665c-4364-a7f5-03ae996977f0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
        if (obj != null)
          return new SmDepVal(PackageMergeData.Metadata.ReceivingPackageDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("9aabe28a-3615-4c93-adf4-b5022f52a553")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackageMerge(this);
        else
          return null;
    }

}
