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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ConstraintData;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00856a60-c4be-1fd8-97fe-001ec947cd2a")
public class ConstraintImpl extends ModelElementImpl implements Constraint {
    @objid ("006b6ba6-4224-10bf-bd58-001ec947cd2a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        List<SmObjectImpl> list = this.getDepValList(ConstraintData.Metadata.ConstrainedElementDep());
        if (list.isEmpty())
            return super.getCompositionOwner();
        else
            return list.get(0);
    }

    @objid ("006b90fe-4224-10bf-bd58-001ec947cd2a")
    @Override
    public SmDepVal getCompositionRelation() {
        List<SmObjectImpl> list = this.getDepValList(ConstraintData.Metadata.ConstrainedElementDep());
        if (list.isEmpty())
            return super.getCompositionRelation();
        else
          return new SmDepVal(ConstraintData.Metadata.ConstrainedElementDep(), list.get(0));
    }

    @objid ("42763e2a-b632-4f54-b7d6-fdca466eb055")
    @Override
    public String getBaseClass() {
        return (String) getAttVal(ConstraintData.Metadata.BaseClassAtt());
    }

    @objid ("2d423f16-fb31-4e89-ae19-5baf94e113d3")
    @Override
    public void setBaseClass(String value) {
        setAttVal(ConstraintData.Metadata.BaseClassAtt(), value);
    }

    @objid ("259c33d6-e3ef-4a68-b3a0-ab2688a28981")
    @Override
    public String getBody() {
        return (String) getAttVal(ConstraintData.Metadata.BodyAtt());
    }

    @objid ("fb0ed022-7610-41ec-9567-4e83e0525b0c")
    @Override
    public void setBody(String value) {
        setAttVal(ConstraintData.Metadata.BodyAtt(), value);
    }

    @objid ("37db0883-46be-4e50-9b3d-6dfcd181bf39")
    @Override
    public String getLanguage() {
        return (String) getAttVal(ConstraintData.Metadata.LanguageAtt());
    }

    @objid ("897e252f-cd1b-4421-a217-7294e1a51764")
    @Override
    public void setLanguage(String value) {
        setAttVal(ConstraintData.Metadata.LanguageAtt(), value);
    }

    @objid ("5e905ce2-27f6-4599-ba06-38a29c2a1f76")
    @Override
    public EList<ModelElement> getConstrainedElement() {
        return new SmList<>(this, ConstraintData.Metadata.ConstrainedElementDep());
    }

    @objid ("03225f84-7a3d-446a-9c93-7b9355465d60")
    @Override
    public <T extends ModelElement> List<T> getConstrainedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelElement element : getConstrainedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3c1df8d6-9310-4737-83e9-6871c10168b6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConstraint(this);
        else
          return null;
    }

}
