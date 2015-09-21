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
package org.modelio.metamodel.impl.uml.infrastructure.matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("e5225255-1ebe-40cd-bc3d-6cd038eb4046")
public class QueryDefinitionImpl extends ElementImpl implements QueryDefinition {
    @objid ("eff9fd46-4971-429b-a9d0-25c29925c09e")
    @Override
    public boolean isUsingAdditions() {
        return (Boolean) getAttVal(((QueryDefinitionSmClass)getClassOf()).getUsingAdditionsAtt());
    }

    @objid ("6dab559a-bd7d-4309-ab4e-722373eba239")
    @Override
    public void setUsingAdditions(boolean value) {
        setAttVal(((QueryDefinitionSmClass)getClassOf()).getUsingAdditionsAtt(), value);
    }

    @objid ("e6475569-eb63-4425-9b37-adde2e86dd60")
    @Override
    public EList<Element> getAdded() {
        return new SmList<>(this, ((QueryDefinitionSmClass)getClassOf()).getAddedDep());
    }

    @objid ("4d4514dc-519d-4022-b011-89472c6e369f")
    @Override
    public <T extends Element> List<T> getAdded(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Element element : getAdded()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8ddb0bc0-d401-44c2-906c-13dc44076cac")
    @Override
    public ExternProcessor getProcessor() {
        Object obj = getDepVal(((QueryDefinitionSmClass)getClassOf()).getProcessorDep());
        return (obj instanceof ExternProcessor)? (ExternProcessor)obj : null;
    }

    @objid ("a79d3675-c5f0-435f-ab5f-2f6a85f63582")
    @Override
    public void setProcessor(ExternProcessor value) {
        appendDepVal(((QueryDefinitionSmClass)getClassOf()).getProcessorDep(), (SmObjectImpl)value);
    }

    @objid ("fef18eb3-0dad-419b-a338-81ce05cbcd31")
    @Override
    public PropertyTable getParameters() {
        Object obj = getDepVal(((QueryDefinitionSmClass)getClassOf()).getParametersDep());
        return (obj instanceof PropertyTable)? (PropertyTable)obj : null;
    }

    @objid ("b52ae993-c55e-41d8-942d-d2bc72d859a5")
    @Override
    public void setParameters(PropertyTable value) {
        appendDepVal(((QueryDefinitionSmClass)getClassOf()).getParametersDep(), (SmObjectImpl)value);
    }

    @objid ("d4745d1b-3837-403c-bf1c-18466dd9a4bb")
    @Override
    public MatrixDefinition getOwnerAsLine() {
        Object obj = getDepVal(((QueryDefinitionSmClass)getClassOf()).getOwnerAsLineDep());
        return (obj instanceof MatrixDefinition)? (MatrixDefinition)obj : null;
    }

    @objid ("7fd89bfe-8dc2-4c6a-b764-2b98640b4a76")
    @Override
    public void setOwnerAsLine(MatrixDefinition value) {
        appendDepVal(((QueryDefinitionSmClass)getClassOf()).getOwnerAsLineDep(), (SmObjectImpl)value);
    }

    @objid ("83a924c6-b9ec-49db-a189-ecf494416b9c")
    @Override
    public MatrixDefinition getOwnerAsCol() {
        Object obj = getDepVal(((QueryDefinitionSmClass)getClassOf()).getOwnerAsColDep());
        return (obj instanceof MatrixDefinition)? (MatrixDefinition)obj : null;
    }

    @objid ("a62dcfca-3172-48b7-8849-ca6c78e7a8c7")
    @Override
    public void setOwnerAsCol(MatrixDefinition value) {
        appendDepVal(((QueryDefinitionSmClass)getClassOf()).getOwnerAsColDep(), (SmObjectImpl)value);
    }

    @objid ("a2af027c-f013-4e47-ac75-8be1bd415a40")
    @Override
    public MatrixDefinition getOwnerAsDepth() {
        Object obj = getDepVal(((QueryDefinitionSmClass)getClassOf()).getOwnerAsDepthDep());
        return (obj instanceof MatrixDefinition)? (MatrixDefinition)obj : null;
    }

    @objid ("c2730fb2-b7f4-427a-b24e-10956c36c8c2")
    @Override
    public void setOwnerAsDepth(MatrixDefinition value) {
        appendDepVal(((QueryDefinitionSmClass)getClassOf()).getOwnerAsDepthDep(), (SmObjectImpl)value);
    }

    @objid ("f6491951-de93-4005-821a-59bf76f5ad6f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerAsLine
        obj = (SmObjectImpl)this.getDepVal(((QueryDefinitionSmClass)getClassOf()).getOwnerAsLineDep());
        if (obj != null)
          return obj;
        // OwnerAsCol
        obj = (SmObjectImpl)this.getDepVal(((QueryDefinitionSmClass)getClassOf()).getOwnerAsColDep());
        if (obj != null)
          return obj;
        // OwnerAsDepth
        obj = (SmObjectImpl)this.getDepVal(((QueryDefinitionSmClass)getClassOf()).getOwnerAsDepthDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("fd25c200-e1d7-42b7-a4e0-6827e8f998da")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerAsLine
        dep = ((QueryDefinitionSmClass)getClassOf()).getOwnerAsLineDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerAsCol
        dep = ((QueryDefinitionSmClass)getClassOf()).getOwnerAsColDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerAsDepth
        dep = ((QueryDefinitionSmClass)getClassOf()).getOwnerAsDepthDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("5a349571-f8dd-4e25-990d-250ac9c943aa")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitQueryDefinition(this);
        else
          return null;
    }

}
