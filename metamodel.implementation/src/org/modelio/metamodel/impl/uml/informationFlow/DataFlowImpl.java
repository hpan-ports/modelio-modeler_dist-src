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
package org.modelio.metamodel.impl.uml.informationFlow;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.informationFlow.DataFlowData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00648264-c4bf-1fd8-97fe-001ec947cd2a")
public class DataFlowImpl extends ModelElementImpl implements DataFlow {
    @objid ("aae5c876-6446-4c99-a0e2-d872ffb97037")
    @Override
    public NameSpace getDestination() {
        Object obj = getDepVal(((DataFlowSmClass)getClassOf()).getDestinationDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("758decc5-22fc-49ec-bc8a-f859335f4511")
    @Override
    public void setDestination(NameSpace value) {
        appendDepVal(((DataFlowSmClass)getClassOf()).getDestinationDep(), (SmObjectImpl)value);
    }

    @objid ("10466273-7039-455d-8c9d-0e768d9c2d21")
    @Override
    public NameSpace getOrigin() {
        Object obj = getDepVal(((DataFlowSmClass)getClassOf()).getOriginDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("c4129292-01ea-442e-b8b8-9a84cfa19eca")
    @Override
    public void setOrigin(NameSpace value) {
        appendDepVal(((DataFlowSmClass)getClassOf()).getOriginDep(), (SmObjectImpl)value);
    }

    @objid ("e015e467-d3fc-4adf-8614-ed7576918e66")
    @Override
    public NameSpace getOwner() {
        Object obj = getDepVal(((DataFlowSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("e4d445cc-e74c-4c47-a7d8-9b726a1cb707")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(((DataFlowSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("3223d686-6cc0-408d-9446-7fd4dc27e7c2")
    @Override
    public Signal getSModel() {
        Object obj = getDepVal(((DataFlowSmClass)getClassOf()).getSModelDep());
        return (obj instanceof Signal)? (Signal)obj : null;
    }

    @objid ("70788f57-62fe-49f8-851e-6883f8089214")
    @Override
    public void setSModel(Signal value) {
        appendDepVal(((DataFlowSmClass)getClassOf()).getSModelDep(), (SmObjectImpl)value);
    }

    @objid ("aaa10fd3-d9a0-4d7f-9b96-fadaf1602d14")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((DataFlowSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a127a922-0b38-481e-bab1-ee3040419058")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((DataFlowSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("e9859f00-a5fb-4da8-8a9d-5b94f9ab19bc")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDataFlow(this);
        else
          return null;
    }

}
