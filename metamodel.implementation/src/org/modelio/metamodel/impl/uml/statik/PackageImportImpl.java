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
    @objid ("8721bc9f-a38d-4f42-b82c-78d6edf487d8")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(PackageImportData.Metadata.VisibilityAtt());
    }

    @objid ("d0dd8d8c-7f3f-4e30-9a83-e7b413048f73")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(PackageImportData.Metadata.VisibilityAtt(), value);
    }

    @objid ("f5844088-aed1-4630-8d6d-dd5f17ac89b4")
    @Override
    public Operation getImportingOperation() {
        return (Operation) getDepVal(PackageImportData.Metadata.ImportingOperationDep());
    }

    @objid ("0cfea602-b175-42da-9e82-e4f76cee7a7c")
    @Override
    public void setImportingOperation(Operation value) {
        appendDepVal(PackageImportData.Metadata.ImportingOperationDep(), (SmObjectImpl)value);
    }

    @objid ("e042edc6-1f81-46b9-ad43-d4cf215851fa")
    @Override
    public NameSpace getImportingNameSpace() {
        return (NameSpace) getDepVal(PackageImportData.Metadata.ImportingNameSpaceDep());
    }

    @objid ("3ecccf77-923f-43cc-bdc5-57dfb922d3fa")
    @Override
    public void setImportingNameSpace(NameSpace value) {
        appendDepVal(PackageImportData.Metadata.ImportingNameSpaceDep(), (SmObjectImpl)value);
    }

    @objid ("5ac41f18-be43-4433-85b9-12d90e469dc5")
    @Override
    public Package getImportedPackage() {
        return (Package) getDepVal(PackageImportData.Metadata.ImportedPackageDep());
    }

    @objid ("b3f329b0-7c8b-4dde-8594-3fe78ba5ba6e")
    @Override
    public void setImportedPackage(Package value) {
        appendDepVal(PackageImportData.Metadata.ImportedPackageDep(), (SmObjectImpl)value);
    }

    @objid ("b5847f22-4149-4bdd-bde6-ade39280a24d")
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

    @objid ("703c485b-eac6-49fe-838c-3a1c602b75a1")
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

    @objid ("ed687ea3-cf20-4eef-a0a5-25567959347e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackageImport(this);
        else
          return null;
    }

}
