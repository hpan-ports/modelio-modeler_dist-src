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
    @objid ("d8c8263f-4f55-4b1e-8305-b18593cfecc6")
    @Override
    public boolean isIsSelf() {
        return (Boolean) getAttVal(InputPinData.Metadata.IsSelfAtt());
    }

    @objid ("c746a3c9-2a91-4165-917b-c39efa4abd50")
    @Override
    public void setIsSelf(boolean value) {
        setAttVal(InputPinData.Metadata.IsSelfAtt(), value);
    }

    @objid ("e1cc0c0a-3ce6-4431-8cd5-a5628ad0d583")
    @Override
    public EList<ExceptionHandler> getHandler() {
        return new SmList<>(this, InputPinData.Metadata.HandlerDep());
    }

    @objid ("02768123-366c-4747-8493-dcc68fafa4c3")
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

    @objid ("98a2392e-f46b-4daf-b06a-743e07ca9101")
    @Override
    public ActivityAction getInputing() {
        return (ActivityAction) getDepVal(InputPinData.Metadata.InputingDep());
    }

    @objid ("295140c3-d267-4c6f-b6d4-8cbf242e5867")
    @Override
    public void setInputing(ActivityAction value) {
        appendDepVal(InputPinData.Metadata.InputingDep(), (SmObjectImpl)value);
    }

    @objid ("7c8548ee-7bbc-45ea-aabe-d8d51021716b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InputPinData.Metadata.InputingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d27204a4-1761-4adb-b7ea-b63abb1b6127")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InputPinData.Metadata.InputingDep());
        if (obj != null)
          return new SmDepVal(InputPinData.Metadata.InputingDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("4e1873d3-4208-4ecf-a6b6-b42ef36e0d7c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInputPin(this);
        else
          return null;
    }

}
