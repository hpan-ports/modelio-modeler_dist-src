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
    @objid ("e1252843-0296-4964-af34-40e4ab6abfd7")
    @Override
    public Package getMergedPackage() {
        return (Package) getDepVal(PackageMergeData.Metadata.MergedPackageDep());
    }

    @objid ("27ec5463-7ac0-46da-9878-4fcd1ce39af8")
    @Override
    public void setMergedPackage(Package value) {
        appendDepVal(PackageMergeData.Metadata.MergedPackageDep(), (SmObjectImpl)value);
    }

    @objid ("e3f2d46e-799f-4b09-969f-e04c90d2450c")
    @Override
    public Package getReceivingPackage() {
        return (Package) getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
    }

    @objid ("14759217-0585-427c-973e-8ee811e27223")
    @Override
    public void setReceivingPackage(Package value) {
        appendDepVal(PackageMergeData.Metadata.ReceivingPackageDep(), (SmObjectImpl)value);
    }

    @objid ("901da7b3-9562-4ce9-b5db-4e3a3b89e71b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d3843b5a-9333-44f5-bf15-b795df05cce6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageMergeData.Metadata.ReceivingPackageDep());
        if (obj != null)
          return new SmDepVal(PackageMergeData.Metadata.ReceivingPackageDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("58fc9074-af69-40bc-a000-34fc1c06c0b0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackageMerge(this);
        else
          return null;
    }

}
