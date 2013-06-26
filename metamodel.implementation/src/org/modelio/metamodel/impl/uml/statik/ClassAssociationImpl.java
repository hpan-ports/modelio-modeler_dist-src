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
    @objid ("e9586eae-b1a3-49ec-a6e2-a11b7055c547")
    @Override
    public NaryAssociation getNaryAssociationPart() {
        return (NaryAssociation) getDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep());
    }

    @objid ("d96088d6-28ad-457c-be83-cb4f851b78c3")
    @Override
    public void setNaryAssociationPart(NaryAssociation value) {
        appendDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep(), (SmObjectImpl)value);
    }

    @objid ("7140e4f7-40fa-4977-b2f9-37757e6955b5")
    @Override
    public Class getClassPart() {
        return (Class) getDepVal(ClassAssociationData.Metadata.ClassPartDep());
    }

    @objid ("840b289f-79bb-4702-a599-b70e74399e1e")
    @Override
    public void setClassPart(Class value) {
        appendDepVal(ClassAssociationData.Metadata.ClassPartDep(), (SmObjectImpl)value);
    }

    @objid ("7eabc9a4-2a70-45e5-b32a-c88337903a74")
    @Override
    public Association getAssociationPart() {
        return (Association) getDepVal(ClassAssociationData.Metadata.AssociationPartDep());
    }

    @objid ("3c8388dc-7484-4138-b47c-79a2dd944eb6")
    @Override
    public void setAssociationPart(Association value) {
        appendDepVal(ClassAssociationData.Metadata.AssociationPartDep(), (SmObjectImpl)value);
    }

    @objid ("126ced02-0555-47f5-92bf-7cd2a973b7e9")
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

    @objid ("dd2f23fa-a174-4a30-b3ee-3198daf73519")
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

    @objid ("ed3ceacb-a921-408d-ba98-c74bfad4c168")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClassAssociation(this);
        else
          return null;
    }

}
