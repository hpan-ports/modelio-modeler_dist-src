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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.TemplateParameterSubstitutionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.TemplateBinding;
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

@objid ("001e4902-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateParameterSubstitutionImpl extends ModelElementImpl implements TemplateParameterSubstitution {
    @objid ("23d96c2a-dd0c-41cf-8326-2fce99122fcd")
    @Override
    public String getValue() {
        return (String) getAttVal(TemplateParameterSubstitutionData.Metadata.ValueAtt());
    }

    @objid ("c1b0dcde-de75-4fd9-9190-77828cc973b7")
    @Override
    public void setValue(String value) {
        setAttVal(TemplateParameterSubstitutionData.Metadata.ValueAtt(), value);
    }

    @objid ("f6230a5f-3efe-44af-b12e-309e4552de53")
    @Override
    public TemplateBinding getOwner() {
        return (TemplateBinding) getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
    }

    @objid ("ee4215a0-0109-4bba-86f4-092ff39b9cd4")
    @Override
    public void setOwner(TemplateBinding value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("98940660-7e2b-4dc0-8730-3576b4b8ec51")
    @Override
    public ModelElement getActual() {
        return (ModelElement) getDepVal(TemplateParameterSubstitutionData.Metadata.ActualDep());
    }

    @objid ("ec45d254-c642-460a-b042-d337b28d522e")
    @Override
    public void setActual(ModelElement value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.ActualDep(), (SmObjectImpl)value);
    }

    @objid ("7888bdb5-234d-4559-bc34-03d3bf1e4b01")
    @Override
    public TemplateParameter getFormalParameter() {
        return (TemplateParameter) getDepVal(TemplateParameterSubstitutionData.Metadata.FormalParameterDep());
    }

    @objid ("b68dbfc8-ace7-44d5-b257-ed833c0cc8f2")
    @Override
    public void setFormalParameter(TemplateParameter value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.FormalParameterDep(), (SmObjectImpl)value);
    }

    @objid ("5c8eb496-fc03-4040-a07f-86dca82c9f02")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("82f78fd1-039b-4b84-ae3d-7aca22503c2d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c34a631c-56f5-442a-8ca3-66f72281883e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateParameterSubstitution(this);
        else
          return null;
    }

}
