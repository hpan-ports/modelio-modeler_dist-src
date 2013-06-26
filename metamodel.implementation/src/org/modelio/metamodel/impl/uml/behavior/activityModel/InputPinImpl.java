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
import org.modelio.metamodel.data.uml.behavior.activityModel.InputPinData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00353996-c4bf-1fd8-97fe-001ec947cd2a")
public class InputPinImpl extends PinImpl implements InputPin {
    @objid ("9aa0530c-4622-4da2-813e-fcfe5083960e")
    @Override
    public boolean isIsSelf() {
        return (Boolean) getAttVal(InputPinData.Metadata.IsSelfAtt());
    }

    @objid ("d2c83f64-2cbc-479b-a102-d0286df4c597")
    @Override
    public void setIsSelf(boolean value) {
        setAttVal(InputPinData.Metadata.IsSelfAtt(), value);
    }

    @objid ("b10e5c21-1386-4764-8ea4-6daa27a63a27")
    @Override
    public EList<ExceptionHandler> getHandler() {
        return new SmList<>(this, InputPinData.Metadata.HandlerDep());
    }

    @objid ("29c02ac2-25c7-4a56-98f2-48efa2997567")
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

    @objid ("e1376564-58d6-4ef7-8bc3-98b923ba1746")
    @Override
    public ActivityAction getInputing() {
        return (ActivityAction) getDepVal(InputPinData.Metadata.InputingDep());
    }

    @objid ("fb45b43a-44d7-4338-a626-d05d636787d6")
    @Override
    public void setInputing(ActivityAction value) {
        appendDepVal(InputPinData.Metadata.InputingDep(), (SmObjectImpl)value);
    }

    @objid ("17ef9425-da6d-4842-9d71-f58807733f15")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InputPinData.Metadata.InputingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b48a8d0f-467d-4945-b6d5-972a9d46f966")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InputPinData.Metadata.InputingDep());
        if (obj != null)
          return new SmDepVal(InputPinData.Metadata.InputingDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("86c7f072-b3d4-4a45-b54c-720ea7524e5b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInputPin(this);
        else
          return null;
    }

}
