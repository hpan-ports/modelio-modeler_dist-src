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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
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
    @objid ("ed8fbcb7-35b4-4d6c-a907-aeebe535f2a1")
    @Override
    public ExpansionRegion getRegionAsOutput() {
        return (ExpansionRegion) getDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep());
    }

    @objid ("98871920-a96e-48c0-bb52-a9d829b18398")
    @Override
    public void setRegionAsOutput(ExpansionRegion value) {
        appendDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep(), (SmObjectImpl)value);
    }

    @objid ("48e6e549-7f1b-4aaa-904e-0df8b562c354")
    @Override
    public ExpansionRegion getRegionAsInput() {
        return (ExpansionRegion) getDepVal(ExpansionNodeData.Metadata.RegionAsInputDep());
    }

    @objid ("acf58de9-664c-4a5d-bdd6-31e58b10dd3c")
    @Override
    public void setRegionAsInput(ExpansionRegion value) {
        appendDepVal(ExpansionNodeData.Metadata.RegionAsInputDep(), (SmObjectImpl)value);
    }

    @objid ("ba430860-15b2-4e1d-bd73-b677d806990d")
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

    @objid ("8a3b1e7e-a5df-410b-ac11-bc3b0fe3c711")
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

    @objid ("eca0aa96-aa85-41f1-b69d-48a06514b1cb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExpansionNode(this);
        else
          return null;
    }

}
