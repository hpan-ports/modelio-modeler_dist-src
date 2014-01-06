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
    @objid ("3c1ffca4-f183-4b57-ac1e-0a863df64b32")
    @Override
    public boolean isIsCombineDuplicate() {
        return (Boolean) getAttVal(ForkJoinNodeData.Metadata.IsCombineDuplicateAtt());
    }

    @objid ("461cf912-7e36-4316-9d7f-f4f2bf7fbb8e")
    @Override
    public void setIsCombineDuplicate(boolean value) {
        setAttVal(ForkJoinNodeData.Metadata.IsCombineDuplicateAtt(), value);
    }

    @objid ("16f3da7c-3779-4d2e-9aab-010c1d517323")
    @Override
    public String getJoinSpec() {
        return (String) getAttVal(ForkJoinNodeData.Metadata.JoinSpecAtt());
    }

    @objid ("a508fdcd-d3b7-4c03-8fba-c0c7b5f66d23")
    @Override
    public void setJoinSpec(String value) {
        setAttVal(ForkJoinNodeData.Metadata.JoinSpecAtt(), value);
    }

    @objid ("86dddd63-52f1-455a-8200-e9856381e132")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8c3ce4ec-804e-4694-8be2-30ab39ccb3d7")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("7daba37c-a914-4a6e-a2fd-1f8ff386ab90")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitForkJoinNode(this);
        else
          return null;
    }

}
