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
    @objid ("4773349e-feb8-46e2-85b2-ce4da56b0fa2")
    @Override
    public ConnectorEnd getConnectorEndRole() {
        return (ConnectorEnd) getDepVal(BindingData.Metadata.ConnectorEndRoleDep());
    }

    @objid ("633b54d5-d399-437a-a4b1-1e321fc545ba")
    @Override
    public void setConnectorEndRole(ConnectorEnd value) {
        appendDepVal(BindingData.Metadata.ConnectorEndRoleDep(), (SmObjectImpl)value);
    }

    @objid ("d74c6b8b-21b8-47d2-ab24-1c9368522175")
    @Override
    public NaryConnector getConnectorRole() {
        return (NaryConnector) getDepVal(BindingData.Metadata.ConnectorRoleDep());
    }

    @objid ("b8b92e38-62d7-4de6-8db3-a650a4bf8e36")
    @Override
    public void setConnectorRole(NaryConnector value) {
        appendDepVal(BindingData.Metadata.ConnectorRoleDep(), (SmObjectImpl)value);
    }

    @objid ("c353b6c3-fe06-4a6d-aa61-48ca43fe2765")
    @Override
    public BindableInstance getRole() {
        return (BindableInstance) getDepVal(BindingData.Metadata.RoleDep());
    }

    @objid ("4614cf5e-3e7b-4265-b2fb-2d43a3aced28")
    @Override
    public void setRole(BindableInstance value) {
        appendDepVal(BindingData.Metadata.RoleDep(), (SmObjectImpl)value);
    }

    @objid ("e704455f-3b52-4ca5-9af0-34f0611c0ae4")
    @Override
    public ModelElement getRepresentedFeature() {
        return (ModelElement) getDepVal(BindingData.Metadata.RepresentedFeatureDep());
    }

    @objid ("7aa1890c-b795-4a57-86ec-ca0b6a08cda8")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(BindingData.Metadata.RepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("9bea30b5-4ed2-4890-824f-5cebe85844ae")
    @Override
    public CollaborationUse getOwner() {
        return (CollaborationUse) getDepVal(BindingData.Metadata.OwnerDep());
    }

    @objid ("e2c6b946-3c51-40cf-b8d8-d8e76af5d535")
    @Override
    public void setOwner(CollaborationUse value) {
        appendDepVal(BindingData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("56894715-f013-44c4-b47f-628d236a9a1e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindingData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("efb6aa9c-e242-46dd-90b4-799193b569f4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BindingData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BindingData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("40a066ad-cc5a-4553-a99f-12cd5e88c346")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBinding(this);
        else
          return null;
    }

}
