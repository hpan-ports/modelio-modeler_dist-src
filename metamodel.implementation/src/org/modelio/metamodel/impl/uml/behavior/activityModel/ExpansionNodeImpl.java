/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.ExpansionNodeData;
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

@objid ("00314c5a-c4bf-1fd8-97fe-001ec947cd2a")
public class ExpansionNodeImpl extends ObjectNodeImpl implements ExpansionNode {
    @objid ("5a4ba83d-7a66-42b1-9d0d-cfeeeb15564b")
    @Override
    public ExpansionRegion getRegionAsOutput() {
        return (ExpansionRegion) getDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep());
    }

    @objid ("62ffa9a3-e274-476f-b347-f9cc40622d9a")
    @Override
    public void setRegionAsOutput(ExpansionRegion value) {
        appendDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep(), (SmObjectImpl)value);
    }

    @objid ("b6c6e525-1873-4d92-b2c0-3f957238e82f")
    @Override
    public ExpansionRegion getRegionAsInput() {
        return (ExpansionRegion) getDepVal(ExpansionNodeData.Metadata.RegionAsInputDep());
    }

    @objid ("a5bbc37a-7d25-464e-b943-68f7a054f637")
    @Override
    public void setRegionAsInput(ExpansionRegion value) {
        appendDepVal(ExpansionNodeData.Metadata.RegionAsInputDep(), (SmObjectImpl)value);
    }

    @objid ("2e0050c7-e78f-4c58-b734-983b1f98f3ce")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ExpansionNodeData.Metadata.RegionAsInputDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("cbb5d768-c223-4cd1-a3a1-f34d2d2ebaa7")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep());
        if (obj != null)
          return new SmDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ExpansionNodeData.Metadata.RegionAsInputDep());
        if (obj != null)
          return new SmDepVal(ExpansionNodeData.Metadata.RegionAsInputDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f2de3a7d-a128-4193-b38c-e8b6cd220916")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExpansionNode(this);
        else
          return null;
    }

}
