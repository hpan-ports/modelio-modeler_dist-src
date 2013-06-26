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
    @objid ("fbe1f717-3136-4058-b8a7-5d909daffefe")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(PackageImportData.Metadata.VisibilityAtt());
    }

    @objid ("47762307-2a5c-4280-9b53-eb7cbb1813f8")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(PackageImportData.Metadata.VisibilityAtt(), value);
    }

    @objid ("813ee604-0a0b-4b03-b1f4-e4c7c1af4bc0")
    @Override
    public Operation getImportingOperation() {
        return (Operation) getDepVal(PackageImportData.Metadata.ImportingOperationDep());
    }

    @objid ("d5cbfc90-5686-4aa2-9fdc-414fe9a24f80")
    @Override
    public void setImportingOperation(Operation value) {
        appendDepVal(PackageImportData.Metadata.ImportingOperationDep(), (SmObjectImpl)value);
    }

    @objid ("89d611c9-24e8-4c04-ac42-13a274eda63f")
    @Override
    public NameSpace getImportingNameSpace() {
        return (NameSpace) getDepVal(PackageImportData.Metadata.ImportingNameSpaceDep());
    }

    @objid ("5ef7720c-d93f-4707-bca9-67ee58191e05")
    @Override
    public void setImportingNameSpace(NameSpace value) {
        appendDepVal(PackageImportData.Metadata.ImportingNameSpaceDep(), (SmObjectImpl)value);
    }

    @objid ("e191b473-dd9c-44bc-a5c8-d5d33ac924eb")
    @Override
    public Package getImportedPackage() {
        return (Package) getDepVal(PackageImportData.Metadata.ImportedPackageDep());
    }

    @objid ("94f72dc0-4137-4ee9-b878-ee34319af24f")
    @Override
    public void setImportedPackage(Package value) {
        appendDepVal(PackageImportData.Metadata.ImportedPackageDep(), (SmObjectImpl)value);
    }

    @objid ("5db1e0ae-77b5-4f1a-8596-2890e33de2d5")
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

    @objid ("d4f2517c-6ca0-4ace-bd7f-e0adc9722272")
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

    @objid ("61480217-9d5d-4e11-b4ad-a78550efb393")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackageImport(this);
        else
          return null;
    }

}
