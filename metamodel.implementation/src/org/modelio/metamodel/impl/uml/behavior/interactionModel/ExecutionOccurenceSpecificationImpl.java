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
    @objid ("f6ca08a7-c654-4d93-b55a-e324e741a332")
    @Override
    public ExecutionSpecification getFinished() {
        return (ExecutionSpecification) getDepVal(ExecutionOccurenceSpecificationData.Metadata.FinishedDep());
    }

    @objid ("e17b448c-b3d4-4e56-b98e-b3477f1d6cf3")
    @Override
    public void setFinished(ExecutionSpecification value) {
        appendDepVal(ExecutionOccurenceSpecificationData.Metadata.FinishedDep(), (SmObjectImpl)value);
    }

    @objid ("26fb9ec1-a159-4178-a4bd-0ba30b198450")
    @Override
    public ExecutionSpecification getStarted() {
        return (ExecutionSpecification) getDepVal(ExecutionOccurenceSpecificationData.Metadata.StartedDep());
    }

    @objid ("e3c372a9-ffa8-45d0-998e-51c8ddfe45fa")
    @Override
    public void setStarted(ExecutionSpecification value) {
        appendDepVal(ExecutionOccurenceSpecificationData.Metadata.StartedDep(), (SmObjectImpl)value);
    }

    @objid ("867f2b74-74cb-4886-be18-7c972d7686b5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c5953bd6-dbc8-4d7e-88fd-8cdf18e25ca2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("00cbae23-f856-4548-85bc-957e5d3c015e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExecutionOccurenceSpecification(this);
        else
          return null;
    }

}
