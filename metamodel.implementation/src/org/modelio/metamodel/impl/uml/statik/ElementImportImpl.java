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
import org.modelio.metamodel.data.uml.statik.ElementImportData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00083b94-c4bf-1fd8-97fe-001ec947cd2a")
public class ElementImportImpl extends ModelElementImpl implements ElementImport {
    @objid ("13e52ed4-e732-4041-a744-5cd4acb80987")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(ElementImportData.Metadata.VisibilityAtt());
    }

    @objid ("a1e2fcfb-08fb-4239-a4aa-3a82ece94e52")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(ElementImportData.Metadata.VisibilityAtt(), value);
    }

    @objid ("10045b9c-725f-400e-a6c0-d59511f95329")
    @Override
    public NameSpace getImportingNameSpace() {
        return (NameSpace) getDepVal(ElementImportData.Metadata.ImportingNameSpaceDep());
    }

    @objid ("14931bd9-9df5-449d-b649-434f0a87287d")
    @Override
    public void setImportingNameSpace(NameSpace value) {
        appendDepVal(ElementImportData.Metadata.ImportingNameSpaceDep(), (SmObjectImpl)value);
    }

    @objid ("7fa6bc27-16fe-4222-9f19-73af14bd3d53")
    @Override
    public NameSpace getImportedElement() {
        return (NameSpace) getDepVal(ElementImportData.Metadata.ImportedElementDep());
    }

    @objid ("337aec36-ba4c-47a8-a3b0-0b980f5e8fa2")
    @Override
    public void setImportedElement(NameSpace value) {
        appendDepVal(ElementImportData.Metadata.ImportedElementDep(), (SmObjectImpl)value);
    }

    @objid ("3824684c-d131-42c7-8619-a150333c101f")
    @Override
    public Operation getImportingOperation() {
        return (Operation) getDepVal(ElementImportData.Metadata.ImportingOperationDep());
    }

    @objid ("73135051-61df-4eb2-a85b-ef0f0bea3abd")
    @Override
    public void setImportingOperation(Operation value) {
        appendDepVal(ElementImportData.Metadata.ImportingOperationDep(), (SmObjectImpl)value);
    }

    @objid ("91071fb3-146d-4400-b42f-cb97d44a3d8c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ElementImportData.Metadata.ImportingNameSpaceDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ElementImportData.Metadata.ImportingOperationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c80bdcde-bb2b-42c1-9571-a0a3d2db53ae")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ElementImportData.Metadata.ImportingNameSpaceDep());
        if (obj != null)
          return new SmDepVal(ElementImportData.Metadata.ImportingNameSpaceDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ElementImportData.Metadata.ImportingOperationDep());
        if (obj != null)
          return new SmDepVal(ElementImportData.Metadata.ImportingOperationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("28291874-72ca-40f3-b942-ba301cbcdd89")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitElementImport(this);
        else
          return null;
    }

}
