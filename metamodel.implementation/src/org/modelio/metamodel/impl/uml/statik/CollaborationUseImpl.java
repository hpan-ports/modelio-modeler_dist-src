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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.CollaborationUseData;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0004a754-c4bf-1fd8-97fe-001ec947cd2a")
public class CollaborationUseImpl extends ModelElementImpl implements CollaborationUse {
    @objid ("fd5492ec-4956-4290-a490-a0b212ade7f9")
    @Override
    public Collaboration getType() {
        Object obj = getDepVal(((CollaborationUseSmClass)getClassOf()).getTypeDep());
        return (obj instanceof Collaboration)? (Collaboration)obj : null;
    }

    @objid ("fc5358bd-9e6f-438d-b132-bf7990cbef32")
    @Override
    public void setType(Collaboration value) {
        appendDepVal(((CollaborationUseSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("e25da860-8024-4a73-9863-1fe4e2ce43d9")
    @Override
    public NameSpace getNRepresented() {
        Object obj = getDepVal(((CollaborationUseSmClass)getClassOf()).getNRepresentedDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("b7310469-487d-4a16-ae2f-bf34fe87cf88")
    @Override
    public void setNRepresented(NameSpace value) {
        appendDepVal(((CollaborationUseSmClass)getClassOf()).getNRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("8b33605c-c8c2-4476-912e-c16bf3dc978b")
    @Override
    public Operation getORepresented() {
        Object obj = getDepVal(((CollaborationUseSmClass)getClassOf()).getORepresentedDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("98049ac9-d605-48b1-992e-8dc894f20511")
    @Override
    public void setORepresented(Operation value) {
        appendDepVal(((CollaborationUseSmClass)getClassOf()).getORepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("627ace80-2a0e-489c-9c20-37c02596b279")
    @Override
    public EList<Binding> getRoleBinding() {
        return new SmList<>(this, ((CollaborationUseSmClass)getClassOf()).getRoleBindingDep());
    }

    @objid ("e4f67032-7afb-4be8-97df-aa10cfe779fa")
    @Override
    public <T extends Binding> List<T> getRoleBinding(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Binding element : getRoleBinding()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("16b50a2b-aca6-4d64-9d98-50f18f060f47")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // NRepresented
        obj = (SmObjectImpl)this.getDepVal(((CollaborationUseSmClass)getClassOf()).getNRepresentedDep());
        if (obj != null)
          return obj;
        // ORepresented
        obj = (SmObjectImpl)this.getDepVal(((CollaborationUseSmClass)getClassOf()).getORepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("af86a85b-7460-43dd-a93b-8a23f92031c4")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // NRepresented
        dep = ((CollaborationUseSmClass)getClassOf()).getNRepresentedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ORepresented
        dep = ((CollaborationUseSmClass)getClassOf()).getORepresentedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("76058b9c-e4de-4c29-a6a3-ea4e91aeee00")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCollaborationUse(this);
        else
          return null;
    }

}
