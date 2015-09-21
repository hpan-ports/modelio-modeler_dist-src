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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterBindingData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000b59e6-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceParameterBindingImpl extends BpmnBaseElementImpl implements BpmnResourceParameterBinding {
    @objid ("c686ad43-1a6d-4575-9ce4-a64beb67dfd6")
    @Override
    public String getExpression() {
        return (String) getAttVal(((BpmnResourceParameterBindingSmClass)getClassOf()).getExpressionAtt());
    }

    @objid ("b893a203-e037-4b5f-ac3f-d06bbf0e1012")
    @Override
    public void setExpression(String value) {
        setAttVal(((BpmnResourceParameterBindingSmClass)getClassOf()).getExpressionAtt(), value);
    }

    @objid ("4db69825-1166-40ab-8aa3-7dd66073be35")
    @Override
    public BpmnResourceRole getResourceRole() {
        Object obj = getDepVal(((BpmnResourceParameterBindingSmClass)getClassOf()).getResourceRoleDep());
        return (obj instanceof BpmnResourceRole)? (BpmnResourceRole)obj : null;
    }

    @objid ("eeda8321-a69b-45fc-b883-78e4f6f606b7")
    @Override
    public void setResourceRole(BpmnResourceRole value) {
        appendDepVal(((BpmnResourceParameterBindingSmClass)getClassOf()).getResourceRoleDep(), (SmObjectImpl)value);
    }

    @objid ("90a45fbb-052e-4da4-9837-7abcfbfa0224")
    @Override
    public BpmnResourceParameter getParameterRef() {
        Object obj = getDepVal(((BpmnResourceParameterBindingSmClass)getClassOf()).getParameterRefDep());
        return (obj instanceof BpmnResourceParameter)? (BpmnResourceParameter)obj : null;
    }

    @objid ("413acf8f-bb0f-4400-989e-640fc7cd0764")
    @Override
    public void setParameterRef(BpmnResourceParameter value) {
        appendDepVal(((BpmnResourceParameterBindingSmClass)getClassOf()).getParameterRefDep(), (SmObjectImpl)value);
    }

    @objid ("b394650e-3f40-42de-a8bf-8745137d9242")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // ResourceRole
        obj = (SmObjectImpl)this.getDepVal(((BpmnResourceParameterBindingSmClass)getClassOf()).getResourceRoleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("228a829b-6cd4-476f-9d08-ce258d6d3dcb")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // ResourceRole
        dep = ((BpmnResourceParameterBindingSmClass)getClassOf()).getResourceRoleDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("916f92c6-dab9-402d-8b47-d13f18f783f2")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceParameterBinding(this);
        else
          return null;
    }

}
