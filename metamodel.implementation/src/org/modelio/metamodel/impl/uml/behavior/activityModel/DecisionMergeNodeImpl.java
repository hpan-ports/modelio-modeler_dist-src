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
    @objid ("dd48a850-1c20-4439-9b2c-d62041a8c710")
    @Override
    public DecisionNodeKind getDecisionKind() {
        return (DecisionNodeKind) getAttVal(DecisionMergeNodeData.Metadata.DecisionKindAtt());
    }

    @objid ("0f930bbe-7f80-4df8-9340-dfe9aa4e011a")
    @Override
    public void setDecisionKind(DecisionNodeKind value) {
        setAttVal(DecisionMergeNodeData.Metadata.DecisionKindAtt(), value);
    }

    @objid ("4178144c-ec9f-4f88-91c8-2db9942c742f")
    @Override
    public String getDecisionInputBehavior() {
        return (String) getAttVal(DecisionMergeNodeData.Metadata.DecisionInputBehaviorAtt());
    }

    @objid ("358064d2-51b2-4685-bec4-0cfc55a95953")
    @Override
    public void setDecisionInputBehavior(String value) {
        setAttVal(DecisionMergeNodeData.Metadata.DecisionInputBehaviorAtt(), value);
    }

    @objid ("1be308cd-bfc3-4146-ae52-6b745ee1026e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("75e05d1d-a88d-4abe-b506-b735ea8e3640")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f1771a13-e7a8-4acd-b405-b2c1ebb7ed3f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDecisionMergeNode(this);
        else
          return null;
    }

}
