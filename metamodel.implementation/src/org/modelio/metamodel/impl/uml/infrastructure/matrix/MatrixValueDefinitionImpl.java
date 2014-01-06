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
package org.modelio.metamodel.impl.uml.infrastructure.matrix;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixValueDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
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

@objid ("2fb6d68e-b51f-429d-a006-2a9a07892168")
public class MatrixValueDefinitionImpl extends ElementImpl implements MatrixValueDefinition {
    @objid ("3f33da91-8d7f-40e7-ad5d-080520468a56")
    @Override
    public ExternProcessor getProcessor() {
        return (ExternProcessor) getDepVal(MatrixValueDefinitionData.Metadata.ProcessorDep());
    }

    @objid ("b359e398-09c2-4c0b-8333-17dc464b6094")
    @Override
    public void setProcessor(ExternProcessor value) {
        appendDepVal(MatrixValueDefinitionData.Metadata.ProcessorDep(), (SmObjectImpl)value);
    }

    @objid ("93278e78-0731-48e5-86cc-a94b2842d36b")
    @Override
    public PropertyTable getParameters() {
        return (PropertyTable) getDepVal(MatrixValueDefinitionData.Metadata.ParametersDep());
    }

    @objid ("b902a4eb-588e-4ec6-978c-83207d9b6832")
    @Override
    public void setParameters(PropertyTable value) {
        appendDepVal(MatrixValueDefinitionData.Metadata.ParametersDep(), (SmObjectImpl)value);
    }

    @objid ("476ac2cf-0ef7-4014-af4e-5e6ee5284652")
    @Override
    public MatrixDefinition getMatrix() {
        return (MatrixDefinition) getDepVal(MatrixValueDefinitionData.Metadata.MatrixDep());
    }

    @objid ("334772cf-22ec-4c8f-b9d9-fd01156e0069")
    @Override
    public void setMatrix(MatrixDefinition value) {
        appendDepVal(MatrixValueDefinitionData.Metadata.MatrixDep(), (SmObjectImpl)value);
    }

    @objid ("b88bb138-03fd-4b7a-a97a-f3c4e1ab379e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixValueDefinitionData.Metadata.MatrixDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("90ae7a5a-c140-4216-a106-cf2f1403d752")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixValueDefinitionData.Metadata.MatrixDep());
        if (obj != null)
          return new SmDepVal(MatrixValueDefinitionData.Metadata.MatrixDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("63f89b57-78ed-48ba-938d-36391abfe114")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMatrixValueDefinition(this);
        else
          return null;
    }

}
