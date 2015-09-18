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
    @objid ("341ea510-4853-48c6-bbd6-14b605479c70")
    @Override
    public ConnectorEnd getConnectorEndRole() {
        return (ConnectorEnd) getDepVal(BindingData.Metadata.ConnectorEndRoleDep());
    }

    @objid ("2f8545fc-a831-4b42-8a45-a5d13916313c")
    @Override
    public void setConnectorEndRole(ConnectorEnd value) {
        appendDepVal(BindingData.Metadata.ConnectorEndRoleDep(), (SmObjectImpl)value);
    }

    @objid ("b29d3cc3-17d7-428f-a80c-a1f0003df48f")
    @Override
    public NaryConnector getConnectorRole() {
        return (NaryConnector) getDepVal(BindingData.Metadata.ConnectorRoleDep());
    }

    @objid ("c202a645-ec36-457d-beb2-710cade8d5ef")
    @Override
    public void setConnectorRole(NaryConnector value) {
        appendDepVal(BindingData.Metadata.ConnectorRoleDep(), (SmObjectImpl)value);
    }

    @objid ("411db4d0-7763-44b5-8c1c-69d71c38f12c")
    @Override
    public BindableInstance getRole() {
        return (BindableInstance) getDepVal(BindingData.Metadata.RoleDep());
    }

    @objid ("e164df97-50a2-4a9d-a1a2-875466bea722")
    @Override
    public void setRole(BindableInstance value) {
        appendDepVal(BindingData.Metadata.RoleDep(), (SmObjectImpl)value);
    }

    @objid ("c0fc5b80-d853-47d6-9f0c-76983c7e53f9")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(BindingData.Metadata.RepresentedFeatureDep());
    }

    @objid ("a88f75db-11ed-4345-896f-99cbd754aaf6")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(BindingData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("8980bcb2-d45e-49ef-b168-d593f805719d")
    @Override
    public CollaborationUse getOwner() {
        return (CollaborationUse) getDepVal(BindingData.Metadata.OwnerDep());
    }

    @objid ("74d44597-4c0e-4e17-a99a-bc9183ad3ba9")
    @Override
    public void setOwner(CollaborationUse value) {
        appendDepVal(BindingData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("bb6c5a4c-7fda-4b2b-96d9-a63eab6be309")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindingData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7ae9a58d-f1fa-4fcd-bce4-ce6e0da2da92")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindingData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BindingData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("9c58cbd5-2381-4baf-bd47-d101cef4c65d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBinding(this);
        else
          return null;
    }

}
