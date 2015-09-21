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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ForkJoinNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0033e794-c4bf-1fd8-97fe-001ec947cd2a")
public class ForkJoinNodeImpl extends ControlNodeImpl implements ForkJoinNode {
    @objid ("ebace509-9d3e-46e7-b13e-6c29ce137dbf")
    @Override
    public boolean isIsCombineDuplicate() {
        return (Boolean) getAttVal(((ForkJoinNodeSmClass)getClassOf()).getIsCombineDuplicateAtt());
    }

    @objid ("c871a8ce-bb37-4adf-a119-6d69bce8c490")
    @Override
    public void setIsCombineDuplicate(boolean value) {
        setAttVal(((ForkJoinNodeSmClass)getClassOf()).getIsCombineDuplicateAtt(), value);
    }

    @objid ("7e02e6e0-3cae-47d6-8a32-b67519b9c26b")
    @Override
    public String getJoinSpec() {
        return (String) getAttVal(((ForkJoinNodeSmClass)getClassOf()).getJoinSpecAtt());
    }

    @objid ("c3e563a0-51df-4f55-930c-2a5f58f46da5")
    @Override
    public void setJoinSpec(String value) {
        setAttVal(((ForkJoinNodeSmClass)getClassOf()).getJoinSpecAtt(), value);
    }

    @objid ("851d786a-3c87-4e99-b2e2-cb65bf9a5ecf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("542bfa87-19be-4004-93d1-856e8a2b9683")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("b154f737-1336-4db0-8c15-cd4d51aa2e91")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitForkJoinNode(this);
        else
          return null;
    }

}
