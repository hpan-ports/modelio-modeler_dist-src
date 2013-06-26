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
    @objid ("d820a0e6-d16a-49a9-939b-467c741b329c")
    @Override
    public String getReferencedClassName() {
        return (String) getAttVal(MetaclassReferenceData.Metadata.ReferencedClassNameAtt());
    }

    @objid ("cd0fd12e-8de6-490a-b99d-b3b02c734969")
    @Override
    public void setReferencedClassName(String value) {
        setAttVal(MetaclassReferenceData.Metadata.ReferencedClassNameAtt(), value);
    }

    @objid ("ebb4de09-f345-41da-a13b-910b104576e4")
    @Override
    public PropertyTableDefinition getDefinedTable() {
        return (PropertyTableDefinition) getDepVal(MetaclassReferenceData.Metadata.DefinedTableDep());
    }

    @objid ("77d7c0af-f965-453c-861d-fb331ccdb630")
    @Override
    public void setDefinedTable(PropertyTableDefinition value) {
        appendDepVal(MetaclassReferenceData.Metadata.DefinedTableDep(), (SmObjectImpl)value);
    }

    @objid ("394b282d-ace1-491e-bc4b-ffb641293c0a")
    @Override
    public EList<NoteType> getDefinedNoteType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedNoteTypeDep());
    }

    @objid ("fcc77021-34df-43e5-9d11-81b82f86f93f")
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

    @objid ("2bf90eae-b67a-4ac0-941b-d30bf1c00a9d")
    @Override
    public EList<ExternDocumentType> getDefinedExternDocumentType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedExternDocumentTypeDep());
    }

    @objid ("1e05722e-ff15-4478-9c3a-ab01588c7d7d")
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

    @objid ("eb914172-5140-4b5a-82e5-45defed130bc")
    @Override
    public Profile getOwnerProfile() {
        return (Profile) getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
    }

    @objid ("592958ef-4a5c-4274-a873-49f1c90e8a80")
    @Override
    public void setOwnerProfile(Profile value) {
        appendDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep(), (SmObjectImpl)value);
    }

    @objid ("3b945357-b8b5-447f-9355-7346266ca757")
    @Override
    public EList<TagType> getDefinedTagType() {
        return new SmList<>(this, MetaclassReferenceData.Metadata.DefinedTagTypeDep());
    }

    @objid ("b4cfbabc-c007-429e-b631-adc6e1c6d7c1")
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

    @objid ("db6b9249-7096-45e8-9011-3a5bd7272101")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8b6481d0-e0a1-40eb-b4fc-2abd9243c176")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep());
        if (obj != null)
          return new SmDepVal(MetaclassReferenceData.Metadata.OwnerProfileDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ee34d42a-865b-479c-af81-6658f47c9af4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMetaclassReference(this);
        else
          return null;
    }

}
