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
import org.modelio.metamodel.impl.uml.behavior.activityModel.MessageFlowData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00381364-c4bf-1fd8-97fe-001ec947cd2a")
public class MessageFlowImpl extends ActivityEdgeImpl implements MessageFlow {
    @objid ("2b0eeab1-3343-455a-905a-a278e517a281")
    @Override
    public ActivityPartition getTargetPartition() {
        Object obj = getDepVal(((MessageFlowSmClass)getClassOf()).getTargetPartitionDep());
        return (obj instanceof ActivityPartition)? (ActivityPartition)obj : null;
    }

    @objid ("8b979251-9179-4197-83b9-cb2f9afbed62")
    @Override
    public void setTargetPartition(ActivityPartition value) {
        appendDepVal(((MessageFlowSmClass)getClassOf()).getTargetPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("8c0867a4-87e1-4171-ae25-888a150d592f")
    @Override
    public ActivityPartition getSourcePartition() {
        Object obj = getDepVal(((MessageFlowSmClass)getClassOf()).getSourcePartitionDep());
        return (obj instanceof ActivityPartition)? (ActivityPartition)obj : null;
    }

    @objid ("bc0ceee3-8452-4676-923d-e0974c8834f5")
    @Override
    public void setSourcePartition(ActivityPartition value) {
        appendDepVal(((MessageFlowSmClass)getClassOf()).getSourcePartitionDep(), (SmObjectImpl)value);
    }

    @objid ("61e0adb1-962b-42a4-861f-df633e9a3bc5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // SourcePartition
        obj = (SmObjectImpl)this.getDepVal(((MessageFlowSmClass)getClassOf()).getSourcePartitionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9354f08a-6c32-41ba-9aa3-4fbc58f83619")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // SourcePartition
        dep = ((MessageFlowSmClass)getClassOf()).getSourcePartitionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("5af518c9-12b0-447c-9c03-92f303a7ac19")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessageFlow(this);
        else
          return null;
    }

}
