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
import org.modelio.metamodel.impl.uml.statik.ElementImportData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00083b94-c4bf-1fd8-97fe-001ec947cd2a")
public class ElementImportImpl extends ModelElementImpl implements ElementImport {
    @objid ("23ed5392-9fc9-4c00-95bf-a75be751aabc")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(((ElementImportSmClass)getClassOf()).getVisibilityAtt());
    }

    @objid ("dd07afbd-2930-44f9-af8c-0b9503f5d33c")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(((ElementImportSmClass)getClassOf()).getVisibilityAtt(), value);
    }

    @objid ("b8524200-c92e-4869-a9c2-bca774ab9a2f")
    @Override
    public NameSpace getImportingNameSpace() {
        Object obj = getDepVal(((ElementImportSmClass)getClassOf()).getImportingNameSpaceDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("b4f031e4-fc1f-466c-bd36-f4c5f47651b7")
    @Override
    public void setImportingNameSpace(NameSpace value) {
        appendDepVal(((ElementImportSmClass)getClassOf()).getImportingNameSpaceDep(), (SmObjectImpl)value);
    }

    @objid ("7fd74b96-b474-454c-af42-c70deb5fc7f3")
    @Override
    public NameSpace getImportedElement() {
        Object obj = getDepVal(((ElementImportSmClass)getClassOf()).getImportedElementDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("282cca91-9f97-4a32-8181-3a31efec180d")
    @Override
    public void setImportedElement(NameSpace value) {
        appendDepVal(((ElementImportSmClass)getClassOf()).getImportedElementDep(), (SmObjectImpl)value);
    }

    @objid ("92955916-0b01-4f3e-b654-f1271aea2a51")
    @Override
    public Operation getImportingOperation() {
        Object obj = getDepVal(((ElementImportSmClass)getClassOf()).getImportingOperationDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("3357d59c-4c0c-4bd0-806e-adb8aa9200be")
    @Override
    public void setImportingOperation(Operation value) {
        appendDepVal(((ElementImportSmClass)getClassOf()).getImportingOperationDep(), (SmObjectImpl)value);
    }

    @objid ("f5beecbc-c6ae-4b7e-a27f-6c7b30244b0a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // ImportingNameSpace
        obj = (SmObjectImpl)this.getDepVal(((ElementImportSmClass)getClassOf()).getImportingNameSpaceDep());
        if (obj != null)
          return obj;
        // ImportingOperation
        obj = (SmObjectImpl)this.getDepVal(((ElementImportSmClass)getClassOf()).getImportingOperationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5fcb2856-083d-4a9c-9481-7011ab3cbe98")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // ImportingNameSpace
        dep = ((ElementImportSmClass)getClassOf()).getImportingNameSpaceDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ImportingOperation
        dep = ((ElementImportSmClass)getClassOf()).getImportingOperationDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("456b4ac7-bd01-49a1-bedf-5334e840bfe5")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitElementImport(this);
        else
          return null;
    }

}
