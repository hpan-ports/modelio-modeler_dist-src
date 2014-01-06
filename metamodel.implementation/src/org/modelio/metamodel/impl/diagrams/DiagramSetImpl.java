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
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.diagrams.DiagramSetData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("006e3d9a-c4bf-1fd8-97fe-001ec947cd2a")
public class DiagramSetImpl extends ModelElementImpl implements DiagramSet {
    @objid ("e461864b-3421-499b-b7ff-5349666fb175")
    @Override
    public EList<DiagramSet> getSub() {
        return new SmList<>(this, DiagramSetData.Metadata.SubDep());
    }

    @objid ("512277ad-59be-4a2a-a9ae-1708b3925901")
    @Override
    public <T extends DiagramSet> List<T> getSub(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DiagramSet element : getSub()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ad64caa6-1117-48c5-b06c-27c45e4e90a9")
    @Override
    public DiagramSet getParent() {
        return (DiagramSet) getDepVal(DiagramSetData.Metadata.ParentDep());
    }

    @objid ("9c310fd6-4ba8-4a8c-8070-8ce8bbde2b84")
    @Override
    public void setParent(DiagramSet value) {
        appendDepVal(DiagramSetData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("f1071360-f15b-41fd-9e13-d39f1718b7f1")
    @Override
    public EList<AbstractDiagram> getReferencedDiagram() {
        return new SmList<>(this, DiagramSetData.Metadata.ReferencedDiagramDep());
    }

    @objid ("1b8beaba-d33d-4216-9864-b3d5304323f4")
    @Override
    public <T extends AbstractDiagram> List<T> getReferencedDiagram(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AbstractDiagram element : getReferencedDiagram()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e7a669cf-65b5-46c8-ad65-9934d89ff722")
    @Override
    public Project getOwner() {
        return (Project) getDepVal(DiagramSetData.Metadata.OwnerDep());
    }

    @objid ("44ae3e2e-0e58-4fe7-802e-08e0ea584b68")
    @Override
    public void setOwner(Project value) {
        appendDepVal(DiagramSetData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("11f92176-cceb-4bba-936b-9948d38c6869")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DiagramSetData.Metadata.ParentDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(DiagramSetData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2ffc3d73-1b66-43ec-9cb9-6e30fe4aed71")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DiagramSetData.Metadata.ParentDep());
        if (obj != null)
          return new SmDepVal(DiagramSetData.Metadata.ParentDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(DiagramSetData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(DiagramSetData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ee871f3c-19ff-4584-b15b-f2b81b023fd4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDiagramSet(this);
        else
          return null;
    }

}
