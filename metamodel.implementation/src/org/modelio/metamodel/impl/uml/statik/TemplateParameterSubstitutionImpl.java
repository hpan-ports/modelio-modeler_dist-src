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
    @objid ("0caadf28-cd22-4aaf-8552-cac12d7d83e0")
    @Override
    public String getValue() {
        return (String) getAttVal(TemplateParameterSubstitutionData.Metadata.ValueAtt());
    }

    @objid ("bf5f903a-9015-4aec-a58b-6c14bc235bb0")
    @Override
    public void setValue(String value) {
        setAttVal(TemplateParameterSubstitutionData.Metadata.ValueAtt(), value);
    }

    @objid ("b8ea3748-96f0-43c6-b83d-1c606951d5a1")
    @Override
    public TemplateBinding getOwner() {
        return (TemplateBinding) getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
    }

    @objid ("0c824d22-4224-481c-b7b0-74019a704c67")
    @Override
    public void setOwner(TemplateBinding value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("fffd53f3-d406-41fe-bbb7-f3a0b35fee5f")
    @Override
    public ModelElement getActual() {
        return (ModelElement) getDepVal(TemplateParameterSubstitutionData.Metadata.ActualDep());
    }

    @objid ("845d09f1-1766-4ad1-b439-88d03b3d851b")
    @Override
    public void setActual(ModelElement value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.ActualDep(), (SmObjectImpl)value);
    }

    @objid ("329d9260-dd43-492f-af9c-f7e0e6d9bded")
    @Override
    public TemplateParameter getFormalParameter() {
        return (TemplateParameter) getDepVal(TemplateParameterSubstitutionData.Metadata.FormalParameterDep());
    }

    @objid ("8d174b84-db74-4d7f-830f-9a2e007fbccd")
    @Override
    public void setFormalParameter(TemplateParameter value) {
        appendDepVal(TemplateParameterSubstitutionData.Metadata.FormalParameterDep(), (SmObjectImpl)value);
    }

    @objid ("185074fb-edcb-4d17-8a29-27a3d3513a86")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5b3ad2ec-8264-453e-b523-38268a25bae4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(TemplateParameterSubstitutionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("08f4181d-4e6c-46cb-b4fa-2ac9f791eacd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateParameterSubstitution(this);
        else
          return null;
    }

}
