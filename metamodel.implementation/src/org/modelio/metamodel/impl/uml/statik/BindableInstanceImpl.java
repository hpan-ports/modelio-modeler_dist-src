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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.statik.BindableInstanceData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0000df02-c4bf-1fd8-97fe-001ec947cd2a")
public class BindableInstanceImpl extends InstanceImpl implements BindableInstance {
    @objid ("6664f27d-20ea-49aa-be1d-82b60cdc9948")
    @Override
    public Instance getCluster() {
        Object obj = getDepVal(((BindableInstanceSmClass)getClassOf()).getClusterDep());
        return (obj instanceof Instance)? (Instance)obj : null;
    }

    @objid ("275ba72d-f7bf-45e5-8bd6-59583867d7ee")
    @Override
    public void setCluster(Instance value) {
        appendDepVal(((BindableInstanceSmClass)getClassOf()).getClusterDep(), (SmObjectImpl)value);
    }

    @objid ("cada6bdf-dfcc-49e6-9cab-13769af61852")
    @Override
    public Classifier getInternalOwner() {
        Object obj = getDepVal(((BindableInstanceSmClass)getClassOf()).getInternalOwnerDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("b7c197b8-78eb-4649-93ac-1278049f9319")
    @Override
    public void setInternalOwner(Classifier value) {
        appendDepVal(((BindableInstanceSmClass)getClassOf()).getInternalOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("03dc3433-37b9-4590-b1ed-135eaf2aa2c2")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, ((BindableInstanceSmClass)getClassOf()).getRepresentationDep());
    }

    @objid ("e355604e-0aed-4291-8b17-7773127f00c2")
    @Override
    public <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Binding element : getRepresentation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("80f28a79-3975-4d61-ba2d-5da7405e22fe")
    @Override
    public ModelElement getRepresentedFeature() {
        Object obj = getDepVal(((BindableInstanceSmClass)getClassOf()).getRepresentedFeatureDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("a24fe54f-cbbf-40a4-a8ff-c2104f84f732")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(((BindableInstanceSmClass)getClassOf()).getRepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("14a2b0d3-974d-4858-a9c7-c69654e416b5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Cluster
        obj = (SmObjectImpl)this.getDepVal(((BindableInstanceSmClass)getClassOf()).getClusterDep());
        if (obj != null)
          return obj;
        // InternalOwner
        obj = (SmObjectImpl)this.getDepVal(((BindableInstanceSmClass)getClassOf()).getInternalOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5dba4f8b-c416-4eb6-afff-727af53268d8")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Cluster
        dep = ((BindableInstanceSmClass)getClassOf()).getClusterDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // InternalOwner
        dep = ((BindableInstanceSmClass)getClassOf()).getInternalOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("b7fafd3f-e09e-49d4-9414-607e1b9c1f67")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBindableInstance(this);
        else
          return null;
    }

}
