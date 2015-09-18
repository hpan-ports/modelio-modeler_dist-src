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
import org.modelio.metamodel.data.uml.statik.ClassAssociationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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

@objid ("0002efae-c4bf-1fd8-97fe-001ec947cd2a")
public class ClassAssociationImpl extends ModelElementImpl implements ClassAssociation {
    @objid ("4c4bcffb-f53d-46cc-85ea-3f46465abc84")
    @Override
    public NaryAssociation getNaryAssociationPart() {
        return (NaryAssociation) getDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep());
    }

    @objid ("6cb1fee5-f59f-4e07-9c3f-8731da7d8856")
    @Override
    public void setNaryAssociationPart(NaryAssociation value) {
        appendDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep(), (SmObjectImpl)value);
    }

    @objid ("facb3ff0-4d28-451c-852a-cf366bc8d573")
    @Override
    public Class getClassPart() {
        return (Class) getDepVal(ClassAssociationData.Metadata.ClassPartDep());
    }

    @objid ("b65c6385-a5bb-4525-a0a7-3b1f237ba0ce")
    @Override
    public void setClassPart(Class value) {
        appendDepVal(ClassAssociationData.Metadata.ClassPartDep(), (SmObjectImpl)value);
    }

    @objid ("b5249c72-ca76-4418-ac89-95a610e5ea13")
    @Override
    public Association getAssociationPart() {
        return (Association) getDepVal(ClassAssociationData.Metadata.AssociationPartDep());
    }

    @objid ("0361ba5a-b339-4fc1-a11e-bff473015dce")
    @Override
    public void setAssociationPart(Association value) {
        appendDepVal(ClassAssociationData.Metadata.AssociationPartDep(), (SmObjectImpl)value);
    }

    @objid ("0ff972fc-a504-418c-abb0-1eaeb1c5a838")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ClassAssociationData.Metadata.AssociationPartDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2667c355-f5c8-4d72-97d4-f803ddccd504")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep());
        if (obj != null)
          return new SmDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ClassAssociationData.Metadata.AssociationPartDep());
        if (obj != null)
          return new SmDepVal(ClassAssociationData.Metadata.AssociationPartDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("39fbf663-85c5-4fdf-816d-99f3059d4d64")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClassAssociation(this);
        else
          return null;
    }

}
