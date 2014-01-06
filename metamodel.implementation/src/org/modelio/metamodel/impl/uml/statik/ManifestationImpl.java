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
    @objid ("31dd1b9b-a5d7-4ce9-9cc1-2075aeb85a68")
    @Override
    public ModelElement getUtilizedElement() {
        return (ModelElement) getDepVal(ManifestationData.Metadata.UtilizedElementDep());
    }

    @objid ("cbd25c5c-9e0e-4702-9f3b-5a14d34e53b3")
    @Override
    public void setUtilizedElement(ModelElement value) {
        appendDepVal(ManifestationData.Metadata.UtilizedElementDep(), (SmObjectImpl)value);
    }

    @objid ("bfe67336-1986-4a53-9003-efa6c251a4af")
    @Override
    public Artifact getOwner() {
        return (Artifact) getDepVal(ManifestationData.Metadata.OwnerDep());
    }

    @objid ("bf7ed956-3568-47ef-ada3-3b46c1cd66f5")
    @Override
    public void setOwner(Artifact value) {
        appendDepVal(ManifestationData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("83feffc9-8d73-43a3-beb0-6f2bf1d750cf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ManifestationData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("cd2cdd8a-0fd3-440f-b1e2-dbbe12a445e9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ManifestationData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ManifestationData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("4d0ec0d1-f5b0-4360-94fa-7163393e3e1e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitManifestation(this);
        else
          return null;
    }

}
