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
import org.modelio.metamodel.impl.uml.statik.BindingData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000191ae-c4bf-1fd8-97fe-001ec947cd2a")
public class BindingImpl extends ModelElementImpl implements Binding {
    @objid ("bf5ab0e2-8346-46f5-a24b-1ab09930bd00")
    @Override
    public ConnectorEnd getConnectorEndRole() {
        Object obj = getDepVal(((BindingSmClass)getClassOf()).getConnectorEndRoleDep());
        return (obj instanceof ConnectorEnd)? (ConnectorEnd)obj : null;
    }

    @objid ("93731d2d-5f4b-45d9-bf0f-08054496e2b0")
    @Override
    public void setConnectorEndRole(ConnectorEnd value) {
        appendDepVal(((BindingSmClass)getClassOf()).getConnectorEndRoleDep(), (SmObjectImpl)value);
    }

    @objid ("2b252618-820d-482a-97e2-e0c6ca3080c1")
    @Override
    public NaryConnector getConnectorRole() {
        Object obj = getDepVal(((BindingSmClass)getClassOf()).getConnectorRoleDep());
        return (obj instanceof NaryConnector)? (NaryConnector)obj : null;
    }

    @objid ("f92f47f5-d291-40ed-96a9-86f73f54e4aa")
    @Override
    public void setConnectorRole(NaryConnector value) {
        appendDepVal(((BindingSmClass)getClassOf()).getConnectorRoleDep(), (SmObjectImpl)value);
    }

    @objid ("a595e746-fccc-4d22-80ba-af2e96e016cf")
    @Override
    public BindableInstance getRole() {
        Object obj = getDepVal(((BindingSmClass)getClassOf()).getRoleDep());
        return (obj instanceof BindableInstance)? (BindableInstance)obj : null;
    }

    @objid ("864e76be-6b52-4987-bbe5-54043f93e664")
    @Override
    public void setRole(BindableInstance value) {
        appendDepVal(((BindingSmClass)getClassOf()).getRoleDep(), (SmObjectImpl)value);
    }

    @objid ("a1851fad-b502-4602-ad38-865bf31028db")
    @Override
    public ModelElement getRepresentedFeature() {
        Object obj = getDepVal(((BindingSmClass)getClassOf()).getRepresentedFeatureDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("8ee854eb-0c44-4505-9077-1fe510aec407")
    @Override
    public void setRepresentedFeature(ModelElement value) {
        appendDepVal(((BindingSmClass)getClassOf()).getRepresentedFeatureDep(), (SmObjectImpl)value);
    }

    @objid ("86407f13-59c6-4565-af8e-3e1636398718")
    @Override
    public CollaborationUse getOwner() {
        Object obj = getDepVal(((BindingSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof CollaborationUse)? (CollaborationUse)obj : null;
    }

    @objid ("b7f25e61-dadc-4f6b-8bcd-9f9506f47f6c")
    @Override
    public void setOwner(CollaborationUse value) {
        appendDepVal(((BindingSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("59748c76-4851-4acf-8e79-49845cd1ba1d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((BindingSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("15630851-43ec-4396-b5b4-e054699b06b6")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((BindingSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("fa12e170-0d1e-48b1-8674-c44568f6c749")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBinding(this);
        else
          return null;
    }

}
