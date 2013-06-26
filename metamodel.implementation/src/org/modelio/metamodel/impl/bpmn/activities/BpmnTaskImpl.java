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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.data.bpmn.activities.BpmnTaskData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0084e734-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnTaskImpl extends BpmnActivityImpl implements BpmnTask {
    @objid ("ec05b8e7-6ff9-4cf1-916b-75449d586781")
    @Override
    public boolean isIsGlobal() {
        return (Boolean) getAttVal(BpmnTaskData.Metadata.IsGlobalAtt());
    }

    @objid ("8b8631de-defe-4732-8cdc-39a1bf738cd9")
    @Override
    public void setIsGlobal(boolean value) {
        setAttVal(BpmnTaskData.Metadata.IsGlobalAtt(), value);
    }

    @objid ("e68cc067-fc99-4f86-8fc6-e8dabd4c0e28")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, BpmnTaskData.Metadata.CallerDep());
    }

    @objid ("fca4b250-db81-475c-a9a6-c32809780998")
    @Override
    public <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnCallActivity element : getCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e4a0440e-2c08-47e1-a0c6-76ce4f0e4e82")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("435e8842-7457-4848-8aed-074f6f196c59")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1ac7199c-1483-4d8a-b18d-1c15ca2187a9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTask(this);
        else
          return null;
    }

}
