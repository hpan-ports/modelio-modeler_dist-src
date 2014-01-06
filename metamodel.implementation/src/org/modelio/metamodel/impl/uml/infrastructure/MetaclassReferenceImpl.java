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
    @objid ("ce22b603-27ca-4d38-a3fb-5336207d3076")
    @Override
    public String getReferencedClassName() {
        return (String) getAttVal(MetaclassReferenceData.Metadata.ReferencedClassNameAtt());
    }

    @objid ("6175fd4d-e56c-4be6-b975-885e1778017a")
    @Override
    public void setReferencedClassName(String value) {
        setAttVal(MetaclassReferenceData.Metadata.ReferencedClassNameAtt(), value);
    }

    @objid ("4ec26d41-8947-4be7-916b-2938fb29ea03")
    @Override
    public PropertyTableDefinition getDefinedTable() {
        return (PropertyTableDefinition) getDepVal(MetaclassReferenceData.Metadata.DefinedTableDep());
    }

    @objid ("3ec0b464-e1b1-4d04-8d95-2b974cf61430")
    @Override
    public void setDefinedTable(PropertyTableDefinition value) {
        appendDepVal(MetaclassReferenceData.Metadata.DefinedTableDep(), (SmObjectImpl)value);
    }

    @objid ("ac59dc1f-be68-4356-aac3-b990a6a19af1")
    @Override
    public EList<NoteType> getDefinedNoteType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedNoteTypeDep());
    }

    @objid ("0d68e2b6-1dd5-4217-8607-5f7474a75d4d")
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

    @objid ("83ea9a64-fde2-4a4e-bf6f-2714f00dd36c")
    @Override
    public EList<ExternDocumentType> getDefinedExternDocumentType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedExternDocumentTypeDep());
    }

    @objid ("f99365c6-e778-43da-a1f7-187e1fb07ba5")
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

    @objid ("cefa8494-e12b-4b71-ab38-13e0b60c6861")
    @Override
    public Profile getOwnerProfile() {
        return (Profile) getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
    }

    @objid ("377d6ba3-6988-4257-9ed4-8301bccb7139")
    @Override
    public void setOwnerProfile(Profile value) {
        appendDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep(), (SmObjectImpl)value);
    }

    @objid ("5279e231-204c-4d42-8ed2-862a51e5d02f")
    @Override
    public EList<TagType> getDefinedTagType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedTagTypeDep());
    }

    @objid ("bedfa293-50d0-4668-ac54-f2da9e0ebc5f")
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

    @objid ("226fedc2-8054-45ca-a037-75502ad24850")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("de9d9592-ac6f-4e6c-b2ce-3a42b0e644aa")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
        if (obj != null)
          return new SmDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f6b61b88-db5e-4f39-9a0f-0df950040c00")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMetaclassReference(this);
        else
          return null;
    }

}
