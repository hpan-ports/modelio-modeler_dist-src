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
    @objid ("94bc9d60-81b0-4a86-86b0-8cb45a4301fb")
    @Override
    public BpmnEvent getDefined() {
        return (BpmnEvent) getDepVal(BpmnEventDefinitionData.Metadata.DefinedDep());
    }

    @objid ("817f94b6-42f5-4ff4-8d27-88ac736459c9")
    @Override
    public void setDefined(BpmnEvent value) {
        appendDepVal(BpmnEventDefinitionData.Metadata.DefinedDep(), (SmObjectImpl)value);
    }

    @objid ("ae50556e-9068-42b9-ac76-998a28557c63")
    @Override
    public EList<BpmnMultiInstanceLoopCharacteristics> getLoopRef() {
        return new SmList<>(this, BpmnEventDefinitionData.Metadata.LoopRefDep());
    }

    @objid ("fa7f5d16-136d-4ca3-8181-074f323740b9")
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

    @objid ("a84a1997-d504-4e2e-9b9d-8645037d7d5f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnEventDefinitionData.Metadata.DefinedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f7c492d2-dd25-4b75-b68d-7dce4d27ba71")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnEventDefinitionData.Metadata.DefinedDep());
        if (obj != null)
          return new SmDepVal(BpmnEventDefinitionData.Metadata.DefinedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("9232ed81-709a-47a0-856e-8484535262c7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEventDefinition(this);
        else
          return null;
    }

}
