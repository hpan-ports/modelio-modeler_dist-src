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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000a1464-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceParameterImpl extends BpmnBaseElementImpl implements BpmnResourceParameter {
    @objid ("aa7b8c08-e5b5-4618-b235-73a70267aa01")
    @Override
    public boolean isIsRequired() {
        return (Boolean) getAttVal(BpmnResourceParameterData.Metadata.IsRequiredAtt());
    }

    @objid ("3a0e3b63-b489-4c32-9186-cb6338f5ede5")
    @Override
    public void setIsRequired(boolean value) {
        setAttVal(BpmnResourceParameterData.Metadata.IsRequiredAtt(), value);
    }

    @objid ("9c69bb5a-2c28-4591-a46d-76663475bdaa")
    @Override
    public BpmnResource getResource() {
        return (BpmnResource) getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
    }

    @objid ("c43ff245-7a58-47fd-9a72-6c5c9fefd080")
    @Override
    public void setResource(BpmnResource value) {
        appendDepVal(BpmnResourceParameterData.Metadata.ResourceDep(), (SmObjectImpl)value);
    }

    @objid ("47a6dc86-bc97-4ba3-ae83-aa1375c7c74e")
    @Override
    public BpmnItemDefinition getType() {
        return (BpmnItemDefinition) getDepVal(BpmnResourceParameterData.Metadata.TypeDep());
    }

    @objid ("2bf7c294-6f5a-4037-97d3-430ed3093764")
    @Override
    public void setType(BpmnItemDefinition value) {
        appendDepVal(BpmnResourceParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("9353bbd4-c8c6-4423-88e0-8b8fab3751a0")
    @Override
    public EList<BpmnResourceParameterBinding> getParameterBindingRefs() {
        return new SmList<>(this, BpmnResourceParameterData.Metadata.ParameterBindingRefsDep());
    }

    @objid ("19671129-1e63-49ef-bd34-321488cd7265")
    @Override
    public <T extends BpmnResourceParameterBinding> List<T> getParameterBindingRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceParameterBinding element : getParameterBindingRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("812f432b-0b07-4d36-bb8f-a57257272a90")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("76fcc0e9-db2d-47b9-bdc9-8f6ea487caf2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceParameterData.Metadata.ResourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1ccc6ad5-528c-47ef-9d12-43535ad304d0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceParameter(this);
        else
          return null;
    }

}
