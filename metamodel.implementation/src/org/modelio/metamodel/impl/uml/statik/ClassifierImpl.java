/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.impl.uml.statik.ClassifierData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00039a6c-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ClassifierImpl extends NameSpaceImpl implements Classifier {
    @objid ("b4b879df-0038-4e2b-aa4d-9ad3b6f60354")
    @Override
    public EList<Operation> getOwnedOperation() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getOwnedOperationDep());
    }

    @objid ("9542335e-d03b-4451-bf02-68fcd26b8109")
    @Override
    public <T extends Operation> List<T> getOwnedOperation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Operation element : getOwnedOperation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ebf39443-317e-4ba7-8edd-32cf4823b8c3")
    @Override
    public EList<InformationItem> getRepresentation() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getRepresentationDep());
    }

    @objid ("5a08c572-8877-435c-a2fc-927ccc693190")
    @Override
    public <T extends InformationItem> List<T> getRepresentation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationItem element : getRepresentation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("724a5251-20c1-46a6-a384-dec22c8d0036")
    @Override
    public EList<Substitution> getSubstitued() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getSubstituedDep());
    }

    @objid ("f250bc78-62f0-4f8d-8863-7ccb6ec6ae73")
    @Override
    public <T extends Substitution> List<T> getSubstitued(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Substitution element : getSubstitued()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b5bbea20-5814-40a1-b3ea-a10045927428")
    @Override
    public EList<Attribute> getOwnedAttribute() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getOwnedAttributeDep());
    }

    @objid ("cb92113a-c653-43d5-bd4f-07986e057a86")
    @Override
    public <T extends Attribute> List<T> getOwnedAttribute(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Attribute element : getOwnedAttribute()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d77ac88c-09b1-43d1-bdc0-f6e81413c5c8")
    @Override
    public EList<NaryAssociationEnd> getOwnedNaryEnd() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getOwnedNaryEndDep());
    }

    @objid ("c3c27884-0a31-497b-993d-aed6cd82205e")
    @Override
    public <T extends NaryAssociationEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NaryAssociationEnd element : getOwnedNaryEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8f30e03f-d65b-4040-823f-5b3f18783654")
    @Override
    public EList<InformationFlow> getConveyer() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getConveyerDep());
    }

    @objid ("4716f0a8-d68a-4f7e-9f15-80055e299df3")
    @Override
    public <T extends InformationFlow> List<T> getConveyer(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getConveyer()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ef476d45-467a-4fa6-ba03-a1677e9e19f1")
    @Override
    public EList<Substitution> getSubstitutingSubstitution() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getSubstitutingSubstitutionDep());
    }

    @objid ("0a65d1a0-96fc-4011-9402-50f0f840b610")
    @Override
    public <T extends Substitution> List<T> getSubstitutingSubstitution(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Substitution element : getSubstitutingSubstitution()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("baa90d28-1199-462d-a1d2-7624b838dc0e")
    @Override
    public EList<AssociationEnd> getTargetingEnd() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getTargetingEndDep());
    }

    @objid ("b5120193-08f6-404e-bff3-9ace169e03b4")
    @Override
    public <T extends AssociationEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final AssociationEnd element : getTargetingEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c2c44d9a-fc4f-433c-bb0b-4d972fc218d3")
    @Override
    public EList<AssociationEnd> getOwnedEnd() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getOwnedEndDep());
    }

    @objid ("7aa02885-d5cc-4759-9303-59868a8b558d")
    @Override
    public <T extends AssociationEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final AssociationEnd element : getOwnedEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1097e000-db18-4a8c-8507-ceac5c781ac6")
    @Override
    public EList<BpmnParticipant> getBpmnRepresents() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getBpmnRepresentsDep());
    }

    @objid ("6654f568-f101-4648-889a-93937414e02a")
    @Override
    public <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnParticipant element : getBpmnRepresents()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("99103ea7-8ae5-4044-97ba-e24d79a70bcc")
    @Override
    public EList<RaisedException> getThrowing() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getThrowingDep());
    }

    @objid ("ba0fd9e7-734e-40ec-90c1-e09e63a90f3f")
    @Override
    public <T extends RaisedException> List<T> getThrowing(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final RaisedException element : getThrowing()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e6887076-5fe9-4185-9140-302391d0e36c")
    @Override
    public EList<BindableInstance> getInternalStructure() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getInternalStructureDep());
    }

    @objid ("b47b8c38-2447-4d4d-a924-a0538dee7bb7")
    @Override
    public <T extends BindableInstance> List<T> getInternalStructure(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BindableInstance element : getInternalStructure()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5abbcc88-ff5b-4cc6-ba72-8548fa247f06")
    @Override
    public EList<ComponentRealization> getRealizedComponent() {
        return new SmList<>(this, ((ClassifierSmClass)getClassOf()).getRealizedComponentDep());
    }

    @objid ("db402865-8380-473a-ad4b-fe4d82a4ea59")
    @Override
    public <T extends ComponentRealization> List<T> getRealizedComponent(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ComponentRealization element : getRealizedComponent()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8351d4bd-bdb4-4cb1-9721-614190a57be4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bff4f0ec-eec0-4130-8d20-602ce02bfd99")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("0d8370f9-a865-46c6-b980-c34fca0282ee")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClassifier(this);
        else
          return null;
    }

}
