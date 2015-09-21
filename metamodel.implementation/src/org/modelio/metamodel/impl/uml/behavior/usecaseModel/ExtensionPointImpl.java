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
package org.modelio.metamodel.impl.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.ExtensionPointData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
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

@objid ("0059a6a0-c4bf-1fd8-97fe-001ec947cd2a")
public class ExtensionPointImpl extends ModelElementImpl implements ExtensionPoint {
    @objid ("030eddca-00bb-4ed7-8f3a-047040aef976")
    @Override
    public VisibilityMode getVisibility() {
        return (VisibilityMode) getAttVal(((ExtensionPointSmClass)getClassOf()).getVisibilityAtt());
    }

    @objid ("17b5a62f-7d63-4993-964d-e927d29658ed")
    @Override
    public void setVisibility(VisibilityMode value) {
        setAttVal(((ExtensionPointSmClass)getClassOf()).getVisibilityAtt(), value);
    }

    @objid ("cf014519-5ec3-459d-bc44-2aee708f380e")
    @Override
    public EList<UseCaseDependency> getExtended() {
        return new SmList<>(this, ((ExtensionPointSmClass)getClassOf()).getExtendedDep());
    }

    @objid ("6697ad05-bf69-441d-893d-075a37259cc6")
    @Override
    public <T extends UseCaseDependency> List<T> getExtended(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final UseCaseDependency element : getExtended()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6949127e-b833-4070-9352-f8c9dd6f5bd0")
    @Override
    public UseCase getOwner() {
        Object obj = getDepVal(((ExtensionPointSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof UseCase)? (UseCase)obj : null;
    }

    @objid ("976d822a-a77e-48be-9a44-0b8488e4ce58")
    @Override
    public void setOwner(UseCase value) {
        appendDepVal(((ExtensionPointSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("fcfd31f6-7522-4a46-8291-e45488dbbab7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((ExtensionPointSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a134a654-32e8-46eb-870d-c107d74974a9")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((ExtensionPointSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("d2423140-3151-41ec-a847-d3369b9178ea")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExtensionPoint(this);
        else
          return null;
    }

}
