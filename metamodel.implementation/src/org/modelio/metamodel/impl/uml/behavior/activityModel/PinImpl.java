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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.activityModel.PinData;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("003cae42-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class PinImpl extends ObjectNodeImpl implements Pin {
    @objid ("80f6001e-0877-4a07-96b5-85fe93b4c20a")
    @Override
    public boolean isIsControl() {
        return (Boolean) getAttVal(((PinSmClass)getClassOf()).getIsControlAtt());
    }

    @objid ("cebf3272-123c-477f-b042-667670bff025")
    @Override
    public void setIsControl(boolean value) {
        setAttVal(((PinSmClass)getClassOf()).getIsControlAtt(), value);
    }

    @objid ("326caaf3-f426-4723-b01a-f14b261ee7ca")
    @Override
    public boolean isIsExpansion() {
        return (Boolean) getAttVal(((PinSmClass)getClassOf()).getIsExpansionAtt());
    }

    @objid ("c997cc3e-0a9f-453b-91af-a232cc529d38")
    @Override
    public void setIsExpansion(boolean value) {
        setAttVal(((PinSmClass)getClassOf()).getIsExpansionAtt(), value);
    }

    @objid ("495f1a52-dbd3-49fe-a3be-85a1d9615a1c")
    @Override
    public Parameter getMatched() {
        Object obj = getDepVal(((PinSmClass)getClassOf()).getMatchedDep());
        return (obj instanceof Parameter)? (Parameter)obj : null;
    }

    @objid ("70e7a0c4-99cf-4142-847d-308b8cb39ce8")
    @Override
    public void setMatched(Parameter value) {
        appendDepVal(((PinSmClass)getClassOf()).getMatchedDep(), (SmObjectImpl)value);
    }

    @objid ("2970b349-4280-4363-9d8d-2d546fe86041")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("fa44b717-4b1d-4650-bb73-47b5951113e2")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("5853d6e0-a478-428a-ba7d-e1fb56d822a3")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPin(this);
        else
          return null;
    }

}
