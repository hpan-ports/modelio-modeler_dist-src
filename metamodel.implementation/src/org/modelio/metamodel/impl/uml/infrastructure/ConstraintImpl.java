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
import org.modelio.vcore.smkernel.meta.SmDependency;

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

    @objid ("dc0243f1-0d07-41a0-a075-8956cb67cd32")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        if (dep == ConstraintData.Metadata.ConstrainedElementDep()) {
            // Workaround bug where the storage handle is not updated
            EList<ModelElement> remainingOwners = getConstrainedElement();
            if (! remainingOwners.isEmpty()) {
                // Remove and add again the first remaining owner.
                // Note : this will trigger recursively the removal & addition of all other owners.
                ModelElement r = remainingOwners.get(0);
                r.getConstraintDefinition().remove(this);
                
                r.getConstraintDefinition().add(this);
            }
        }
        
        super.afterEraseDepVal(dep, value);
    }

    @objid ("a99dc2da-5078-449d-8dfd-86a26879a43f")
    @Override
    public String getBaseClass() {
        return (String) getAttVal(ConstraintData.Metadata.BaseClassAtt());
    }

    @objid ("3c2df05e-277b-4302-a51d-ef82424bb9c6")
    @Override
    public void setBaseClass(String value) {
        setAttVal(ConstraintData.Metadata.BaseClassAtt(), value);
    }

    @objid ("2ebec903-b1e3-4a0c-9611-1211c0a3ac4e")
    @Override
    public String getBody() {
        return (String) getAttVal(ConstraintData.Metadata.BodyAtt());
    }

    @objid ("1d5d8fef-4f7b-450d-82bc-42b16a8001f1")
    @Override
    public void setBody(String value) {
        setAttVal(ConstraintData.Metadata.BodyAtt(), value);
    }

    @objid ("3eee60f2-37f1-42ff-8bbf-a33937f75896")
    @Override
    public String getLanguage() {
        return (String) getAttVal(ConstraintData.Metadata.LanguageAtt());
    }

    @objid ("fc0a7c3b-9852-427b-a7f2-1e25cb047365")
    @Override
    public void setLanguage(String value) {
        setAttVal(ConstraintData.Metadata.LanguageAtt(), value);
    }

    @objid ("bdb506c0-6bf8-4dd2-9539-a4e54ab5cf2b")
    @Override
    public EList<ModelElement> getConstrainedElement() {
        return new SmList<>(this, ConstraintData.Metadata.ConstrainedElementDep());
    }

    @objid ("854173f9-e40a-4e82-b518-6dc0658f34e7")
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

    @objid ("d57c04e8-6f42-4502-8cf1-1efd9af6d228")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConstraint(this);
        else
          return null;
    }

}
