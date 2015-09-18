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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
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

@objid ("0000df02-c4bf-1fd8-97fe-001ec947cd2a")
public class BindableInstanceImpl extends InstanceImpl implements BindableInstance {
    @objid ("cb2eeec4-f9f4-47d3-9b2f-166d7f3dc51a")
    @Override
    public Instance getCluster() {
        return (Instance) getDepVal(BindableInstanceData.Metadata.ClusterDep());
    }

    @objid ("2ea201ae-813e-42ff-bff6-98a87dfedad2")
    @Override
    public void setCluster(Instance value) {
        appendDepVal(BindableInstanceData.Metadata.ClusterDep(), (SmObjectImpl)value);
    }

    @objid ("4aa1f55e-b32e-4d77-b25e-b46b8922eddc")
    @Override
    public Classifier getInternalOwner() {
        return (Classifier) getDepVal(BindableInstanceData.Metadata.InternalOwnerDep());
    }

    @objid ("5c32107e-7262-4ad1-b050-fac3ba14276a")
    @Override
    public void setInternalOwner(Classifier value) {
        appendDepVal(BindableInstanceData.Metadata.InternalOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("24fa5cbb-6258-47c0-81e5-7a94f9225cb0")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, BindableInstanceData.Metadata.RepresentationDep());
    }

    @objid ("848becd6-8cff-4087-931a-5027b0c6384e")
    @Override
    public <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Binding element : getRepresentation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6e42aa4a-11f8-4497-9142-ea5c05647014")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(BindableInstanceData.Metadata.RepresentedFeatureDep());
    }

    @objid ("15aace6e-4808-45d1-a596-46de5a287a35")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(BindableInstanceData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("a300917a-95ee-4bc4-9c6e-4bce9db02a35")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindableInstanceData.Metadata.ClusterDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BindableInstanceData.Metadata.InternalOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d89c562c-1c47-4ebf-b601-6566430fa36a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindableInstanceData.Metadata.ClusterDep());
        if (obj != null)
          return new SmDepVal(BindableInstanceData.Metadata.ClusterDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BindableInstanceData.Metadata.InternalOwnerDep());
        if (obj != null)
          return new SmDepVal(BindableInstanceData.Metadata.InternalOwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d931f17d-95b4-43df-88b1-685248a4f700")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBindableInstance(this);
        else
          return null;
    }

}
