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
    @objid ("cafedf03-809e-44a5-952c-67fe25d98281")
    @Override
    public String getBody() {
        return (String) getAttVal(StateInvariantData.Metadata.BodyAtt());
    }

    @objid ("3da1f72b-7c33-4dff-831e-f10ca15ab68f")
    @Override
    public void setBody(String value) {
        setAttVal(StateInvariantData.Metadata.BodyAtt(), value);
    }

    @objid ("7bc28010-1560-4877-b4c6-1155ef28e22b")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(StateInvariantData.Metadata.EndLineNumberAtt());
    }

    @objid ("0b5d00d1-4867-4f3a-979e-e761582120bd")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(StateInvariantData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("2e3e5580-45e5-4e5b-b32a-eb0e7c7f0706")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f701ccc4-6def-427a-891b-75d6a6346637")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("53c0bed4-ed8b-426d-8242-74fba4cd2dde")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateInvariant(this);
        else
          return null;
    }

}
