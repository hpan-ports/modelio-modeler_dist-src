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
import org.modelio.metamodel.impl.uml.infrastructure.TaggedValueData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00903bfc-c4be-1fd8-97fe-001ec947cd2a")
public class TaggedValueImpl extends ModelElementImpl implements TaggedValue {
    @objid ("7aff4036-b2f7-4b70-a3e7-652ea6be4c2b")
    @Override
    public ModelElement getAnnoted() {
        Object obj = getDepVal(((TaggedValueSmClass)getClassOf()).getAnnotedDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("4539a296-8e0f-46de-8ad0-cdad1be914cd")
    @Override
    public void setAnnoted(ModelElement value) {
        appendDepVal(((TaggedValueSmClass)getClassOf()).getAnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("bf8b22f5-1f66-46c9-a7f9-b022ae33db63")
    @Override
    public EList<TagParameter> getActual() {
        return new SmList<>(this, ((TaggedValueSmClass)getClassOf()).getActualDep());
    }

    @objid ("af17eabe-c84e-44f9-9913-f869a6ab403e")
    @Override
    public <T extends TagParameter> List<T> getActual(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TagParameter element : getActual()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("16b4f1e7-a379-48dd-b948-fedf6a1d80a0")
    @Override
    public TagParameter getQualifier() {
        Object obj = getDepVal(((TaggedValueSmClass)getClassOf()).getQualifierDep());
        return (obj instanceof TagParameter)? (TagParameter)obj : null;
    }

    @objid ("d238c95a-784c-4c9c-bd6b-0370c37a9053")
    @Override
    public void setQualifier(TagParameter value) {
        appendDepVal(((TaggedValueSmClass)getClassOf()).getQualifierDep(), (SmObjectImpl)value);
    }

    @objid ("656bedee-2ca9-4356-9414-d4f0a7c376dd")
    @Override
    public TagType getDefinition() {
        Object obj = getDepVal(((TaggedValueSmClass)getClassOf()).getDefinitionDep());
        return (obj instanceof TagType)? (TagType)obj : null;
    }

    @objid ("f7e18ddb-efa2-4f7e-b99d-605a646c4002")
    @Override
    public void setDefinition(TagType value) {
        appendDepVal(((TaggedValueSmClass)getClassOf()).getDefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("beb99077-0e01-4dfe-b525-e264f3d547ff")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Annoted
        obj = (SmObjectImpl)this.getDepVal(((TaggedValueSmClass)getClassOf()).getAnnotedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5f00c66c-2b6a-46f7-b2ef-d0ac7bd0fef9")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Annoted
        dep = ((TaggedValueSmClass)getClassOf()).getAnnotedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("3b7cf892-c5e5-46bd-b8e8-90464dd4960c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTaggedValue(this);
        else
          return null;
    }

}
