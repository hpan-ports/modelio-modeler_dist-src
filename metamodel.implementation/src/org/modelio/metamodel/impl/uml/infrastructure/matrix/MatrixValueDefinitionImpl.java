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
    @objid ("db4accff-bba4-4810-972b-8709b7fd47d2")
    @Override
    public ExternProcessor getProcessor() {
        return (ExternProcessor) getDepVal(MatrixValueDefinitionData.Metadata.ProcessorDep());
    }

    @objid ("ec7f5a77-75bb-4a87-a426-b4bda021828e")
    @Override
    public void setProcessor(ExternProcessor value) {
        appendDepVal(MatrixValueDefinitionData.Metadata.ProcessorDep(), (SmObjectImpl)value);
    }

    @objid ("d82b9bbb-2000-441c-94c2-6f7984778520")
    @Override
    public PropertyTable getParameters() {
        return (PropertyTable) getDepVal(MatrixValueDefinitionData.Metadata.ParametersDep());
    }

    @objid ("7c091e40-e14d-4b0f-9b7f-9281f329a936")
    @Override
    public void setParameters(PropertyTable value) {
        appendDepVal(MatrixValueDefinitionData.Metadata.ParametersDep(), (SmObjectImpl)value);
    }

    @objid ("317059ba-c52b-4619-bf33-50fd71a2d56c")
    @Override
    public MatrixDefinition getMatrix() {
        return (MatrixDefinition) getDepVal(MatrixValueDefinitionData.Metadata.MatrixDep());
    }

    @objid ("0873fada-9712-42f6-b40f-85249df0aa23")
    @Override
    public void setMatrix(MatrixDefinition value) {
        appendDepVal(MatrixValueDefinitionData.Metadata.MatrixDep(), (SmObjectImpl)value);
    }

    @objid ("d130a0b8-7b78-4a09-92ef-991904040be6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixValueDefinitionData.Metadata.MatrixDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("bb2545ee-bad6-4384-a9a3-12aa4a79ce1e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MatrixValueDefinitionData.Metadata.MatrixDep());
        if (obj != null)
          return new SmDepVal(MatrixValueDefinitionData.Metadata.MatrixDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("60892b17-21c7-4d15-9497-84e960e22bc8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMatrixValueDefinition(this);
        else
          return null;
    }

}
