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
package org.modelio.metamodel.impl.uml.informationFlow;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.informationFlow.DataFlowData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00648264-c4bf-1fd8-97fe-001ec947cd2a")
public class DataFlowImpl extends ModelElementImpl implements DataFlow {
    @objid ("d6c006c1-bec8-4f7c-b1b6-72928d24a1bf")
    @Override
    public NameSpace getDestination() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.DestinationDep());
    }

    @objid ("fac885d1-e3f5-4347-87d2-8182fe04157b")
    @Override
    public void setDestination(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.DestinationDep(), (SmObjectImpl)value);
    }

    @objid ("9fa576ca-b0c4-4b6d-9959-b73dbd2b94d6")
    @Override
    public NameSpace getOrigin() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.OriginDep());
    }

    @objid ("cac8f91a-31c3-40b4-aedd-c5ca444e1ae8")
    @Override
    public void setOrigin(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("51fdedb2-9e28-47da-a743-821aaab4b0b7")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.OwnerDep());
    }

    @objid ("d274ba8f-5c3e-49ce-a148-c7a66e880195")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("f41fb595-3c45-4b74-9ed4-17357cdf8748")
    @Override
    public Signal getSModel() {
        return (Signal) getDepVal(DataFlowData.Metadata.SModelDep());
    }

    @objid ("ab7994be-3034-4b3f-ae11-d3bafec0dbc1")
    @Override
    public void setSModel(Signal value) {
        appendDepVal(DataFlowData.Metadata.SModelDep(), (SmObjectImpl)value);
    }

    @objid ("38384e2e-2d91-41bc-b802-3a228f4352fe")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DataFlowData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("13a42cf6-8d09-4bc7-9999-8790d528ff08")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DataFlowData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(DataFlowData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("46bcca2e-3d76-4071-97c8-0164ae72376c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDataFlow(this);
        else
          return null;
    }

}
