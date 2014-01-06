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
    @objid ("c50a8012-f613-4540-98f6-2ba40703ab18")
    @Override
    public NaryAssociation getNaryAssociationPart() {
        return (NaryAssociation) getDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep());
    }

    @objid ("9ccae858-8c25-47a8-81a1-79b3787c0c73")
    @Override
    public void setNaryAssociationPart(NaryAssociation value) {
        appendDepVal(ClassAssociationData.Metadata.NaryAssociationPartDep(), (SmObjectImpl)value);
    }

    @objid ("d179b319-3e40-4530-9ead-5205bea2527f")
    @Override
    public Class getClassPart() {
        return (Class) getDepVal(ClassAssociationData.Metadata.ClassPartDep());
    }

    @objid ("029647d6-7db5-4888-8baf-2ec0c11e0e70")
    @Override
    public void setClassPart(Class value) {
        appendDepVal(ClassAssociationData.Metadata.ClassPartDep(), (SmObjectImpl)value);
    }

    @objid ("129f7e20-c147-4049-aa07-346d18e4f8fd")
    @Override
    public Association getAssociationPart() {
        return (Association) getDepVal(ClassAssociationData.Metadata.AssociationPartDep());
    }

    @objid ("a1fc62da-e332-46a9-b30e-0900f5d3bba1")
    @Override
    public void setAssociationPart(Association value) {
        appendDepVal(ClassAssociationData.Metadata.AssociationPartDep(), (SmObjectImpl)value);
    }

    @objid ("fb99da85-698c-4e55-bf76-85b951fcb384")
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

    @objid ("f29c85ce-7e36-48ad-b36b-4ad8816b6473")
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

    @objid ("95f780fb-d25f-4ce6-9271-4ec30d4b354c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClassAssociation(this);
        else
          return null;
    }

}
