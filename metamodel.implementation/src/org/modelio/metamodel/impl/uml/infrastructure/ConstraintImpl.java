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
/*   Metamodel version: 9020              */
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

    @objid ("fdfb8751-5bef-45ce-b02c-aee54da4675e")
    @Override
    public String getBaseClass() {
        return (String) getAttVal(ConstraintData.Metadata.BaseClassAtt());
    }

    @objid ("6edb7b59-11fd-4258-aca6-71850c4ed277")
    @Override
    public void setBaseClass(String value) {
        setAttVal(ConstraintData.Metadata.BaseClassAtt(), value);
    }

    @objid ("4b67ac03-5cf0-493a-80eb-07a420f34ad0")
    @Override
    public String getBody() {
        return (String) getAttVal(ConstraintData.Metadata.BodyAtt());
    }

    @objid ("d5546a92-9c34-4528-8b6e-8d7993fd8ec3")
    @Override
    public void setBody(String value) {
        setAttVal(ConstraintData.Metadata.BodyAtt(), value);
    }

    @objid ("dcfa99ca-f765-44be-99c9-67135050b238")
    @Override
    public String getLanguage() {
        return (String) getAttVal(ConstraintData.Metadata.LanguageAtt());
    }

    @objid ("9b22347c-d6ca-4ff5-9667-3fbd650b6e68")
    @Override
    public void setLanguage(String value) {
        setAttVal(ConstraintData.Metadata.LanguageAtt(), value);
    }

    @objid ("1acf5cf9-2654-401b-89e7-4fe9cb76fbf4")
    @Override
    public EList<ModelElement> getConstrainedElement() {
        return new SmList<>(this, ConstraintData.Metadata.ConstrainedElementDep());
    }

    @objid ("d6639080-ef69-459e-b85c-c9890d9b49b8")
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

    @objid ("9ddb35c6-2c4a-49af-8b9e-363142bba5b4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConstraint(this);
        else
          return null;
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

}
