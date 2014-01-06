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
    @objid ("ca98a1a9-7d0d-4a1a-99b6-de686269efe5")
    @Override
    public boolean isIsGlobal() {
        return (Boolean) getAttVal(BpmnTaskData.Metadata.IsGlobalAtt());
    }

    @objid ("ea16acc4-ae63-43b7-b584-af8b4a2fc79a")
    @Override
    public void setIsGlobal(boolean value) {
        setAttVal(BpmnTaskData.Metadata.IsGlobalAtt(), value);
    }

    @objid ("3cef1250-f26a-4f78-9318-1a900eb2deb5")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, BpmnTaskData.Metadata.CallerDep());
    }

    @objid ("b53476b8-ff4d-47c0-afcb-ca03a3d6447e")
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

    @objid ("7f35531c-76bf-4966-90f8-c03befff49a3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8b1eb040-2997-4ea8-b10d-d156e5cac1e5")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("c331bf87-e63c-4001-b708-dfbdec16a5b4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTask(this);
        else
          return null;
    }

}
