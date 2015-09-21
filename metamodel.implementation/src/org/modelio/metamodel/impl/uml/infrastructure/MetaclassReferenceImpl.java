/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.MetaclassReferenceData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0091bf72-c4be-1fd8-97fe-001ec947cd2a")
public class MetaclassReferenceImpl extends ElementImpl implements MetaclassReference {
    @objid ("381ee57e-540d-467a-a8c0-7012039c9f2f")
    @Override
    public String getReferencedClassName() {
        return (String) getAttVal(((MetaclassReferenceSmClass)getClassOf()).getReferencedClassNameAtt());
    }

    @objid ("d0acb7ed-4218-4215-8ff4-111717d625f5")
    @Override
    public void setReferencedClassName(String value) {
        setAttVal(((MetaclassReferenceSmClass)getClassOf()).getReferencedClassNameAtt(), value);
    }

    @objid ("95656d34-8c02-4865-86d6-13f14c5d75b7")
    @Override
    public PropertyTableDefinition getDefinedTable() {
        Object obj = getDepVal(((MetaclassReferenceSmClass)getClassOf()).getDefinedTableDep());
        return (obj instanceof PropertyTableDefinition)? (PropertyTableDefinition)obj : null;
    }

    @objid ("872d4bf9-915e-4d22-a7cd-d1eb0a0b28f0")
    @Override
    public void setDefinedTable(PropertyTableDefinition value) {
        appendDepVal(((MetaclassReferenceSmClass)getClassOf()).getDefinedTableDep(), (SmObjectImpl)value);
    }

    @objid ("9896278a-e8f1-4e99-9d54-e351820121d9")
    @Override
    public EList<NoteType> getDefinedNoteType() {
        return new SmList<>(this, ((MetaclassReferenceSmClass)getClassOf()).getDefinedNoteTypeDep());
    }

    @objid ("c9b8e832-3afa-4ac8-a449-f69c3257add3")
    @Override
    public <T extends NoteType> List<T> getDefinedNoteType(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NoteType element : getDefinedNoteType()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6eeed4ae-e282-4135-920f-a145d90a17c9")
    @Override
    public EList<ExternDocumentType> getDefinedExternDocumentType() {
        return new SmList<>(this, ((MetaclassReferenceSmClass)getClassOf()).getDefinedExternDocumentTypeDep());
    }

    @objid ("1d87163a-b144-4d6c-aa86-dd545cd45860")
    @Override
    public <T extends ExternDocumentType> List<T> getDefinedExternDocumentType(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ExternDocumentType element : getDefinedExternDocumentType()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("af0fc293-f2db-416d-9b75-6682b808b45e")
    @Override
    public Profile getOwnerProfile() {
        Object obj = getDepVal(((MetaclassReferenceSmClass)getClassOf()).getOwnerProfileDep());
        return (obj instanceof Profile)? (Profile)obj : null;
    }

    @objid ("5ad1cda7-d060-491f-a705-9c0892998387")
    @Override
    public void setOwnerProfile(Profile value) {
        appendDepVal(((MetaclassReferenceSmClass)getClassOf()).getOwnerProfileDep(), (SmObjectImpl)value);
    }

    @objid ("b5fd3855-a998-492d-a317-c3816e75059d")
    @Override
    public EList<TagType> getDefinedTagType() {
        return new SmList<>(this, ((MetaclassReferenceSmClass)getClassOf()).getDefinedTagTypeDep());
    }

    @objid ("aa87488c-3cfb-4ed2-a4b3-d4acb85a1060")
    @Override
    public <T extends TagType> List<T> getDefinedTagType(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TagType element : getDefinedTagType()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("82b60bc9-1e8c-4500-83e7-4968a27b6a5f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerProfile
        obj = (SmObjectImpl)this.getDepVal(((MetaclassReferenceSmClass)getClassOf()).getOwnerProfileDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0ad3797c-cf7f-4b4a-b698-0a7eb1f9eb69")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerProfile
        dep = ((MetaclassReferenceSmClass)getClassOf()).getOwnerProfileDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("0f229bdb-909b-48aa-a03c-b01ef08f8cd6")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMetaclassReference(this);
        else
          return null;
    }

}
