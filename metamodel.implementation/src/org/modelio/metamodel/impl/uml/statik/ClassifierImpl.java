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
import org.modelio.metamodel.uml.statik.ComponentRealization;
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
    @objid ("d5c35045-8ee3-4503-8d88-0f60f315a613")
    @Override
    public EList<Operation> getOwnedOperation() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedOperationDep());
    }

    @objid ("44e2c95e-95f1-4ad3-9e62-d61417afd9a9")
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

    @objid ("e8cbe387-18c9-4cbe-80cf-c4532caf2f1d")
    @Override
    public EList<InformationItem> getRepresentation() {
        return new SmList<>(this, ClassifierData.Metadata.RepresentationDep());
    }

    @objid ("e310ca09-f651-4fea-b601-cd2c46d3fe15")
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

    @objid ("6f75218a-77b1-4a93-b566-e0ad99d8b96b")
    @Override
    public EList<Substitution> getSubstitued() {
        return new SmList<>(this, ClassifierData.Metadata.SubstituedDep());
    }

    @objid ("31e37a2a-ea16-41b1-a251-d6cafbef02fe")
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

    @objid ("975b577a-0a22-46dd-8e86-4c0b0bbad284")
    @Override
    public EList<Attribute> getOwnedAttribute() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedAttributeDep());
    }

    @objid ("deaa28e0-6c34-4291-96e0-da145e44a027")
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

    @objid ("23a44df6-2c7d-46d7-a572-9e27d0583ba4")
    @Override
    public EList<NaryAssociationEnd> getOwnedNaryEnd() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedNaryEndDep());
    }

    @objid ("1e351006-6083-45fa-ae37-0e85fe8f3aee")
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

    @objid ("7e82e227-dfb1-4c82-8564-8113fa9ade14")
    @Override
    public EList<InformationFlow> getConveyer() {
        return new SmList<>(this, ClassifierData.Metadata.ConveyerDep());
    }

    @objid ("34073cec-7fa3-4550-8863-00c1a8b883b5")
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

    @objid ("9fed56ae-0ad0-4abe-8e6b-40795915d0e5")
    @Override
    public EList<Substitution> getSubstitutingSubstitution() {
        return new SmList<>(this, ClassifierData.Metadata.SubstitutingSubstitutionDep());
    }

    @objid ("90d68e7d-e6f7-4f96-9d2a-f3b7d6fd324a")
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

    @objid ("ec9a91bb-4959-42c5-aadd-9d002372eae2")
    @Override
    public EList<AssociationEnd> getTargetingEnd() {
        return new SmList<>(this, ClassifierData.Metadata.TargetingEndDep());
    }

    @objid ("ba9b6d06-e448-41ed-baa6-641cfb9bd7d3")
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

    @objid ("07e58907-0ab1-4f34-8d68-c171693e30b6")
    @Override
    public EList<AssociationEnd> getOwnedEnd() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedEndDep());
    }

    @objid ("5d24a17b-ebe3-4b5f-95bd-3d70558a9910")
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

    @objid ("f5ddd973-20ea-4b95-82bd-478e72147f96")
    @Override
    public EList<BpmnParticipant> getBpmnRepresents() {
        return new SmList<>(this, ClassifierData.Metadata.BpmnRepresentsDep());
    }

    @objid ("872f7fce-2d8e-4be1-9737-0bb8df7bdce3")
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

    @objid ("40292851-e68b-4fa7-8a6e-e741a45b9e3d")
    @Override
    public EList<RaisedException> getThrowing() {
        return new SmList<>(this, ClassifierData.Metadata.ThrowingDep());
    }

    @objid ("57f640e0-573f-485b-9428-2109b970f104")
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

    @objid ("999d43e5-3bbe-470d-a0ef-3d3bc569a779")
    @Override
    public EList<BindableInstance> getInternalStructure() {
        return new SmList<>(this, ClassifierData.Metadata.InternalStructureDep());
    }

    @objid ("63c5a24e-a4cd-4f30-b6b1-2a24e3db28f8")
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

    @objid ("200aa388-1939-4c81-be5c-13c8efc36ce2")
    @Override
    public EList<ComponentRealization> getRealizedComponent() {
        return new SmList<>(this, ClassifierData.Metadata.RealizedComponentDep());
    }

    @objid ("d66d5244-3fcf-4a32-b6ce-19b8c377083b")
    @Override
    public <T extends ComponentRealization> List<T> getRealizedComponent(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ComponentRealization element : getRealizedComponent()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f6130364-a521-4583-8b27-fd20d13a9ab5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f1f584a8-fe87-4e04-8689-defd8d1fe335")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1daa6f39-44fd-4ba0-a952-707d0c3044b8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClassifier(this);
        else
          return null;
    }

}
