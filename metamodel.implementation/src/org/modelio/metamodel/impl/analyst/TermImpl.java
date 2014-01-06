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
/*   Metamodel version: 9019              */
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
    @objid ("1dc3d8c2-fb8f-4e32-93c8-e392bfea63e5")
    @Override
    public Dictionary getOwnerDictionary() {
        return (Dictionary) getDepVal(TermData.Metadata.OwnerDictionaryDep());
    }

    @objid ("eaa80bf7-e9b0-481d-8717-63101c2fe104")
    @Override
    public void setOwnerDictionary(Dictionary value) {
        appendDepVal(TermData.Metadata.OwnerDictionaryDep(), (SmObjectImpl)value);
    }

    @objid ("97fa2c52-0b97-4f24-8fa2-83939d1075f3")
    @Override
    public EList<Term> getArchivedTermVersion() {
        return new SmList<>(this, TermData.Metadata.ArchivedTermVersionDep());
    }

    @objid ("d6b10cba-6431-4d5c-b16f-71830d487502")
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

    @objid ("ff732695-86eb-485a-b87f-195bcf6043de")
    @Override
    public Term getLastTermVersion() {
        return (Term) getDepVal(TermData.Metadata.LastTermVersionDep());
    }

    @objid ("8743b049-e41d-4be3-a972-ad77ff54016f")
    @Override
    public void setLastTermVersion(Term value) {
        appendDepVal(TermData.Metadata.LastTermVersionDep(), (SmObjectImpl)value);
    }

    @objid ("7bb733fe-2d78-4820-81b8-746afad8afd9")
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

    @objid ("8e78177a-e050-433d-aa1b-f12c379bd912")
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

    @objid ("4aa74c7b-bb45-4495-90f7-5c0eb161c03b")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTerm(this);
        else
          return null;
    }

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

}
