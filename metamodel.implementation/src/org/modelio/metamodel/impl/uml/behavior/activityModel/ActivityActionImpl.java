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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityActionData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0026b060-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityActionImpl extends ActivityNodeImpl implements ActivityAction {
    @objid ("5fd7ad4d-7aa2-4459-ab33-2edd3fe44905")
    @Override
    public boolean isIsMultipleInstance() {
        return (Boolean) getAttVal(ActivityActionData.Metadata.IsMultipleInstanceAtt());
    }

    @objid ("014ced8c-65c7-4f75-b3d0-fdd401fe5e62")
    @Override
    public void setIsMultipleInstance(boolean value) {
        setAttVal(ActivityActionData.Metadata.IsMultipleInstanceAtt(), value);
    }

    @objid ("ba3c8c2d-499a-4686-b862-ef62b3cd1486")
    @Override
    public boolean isIsCompensation() {
        return (Boolean) getAttVal(ActivityActionData.Metadata.IsCompensationAtt());
    }

    @objid ("e0b6c4ea-da6f-4850-ab7b-bf0f44dab51c")
    @Override
    public void setIsCompensation(boolean value) {
        setAttVal(ActivityActionData.Metadata.IsCompensationAtt(), value);
    }

    @objid ("95a690f2-6ca6-4c6b-ac4b-0e8389d50c41")
    @Override
    public EList<OutputPin> getOutput() {
        return new SmList<>(this, ActivityActionData.Metadata.OutputDep());
    }

    @objid ("9e4c38c8-5385-4727-aa65-3e7e47f8cddd")
    @Override
    public <T extends OutputPin> List<T> getOutput(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final OutputPin element : getOutput()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("258dba9f-fc39-49fe-bd23-1583dc80888d")
    @Override
    public EList<InputPin> getInput() {
        return new SmList<>(this, ActivityActionData.Metadata.InputDep());
    }

    @objid ("a3b06c04-51c8-414a-8671-b6801688a0cc")
    @Override
    public <T extends InputPin> List<T> getInput(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InputPin element : getInput()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("31cc64f8-db0e-48f0-b16b-ec9e0bd88dfe")
    @Override
    public EList<ExceptionHandler> getHandler() {
        return new SmList<>(this, ActivityActionData.Metadata.HandlerDep());
    }

    @objid ("9b9744b6-2f67-470f-9de8-14b97c24bded")
    @Override
    public <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExceptionHandler element : getHandler()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("949a3c29-bd00-47c4-a404-81b6e2315d67")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e6edc2f8-6176-4971-90d1-a871531b0a2a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("c895b29c-983e-41d6-91d2-b1f10f4f3dcb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityAction(this);
        else
          return null;
    }

}
