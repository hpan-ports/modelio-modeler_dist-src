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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.NamespaceUseData;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00126858-c4bf-1fd8-97fe-001ec947cd2a")
public class NamespaceUseImpl extends ElementImpl implements NamespaceUse {
    @objid ("17d295b2-c273-4e71-ae40-0f47fe95a531")
    @Override
    public NameSpace getUser() {
        return (NameSpace) getDepVal(NamespaceUseData.Metadata.UserDep());
    }

    @objid ("47545818-ace3-4af7-a5d5-6e2bee019eaa")
    @Override
    public void setUser(NameSpace value) {
        appendDepVal(NamespaceUseData.Metadata.UserDep(), (SmObjectImpl)value);
    }

    @objid ("482b4634-22ea-45da-9527-4f7ae7f24658")
    @Override
    public NameSpace getUsed() {
        return (NameSpace) getDepVal(NamespaceUseData.Metadata.UsedDep());
    }

    @objid ("0ffe5a47-4097-46ce-a7d1-d0b6f1f0c838")
    @Override
    public void setUsed(NameSpace value) {
        appendDepVal(NamespaceUseData.Metadata.UsedDep(), (SmObjectImpl)value);
    }

    @objid ("c3e0e7c2-1056-4f65-bd21-b08659aa5fac")
    @Override
    public EList<Element> getCause() {
        return new SmList<>(this, NamespaceUseData.Metadata.CauseDep());
    }

    @objid ("e63cd9d2-d1ab-4637-bdae-3565f7cad627")
    @Override
    public <T extends Element> List<T> getCause(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Element element : getCause()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f42ba216-0a73-4992-bed9-36739339a424")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d357e82c-7057-4841-804b-51c1a5a5feaf")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("48a9ecf8-75f6-4d42-ba83-5aab9ff2c3b5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNamespaceUse(this);
        else
          return null;
    }

}
