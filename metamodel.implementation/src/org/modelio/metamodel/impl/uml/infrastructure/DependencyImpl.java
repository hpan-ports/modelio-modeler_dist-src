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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.DependencyData;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00860ba0-c4be-1fd8-97fe-001ec947cd2a")
public class DependencyImpl extends ModelElementImpl implements Dependency {
    @objid ("e2e3b6bf-c9b2-4125-ab72-169b3abe30f4")
    @Override
    public String getDependsOnId() {
        return (String) getAttVal(((DependencySmClass)getClassOf()).getDependsOnIdAtt());
    }

    @objid ("87d17114-abbd-46b3-9dc1-c7be64bd2aee")
    @Override
    public void setDependsOnId(String value) {
        setAttVal(((DependencySmClass)getClassOf()).getDependsOnIdAtt(), value);
    }

    @objid ("25d6f2e1-5e18-4db1-8423-06e9a5b6126d")
    @Override
    public String getDependsOnName() {
        return (String) getAttVal(((DependencySmClass)getClassOf()).getDependsOnNameAtt());
    }

    @objid ("1cf3d7eb-7f53-436b-9ec9-0e2ef10dba26")
    @Override
    public void setDependsOnName(String value) {
        setAttVal(((DependencySmClass)getClassOf()).getDependsOnNameAtt(), value);
    }

    @objid ("32a90a33-70c8-4c47-b193-79e024027540")
    @Override
    public ModelElement getDependsOn() {
        Object obj = getDepVal(((DependencySmClass)getClassOf()).getDependsOnDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("46c2786a-99d5-43f2-ac49-a5b878a51528")
    @Override
    public void setDependsOn(ModelElement value) {
        appendDepVal(((DependencySmClass)getClassOf()).getDependsOnDep(), (SmObjectImpl)value);
    }

    @objid ("4575dccb-6515-454a-9b85-311ecc0028f9")
    @Override
    public ModelElement getImpacted() {
        Object obj = getDepVal(((DependencySmClass)getClassOf()).getImpactedDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("001c09db-ea6a-4709-a865-02102467437d")
    @Override
    public void setImpacted(ModelElement value) {
        appendDepVal(((DependencySmClass)getClassOf()).getImpactedDep(), (SmObjectImpl)value);
    }

    @objid ("66770f8d-92fa-43c3-bdcb-7fb472fb4477")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Impacted
        obj = (SmObjectImpl)this.getDepVal(((DependencySmClass)getClassOf()).getImpactedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("102b421a-7657-484c-9fd8-cc19681d336a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Impacted
        dep = ((DependencySmClass)getClassOf()).getImpactedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("e66c44ee-e574-446d-b3fc-d27bb16907a6")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDependency(this);
        else
          return null;
    }

}
