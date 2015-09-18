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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.ExecutionSpecificationData;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0044efbc-c4bf-1fd8-97fe-001ec947cd2a")
public class ExecutionSpecificationImpl extends InteractionFragmentImpl implements ExecutionSpecification {
    @objid ("c6517bea-224a-4d5f-be28-689f48d49bbf")
    @Override
    public ExecutionOccurenceSpecification getFinish() {
        return (ExecutionOccurenceSpecification) getDepVal(ExecutionSpecificationData.Metadata.FinishDep());
    }

    @objid ("15f15a5f-62d6-40c3-82aa-09bd8ed5d7d8")
    @Override
    public void setFinish(ExecutionOccurenceSpecification value) {
        appendDepVal(ExecutionSpecificationData.Metadata.FinishDep(), (SmObjectImpl)value);
    }

    @objid ("932423d5-1c61-4b1d-bd43-5a0faa2dcf5a")
    @Override
    public ExecutionOccurenceSpecification getStart() {
        return (ExecutionOccurenceSpecification) getDepVal(ExecutionSpecificationData.Metadata.StartDep());
    }

    @objid ("dca13a8f-0d37-4f1c-a4ea-b41b9ebc8863")
    @Override
    public void setStart(ExecutionOccurenceSpecification value) {
        appendDepVal(ExecutionSpecificationData.Metadata.StartDep(), (SmObjectImpl)value);
    }

    @objid ("6a50038d-c808-4fb4-8b50-b784796745ac")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("4bea17d8-e394-481a-847f-be2c21785c6f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("679ff790-1645-4657-a3c4-d8b0d84124a8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExecutionSpecification(this);
        else
          return null;
    }

}
