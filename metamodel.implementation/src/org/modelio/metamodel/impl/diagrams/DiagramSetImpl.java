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
    @objid ("8fc7bf03-b7a3-4393-892e-76805ef28abd")
    @Override
    public EList<DiagramSet> getSub() {
        return new SmList<>(this, DiagramSetData.Metadata.SubDep());
    }

    @objid ("bbcd22d7-c35a-4877-89b4-c83e5e7bb3ef")
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

    @objid ("61d1151e-0433-4085-989a-28dc810d3ad3")
    @Override
    public DiagramSet getParent() {
        return (DiagramSet) getDepVal(DiagramSetData.Metadata.ParentDep());
    }

    @objid ("4a026f3c-bfcf-4062-89a0-95cbc6172fbe")
    @Override
    public void setParent(DiagramSet value) {
        appendDepVal(DiagramSetData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("2668ff83-6075-456b-889c-a7a067747c81")
    @Override
    public EList<AbstractDiagram> getReferencedDiagram() {
        return new SmList<>(this, DiagramSetData.Metadata.ReferencedDiagramDep());
    }

    @objid ("7a336e9a-ff2f-4cc8-9e08-2238b96aa0d2")
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

    @objid ("132dd3a8-2991-4511-8633-436d6c104078")
    @Override
    public Project getOwner() {
        return (Project) getDepVal(DiagramSetData.Metadata.OwnerDep());
    }

    @objid ("8ce410d6-9d56-43a4-a314-33a8f02c329e")
    @Override
    public void setOwner(Project value) {
        appendDepVal(DiagramSetData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("d31edfdc-5e84-4d75-8b85-b8b973f76355")
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

    @objid ("bc855ae7-3709-46b3-b415-b1ce8f1d51c5")
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

    @objid ("6fab4129-c89e-4cae-a19f-7c5f57e25f15")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDiagramSet(this);
        else
          return null;
    }

}
