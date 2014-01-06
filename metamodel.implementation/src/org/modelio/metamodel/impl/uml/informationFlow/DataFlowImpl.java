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
    @objid ("008d7d61-b1fb-4ff7-9e6b-ee9f3c9d2815")
    @Override
    public NameSpace getDestination() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.DestinationDep());
    }

    @objid ("cfdac2a3-60d2-4141-8cc3-3190a304319c")
    @Override
    public void setDestination(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.DestinationDep(), (SmObjectImpl)value);
    }

    @objid ("446509bb-cb10-42da-8ae7-c91e90ac4e99")
    @Override
    public NameSpace getOrigin() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.OriginDep());
    }

    @objid ("2dca8c15-f22f-41f3-9b05-18d8a401968e")
    @Override
    public void setOrigin(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("9dd325a0-806e-4b31-9d7c-3527b66c98d0")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.OwnerDep());
    }

    @objid ("c0672ed6-c411-453b-9b90-663777138ca7")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("e10b2fe9-1c92-4b83-8425-053139a836ce")
    @Override
    public Signal getSModel() {
        return (Signal) getDepVal(DataFlowData.Metadata.SModelDep());
    }

    @objid ("49d3533f-9713-45c9-ae99-0c2e4c40b2de")
    @Override
    public void setSModel(Signal value) {
        appendDepVal(DataFlowData.Metadata.SModelDep(), (SmObjectImpl)value);
    }

    @objid ("48acf0d8-8bd6-4363-bed0-aa63c514ef35")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DataFlowData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("18904979-c93b-4c41-8ad6-24aea0aaebbd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DataFlowData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(DataFlowData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c914bed1-9d55-4621-b404-3792c9eb162e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDataFlow(this);
        else
          return null;
    }

}
