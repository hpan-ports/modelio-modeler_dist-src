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
import org.modelio.metamodel.data.uml.behavior.interactionModel.ExecutionOccurenceSpecificationData;
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

@objid ("00447406-c4bf-1fd8-97fe-001ec947cd2a")
public class ExecutionOccurenceSpecificationImpl extends MessageEndImpl implements ExecutionOccurenceSpecification {
    @objid ("19939210-6142-4296-a1c3-5d18c2e62a98")
    @Override
    public ExecutionSpecification getFinished() {
        return (ExecutionSpecification) getDepVal(ExecutionOccurenceSpecificationData.Metadata.FinishedDep());
    }

    @objid ("ed3b4e3d-b8a5-42ab-8dfd-d95886c07c2e")
    @Override
    public void setFinished(ExecutionSpecification value) {
        appendDepVal(ExecutionOccurenceSpecificationData.Metadata.FinishedDep(), (SmObjectImpl)value);
    }

    @objid ("5f3eff37-30c8-44a6-a1b5-9a4507645123")
    @Override
    public ExecutionSpecification getStarted() {
        return (ExecutionSpecification) getDepVal(ExecutionOccurenceSpecificationData.Metadata.StartedDep());
    }

    @objid ("d4869738-1991-4f30-9c30-91d25bef785d")
    @Override
    public void setStarted(ExecutionSpecification value) {
        appendDepVal(ExecutionOccurenceSpecificationData.Metadata.StartedDep(), (SmObjectImpl)value);
    }

    @objid ("8837aa5c-92bf-4f0d-9e97-cfbaf5be7d3b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2a614e63-e0a0-47ad-8d03-83b6ae34f0ff")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ba0b6450-f764-491a-bf3f-09d856060b73")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExecutionOccurenceSpecification(this);
        else
          return null;
    }

}
