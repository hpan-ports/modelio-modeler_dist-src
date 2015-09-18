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
    @objid ("7d346b3c-013a-4d38-9558-a8dd330d06a7")
    @Override
    public boolean isIsCombineDuplicate() {
        return (Boolean) getAttVal(ForkJoinNodeData.Metadata.IsCombineDuplicateAtt());
    }

    @objid ("d4aaeafd-f40e-4057-8c18-06617f9fe978")
    @Override
    public void setIsCombineDuplicate(boolean value) {
        setAttVal(ForkJoinNodeData.Metadata.IsCombineDuplicateAtt(), value);
    }

    @objid ("3969a63b-ce60-4838-83d9-00da7c3c144b")
    @Override
    public String getJoinSpec() {
        return (String) getAttVal(ForkJoinNodeData.Metadata.JoinSpecAtt());
    }

    @objid ("a4f719b5-6669-4593-96b0-d6c066e46d37")
    @Override
    public void setJoinSpec(String value) {
        setAttVal(ForkJoinNodeData.Metadata.JoinSpecAtt(), value);
    }

    @objid ("12286159-404c-48b0-ad55-22eb7974d824")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e869ab1a-de77-45ab-a71b-bef1cc9912ef")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("7b451dba-413c-4860-9d55-841bd5b27000")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitForkJoinNode(this);
        else
          return null;
    }

}
