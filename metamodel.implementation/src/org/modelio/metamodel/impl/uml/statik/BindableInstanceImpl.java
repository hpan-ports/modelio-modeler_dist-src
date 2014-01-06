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
    @objid ("7471ea68-0708-4a03-8857-8e8630eb1598")
    @Override
    public Instance getCluster() {
        return (Instance) getDepVal(BindableInstanceData.Metadata.ClusterDep());
    }

    @objid ("8459484f-1dd6-4002-b57d-ae1948fd9101")
    @Override
    public void setCluster(Instance value) {
        appendDepVal(BindableInstanceData.Metadata.ClusterDep(), (SmObjectImpl)value);
    }

    @objid ("befdc733-7f01-45d9-9611-7b92e3233f52")
    @Override
    public Classifier getInternalOwner() {
        return (Classifier) getDepVal(BindableInstanceData.Metadata.InternalOwnerDep());
    }

    @objid ("6a2fbe55-1a5c-47f3-aa9a-6e4b01e58717")
    @Override
    public void setInternalOwner(Classifier value) {
        appendDepVal(BindableInstanceData.Metadata.InternalOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("be2333bd-5184-4754-920e-67addf04a3a5")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, BindableInstanceData.Metadata.RepresentationDep());
    }

    @objid ("44d2637d-23f0-4990-af4e-5a1211115271")
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

    @objid ("e4c53899-0d77-419f-a0b4-97d5f89bc848")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(BindableInstanceData.Metadata.RepresentedFeatureDep());
    }

    @objid ("2f2f4863-6a09-4806-b0ba-8d00c631135b")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(BindableInstanceData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("1a596a24-13e6-4e4a-91a2-ca3306bf665f")
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

    @objid ("66681a2a-f609-4e5e-bae8-ff83782897dc")
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

    @objid ("6faf7a73-4af9-498a-b43f-a8660f30762b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBindableInstance(this);
        else
          return null;
    }

}
