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
    @objid ("62e2ef1c-0134-4d73-a305-ea429dcd618b")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(BpmnItemAwareElementData.Metadata.TypeDep());
    }

    @objid ("b3c331a9-5ea7-4fbe-a232-35f14b82d098")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("b899b050-8c0a-447c-bd73-366dc701067b")
    @Override
    public EList<BpmnDataAssociation> getTargetOfDataAssociation() {
        return new SmList<>(this, BpmnItemAwareElementData.Metadata.TargetOfDataAssociationDep());
    }

    @objid ("01516c14-c8a3-403d-89a6-b6a542760e39")
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

    @objid ("17f6892f-79fc-4ea7-bfe6-2e4f839fb1f4")
    @Override
    public BpmnItemDefinition getItemSubjectRef() {
        return (BpmnItemDefinition) getDepVal(BpmnItemAwareElementData.Metadata.ItemSubjectRefDep());
    }

    @objid ("d713d0df-43cc-4fc2-905e-1461b1964fa9")
    @Override
    public void setItemSubjectRef(BpmnItemDefinition value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.ItemSubjectRefDep(), (SmObjectImpl)value);
    }

    @objid ("683c13d5-9ddc-4142-a0c9-8c72a5577277")
    @Override
    public State getInState() {
        return (State) getDepVal(BpmnItemAwareElementData.Metadata.InStateDep());
    }

    @objid ("1a338a68-b6e3-4b1f-8442-f5e4107f9e5f")
    @Override
    public void setInState(State value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("e4c2447f-9682-4f15-90d7-f10f3323d1f0")
    @Override
    public AssociationEnd getRepresentedAssociationEnd() {
        return (AssociationEnd) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep());
    }

    @objid ("92a310ba-db68-48ea-914e-b8f6aaa18f05")
    @Override
    public void setRepresentedAssociationEnd(AssociationEnd value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep(), (SmObjectImpl)value);
    }

    @objid ("edd4fd91-758b-4bbb-bcd7-e4f9eb13de78")
    @Override
    public BpmnDataState getDataState() {
        return (BpmnDataState) getDepVal(BpmnItemAwareElementData.Metadata.DataStateDep());
    }

    @objid ("8d970d05-3b18-42ec-bc59-519dfe8bc3b1")
    @Override
    public void setDataState(BpmnDataState value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.DataStateDep(), (SmObjectImpl)value);
    }

    @objid ("1ae72802-a12d-45db-984d-52672adf2d1c")
    @Override
    public EList<BpmnDataAssociation> getSourceOfDataAssociation() {
        return new SmList<>(this, BpmnItemAwareElementData.Metadata.SourceOfDataAssociationDep());
    }

    @objid ("a9951eb5-5300-43dc-954c-33ad887fd8f2")
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

    @objid ("b89c083b-d5b7-4ac9-b72e-bf44d2428d9f")
    @Override
    public Attribute getRepresentedAttribute() {
        return (Attribute) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedAttributeDep());
    }

    @objid ("700d63a4-8f38-4b49-b76e-d786d4fb1d49")
    @Override
    public void setRepresentedAttribute(Attribute value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedAttributeDep(), (SmObjectImpl)value);
    }

    @objid ("f9181ac3-290f-4fc2-882f-782bcb6c1f47")
    @Override
    public Instance getRepresentedInstance() {
        return (Instance) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedInstanceDep());
    }

    @objid ("afd43c81-b77e-4b89-92e9-267e2c5b008f")
    @Override
    public void setRepresentedInstance(Instance value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedInstanceDep(), (SmObjectImpl)value);
    }

    @objid ("c0018ffc-3da2-4d74-a37b-ec4946f10e05")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("286e3d84-8eeb-465b-bc05-67a68b1b34d7")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("9f0fdf9a-bc25-404f-8e89-5a77782bb3e0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnItemAwareElement(this);
        else
          return null;
    }

}
