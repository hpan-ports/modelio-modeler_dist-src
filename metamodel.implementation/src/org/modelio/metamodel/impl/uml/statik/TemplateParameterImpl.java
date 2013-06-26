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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("001d5f2e-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateParameterImpl extends GeneralClassImpl implements TemplateParameter {
    @objid ("b0ac1048-88cd-47fd-8d69-ed1354682541")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(TemplateParameterData.Metadata.DefaultValueAtt());
    }

    @objid ("7bfdad1e-45a4-49a5-b285-ae757905742a")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(TemplateParameterData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("f03bc92a-71b0-4548-a410-dc5ba51b1de9")
    @Override
    public boolean isIsValueParameter() {
        return (Boolean) getAttVal(TemplateParameterData.Metadata.IsValueParameterAtt());
    }

    @objid ("b05076f2-ccb3-49c1-a434-931b159c00da")
    @Override
    public void setIsValueParameter(boolean value) {
        setAttVal(TemplateParameterData.Metadata.IsValueParameterAtt(), value);
    }

    @objid ("41a112ae-36ac-481c-b428-9d1bd3f3b6af")
    @Override
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        return new SmList<>(this, TemplateParameterData.Metadata.ParameterSubstitutionDep());
    }

    @objid ("c74c3acb-d578-4e2a-8b02-0b4c6470520d")
    @Override
    public <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameterSubstitution element : getParameterSubstitution()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("851ec000-1625-4a83-b926-9c8a9e6391ef")
    @Override
    public ModelElement getType() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.TypeDep());
    }

    @objid ("1624495c-1313-4a21-9b8d-ce3033ea0bdd")
    @Override
    public void setType(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("042fcc17-f7fc-4941-9bb8-24a2438899fe")
    @Override
    public NameSpace getParameterized() {
        return (NameSpace) getDepVal(TemplateParameterData.Metadata.ParameterizedDep());
    }

    @objid ("faf500ba-ef96-4c8b-b6dc-6b613ed65678")
    @Override
    public void setParameterized(NameSpace value) {
        appendDepVal(TemplateParameterData.Metadata.ParameterizedDep(), (SmObjectImpl)value);
    }

    @objid ("6c0e20ca-9c19-4c26-8021-5e5dbe772611")
    @Override
    public ModelElement getOwnedParameterElement() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.OwnedParameterElementDep());
    }

    @objid ("e93bdd29-b7ef-4594-a60c-6d989afcf8c0")
    @Override
    public void setOwnedParameterElement(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.OwnedParameterElementDep(), (SmObjectImpl)value);
    }

    @objid ("09a736b0-b758-4d4f-8216-aca0c51f14ab")
    @Override
    public ModelElement getDefaultType() {
        return (ModelElement) getDepVal(TemplateParameterData.Metadata.DefaultTypeDep());
    }

    @objid ("c8bc6302-3898-4384-a214-63f2abfca118")
    @Override
    public void setDefaultType(ModelElement value) {
        appendDepVal(TemplateParameterData.Metadata.DefaultTypeDep(), (SmObjectImpl)value);
    }

    @objid ("5c288feb-b8c9-42e7-9e12-fa418ac9df1c")
    @Override
    public Operation getParameterizedOperation() {
        return (Operation) getDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep());
    }

    @objid ("ca3bbf81-3d6e-4368-807e-4d24ca4f87ff")
    @Override
    public void setParameterizedOperation(Operation value) {
        appendDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep(), (SmObjectImpl)value);
    }

    @objid ("6c572aaf-ae9c-416e-9201-06cf2dbc191e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1fa65c05-1936-410a-bc62-9f4bf47fc302")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedDep());
        if (obj != null)
          return new SmDepVal(TemplateParameterData.Metadata.ParameterizedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep());
        if (obj != null)
          return new SmDepVal(TemplateParameterData.Metadata.ParameterizedOperationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("333073fe-7ddb-4f3d-b871-94adb42e6601")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateParameter(this);
        else
          return null;
    }

}
