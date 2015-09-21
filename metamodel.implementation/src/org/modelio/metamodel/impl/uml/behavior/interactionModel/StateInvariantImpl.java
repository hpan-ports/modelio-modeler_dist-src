/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.StateInvariantData;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("004bb34c-c4bf-1fd8-97fe-001ec947cd2a")
public class StateInvariantImpl extends OccurrenceSpecificationImpl implements StateInvariant {
    @objid ("4ec721d6-601d-49a5-bcee-846a204bf6cc")
    @Override
    public String getBody() {
        return (String) getAttVal(((StateInvariantSmClass)getClassOf()).getBodyAtt());
    }

    @objid ("e599b0ba-b759-43f0-a3c0-56eb12a00cce")
    @Override
    public void setBody(String value) {
        setAttVal(((StateInvariantSmClass)getClassOf()).getBodyAtt(), value);
    }

    @objid ("d35dbf53-fc7f-42ce-ade2-813577fad70c")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(((StateInvariantSmClass)getClassOf()).getEndLineNumberAtt());
    }

    @objid ("567bab86-b6ea-4e32-bd8d-eefbf976aeb0")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(((StateInvariantSmClass)getClassOf()).getEndLineNumberAtt(), value);
    }

    @objid ("56eab2b6-ec86-41ec-be38-584f8dbcca0f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("346b9ae1-0619-403d-b6c0-2c53dc80efee")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("d2841086-ceda-4827-952e-aedb9d9aa7d9")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateInvariant(this);
        else
          return null;
    }

}
