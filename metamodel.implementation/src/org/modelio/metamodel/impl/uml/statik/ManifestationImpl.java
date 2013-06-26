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
import org.modelio.metamodel.data.uml.statik.ManifestationData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0010c444-c4bf-1fd8-97fe-001ec947cd2a")
public class ManifestationImpl extends ModelElementImpl implements Manifestation {
    @objid ("09e55a46-0797-43b3-bed7-c178a55c1741")
    @Override
    public ModelElement getUtilizedElement() {
        return (ModelElement) getDepVal(ManifestationData.Metadata.UtilizedElementDep());
    }

    @objid ("308ddb2a-a89b-41f3-9b24-f1ef2e2fc192")
    @Override
    public void setUtilizedElement(ModelElement value) {
        appendDepVal(ManifestationData.Metadata.UtilizedElementDep(), (SmObjectImpl)value);
    }

    @objid ("180a9b00-dbde-4cb1-91b5-1430f6e3d4cd")
    @Override
    public Artifact getOwner() {
        return (Artifact) getDepVal(ManifestationData.Metadata.OwnerDep());
    }

    @objid ("c9814d68-cf3a-4ed3-a52f-fada839d4534")
    @Override
    public void setOwner(Artifact value) {
        appendDepVal(ManifestationData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("4e825ae9-93cc-4811-9ddd-bc69e992a16d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ManifestationData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("754e9374-2080-4a27-8484-8d9876d0f7eb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ManifestationData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ManifestationData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("6e67132e-7e62-4ed3-89a2-5f7dc5bcaa30")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitManifestation(this);
        else
          return null;
    }

}
