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
    @objid ("31b42994-3dd9-4362-b670-1185c58d5190")
    @Override
    public EList<Dictionary> getOwnedDictionary() {
        return new SmList<>(this, DictionaryData.Metadata.OwnedDictionaryDep());
    }

    @objid ("3e413bb7-c013-4bc4-b08b-cf8a0ed142e1")
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

    @objid ("977ba05f-7bfd-4d27-ae73-784609ca81bb")
    @Override
    public Dictionary getOwnerDictionary() {
        return (Dictionary) getDepVal(DictionaryData.Metadata.OwnerDictionaryDep());
    }

    @objid ("534af188-28b0-4a20-b5bc-c44631bb7d32")
    @Override
    public void setOwnerDictionary(Dictionary value) {
        appendDepVal(DictionaryData.Metadata.OwnerDictionaryDep(), (SmObjectImpl)value);
    }

    @objid ("3aed02ec-90d8-4d63-be0d-e999ea373e7e")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(DictionaryData.Metadata.OwnerProjectDep());
    }

    @objid ("cc01b4b0-c8f2-46b7-ae24-4135dc3f020f")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(DictionaryData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("8584c354-7d06-47f2-8356-951a19421be6")
    @Override
    public EList<Term> getOwnedTerm() {
        return new SmList<>(this, DictionaryData.Metadata.OwnedTermDep());
    }

    @objid ("6f7611ce-1250-44b9-ab8f-21d9fd3746cd")
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

    @objid ("d9c7b0d2-4169-4428-831c-fc1deebe2826")
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

    @objid ("3fc3497b-262c-4818-8681-0397c4e1eb6b")
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

    @objid ("3f18fc0f-a02b-49dc-b87b-f8bf9bdac172")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDictionary(this);
        else
          return null;
    }

}
