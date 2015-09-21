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
import org.modelio.metamodel.impl.uml.statik.CollaborationData;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
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

@objid ("00041fdc-c4bf-1fd8-97fe-001ec947cd2a")
public class CollaborationImpl extends NameSpaceImpl implements Collaboration {
    @objid ("bc8cded9-d10f-42a0-b997-4a1579897208")
    @Override
    public boolean isIsConcurrent() {
        return (Boolean) getAttVal(((CollaborationSmClass)getClassOf()).getIsConcurrentAtt());
    }

    @objid ("e1ca99a3-c3af-4bfd-8eb8-af1f130dab85")
    @Override
    public void setIsConcurrent(boolean value) {
        setAttVal(((CollaborationSmClass)getClassOf()).getIsConcurrentAtt(), value);
    }

    @objid ("4759dea8-39a6-40a2-a30c-024a7a522f4a")
    @Override
    public Operation getORepresented() {
        Object obj = getDepVal(((CollaborationSmClass)getClassOf()).getORepresentedDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("faebac53-598c-4532-968d-54be358b8ebc")
    @Override
    public void setORepresented(Operation value) {
        appendDepVal(((CollaborationSmClass)getClassOf()).getORepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("75383d40-f0dd-4463-b532-63e1549f1e5b")
    @Override
    public Behavior getBRepresented() {
        Object obj = getDepVal(((CollaborationSmClass)getClassOf()).getBRepresentedDep());
        return (obj instanceof Behavior)? (Behavior)obj : null;
    }

    @objid ("664f2637-1830-4f68-9dca-07a783079cfd")
    @Override
    public void setBRepresented(Behavior value) {
        appendDepVal(((CollaborationSmClass)getClassOf()).getBRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("5a88ff11-aeda-4e88-9fe1-2d37c0891720")
    @Override
    public EList<CollaborationUse> getOccurrence() {
        return new SmList<>(this, ((CollaborationSmClass)getClassOf()).getOccurrenceDep());
    }

    @objid ("1bb93f4b-f950-4b40-a126-9212fb2b0c29")
    @Override
    public <T extends CollaborationUse> List<T> getOccurrence(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CollaborationUse element : getOccurrence()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d640cc51-c664-43d1-82de-7c3499d513ec")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // ORepresented
        obj = (SmObjectImpl)this.getDepVal(((CollaborationSmClass)getClassOf()).getORepresentedDep());
        if (obj != null)
          return obj;
        // BRepresented
        obj = (SmObjectImpl)this.getDepVal(((CollaborationSmClass)getClassOf()).getBRepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d40bc95a-28f1-4976-956e-cc11cf86baf4")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // ORepresented
        dep = ((CollaborationSmClass)getClassOf()).getORepresentedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // BRepresented
        dep = ((CollaborationSmClass)getClassOf()).getBRepresentedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("60aace50-24db-4bc8-bf81-fd2df219b52c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCollaboration(this);
        else
          return null;
    }

}
