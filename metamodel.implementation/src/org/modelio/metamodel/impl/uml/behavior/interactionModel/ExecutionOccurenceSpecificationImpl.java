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
    @objid ("748b63cf-951a-4e86-badb-226c8660a4a9")
    @Override
    public ExecutionSpecification getFinished() {
        return (ExecutionSpecification) getDepVal(ExecutionOccurenceSpecificationData.Metadata.FinishedDep());
    }

    @objid ("8d5cc318-e259-4b6f-bb7e-2fb7b1fac87a")
    @Override
    public void setFinished(ExecutionSpecification value) {
        appendDepVal(ExecutionOccurenceSpecificationData.Metadata.FinishedDep(), (SmObjectImpl)value);
    }

    @objid ("f58d642f-de7a-49be-9ddf-06eb5fd9ff4c")
    @Override
    public ExecutionSpecification getStarted() {
        return (ExecutionSpecification) getDepVal(ExecutionOccurenceSpecificationData.Metadata.StartedDep());
    }

    @objid ("8c8fbbc5-6045-4b06-b776-a52385076365")
    @Override
    public void setStarted(ExecutionSpecification value) {
        appendDepVal(ExecutionOccurenceSpecificationData.Metadata.StartedDep(), (SmObjectImpl)value);
    }

    @objid ("061f036a-478e-4efb-9819-1c880875231e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("47b5beee-6c38-452d-a46c-ad1bf0986184")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("281b5fdf-2bda-40a9-8097-9ad30d2c4117")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExecutionOccurenceSpecification(this);
        else
          return null;
    }

}
