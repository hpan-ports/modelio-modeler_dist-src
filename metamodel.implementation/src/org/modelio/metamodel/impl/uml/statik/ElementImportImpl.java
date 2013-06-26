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
    @objid ("cc045096-b1aa-4ae4-a7b6-c554cbee1005")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(ElementImportData.Metadata.VisibilityAtt());
    }

    @objid ("b9398d79-0e02-4ef6-986f-b97d6c3c046d")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(ElementImportData.Metadata.VisibilityAtt(), value);
    }

    @objid ("41a23c3b-c91d-4556-a6ff-246cac3df779")
    @Override
    public NameSpace getImportingNameSpace() {
        return (NameSpace) getDepVal(ElementImportData.Metadata.ImportingNameSpaceDep());
    }

    @objid ("0c5f562a-e2e8-4bd1-83ba-9c9dc6cf55a8")
    @Override
    public void setImportingNameSpace(NameSpace value) {
        appendDepVal(ElementImportData.Metadata.ImportingNameSpaceDep(), (SmObjectImpl)value);
    }

    @objid ("08f3e624-b91b-448a-970f-a45eba6e92f5")
    @Override
    public NameSpace getImportedElement() {
        return (NameSpace) getDepVal(ElementImportData.Metadata.ImportedElementDep());
    }

    @objid ("d7dc9ebd-5f25-4eb4-af77-a6a54d51a982")
    @Override
    public void setImportedElement(NameSpace value) {
        appendDepVal(ElementImportData.Metadata.ImportedElementDep(), (SmObjectImpl)value);
    }

    @objid ("d197549b-a674-4ecc-a218-2f2ddd9e86dc")
    @Override
    public Operation getImportingOperation() {
        return (Operation) getDepVal(ElementImportData.Metadata.ImportingOperationDep());
    }

    @objid ("f923fe20-fdce-438a-95a7-eef47a544055")
    @Override
    public void setImportingOperation(Operation value) {
        appendDepVal(ElementImportData.Metadata.ImportingOperationDep(), (SmObjectImpl)value);
    }

    @objid ("2b1a3129-56ac-4925-85ff-40b35b5a187d")
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

    @objid ("2faf9b53-59bf-4f49-922a-2eeef9ce577d")
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

    @objid ("da790692-feda-4a49-badb-ac8c9b448be6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitElementImport(this);
        else
          return null;
    }

}
