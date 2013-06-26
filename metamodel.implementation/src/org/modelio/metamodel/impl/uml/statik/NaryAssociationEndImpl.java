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
    @objid ("74a9fadf-c2cd-4fb3-b375-ef63f26ac719")
    @Override
    public NaryAssociation getNaryAssociation() {
        return (NaryAssociation) getDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep());
    }

    @objid ("9238c56d-37d8-4287-9c80-c23b5c645405")
    @Override
    public void setNaryAssociation(NaryAssociation value) {
        appendDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("3c09ab7b-3616-4309-8330-10bb7b63a0bb")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(NaryAssociationEndData.Metadata.OwnerDep());
    }

    @objid ("7dc8f847-8205-4ead-84e9-20c334e2663e")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(NaryAssociationEndData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("bed36f24-3158-4c3e-8dad-60fe53db1c9d")
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

    @objid ("fa28655f-f100-405b-af46-8c05876fa904")
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

    @objid ("731d0b75-7c16-4c85-8f4d-ca9d62f6589a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryAssociationEnd(this);
        else
          return null;
    }

}
