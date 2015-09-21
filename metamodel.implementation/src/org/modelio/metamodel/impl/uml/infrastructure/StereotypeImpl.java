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
import org.modelio.metamodel.impl.uml.infrastructure.StereotypeData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("008d5b58-c4be-1fd8-97fe-001ec947cd2a")
public class StereotypeImpl extends ModelElementImpl implements Stereotype {
    @objid ("b199cee3-7acd-4709-b1c4-bffbf275056d")
    @Override
    public ModuleComponent getModule() {
        final Profile prof = getOwner();
        return  (prof != null) ? prof.getOwnerModule() : null;
    }

    @objid ("f346e566-899c-4073-b475-393b1df2d9f6")
    @Override
    public String getImage() {
        return (String) getAttVal(((StereotypeSmClass)getClassOf()).getImageAtt());
    }

    @objid ("e919bf56-804a-443a-b920-f76bcaf11659")
    @Override
    public void setImage(String value) {
        setAttVal(((StereotypeSmClass)getClassOf()).getImageAtt(), value);
    }

    @objid ("3538d9f7-7f64-4c25-bbda-ed7f4079d562")
    @Override
    public String getIcon() {
        return (String) getAttVal(((StereotypeSmClass)getClassOf()).getIconAtt());
    }

    @objid ("86715879-db0c-458a-9b3b-3fcbf09a6a93")
    @Override
    public void setIcon(String value) {
        setAttVal(((StereotypeSmClass)getClassOf()).getIconAtt(), value);
    }

    @objid ("fef34ec6-1bdf-49b4-8474-4f400fee7d29")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(((StereotypeSmClass)getClassOf()).getIsHiddenAtt());
    }

    @objid ("c00b8254-d593-41b0-8097-cfd67a168ba5")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(((StereotypeSmClass)getClassOf()).getIsHiddenAtt(), value);
    }

    @objid ("21bda935-3c64-46a7-8249-d58c9af2020c")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(((StereotypeSmClass)getClassOf()).getLabelKeyAtt());
    }

    @objid ("d13a2f55-93cb-40a9-8d76-0ef47e9c9578")
    @Override
    public void setLabelKey(String value) {
        setAttVal(((StereotypeSmClass)getClassOf()).getLabelKeyAtt(), value);
    }

    @objid ("061ec1a4-8ef2-4602-80ae-a3fdbbac0fd1")
    @Override
    public String getBaseClassName() {
        return (String) getAttVal(((StereotypeSmClass)getClassOf()).getBaseClassNameAtt());
    }

    @objid ("8347cf36-6af8-47e5-bbb7-3881c7255865")
    @Override
    public void setBaseClassName(String value) {
        setAttVal(((StereotypeSmClass)getClassOf()).getBaseClassNameAtt(), value);
    }

    @objid ("94b97ae6-17a7-4871-87c0-3d84503eb333")
    @Override
    public PropertyTableDefinition getDefinedTable() {
        Object obj = getDepVal(((StereotypeSmClass)getClassOf()).getDefinedTableDep());
        return (obj instanceof PropertyTableDefinition)? (PropertyTableDefinition)obj : null;
    }

    @objid ("367fd8f9-1e21-4a2e-8477-f3295aec0510")
    @Override
    public void setDefinedTable(PropertyTableDefinition value) {
        appendDepVal(((StereotypeSmClass)getClassOf()).getDefinedTableDep(), (SmObjectImpl)value);
    }

    @objid ("814f744e-b2d3-4902-9eff-0eb6d4be506b")
    @Override
    public EList<ModelElement> getExtendedElement() {
        return new SmList<>(this, ((StereotypeSmClass)getClassOf()).getExtendedElementDep());
    }

    @objid ("755ead34-b233-4294-811b-5cae17128d28")
    @Override
    public <T extends ModelElement> List<T> getExtendedElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ModelElement element : getExtendedElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d54dbe00-a357-49fd-a890-6d4c420fa685")
    @Override
    public EList<ExternDocumentType> getDefinedExternDocumentType() {
        return new SmList<>(this, ((StereotypeSmClass)getClassOf()).getDefinedExternDocumentTypeDep());
    }

    @objid ("9e6e8e91-5a7b-439a-ac28-7e1baa8a65f8")
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

    @objid ("7bbf41f9-e730-46ce-85a8-6bfd0cf33e2e")
    @Override
    public Profile getOwner() {
        Object obj = getDepVal(((StereotypeSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof Profile)? (Profile)obj : null;
    }

    @objid ("c9673eca-589b-4e76-a52f-70cc7f955ee4")
    @Override
    public void setOwner(Profile value) {
        appendDepVal(((StereotypeSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("107e8169-c297-4a61-baba-16eb5cd3c912")
    @Override
    public Stereotype getParent() {
        Object obj = getDepVal(((StereotypeSmClass)getClassOf()).getParentDep());
        return (obj instanceof Stereotype)? (Stereotype)obj : null;
    }

    @objid ("d9e6fd19-1415-40f0-8ed4-6d4446e2642f")
    @Override
    public void setParent(Stereotype value) {
        appendDepVal(((StereotypeSmClass)getClassOf()).getParentDep(), (SmObjectImpl)value);
    }

    @objid ("e1c58b08-57fa-425e-99f3-c064e9e1f9e2")
    @Override
    public EList<TagType> getDefinedTagType() {
        return new SmList<>(this, ((StereotypeSmClass)getClassOf()).getDefinedTagTypeDep());
    }

    @objid ("5b836e39-b7ce-48de-ae13-0c2b940f4c6a")
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

    @objid ("9316ba8e-a3b7-44aa-ab9a-e40cc36c3d47")
    @Override
    public EList<Stereotype> getChild() {
        return new SmList<>(this, ((StereotypeSmClass)getClassOf()).getChildDep());
    }

    @objid ("157b4ebc-d082-4ff7-9c7e-a2287d014bab")
    @Override
    public <T extends Stereotype> List<T> getChild(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Stereotype element : getChild()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c1652e54-2821-43a8-8c27-de8dcd3cfe60")
    @Override
    public EList<NoteType> getDefinedNoteType() {
        return new SmList<>(this, ((StereotypeSmClass)getClassOf()).getDefinedNoteTypeDep());
    }

    @objid ("d56a5761-4c86-45ea-a329-88e76ce9c0bf")
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

    @objid ("7a8d3e1c-b369-4926-b757-286465b717ce")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((StereotypeSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d8bfb486-f848-4956-8294-2a46b8d22bc6")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((StereotypeSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("07a90ac4-2e79-45b8-964f-7f4d87490f8a")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStereotype(this);
        else
          return null;
    }

}
