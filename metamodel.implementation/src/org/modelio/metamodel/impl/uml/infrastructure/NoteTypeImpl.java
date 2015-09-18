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
import org.modelio.metamodel.data.uml.infrastructure.NoteTypeData;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008bfe5c-c4be-1fd8-97fe-001ec947cd2a")
public class NoteTypeImpl extends ModelElementImpl implements NoteType {
    @objid ("9a3d8668-3b10-405b-98a5-c33bbf1d1190")
    @Override
    public ModuleComponent getModule() {
        MetaclassReference ref = getOwnerReference();
        Stereotype st = getOwnerStereotype();
        
        if (ref != null && ref.getOwnerProfile() != null) {
            return ref.getOwnerProfile().getOwnerModule();
        } else if (st != null && st.getOwner() != null) {
            return st.getOwner().getOwnerModule();
        } else
            return null;
    }

    @objid ("a59ced31-48b7-4c5d-b5de-0f2968bf0c0d")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(NoteTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("690ba456-0331-4850-8eb9-96b72bed336b")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(NoteTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("be970477-9b55-42ec-b09f-957c7182fdbf")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(NoteTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("8061c620-d2a0-4cfa-978f-1e9cd2de1573")
    @Override
    public void setLabelKey(String value) {
        setAttVal(NoteTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("b0509461-d426-4ed0-91d7-d4e802ea586a")
    @Override
    public String getMimeType() {
        return (String) getAttVal(NoteTypeData.Metadata.MimeTypeAtt());
    }

    @objid ("f3347f5b-56ec-4c28-8a09-5e1dea9e18e7")
    @Override
    public void setMimeType(String value) {
        setAttVal(NoteTypeData.Metadata.MimeTypeAtt(), value);
    }

    @objid ("e5097c67-d356-40d7-a2bc-9be6b42acd02")
    @Override
    public EList<Note> getElement() {
        return new SmList<>(this, NoteTypeData.Metadata.ElementDep());
    }

    @objid ("d5458b3b-dc03-403c-a0be-fab42ed725c7")
    @Override
    public <T extends Note> List<T> getElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Note element : getElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ba395ad9-7ee6-4765-b86b-3dadfecb0d92")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(NoteTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("125a2b38-b234-44b2-9181-ec12dc400e5a")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(NoteTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("6c037993-11e2-405c-8d22-57d3686af8c2")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(NoteTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("a545cee8-968d-4ddb-abc8-9f323bf0aa83")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(NoteTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("ea9eb5ea-b265-4dcd-a993-5e05a0a6ebc4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(NoteTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7dd939f5-3d2b-4ff8-af0c-5cea7fe5dc55")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NoteTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return new SmDepVal(NoteTypeData.Metadata.OwnerStereotypeDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(NoteTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return new SmDepVal(NoteTypeData.Metadata.OwnerReferenceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ede3ad49-b761-4862-91b4-ad7725fb7230")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNoteType(this);
        else
          return null;
    }

}
