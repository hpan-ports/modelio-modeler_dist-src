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
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008d5b58-c4be-1fd8-97fe-001ec947cd2a")
public class StereotypeImpl extends ModelElementImpl implements Stereotype {
    @objid ("b199cee3-7acd-4709-b1c4-bffbf275056d")
    @Override
    public ModuleComponent getModule() {
        final Profile prof = getOwner();
        return  (prof != null) ? prof.getOwnerModule() : null;
    }

    @objid ("3f40d2b2-dceb-4f00-99b6-4c5f9093c07f")
    @Override
    public String getImage() {
        return (String) getAttVal(StereotypeData.Metadata.ImageAtt());
    }

    @objid ("cb557718-7daa-42d0-b8c3-5b6ce9da01e5")
    @Override
    public void setImage(String value) {
        setAttVal(StereotypeData.Metadata.ImageAtt(), value);
    }

    @objid ("2ad76a63-fd8f-45a1-aabd-0d1284d75f73")
    @Override
    public String getIcon() {
        return (String) getAttVal(StereotypeData.Metadata.IconAtt());
    }

    @objid ("f40d106f-377b-44db-9800-59a6c8de822e")
    @Override
    public void setIcon(String value) {
        setAttVal(StereotypeData.Metadata.IconAtt(), value);
    }

    @objid ("a2bd3ac4-68d1-47e0-8e1e-347604b1b960")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(StereotypeData.Metadata.IsHiddenAtt());
    }

    @objid ("8949b882-3ece-4d3c-b2cb-e1bbcea9e040")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(StereotypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("7cf9391d-c25a-4752-86d4-75e856fe7399")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(StereotypeData.Metadata.LabelKeyAtt());
    }

    @objid ("ae7640a4-5d9b-47c7-96ac-c42524a8aa73")
    @Override
    public void setLabelKey(String value) {
        setAttVal(StereotypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("17aec4bf-b3f4-4a96-ae3c-e99926665f52")
    @Override
    public String getBaseClassName() {
        return (String) getAttVal(StereotypeData.Metadata.BaseClassNameAtt());
    }

    @objid ("a492b8a9-b943-4f1f-8696-40f513405883")
    @Override
    public void setBaseClassName(String value) {
        setAttVal(StereotypeData.Metadata.BaseClassNameAtt(), value);
    }

    @objid ("18dc99ff-f372-4112-8a67-6fc9528d28aa")
    @Override
    public PropertyTableDefinition getDefinedTable() {
        return (PropertyTableDefinition) getDepVal(StereotypeData.Metadata.DefinedTableDep());
    }

    @objid ("958cb9f2-9637-4675-ba1d-ab026eaec62e")
    @Override
    public void setDefinedTable(PropertyTableDefinition value) {
        appendDepVal(StereotypeData.Metadata.DefinedTableDep(), (SmObjectImpl)value);
    }

    @objid ("2cf72beb-48ed-4496-b243-2c52762e8f60")
    @Override
    public EList<ModelElement> getExtendedElement() {
        return new SmList<>(this, StereotypeData.Metadata.ExtendedElementDep());
    }

    @objid ("6ad3071d-2763-40a4-aafb-64c6a2fb3baa")
    @Override
    public <T extends ModelElement> List<T> getExtendedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelElement element : getExtendedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ea772815-cee0-48f4-b80b-0d6d2929b90f")
    @Override
    public EList<ExternDocumentType> getDefinedExternDocumentType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedExternDocumentTypeDep());
    }

    @objid ("e19070c7-d376-4d70-925b-085411ac1ecc")
    @Override
    public <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExternDocumentType element : getDefinedExternDocumentType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("da09ce4e-921c-42e6-9bed-899842f22668")
    @Override
    public Profile getOwner() {
        return (Profile) getDepVal(StereotypeData.Metadata.OwnerDep());
    }

    @objid ("5e69e24d-ab50-4382-8e3a-f57d2d1ebaed")
    @Override
    public void setOwner(Profile value) {
        appendDepVal(StereotypeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("dbc33d08-d088-4fc7-a692-c7da891a9d24")
    @Override
    public Stereotype getParent() {
        return (Stereotype) getDepVal(StereotypeData.Metadata.ParentDep());
    }

    @objid ("4364250c-7727-4026-a6d1-c9fb38f52a4e")
    @Override
    public void setParent(Stereotype value) {
        appendDepVal(StereotypeData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("92e0bdbb-84c8-49f4-9560-51e44d7dda8c")
    @Override
    public EList<TagType> getDefinedTagType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedTagTypeDep());
    }

    @objid ("c3bfad08-7455-4c44-96bd-a8b54f25e6cd")
    @Override
    public <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TagType element : getDefinedTagType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("63c8c98d-a8fa-44c5-a108-d412560ff8a4")
    @Override
    public EList<Stereotype> getChild() {
        return new SmList<>(this, StereotypeData.Metadata.ChildDep());
    }

    @objid ("89f82d8f-db24-41d1-9c97-29be1458221d")
    @Override
    public <T extends Stereotype> List<T> getChild(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Stereotype element : getChild()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f70da8f0-80f4-41a4-bfb7-55e2f17017fc")
    @Override
    public EList<NoteType> getDefinedNoteType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedNoteTypeDep());
    }

    @objid ("837a8fed-66bc-41bf-bb0e-42f87bd72552")
    @Override
    public <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NoteType element : getDefinedNoteType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("462eb3b3-d705-4c71-8059-a4fb5daac2ae")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StereotypeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7b754022-e945-4956-8d85-471fb66119fb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StereotypeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(StereotypeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2a90621d-0309-45cc-89f2-3adee7dd62fa")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStereotype(this);
        else
          return null;
    }

}
