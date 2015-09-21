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
import org.modelio.metamodel.impl.uml.statik.ClassData;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000247ca-c4bf-1fd8-97fe-001ec947cd2a")
public class ClassImpl extends GeneralClassImpl implements Class {
    @objid ("8565a134-6671-46fd-ba7f-3c2393646cd0")
    @Override
    public boolean isIsActive() {
        return (Boolean) getAttVal(((ClassSmClass)getClassOf()).getIsActiveAtt());
    }

    @objid ("d98b9588-34b4-46c2-8d52-d9e75c13d326")
    @Override
    public void setIsActive(boolean value) {
        setAttVal(((ClassSmClass)getClassOf()).getIsActiveAtt(), value);
    }

    @objid ("65ce6693-7f7f-4f33-8393-7419b49e54f9")
    @Override
    public boolean isIsMain() {
        return (Boolean) getAttVal(((ClassSmClass)getClassOf()).getIsMainAtt());
    }

    @objid ("e4fcafff-a434-4ce4-aa85-985d5c143847")
    @Override
    public void setIsMain(boolean value) {
        setAttVal(((ClassSmClass)getClassOf()).getIsMainAtt(), value);
    }

    @objid ("71dfba8d-5f90-4c4f-86a2-b4231bb2e75c")
    @Override
    public ClassAssociation getLinkToAssociation() {
        Object obj = getDepVal(((ClassSmClass)getClassOf()).getLinkToAssociationDep());
        return (obj instanceof ClassAssociation)? (ClassAssociation)obj : null;
    }

    @objid ("57630e82-bf27-49f9-b206-b81876b1a8ca")
    @Override
    public void setLinkToAssociation(ClassAssociation value) {
        appendDepVal(((ClassSmClass)getClassOf()).getLinkToAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("bf75815c-c30d-4291-bf77-54a1580c9beb")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f30c2825-5b7f-4990-8bbc-98d4a29e78a5")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("9032799a-01d5-46a4-8b6d-0e101330a42b")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClass(this);
        else
          return null;
    }

}
