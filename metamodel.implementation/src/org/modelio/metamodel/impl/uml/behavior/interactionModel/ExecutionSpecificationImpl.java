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
    @objid ("611164e3-fab2-4fce-b5d9-0707f06ce392")
    @Override
    public ExecutionOccurenceSpecification getFinish() {
        return (ExecutionOccurenceSpecification) getDepVal(ExecutionSpecificationData.Metadata.FinishDep());
    }

    @objid ("6c12d12d-11d4-4dae-98e7-a2729b60e109")
    @Override
    public void setFinish(ExecutionOccurenceSpecification value) {
        appendDepVal(ExecutionSpecificationData.Metadata.FinishDep(), (SmObjectImpl)value);
    }

    @objid ("52c13503-9aea-46b7-a132-36db2f2a107c")
    @Override
    public ExecutionOccurenceSpecification getStart() {
        return (ExecutionOccurenceSpecification) getDepVal(ExecutionSpecificationData.Metadata.StartDep());
    }

    @objid ("b9611538-9903-46d5-a15d-dcfb33ad48c4")
    @Override
    public void setStart(ExecutionOccurenceSpecification value) {
        appendDepVal(ExecutionSpecificationData.Metadata.StartDep(), (SmObjectImpl)value);
    }

    @objid ("9c93130c-1539-4e2f-be82-7fa098eef156")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("44447160-d496-4e43-bd6a-824e109f5ef0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2dc4c253-e85f-4880-8a8b-554be287415b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExecutionSpecification(this);
        else
          return null;
    }

}
