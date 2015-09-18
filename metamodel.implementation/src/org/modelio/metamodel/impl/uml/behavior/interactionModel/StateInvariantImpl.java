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
    @objid ("520e52a8-ea01-42c9-9810-b779a512182d")
    @Override
    public String getBody() {
        return (String) getAttVal(StateInvariantData.Metadata.BodyAtt());
    }

    @objid ("0469b4ae-b27f-4bcf-b2a0-adaaee19157e")
    @Override
    public void setBody(String value) {
        setAttVal(StateInvariantData.Metadata.BodyAtt(), value);
    }

    @objid ("c3096503-b954-45d2-9bdc-ea04e17a6fd1")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(StateInvariantData.Metadata.EndLineNumberAtt());
    }

    @objid ("c3111149-e948-401a-bc5f-70956c45f95a")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(StateInvariantData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("4f9f56e6-edaa-467c-9115-95b0a7441c8f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6cabddfa-e854-494d-bd77-2df455a99e80")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("20610581-d369-434c-95ab-09edf4be73cc")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateInvariant(this);
        else
          return null;
    }

}
