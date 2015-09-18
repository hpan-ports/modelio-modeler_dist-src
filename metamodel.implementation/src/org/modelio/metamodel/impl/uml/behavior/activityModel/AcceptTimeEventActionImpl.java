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
import org.modelio.metamodel.data.uml.behavior.activityModel.AcceptTimeEventActionData;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptTimeEventAction;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0025b188-c4bf-1fd8-97fe-001ec947cd2a")
public class AcceptTimeEventActionImpl extends ActivityActionImpl implements AcceptTimeEventAction {
    @objid ("5c731c31-80c0-40a7-b493-e043562c9f50")
    @Override
    public String getTimeExpresion() {
        return (String) getAttVal(AcceptTimeEventActionData.Metadata.TimeExpresionAtt());
    }

    @objid ("a2a5cfb6-5d8f-43a1-8d79-7d8de22208af")
    @Override
    public void setTimeExpresion(String value) {
        setAttVal(AcceptTimeEventActionData.Metadata.TimeExpresionAtt(), value);
    }

    @objid ("d1e518f6-6792-43a1-bda2-cc1f1654c33f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("639da33f-0f47-4421-ab38-1012218b9277")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("6dc408ff-a0d2-4e4a-a1ac-a4e2c36d298c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAcceptTimeEventAction(this);
        else
          return null;
    }

}
