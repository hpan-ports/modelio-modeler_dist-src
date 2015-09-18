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
import org.modelio.metamodel.data.uml.behavior.activityModel.DecisionMergeNodeData;
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

@objid ("002ff30a-c4bf-1fd8-97fe-001ec947cd2a")
public class DecisionMergeNodeImpl extends ControlNodeImpl implements DecisionMergeNode {
    @objid ("3ae66cfd-0165-40a2-87e4-d0c075ccaaf0")
    @Override
    public DecisionNodeKind getDecisionKind() {
        return (DecisionNodeKind) getAttVal(DecisionMergeNodeData.Metadata.DecisionKindAtt());
    }

    @objid ("6058aae6-53de-41ed-bef8-e1b7ec16f818")
    @Override
    public void setDecisionKind(DecisionNodeKind value) {
        setAttVal(DecisionMergeNodeData.Metadata.DecisionKindAtt(), value);
    }

    @objid ("1ea9d52e-bde0-4f4d-b36c-58eb7fbfaf15")
    @Override
    public String getDecisionInputBehavior() {
        return (String) getAttVal(DecisionMergeNodeData.Metadata.DecisionInputBehaviorAtt());
    }

    @objid ("a959bdcf-7f54-43d9-b87a-a63c72576c88")
    @Override
    public void setDecisionInputBehavior(String value) {
        setAttVal(DecisionMergeNodeData.Metadata.DecisionInputBehaviorAtt(), value);
    }

    @objid ("966bfd41-b49a-452c-9dae-ca29c1a58c60")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3a959adb-43ca-47b7-8e49-3f4403131e46")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f1b33a0a-b4de-4df9-b241-775021061092")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDecisionMergeNode(this);
        else
          return null;
    }

}
