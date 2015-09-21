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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterSubstitutionData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("001e4902-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateParameterSubstitutionImpl extends ModelElementImpl implements TemplateParameterSubstitution {
    @objid ("21e085dd-14cf-41da-92c7-4fe881be4608")
    @Override
    public String getValue() {
        return (String) getAttVal(((TemplateParameterSubstitutionSmClass)getClassOf()).getValueAtt());
    }

    @objid ("1b765880-078c-4265-b916-1cf5a00cdcff")
    @Override
    public void setValue(String value) {
        setAttVal(((TemplateParameterSubstitutionSmClass)getClassOf()).getValueAtt(), value);
    }

    @objid ("7392a9e1-61ff-40f7-971d-a8ace1e7396e")
    @Override
    public TemplateBinding getOwner() {
        Object obj = getDepVal(((TemplateParameterSubstitutionSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof TemplateBinding)? (TemplateBinding)obj : null;
    }

    @objid ("f1f93d5f-d13b-4c21-a545-9203733ebcf5")
    @Override
    public void setOwner(TemplateBinding value) {
        appendDepVal(((TemplateParameterSubstitutionSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("a36d1ef6-f7ab-4c24-a75a-6fda52c417b0")
    @Override
    public ModelElement getActual() {
        Object obj = getDepVal(((TemplateParameterSubstitutionSmClass)getClassOf()).getActualDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("8f8813b6-0cde-4a56-a6ea-21e5a6697e37")
    @Override
    public void setActual(ModelElement value) {
        appendDepVal(((TemplateParameterSubstitutionSmClass)getClassOf()).getActualDep(), (SmObjectImpl)value);
    }

    @objid ("819e2424-6bd6-416b-99e6-11dbf4d5e152")
    @Override
    public TemplateParameter getFormalParameter() {
        Object obj = getDepVal(((TemplateParameterSubstitutionSmClass)getClassOf()).getFormalParameterDep());
        return (obj instanceof TemplateParameter)? (TemplateParameter)obj : null;
    }

    @objid ("69e72884-f68b-427e-8d19-3d9cf36591fe")
    @Override
    public void setFormalParameter(TemplateParameter value) {
        appendDepVal(((TemplateParameterSubstitutionSmClass)getClassOf()).getFormalParameterDep(), (SmObjectImpl)value);
    }

    @objid ("05c49e7a-abda-42d0-9203-72fb15895688")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((TemplateParameterSubstitutionSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("302fa047-a7ac-4f1a-8ca2-68d3bf3efb90")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((TemplateParameterSubstitutionSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("7a5a9e3c-7fea-4b29-9cd7-fc371db95e96")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateParameterSubstitution(this);
        else
          return null;
    }

}
