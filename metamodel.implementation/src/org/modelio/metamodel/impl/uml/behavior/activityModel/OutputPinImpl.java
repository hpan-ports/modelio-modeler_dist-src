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
    @objid ("1c919e06-602f-4d84-8f0c-5feba0d279a6")
    @Override
    public ActivityAction getOutputing() {
        return (ActivityAction) getDepVal(OutputPinData.Metadata.OutputingDep());
    }

    @objid ("9d7adec0-9563-473b-8376-a25ad8fc1d3c")
    @Override
    public void setOutputing(ActivityAction value) {
        appendDepVal(OutputPinData.Metadata.OutputingDep(), (SmObjectImpl)value);
    }

    @objid ("02c0d443-85a2-4d1e-8d04-65cf7a53a725")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OutputPinData.Metadata.OutputingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ba57e8a3-07b6-44b7-96de-770ff263e063")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OutputPinData.Metadata.OutputingDep());
        if (obj != null)
          return new SmDepVal(OutputPinData.Metadata.OutputingDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("09ae4d7c-c06e-4eed-a6f0-0ca6909e2325")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitOutputPin(this);
        else
          return null;
    }

}
