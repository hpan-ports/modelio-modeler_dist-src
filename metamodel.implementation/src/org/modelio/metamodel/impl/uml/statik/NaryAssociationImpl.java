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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.NaryAssociationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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
        for (SmObjectImpl obj : this.getDepValList(NaryAssociationData.Metadata.NaryEndDep())) {
            // Avoid infinite composition loops
            SmObjectImpl objOwner = obj.getCompositionOwner();
            if (objOwner != this && objOwner != null)
                return obj;
        }
        return super.getCompositionOwner();
    }

    @objid ("82e19039-824a-4fb9-95f0-47b803583c97")
    @Override
    public SmDepVal getCompositionRelation() {
        for (SmObjectImpl obj : this.getDepValList(NaryAssociationData.Metadata.NaryEndDep())) {
            // Avoid infinite composition loops
            SmObjectImpl objOwner = obj.getCompositionOwner();
            if (objOwner != this && objOwner != null)
                return new SmDepVal(NaryAssociationData.Metadata.NaryEndDep(), obj);
        }
        return super.getCompositionRelation();
    }

    @objid ("9fa0432b-1708-470d-9074-f9fc3d97fa0c")
    @Override
    public void afterEraseDepVal(SmDependency dep, SmObjectImpl value) {
        if (dep == NaryAssociationData.Metadata.NaryEndDep()) {
            // Workaround bug where the storage handle is not updated
            EList<NaryAssociationEnd> remainingOwners = getNaryEnd();
            if (! remainingOwners.isEmpty()) {
                // Remove and add again the first remaining owner.
                // Note : this will trigger recursively the removal & addition of all other owners.
                NaryAssociationEnd r = remainingOwners.get(0);
                r.setNaryAssociation(null);
                r.setNaryAssociation(this);
            }
        }
        
        super.afterEraseDepVal(dep, value);
    }

    @objid ("7f41b186-a777-48ff-be7d-154ace6eee00")
    @Override
    public EList<NaryLink> getOccurence() {
        return new SmList<>(this, NaryAssociationData.Metadata.OccurenceDep());
    }

    @objid ("80364607-1cfa-4e82-8f17-e158f62d8968")
    @Override
    public <T extends NaryLink> List<T> getOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryLink element : getOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1a2ee738-8554-4232-904a-da89e5d5677c")
    @Override
    public EList<NaryAssociationEnd> getNaryEnd() {
        return new SmList<>(this, NaryAssociationData.Metadata.NaryEndDep());
    }

    @objid ("01172f05-98e1-4c1d-a6b7-4f07fd42fc8a")
    @Override
    public <T extends NaryAssociationEnd> List<T> getNaryEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryAssociationEnd element : getNaryEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1dbc8724-73c4-471f-84a0-7d8fd1a363ba")
    @Override
    public ClassAssociation getLinkToClass() {
        return (ClassAssociation) getDepVal(NaryAssociationData.Metadata.LinkToClassDep());
    }

    @objid ("db956f0c-4559-4de8-b62b-c003e46b4639")
    @Override
    public void setLinkToClass(ClassAssociation value) {
        appendDepVal(NaryAssociationData.Metadata.LinkToClassDep(), (SmObjectImpl)value);
    }

    @objid ("2718a345-7153-4fa4-a49f-62913e75bd6c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryAssociation(this);
        else
          return null;
    }

}
