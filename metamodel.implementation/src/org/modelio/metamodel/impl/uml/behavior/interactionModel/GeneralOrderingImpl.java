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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GeneralOrderingData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("004610d6-c4bf-1fd8-97fe-001ec947cd2a")
public class GeneralOrderingImpl extends ElementImpl implements GeneralOrdering {
    @objid ("9956c81f-6fdd-45b2-9a14-fbf65ee85d7d")
    @Override
    public OccurrenceSpecification getBefore() {
        Object obj = getDepVal(((GeneralOrderingSmClass)getClassOf()).getBeforeDep());
        return (obj instanceof OccurrenceSpecification)? (OccurrenceSpecification)obj : null;
    }

    @objid ("e80d17da-b1b5-4dcc-b654-0da0e47968d9")
    @Override
    public void setBefore(OccurrenceSpecification value) {
        appendDepVal(((GeneralOrderingSmClass)getClassOf()).getBeforeDep(), (SmObjectImpl)value);
    }

    @objid ("d35a340c-e871-4102-b1ba-2c67983c94dd")
    @Override
    public OccurrenceSpecification getAfter() {
        Object obj = getDepVal(((GeneralOrderingSmClass)getClassOf()).getAfterDep());
        return (obj instanceof OccurrenceSpecification)? (OccurrenceSpecification)obj : null;
    }

    @objid ("8c0c454e-b784-4738-8740-f2c48c55ebb6")
    @Override
    public void setAfter(OccurrenceSpecification value) {
        appendDepVal(((GeneralOrderingSmClass)getClassOf()).getAfterDep(), (SmObjectImpl)value);
    }

    @objid ("df1b7435-cd86-4c33-b546-3be45a19809b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Before
        obj = (SmObjectImpl)this.getDepVal(((GeneralOrderingSmClass)getClassOf()).getBeforeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e470691f-06c7-4a0f-9b7d-3eaca680ca2c")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Before
        dep = ((GeneralOrderingSmClass)getClassOf()).getBeforeDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("5634d76b-c851-41b6-8f16-1f7d55d31aff")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGeneralOrdering(this);
        else
          return null;
    }

}
