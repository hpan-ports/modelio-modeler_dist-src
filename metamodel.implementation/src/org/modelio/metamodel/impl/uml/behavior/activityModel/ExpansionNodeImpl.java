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
/*   Metamodel version: 9019              */
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
    @objid ("2924245a-a931-450c-b64b-4b1e154d84db")
    @Override
    public ExpansionRegion getRegionAsOutput() {
        return (ExpansionRegion) getDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep());
    }

    @objid ("586785ac-b2a8-49c2-a1de-cb6382c1466a")
    @Override
    public void setRegionAsOutput(ExpansionRegion value) {
        appendDepVal(ExpansionNodeData.Metadata.RegionAsOutputDep(), (SmObjectImpl)value);
    }

    @objid ("fd6a6735-c459-40fc-819f-35700543d5b8")
    @Override
    public ExpansionRegion getRegionAsInput() {
        return (ExpansionRegion) getDepVal(ExpansionNodeData.Metadata.RegionAsInputDep());
    }

    @objid ("322bbb3c-b346-4dbd-b972-3b94e8aaa502")
    @Override
    public void setRegionAsInput(ExpansionRegion value) {
        appendDepVal(ExpansionNodeData.Metadata.RegionAsInputDep(), (SmObjectImpl)value);
    }

    @objid ("75aad146-d958-48d4-9358-98e652c10fdf")
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

    @objid ("bb2a70a5-1e46-42e7-85fb-52b7aa5d9674")
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

    @objid ("4e8eac2a-960f-40e7-bfb0-2fd8abd352a9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExpansionNode(this);
        else
          return null;
    }

}
