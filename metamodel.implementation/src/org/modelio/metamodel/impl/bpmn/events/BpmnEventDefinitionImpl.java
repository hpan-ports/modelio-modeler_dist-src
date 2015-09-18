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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.data.bpmn.events.BpmnEventDefinitionData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008d76e2-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnEventDefinitionImpl extends BpmnBaseElementImpl implements BpmnEventDefinition {
    @objid ("8be7430d-a847-4776-a0d7-1fb2ff84e403")
    @Override
    public BpmnEvent getDefined() {
        return (BpmnEvent) getDepVal(BpmnEventDefinitionData.Metadata.DefinedDep());
    }

    @objid ("0db77540-0839-4919-bb75-dc3d69b42042")
    @Override
    public void setDefined(BpmnEvent value) {
        appendDepVal(BpmnEventDefinitionData.Metadata.DefinedDep(), (SmObjectImpl)value);
    }

    @objid ("e7dd4550-6ec3-4073-bc3d-f36aebefbed4")
    @Override
    public EList<BpmnMultiInstanceLoopCharacteristics> getLoopRef() {
        return new SmList<>(this, BpmnEventDefinitionData.Metadata.LoopRefDep());
    }

    @objid ("261cd74d-0cd5-4723-834e-052261ec5774")
    @Override
    public <T extends BpmnMultiInstanceLoopCharacteristics> List<T> getLoopRef(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMultiInstanceLoopCharacteristics element : getLoopRef()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8b778917-d7a8-4529-8232-bc8a2bc3c985")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnEventDefinitionData.Metadata.DefinedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0eb0d357-9faa-4108-939e-b8d0435303b7")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnEventDefinitionData.Metadata.DefinedDep());
        if (obj != null)
          return new SmDepVal(BpmnEventDefinitionData.Metadata.DefinedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2e37e287-6a93-45eb-8b1c-358c557cefa6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEventDefinition(this);
        else
          return null;
    }

}
