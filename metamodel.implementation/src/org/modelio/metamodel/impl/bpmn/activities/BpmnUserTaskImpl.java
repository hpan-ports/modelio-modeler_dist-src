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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnUserTask;
import org.modelio.metamodel.data.bpmn.activities.BpmnUserTaskData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0086559c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnUserTaskImpl extends BpmnTaskImpl implements BpmnUserTask {
    @objid ("7caeab32-f65f-4ae6-aca2-79a236239cd0")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnUserTaskData.Metadata.ImplementationAtt());
    }

    @objid ("d45b60fd-35f5-4ca9-b471-df2f1a5249cf")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnUserTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("56fa37bd-020d-45b4-b45b-4be38d9962d6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("cf896a86-de3e-4d50-8558-945d242802ce")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2612ffa9-5e6e-40fa-8ad5-34a95234303f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnUserTask(this);
        else
          return null;
    }

}
