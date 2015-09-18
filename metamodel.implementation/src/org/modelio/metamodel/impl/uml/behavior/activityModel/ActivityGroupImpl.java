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
    @objid ("715ff6f4-196f-43e9-92a5-4fff6286cb3e")
    @Override
    public Activity getInActivity() {
        return (Activity) getDepVal(ActivityGroupData.Metadata.InActivityDep());
    }

    @objid ("202edbc0-3b35-4a40-9435-ed00d495a9ef")
    @Override
    public void setInActivity(Activity value) {
        appendDepVal(ActivityGroupData.Metadata.InActivityDep(), (SmObjectImpl)value);
    }

    @objid ("069dd189-979b-4f53-b9d7-56697e04dc10")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityGroupData.Metadata.InActivityDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f1d8f807-86e3-4ab4-b406-7cfe3fc08fe1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityGroupData.Metadata.InActivityDep());
        if (obj != null)
          return new SmDepVal(ActivityGroupData.Metadata.InActivityDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8372c29c-e63c-48b7-9b94-e11d9e5c4b57")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityGroup(this);
        else
          return null;
    }

}
