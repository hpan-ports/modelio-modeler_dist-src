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
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.data.analyst.TermData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

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

    @objid ("3db12e4d-ffb5-4215-b460-f5f9290f633f")
    @Override
    public Dictionary getOwnerDictionary() {
        return (Dictionary) getDepVal(TermData.Metadata.OwnerDictionaryDep());
    }

    @objid ("4a4b8bcc-27d5-4637-9c22-7917b361b8ce")
    @Override
    public void setOwnerDictionary(Dictionary value) {
        appendDepVal(TermData.Metadata.OwnerDictionaryDep(), (SmObjectImpl)value);
    }

    @objid ("3700c443-57a1-4b1d-829b-b84f9a3bb1ba")
    @Override
    public EList<Term> getArchivedTermVersion() {
        return new SmList<>(this, TermData.Metadata.ArchivedTermVersionDep());
    }

    @objid ("e53f000d-664e-406a-a45e-302b847ee2d0")
    @Override
    public <T extends Term> List<T> getArchivedTermVersion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Term element : getArchivedTermVersion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8c7258bd-68b9-4ad0-8ebc-fb6c8915bc3a")
    @Override
    public Term getLastTermVersion() {
        return (Term) getDepVal(TermData.Metadata.LastTermVersionDep());
    }

    @objid ("aec35cb6-0b04-4368-be8c-68b0546f0f06")
    @Override
    public void setLastTermVersion(Term value) {
        appendDepVal(TermData.Metadata.LastTermVersionDep(), (SmObjectImpl)value);
    }

    @objid ("fe2a89a3-70f3-45c2-89bd-de052deee950")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TermData.Metadata.OwnerDictionaryDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TermData.Metadata.LastTermVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("68f6b6bc-edea-4457-bcd8-b2cf6e9af869")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TermData.Metadata.OwnerDictionaryDep());
        if (obj != null)
          return new SmDepVal(TermData.Metadata.OwnerDictionaryDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TermData.Metadata.LastTermVersionDep());
        if (obj != null)
          return new SmDepVal(TermData.Metadata.LastTermVersionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("6c09dbea-b99c-4d2a-ad71-4831a443c592")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTerm(this);
        else
          return null;
    }

}
