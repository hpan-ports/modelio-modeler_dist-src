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
    @objid ("dfde0725-eb37-4433-9469-b1c409afe0b6")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(BpmnItemAwareElementData.Metadata.TypeDep());
    }

    @objid ("02dc0b17-005a-4448-92a6-0827dbfb71f4")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("3ff98104-4a77-4657-bfd0-d602a432f5e3")
    @Override
    public EList<BpmnDataAssociation> getTargetOfDataAssociation() {
        return new SmList<>(this, BpmnItemAwareElementData.Metadata.TargetOfDataAssociationDep());
    }

    @objid ("ae19eacc-1a8c-4e54-b3af-e9d08b7179a9")
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

    @objid ("f9707ee4-d38d-4188-80be-f7c3a6094787")
    @Override
    public BpmnItemDefinition getItemSubjectRef() {
        return (BpmnItemDefinition) getDepVal(BpmnItemAwareElementData.Metadata.ItemSubjectRefDep());
    }

    @objid ("b0753450-f984-4722-9d2a-4cd6521ae7a9")
    @Override
    public void setItemSubjectRef(BpmnItemDefinition value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.ItemSubjectRefDep(), (SmObjectImpl)value);
    }

    @objid ("e2c0a6e3-be5b-4110-8d1e-e1161f820817")
    @Override
    public State getInState() {
        return (State) getDepVal(BpmnItemAwareElementData.Metadata.InStateDep());
    }

    @objid ("d8cd8a0d-cbd5-4313-b383-124cafd18d51")
    @Override
    public void setInState(State value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("68799e6c-f1d8-40ba-a486-7ac666fc3da2")
    @Override
    public AssociationEnd getRepresentedAssociationEnd() {
        return (AssociationEnd) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep());
    }

    @objid ("88809dfd-8ace-423c-9aa1-8b84c9de62a7")
    @Override
    public void setRepresentedAssociationEnd(AssociationEnd value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep(), (SmObjectImpl)value);
    }

    @objid ("d15c6a34-c838-4a1b-b7ca-461297c2ae2d")
    @Override
    public BpmnDataState getDataState() {
        return (BpmnDataState) getDepVal(BpmnItemAwareElementData.Metadata.DataStateDep());
    }

    @objid ("58504487-f7ce-4a35-b8bd-194a0a90e780")
    @Override
    public void setDataState(BpmnDataState value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.DataStateDep(), (SmObjectImpl)value);
    }

    @objid ("8be8c1a6-70c4-4c4e-bc3f-9ae03c6db84c")
    @Override
    public EList<BpmnDataAssociation> getSourceOfDataAssociation() {
        return new SmList<>(this, BpmnItemAwareElementData.Metadata.SourceOfDataAssociationDep());
    }

    @objid ("cd70ddab-9d01-4866-8486-6e42d0622545")
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

    @objid ("dc3af7fe-2455-4718-a531-b43c03cb690b")
    @Override
    public Attribute getRepresentedAttribute() {
        return (Attribute) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedAttributeDep());
    }

    @objid ("81d0763b-898d-481e-8876-585dc3c95867")
    @Override
    public void setRepresentedAttribute(Attribute value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedAttributeDep(), (SmObjectImpl)value);
    }

    @objid ("c3c5365c-4b1e-4b85-9422-2104a341b01c")
    @Override
    public Instance getRepresentedInstance() {
        return (Instance) getDepVal(BpmnItemAwareElementData.Metadata.RepresentedInstanceDep());
    }

    @objid ("db6487fc-3650-44ea-b7ed-a490d75d0090")
    @Override
    public void setRepresentedInstance(Instance value) {
        appendDepVal(BpmnItemAwareElementData.Metadata.RepresentedInstanceDep(), (SmObjectImpl)value);
    }

    @objid ("009cfc45-23f6-464f-9b7c-d0c138d35d53")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6b7bac97-b079-400d-a95a-3d532a38498e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("6979d6b1-7405-4a81-a132-0d129946c594")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnItemAwareElement(this);
        else
          return null;
    }

}
