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

    @objid ("79e43e01-7188-43cf-8067-f8eaf6b69b86")
    @Override
    public String getImage() {
        return (String) getAttVal(StereotypeData.Metadata.ImageAtt());
    }

    @objid ("c105d1db-a363-4d42-8cc2-0abd7a68a831")
    @Override
    public void setImage(String value) {
        setAttVal(StereotypeData.Metadata.ImageAtt(), value);
    }

    @objid ("3bc0503c-28ac-45b8-a73f-3981f23a357f")
    @Override
    public String getIcon() {
        return (String) getAttVal(StereotypeData.Metadata.IconAtt());
    }

    @objid ("b19c7320-4c58-4957-84b4-b1a6cc906e7a")
    @Override
    public void setIcon(String value) {
        setAttVal(StereotypeData.Metadata.IconAtt(), value);
    }

    @objid ("09208ac2-4517-43be-bbee-0dd9f6965752")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(StereotypeData.Metadata.IsHiddenAtt());
    }

    @objid ("d6ef969d-2788-4623-9624-f2ad4a0d218e")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(StereotypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("214d0c7b-f794-4f22-a3b4-5542f018097d")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(StereotypeData.Metadata.LabelKeyAtt());
    }

    @objid ("c7d76f3d-f30f-4796-8532-35fbb8e8d16d")
    @Override
    public void setLabelKey(String value) {
        setAttVal(StereotypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("26768663-dffe-42bd-a6ee-d43bf06c63da")
    @Override
    public String getBaseClassName() {
        return (String) getAttVal(StereotypeData.Metadata.BaseClassNameAtt());
    }

    @objid ("66dac328-b1f6-4a30-b6e8-3d7bddcb21dd")
    @Override
    public void setBaseClassName(String value) {
        setAttVal(StereotypeData.Metadata.BaseClassNameAtt(), value);
    }

    @objid ("10cab678-207b-456b-8f5b-fd0c7bd34b3b")
    @Override
    public PropertyTableDefinition getDefinedTable() {
        return (PropertyTableDefinition) getDepVal(StereotypeData.Metadata.DefinedTableDep());
    }

    @objid ("fe590d7f-94c3-45a8-aed1-34671edbaa82")
    @Override
    public void setDefinedTable(PropertyTableDefinition value) {
        appendDepVal(StereotypeData.Metadata.DefinedTableDep(), (SmObjectImpl)value);
    }

    @objid ("2559057e-7e7d-4fd5-bb2f-103d2e5440db")
    @Override
    public EList<ModelElement> getExtendedElement() {
        return new SmList<>(this, StereotypeData.Metadata.ExtendedElementDep());
    }

    @objid ("1eb3df85-5d81-48b9-9c11-84e7a42e6741")
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

    @objid ("bbabb72c-e4d0-44b6-91a8-ca8a79c17ae5")
    @Override
    public EList<ExternDocumentType> getDefinedExternDocumentType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedExternDocumentTypeDep());
    }

    @objid ("e8d102e3-04f3-4b8c-bae7-f5a9898b745e")
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

    @objid ("48a42ffe-dbca-47e6-a5a8-4f59a9961d31")
    @Override
    public Profile getOwner() {
        return (Profile) getDepVal(StereotypeData.Metadata.OwnerDep());
    }

    @objid ("1893ceac-10bf-4f9b-abda-ad6fd9709f78")
    @Override
    public void setOwner(Profile value) {
        appendDepVal(StereotypeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("e4f2265a-8128-4c0c-983a-ed5816877259")
    @Override
    public Stereotype getParent() {
        return (Stereotype) getDepVal(StereotypeData.Metadata.ParentDep());
    }

    @objid ("9225b16d-4627-4a70-b9e6-9be22bf077a8")
    @Override
    public void setParent(Stereotype value) {
        appendDepVal(StereotypeData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("b820312b-2391-4345-8803-375026f582d5")
    @Override
    public EList<TagType> getDefinedTagType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedTagTypeDep());
    }

    @objid ("1c7c7a90-a627-4187-9875-08d732cb370b")
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

    @objid ("2cd76656-ca18-4de7-9b72-e9eb286314e5")
    @Override
    public EList<Stereotype> getChild() {
        return new SmList<>(this, StereotypeData.Metadata.ChildDep());
    }

    @objid ("e1c96f15-9794-460f-8a45-b0d6a013ee4b")
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

    @objid ("c9f0c3ab-57a5-4aab-b19f-b672c3c4b79c")
    @Override
    public EList<NoteType> getDefinedNoteType() {
        return new SmList<>(this, StereotypeData.Metadata.DefinedNoteTypeDep());
    }

    @objid ("8450e746-026e-43eb-becd-227fa0ff928e")
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

    @objid ("1771960e-0710-4adc-b6c1-964f2bb73803")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StereotypeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a2c57a9c-c263-4d7f-ad83-5a02856efaa8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StereotypeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(StereotypeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("104d3572-011c-4284-81f8-c88f69bb17c8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStereotype(this);
        else
          return null;
    }

}
