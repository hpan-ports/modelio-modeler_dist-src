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
    @objid ("1130bb4e-3ac9-424f-b2c3-5e4f7a82cf62")
    @Override
    public Instance getCluster() {
        return (Instance) getDepVal(BindableInstanceData.Metadata.ClusterDep());
    }

    @objid ("94664543-ef4a-4767-bcae-2f04db38cbd0")
    @Override
    public void setCluster(Instance value) {
        appendDepVal(BindableInstanceData.Metadata.ClusterDep(), (SmObjectImpl)value);
    }

    @objid ("c930a6f5-3b91-4726-afb7-db003b107785")
    @Override
    public Classifier getInternalOwner() {
        return (Classifier) getDepVal(BindableInstanceData.Metadata.InternalOwnerDep());
    }

    @objid ("089ccca1-c914-48bf-a3a3-9531c15db622")
    @Override
    public void setInternalOwner(Classifier value) {
        appendDepVal(BindableInstanceData.Metadata.InternalOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("e4548162-1d70-4730-8b65-1012e248916d")
    @Override
    public EList<Binding> getRepresentation() {
        return new SmList<>(this, BindableInstanceData.Metadata.RepresentationDep());
    }

    @objid ("90b3b5c5-05d8-4383-ac4c-abe7dc228845")
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

    @objid ("8d9dd656-ef9f-4b1b-9a45-f81a8ab54608")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(BindableInstanceData.Metadata.RepresentedFeatureDep());
    }

    @objid ("cdab0cce-425b-40a5-a20a-da6857f96321")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(BindableInstanceData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("12868c39-ede7-47c9-a53c-55ba7c49aadb")
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

    @objid ("44312d42-3d20-420d-b13e-dcbe896dd17a")
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

    @objid ("96e594fc-4e04-486b-be09-9dff528e0dab")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBindableInstance(this);
        else
          return null;
    }

}
