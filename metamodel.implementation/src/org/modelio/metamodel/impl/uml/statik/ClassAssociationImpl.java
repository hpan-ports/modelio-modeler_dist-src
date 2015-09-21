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
import org.modelio.metamodel.impl.uml.statik.ClassAssociationData;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0002efae-c4bf-1fd8-97fe-001ec947cd2a")
public class ClassAssociationImpl extends ModelElementImpl implements ClassAssociation {
    @objid ("a1bd9d2b-6a2f-42de-af42-230da042539b")
    @Override
    public NaryAssociation getNaryAssociationPart() {
        Object obj = getDepVal(((ClassAssociationSmClass)getClassOf()).getNaryAssociationPartDep());
        return (obj instanceof NaryAssociation)? (NaryAssociation)obj : null;
    }

    @objid ("e475478f-9b56-416f-8bce-e3b4212a1ac5")
    @Override
    public void setNaryAssociationPart(NaryAssociation value) {
        appendDepVal(((ClassAssociationSmClass)getClassOf()).getNaryAssociationPartDep(), (SmObjectImpl)value);
    }

    @objid ("5c82332b-3b59-4930-8094-8e753d3cba6e")
    @Override
    public Class getClassPart() {
        Object obj = getDepVal(((ClassAssociationSmClass)getClassOf()).getClassPartDep());
        return (obj instanceof Class)? (Class)obj : null;
    }

    @objid ("78015c34-4cae-42f8-a4a0-21295c4342d3")
    @Override
    public void setClassPart(Class value) {
        appendDepVal(((ClassAssociationSmClass)getClassOf()).getClassPartDep(), (SmObjectImpl)value);
    }

    @objid ("1dfbd3e0-7674-499a-8309-5079c2a068b1")
    @Override
    public Association getAssociationPart() {
        Object obj = getDepVal(((ClassAssociationSmClass)getClassOf()).getAssociationPartDep());
        return (obj instanceof Association)? (Association)obj : null;
    }

    @objid ("01c946fc-c616-4397-9a25-690bcb5d4f69")
    @Override
    public void setAssociationPart(Association value) {
        appendDepVal(((ClassAssociationSmClass)getClassOf()).getAssociationPartDep(), (SmObjectImpl)value);
    }

    @objid ("61c5e049-1520-475f-a3d9-0a9805bbef80")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // NaryAssociationPart
        obj = (SmObjectImpl)this.getDepVal(((ClassAssociationSmClass)getClassOf()).getNaryAssociationPartDep());
        if (obj != null)
          return obj;
        // AssociationPart
        obj = (SmObjectImpl)this.getDepVal(((ClassAssociationSmClass)getClassOf()).getAssociationPartDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7f6a877f-b93d-4b55-b0ec-c1700b359f10")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // NaryAssociationPart
        dep = ((ClassAssociationSmClass)getClassOf()).getNaryAssociationPartDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // AssociationPart
        dep = ((ClassAssociationSmClass)getClassOf()).getAssociationPartDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("390289aa-b688-4c96-bbd9-dde90364acfe")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClassAssociation(this);
        else
          return null;
    }

}
