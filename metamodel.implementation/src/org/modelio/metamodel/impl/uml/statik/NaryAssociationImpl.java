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

@objid ("0021a61a-c4bf-1fd8-97fe-001ec947cd2a")
public class NaryAssociationImpl extends ModelElementImpl implements NaryAssociation {
    @objid ("28d8131c-4eda-4e63-8e86-f2ed6bb86858")
    @Override
    public SmObjectImpl getCompositionOwner() {
        for (SmObjectImpl obj : this.getDepValList(NaryAssociationData.Metadata.NaryEndDep())) 
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("82e19039-824a-4fb9-95f0-47b803583c97")
    @Override
    public SmDepVal getCompositionRelation() {
        for (SmObjectImpl obj : this.getDepValList(NaryAssociationData.Metadata.NaryEndDep())) 
          return new SmDepVal(NaryAssociationData.Metadata.NaryEndDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1021056a-c41c-4096-8a0f-d6d159303f68")
    @Override
    public EList<NaryLink> getOccurence() {
        return new SmList<>(this, NaryAssociationData.Metadata.OccurenceDep());
    }

    @objid ("b74c30ce-6d66-45a8-8bce-9956c626653d")
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

    @objid ("0465b8ca-7c28-40e1-85a2-5ad84cfb8644")
    @Override
    public EList<NaryAssociationEnd> getNaryEnd() {
        return new SmList<>(this, NaryAssociationData.Metadata.NaryEndDep());
    }

    @objid ("d9bd3c7a-217c-41d6-91e6-2af858af1e81")
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

    @objid ("b5bb22c1-4b5a-4a10-8425-650be172b193")
    @Override
    public ClassAssociation getLinkToClass() {
        return (ClassAssociation) getDepVal(NaryAssociationData.Metadata.LinkToClassDep());
    }

    @objid ("12718b9d-2734-4a10-aecf-5cef2bdbb51d")
    @Override
    public void setLinkToClass(ClassAssociation value) {
        appendDepVal(NaryAssociationData.Metadata.LinkToClassDep(), (SmObjectImpl)value);
    }

    @objid ("840b4c54-abe3-4fa6-be3d-1fda13ad614e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryAssociation(this);
        else
          return null;
    }

}
