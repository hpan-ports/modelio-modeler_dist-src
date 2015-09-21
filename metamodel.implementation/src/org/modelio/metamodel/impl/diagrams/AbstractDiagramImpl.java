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
package org.modelio.metamodel.impl.diagrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.impl.diagrams.AbstractDiagramData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00675638-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class AbstractDiagramImpl extends ModelElementImpl implements AbstractDiagram {
    @objid ("6a85a14e-e130-4682-a45d-8b7a3efd3265")
    @Override
    public int getUiDataVersion() {
        return (Integer) getAttVal(((AbstractDiagramSmClass)getClassOf()).getUiDataVersionAtt());
    }

    @objid ("caa67d40-8b07-451e-a01c-39e8be9b9c58")
    @Override
    public void setUiDataVersion(int value) {
        setAttVal(((AbstractDiagramSmClass)getClassOf()).getUiDataVersionAtt(), value);
    }

    @objid ("63404aea-75b7-4aa8-8507-c87788f81403")
    @Override
    public String getUiData() {
        return (String) getAttVal(((AbstractDiagramSmClass)getClassOf()).getUiDataAtt());
    }

    @objid ("a5496a5d-0e76-441a-8212-f8e29788d7eb")
    @Override
    public void setUiData(String value) {
        setAttVal(((AbstractDiagramSmClass)getClassOf()).getUiDataAtt(), value);
    }

    @objid ("24f89ab5-9a8b-4cf1-a894-9b678e445915")
    @Override
    public String getPdeProperties() {
        return (String) getAttVal(((AbstractDiagramSmClass)getClassOf()).getPdePropertiesAtt());
    }

    @objid ("030385a4-f009-42ad-aa3d-157a42fc6348")
    @Override
    public void setPdeProperties(String value) {
        setAttVal(((AbstractDiagramSmClass)getClassOf()).getPdePropertiesAtt(), value);
    }

    @objid ("cdb8e628-3885-4099-adb3-28e50959506c")
    @Override
    public ModelElement getOrigin() {
        Object obj = getDepVal(((AbstractDiagramSmClass)getClassOf()).getOriginDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("e6b543c3-99b6-4212-84d8-e34baaa4b736")
    @Override
    public void setOrigin(ModelElement value) {
        appendDepVal(((AbstractDiagramSmClass)getClassOf()).getOriginDep(), (SmObjectImpl)value);
    }

    @objid ("dfa0690e-3eff-4277-ad8d-e2c7f78a802b")
    @Override
    public EList<Element> getRepresented() {
        return new SmList<>(this, ((AbstractDiagramSmClass)getClassOf()).getRepresentedDep());
    }

    @objid ("2ea90bc4-b8ef-48e0-a10f-1b8c5308005e")
    @Override
    public <T extends Element> List<T> getRepresented(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Element element : getRepresented()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("109631a0-a327-4f71-a247-ace326b1c754")
    @Override
    public EList<DiagramSet> getReferencingSet() {
        return new SmList<>(this, ((AbstractDiagramSmClass)getClassOf()).getReferencingSetDep());
    }

    @objid ("0e0e4d23-7a15-40a4-aa57-2b64ea7a8c75")
    @Override
    public <T extends DiagramSet> List<T> getReferencingSet(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final DiagramSet element : getReferencingSet()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("715b754d-1f64-4a40-84ba-bb936018d9ef")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Origin
        obj = (SmObjectImpl)this.getDepVal(((AbstractDiagramSmClass)getClassOf()).getOriginDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2c6547d9-b65b-40df-a248-8db9018c0c79")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Origin
        dep = ((AbstractDiagramSmClass)getClassOf()).getOriginDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("94be1c90-d518-45cc-b9d8-a872b5e0aa2c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAbstractDiagram(this);
        else
          return null;
    }

}
