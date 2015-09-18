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
    @objid ("281d5d3c-db6f-4f8d-aae5-5255bdd4b2a2")
    @Override
    public boolean isUsingAdditions() {
        return (Boolean) getAttVal(QueryDefinitionData.Metadata.UsingAdditionsAtt());
    }

    @objid ("51dbf285-069f-445f-b9e6-107c9db7fb9b")
    @Override
    public void setUsingAdditions(boolean value) {
        setAttVal(QueryDefinitionData.Metadata.UsingAdditionsAtt(), value);
    }

    @objid ("c8185300-a31d-4dab-a078-2a3b7c450dcb")
    @Override
    public EList<Element> getAdded() {
        return new SmList<>(this, QueryDefinitionData.Metadata.AddedDep());
    }

    @objid ("38a0cc33-958f-4648-b67d-ac335bab8806")
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

    @objid ("1e60b2a2-474c-4674-b67e-69d51a241d7c")
    @Override
    public ExternProcessor getProcessor() {
        return (ExternProcessor) getDepVal(QueryDefinitionData.Metadata.ProcessorDep());
    }

    @objid ("aa8113ec-0be2-4709-9c7a-2ef383337f41")
    @Override
    public void setProcessor(ExternProcessor value) {
        appendDepVal(QueryDefinitionData.Metadata.ProcessorDep(), (SmObjectImpl)value);
    }

    @objid ("ff297ffb-5d68-498d-aad2-2c658286cc75")
    @Override
    public PropertyTable getParameters() {
        return (PropertyTable) getDepVal(QueryDefinitionData.Metadata.ParametersDep());
    }

    @objid ("5589be2e-14b8-4d32-a7d5-3f755b66ac48")
    @Override
    public void setParameters(PropertyTable value) {
        appendDepVal(QueryDefinitionData.Metadata.ParametersDep(), (SmObjectImpl)value);
    }

    @objid ("5be69560-3e6b-4a38-9007-9ae8c6220045")
    @Override
    public MatrixDefinition getOwnerAsLine() {
        return (MatrixDefinition) getDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep());
    }

    @objid ("f9a2060a-b766-4959-af45-cdfebf9a7b4b")
    @Override
    public void setOwnerAsLine(MatrixDefinition value) {
        appendDepVal(QueryDefinitionData.Metadata.OwnerAsLineDep(), (SmObjectImpl)value);
    }

    @objid ("448120e2-f9ea-453a-b5c2-25b14fea4f02")
    @Override
    public MatrixDefinition getOwnerAsCol() {
        return (MatrixDefinition) getDepVal(QueryDefinitionData.Metadata.OwnerAsColDep());
    }

    @objid ("f61b4a83-67b5-43cc-bb89-15d0ac2ce366")
    @Override
    public void setOwnerAsCol(MatrixDefinition value) {
        appendDepVal(QueryDefinitionData.Metadata.OwnerAsColDep(), (SmObjectImpl)value);
    }

    @objid ("7dbd45ca-0ca4-47ae-bf36-9a87bf0bfc10")
    @Override
    public MatrixDefinition getOwnerAsDepth() {
        return (MatrixDefinition) getDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep());
    }

    @objid ("1c9db0ed-ad2d-4823-81bd-3f5a707a830b")
    @Override
    public void setOwnerAsDepth(MatrixDefinition value) {
        appendDepVal(QueryDefinitionData.Metadata.OwnerAsDepthDep(), (SmObjectImpl)value);
    }

    @objid ("5b4559fc-d174-4542-9eee-5646b24579e9")
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

    @objid ("712a4bf7-f131-4c50-8abe-e22e7052d6e5")
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

    @objid ("0f7d5e30-37c6-480f-b0a6-518554afb747")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitQueryDefinition(this);
        else
          return null;
    }

}
