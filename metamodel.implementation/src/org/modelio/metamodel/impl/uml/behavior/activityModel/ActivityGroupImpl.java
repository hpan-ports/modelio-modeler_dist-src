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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityGroupData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00283d2c-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityGroupImpl extends ModelElementImpl implements ActivityGroup {
    @objid ("e24460d6-066d-43be-805f-8ad7b9aaeaca")
    @Override
    public Activity getInActivity() {
        return (Activity) getDepVal(ActivityGroupData.Metadata.InActivityDep());
    }

    @objid ("a24d01d6-9d47-4f5f-b9dc-2235c928a577")
    @Override
    public void setInActivity(Activity value) {
        appendDepVal(ActivityGroupData.Metadata.InActivityDep(), (SmObjectImpl)value);
    }

    @objid ("d5c7c44a-650e-4451-b397-37b419991676")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityGroupData.Metadata.InActivityDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("90f023f8-3bd2-4758-b5e3-1d3f4a5e7e54")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityGroupData.Metadata.InActivityDep());
        if (obj != null)
          return new SmDepVal(ActivityGroupData.Metadata.InActivityDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e08ffa20-64a6-4c0b-8e58-270b6ba13bcd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityGroup(this);
        else
          return null;
    }

}
