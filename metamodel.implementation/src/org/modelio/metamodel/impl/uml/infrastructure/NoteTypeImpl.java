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
/*   Metamodel version: 9019              */
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

    @objid ("26294a04-21c7-4b35-89cb-dbaad70aba76")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(NoteTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("298a1385-64c6-48a5-82f4-4d0c32d265b0")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(NoteTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("00d2a4fd-2113-442e-9cc4-f0c808bfcb66")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(NoteTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("52472758-c689-4316-8911-db9704365cdb")
    @Override
    public void setLabelKey(String value) {
        setAttVal(NoteTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("7e7653f3-7bbb-4ce1-a318-46cfd7150891")
    @Override
    public EList<Note> getElement() {
        return new SmList<>(this, NoteTypeData.Metadata.ElementDep());
    }

    @objid ("a4571f53-6c09-4145-abb4-24a0b79d4eb8")
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

    @objid ("4d10bac5-ba37-4ae9-9810-c3e904a7a35b")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(NoteTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("ca1fbe34-d7b7-4d50-a331-2f1e29a41b42")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(NoteTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("3bf97857-8a80-4751-b61b-179658a2a317")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(NoteTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("8774db59-5f92-4c0a-a02b-94ccb687cc15")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(NoteTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("9e7dba81-fd32-4799-b80d-b2f6639b3334")
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

    @objid ("0adc36c6-7141-41ad-8472-e0e4edd43ef8")
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

    @objid ("0173e6a8-c88d-4fe3-8582-5f7deabb990a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNoteType(this);
        else
          return null;
    }

}
