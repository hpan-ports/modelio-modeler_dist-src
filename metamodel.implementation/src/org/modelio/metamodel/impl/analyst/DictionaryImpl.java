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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.data.analyst.DictionaryData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("005bc1ec-c4bf-1fd8-97fe-001ec947cd2a")
public class DictionaryImpl extends AnalystContainerImpl implements Dictionary {
    @objid ("f25a6d1b-29be-428a-a701-a1528b8621e6")
    @Override
    public EList<Dictionary> getOwnedDictionary() {
        return new SmList<>(this, DictionaryData.Metadata.OwnedDictionaryDep());
    }

    @objid ("faf7d2f2-ec4b-4c62-bb75-1e810c88173f")
    @Override
    public <T extends Dictionary> List<T> getOwnedDictionary(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Dictionary element : getOwnedDictionary()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c42355e7-c416-42cf-ac57-70114c0a35fc")
    @Override
    public Dictionary getOwnerDictionary() {
        return (Dictionary) getDepVal(DictionaryData.Metadata.OwnerDictionaryDep());
    }

    @objid ("55c98d98-a2c8-4de5-b9da-12d92afac1ce")
    @Override
    public void setOwnerDictionary(Dictionary value) {
        appendDepVal(DictionaryData.Metadata.OwnerDictionaryDep(), (SmObjectImpl)value);
    }

    @objid ("80b039f7-59b3-4b16-acac-ff478f161a6f")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(DictionaryData.Metadata.OwnerProjectDep());
    }

    @objid ("26b94cfb-7d53-4704-ac41-0931f8bd0d06")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(DictionaryData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("632d018a-f1c6-4b64-a1c4-3638e5c86e3a")
    @Override
    public EList<Term> getOwnedTerm() {
        return new SmList<>(this, DictionaryData.Metadata.OwnedTermDep());
    }

    @objid ("4b567b6e-8bd4-4ecb-887f-ca9c45de13b4")
    @Override
    public <T extends Term> List<T> getOwnedTerm(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Term element : getOwnedTerm()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1258779c-ad2f-4dbf-a830-7016f86acb59")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DictionaryData.Metadata.OwnerDictionaryDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(DictionaryData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("bea2c805-a430-4603-9331-cc2dd91e111f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DictionaryData.Metadata.OwnerDictionaryDep());
        if (obj != null)
          return new SmDepVal(DictionaryData.Metadata.OwnerDictionaryDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(DictionaryData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(DictionaryData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("cca27a58-54d4-4999-9c2b-627dc09ee617")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDictionary(this);
        else
          return null;
    }

}
