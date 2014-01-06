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
import org.modelio.metamodel.data.uml.statik.BindingData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.NaryConnector;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000191ae-c4bf-1fd8-97fe-001ec947cd2a")
public class BindingImpl extends ModelElementImpl implements Binding {
    @objid ("54131299-01fb-4526-9d91-adc271422f2b")
    @Override
    public ConnectorEnd getConnectorEndRole() {
        return (ConnectorEnd) getDepVal(BindingData.Metadata.ConnectorEndRoleDep());
    }

    @objid ("6d693840-25d7-432f-b2db-f870163a8446")
    @Override
    public void setConnectorEndRole(ConnectorEnd value) {
        appendDepVal(BindingData.Metadata.ConnectorEndRoleDep(), (SmObjectImpl)value);
    }

    @objid ("9f09c8fe-8c76-4fd1-8725-e3f8f6e16582")
    @Override
    public NaryConnector getConnectorRole() {
        return (NaryConnector) getDepVal(BindingData.Metadata.ConnectorRoleDep());
    }

    @objid ("16653590-b809-4375-b2aa-a19fb0657e89")
    @Override
    public void setConnectorRole(NaryConnector value) {
        appendDepVal(BindingData.Metadata.ConnectorRoleDep(), (SmObjectImpl)value);
    }

    @objid ("35eb9776-fc69-41bb-a43b-0afa66e1b9ad")
    @Override
    public BindableInstance getRole() {
        return (BindableInstance) getDepVal(BindingData.Metadata.RoleDep());
    }

    @objid ("4a5fa1c4-4099-44ac-bad5-22f8eacfa0fb")
    @Override
    public void setRole(BindableInstance value) {
        appendDepVal(BindingData.Metadata.RoleDep(), (SmObjectImpl)value);
    }

    @objid ("bbbb786c-1326-4e91-b7b9-9bc32258edab")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(BindingData.Metadata.RepresentedFeatureDep());
    }

    @objid ("7dcc7366-7de9-4a33-8dcf-228f012d7b44")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(BindingData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("7f331b81-8d05-4d11-8c09-5ba965aefa3f")
    @Override
    public CollaborationUse getOwner() {
        return (CollaborationUse) getDepVal(BindingData.Metadata.OwnerDep());
    }

    @objid ("d5a79495-f4b6-4dfc-a1d3-e7af84970853")
    @Override
    public void setOwner(CollaborationUse value) {
        appendDepVal(BindingData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("7426b15f-da74-4d2a-9800-f200daf477a4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindingData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c6ea9af7-5908-406e-8e31-162081fd5349")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindingData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BindingData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("94b1d063-1f5a-4058-aca9-906b24bd1e2c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBinding(this);
        else
          return null;
    }

}
