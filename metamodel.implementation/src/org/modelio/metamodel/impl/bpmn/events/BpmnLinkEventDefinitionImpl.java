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
import org.modelio.metamodel.bpmn.events.BpmnLinkEventDefinition;
import org.modelio.metamodel.data.bpmn.events.BpmnLinkEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00904a52-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnLinkEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnLinkEventDefinition {
    @objid ("c4a341b5-85d8-4442-bbdf-7c41434c15d3")
    @Override
    public EList<BpmnLinkEventDefinition> getSource() {
        return new SmList<>(this, BpmnLinkEventDefinitionData.Metadata.SourceDep());
    }

    @objid ("844e09f9-4db2-44f0-8c40-bb8efc0cb5ae")
    @Override
    public <T extends BpmnLinkEventDefinition> List<T> getSource(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnLinkEventDefinition element : getSource()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5e4fa30c-20d2-4617-ba26-55b9eba73cbf")
    @Override
    public BpmnLinkEventDefinition getTarget() {
        return (BpmnLinkEventDefinition) getDepVal(BpmnLinkEventDefinitionData.Metadata.TargetDep());
    }

    @objid ("3c20d09f-4905-4e58-921c-88141e9c2af2")
    @Override
    public void setTarget(BpmnLinkEventDefinition value) {
        appendDepVal(BpmnLinkEventDefinitionData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("268b7c5b-59d0-49d1-aa25-67299032550c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6d0375a4-e9bb-41d3-9218-5dab40215c56")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("9f9208e0-c482-45ca-8e3c-ecbc0a419831")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLinkEventDefinition(this);
        else
          return null;
    }

}
