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
    @objid ("933383c4-f16d-46c3-ab86-ce16c4fda96b")
    @Override
    public NaryAssociation getNaryAssociation() {
        return (NaryAssociation) getDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep());
    }

    @objid ("c84c4570-f439-4c0b-968b-38fff8b2a88b")
    @Override
    public void setNaryAssociation(NaryAssociation value) {
        appendDepVal(NaryAssociationEndData.Metadata.NaryAssociationDep(), (SmObjectImpl)value);
    }

    @objid ("72da22c1-75ab-4505-8d46-723c08fc58d2")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(NaryAssociationEndData.Metadata.OwnerDep());
    }

    @objid ("5e1e90b8-a38c-4146-a841-fb30e0a385c3")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(NaryAssociationEndData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("ff69a295-c2cd-41b2-b253-7a9af8e30c7a")
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

    @objid ("97774dc3-30c5-4979-bf4e-e7f23851799b")
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

    @objid ("ceeeb646-7615-4bbc-ad86-938d2c93cd8a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitNaryAssociationEnd(this);
        else
          return null;
    }

}
