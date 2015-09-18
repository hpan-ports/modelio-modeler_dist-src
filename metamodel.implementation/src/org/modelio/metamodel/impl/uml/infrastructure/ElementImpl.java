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

    @objid ("a17eedf6-ee12-43ec-8470-cf9543449395")
    @Override
    public EList<AbstractDiagram> getDiagramElement() {
        return new SmList<>(this, ElementData.Metadata.DiagramElementDep());
    }

    @objid ("6c9bbc14-c589-4da3-926b-b67ee5f82c78")
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

    @objid ("9df4f540-8f7a-4ece-bf7c-ca1b9358be07")
    @Override
    public EList<NamespaceUse> getCausing() {
        return new SmList<>(this, ElementData.Metadata.CausingDep());
    }

    @objid ("97002613-a825-4a4d-a28b-b685c6bd8a10")
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

    @objid ("46ba8cb8-fda0-4be5-83da-b37304929cde")
    @Override
    public EList<QueryDefinition> getAddedToQuery() {
        return new SmList<>(this, ElementData.Metadata.AddedToQueryDep());
    }

    @objid ("f39553a2-4c19-41c8-a751-585d98c34783")
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

    @objid ("e49f10cd-d2fe-42a9-8b8b-189b8d211222")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return null;
    }

    @objid ("4639eb65-cf1a-4f4c-842a-bfe3e2524889")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return null;
    }

    @objid ("1dcbfeb6-351a-410b-9dff-c085167567f2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitElement(this);
        else
          return null;
    }

}
