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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ElementImpl;
import org.modelio.metamodel.impl.uml.statik.NamespaceUseData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00126858-c4bf-1fd8-97fe-001ec947cd2a")
public class NamespaceUseImpl extends ElementImpl implements NamespaceUse {
    @objid ("9b8b425a-0fbc-4480-8def-74ccedc31b8e")
    @Override
    public NameSpace getUser() {
        Object obj = getDepVal(((NamespaceUseSmClass)getClassOf()).getUserDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("901e5b19-661b-4137-9f2d-f050787e679a")
    @Override
    public void setUser(NameSpace value) {
        appendDepVal(((NamespaceUseSmClass)getClassOf()).getUserDep(), (SmObjectImpl)value);
    }

    @objid ("2738474e-4647-40c7-b46f-f7f2474845ab")
    @Override
    public NameSpace getUsed() {
        Object obj = getDepVal(((NamespaceUseSmClass)getClassOf()).getUsedDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("528f0611-e683-436c-ab33-1810aac1b189")
    @Override
    public void setUsed(NameSpace value) {
        appendDepVal(((NamespaceUseSmClass)getClassOf()).getUsedDep(), (SmObjectImpl)value);
    }

    @objid ("cf887850-3053-4165-9b3c-9333c23bde1b")
    @Override
    public EList<Element> getCause() {
        return new SmList<>(this, ((NamespaceUseSmClass)getClassOf()).getCauseDep());
    }

    @objid ("003d2409-aeb6-42bb-9ab9-29d8c03ebd06")
    @Override
    public <T extends Element> List<T> getCause(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Element element : getCause()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b7a28194-1ad0-4e93-9c06-bca109d880cd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f50f81ff-46a5-4ff8-8bc9-a25c9130708a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("8970feae-dc12-4de4-8c5e-28c9ebd29be3")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNamespaceUse(this);
        else
          return null;
    }

}
