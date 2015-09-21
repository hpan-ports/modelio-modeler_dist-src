/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.PackageMergeData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00172b86-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageMergeImpl extends ModelElementImpl implements PackageMerge {
    @objid ("c9545a52-a906-4f3b-82a5-bf20b659373a")
    @Override
    public Package getMergedPackage() {
        Object obj = getDepVal(((PackageMergeSmClass)getClassOf()).getMergedPackageDep());
        return (obj instanceof Package)? (Package)obj : null;
    }

    @objid ("07042ec7-beb5-40d1-819e-bc3f8b553f51")
    @Override
    public void setMergedPackage(Package value) {
        appendDepVal(((PackageMergeSmClass)getClassOf()).getMergedPackageDep(), (SmObjectImpl)value);
    }

    @objid ("6b1beaf8-19fe-4fc9-a2ce-d5a5017ad630")
    @Override
    public Package getReceivingPackage() {
        Object obj = getDepVal(((PackageMergeSmClass)getClassOf()).getReceivingPackageDep());
        return (obj instanceof Package)? (Package)obj : null;
    }

    @objid ("b110fdb9-4bd0-4287-822b-cbf2f3545537")
    @Override
    public void setReceivingPackage(Package value) {
        appendDepVal(((PackageMergeSmClass)getClassOf()).getReceivingPackageDep(), (SmObjectImpl)value);
    }

    @objid ("a70b1b4d-3d18-4d91-b1e8-5712fa52fc13")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // ReceivingPackage
        obj = (SmObjectImpl)this.getDepVal(((PackageMergeSmClass)getClassOf()).getReceivingPackageDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c9f0ff4a-2a16-470c-a5e3-980ffca8903a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // ReceivingPackage
        dep = ((PackageMergeSmClass)getClassOf()).getReceivingPackageDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("b47386af-5399-4e00-ae82-f1cd8bae0a0c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackageMerge(this);
        else
          return null;
    }

}
