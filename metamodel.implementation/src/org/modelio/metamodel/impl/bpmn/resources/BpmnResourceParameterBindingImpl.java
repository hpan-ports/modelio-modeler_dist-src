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
    @objid ("785f0713-d214-4323-a391-3df5af5e888f")
    @Override
    public String getExpression() {
        return (String) getAttVal(BpmnResourceParameterBindingData.Metadata.ExpressionAtt());
    }

    @objid ("c1c2343d-6803-4fd4-b83a-3d6bfeb19d7f")
    @Override
    public void setExpression(String value) {
        setAttVal(BpmnResourceParameterBindingData.Metadata.ExpressionAtt(), value);
    }

    @objid ("0ab1fcda-8281-49bd-9461-5f43dd2db864")
    @Override
    public BpmnResourceRole getResourceRole() {
        return (BpmnResourceRole) getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
    }

    @objid ("7b400be7-9a7f-42f7-aa4c-2cab2ce84e2a")
    @Override
    public void setResourceRole(BpmnResourceRole value) {
        appendDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep(), (SmObjectImpl)value);
    }

    @objid ("fde11179-079c-4d45-8b45-9118b6c9de3d")
    @Override
    public BpmnResourceParameter getParameterRef() {
        return (BpmnResourceParameter) getDepVal(BpmnResourceParameterBindingData.Metadata.ParameterRefDep());
    }

    @objid ("88a361b2-ac3b-4e84-8e18-4b3ed55fb099")
    @Override
    public void setParameterRef(BpmnResourceParameter value) {
        appendDepVal(BpmnResourceParameterBindingData.Metadata.ParameterRefDep(), (SmObjectImpl)value);
    }

    @objid ("fa2e99b9-0e30-4b6e-8859-b5326c0d007d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d418cd98-8918-4e9a-a8ef-b8d048955758")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceParameterBindingData.Metadata.ResourceRoleDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("78672ce2-86cd-4d6b-9e91-9ce10ff9568c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceParameterBinding(this);
        else
          return null;
    }

}
