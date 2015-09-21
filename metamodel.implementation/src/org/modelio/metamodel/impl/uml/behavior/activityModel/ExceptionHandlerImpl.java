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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExceptionHandlerData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0030ab7e-c4bf-1fd8-97fe-001ec947cd2a")
public class ExceptionHandlerImpl extends ModelElementImpl implements ExceptionHandler {
    @objid ("40c7bd32-3b1a-461b-8b32-da6142cedb45")
    @Override
    public String getGuard() {
        return (String) getAttVal(((ExceptionHandlerSmClass)getClassOf()).getGuardAtt());
    }

    @objid ("73450eaa-01c7-400d-82da-6d37f723002a")
    @Override
    public void setGuard(String value) {
        setAttVal(((ExceptionHandlerSmClass)getClassOf()).getGuardAtt(), value);
    }

    @objid ("3402cd79-ec64-4116-b2c0-f7af5fafdf00")
    @Override
    public String getWeight() {
        return (String) getAttVal(((ExceptionHandlerSmClass)getClassOf()).getWeightAtt());
    }

    @objid ("df7ed84c-9b3d-4116-91df-36f20987e32e")
    @Override
    public void setWeight(String value) {
        setAttVal(((ExceptionHandlerSmClass)getClassOf()).getWeightAtt(), value);
    }

    @objid ("fb18bbf3-5ab0-4e83-b644-5542282bff06")
    @Override
    public ActivityAction getProtectedNode() {
        Object obj = getDepVal(((ExceptionHandlerSmClass)getClassOf()).getProtectedNodeDep());
        return (obj instanceof ActivityAction)? (ActivityAction)obj : null;
    }

    @objid ("27251f18-5312-4464-9fa8-b43d96bba06e")
    @Override
    public void setProtectedNode(ActivityAction value) {
        appendDepVal(((ExceptionHandlerSmClass)getClassOf()).getProtectedNodeDep(), (SmObjectImpl)value);
    }

    @objid ("1b1c10c8-daab-4258-a278-834428751c3c")
    @Override
    public InputPin getExceptionInput() {
        Object obj = getDepVal(((ExceptionHandlerSmClass)getClassOf()).getExceptionInputDep());
        return (obj instanceof InputPin)? (InputPin)obj : null;
    }

    @objid ("01e3ed99-f5ff-405f-949b-fcf930e2069d")
    @Override
    public void setExceptionInput(InputPin value) {
        appendDepVal(((ExceptionHandlerSmClass)getClassOf()).getExceptionInputDep(), (SmObjectImpl)value);
    }

    @objid ("b524497e-20ad-493c-8177-c4c0f5273e16")
    @Override
    public EList<GeneralClass> getExceptionType() {
        return new SmList<>(this, ((ExceptionHandlerSmClass)getClassOf()).getExceptionTypeDep());
    }

    @objid ("4f317b94-2628-416c-bc19-58e72d41a195")
    @Override
    public <T extends GeneralClass> List<T> getExceptionType(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final GeneralClass element : getExceptionType()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d4b8ee78-f78a-419a-923d-d90390aaf88b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // ProtectedNode
        obj = (SmObjectImpl)this.getDepVal(((ExceptionHandlerSmClass)getClassOf()).getProtectedNodeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("bea457d7-68ad-4941-a110-98b64c636224")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // ProtectedNode
        dep = ((ExceptionHandlerSmClass)getClassOf()).getProtectedNodeDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("fba21f71-f9fb-4b43-9f5c-a4be9f963d35")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExceptionHandler(this);
        else
          return null;
    }

}
