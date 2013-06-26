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
    @objid ("d270e5c6-0d4e-4c9b-a5af-1a5baf93b285")
    @Override
    public EList<Operation> getOwnedOperation() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedOperationDep());
    }

    @objid ("0a1b96c5-9f58-48dc-b4d0-33a3887521ea")
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

    @objid ("3e42aa34-a538-4846-a58f-4e9c9952ece5")
    @Override
    public EList<InformationItem> getRepresentation() {
        return new SmList<>(this, ClassifierData.Metadata.RepresentationDep());
    }

    @objid ("8a5da2d7-f3d3-4503-9865-457fe2d90547")
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

    @objid ("d272f8a9-9fb7-431f-8bcf-37971634e33c")
    @Override
    public EList<Substitution> getSubstitued() {
        return new SmList<>(this, ClassifierData.Metadata.SubstituedDep());
    }

    @objid ("6c3c43a8-973a-44c5-a569-423b583d971a")
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

    @objid ("0a4baff1-7fb7-43e0-82e6-60197d246df1")
    @Override
    public EList<Attribute> getOwnedAttribute() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedAttributeDep());
    }

    @objid ("46cd0754-4154-469d-95f7-ef5a7fcb0a4c")
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

    @objid ("d0d6710c-4438-45e2-8f61-d084c4ab46b7")
    @Override
    public EList<NaryAssociationEnd> getOwnedNaryEnd() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedNaryEndDep());
    }

    @objid ("2c942d1d-9fad-462f-92f5-84bb95fdf0d4")
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

    @objid ("457cc78a-a51b-43eb-b817-2e2aae1bc1a8")
    @Override
    public EList<InformationFlow> getConveyer() {
        return new SmList<>(this, ClassifierData.Metadata.ConveyerDep());
    }

    @objid ("0590ccb3-34de-43ef-85a4-7410269036c5")
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

    @objid ("4e2df6e4-78d8-4da6-af03-fdd238a8c21f")
    @Override
    public EList<Substitution> getSubstitutingSubstitution() {
        return new SmList<>(this, ClassifierData.Metadata.SubstitutingSubstitutionDep());
    }

    @objid ("13273366-b899-4abb-b93c-3de729edd13e")
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

    @objid ("32544234-c92d-405f-bd21-65690dd5ab32")
    @Override
    public EList<AssociationEnd> getTargetingEnd() {
        return new SmList<>(this, ClassifierData.Metadata.TargetingEndDep());
    }

    @objid ("16054949-2020-4e14-90c0-ae02d341b7bb")
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

    @objid ("4682cb65-e6eb-4c8d-af32-5e0b28c92666")
    @Override
    public EList<AssociationEnd> getOwnedEnd() {
        return new SmList<>(this, ClassifierData.Metadata.OwnedEndDep());
    }

    @objid ("5a28a845-2648-4412-9a43-acb847335845")
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

    @objid ("14a75c9a-740a-4dba-b123-36f4bc20e339")
    @Override
    public EList<BpmnParticipant> getBpmnRepresents() {
        return new SmList<>(this, ClassifierData.Metadata.BpmnRepresentsDep());
    }

    @objid ("f6e7a422-6f2a-4eee-b554-de94e479a1c6")
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

    @objid ("11df4aa6-a4fe-4fe1-9ce9-0ea2d0981ec0")
    @Override
    public EList<RaisedException> getThrowing() {
        return new SmList<>(this, ClassifierData.Metadata.ThrowingDep());
    }

    @objid ("8887f04f-9087-4371-bea4-0da4af70cebb")
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

    @objid ("e2911b4e-cc00-424f-84a0-35b298ffd463")
    @Override
    public EList<BindableInstance> getInternalStructure() {
        return new SmList<>(this, ClassifierData.Metadata.InternalStructureDep());
    }

    @objid ("eaf36321-a465-46c9-befa-5f365c55a1b7")
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

    @objid ("e18c4d41-d92b-4b45-9f0a-d21121d98ecf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f1ca30cb-f637-4c0c-8bda-409a3ca13014")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("58581dbd-e66f-4d0f-90fd-c746992ad69e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClassifier(this);
        else
          return null;
    }

}
