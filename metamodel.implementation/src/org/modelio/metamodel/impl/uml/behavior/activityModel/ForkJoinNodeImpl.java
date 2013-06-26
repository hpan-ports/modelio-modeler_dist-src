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
import org.modelio.metamodel.data.uml.behavior.activityModel.ForkJoinNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0033e794-c4bf-1fd8-97fe-001ec947cd2a")
public class ForkJoinNodeImpl extends ControlNodeImpl implements ForkJoinNode {
    @objid ("83867a66-0d88-4cc5-8197-ffced8a8febc")
    @Override
    public boolean isIsCombineDuplicate() {
        return (Boolean) getAttVal(ForkJoinNodeData.Metadata.IsCombineDuplicateAtt());
    }

    @objid ("4473ab55-f3e0-4dd6-8f93-ae691751a797")
    @Override
    public void setIsCombineDuplicate(boolean value) {
        setAttVal(ForkJoinNodeData.Metadata.IsCombineDuplicateAtt(), value);
    }

    @objid ("3b4ce674-9283-42eb-994c-ce93caacb897")
    @Override
    public String getJoinSpec() {
        return (String) getAttVal(ForkJoinNodeData.Metadata.JoinSpecAtt());
    }

    @objid ("880dd587-40d9-44f8-bb13-836e1ae7b8de")
    @Override
    public void setJoinSpec(String value) {
        setAttVal(ForkJoinNodeData.Metadata.JoinSpecAtt(), value);
    }

    @objid ("00595c59-d55d-4be9-b85b-57f57b8bf85b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2dda2d8c-a245-44b9-acab-b6086bd43b51")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f20bc4e7-8ff6-4750-a725-6671dc7e46fb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitForkJoinNode(this);
        else
          return null;
    }

}
