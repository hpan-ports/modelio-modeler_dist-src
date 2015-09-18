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
    @objid ("fb0c73f3-e37a-49ea-b6ad-562ad43e5ff0")
    @Override
    public String getExpression() {
        return (String) getAttVal(BpmnResourceParameterBindingData.Metadata.ExpressionAtt());
    }

    @objid ("90b4d67c-f5ea-4ba0-b9c7-ab7f77387ab7")
    @Override
    public void setExpression(String value) {
        setAttVal(BpmnResourceParameterBindingData.Metadata.ExpressionAtt(), value);
    }

    @objid ("e9530024-5da6-41be-9cbb-dbf680e28fb5")
    @Override
    public BpmnResourceRole getResourceRole() {
        return (BpmnResourceRole) getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
    }

    @objid ("26934531-ffa0-41e1-a84e-88a55f4b7b52")
    @Override
    public void setResourceRole(BpmnResourceRole value) {
        appendDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep(), (SmObjectImpl)value);
    }

    @objid ("1f66a11f-1357-4eca-a6d7-512455dce49a")
    @Override
    public BpmnResourceParameter getParameterRef() {
        return (BpmnResourceParameter) getDepVal(BpmnResourceParameterBindingData.Metadata.ParameterRefDep());
    }

    @objid ("e6e8dd5c-2d7e-46f5-af56-8a09fd9a9e11")
    @Override
    public void setParameterRef(BpmnResourceParameter value) {
        appendDepVal(BpmnResourceParameterBindingData.Metadata.ParameterRefDep(), (SmObjectImpl)value);
    }

    @objid ("6fe867cf-4cb9-4fc6-b002-fe834da0a2b4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("cb1b2cb4-21e4-4703-a50b-5d79450f08d1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bdd1bdf1-3d18-4d31-a6b1-1fa7e5be4c52")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceParameterBinding(this);
        else
          return null;
    }

}
