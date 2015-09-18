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
    @objid ("a3aa3e4e-8ab9-4dec-a7c5-4bd54786de69")
    @Override
    public String getGuard() {
        return (String) getAttVal(ExceptionHandlerData.Metadata.GuardAtt());
    }

    @objid ("bb7aec46-6e63-4d44-9e48-9b062ec54d77")
    @Override
    public void setGuard(String value) {
        setAttVal(ExceptionHandlerData.Metadata.GuardAtt(), value);
    }

    @objid ("b4ab2538-5069-480e-9850-f35e4207323f")
    @Override
    public String getWeight() {
        return (String) getAttVal(ExceptionHandlerData.Metadata.WeightAtt());
    }

    @objid ("b5f2180d-b7aa-4277-9994-6e6f27824024")
    @Override
    public void setWeight(String value) {
        setAttVal(ExceptionHandlerData.Metadata.WeightAtt(), value);
    }

    @objid ("8bb8da7d-c975-4801-b972-af16b51c57d5")
    @Override
    public ActivityAction getProtectedNode() {
        return (ActivityAction) getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
    }

    @objid ("e4f0b67f-8e63-46c8-91c2-5ed760676038")
    @Override
    public void setProtectedNode(ActivityAction value) {
        appendDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep(), (SmObjectImpl)value);
    }

    @objid ("3c2bce65-23cf-476d-bbe3-bdb5694732f3")
    @Override
    public InputPin getExceptionInput() {
        return (InputPin) getDepVal(ExceptionHandlerData.Metadata.ExceptionInputDep());
    }

    @objid ("8378c16a-1d02-4c39-a4c0-fbb140315232")
    @Override
    public void setExceptionInput(InputPin value) {
        appendDepVal(ExceptionHandlerData.Metadata.ExceptionInputDep(), (SmObjectImpl)value);
    }

    @objid ("1a83ba33-8c00-48c3-a6eb-1512697d87d2")
    @Override
    public EList<GeneralClass> getExceptionType() {
        return new SmList<>(this, ExceptionHandlerData.Metadata.ExceptionTypeDep());
    }

    @objid ("b623925a-79b0-43fc-bc2b-4a7e0f177993")
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

    @objid ("80cc7843-0ce6-43fe-b2a1-87bd51d2d81c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9f40e699-9b3d-4b4f-9fa1-41b199a38ed3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep());
        if (obj != null)
          return new SmDepVal(ExceptionHandlerData.Metadata.ProtectedNodeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ec530e28-126e-474d-8225-836b17007fb5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExceptionHandler(this);
        else
          return null;
    }

}
