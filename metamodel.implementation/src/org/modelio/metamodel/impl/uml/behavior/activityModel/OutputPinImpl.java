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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.OutputPinData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("003ae756-c4bf-1fd8-97fe-001ec947cd2a")
public class OutputPinImpl extends PinImpl implements OutputPin {
    @objid ("a6fd61a8-f51d-4092-a613-02d1d0a1eb49")
    @Override
    public ActivityAction getOutputing() {
        return (ActivityAction) getDepVal(OutputPinData.Metadata.OutputingDep());
    }

    @objid ("bed0572e-7f3f-4e16-9f2d-0c944d1d6aca")
    @Override
    public void setOutputing(ActivityAction value) {
        appendDepVal(OutputPinData.Metadata.OutputingDep(), (SmObjectImpl)value);
    }

    @objid ("b1885c53-52bd-465c-baca-820bea5b8011")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OutputPinData.Metadata.OutputingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f04cd5bc-6168-4539-934f-f42e5451dc29")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OutputPinData.Metadata.OutputingDep());
        if (obj != null)
          return new SmDepVal(OutputPinData.Metadata.OutputingDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("4149fe0f-2d0d-4785-8d3a-f10bbe1a4ef0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitOutputPin(this);
        else
          return null;
    }

}
