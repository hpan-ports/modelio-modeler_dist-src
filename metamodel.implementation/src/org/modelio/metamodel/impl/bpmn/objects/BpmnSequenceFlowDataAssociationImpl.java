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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.impl.bpmn.objects.BpmnSequenceFlowDataAssociationData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00054970-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnSequenceFlowDataAssociationImpl extends BpmnBaseElementImpl implements BpmnSequenceFlowDataAssociation {
    @objid ("c1dddea5-b672-4986-936d-93c064ff8fed")
    @Override
    public BpmnSequenceFlow getConnected() {
        Object obj = getDepVal(((BpmnSequenceFlowDataAssociationSmClass)getClassOf()).getConnectedDep());
        return (obj instanceof BpmnSequenceFlow)? (BpmnSequenceFlow)obj : null;
    }

    @objid ("693582f1-6020-4ede-a991-0d69d31c9694")
    @Override
    public void setConnected(BpmnSequenceFlow value) {
        appendDepVal(((BpmnSequenceFlowDataAssociationSmClass)getClassOf()).getConnectedDep(), (SmObjectImpl)value);
    }

    @objid ("3d119bb9-f828-4bd9-a6e2-acbf2be4f811")
    @Override
    public EList<BpmnDataAssociation> getDataAssociation() {
        return new SmList<>(this, ((BpmnSequenceFlowDataAssociationSmClass)getClassOf()).getDataAssociationDep());
    }

    @objid ("a83f0554-fff4-40c9-a343-ff34218e9915")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataAssociation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnDataAssociation element : getDataAssociation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("be4376d5-1d85-4ab3-81a8-242bbea5e46c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Connected
        obj = (SmObjectImpl)this.getDepVal(((BpmnSequenceFlowDataAssociationSmClass)getClassOf()).getConnectedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5956553f-3ad8-4dc3-81b3-f4583b7a47b5")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Connected
        dep = ((BpmnSequenceFlowDataAssociationSmClass)getClassOf()).getConnectedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("54dacdda-3936-4acc-b48b-89b4ca29ae13")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSequenceFlowDataAssociation(this);
        else
          return null;
    }

}
