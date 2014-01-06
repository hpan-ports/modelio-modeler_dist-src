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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.StateInvariantData;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("004bb34c-c4bf-1fd8-97fe-001ec947cd2a")
public class StateInvariantImpl extends OccurrenceSpecificationImpl implements StateInvariant {
    @objid ("d997beb2-f2d1-4e02-94ea-2e24a288755b")
    @Override
    public String getBody() {
        return (String) getAttVal(StateInvariantData.Metadata.BodyAtt());
    }

    @objid ("8fc05157-b126-4b97-83e4-ef540acdb63a")
    @Override
    public void setBody(String value) {
        setAttVal(StateInvariantData.Metadata.BodyAtt(), value);
    }

    @objid ("c65a024b-bc94-4535-9166-e3c432e526b1")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(StateInvariantData.Metadata.EndLineNumberAtt());
    }

    @objid ("3ea61010-f1b7-4785-8812-f97b194e8b9d")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(StateInvariantData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("09ac05e4-753a-4ca8-a378-5294a1d6ffc7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("7f6a2478-85e9-4675-a763-18d4b253ad93")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("fcae29f3-7ee8-428d-b191-de8a8af9d36d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateInvariant(this);
        else
          return null;
    }

}
