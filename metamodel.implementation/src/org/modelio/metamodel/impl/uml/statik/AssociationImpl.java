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
import org.modelio.metamodel.data.uml.statik.AssociationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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

@objid ("fc1c8e64-9214-4368-b40c-1cd3ca98af0e")
public class AssociationImpl extends ModelElementImpl implements Association {
    @objid ("2b1bab62-c9cc-48df-b34c-e6427c1c26dc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        for (SmObjectImpl obj : this.getDepValList(AssociationData.Metadata.EndDep())) 
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("12b5fdbd-b680-4038-b500-0ab8b40b6b74")
    @Override
    public SmDepVal getCompositionRelation() {
        for (SmObjectImpl obj : this.getDepValList(AssociationData.Metadata.EndDep())) {
            return new SmDepVal(AssociationData.Metadata.EndDep(), obj);
        }
        return super.getCompositionRelation();
    }

    @objid ("5485138e-e689-4fb4-a661-5fed47d7689b")
    @Override
    public EList<Link> getOccurence() {
        return new SmList<>(this, AssociationData.Metadata.OccurenceDep());
    }

    @objid ("48bb8482-0fcc-48cb-8dae-954ab26e8361")
    @Override
    public <T extends Link> List<T> getOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Link element : getOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("92874822-e22f-4281-8ea2-e7e924eb2780")
    @Override
    public EList<AssociationEnd> getEnd() {
        return new SmList<>(this, AssociationData.Metadata.EndDep());
    }

    @objid ("04a0a9ec-2bb8-44fc-8517-09c6fc1be76e")
    @Override
    public <T extends AssociationEnd> List<T> getEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AssociationEnd element : getEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a488f4c5-91cd-4d22-bbf2-0d26c81e025a")
    @Override
    public ClassAssociation getLinkToClass() {
        return (ClassAssociation) getDepVal(AssociationData.Metadata.LinkToClassDep());
    }

    @objid ("96ce0cc4-2310-4d6f-a09e-0709c0ef7ef6")
    @Override
    public void setLinkToClass(ClassAssociation value) {
        appendDepVal(AssociationData.Metadata.LinkToClassDep(), (SmObjectImpl)value);
    }

    @objid ("01bd5009-7b31-408f-aaf0-afdd88c30ae8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAssociation(this);
        else
          return null;
    }

}
