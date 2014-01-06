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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00039a6c-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ClassifierImpl extends NameSpaceImpl implements Classifier {
    @objid ("395be986-52dd-4a9a-b221-ee0bcef0dadd")
    @Override
    public EList<Operation> getOwnedOperation() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedOperationDep());
    }

    @objid ("663ccba2-ff69-476c-8581-f0f41a924b60")
    @Override
    public <T extends Operation> List<T> getOwnedOperation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Operation element : getOwnedOperation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3d244f07-da17-4bd6-aa36-c2fb40b963d3")
    @Override
    public EList<InformationItem> getRepresentation() {
        return new SmList<>(this, ClassifierData.Metadata.RepresentationDep());
    }

    @objid ("e6089c76-636d-4427-916f-93cbf59214ac")
    @Override
    public <T extends InformationItem> List<T> getRepresentation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationItem element : getRepresentation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cead9e77-86dc-41d2-9ba1-6230f765d745")
    @Override
    public EList<Substitution> getSubstitued() {
        return new SmList<>(this, ClassifierData.Metadata.SubstituedDep());
    }

    @objid ("7dabf789-7ffe-4cdc-80e0-4c356768f250")
    @Override
    public <T extends Substitution> List<T> getSubstitued(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Substitution element : getSubstitued()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("574c8011-6061-4239-9fe7-e91f2ef495ea")
    @Override
    public EList<Attribute> getOwnedAttribute() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedAttributeDep());
    }

    @objid ("9596f0e4-16a8-481a-8e75-03c7023827fe")
    @Override
    public <T extends Attribute> List<T> getOwnedAttribute(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Attribute element : getOwnedAttribute()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3e4a4169-2a39-4dda-9323-33375cedb908")
    @Override
    public EList<NaryAssociationEnd> getOwnedNaryEnd() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedNaryEndDep());
    }

    @objid ("15edf899-0aad-4f3a-a23b-2ce86d2ce5b5")
    @Override
    public <T extends NaryAssociationEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryAssociationEnd element : getOwnedNaryEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e751dca0-cf0e-49b0-a76f-9e362305714c")
    @Override
    public EList<InformationFlow> getConveyer() {
        return new SmList<>(this, ClassifierData.Metadata.ConveyerDep());
    }

    @objid ("4a6e34ba-33e8-42a4-b3c2-d94b5084854f")
    @Override
    public <T extends InformationFlow> List<T> getConveyer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getConveyer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("428079a2-2e72-4111-ad67-081e71354300")
    @Override
    public EList<Substitution> getSubstitutingSubstitution() {
        return new SmList<>(this, ClassifierData.Metadata.SubstitutingSubstitutionDep());
    }

    @objid ("b23062ab-a934-41f5-b83d-250e1ec52a26")
    @Override
    public <T extends Substitution> List<T> getSubstitutingSubstitution(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Substitution element : getSubstitutingSubstitution()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7436ba70-6489-4205-977e-faf00da97ba2")
    @Override
    public EList<AssociationEnd> getTargetingEnd() {
        return new SmList<>(this, ClassifierData.Metadata.TargetingEndDep());
    }

    @objid ("69fe54d2-8ab6-4754-855c-4bd3f32c6517")
    @Override
    public <T extends AssociationEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AssociationEnd element : getTargetingEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("edfc9f3e-16c0-4a6a-9cd4-e4ccfe79cc3c")
    @Override
    public EList<AssociationEnd> getOwnedEnd() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedEndDep());
    }

    @objid ("034a1587-67fd-42bb-b141-4442d0bd5a6e")
    @Override
    public <T extends AssociationEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AssociationEnd element : getOwnedEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a6b1462a-126d-4569-bc54-5fea1b5f67c0")
    @Override
    public EList<BpmnParticipant> getBpmnRepresents() {
        return new SmList<>(this, ClassifierData.Metadata.BpmnRepresentsDep());
    }

    @objid ("22263688-6a09-4ee9-8a43-25eccdb96d55")
    @Override
    public <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnParticipant element : getBpmnRepresents()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f516e7f1-d81b-4524-9363-5eacdd55c53a")
    @Override
    public EList<RaisedException> getThrowing() {
        return new SmList<>(this, ClassifierData.Metadata.ThrowingDep());
    }

    @objid ("e96d918b-432f-4e39-8e12-c218ea2a4f55")
    @Override
    public <T extends RaisedException> List<T> getThrowing(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RaisedException element : getThrowing()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("408d41c5-4b17-400a-831d-0806a2da81a2")
    @Override
    public EList<BindableInstance> getInternalStructure() {
        return new SmList<>(this, ClassifierData.Metadata.InternalStructureDep());
    }

    @objid ("d92ae9c6-e235-40b0-9408-5449790ec9f3")
    @Override
    public <T extends BindableInstance> List<T> getInternalStructure(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BindableInstance element : getInternalStructure()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e175a244-d8f5-4dd2-83c8-364912baddf8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a7335d25-93ab-4145-918b-40a67835bc7b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("65fa3b97-46e0-494f-b8e2-1929611367f9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClassifier(this);
        else
          return null;
    }

}
