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
import org.modelio.metamodel.data.uml.behavior.activityModel.CallActionData;
import org.modelio.metamodel.uml.behavior.activityModel.CallAction;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("002a9180-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class CallActionImpl extends ActivityActionImpl implements CallAction {
    @objid ("7dfe2183-6a51-45ef-95bf-9c185a7695df")
    @Override
    public boolean isIsSynchronous() {
        return (Boolean) getAttVal(CallActionData.Metadata.IsSynchronousAtt());
    }

    @objid ("ca926faf-9d97-400e-ba3d-19cdd0bb6455")
    @Override
    public void setIsSynchronous(boolean value) {
        setAttVal(CallActionData.Metadata.IsSynchronousAtt(), value);
    }

    @objid ("45d28edf-e969-49fd-a332-9fbd7286040e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bd574fb3-9330-4edb-ae20-d121493e7d73")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("93fb3ca0-7e0a-43b3-b462-848db3cb27f1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCallAction(this);
        else
          return null;
    }

}
