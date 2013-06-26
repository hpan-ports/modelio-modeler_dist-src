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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00072ee8-c4c0-1fd8-97fe-001ec947cd2a")
public abstract class BpmnItemAwareElementImpl extends BpmnFlowElementImpl implements BpmnItemAwareElement {
    @objid ("d8be1d64-8ca2-4925-b989-6d50d74026ec")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(BpmnItemAwareElementData.Metadata.TypeDep());
    }

    @objid ("d8a0255e-571c-41ce-b145-52722384cdf3")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("f68f21a5-8e87-4987-9fc3-e729ea2c8825")
    @Override
    public EList<BpmnDataAssociation> getTargetOfDataAssociation() {
        return new SmList<>(this, BpmnItemAwareElementData.Metadata.TargetOfDataAssociationDep());
    }

    @objid ("4d59d592-18a1-4c64-8989-1847b3c5c563")
    @Override
    public <T extends BpmnDataAssociation> List<T> getTargetOfDataAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getTargetOfDataAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2c835b86-2176-4727-a84e-35d200691367")
    @Override
    public BpmnItemDefinition getItemSubjectRef() {
        return (BpmnItemDefinition) getDepVal(BpmnItemAwareElementData.Metadata.ItemSubjectRefDep());
    }

    @objid ("77ff6ef0-74a4-4d18-9e22-a8573c94b35d")
    @Override
    public void setItemSubjectRef(BpmnItemDefinition value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.ItemSubjectRefDep(), (SmObjectImpl)value);
    }

    @objid ("0856da62-2d07-4dee-b1c1-0d00bc3d8a97")
    @Override
    public State getInState() {
        return (State) getDepVal(BpmnItemAwareElementData.Metadata.InStateDep());
    }

    @objid ("c520d29b-abb2-4aac-a534-5efd44467c54")
    @Override
    public void setInState(State value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("11c8a9cc-27e5-4e17-891f-64dfe0b38fce")
    @Override
    public AssociationEnd getRepresentedAssociationEnd() {
        return (AssociationEnd) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep());
    }

    @objid ("f8d3c30a-0d25-4cdf-be30-b916071ef13e")
    @Override
    public void setRepresentedAssociationEnd(AssociationEnd value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep(), (SmObjectImpl)value);
    }

    @objid ("8a9e245e-bbb9-4099-b074-3d01f2b9a8c7")
    @Override
    public BpmnDataState getDataState() {
        return (BpmnDataState) getDepVal(BpmnItemAwareElementData.Metadata.DataStateDep());
    }

    @objid ("c046439f-b6f2-485e-b963-ebde8ef5eb06")
    @Override
    public void setDataState(BpmnDataState value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.DataStateDep(), (SmObjectImpl)value);
    }

    @objid ("8c872f06-64e7-403c-8ff8-97b18999782c")
    @Override
    public EList<BpmnDataAssociation> getSourceOfDataAssociation() {
        return new SmList<>(this, BpmnItemAwareElementData.Metadata.SourceOfDataAssociationDep());
    }

    @objid ("f5d6f4e6-be2c-4569-9c4c-4824e2489c3b")
    @Override
    public <T extends BpmnDataAssociation> List<T> getSourceOfDataAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getSourceOfDataAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4c5f5779-ed31-41d3-a7d2-5a8ef63959cd")
    @Override
    public Attribute getRepresentedAttribute() {
        return (Attribute) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedAttributeDep());
    }

    @objid ("18cf01fd-3dc1-41bf-971e-c520c5c7db0f")
    @Override
    public void setRepresentedAttribute(Attribute value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedAttributeDep(), (SmObjectImpl)value);
    }

    @objid ("76b05ce3-5061-4f99-badc-81de167abea6")
    @Override
    public Instance getRepresentedInstance() {
        return (Instance) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedInstanceDep());
    }

    @objid ("33012347-d926-40cd-92b2-a5fe5127a52a")
    @Override
    public void setRepresentedInstance(Instance value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedInstanceDep(), (SmObjectImpl)value);
    }

    @objid ("5840d235-0fef-4ff5-a1af-09e878294fca")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bbd9328b-4594-4752-9380-91c269da9601")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("c536239c-ea4f-412b-9702-c2dac0c11891")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnItemAwareElement(this);
        else
          return null;
    }

}
