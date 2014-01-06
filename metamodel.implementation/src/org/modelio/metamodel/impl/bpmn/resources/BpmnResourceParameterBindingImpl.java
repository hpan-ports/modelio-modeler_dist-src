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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterBindingData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000b59e6-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceParameterBindingImpl extends BpmnBaseElementImpl implements BpmnResourceParameterBinding {
    @objid ("daadf016-d90c-45e4-86aa-900b2d459b91")
    @Override
    public String getExpression() {
        return (String) getAttVal(BpmnResourceParameterBindingData.Metadata.ExpressionAtt());
    }

    @objid ("df1431fc-af8d-4695-9f7e-d5c1cbecf1ef")
    @Override
    public void setExpression(String value) {
        setAttVal(BpmnResourceParameterBindingData.Metadata.ExpressionAtt(), value);
    }

    @objid ("81505ba3-f97e-495c-bcb4-e852890c70d9")
    @Override
    public BpmnResourceRole getResourceRole() {
        return (BpmnResourceRole) getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
    }

    @objid ("cbc37e62-0329-4ac3-b6a0-c4c7f1b5cf35")
    @Override
    public void setResourceRole(BpmnResourceRole value) {
        appendDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep(), (SmObjectImpl)value);
    }

    @objid ("6bfbeb6e-1558-4069-b2ed-84c1982276e6")
    @Override
    public BpmnResourceParameter getParameterRef() {
        return (BpmnResourceParameter) getDepVal(BpmnResourceParameterBindingData.Metadata.ParameterRefDep());
    }

    @objid ("aabb0791-41d1-45f8-a752-38af3e937274")
    @Override
    public void setParameterRef(BpmnResourceParameter value) {
        appendDepVal(BpmnResourceParameterBindingData.Metadata.ParameterRefDep(), (SmObjectImpl)value);
    }

    @objid ("cc71ca5c-c03c-4947-9670-ccfa10a4276a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("255a604e-67d7-4b7c-b256-6bab7bc603f3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e32a4d91-5826-4626-9871-8b800e9db0e0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceParameterBinding(this);
        else
          return null;
    }

}
