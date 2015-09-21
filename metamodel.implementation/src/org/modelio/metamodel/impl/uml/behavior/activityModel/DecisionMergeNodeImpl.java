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
import org.modelio.metamodel.impl.uml.behavior.activityModel.DecisionMergeNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionMergeNode;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionNodeKind;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("002ff30a-c4bf-1fd8-97fe-001ec947cd2a")
public class DecisionMergeNodeImpl extends ControlNodeImpl implements DecisionMergeNode {
    @objid ("76674e2c-7e9a-4db4-8ca2-c5e45a04a564")
    @Override
    public DecisionNodeKind getDecisionKind() {
        return (DecisionNodeKind) getAttVal(((DecisionMergeNodeSmClass)getClassOf()).getDecisionKindAtt());
    }

    @objid ("2356497a-a615-4459-ae11-92c6ecc07be0")
    @Override
    public void setDecisionKind(DecisionNodeKind value) {
        setAttVal(((DecisionMergeNodeSmClass)getClassOf()).getDecisionKindAtt(), value);
    }

    @objid ("80abe13f-e87c-4f06-8273-587213f8be44")
    @Override
    public String getDecisionInputBehavior() {
        return (String) getAttVal(((DecisionMergeNodeSmClass)getClassOf()).getDecisionInputBehaviorAtt());
    }

    @objid ("505f9183-d599-4171-821b-6d5c14c5c5fb")
    @Override
    public void setDecisionInputBehavior(String value) {
        setAttVal(((DecisionMergeNodeSmClass)getClassOf()).getDecisionInputBehaviorAtt(), value);
    }

    @objid ("e8d8752f-2e1a-4d09-8be3-520fba013e64")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("1820d28f-7679-4967-890e-b99345777f07")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("9214bc76-0e3c-41d5-ae68-6722fa6819e3")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDecisionMergeNode(this);
        else
          return null;
    }

}
