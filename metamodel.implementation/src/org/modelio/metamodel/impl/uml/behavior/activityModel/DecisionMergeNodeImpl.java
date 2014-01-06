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
    @objid ("8c53c9c1-4128-4496-916c-0f6f8d991e09")
    @Override
    public DecisionNodeKind getDecisionKind() {
        return (DecisionNodeKind) getAttVal(DecisionMergeNodeData.Metadata.DecisionKindAtt());
    }

    @objid ("efccbfa6-d78c-4aa2-9d1f-c847692c8102")
    @Override
    public void setDecisionKind(DecisionNodeKind value) {
        setAttVal(DecisionMergeNodeData.Metadata.DecisionKindAtt(), value);
    }

    @objid ("7dfc095c-45e9-4948-9be4-22ebe0f0b482")
    @Override
    public String getDecisionInputBehavior() {
        return (String) getAttVal(DecisionMergeNodeData.Metadata.DecisionInputBehaviorAtt());
    }

    @objid ("169b953b-0fe4-4cc6-81eb-8146fd10b66c")
    @Override
    public void setDecisionInputBehavior(String value) {
        setAttVal(DecisionMergeNodeData.Metadata.DecisionInputBehaviorAtt(), value);
    }

    @objid ("93596a4a-31bd-4451-84ca-d102b1a16ce8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3e38466e-22aa-4943-abf4-b013cc293c04")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("56d8aeaf-8914-4006-9c98-76e742c3e0fd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDecisionMergeNode(this);
        else
          return null;
    }

}
