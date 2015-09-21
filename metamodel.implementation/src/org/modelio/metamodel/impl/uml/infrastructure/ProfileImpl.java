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
import org.modelio.metamodel.impl.uml.infrastructure.ProfileData;
import org.modelio.metamodel.impl.uml.statik.PackageImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Profile;
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

@objid ("008caa50-c4be-1fd8-97fe-001ec947cd2a")
public class ProfileImpl extends PackageImpl implements Profile {
    @objid ("1dc3c43b-46c4-481d-899c-c5f7941f5e28")
    @Override
    public String getJCode() {
        return (String) getAttVal(((ProfileSmClass)getClassOf()).getJCodeAtt());
    }

    @objid ("295af65a-1c0a-4fc0-b409-dc48434f7ef9")
    @Override
    public void setJCode(String value) {
        setAttVal(((ProfileSmClass)getClassOf()).getJCodeAtt(), value);
    }

    @objid ("0b333624-88b7-4d82-94db-b62994d288e0")
    @Override
    public EList<Stereotype> getDefinedStereotype() {
        return new SmList<>(this, ((ProfileSmClass)getClassOf()).getDefinedStereotypeDep());
    }

    @objid ("8b4f7b72-6407-4dfb-955b-4ec15ec0f4e6")
    @Override
    public <T extends Stereotype> List<T> getDefinedStereotype(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Stereotype element : getDefinedStereotype()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("491a90bc-8380-4178-b9b4-6425bedfea29")
    @Override
    public ModuleComponent getOwnerModule() {
        Object obj = getDepVal(((ProfileSmClass)getClassOf()).getOwnerModuleDep());
        return (obj instanceof ModuleComponent)? (ModuleComponent)obj : null;
    }

    @objid ("5f1c72e4-fed5-40ae-8b5b-b7c7e9df7079")
    @Override
    public void setOwnerModule(ModuleComponent value) {
        appendDepVal(((ProfileSmClass)getClassOf()).getOwnerModuleDep(), (SmObjectImpl)value);
    }

    @objid ("be32355f-b3e1-4566-aa47-4cd48b780b60")
    @Override
    public EList<MetaclassReference> getOwnedReference() {
        return new SmList<>(this, ((ProfileSmClass)getClassOf()).getOwnedReferenceDep());
    }

    @objid ("69d81950-ff73-4ea8-ba89-9eec6686fd7b")
    @Override
    public <T extends MetaclassReference> List<T> getOwnedReference(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final MetaclassReference element : getOwnedReference()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2389c979-f7a2-4d90-990e-0b55f9a579d3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerModule
        obj = (SmObjectImpl)this.getDepVal(((ProfileSmClass)getClassOf()).getOwnerModuleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6335a068-881f-416c-a339-9746f0602541")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerModule
        dep = ((ProfileSmClass)getClassOf()).getOwnerModuleDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("de7d2161-25f5-4c82-9347-cffd54ba6bcc")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProfile(this);
        else
          return null;
    }

}
