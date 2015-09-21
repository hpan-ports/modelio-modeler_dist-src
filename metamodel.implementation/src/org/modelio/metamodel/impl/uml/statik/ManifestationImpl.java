/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.ManifestationData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0010c444-c4bf-1fd8-97fe-001ec947cd2a")
public class ManifestationImpl extends ModelElementImpl implements Manifestation {
    @objid ("db790a6d-eaa9-4b7e-bc0e-7d7aef258884")
    @Override
    public ModelElement getUtilizedElement() {
        Object obj = getDepVal(((ManifestationSmClass)getClassOf()).getUtilizedElementDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("9c7dee87-4ab1-4528-8c43-f8b068c32536")
    @Override
    public void setUtilizedElement(ModelElement value) {
        appendDepVal(((ManifestationSmClass)getClassOf()).getUtilizedElementDep(), (SmObjectImpl)value);
    }

    @objid ("7013f4e8-9fdc-418a-b77d-3c0545b7993a")
    @Override
    public Artifact getOwner() {
        Object obj = getDepVal(((ManifestationSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof Artifact)? (Artifact)obj : null;
    }

    @objid ("a060834a-ec3b-46bc-9ff6-d2608474a606")
    @Override
    public void setOwner(Artifact value) {
        appendDepVal(((ManifestationSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("80cb9a21-8079-48e7-824e-201e51be6c11")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((ManifestationSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("927f75eb-c07d-4738-a665-3c06258f8ca5")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((ManifestationSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("fdaee05e-09d4-4a63-947b-269bfa179b27")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitManifestation(this);
        else
          return null;
    }

}
