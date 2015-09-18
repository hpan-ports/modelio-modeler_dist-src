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
    @objid ("490a9db1-c1e5-4ba6-be73-63a1debd7cfe")
    @Override
    public boolean isIsSelf() {
        return (Boolean) getAttVal(InputPinData.Metadata.IsSelfAtt());
    }

    @objid ("6d134817-7a9f-4287-8dd8-e367c8797be6")
    @Override
    public void setIsSelf(boolean value) {
        setAttVal(InputPinData.Metadata.IsSelfAtt(), value);
    }

    @objid ("1c218c53-c062-4bde-a136-dea284fe9fd1")
    @Override
    public EList<ExceptionHandler> getHandler() {
        return new SmList<>(this, InputPinData.Metadata.HandlerDep());
    }

    @objid ("c570d96d-29be-48c4-8079-1aed13dee366")
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

    @objid ("4771ea19-898c-4970-b269-8ab633315a51")
    @Override
    public ActivityAction getInputing() {
        return (ActivityAction) getDepVal(InputPinData.Metadata.InputingDep());
    }

    @objid ("52682bdc-2364-40c9-9b45-b26d6db56b6e")
    @Override
    public void setInputing(ActivityAction value) {
        appendDepVal(InputPinData.Metadata.InputingDep(), (SmObjectImpl)value);
    }

    @objid ("51892c6a-1de7-4ca1-9c32-35157641d8bc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InputPinData.Metadata.InputingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1bab8446-119c-4875-9dc5-2323e8d0719f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InputPinData.Metadata.InputingDep());
        if (obj != null)
          return new SmDepVal(InputPinData.Metadata.InputingDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("62ce0f6f-c315-49c1-816d-cf802cdceff1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInputPin(this);
        else
          return null;
    }

}
