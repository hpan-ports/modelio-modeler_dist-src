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
    @objid ("9800fb89-22db-4f44-b8ab-ed973c818e36")
    @Override
    public ModelElement getUtilizedElement() {
        return (ModelElement) getDepVal(ManifestationData.Metadata.UtilizedElementDep());
    }

    @objid ("9e227e9d-939b-4dfa-91bc-33b36a89fcf6")
    @Override
    public void setUtilizedElement(ModelElement value) {
        appendDepVal(ManifestationData.Metadata.UtilizedElementDep(), (SmObjectImpl)value);
    }

    @objid ("2e354027-596c-432c-a29f-00c4e78f3aa8")
    @Override
    public Artifact getOwner() {
        return (Artifact) getDepVal(ManifestationData.Metadata.OwnerDep());
    }

    @objid ("dad14e77-ca22-46f0-8de6-280cf20027be")
    @Override
    public void setOwner(Artifact value) {
        appendDepVal(ManifestationData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("a3c4fae6-d392-4896-af4b-b0f748d9a815")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ManifestationData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("53495a77-5212-4027-9cf6-d28378474857")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ManifestationData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ManifestationData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("6be23bdd-1130-4a55-812f-b1eb55384144")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitManifestation(this);
        else
          return null;
    }

}
