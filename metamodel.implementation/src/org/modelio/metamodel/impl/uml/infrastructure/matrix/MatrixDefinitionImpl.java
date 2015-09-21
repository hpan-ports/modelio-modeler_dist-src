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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixDefinitionData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("ce758e96-007e-4b95-9c1f-1964de5db680")
public class MatrixDefinitionImpl extends ModelElementImpl implements MatrixDefinition {
    @objid ("96ca486f-fc87-446a-a30c-eac04bd01060")
    @Override
    public QueryDefinition getLinesDefinition() {
        Object obj = getDepVal(((MatrixDefinitionSmClass)getClassOf()).getLinesDefinitionDep());
        return (obj instanceof QueryDefinition)? (QueryDefinition)obj : null;
    }

    @objid ("c8535c71-7110-4590-894c-ae1b8faa3b16")
    @Override
    public void setLinesDefinition(QueryDefinition value) {
        appendDepVal(((MatrixDefinitionSmClass)getClassOf()).getLinesDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("4e922683-73e4-4e17-8a36-0e173c4f8e52")
    @Override
    public QueryDefinition getColumnsDefinition() {
        Object obj = getDepVal(((MatrixDefinitionSmClass)getClassOf()).getColumnsDefinitionDep());
        return (obj instanceof QueryDefinition)? (QueryDefinition)obj : null;
    }

    @objid ("a7f8ac63-1621-4d14-805f-2ae46166390b")
    @Override
    public void setColumnsDefinition(QueryDefinition value) {
        appendDepVal(((MatrixDefinitionSmClass)getClassOf()).getColumnsDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("fc1245d5-ba7e-42de-8863-6c9e7a6240b1")
    @Override
    public MatrixValueDefinition getValuesDefinition() {
        Object obj = getDepVal(((MatrixDefinitionSmClass)getClassOf()).getValuesDefinitionDep());
        return (obj instanceof MatrixValueDefinition)? (MatrixValueDefinition)obj : null;
    }

    @objid ("23aea304-2303-4fcb-b774-f1cf58b293de")
    @Override
    public void setValuesDefinition(MatrixValueDefinition value) {
        appendDepVal(((MatrixDefinitionSmClass)getClassOf()).getValuesDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("c47b49a2-b3d3-49aa-a056-845edad034aa")
    @Override
    public QueryDefinition getDepthDefinition() {
        Object obj = getDepVal(((MatrixDefinitionSmClass)getClassOf()).getDepthDefinitionDep());
        return (obj instanceof QueryDefinition)? (QueryDefinition)obj : null;
    }

    @objid ("fe25c503-6f04-45c3-a288-b2f40698c370")
    @Override
    public void setDepthDefinition(QueryDefinition value) {
        appendDepVal(((MatrixDefinitionSmClass)getClassOf()).getDepthDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("3c6dfd3e-9997-4fc3-ba96-d7a0a575b0e1")
    @Override
    public ModelElement getOwner() {
        Object obj = getDepVal(((MatrixDefinitionSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("89a434ef-2873-4bda-a222-83b27ffab0a2")
    @Override
    public void setOwner(ModelElement value) {
        appendDepVal(((MatrixDefinitionSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("b1b24f6d-4f3c-457e-8cf5-54b042a6ad12")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((MatrixDefinitionSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7e355011-6a58-4c69-b41a-563f1260ca6d")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((MatrixDefinitionSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("405386a1-02eb-4b4b-8b5a-b378c16b0407")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMatrixDefinition(this);
        else
          return null;
    }

}
