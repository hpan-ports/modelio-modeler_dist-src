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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Element;
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

    @objid ("76f5f4de-4af8-477f-b0d0-eb81b02ad009")
    @Override
    public EList<AbstractDiagram> getDiagramElement() {
        return new SmList<>(this, ElementData.Metadata.DiagramElementDep());
    }

    @objid ("72aa3784-8c3c-4b1f-8e54-e5b12bf107d2")
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

    @objid ("cadb26ac-86d9-4cf3-8cd3-a089a30e5091")
    @Override
    public EList<NamespaceUse> getCausing() {
        return new SmList<>(this, ElementData.Metadata.CausingDep());
    }

    @objid ("0945728d-68e1-4784-9d98-b6a0dda1385e")
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

    @objid ("2c71cbdb-3c32-43aa-8aab-202158800167")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return null;
    }

    @objid ("0b7dcddf-76a5-4d6f-858b-5d8b0605b295")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return null;
    }

    @objid ("523b8770-d8d9-4ae6-8135-edb60d58ff22")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitElement(this);
        else
          return null;
    }

}
