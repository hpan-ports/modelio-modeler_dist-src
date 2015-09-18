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
    @objid ("b82e0d5f-2f27-4460-8298-a35ed488c889")
    @Override
    public NameSpace getUser() {
        return (NameSpace) getDepVal(NamespaceUseData.Metadata.UserDep());
    }

    @objid ("e8434abb-5dd9-43ac-9985-b087978bb6ce")
    @Override
    public void setUser(NameSpace value) {
        appendDepVal(NamespaceUseData.Metadata.UserDep(), (SmObjectImpl)value);
    }

    @objid ("fa3eaca4-787a-4dea-9262-a5af32691d42")
    @Override
    public NameSpace getUsed() {
        return (NameSpace) getDepVal(NamespaceUseData.Metadata.UsedDep());
    }

    @objid ("7cc59928-81c5-4e44-ab8d-914cf8854c67")
    @Override
    public void setUsed(NameSpace value) {
        appendDepVal(NamespaceUseData.Metadata.UsedDep(), (SmObjectImpl)value);
    }

    @objid ("d2e36eb2-8194-454d-8641-a02f2aa3543d")
    @Override
    public EList<Element> getCause() {
        return new SmList<>(this, NamespaceUseData.Metadata.CauseDep());
    }

    @objid ("92f6a932-7eec-400d-96be-ff9ff63fa52a")
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

    @objid ("d73cad1d-8341-4d21-a54b-c8eace2f03bd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b25d721d-bee5-4e67-a875-55d0cc26932e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("482a415e-bb61-4bbb-8745-4fb8f0348687")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNamespaceUse(this);
        else
          return null;
    }

}
