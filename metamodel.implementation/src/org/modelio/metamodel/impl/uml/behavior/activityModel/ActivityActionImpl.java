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
    @objid ("b3dfe331-f3c7-4967-8390-c10a73f9dc86")
    @Override
    public boolean isIsMultipleInstance() {
        return (Boolean) getAttVal(ActivityActionData.Metadata.IsMultipleInstanceAtt());
    }

    @objid ("41c9cbff-1589-4312-b433-4d40ab6f0f84")
    @Override
    public void setIsMultipleInstance(boolean value) {
        setAttVal(ActivityActionData.Metadata.IsMultipleInstanceAtt(), value);
    }

    @objid ("b745d521-b56d-4481-a06e-3e74a637f3cf")
    @Override
    public boolean isIsCompensation() {
        return (Boolean) getAttVal(ActivityActionData.Metadata.IsCompensationAtt());
    }

    @objid ("340fb3b0-b9dd-4065-be61-1918a4dcc53f")
    @Override
    public void setIsCompensation(boolean value) {
        setAttVal(ActivityActionData.Metadata.IsCompensationAtt(), value);
    }

    @objid ("b0b3e4f4-4408-4ace-b7ff-f9b34c7e7625")
    @Override
    public EList<OutputPin> getOutput() {
        return new SmList<>(this, ActivityActionData.Metadata.OutputDep());
    }

    @objid ("4f8fe607-5f99-4fea-8c22-7e50279b351f")
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

    @objid ("81512b65-a663-451a-bf8a-2d608712ad97")
    @Override
    public EList<InputPin> getInput() {
        return new SmList<>(this, ActivityActionData.Metadata.InputDep());
    }

    @objid ("264b27de-5084-4ae3-9ff5-a7b204935d0e")
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

    @objid ("930d4ea9-da79-4067-bcec-68e0115c293f")
    @Override
    public EList<ExceptionHandler> getHandler() {
        return new SmList<>(this, ActivityActionData.Metadata.HandlerDep());
    }

    @objid ("f1ad479c-62c1-4589-a58e-813d4ff92971")
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

    @objid ("092b3345-0fbe-4333-8db4-e68473fc2c8f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("ef5cc8b5-3424-47e4-b392-cf39b3784ed0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("041ddb4c-ae89-4933-98bf-c492b5ee9120")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityAction(this);
        else
          return null;
    }

}
