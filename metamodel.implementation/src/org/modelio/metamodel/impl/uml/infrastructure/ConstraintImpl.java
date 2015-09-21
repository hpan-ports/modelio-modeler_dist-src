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
 Generated on: Mar 9, 2015
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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ConstraintData;
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
        List<SmObjectImpl> list = this.getDepValList(((ConstraintSmClass) getClassOf()).getConstrainedElementDep());
        if (list.isEmpty()) {
            return super.getCompositionOwner();
        } else {
            return list.get(0);
        }
    }

    @objid ("006b90fe-4224-10bf-bd58-001ec947cd2a")
    @Override
    public SmDepVal getCompositionRelation() {
        List<SmObjectImpl> list = this.getDepValList(((ConstraintSmClass) getClassOf()).getConstrainedElementDep());
        if (list.isEmpty()) {
            return super.getCompositionRelation();
        } else {
            return new SmDepVal(((ConstraintSmClass) getClassOf()).getConstrainedElementDep(), list.get(0));
        }
    }

    @objid ("dc0243f1-0d07-41a0-a075-8956cb67cd32")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        if (dep == ((ConstraintSmClass) getClassOf()).getConstrainedElementDep()) {
            // Workaround bug where the storage handle is not updated
            EList<ModelElement> remainingOwners = getConstrainedElement();
            if (!remainingOwners.isEmpty()) {
                // Remove and add again the first remaining owner.
                // Note : this will trigger recursively the removal & addition of all other owners.
                ModelElement r = remainingOwners.get(0);
                r.getConstraintDefinition().remove(this);
        
                r.getConstraintDefinition().add(this);
            }
        }
        
        super.afterEraseDepVal(dep, value);
    }

    @objid ("8832d486-0883-483f-998f-892ea710ce8a")
    @Override
    public String getBaseClass() {
        return (String) getAttVal(((ConstraintSmClass)getClassOf()).getBaseClassAtt());
    }

    @objid ("b8592634-2485-48f1-9a04-3865bd8c7438")
    @Override
    public void setBaseClass(String value) {
        setAttVal(((ConstraintSmClass)getClassOf()).getBaseClassAtt(), value);
    }

    @objid ("d2dbcf21-ca30-4d6c-a535-12348e3bf796")
    @Override
    public String getBody() {
        return (String) getAttVal(((ConstraintSmClass)getClassOf()).getBodyAtt());
    }

    @objid ("c5db7488-c4cd-44f0-9dcb-e76191722f81")
    @Override
    public void setBody(String value) {
        setAttVal(((ConstraintSmClass)getClassOf()).getBodyAtt(), value);
    }

    @objid ("993e57ed-b4da-44a7-a276-3b4ecbed904f")
    @Override
    public String getLanguage() {
        return (String) getAttVal(((ConstraintSmClass)getClassOf()).getLanguageAtt());
    }

    @objid ("252c5775-8dc4-4cdc-b97d-5691df66961a")
    @Override
    public void setLanguage(String value) {
        setAttVal(((ConstraintSmClass)getClassOf()).getLanguageAtt(), value);
    }

    @objid ("e8f1208f-dd53-4c7d-b65e-e15973a5b0e2")
    @Override
    public EList<ModelElement> getConstrainedElement() {
        return new SmList<>(this, ((ConstraintSmClass)getClassOf()).getConstrainedElementDep());
    }

    @objid ("c1e9e202-34d9-4973-8e28-7a8bdc4fd80f")
    @Override
    public <T extends ModelElement> List<T> getConstrainedElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ModelElement element : getConstrainedElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("60e515d9-443f-4376-a875-399f00e024e2")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConstraint(this);
        else
          return null;
    }

}
