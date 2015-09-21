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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.ExecutionOccurenceSpecificationData;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00447406-c4bf-1fd8-97fe-001ec947cd2a")
public class ExecutionOccurenceSpecificationImpl extends MessageEndImpl implements ExecutionOccurenceSpecification {
    @objid ("661a9921-73f3-4813-976c-b6151dd1a8b5")
    @Override
    public ExecutionSpecification getFinished() {
        Object obj = getDepVal(((ExecutionOccurenceSpecificationSmClass)getClassOf()).getFinishedDep());
        return (obj instanceof ExecutionSpecification)? (ExecutionSpecification)obj : null;
    }

    @objid ("d4938633-0489-4a40-afc5-f0faf466d58b")
    @Override
    public void setFinished(ExecutionSpecification value) {
        appendDepVal(((ExecutionOccurenceSpecificationSmClass)getClassOf()).getFinishedDep(), (SmObjectImpl)value);
    }

    @objid ("2ca35fbb-bd7c-48c3-9ad7-3830a213efbd")
    @Override
    public ExecutionSpecification getStarted() {
        Object obj = getDepVal(((ExecutionOccurenceSpecificationSmClass)getClassOf()).getStartedDep());
        return (obj instanceof ExecutionSpecification)? (ExecutionSpecification)obj : null;
    }

    @objid ("5245b279-62af-42fd-9e35-4b01706b3714")
    @Override
    public void setStarted(ExecutionSpecification value) {
        appendDepVal(((ExecutionOccurenceSpecificationSmClass)getClassOf()).getStartedDep(), (SmObjectImpl)value);
    }

    @objid ("57c8f281-fe3e-41ae-b301-ecfa5141d7f1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("83755071-9066-4076-880d-d659ca19c0a5")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("262bc2a3-6103-46fc-87e6-f844047df54d")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExecutionOccurenceSpecification(this);
        else
          return null;
    }

}
