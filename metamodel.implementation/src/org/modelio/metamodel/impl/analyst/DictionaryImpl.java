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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.impl.analyst.DictionaryData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("005bc1ec-c4bf-1fd8-97fe-001ec947cd2a")
public class DictionaryImpl extends AnalystContainerImpl implements Dictionary {
    @objid ("54203c3f-5e30-4b01-b8d1-f153bcc5ca90")
    @Override
    public EList<Dictionary> getOwnedDictionary() {
        return new SmList<>(this, ((DictionarySmClass)getClassOf()).getOwnedDictionaryDep());
    }

    @objid ("bd8fa4bb-ca30-4cf8-b4f5-1b80a98cedf4")
    @Override
    public <T extends Dictionary> List<T> getOwnedDictionary(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Dictionary element : getOwnedDictionary()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("107448e0-4e04-4eff-b8c8-e2be9b74d8cf")
    @Override
    public Dictionary getOwnerDictionary() {
        Object obj = getDepVal(((DictionarySmClass)getClassOf()).getOwnerDictionaryDep());
        return (obj instanceof Dictionary)? (Dictionary)obj : null;
    }

    @objid ("46bcac88-e32b-48ae-82e9-2a61fd918442")
    @Override
    public void setOwnerDictionary(Dictionary value) {
        appendDepVal(((DictionarySmClass)getClassOf()).getOwnerDictionaryDep(), (SmObjectImpl)value);
    }

    @objid ("2a2ed1a5-8345-4b36-95ba-f3b70877abe0")
    @Override
    public AnalystProject getOwnerProject() {
        Object obj = getDepVal(((DictionarySmClass)getClassOf()).getOwnerProjectDep());
        return (obj instanceof AnalystProject)? (AnalystProject)obj : null;
    }

    @objid ("102e972d-ee69-4407-816d-e207f5f5921d")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(((DictionarySmClass)getClassOf()).getOwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("89ef68cc-fd80-4d17-81f8-fb0cff637e91")
    @Override
    public EList<Term> getOwnedTerm() {
        return new SmList<>(this, ((DictionarySmClass)getClassOf()).getOwnedTermDep());
    }

    @objid ("e3e1449c-75c4-4758-86ba-fd715cabe7a4")
    @Override
    public <T extends Term> List<T> getOwnedTerm(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Term element : getOwnedTerm()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2760a3d6-41a2-4591-8998-864051718374")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerDictionary
        obj = (SmObjectImpl)this.getDepVal(((DictionarySmClass)getClassOf()).getOwnerDictionaryDep());
        if (obj != null)
          return obj;
        // OwnerProject
        obj = (SmObjectImpl)this.getDepVal(((DictionarySmClass)getClassOf()).getOwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("82fe2f41-e645-425b-bf78-a86b68d0f462")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerDictionary
        dep = ((DictionarySmClass)getClassOf()).getOwnerDictionaryDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerProject
        dep = ((DictionarySmClass)getClassOf()).getOwnerProjectDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("13221be8-2153-4bdd-a31c-89d65ed188c1")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDictionary(this);
        else
          return null;
    }

}
