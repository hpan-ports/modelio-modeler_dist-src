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
import org.modelio.metamodel.data.uml.statik.NaryAssociationEndData;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0020dab4-c4bf-1fd8-97fe-001ec947cd2a")
public class NaryAssociationEndImpl extends StructuralFeatureImpl implements NaryAssociationEnd {
    @objid ("c7944a42-83a1-45c3-b3bd-3f1e99bec9c4")
    @Override
    public NaryAssociation getNaryAssociation() {
        return (NaryAssociation) getDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep());
    }

    @objid ("57b3ba77-74c8-4770-804b-8568db7f989a")
    @Override
    public void setNaryAssociation(NaryAssociation value) {
        appendDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("c3a784cf-725e-4a30-819e-58e37cc3d612")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(NaryAssociationEndData.Metadata.OwnerDep());
    }

    @objid ("59759330-57fd-4934-ae8c-9f6a37fd9fe2")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(NaryAssociationEndData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("0c355fd3-62e6-4999-931e-84349763d41c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NaryAssociationEndData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("52d1566e-4509-467a-9bca-d9aaaa4fa2f0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(NaryAssociationEndData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(NaryAssociationEndData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep());
        if (obj != null)
          return new SmDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7672fd50-3a4f-48d9-bb48-07ad48226691")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryAssociationEnd(this);
        else
          return null;
    }

}
