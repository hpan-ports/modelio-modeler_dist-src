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
    @objid ("7bf1ab81-4df4-4315-8584-42135a926f44")
    @Override
    public EList<Dictionary> getOwnedDictionary() {
        return new SmList<>(this, DictionaryData.Metadata.OwnedDictionaryDep());
    }

    @objid ("82976b45-0e4f-4134-8061-13840edbf43f")
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

    @objid ("7c891b27-9c83-43a2-ad9e-08011238de12")
    @Override
    public Dictionary getOwnerDictionary() {
        return (Dictionary) getDepVal(DictionaryData.Metadata.OwnerDictionaryDep());
    }

    @objid ("626f8e04-d1ef-46e9-8378-1dddce016df5")
    @Override
    public void setOwnerDictionary(Dictionary value) {
        appendDepVal(DictionaryData.Metadata.OwnerDictionaryDep(), (SmObjectImpl)value);
    }

    @objid ("6ec95247-1568-4d44-b8d6-31996958187d")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(DictionaryData.Metadata.OwnerProjectDep());
    }

    @objid ("964f2289-09cf-40ca-84db-29e3430f6f34")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(DictionaryData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("928a8fdc-2cc4-46eb-880f-3eaec7cbbe1d")
    @Override
    public EList<Term> getOwnedTerm() {
        return new SmList<>(this, DictionaryData.Metadata.OwnedTermDep());
    }

    @objid ("5db59f8d-2aa0-400e-9728-0f995d554570")
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

    @objid ("e632aeff-b79d-40f6-a095-a7fb78811687")
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

    @objid ("593ff88f-5009-47f4-ab0f-b92ba65bb695")
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

    @objid ("3cfcc3a7-561c-4dc5-b585-cc6453e7a113")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDictionary(this);
        else
          return null;
    }

}
