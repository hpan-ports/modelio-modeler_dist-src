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
    @objid ("9d8f9495-a33d-4bc8-9848-e782b23e99a8")
    @Override
    public boolean isIsGlobal() {
        return (Boolean) getAttVal(BpmnTaskData.Metadata.IsGlobalAtt());
    }

    @objid ("1b989fa4-ce82-4932-8fc6-7e8c9b660116")
    @Override
    public void setIsGlobal(boolean value) {
        setAttVal(BpmnTaskData.Metadata.IsGlobalAtt(), value);
    }

    @objid ("0cefb81c-526d-409e-a5bd-93a30dbaa343")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, BpmnTaskData.Metadata.CallerDep());
    }

    @objid ("e2dff0c1-bd37-44ef-ba21-0394f5396b98")
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

    @objid ("e127394b-ae93-484a-8371-d0d52388b78d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("ebd5ed1d-a803-4824-aff2-5dee2f472723")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("002bc2fc-db5d-4196-b4a3-f1d008af38a8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTask(this);
        else
          return null;
    }

}
