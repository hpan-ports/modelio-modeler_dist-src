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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.impl.analyst.AnalystPropertyTableData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.TypedPropertyTableImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("008a372a-ec8f-1098-b22e-001ec947cd2a")
public class AnalystPropertyTableImpl extends TypedPropertyTableImpl implements AnalystPropertyTable {
    @objid ("18791374-0386-4cf4-aa5b-b4b94dc7aefb")
    @Override
    public AnalystItem getAnalystOwner() {
        Object obj = getDepVal(((AnalystPropertyTableSmClass)getClassOf()).getAnalystOwnerDep());
        return (obj instanceof AnalystItem)? (AnalystItem)obj : null;
    }

    @objid ("407b1699-7fcb-4b49-9997-bb06d1c657ab")
    @Override
    public void setAnalystOwner(AnalystItem value) {
        appendDepVal(((AnalystPropertyTableSmClass)getClassOf()).getAnalystOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("1b9af6d7-e150-434d-b39f-972c5bfc7c96")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // AnalystOwner
        obj = (SmObjectImpl)this.getDepVal(((AnalystPropertyTableSmClass)getClassOf()).getAnalystOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6b5c180c-b121-4cc3-b3be-35ecdb11eba9")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // AnalystOwner
        dep = ((AnalystPropertyTableSmClass)getClassOf()).getAnalystOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("63fdbecb-f67d-4fb8-939d-e35d6278c110")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystPropertyTable(this);
        else
          return null;
    }

}
