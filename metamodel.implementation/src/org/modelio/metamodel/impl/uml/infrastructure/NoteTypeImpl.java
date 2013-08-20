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

    @objid ("4d82b7f3-4951-4f81-8157-dcd9ad8f949e")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(NoteTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("c3c306cc-7cf3-4b15-ad8c-7e6baeca7488")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(NoteTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("3942d10c-559a-48c1-81c4-b0ef7c507bc7")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(NoteTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("feb47dae-92e2-421a-8af1-2839b39b92b8")
    @Override
    public void setLabelKey(String value) {
        setAttVal(NoteTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("5747c615-498a-4095-817a-ef48feebd6ff")
    @Override
    public EList<Note> getElement() {
        return new SmList<>(this, NoteTypeData.Metadata.ElementDep());
    }

    @objid ("b1760b70-d3cc-48cd-962b-458c0ebbd177")
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

    @objid ("bb6afbdd-91db-450a-8576-a87cd4655d4d")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(NoteTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("04ffc7a5-46b9-44dc-9f68-f12a2dbd5904")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(NoteTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("35ed3d49-32f7-417b-8ca9-d04b49282811")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(NoteTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("e06ea7d2-b29c-47e3-ba37-3168f4ca445e")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(NoteTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("ac7152ee-fd96-41a8-8faa-86bc5105f9df")
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

    @objid ("fe5090c4-18db-4392-ab25-4b45bf351b7d")
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

    @objid ("194203fb-5ff0-46de-b654-41afc3d61bde")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNoteType(this);
        else
          return null;
    }

}
