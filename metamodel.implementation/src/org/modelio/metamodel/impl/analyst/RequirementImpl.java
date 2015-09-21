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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.impl.analyst.RequirementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("6beac79a-2be8-48f3-a776-0b680b64164a")
public class RequirementImpl extends AnalystElementImpl implements Requirement {
    @objid ("d11678c4-158c-4606-9ef8-055602d0384b")
    @Override
    public AnalystElement getLastVersion() {
        return getLastRequirementVersion();
    }

    @objid ("e0d0f56f-6b6c-4906-877e-ae083c7e16b7")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedRequirementVersion();
    }

    @objid ("7725dfea-ac09-4d17-974d-a7cc58d912d9")
    @Override
    public EList<Requirement> getSubRequirement() {
        return new SmList<>(this, ((RequirementSmClass)getClassOf()).getSubRequirementDep());
    }

    @objid ("2c8c6af6-7002-48ec-87f2-29ac2b8aade8")
    @Override
    public <T extends Requirement> List<T> getSubRequirement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Requirement element : getSubRequirement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3b056119-f9e4-4c73-b4ae-2cb3956e972a")
    @Override
    public RequirementContainer getOwnerContainer() {
        Object obj = getDepVal(((RequirementSmClass)getClassOf()).getOwnerContainerDep());
        return (obj instanceof RequirementContainer)? (RequirementContainer)obj : null;
    }

    @objid ("ffc971a0-e385-48e7-b315-c505668b6d23")
    @Override
    public void setOwnerContainer(RequirementContainer value) {
        appendDepVal(((RequirementSmClass)getClassOf()).getOwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("82b41db3-31d2-4490-b5eb-582008e39b08")
    @Override
    public Requirement getParentRequirement() {
        Object obj = getDepVal(((RequirementSmClass)getClassOf()).getParentRequirementDep());
        return (obj instanceof Requirement)? (Requirement)obj : null;
    }

    @objid ("49edc677-d6f0-47bd-a330-fa7d1ac98bb6")
    @Override
    public void setParentRequirement(Requirement value) {
        appendDepVal(((RequirementSmClass)getClassOf()).getParentRequirementDep(), (SmObjectImpl)value);
    }

    @objid ("60ad298b-103f-4e4f-b967-7e8720defcca")
    @Override
    public EList<Requirement> getArchivedRequirementVersion() {
        return new SmList<>(this, ((RequirementSmClass)getClassOf()).getArchivedRequirementVersionDep());
    }

    @objid ("4a82e6e0-908e-40fb-99d1-5ebc734c039f")
    @Override
    public <T extends Requirement> List<T> getArchivedRequirementVersion(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Requirement element : getArchivedRequirementVersion()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b4783ecd-d664-4f2a-be57-e70fd3bd490f")
    @Override
    public Requirement getLastRequirementVersion() {
        Object obj = getDepVal(((RequirementSmClass)getClassOf()).getLastRequirementVersionDep());
        return (obj instanceof Requirement)? (Requirement)obj : null;
    }

    @objid ("f8988018-9e4c-4161-9e68-0732cea2fdf3")
    @Override
    public void setLastRequirementVersion(Requirement value) {
        appendDepVal(((RequirementSmClass)getClassOf()).getLastRequirementVersionDep(), (SmObjectImpl)value);
    }

    @objid ("75a7f3be-59b1-48e3-ba69-f04594165c03")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerContainer
        obj = (SmObjectImpl)this.getDepVal(((RequirementSmClass)getClassOf()).getOwnerContainerDep());
        if (obj != null)
          return obj;
        // ParentRequirement
        obj = (SmObjectImpl)this.getDepVal(((RequirementSmClass)getClassOf()).getParentRequirementDep());
        if (obj != null)
          return obj;
        // LastRequirementVersion
        obj = (SmObjectImpl)this.getDepVal(((RequirementSmClass)getClassOf()).getLastRequirementVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f439c921-c6af-448d-895c-fe5a57bb5736")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerContainer
        dep = ((RequirementSmClass)getClassOf()).getOwnerContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ParentRequirement
        dep = ((RequirementSmClass)getClassOf()).getParentRequirementDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // LastRequirementVersion
        dep = ((RequirementSmClass)getClassOf()).getLastRequirementVersionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("d56e28cc-50db-4828-af57-37e3b3b5d495")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequirement(this);
        else
          return null;
    }

}
