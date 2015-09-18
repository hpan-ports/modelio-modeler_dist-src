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
    @objid ("9a8386b7-1aad-45c6-bf28-fad942d7a033")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(ElementImportData.Metadata.VisibilityAtt());
    }

    @objid ("c386614f-1b44-429b-9e6e-708e6273f99c")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(ElementImportData.Metadata.VisibilityAtt(), value);
    }

    @objid ("88670da0-296e-4691-8454-f7b035c02cb7")
    @Override
    public NameSpace getImportingNameSpace() {
        return (NameSpace) getDepVal(ElementImportData.Metadata.ImportingNameSpaceDep());
    }

    @objid ("ad7b59c6-19e1-40af-891f-bd9557c45e7f")
    @Override
    public void setImportingNameSpace(NameSpace value) {
        appendDepVal(ElementImportData.Metadata.ImportingNameSpaceDep(), (SmObjectImpl)value);
    }

    @objid ("bfae38dc-b5af-4a49-845d-426d51483447")
    @Override
    public NameSpace getImportedElement() {
        return (NameSpace) getDepVal(ElementImportData.Metadata.ImportedElementDep());
    }

    @objid ("66fd251d-742f-4a81-9fab-9d98c3eb90fc")
    @Override
    public void setImportedElement(NameSpace value) {
        appendDepVal(ElementImportData.Metadata.ImportedElementDep(), (SmObjectImpl)value);
    }

    @objid ("044a18a7-7bd7-43b7-9b40-010fd81d5bda")
    @Override
    public Operation getImportingOperation() {
        return (Operation) getDepVal(ElementImportData.Metadata.ImportingOperationDep());
    }

    @objid ("308c5b83-7eb4-4018-bb44-74044dbc031f")
    @Override
    public void setImportingOperation(Operation value) {
        appendDepVal(ElementImportData.Metadata.ImportingOperationDep(), (SmObjectImpl)value);
    }

    @objid ("6bb55e1e-e22b-4a11-8c81-41a99118739c")
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

    @objid ("e3b546a4-9f2d-4b88-864b-28ebac6fad45")
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

    @objid ("c5fc9e75-3915-4f93-baff-37669b9e980b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitElementImport(this);
        else
          return null;
    }

}
