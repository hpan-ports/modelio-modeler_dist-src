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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("370afeb2-c584-48b4-9123-fe4c3120fb49")
    @Override
    public boolean isIsActive() {
        return (Boolean) getAttVal(ClassData.Metadata.IsActiveAtt());
    }

    @objid ("db73874f-9925-4095-86c0-4b1c8273d829")
    @Override
    public void setIsActive(boolean value) {
        setAttVal(ClassData.Metadata.IsActiveAtt(), value);
    }

    @objid ("36a3d186-47fc-48b4-a9e4-a9fb93f7f057")
    @Override
    public boolean isIsMain() {
        return (Boolean) getAttVal(ClassData.Metadata.IsMainAtt());
    }

    @objid ("b043ea66-7ead-4422-a12f-3c3419852541")
    @Override
    public void setIsMain(boolean value) {
        setAttVal(ClassData.Metadata.IsMainAtt(), value);
    }

    @objid ("ce8a0ea8-4bf0-402e-a1ba-6c222c0b2930")
    @Override
    public ClassAssociation getLinkToAssociation() {
        return (ClassAssociation) getDepVal(ClassData.Metadata.LinkToAssociationDep());
    }

    @objid ("a5be14ea-dd30-4f3f-a826-f89c2b177de9")
    @Override
    public void setLinkToAssociation(ClassAssociation value) {
        appendDepVal(ClassData.Metadata.LinkToAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("b3375ccb-168d-4754-9a16-142cd59b6be9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2365d997-a133-45e6-a990-4823294023f7")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("261d9ebf-d1dc-4983-a252-83c0c0d8fdd1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClass(this);
        else
          return null;
    }

}
