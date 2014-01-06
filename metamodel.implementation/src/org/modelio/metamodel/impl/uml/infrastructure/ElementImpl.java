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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0086b028-c4be-1fd8-97fe-001ec947cd2a")
public abstract class ElementImpl extends SmObjectImpl implements Element {
    @objid ("0046c094-ee6e-1fd9-a292-001ec947cd2a")
    public void setName(String name) {
        // do nothing. Element has no name
    }

    @objid ("36d006ff-28d5-4712-a6aa-c88b01b0bc23")
    @Override
    public EList<AbstractDiagram> getDiagramElement() {
        return new SmList<>(this, ElementData.Metadata.DiagramElementDep());
    }

    @objid ("57dd13f8-01d3-4f48-bbc8-748f95f5408b")
    @Override
    public <T extends AbstractDiagram> List<T> getDiagramElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AbstractDiagram element : getDiagramElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("730550ad-1886-415a-931b-07eca9edf8f6")
    @Override
    public EList<NamespaceUse> getCausing() {
        return new SmList<>(this, ElementData.Metadata.CausingDep());
    }

    @objid ("bad6cf61-989f-4931-bb5f-62a9f318dffd")
    @Override
    public <T extends NamespaceUse> List<T> getCausing(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NamespaceUse element : getCausing()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("30ec455c-f09b-4313-9dc6-68e02ab8096e")
    @Override
    public EList<QueryDefinition> getAddedToQuery() {
        return new SmList<>(this, ElementData.Metadata.AddedToQueryDep());
    }

    @objid ("9bee2661-1895-4edd-b488-742a5b394fb1")
    @Override
    public <T extends QueryDefinition> List<T> getAddedToQuery(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final QueryDefinition element : getAddedToQuery()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("559c37a5-7ca7-4fb2-917c-0bbd16983b3e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return null;
    }

    @objid ("e90c4a81-b322-4c5e-aa26-cbe5b9d3aee1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return null;
    }

    @objid ("3a9caad8-3720-4589-8ec5-4d7b14618e2a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitElement(this);
        else
          return null;
    }

}
