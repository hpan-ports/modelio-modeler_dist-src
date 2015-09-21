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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.activityModel.InputPinData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00353996-c4bf-1fd8-97fe-001ec947cd2a")
public class InputPinImpl extends PinImpl implements InputPin {
    @objid ("2ef5044f-100a-4c29-8677-e721f22394a9")
    @Override
    public boolean isIsSelf() {
        return (Boolean) getAttVal(((InputPinSmClass)getClassOf()).getIsSelfAtt());
    }

    @objid ("88fc00cc-e616-4107-a8d3-2fe3f32b7d17")
    @Override
    public void setIsSelf(boolean value) {
        setAttVal(((InputPinSmClass)getClassOf()).getIsSelfAtt(), value);
    }

    @objid ("38ef7137-aba6-4a45-8a7f-b1cd3449081a")
    @Override
    public EList<ExceptionHandler> getHandler() {
        return new SmList<>(this, ((InputPinSmClass)getClassOf()).getHandlerDep());
    }

    @objid ("1994b410-bd1a-44dc-b218-1a5e5d0bcb17")
    @Override
    public <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ExceptionHandler element : getHandler()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0de0cbbc-5ab1-4265-81bb-c126652cc04b")
    @Override
    public ActivityAction getInputing() {
        Object obj = getDepVal(((InputPinSmClass)getClassOf()).getInputingDep());
        return (obj instanceof ActivityAction)? (ActivityAction)obj : null;
    }

    @objid ("6e42bb0e-7cfa-47b2-9829-27d90269cf0a")
    @Override
    public void setInputing(ActivityAction value) {
        appendDepVal(((InputPinSmClass)getClassOf()).getInputingDep(), (SmObjectImpl)value);
    }

    @objid ("9bb78476-5ce6-4eb6-8c94-45c6dcb1f14c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Inputing
        obj = (SmObjectImpl)this.getDepVal(((InputPinSmClass)getClassOf()).getInputingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("78d8a259-57e9-4d88-b62a-e8fff5209736")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Inputing
        dep = ((InputPinSmClass)getClassOf()).getInputingDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("7aadb2c2-0c49-42fb-b5f2-5f71b5e14c65")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInputPin(this);
        else
          return null;
    }

}
