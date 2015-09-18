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
/*   Metamodel version: 9022              */
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
    @objid ("bebb380c-cea5-45c9-a266-9086b9ea453d")
    @Override
    public boolean isIsActive() {
        return (Boolean) getAttVal(ClassData.Metadata.IsActiveAtt());
    }

    @objid ("dd796bcb-8662-4c9b-be34-8abb57e54a1c")
    @Override
    public void setIsActive(boolean value) {
        setAttVal(ClassData.Metadata.IsActiveAtt(), value);
    }

    @objid ("18fcab1b-0813-4fb2-91e0-30b712ff49c0")
    @Override
    public boolean isIsMain() {
        return (Boolean) getAttVal(ClassData.Metadata.IsMainAtt());
    }

    @objid ("e6bdea31-5bc5-4d9d-9491-1b55f7885665")
    @Override
    public void setIsMain(boolean value) {
        setAttVal(ClassData.Metadata.IsMainAtt(), value);
    }

    @objid ("eeca3bc5-9814-4bbe-8b64-eeaea7662777")
    @Override
    public ClassAssociation getLinkToAssociation() {
        return (ClassAssociation) getDepVal(ClassData.Metadata.LinkToAssociationDep());
    }

    @objid ("9f969d14-e084-4476-985b-c103f9e442fe")
    @Override
    public void setLinkToAssociation(ClassAssociation value) {
        appendDepVal(ClassData.Metadata.LinkToAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("7c515fd1-00fb-4152-8456-a734e35957c9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c8c7c678-37d4-4ddd-ab16-2c0b6793e7ca")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("afacccc2-d71c-48cc-867b-91278412ee50")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClass(this);
        else
          return null;
    }

}
