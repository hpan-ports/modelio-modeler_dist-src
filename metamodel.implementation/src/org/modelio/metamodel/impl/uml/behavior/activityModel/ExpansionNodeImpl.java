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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ExpansionNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00314c5a-c4bf-1fd8-97fe-001ec947cd2a")
public class ExpansionNodeImpl extends ObjectNodeImpl implements ExpansionNode {
    @objid ("235ae3ca-7157-4efb-a8a9-d28b5be2131c")
    @Override
    public ExpansionRegion getRegionAsOutput() {
        Object obj = getDepVal(((ExpansionNodeSmClass)getClassOf()).getRegionAsOutputDep());
        return (obj instanceof ExpansionRegion)? (ExpansionRegion)obj : null;
    }

    @objid ("f70a3927-3e1e-4a92-ae8d-84bd138043df")
    @Override
    public void setRegionAsOutput(ExpansionRegion value) {
        appendDepVal(((ExpansionNodeSmClass)getClassOf()).getRegionAsOutputDep(), (SmObjectImpl)value);
    }

    @objid ("e99b2117-19c7-4cdc-aab9-00887502c9a2")
    @Override
    public ExpansionRegion getRegionAsInput() {
        Object obj = getDepVal(((ExpansionNodeSmClass)getClassOf()).getRegionAsInputDep());
        return (obj instanceof ExpansionRegion)? (ExpansionRegion)obj : null;
    }

    @objid ("cfc8f488-b642-441d-9851-949bd75ff1de")
    @Override
    public void setRegionAsInput(ExpansionRegion value) {
        appendDepVal(((ExpansionNodeSmClass)getClassOf()).getRegionAsInputDep(), (SmObjectImpl)value);
    }

    @objid ("f60cd229-eb23-42af-bbb7-3e0f025438e5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // RegionAsOutput
        obj = (SmObjectImpl)this.getDepVal(((ExpansionNodeSmClass)getClassOf()).getRegionAsOutputDep());
        if (obj != null)
          return obj;
        // RegionAsInput
        obj = (SmObjectImpl)this.getDepVal(((ExpansionNodeSmClass)getClassOf()).getRegionAsInputDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ce7c49ee-5e2f-4627-87d5-c5d75e12ddea")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // RegionAsOutput
        dep = ((ExpansionNodeSmClass)getClassOf()).getRegionAsOutputDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // RegionAsInput
        dep = ((ExpansionNodeSmClass)getClassOf()).getRegionAsInputDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("5e6a4be4-9209-4cc9-80e2-bf5356f2f142")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExpansionNode(this);
        else
          return null;
    }

}
