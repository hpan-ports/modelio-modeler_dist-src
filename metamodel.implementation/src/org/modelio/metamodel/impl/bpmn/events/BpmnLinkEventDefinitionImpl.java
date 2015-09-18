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
    @objid ("7a4d336e-3d83-425a-b576-71a8aee3e692")
    @Override
    public EList<BpmnLinkEventDefinition> getSource() {
        return new SmList<>(this, BpmnLinkEventDefinitionData.Metadata.SourceDep());
    }

    @objid ("cc0d0cfa-db13-490e-bf3f-747973fd4898")
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

    @objid ("b6e430cd-d510-43aa-a55a-03510492ff2f")
    @Override
    public BpmnLinkEventDefinition getTarget() {
        return (BpmnLinkEventDefinition) getDepVal(BpmnLinkEventDefinitionData.Metadata.TargetDep());
    }

    @objid ("5942fc4b-31e4-4eb7-8aac-cc95155bac00")
    @Override
    public void setTarget(BpmnLinkEventDefinition value) {
        appendDepVal(BpmnLinkEventDefinitionData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("f4953c3f-e85b-49bf-81af-2c940da05627")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("94ba5739-a500-448f-89a4-9ee44e87a455")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("00a07116-2962-4ed7-9d90-a992114bd436")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLinkEventDefinition(this);
        else
          return null;
    }

}
