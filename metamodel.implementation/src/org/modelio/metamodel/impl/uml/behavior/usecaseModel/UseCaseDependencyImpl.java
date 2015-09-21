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
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.UseCaseDependencyData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00592d06-c4bf-1fd8-97fe-001ec947cd2a")
public class UseCaseDependencyImpl extends ModelElementImpl implements UseCaseDependency {
    @objid ("d64bc777-c7f3-4259-a961-56990bdf3b99")
    @Override
    public UseCase getOrigin() {
        Object obj = getDepVal(((UseCaseDependencySmClass)getClassOf()).getOriginDep());
        return (obj instanceof UseCase)? (UseCase)obj : null;
    }

    @objid ("0850b964-4e48-44e5-bc73-aec2b39194bf")
    @Override
    public void setOrigin(UseCase value) {
        appendDepVal(((UseCaseDependencySmClass)getClassOf()).getOriginDep(), (SmObjectImpl)value);
    }

    @objid ("5a6dcce4-0938-4587-886c-4cc6173e3910")
    @Override
    public EList<ExtensionPoint> getExtensionLocation() {
        return new SmList<>(this, ((UseCaseDependencySmClass)getClassOf()).getExtensionLocationDep());
    }

    @objid ("504a41ee-91e8-4f73-9eac-163b7911bcd3")
    @Override
    public <T extends ExtensionPoint> List<T> getExtensionLocation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ExtensionPoint element : getExtensionLocation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("73f323be-17d7-4ae5-9a2e-7f4b79a34180")
    @Override
    public UseCase getTarget() {
        Object obj = getDepVal(((UseCaseDependencySmClass)getClassOf()).getTargetDep());
        return (obj instanceof UseCase)? (UseCase)obj : null;
    }

    @objid ("9370d7db-5193-4207-a8a1-9b16370812c5")
    @Override
    public void setTarget(UseCase value) {
        appendDepVal(((UseCaseDependencySmClass)getClassOf()).getTargetDep(), (SmObjectImpl)value);
    }

    @objid ("6d22f1ff-eaf5-471e-beaa-0ed9c35044ec")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Origin
        obj = (SmObjectImpl)this.getDepVal(((UseCaseDependencySmClass)getClassOf()).getOriginDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("14e8f7b9-010e-4225-9460-9f39d01e0d84")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Origin
        dep = ((UseCaseDependencySmClass)getClassOf()).getOriginDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("041d5ba4-5559-4e9c-be45-7b17991f3522")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitUseCaseDependency(this);
        else
          return null;
    }

}
