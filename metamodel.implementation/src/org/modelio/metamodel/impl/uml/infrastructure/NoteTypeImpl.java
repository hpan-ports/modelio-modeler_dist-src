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
import org.modelio.metamodel.impl.uml.infrastructure.NoteTypeData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

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

    @objid ("9be2875d-6c64-496d-8b6d-ad1aa2042b87")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(((NoteTypeSmClass)getClassOf()).getIsHiddenAtt());
    }

    @objid ("35744605-d431-4bbf-983e-da8c203dda50")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(((NoteTypeSmClass)getClassOf()).getIsHiddenAtt(), value);
    }

    @objid ("fb8b73c4-a5db-4206-958c-e317b77114e2")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(((NoteTypeSmClass)getClassOf()).getLabelKeyAtt());
    }

    @objid ("49efae4c-ccdf-4ad1-9b06-ed9e8e4e7c7f")
    @Override
    public void setLabelKey(String value) {
        setAttVal(((NoteTypeSmClass)getClassOf()).getLabelKeyAtt(), value);
    }

    @objid ("e7cd1cf9-b89b-44b2-bcf0-9285128fff61")
    @Override
    public String getMimeType() {
        return (String) getAttVal(((NoteTypeSmClass)getClassOf()).getMimeTypeAtt());
    }

    @objid ("cae11e14-b2fe-4069-806b-a131a86dfd2c")
    @Override
    public void setMimeType(String value) {
        setAttVal(((NoteTypeSmClass)getClassOf()).getMimeTypeAtt(), value);
    }

    @objid ("05fe1a9b-88f3-499b-9fc6-b8f8250fb98f")
    @Override
    public EList<Note> getElement() {
        return new SmList<>(this, ((NoteTypeSmClass)getClassOf()).getElementDep());
    }

    @objid ("dbaddf6a-ae07-4b2b-9f42-2eb76de9d65d")
    @Override
    public <T extends Note> List<T> getElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Note element : getElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cf7c0704-427c-4bea-8727-d6098197b937")
    @Override
    public Stereotype getOwnerStereotype() {
        Object obj = getDepVal(((NoteTypeSmClass)getClassOf()).getOwnerStereotypeDep());
        return (obj instanceof Stereotype)? (Stereotype)obj : null;
    }

    @objid ("60d90bd8-8a14-4b97-9de6-871b801144a2")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(((NoteTypeSmClass)getClassOf()).getOwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("e6230fef-1b52-484e-884f-e4092e7564bf")
    @Override
    public MetaclassReference getOwnerReference() {
        Object obj = getDepVal(((NoteTypeSmClass)getClassOf()).getOwnerReferenceDep());
        return (obj instanceof MetaclassReference)? (MetaclassReference)obj : null;
    }

    @objid ("3d7c4c21-3716-474d-8b87-b49a87013723")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(((NoteTypeSmClass)getClassOf()).getOwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("7a00c00c-cd44-4c2a-b56e-33cc63fec9d0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerStereotype
        obj = (SmObjectImpl)this.getDepVal(((NoteTypeSmClass)getClassOf()).getOwnerStereotypeDep());
        if (obj != null)
          return obj;
        // OwnerReference
        obj = (SmObjectImpl)this.getDepVal(((NoteTypeSmClass)getClassOf()).getOwnerReferenceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5569ee0b-c7cd-4567-b25d-5ec465d75346")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerStereotype
        dep = ((NoteTypeSmClass)getClassOf()).getOwnerStereotypeDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerReference
        dep = ((NoteTypeSmClass)getClassOf()).getOwnerReferenceDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("aae0d28a-f31a-4c9f-a7dd-626a61327fef")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNoteType(this);
        else
          return null;
    }

}
