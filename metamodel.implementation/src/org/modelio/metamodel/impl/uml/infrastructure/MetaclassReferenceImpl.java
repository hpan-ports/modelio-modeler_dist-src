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
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
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

@objid ("0091bf72-c4be-1fd8-97fe-001ec947cd2a")
public class MetaclassReferenceImpl extends ElementImpl implements MetaclassReference {
    @objid ("c73dbd1e-65bc-4b2a-b7e6-95fad3325eec")
    @Override
    public String getReferencedClassName() {
        return (String) getAttVal(MetaclassReferenceData.Metadata.ReferencedClassNameAtt());
    }

    @objid ("e39d4a4c-457f-45df-9193-1c09f065c807")
    @Override
    public void setReferencedClassName(String value) {
        setAttVal(MetaclassReferenceData.Metadata.ReferencedClassNameAtt(), value);
    }

    @objid ("7a2d099a-3097-46f6-9bc8-98a1d615d309")
    @Override
    public PropertyTableDefinition getDefinedTable() {
        return (PropertyTableDefinition) getDepVal(MetaclassReferenceData.Metadata.DefinedTableDep());
    }

    @objid ("3978a0e9-d049-4a8a-9585-d49dd3176cc5")
    @Override
    public void setDefinedTable(PropertyTableDefinition value) {
        appendDepVal(MetaclassReferenceData.Metadata.DefinedTableDep(), (SmObjectImpl)value);
    }

    @objid ("bbed1c22-ce74-401a-ad46-fc367682b1d3")
    @Override
    public EList<NoteType> getDefinedNoteType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedNoteTypeDep());
    }

    @objid ("74d5847b-4d67-4122-a11c-5491baf49102")
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

    @objid ("7544e83f-cf7b-4689-af53-176e8c888c87")
    @Override
    public EList<ExternDocumentType> getDefinedExternDocumentType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedExternDocumentTypeDep());
    }

    @objid ("110f9f06-d66e-42ca-93b7-6c33062ea212")
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

    @objid ("2fd19bc5-c07f-409d-b18e-af739992ea2b")
    @Override
    public Profile getOwnerProfile() {
        return (Profile) getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
    }

    @objid ("08241e99-0c7f-45b4-845c-7187b10781f2")
    @Override
    public void setOwnerProfile(Profile value) {
        appendDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep(), (SmObjectImpl)value);
    }

    @objid ("20d14e7c-0c16-4658-a2b0-a65523ed0d91")
    @Override
    public EList<TagType> getDefinedTagType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedTagTypeDep());
    }

    @objid ("5fa0ad49-d582-4bb1-9243-5bb85b13d95c")
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

    @objid ("986fed6a-14a8-4b5c-a925-461d751383b7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("22033212-439b-45ef-b447-05a3f6b00558")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
        if (obj != null)
          return new SmDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("566121a5-4941-4a4c-a4f6-e9acc66c480e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMetaclassReference(this);
        else
          return null;
    }

}
