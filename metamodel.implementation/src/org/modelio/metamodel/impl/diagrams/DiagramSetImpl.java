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
    @objid ("3262713d-3243-4d4e-8619-9d1deaaeca1e")
    @Override
    public EList<DiagramSet> getSub() {
        return new SmList<>(this, DiagramSetData.Metadata.SubDep());
    }

    @objid ("ef84dd07-f770-4738-917e-de240d2f8706")
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

    @objid ("d751be7a-8302-4b95-a0c5-08ae18441cbf")
    @Override
    public DiagramSet getParent() {
        return (DiagramSet) getDepVal(DiagramSetData.Metadata.ParentDep());
    }

    @objid ("f3692fae-08e9-4439-9005-b8c4a5ee03d6")
    @Override
    public void setParent(DiagramSet value) {
        appendDepVal(DiagramSetData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("499afde9-0b43-4ab1-9247-80229564f488")
    @Override
    public EList<AbstractDiagram> getReferencedDiagram() {
        return new SmList<>(this, DiagramSetData.Metadata.ReferencedDiagramDep());
    }

    @objid ("9e7e14ce-17d8-47f3-bff2-5bed8bb9c64a")
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

    @objid ("ef403c62-c5ce-4825-a72b-df5c89fb4690")
    @Override
    public Project getOwner() {
        return (Project) getDepVal(DiagramSetData.Metadata.OwnerDep());
    }

    @objid ("5dc6d65a-a8e0-4f4f-aa66-d2c22928af98")
    @Override
    public void setOwner(Project value) {
        appendDepVal(DiagramSetData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("ed2a56a7-6d49-4d61-bd82-c2ead2937174")
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

    @objid ("e566a2d3-3ed6-4571-8bfd-6fdb0a69c46b")
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

    @objid ("cfbc7979-fbd8-4b84-bdec-b8f9a0c81fbf")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDiagramSet(this);
        else
          return null;
    }

}
