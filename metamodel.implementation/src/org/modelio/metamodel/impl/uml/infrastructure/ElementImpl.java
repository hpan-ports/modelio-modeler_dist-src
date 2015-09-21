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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.impl.uml.infrastructure.ElementData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0086b028-c4be-1fd8-97fe-001ec947cd2a")
public abstract class ElementImpl extends SmObjectImpl implements Element {
    @objid ("0046c094-ee6e-1fd9-a292-001ec947cd2a")
    public void setName(String name) {
        // do nothing. Element has no name
    }

    @objid ("f5e784ac-fc46-4ccd-8fef-b1deb3a7af83")
    @Override
    public EList<AbstractDiagram> getDiagramElement() {
        return new SmList<>(this, ((ElementSmClass)getClassOf()).getDiagramElementDep());
    }

    @objid ("0dce3a7c-a3ae-41f6-b82a-c7df2607efe8")
    @Override
    public <T extends AbstractDiagram> List<T> getDiagramElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final AbstractDiagram element : getDiagramElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ea8f93eb-bd74-4e12-8079-9048d465d815")
    @Override
    public EList<NamespaceUse> getCausing() {
        return new SmList<>(this, ((ElementSmClass)getClassOf()).getCausingDep());
    }

    @objid ("84b6d3e1-2257-4432-876b-df3050c0811d")
    @Override
    public <T extends NamespaceUse> List<T> getCausing(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NamespaceUse element : getCausing()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1170073d-9c08-4e8f-bb76-ea8e7b217212")
    @Override
    public EList<QueryDefinition> getAddedToQuery() {
        return new SmList<>(this, ((ElementSmClass)getClassOf()).getAddedToQueryDep());
    }

    @objid ("d5b5ea55-e460-4a95-842d-0cb95e9b8e03")
    @Override
    public <T extends QueryDefinition> List<T> getAddedToQuery(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final QueryDefinition element : getAddedToQuery()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b5ab1e3d-065b-4b2b-99a9-b915a5de92e1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return null;
    }

    @objid ("a03b246a-4c87-4287-b8bc-698ebdb3dc49")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return null;
    }

    @objid ("ac7fe25f-34ab-424b-893b-6d560fe862ff")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitElement(this);
        else
          return null;
    }

}
