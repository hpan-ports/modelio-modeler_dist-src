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
    @objid ("90414ad4-f959-401d-b2ae-d1fe751dc3c6")
    @Override
    public String getGuard() {
        return (String) getAttVal(ExceptionHandlerData.Metadata.GuardAtt());
    }

    @objid ("9503e981-5bee-4d29-b69f-76800a6cb376")
    @Override
    public void setGuard(String value) {
        setAttVal(ExceptionHandlerData.Metadata.GuardAtt(), value);
    }

    @objid ("69899aab-40f2-49ce-ab5a-52e93db927f0")
    @Override
    public String getWeight() {
        return (String) getAttVal(ExceptionHandlerData.Metadata.WeightAtt());
    }

    @objid ("ead5364d-2d90-4bf4-90ea-6f04c23f1fb2")
    @Override
    public void setWeight(String value) {
        setAttVal(ExceptionHandlerData.Metadata.WeightAtt(), value);
    }

    @objid ("1f68c28f-8811-42df-bba2-900333302613")
    @Override
    public ActivityAction getProtectedNode() {
        return (ActivityAction) getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
    }

    @objid ("42f9b3f3-d409-4c41-aeb7-0e2f3e729218")
    @Override
    public void setProtectedNode(ActivityAction value) {
        appendDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep(), (SmObjectImpl)value);
    }

    @objid ("73fd5227-7c6f-41c3-b3cf-f8838827b8a2")
    @Override
    public InputPin getExceptionInput() {
        return (InputPin) getDepVal(ExceptionHandlerData.Metadata.ExceptionInputDep());
    }

    @objid ("69e49636-9429-421f-8a05-94d6e86fc9ca")
    @Override
    public void setExceptionInput(InputPin value) {
        appendDepVal(ExceptionHandlerData.Metadata.ExceptionInputDep(), (SmObjectImpl)value);
    }

    @objid ("f441c88b-46e9-4147-8207-49781e702243")
    @Override
    public EList<GeneralClass> getExceptionType() {
        return new SmList<>(this, ExceptionHandlerData.Metadata.ExceptionTypeDep());
    }

    @objid ("b4a9ac9b-0e01-4234-934d-90d71c10ec37")
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

    @objid ("826c1f1a-f1c7-4d42-a157-31b8c911e9df")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7cd0c711-37b0-4cc1-8f44-2dbb14a2ce51")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
        if (obj != null)
          return new SmDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("66ab5f8d-351b-43b7-8699-3b21bd102842")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExceptionHandler(this);
        else
          return null;
    }

}
