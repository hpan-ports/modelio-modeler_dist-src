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
import org.modelio.metamodel.data.uml.statik.PackageImportData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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

@objid ("00164f7c-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageImportImpl extends ModelElementImpl implements PackageImport {
    @objid ("13040ad7-ecb6-4940-9333-b94945935e6b")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(PackageImportData.Metadata.VisibilityAtt());
    }

    @objid ("b13d6e46-ba2e-464e-a7a6-107f71c4a372")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(PackageImportData.Metadata.VisibilityAtt(), value);
    }

    @objid ("b6e006a4-a021-44de-b63e-d093a81f2000")
    @Override
    public Operation getImportingOperation() {
        return (Operation) getDepVal(PackageImportData.Metadata.ImportingOperationDep());
    }

    @objid ("d5e87dad-8cd4-4d57-a884-dead55a6ecd2")
    @Override
    public void setImportingOperation(Operation value) {
        appendDepVal(PackageImportData.Metadata.ImportingOperationDep(), (SmObjectImpl)value);
    }

    @objid ("2ca3cb12-99cc-4acc-9e37-ed78b3483e0e")
    @Override
    public NameSpace getImportingNameSpace() {
        return (NameSpace) getDepVal(PackageImportData.Metadata.ImportingNameSpaceDep());
    }

    @objid ("b6cc5271-8807-453c-a11c-fd911ab30a24")
    @Override
    public void setImportingNameSpace(NameSpace value) {
        appendDepVal(PackageImportData.Metadata.ImportingNameSpaceDep(), (SmObjectImpl)value);
    }

    @objid ("0d554d3c-eb5f-4cd1-b47e-273efde1d5e2")
    @Override
    public Package getImportedPackage() {
        return (Package) getDepVal(PackageImportData.Metadata.ImportedPackageDep());
    }

    @objid ("a1346578-350c-43f9-a205-93dcb5e2b234")
    @Override
    public void setImportedPackage(Package value) {
        appendDepVal(PackageImportData.Metadata.ImportedPackageDep(), (SmObjectImpl)value);
    }

    @objid ("78fdd491-bb8f-417c-bc8a-ad89da3bd683")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageImportData.Metadata.ImportingOperationDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PackageImportData.Metadata.ImportingNameSpaceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("47a0eb9b-c474-410a-b8eb-02e324e0a1ee")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PackageImportData.Metadata.ImportingOperationDep());
        if (obj != null)
          return new SmDepVal(PackageImportData.Metadata.ImportingOperationDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PackageImportData.Metadata.ImportingNameSpaceDep());
        if (obj != null)
          return new SmDepVal(PackageImportData.Metadata.ImportingNameSpaceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b1b3a588-c46d-4796-8d17-ddeeb1668e74")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackageImport(this);
        else
          return null;
    }

}
