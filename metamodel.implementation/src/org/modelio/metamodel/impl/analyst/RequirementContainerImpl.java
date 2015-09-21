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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.impl.analyst.RequirementContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("41b13368-1afd-46b7-a5b0-17463a4f640a")
public class RequirementContainerImpl extends AnalystContainerImpl implements RequirementContainer {
    @objid ("3f3f0dad-44df-445a-91e2-23b11aac53f0")
    @Override
    public EList<Requirement> getOwnedRequirement() {
        return new SmList<>(this, ((RequirementContainerSmClass)getClassOf()).getOwnedRequirementDep());
    }

    @objid ("bb73d35a-20b1-440c-ac7a-c512904513a4")
    @Override
    public <T extends Requirement> List<T> getOwnedRequirement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Requirement element : getOwnedRequirement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("24fdb77a-6f24-4d94-abcd-f4ca106a0a82")
    @Override
    public RequirementContainer getOwnerContainer() {
        Object obj = getDepVal(((RequirementContainerSmClass)getClassOf()).getOwnerContainerDep());
        return (obj instanceof RequirementContainer)? (RequirementContainer)obj : null;
    }

    @objid ("b678ac09-44e8-4725-a548-10d994013268")
    @Override
    public void setOwnerContainer(RequirementContainer value) {
        appendDepVal(((RequirementContainerSmClass)getClassOf()).getOwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("df93be28-e959-48e7-befc-cc04d4c56eb3")
    @Override
    public EList<RequirementContainer> getOwnedContainer() {
        return new SmList<>(this, ((RequirementContainerSmClass)getClassOf()).getOwnedContainerDep());
    }

    @objid ("7fef1370-c7e4-45c3-9a65-f90f349809e1")
    @Override
    public <T extends RequirementContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final RequirementContainer element : getOwnedContainer()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2b66bf90-eb29-45b7-84df-dc73a2d40628")
    @Override
    public AnalystProject getOwnerProject() {
        Object obj = getDepVal(((RequirementContainerSmClass)getClassOf()).getOwnerProjectDep());
        return (obj instanceof AnalystProject)? (AnalystProject)obj : null;
    }

    @objid ("39aa1e7e-3751-4ba1-8a31-6a17086babe0")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(((RequirementContainerSmClass)getClassOf()).getOwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("a46c5fc9-4218-414c-8d1c-795167cbe852")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerContainer
        obj = (SmObjectImpl)this.getDepVal(((RequirementContainerSmClass)getClassOf()).getOwnerContainerDep());
        if (obj != null)
          return obj;
        // OwnerProject
        obj = (SmObjectImpl)this.getDepVal(((RequirementContainerSmClass)getClassOf()).getOwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ab06cc9e-af60-47d6-a847-3dc4e4d585fa")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerContainer
        dep = ((RequirementContainerSmClass)getClassOf()).getOwnerContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerProject
        dep = ((RequirementContainerSmClass)getClassOf()).getOwnerProjectDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("85fac6c0-26e7-4b67-82ed-94d495016242")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequirementContainer(this);
        else
          return null;
    }

}
