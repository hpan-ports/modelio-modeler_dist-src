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

    @objid ("ac5ce6d5-e901-4eca-a323-041a0c898a0d")
    @Override
    public String getImage() {
        return (String) getAttVal(StereotypeData.Metadata.ImageAtt());
    }

    @objid ("08747901-3e7e-41b9-8ae7-4dd183275485")
    @Override
    public void setImage(String value) {
        setAttVal(StereotypeData.Metadata.ImageAtt(), value);
    }

    @objid ("7f83ec75-a6fc-4b4d-b471-05130dff7b1b")
    @Override
    public String getIcon() {
        return (String) getAttVal(StereotypeData.Metadata.IconAtt());
    }

    @objid ("00139b52-668b-461b-9a1c-7e0bb085fbab")
    @Override
    public void setIcon(String value) {
        setAttVal(StereotypeData.Metadata.IconAtt(), value);
    }

    @objid ("a084d6dd-769f-4e4c-a294-855c27b99e8c")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(StereotypeData.Metadata.IsHiddenAtt());
    }

    @objid ("dab8a605-18ff-4864-8144-cf60a93ee71f")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(StereotypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("53b82701-9ee8-4cf3-a738-ae75153a8b98")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(StereotypeData.Metadata.LabelKeyAtt());
    }

    @objid ("8c482a69-dca1-48c7-837b-eb2b298b1d3a")
    @Override
    public void setLabelKey(String value) {
        setAttVal(StereotypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("22abe225-59e8-4490-b1e3-170ac134ed3a")
    @Override
    public String getBaseClassName() {
        return (String) getAttVal(StereotypeData.Metadata.BaseClassNameAtt());
    }

    @objid ("b5617456-c0a6-4b6f-a943-76bf1f668ac5")
    @Override
    public void setBaseClassName(String value) {
        setAttVal(StereotypeData.Metadata.BaseClassNameAtt(), value);
    }

    @objid ("988bbde4-edcc-4e8b-810b-6092e7630eb1")
    @Override
    public PropertyTableDefinition getDefinedTable() {
        return (PropertyTableDefinition) getDepVal(StereotypeData.Metadata.DefinedTableDep());
    }

    @objid ("bfb4f48d-78c2-40fa-9ce0-f148c1412fa3")
    @Override
    public void setDefinedTable(PropertyTableDefinition value) {
        appendDepVal(StereotypeData.Metadata.DefinedTableDep(), (SmObjectImpl)value);
    }

    @objid ("f23aca4a-f8f9-438b-914e-e379c0c591d8")
    @Override
    public EList<ModelElement> getExtendedElement() {
        return new SmList<>(this, StereotypeData.Metadata.ExtendedElementDep());
    }

    @objid ("94a78c69-2c52-4091-99ea-d7854446b587")
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

    @objid ("8664a85e-77c3-4589-b81c-87e248cf7200")
    @Override
    public EList<ExternDocumentType> getDefinedExternDocumentType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedExternDocumentTypeDep());
    }

    @objid ("e34d3996-5436-4512-83cf-e41e8e5195fc")
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

    @objid ("4fbe1b06-b50f-4309-843a-51a2712ce4b3")
    @Override
    public Profile getOwner() {
        return (Profile) getDepVal(StereotypeData.Metadata.OwnerDep());
    }

    @objid ("a617b463-9a02-4bac-8761-3913b8681860")
    @Override
    public void setOwner(Profile value) {
        appendDepVal(StereotypeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("70eaf8e3-dd7d-47e2-bbc0-cef9d6fddbb3")
    @Override
    public Stereotype getParent() {
        return (Stereotype) getDepVal(StereotypeData.Metadata.ParentDep());
    }

    @objid ("3e29bad7-e122-4d70-b4d6-df10b411b1a0")
    @Override
    public void setParent(Stereotype value) {
        appendDepVal(StereotypeData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("06af4e55-f6ce-4ae4-9b38-2cb18a80298f")
    @Override
    public EList<TagType> getDefinedTagType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedTagTypeDep());
    }

    @objid ("e0e4d6fa-ec64-4308-a6cf-bbfca10ba220")
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

    @objid ("2df9336c-ec1b-40d2-9b2d-c46c03962928")
    @Override
    public EList<Stereotype> getChild() {
        return new SmList<>(this, StereotypeData.Metadata.ChildDep());
    }

    @objid ("61dbd810-7416-4e14-82bd-1dc8df2b6424")
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

    @objid ("cd2c77f8-df52-4968-9494-30b9d8cb6a0a")
    @Override
    public EList<NoteType> getDefinedNoteType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedNoteTypeDep());
    }

    @objid ("0dfe481f-6f2a-40e7-b80f-77636bbaabdb")
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

    @objid ("324fa732-f466-4dc8-9b1a-2f11d3383650")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StereotypeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6185f596-79e5-41bd-aae8-104e69365782")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StereotypeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(StereotypeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("9bce809b-0899-4889-9908-973bef5959cc")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStereotype(this);
        else
          return null;
    }

}
