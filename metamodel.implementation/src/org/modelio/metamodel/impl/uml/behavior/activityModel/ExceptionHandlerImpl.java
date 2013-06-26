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
import org.modelio.metamodel.data.uml.behavior.activityModel.ExceptionHandlerData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0030ab7e-c4bf-1fd8-97fe-001ec947cd2a")
public class ExceptionHandlerImpl extends ModelElementImpl implements ExceptionHandler {
    @objid ("8eb6e289-4d21-4e5b-b1d5-cf6d2a792816")
    @Override
    public String getGuard() {
        return (String) getAttVal(ExceptionHandlerData.Metadata.GuardAtt());
    }

    @objid ("7534de3a-3752-4865-a22f-373b9921f430")
    @Override
    public void setGuard(String value) {
        setAttVal(ExceptionHandlerData.Metadata.GuardAtt(), value);
    }

    @objid ("29c336fd-95a9-4237-9565-9bd3283f453b")
    @Override
    public String getWeight() {
        return (String) getAttVal(ExceptionHandlerData.Metadata.WeightAtt());
    }

    @objid ("7c26b2d6-32b3-4352-b4d4-6ff14c57e828")
    @Override
    public void setWeight(String value) {
        setAttVal(ExceptionHandlerData.Metadata.WeightAtt(), value);
    }

    @objid ("4cff39e8-d7d6-4225-bf47-9437f343b715")
    @Override
    public ActivityAction getProtectedNode() {
        return (ActivityAction) getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
    }

    @objid ("54b9f712-35a2-4d25-b8d3-438c34cb88ae")
    @Override
    public void setProtectedNode(ActivityAction value) {
        appendDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep(), (SmObjectImpl)value);
    }

    @objid ("ad0917b1-6462-4864-bfd8-cb9ed0362eda")
    @Override
    public InputPin getExceptionInput() {
        return (InputPin) getDepVal(ExceptionHandlerData.Metadata.ExceptionInputDep());
    }

    @objid ("34582d25-24c7-4423-acea-fa4f82f8689c")
    @Override
    public void setExceptionInput(InputPin value) {
        appendDepVal(ExceptionHandlerData.Metadata.ExceptionInputDep(), (SmObjectImpl)value);
    }

    @objid ("b0c91249-4e56-4a4d-9717-c72cfec0f314")
    @Override
    public EList<GeneralClass> getExceptionType() {
        return new SmList<>(this, ExceptionHandlerData.Metadata.ExceptionTypeDep());
    }

    @objid ("1255b07d-c984-4f38-8f13-2af8445ef3be")
    @Override
    public <T extends GeneralClass> List<T> getExceptionType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GeneralClass element : getExceptionType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8b058323-bb18-4c95-8a51-63360391d6e4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ca9355e6-b16e-41ae-bca6-f56cf70cbbae")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
        if (obj != null)
          return new SmDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b9f020a7-6b62-4c8b-8a6b-2a44f38fb16c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExceptionHandler(this);
        else
          return null;
    }

}
