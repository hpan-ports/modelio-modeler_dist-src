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
    @objid ("5ba28ebf-68c4-4d29-b783-f20a84bd1718")
    @Override
    public String getValue() {
        return (String) getAttVal(TemplateParameterSubstitutionData.Metadata.ValueAtt());
    }

    @objid ("91d0c940-fcc6-44f4-848f-d504920f7cd6")
    @Override
    public void setValue(String value) {
        setAttVal(TemplateParameterSubstitutionData.Metadata.ValueAtt(), value);
    }

    @objid ("bbe85b73-0eda-4718-a96a-68af7fde58ad")
    @Override
    public TemplateBinding getOwner() {
        return (TemplateBinding) getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
    }

    @objid ("5c59907f-45c5-447f-8fe9-d035bcb22d8e")
    @Override
    public void setOwner(TemplateBinding value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("38279c60-effd-4217-b0b1-09a06191b0f9")
    @Override
    public ModelElement getActual() {
        return (ModelElement) getDepVal(TemplateParameterSubstitutionData.Metadata.ActualDep());
    }

    @objid ("229b9d8a-3700-4d89-b484-c9d5719de6b6")
    @Override
    public void setActual(ModelElement value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.ActualDep(), (SmObjectImpl)value);
    }

    @objid ("bebc6885-f590-4a12-84c2-20b85d0b193f")
    @Override
    public TemplateParameter getFormalParameter() {
        return (TemplateParameter) getDepVal(TemplateParameterSubstitutionData.Metadata.FormalParameterDep());
    }

    @objid ("73374b57-3516-4f4b-bfaf-75de20136f58")
    @Override
    public void setFormalParameter(TemplateParameter value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.FormalParameterDep(), (SmObjectImpl)value);
    }

    @objid ("02b02fff-e51a-42ae-a9a1-8a63d2a3e97d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7bc055f9-c8c6-469a-b615-a0c6327dc989")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e2b57c1b-d67b-4b3c-9db5-5267e8f90aa7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateParameterSubstitution(this);
        else
          return null;
    }

}
