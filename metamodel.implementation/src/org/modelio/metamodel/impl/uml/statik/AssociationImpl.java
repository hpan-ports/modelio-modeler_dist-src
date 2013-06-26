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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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

    @objid ("f2b23c64-732e-4bc5-b567-6cb4d1923fbc")
    @Override
    public EList<Link> getOccurence() {
        return new SmList<>(this, AssociationData.Metadata.OccurenceDep());
    }

    @objid ("029a3f43-4ab8-4e1c-a232-7a669ac08ae1")
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

    @objid ("01087c44-89a8-40a4-9360-23fd010290a7")
    @Override
    public EList<AssociationEnd> getEnd() {
        return new SmList<>(this, AssociationData.Metadata.EndDep());
    }

    @objid ("93e0d9b7-eeed-4435-a134-7260f5af9270")
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

    @objid ("14346deb-0736-499a-924a-70b3a0a9baba")
    @Override
    public ClassAssociation getLinkToClass() {
        return (ClassAssociation) getDepVal(AssociationData.Metadata.LinkToClassDep());
    }

    @objid ("8f48b0be-b094-47d0-9bf8-dddfc2684653")
    @Override
    public void setLinkToClass(ClassAssociation value) {
        appendDepVal(AssociationData.Metadata.LinkToClassDep(), (SmObjectImpl)value);
    }

    @objid ("140c387f-2992-47b6-894b-a40b03cf6f3a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAssociation(this);
        else
          return null;
    }

}
