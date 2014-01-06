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
    @objid ("3a4f6269-123f-422d-b753-a34241245357")
    @Override
    public boolean isIsRequired() {
        return (Boolean) getAttVal(BpmnResourceParameterData.Metadata.IsRequiredAtt());
    }

    @objid ("79880798-d27c-4649-8845-d82276881481")
    @Override
    public void setIsRequired(boolean value) {
        setAttVal(BpmnResourceParameterData.Metadata.IsRequiredAtt(), value);
    }

    @objid ("08dfc9ae-258c-4a91-98c4-55084e58ec16")
    @Override
    public BpmnResource getResource() {
        return (BpmnResource) getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
    }

    @objid ("4028aa6d-8a52-4396-aeca-80a2638d32d3")
    @Override
    public void setResource(BpmnResource value) {
        appendDepVal(BpmnResourceParameterData.Metadata.ResourceDep(), (SmObjectImpl)value);
    }

    @objid ("289e5cd2-4c89-4bed-9ce8-9e8cea4846d2")
    @Override
    public BpmnItemDefinition getType() {
        return (BpmnItemDefinition) getDepVal(BpmnResourceParameterData.Metadata.TypeDep());
    }

    @objid ("02df4e7b-edda-47ac-9d4e-56c36832c6cb")
    @Override
    public void setType(BpmnItemDefinition value) {
        appendDepVal(BpmnResourceParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("a8ca02bb-f621-41a0-a1ab-7403d10021be")
    @Override
    public EList<BpmnResourceParameterBinding> getParameterBindingRefs() {
        return new SmList<>(this, BpmnResourceParameterData.Metadata.ParameterBindingRefsDep());
    }

    @objid ("2aea0b79-f339-4488-8dee-b35a77b89ff0")
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

    @objid ("5f471903-e299-4a65-92e0-3b05b9fccbe8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9a73de25-73ef-4a45-9826-66a196df746d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceParameterData.Metadata.ResourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f713e4e3-fa1e-4bd9-8770-1df1183f738a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceParameter(this);
        else
          return null;
    }

}
