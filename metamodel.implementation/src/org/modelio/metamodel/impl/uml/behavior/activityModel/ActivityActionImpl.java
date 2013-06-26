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
    @objid ("da47160d-454b-4853-975e-33ad7e057be2")
    @Override
    public boolean isIsMultipleInstance() {
        return (Boolean) getAttVal(ActivityActionData.Metadata.IsMultipleInstanceAtt());
    }

    @objid ("f51761ff-9d15-43da-aebf-b2202bbbd19d")
    @Override
    public void setIsMultipleInstance(boolean value) {
        setAttVal(ActivityActionData.Metadata.IsMultipleInstanceAtt(), value);
    }

    @objid ("26c3c703-e789-4c5a-a783-a0ed597b97a7")
    @Override
    public boolean isIsCompensation() {
        return (Boolean) getAttVal(ActivityActionData.Metadata.IsCompensationAtt());
    }

    @objid ("7289f538-4c72-433b-811c-c64a1f070fc6")
    @Override
    public void setIsCompensation(boolean value) {
        setAttVal(ActivityActionData.Metadata.IsCompensationAtt(), value);
    }

    @objid ("261095da-1bc7-453b-a87d-6dce371507fd")
    @Override
    public EList<OutputPin> getOutput() {
        return new SmList<>(this, ActivityActionData.Metadata.OutputDep());
    }

    @objid ("05324753-19b1-48ae-8065-f71feddc1950")
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

    @objid ("e75fd973-3cb7-4e54-8b37-4bbba5541dd8")
    @Override
    public EList<InputPin> getInput() {
        return new SmList<>(this, ActivityActionData.Metadata.InputDep());
    }

    @objid ("0c87c252-dda4-4d7d-89d7-04d298ad12c8")
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

    @objid ("26a5cb33-88c6-45e9-9c60-a519c68b8ff4")
    @Override
    public EList<ExceptionHandler> getHandler() {
        return new SmList<>(this, ActivityActionData.Metadata.HandlerDep());
    }

    @objid ("5710f370-89b1-4a74-a771-773ad6d7b0c8")
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

    @objid ("3af17f86-13ac-479c-ad58-380634d55e64")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d1619d8a-98aa-4c18-a701-64c45a22d630")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2db46333-4c0f-47b9-9c20-1562df5b64d0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityAction(this);
        else
          return null;
    }

}
