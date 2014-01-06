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
    @objid ("48cd31e7-480d-4942-92a8-0eb9308675a3")
    @Override
    public boolean isIsSynchronous() {
        return (Boolean) getAttVal(CallActionData.Metadata.IsSynchronousAtt());
    }

    @objid ("8ac1f833-14f3-4601-8e53-a537b0a52fa5")
    @Override
    public void setIsSynchronous(boolean value) {
        setAttVal(CallActionData.Metadata.IsSynchronousAtt(), value);
    }

    @objid ("5a131c94-3bb9-4172-bf20-d05202c229ee")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("1062d377-fbd8-4c9a-96e6-ddc7941d734e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("92665601-af23-47a4-a8d9-0f1013e7d035")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCallAction(this);
        else
          return null;
    }

}
