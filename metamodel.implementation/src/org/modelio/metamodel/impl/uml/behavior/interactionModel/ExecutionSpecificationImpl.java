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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.ExecutionSpecificationData;
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

@objid ("0044efbc-c4bf-1fd8-97fe-001ec947cd2a")
public class ExecutionSpecificationImpl extends InteractionFragmentImpl implements ExecutionSpecification {
    @objid ("14063d99-5261-43a9-a316-e1ab4ed6fa7e")
    @Override
    public ExecutionOccurenceSpecification getFinish() {
        Object obj = getDepVal(((ExecutionSpecificationSmClass)getClassOf()).getFinishDep());
        return (obj instanceof ExecutionOccurenceSpecification)? (ExecutionOccurenceSpecification)obj : null;
    }

    @objid ("4659bf84-336a-499c-8578-afbbadea09f0")
    @Override
    public void setFinish(ExecutionOccurenceSpecification value) {
        appendDepVal(((ExecutionSpecificationSmClass)getClassOf()).getFinishDep(), (SmObjectImpl)value);
    }

    @objid ("bb316bb0-4f43-4183-9592-100953dd1b7a")
    @Override
    public ExecutionOccurenceSpecification getStart() {
        Object obj = getDepVal(((ExecutionSpecificationSmClass)getClassOf()).getStartDep());
        return (obj instanceof ExecutionOccurenceSpecification)? (ExecutionOccurenceSpecification)obj : null;
    }

    @objid ("260aa76e-7bf2-4078-8204-855cb0ba5a1d")
    @Override
    public void setStart(ExecutionOccurenceSpecification value) {
        appendDepVal(((ExecutionSpecificationSmClass)getClassOf()).getStartDep(), (SmObjectImpl)value);
    }

    @objid ("83296ec1-42a6-434a-b087-c58e0a3e2e98")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("92fe02d1-7aa8-4878-9e35-516bfdcfede1")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("049ee05b-2a6a-4c04-a4eb-9fd4dbcd3d59")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExecutionSpecification(this);
        else
          return null;
    }

}
