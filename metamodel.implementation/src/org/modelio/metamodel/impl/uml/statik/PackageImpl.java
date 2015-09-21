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
import org.modelio.metamodel.impl.uml.statik.PackageData;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00157246-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageImpl extends NameSpaceImpl implements Package {
    @objid ("17599cd6-f7f4-44e4-b94d-0ebc6d05d05c")
    @Override
    public boolean isIsInstantiable() {
        return (Boolean) getAttVal(((PackageSmClass)getClassOf()).getIsInstantiableAtt());
    }

    @objid ("77d629b6-aaa8-448e-87ca-4a97c45cbf6f")
    @Override
    public void setIsInstantiable(boolean value) {
        setAttVal(((PackageSmClass)getClassOf()).getIsInstantiableAtt(), value);
    }

    @objid ("2918eef6-583d-43ab-84f0-d8333ddef9b8")
    @Override
    public EList<BpmnParticipant> getBpmnRepresents() {
        return new SmList<>(this, ((PackageSmClass)getClassOf()).getBpmnRepresentsDep());
    }

    @objid ("746886de-ea57-4eb4-9f4f-da1e5c1ae27b")
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

    @objid ("9970c60d-a252-4c8b-8734-53bf9d70f6ab")
    @Override
    public EList<PackageMerge> getReceivingMerge() {
        return new SmList<>(this, ((PackageSmClass)getClassOf()).getReceivingMergeDep());
    }

    @objid ("d459212f-7c51-48f5-aa8f-0b838c32615f")
    @Override
    public <T extends PackageMerge> List<T> getReceivingMerge(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final PackageMerge element : getReceivingMerge()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8c20dee1-aff6-4482-87e3-a0c434a31a33")
    @Override
    public Project getRepresented() {
        Object obj = getDepVal(((PackageSmClass)getClassOf()).getRepresentedDep());
        return (obj instanceof Project)? (Project)obj : null;
    }

    @objid ("1ea727f1-aeae-460b-b407-f20a85b38b90")
    @Override
    public void setRepresented(Project value) {
        appendDepVal(((PackageSmClass)getClassOf()).getRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("764cc17d-60f9-4012-9cae-4c692da301fc")
    @Override
    public EList<PackageMerge> getMerge() {
        return new SmList<>(this, ((PackageSmClass)getClassOf()).getMergeDep());
    }

    @objid ("d10d60db-d51d-430f-830d-0f694ec4ca32")
    @Override
    public <T extends PackageMerge> List<T> getMerge(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final PackageMerge element : getMerge()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fe937c70-c906-4648-bb94-f7fb655ed598")
    @Override
    public EList<PackageImport> getPackageImporting() {
        return new SmList<>(this, ((PackageSmClass)getClassOf()).getPackageImportingDep());
    }

    @objid ("15529600-e2b6-4250-9418-e20e16efc096")
    @Override
    public <T extends PackageImport> List<T> getPackageImporting(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final PackageImport element : getPackageImporting()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f8b982e1-ada6-46cf-8cd6-865af44c751b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Represented
        obj = (SmObjectImpl)this.getDepVal(((PackageSmClass)getClassOf()).getRepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b44df552-3a6a-41e0-a9ad-460eb228115e")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Represented
        dep = ((PackageSmClass)getClassOf()).getRepresentedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("65550f6f-8aef-4585-aa81-d845880ce618")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPackage(this);
        else
          return null;
    }

}
