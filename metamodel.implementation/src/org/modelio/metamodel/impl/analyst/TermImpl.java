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
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.impl.analyst.TermData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00626cea-c4bf-1fd8-97fe-001ec947cd2a")
public class TermImpl extends AnalystElementImpl implements Term {
    @objid ("dfda0961-610c-411e-8f6e-bd6aa2f66b51")
    @Override
    public AnalystElement getLastVersion() {
        return getLastTermVersion();
    }

    @objid ("cb871d96-685b-4442-a852-fcdb8bad9e04")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedTermVersion();
    }

    @objid ("45038f7c-7a22-4fe4-afb0-8d561ede33c9")
    @Override
    public Dictionary getOwnerDictionary() {
        Object obj = getDepVal(((TermSmClass)getClassOf()).getOwnerDictionaryDep());
        return (obj instanceof Dictionary)? (Dictionary)obj : null;
    }

    @objid ("6462f4b6-837c-40dc-8163-44d5696b9e51")
    @Override
    public void setOwnerDictionary(Dictionary value) {
        appendDepVal(((TermSmClass)getClassOf()).getOwnerDictionaryDep(), (SmObjectImpl)value);
    }

    @objid ("39bbbca2-319a-4e96-ba8c-fe68eb25ad73")
    @Override
    public EList<Term> getArchivedTermVersion() {
        return new SmList<>(this, ((TermSmClass)getClassOf()).getArchivedTermVersionDep());
    }

    @objid ("5af1c453-4d04-4159-b986-b248727a9ea5")
    @Override
    public <T extends Term> List<T> getArchivedTermVersion(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Term element : getArchivedTermVersion()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a10da153-3be3-4fe8-bbfd-ea4f022eed89")
    @Override
    public Term getLastTermVersion() {
        Object obj = getDepVal(((TermSmClass)getClassOf()).getLastTermVersionDep());
        return (obj instanceof Term)? (Term)obj : null;
    }

    @objid ("7aeced32-ea64-4819-bebf-dda9aae2bae8")
    @Override
    public void setLastTermVersion(Term value) {
        appendDepVal(((TermSmClass)getClassOf()).getLastTermVersionDep(), (SmObjectImpl)value);
    }

    @objid ("c58b7057-508b-4d2c-996b-de70ad10eb5b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerDictionary
        obj = (SmObjectImpl)this.getDepVal(((TermSmClass)getClassOf()).getOwnerDictionaryDep());
        if (obj != null)
          return obj;
        // LastTermVersion
        obj = (SmObjectImpl)this.getDepVal(((TermSmClass)getClassOf()).getLastTermVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("00aa3dbf-62bc-4eb1-a668-9c056882e446")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerDictionary
        dep = ((TermSmClass)getClassOf()).getOwnerDictionaryDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // LastTermVersion
        dep = ((TermSmClass)getClassOf()).getLastTermVersionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("26039e63-0cac-48f0-b238-dcb050fb1940")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTerm(this);
        else
          return null;
    }

}
