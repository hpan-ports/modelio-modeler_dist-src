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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.AssociationData;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("fc1c8e64-9214-4368-b40c-1cd3ca98af0e")
public class AssociationImpl extends ModelElementImpl implements Association {
    @objid ("2b1bab62-c9cc-48df-b34c-e6427c1c26dc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        for (SmObjectImpl obj : this.getDepValList(((AssociationSmClass) getClassOf()).getEndDep())) {
            return obj;
        }
        return super.getCompositionOwner();
    }

    @objid ("12b5fdbd-b680-4038-b500-0ab8b40b6b74")
    @Override
    public SmDepVal getCompositionRelation() {
        for (SmObjectImpl obj : this.getDepValList(((AssociationSmClass) getClassOf()).getEndDep())) {
            return new SmDepVal(((AssociationSmClass) getClassOf()).getEndDep(), obj);
        }
        return super.getCompositionRelation();
    }

    @objid ("2ecfd993-ce7a-41d4-a0a4-cc3e146ee385")
    @Override
    public EList<Link> getOccurence() {
        return new SmList<>(this, ((AssociationSmClass)getClassOf()).getOccurenceDep());
    }

    @objid ("3d81f199-42b4-492d-ad4a-e7c969219f37")
    @Override
    public <T extends Link> List<T> getOccurence(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Link element : getOccurence()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("100d246f-b7e3-4005-a65f-318832c49d38")
    @Override
    public EList<AssociationEnd> getEnd() {
        return new SmList<>(this, ((AssociationSmClass)getClassOf()).getEndDep());
    }

    @objid ("95fbccbe-2e25-4526-836f-613de5c1c87c")
    @Override
    public <T extends AssociationEnd> List<T> getEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final AssociationEnd element : getEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("22b339ab-51f8-4893-a7e7-856468f40047")
    @Override
    public ClassAssociation getLinkToClass() {
        Object obj = getDepVal(((AssociationSmClass)getClassOf()).getLinkToClassDep());
        return (obj instanceof ClassAssociation)? (ClassAssociation)obj : null;
    }

    @objid ("3c4a19dc-9fa0-4563-8925-753c50c91ec3")
    @Override
    public void setLinkToClass(ClassAssociation value) {
        appendDepVal(((AssociationSmClass)getClassOf()).getLinkToClassDep(), (SmObjectImpl)value);
    }

    @objid ("0cff5c75-a246-4cc3-ac01-370267274d18")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAssociation(this);
        else
          return null;
    }

}
