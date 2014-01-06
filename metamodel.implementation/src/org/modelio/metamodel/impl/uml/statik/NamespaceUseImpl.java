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
    @objid ("f1f0f554-0598-4144-b107-074ec8714b51")
    @Override
    public NameSpace getUser() {
        return (NameSpace) getDepVal(NamespaceUseData.Metadata.UserDep());
    }

    @objid ("b39e32d4-7765-42d3-9cc0-4cc27665e275")
    @Override
    public void setUser(NameSpace value) {
        appendDepVal(NamespaceUseData.Metadata.UserDep(), (SmObjectImpl)value);
    }

    @objid ("60e90aed-c79b-4791-9ab0-ff7a004e01a5")
    @Override
    public NameSpace getUsed() {
        return (NameSpace) getDepVal(NamespaceUseData.Metadata.UsedDep());
    }

    @objid ("8a5e6101-ff07-4c50-bd42-bdfbb23f99da")
    @Override
    public void setUsed(NameSpace value) {
        appendDepVal(NamespaceUseData.Metadata.UsedDep(), (SmObjectImpl)value);
    }

    @objid ("a32f8527-5cec-4d75-8b7b-9b829a30ff5a")
    @Override
    public EList<Element> getCause() {
        return new SmList<>(this, NamespaceUseData.Metadata.CauseDep());
    }

    @objid ("ff82f330-bef6-4ef8-b0d7-8d75f6135909")
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

    @objid ("344403d0-054b-46b9-b097-67a124565ba6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("0850359f-5881-48fb-9ad0-3919b99af713")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("fe437ae0-5935-47d6-b1a7-e1d2c4c906a6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNamespaceUse(this);
        else
          return null;
    }

}
