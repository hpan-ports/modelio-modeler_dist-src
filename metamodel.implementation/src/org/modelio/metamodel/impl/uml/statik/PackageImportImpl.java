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
import org.modelio.metamodel.impl.uml.statik.PackageImportData;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00164f7c-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageImportImpl extends ModelElementImpl implements PackageImport {
    @objid ("6107f9cf-f34e-4fb9-b98c-1fa5ea470a2c")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(((PackageImportSmClass)getClassOf()).getVisibilityAtt());
    }

    @objid ("ec04c249-d191-491a-afe8-c355eafcc926")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(((PackageImportSmClass)getClassOf()).getVisibilityAtt(), value);
    }

    @objid ("d89ba27a-71da-4698-b4c2-eff5602eea06")
    @Override
    public Operation getImportingOperation() {
        Object obj = getDepVal(((PackageImportSmClass)getClassOf()).getImportingOperationDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("b7a1205a-d438-45aa-9adf-9ffa14b60090")
    @Override
    public void setImportingOperation(Operation value) {
        appendDepVal(((PackageImportSmClass)getClassOf()).getImportingOperationDep(), (SmObjectImpl)value);
    }

    @objid ("47b7adf4-3e9d-4840-a5c9-b75257fc8e29")
    @Override
    public NameSpace getImportingNameSpace() {
        Object obj = getDepVal(((PackageImportSmClass)getClassOf()).getImportingNameSpaceDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("e0e2ddf0-0bb6-4cb5-b414-734fff70c38f")
    @Override
    public void setImportingNameSpace(NameSpace value) {
        appendDepVal(((PackageImportSmClass)getClassOf()).getImportingNameSpaceDep(), (SmObjectImpl)value);
    }

    @objid ("834377de-d910-4102-802e-bdbbef17fceb")
    @Override
    public Package getImportedPackage() {
        Object obj = getDepVal(((PackageImportSmClass)getClassOf()).getImportedPackageDep());
        return (obj instanceof Package)? (Package)obj : null;
    }

    @objid ("ec236994-7358-4257-80df-eeeeccb8fb30")
    @Override
    public void setImportedPackage(Package value) {
        appendDepVal(((PackageImportSmClass)getClassOf()).getImportedPackageDep(), (SmObjectImpl)value);
    }

    @objid ("70d2f2a7-c425-423a-b488-7bb30ae4a15c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // ImportingOperation
        obj = (SmObjectImpl)this.getDepVal(((PackageImportSmClass)getClassOf()).getImportingOperationDep());
        if (obj != null)
          return obj;
        // ImportingNameSpace
        obj = (SmObjectImpl)this.getDepVal(((PackageImportSmClass)getClassOf()).getImportingNameSpaceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f4fce147-beb2-4cf3-94a4-e33ec04fc381")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // ImportingOperation
        dep = ((PackageImportSmClass)getClassOf()).getImportingOperationDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ImportingNameSpace
        dep = ((PackageImportSmClass)getClassOf()).getImportingNameSpaceDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("1d83a657-fa4d-423a-a3e1-f8dcb5454239")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackageImport(this);
        else
          return null;
    }

}
