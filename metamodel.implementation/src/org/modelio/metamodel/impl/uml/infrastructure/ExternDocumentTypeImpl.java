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
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentTypeData;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
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

@objid ("009339f6-c4be-1fd8-97fe-001ec947cd2a")
public class ExternDocumentTypeImpl extends ModelElementImpl implements ExternDocumentType {
    @objid ("f9337a44-b3be-45b9-9f22-cc4ed1552af0")
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

    @objid ("1ddae531-8bc0-4655-9aae-2c1729588bd1")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(((ExternDocumentTypeSmClass)getClassOf()).getIsHiddenAtt());
    }

    @objid ("4ceeed7d-c4d3-4612-84fe-4655e7becf86")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(((ExternDocumentTypeSmClass)getClassOf()).getIsHiddenAtt(), value);
    }

    @objid ("22336f3d-9c5d-45fe-a06c-247716926b66")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(((ExternDocumentTypeSmClass)getClassOf()).getLabelKeyAtt());
    }

    @objid ("333ff80f-1e48-4874-9ca2-0f0294345503")
    @Override
    public void setLabelKey(String value) {
        setAttVal(((ExternDocumentTypeSmClass)getClassOf()).getLabelKeyAtt(), value);
    }

    @objid ("6e418f91-d748-4887-9b90-8a3b711d5322")
    @Override
    public String getIcon() {
        return (String) getAttVal(((ExternDocumentTypeSmClass)getClassOf()).getIconAtt());
    }

    @objid ("81720161-3a1b-4721-81c4-cc1aba6d7271")
    @Override
    public void setIcon(String value) {
        setAttVal(((ExternDocumentTypeSmClass)getClassOf()).getIconAtt(), value);
    }

    @objid ("fcf07da4-2ee7-4c09-b019-03382ae56654")
    @Override
    public String getImage() {
        return (String) getAttVal(((ExternDocumentTypeSmClass)getClassOf()).getImageAtt());
    }

    @objid ("0df151a5-5d7f-4a06-9f2a-36664504bd50")
    @Override
    public void setImage(String value) {
        setAttVal(((ExternDocumentTypeSmClass)getClassOf()).getImageAtt(), value);
    }

    @objid ("12619ad1-7f0b-4063-b08c-da18bcd9df70")
    @Override
    public Stereotype getOwnerStereotype() {
        Object obj = getDepVal(((ExternDocumentTypeSmClass)getClassOf()).getOwnerStereotypeDep());
        return (obj instanceof Stereotype)? (Stereotype)obj : null;
    }

    @objid ("9a34e2e3-da51-42f1-b680-0493b42369b5")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(((ExternDocumentTypeSmClass)getClassOf()).getOwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("aef869c3-7830-4936-8b37-16bcbab73035")
    @Override
    public EList<ExternDocument> getTypedDoc() {
        return new SmList<>(this, ((ExternDocumentTypeSmClass)getClassOf()).getTypedDocDep());
    }

    @objid ("8f88158d-c26b-49ba-a86f-e355bbc09064")
    @Override
    public <T extends ExternDocument> List<T> getTypedDoc(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ExternDocument element : getTypedDoc()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9a44b9b5-ddb5-4c1b-880c-21539558271b")
    @Override
    public MetaclassReference getOwnerReference() {
        Object obj = getDepVal(((ExternDocumentTypeSmClass)getClassOf()).getOwnerReferenceDep());
        return (obj instanceof MetaclassReference)? (MetaclassReference)obj : null;
    }

    @objid ("bf5ac227-3642-4237-9657-f9ad3b674524")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(((ExternDocumentTypeSmClass)getClassOf()).getOwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("7ed3c5bf-2238-4d62-a33e-8d9ea99fd1fc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerStereotype
        obj = (SmObjectImpl)this.getDepVal(((ExternDocumentTypeSmClass)getClassOf()).getOwnerStereotypeDep());
        if (obj != null)
          return obj;
        // OwnerReference
        obj = (SmObjectImpl)this.getDepVal(((ExternDocumentTypeSmClass)getClassOf()).getOwnerReferenceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("73536a92-8081-4046-818c-86dc0f8f0945")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerStereotype
        dep = ((ExternDocumentTypeSmClass)getClassOf()).getOwnerStereotypeDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerReference
        dep = ((ExternDocumentTypeSmClass)getClassOf()).getOwnerReferenceDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("33066508-5404-4510-9747-2c424202d80e")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExternDocumentType(this);
        else
          return null;
    }

}
