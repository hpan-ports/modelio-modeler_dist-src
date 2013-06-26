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
    @objid ("aa8ed054-8af4-4225-a9ae-b5aaaa1bc229")
    @Override
    public ExecutionOccurenceSpecification getFinish() {
        return (ExecutionOccurenceSpecification) getDepVal(ExecutionSpecificationData.Metadata.FinishDep());
    }

    @objid ("9fb9744a-b6da-4092-99e0-ada02de99aad")
    @Override
    public void setFinish(ExecutionOccurenceSpecification value) {
        appendDepVal(ExecutionSpecificationData.Metadata.FinishDep(), (SmObjectImpl)value);
    }

    @objid ("a006bd31-b239-4e5b-bee9-60617519cd74")
    @Override
    public ExecutionOccurenceSpecification getStart() {
        return (ExecutionOccurenceSpecification) getDepVal(ExecutionSpecificationData.Metadata.StartDep());
    }

    @objid ("6c09b9a7-bcc6-4491-8851-1d21fa1ae404")
    @Override
    public void setStart(ExecutionOccurenceSpecification value) {
        appendDepVal(ExecutionSpecificationData.Metadata.StartDep(), (SmObjectImpl)value);
    }

    @objid ("d1b5aad2-a337-452d-9c19-e13a04c91f9a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c28f424e-b6f5-4fec-bbcc-f7fbdab6afc6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("c37df38c-8320-49e8-b3c7-a7160a625b50")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExecutionSpecification(this);
        else
          return null;
    }

}
