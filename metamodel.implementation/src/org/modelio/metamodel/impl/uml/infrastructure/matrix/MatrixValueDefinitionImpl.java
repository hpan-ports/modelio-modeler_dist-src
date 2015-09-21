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
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixValueDefinitionData;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
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

@objid ("2fb6d68e-b51f-429d-a006-2a9a07892168")
public class MatrixValueDefinitionImpl extends ElementImpl implements MatrixValueDefinition {
    @objid ("505ee4b1-6527-4748-a108-571a8d8779e0")
    @Override
    public ExternProcessor getProcessor() {
        Object obj = getDepVal(((MatrixValueDefinitionSmClass)getClassOf()).getProcessorDep());
        return (obj instanceof ExternProcessor)? (ExternProcessor)obj : null;
    }

    @objid ("80414f13-164e-4205-b2a0-b205186e74be")
    @Override
    public void setProcessor(ExternProcessor value) {
        appendDepVal(((MatrixValueDefinitionSmClass)getClassOf()).getProcessorDep(), (SmObjectImpl)value);
    }

    @objid ("3147e4cf-d474-488d-8c29-b71f3c6deb9c")
    @Override
    public PropertyTable getParameters() {
        Object obj = getDepVal(((MatrixValueDefinitionSmClass)getClassOf()).getParametersDep());
        return (obj instanceof PropertyTable)? (PropertyTable)obj : null;
    }

    @objid ("d648acfa-d7b1-440c-b789-7f0ce45a2ce0")
    @Override
    public void setParameters(PropertyTable value) {
        appendDepVal(((MatrixValueDefinitionSmClass)getClassOf()).getParametersDep(), (SmObjectImpl)value);
    }

    @objid ("68fb882f-047d-47b4-9c84-7287f0711f23")
    @Override
    public MatrixDefinition getMatrix() {
        Object obj = getDepVal(((MatrixValueDefinitionSmClass)getClassOf()).getMatrixDep());
        return (obj instanceof MatrixDefinition)? (MatrixDefinition)obj : null;
    }

    @objid ("ff128357-5b13-4bf6-8541-d3eb9060c334")
    @Override
    public void setMatrix(MatrixDefinition value) {
        appendDepVal(((MatrixValueDefinitionSmClass)getClassOf()).getMatrixDep(), (SmObjectImpl)value);
    }

    @objid ("f9ed8164-1aad-42a0-9bd4-f3663c2cfba4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Matrix
        obj = (SmObjectImpl)this.getDepVal(((MatrixValueDefinitionSmClass)getClassOf()).getMatrixDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("cef19e11-5d0f-41b3-8c66-3a2c5a3193a0")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Matrix
        dep = ((MatrixValueDefinitionSmClass)getClassOf()).getMatrixDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("eb3601f1-7cc6-4aac-bc68-d4759bf51ab1")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMatrixValueDefinition(this);
        else
          return null;
    }

}
