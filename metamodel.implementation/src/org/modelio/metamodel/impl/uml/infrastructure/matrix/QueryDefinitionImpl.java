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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
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

@objid ("e5225255-1ebe-40cd-bc3d-6cd038eb4046")
public class QueryDefinitionImpl extends ElementImpl implements QueryDefinition {
    @objid ("c1aee21f-9882-4e08-a7b1-93bafbab0325")
    @Override
    public boolean isUsingAdditions() {
        return (Boolean) getAttVal(QueryDefinitionData.Metadata.UsingAdditionsAtt());
    }

    @objid ("c323892b-672c-47cd-877e-2df10d5451ef")
    @Override
    public void setUsingAdditions(boolean value) {
        setAttVal(QueryDefinitionData.Metadata.UsingAdditionsAtt(), value);
    }

    @objid ("85f8516f-1001-44e6-a395-531e79c7b437")
    @Override
    public EList<Element> getAdded() {
        return new SmList<>(this, QueryDefinitionData.Metadata.AddedDep());
    }

    @objid ("75b7531f-f5b3-418e-ae5a-d783fe3471aa")
    @Override
    public <T extends Element> List<T> getAdded(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Element element : getAdded()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("83f6ad4b-58ea-4e8d-b861-390907f85641")
    @Override
    public ExternProcessor getProcessor() {
        return (ExternProcessor) getDepVal(QueryDefinitionData.Metadata.ProcessorDep());
    }

    @objid ("bec2a03b-1ab5-46c5-a18c-feb323c4b50b")
    @Override
    public void setProcessor(ExternProcessor value) {
        appendDepVal(QueryDefinitionData.Metadata.ProcessorDep(), (SmObjectImpl)value);
    }

    @objid ("fcb2db7e-afa2-4f73-86a8-9e89de028b05")
    @Override
    public PropertyTable getParameters() {
        return (PropertyTable) getDepVal(QueryDefinitionData.Metadata.ParametersDep());
    }

    @objid ("fb90bc86-d85a-4996-8231-c934fed90561")
    @Override
    public void setParameters(PropertyTable value) {
        appendDepVal(QueryDefinitionData.Metadata.ParametersDep(), (SmObjectImpl)value);
    }

    @objid ("26e0cdbc-65b4-467a-88cd-092d78c7616c")
    @Override
    public MatrixDefinition getOwnerAsLine() {
        return (MatrixDefinition) getDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep());
    }

    @objid ("ce1704ef-c385-4579-959a-e47fba1fa0c7")
    @Override
    public void setOwnerAsLine(MatrixDefinition value) {
        appendDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep(), (SmObjectImpl)value);
    }

    @objid ("0025d47a-3b4a-4f61-be51-61b2a12d401b")
    @Override
    public MatrixDefinition getOwnerAsCol() {
        return (MatrixDefinition) getDepVal(QueryDefinitionData.Metadata.OwnerAsColDep());
    }

    @objid ("301d948c-0df4-464c-a833-aa23d3c05a4d")
    @Override
    public void setOwnerAsCol(MatrixDefinition value) {
        appendDepVal(QueryDefinitionData.Metadata.OwnerAsColDep(), (SmObjectImpl)value);
    }

    @objid ("9a51ff76-492b-4191-bf49-b1eb2ff504c6")
    @Override
    public MatrixDefinition getOwnerAsDepth() {
        return (MatrixDefinition) getDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep());
    }

    @objid ("dd9df07b-8ffe-43d5-b15d-13e0ff9001be")
    @Override
    public void setOwnerAsDepth(MatrixDefinition value) {
        appendDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep(), (SmObjectImpl)value);
    }

    @objid ("e1cc8439-cdb9-46fe-a47d-71334196da8a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsColDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3a6b0114-b280-459e-8ca8-2fdf236eb536")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep());
        if (obj != null)
          return new SmDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsColDep());
        if (obj != null)
          return new SmDepVal(QueryDefinitionData.Metadata.OwnerAsColDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep());
        if (obj != null)
          return new SmDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f6263b05-e9d3-4b6f-9b75-0abab70ee015")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitQueryDefinition(this);
        else
          return null;
    }

}
