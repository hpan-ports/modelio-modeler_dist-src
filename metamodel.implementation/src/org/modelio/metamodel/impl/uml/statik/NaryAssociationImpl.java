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
import org.modelio.metamodel.impl.uml.statik.NaryAssociationData;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0021a61a-c4bf-1fd8-97fe-001ec947cd2a")
public class NaryAssociationImpl extends ModelElementImpl implements NaryAssociation {
    @objid ("28d8131c-4eda-4e63-8e86-f2ed6bb86858")
    @Override
    public SmObjectImpl getCompositionOwner() {
        for (SmObjectImpl obj : this.getDepValList(((NaryAssociationSmClass) getClassOf()).getNaryEndDep())) {
            // Avoid infinite composition loops
            SmObjectImpl objOwner = obj.getCompositionOwner();
            if (objOwner != this && objOwner != null) {
                return obj;
            }
        }
        return super.getCompositionOwner();
    }

    @objid ("82e19039-824a-4fb9-95f0-47b803583c97")
    @Override
    public SmDepVal getCompositionRelation() {
        for (SmObjectImpl obj : this.getDepValList(((NaryAssociationSmClass) getClassOf()).getNaryEndDep())) {
            // Avoid infinite composition loops
            SmObjectImpl objOwner = obj.getCompositionOwner();
            if (objOwner != this && objOwner != null) {
                return new SmDepVal(((NaryAssociationSmClass) getClassOf()).getNaryEndDep(), obj);
            }
        }
        return super.getCompositionRelation();
    }

    @objid ("9fa0432b-1708-470d-9074-f9fc3d97fa0c")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        if (dep == ((NaryAssociationSmClass) getClassOf()).getNaryEndDep()) {
            // Workaround bug where the storage handle is not updated
            EList<NaryAssociationEnd> remainingOwners = getNaryEnd();
            if (!remainingOwners.isEmpty()) {
                // Remove and add again the first remaining owner.
                // Note : this will trigger recursively the removal & addition of all other owners.
                NaryAssociationEnd r = remainingOwners.get(0);
                r.setNaryAssociation(null);
                r.setNaryAssociation(this);
            }
        }
        
        super.afterEraseDepVal(dep, value);
    }

    @objid ("83f5d9e8-15ff-421c-b669-3cb58ce5860e")
    @Override
    public EList<NaryLink> getOccurence() {
        return new SmList<>(this, ((NaryAssociationSmClass)getClassOf()).getOccurenceDep());
    }

    @objid ("02dc0012-53c7-46e8-864b-5f54aeef5d9b")
    @Override
    public <T extends NaryLink> List<T> getOccurence(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NaryLink element : getOccurence()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("413e2662-0670-4535-8b02-d0a02817d513")
    @Override
    public EList<NaryAssociationEnd> getNaryEnd() {
        return new SmList<>(this, ((NaryAssociationSmClass)getClassOf()).getNaryEndDep());
    }

    @objid ("94e52bd4-b211-4f00-b360-8b3ec1bd4506")
    @Override
    public <T extends NaryAssociationEnd> List<T> getNaryEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NaryAssociationEnd element : getNaryEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("75c42981-6ae7-48e1-b0ac-4cb6624f0ba9")
    @Override
    public ClassAssociation getLinkToClass() {
        Object obj = getDepVal(((NaryAssociationSmClass)getClassOf()).getLinkToClassDep());
        return (obj instanceof ClassAssociation)? (ClassAssociation)obj : null;
    }

    @objid ("1c267b08-8e85-4ea3-a661-f92c02ddb418")
    @Override
    public void setLinkToClass(ClassAssociation value) {
        appendDepVal(((NaryAssociationSmClass)getClassOf()).getLinkToClassDep(), (SmObjectImpl)value);
    }

    @objid ("9aa29a7b-0416-42fd-a4c0-b209b1e99fac")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryAssociation(this);
        else
          return null;
    }

}
