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
    @objid ("cfe64780-11d4-46d7-b7fd-2cada4d2151d")
    @Override
    public boolean isIsRequired() {
        return (Boolean) getAttVal(BpmnResourceParameterData.Metadata.IsRequiredAtt());
    }

    @objid ("87261c5b-d985-4289-bff5-b60ceedc4765")
    @Override
    public void setIsRequired(boolean value) {
        setAttVal(BpmnResourceParameterData.Metadata.IsRequiredAtt(), value);
    }

    @objid ("79f3b396-451b-4b95-8267-5fdcd8c5bca9")
    @Override
    public BpmnResource getResource() {
        return (BpmnResource) getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
    }

    @objid ("4d49d4f7-333e-4a46-949b-69d018618ad9")
    @Override
    public void setResource(BpmnResource value) {
        appendDepVal(BpmnResourceParameterData.Metadata.ResourceDep(), (SmObjectImpl)value);
    }

    @objid ("396eee06-798f-445b-9c81-21871ecc1c1d")
    @Override
    public BpmnItemDefinition getType() {
        return (BpmnItemDefinition) getDepVal(BpmnResourceParameterData.Metadata.TypeDep());
    }

    @objid ("4bd9df32-7551-4662-a346-f418d8694f5c")
    @Override
    public void setType(BpmnItemDefinition value) {
        appendDepVal(BpmnResourceParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("3f97ba2a-a4d6-4998-8c55-f8b8a8f90163")
    @Override
    public EList<BpmnResourceParameterBinding> getParameterBindingRefs() {
        return new SmList<>(this, BpmnResourceParameterData.Metadata.ParameterBindingRefsDep());
    }

    @objid ("c80aa801-eeca-4063-9a51-08247fbf7ebe")
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

    @objid ("d3d96c6a-b349-4315-8928-3aa5b15673f4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9b43903d-c1fd-4572-90de-170c64267889")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceParameterData.Metadata.ResourceDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceParameterData.Metadata.ResourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d8d5f065-4ad2-45db-8a1c-a603ce0faf56")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceParameter(this);
        else
          return null;
    }

}
