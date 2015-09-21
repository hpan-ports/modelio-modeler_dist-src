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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.InterfaceRealizationData;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000f221a-c4bf-1fd8-97fe-001ec947cd2a")
public class InterfaceRealizationImpl extends ModelElementImpl implements InterfaceRealization {
    @objid ("ca25a2a4-64f9-45dd-819c-4f31d69021f5")
    @Override
    public Interface getImplemented() {
        Object obj = getDepVal(((InterfaceRealizationSmClass)getClassOf()).getImplementedDep());
        return (obj instanceof Interface)? (Interface)obj : null;
    }

    @objid ("5890a45b-07c2-4720-ab2c-3ed96bde2b0d")
    @Override
    public void setImplemented(Interface value) {
        appendDepVal(((InterfaceRealizationSmClass)getClassOf()).getImplementedDep(), (SmObjectImpl)value);
    }

    @objid ("d7615427-f2f7-4fce-9728-7ddf4ce7f973")
    @Override
    public NameSpace getImplementer() {
        Object obj = getDepVal(((InterfaceRealizationSmClass)getClassOf()).getImplementerDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("a798dc6a-2b99-40a3-9386-e893f610a98e")
    @Override
    public void setImplementer(NameSpace value) {
        appendDepVal(((InterfaceRealizationSmClass)getClassOf()).getImplementerDep(), (SmObjectImpl)value);
    }

    @objid ("9d46cb0a-d66a-4516-ae2d-d46175748f37")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Implementer
        obj = (SmObjectImpl)this.getDepVal(((InterfaceRealizationSmClass)getClassOf()).getImplementerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b8e51f9c-fa5d-4151-a36d-20b1dc76ec43")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Implementer
        dep = ((InterfaceRealizationSmClass)getClassOf()).getImplementerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("492bb55b-489f-4702-b425-09572e830ed6")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInterfaceRealization(this);
        else
          return null;
    }

}
