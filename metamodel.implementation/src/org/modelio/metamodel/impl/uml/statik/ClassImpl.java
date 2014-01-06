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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.ClassData;
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

@objid ("000247ca-c4bf-1fd8-97fe-001ec947cd2a")
public class ClassImpl extends GeneralClassImpl implements Class {
    @objid ("cf36e382-0f83-471b-a8ae-18f7e2eb7634")
    @Override
    public boolean isIsActive() {
        return (Boolean) getAttVal(ClassData.Metadata.IsActiveAtt());
    }

    @objid ("5b3162fd-43d5-4473-8181-a46c02f44e59")
    @Override
    public void setIsActive(boolean value) {
        setAttVal(ClassData.Metadata.IsActiveAtt(), value);
    }

    @objid ("fcf3bd0c-0ff0-4ff6-8952-ded232fc8c40")
    @Override
    public boolean isIsMain() {
        return (Boolean) getAttVal(ClassData.Metadata.IsMainAtt());
    }

    @objid ("fb14c332-6032-4247-9e7a-e407f9b55bec")
    @Override
    public void setIsMain(boolean value) {
        setAttVal(ClassData.Metadata.IsMainAtt(), value);
    }

    @objid ("7141485c-beea-4869-8a31-1da2392e3171")
    @Override
    public ClassAssociation getLinkToAssociation() {
        return (ClassAssociation) getDepVal(ClassData.Metadata.LinkToAssociationDep());
    }

    @objid ("0cd94bcd-48c4-480e-b17e-ea1f7230fd05")
    @Override
    public void setLinkToAssociation(ClassAssociation value) {
        appendDepVal(ClassData.Metadata.LinkToAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("9790e8f4-cd0e-4b89-84e7-aa360aaaf3fc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("04ad298f-2f90-4dfa-a568-6be2f40a69a0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d171cca6-3e05-4d33-a288-44df08850bb1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClass(this);
        else
          return null;
    }

}
