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
    @objid ("05df4880-1467-49db-8283-5b88fcb50972")
    @Override
    public NameSpace getDestination() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.DestinationDep());
    }

    @objid ("0184a5ce-f219-4603-9773-9c211f6c552f")
    @Override
    public void setDestination(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.DestinationDep(), (SmObjectImpl)value);
    }

    @objid ("6d42eb2a-4b79-41b6-9f2e-197f246765c7")
    @Override
    public NameSpace getOrigin() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.OriginDep());
    }

    @objid ("52ff1702-0b74-46c3-a6cb-a368c2250d32")
    @Override
    public void setOrigin(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.OriginDep(), (SmObjectImpl)value);
    }

    @objid ("e0e6c8fe-f897-4072-9803-9e7437ea71b2")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(DataFlowData.Metadata.OwnerDep());
    }

    @objid ("a9d39c0c-6d16-4cf3-893b-d4882d373f79")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(DataFlowData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("226b396b-3711-4887-b313-639dcff65627")
    @Override
    public Signal getSModel() {
        return (Signal) getDepVal(DataFlowData.Metadata.SModelDep());
    }

    @objid ("d3dab4d8-5a8b-4363-9c1a-bf00e0d9fd8a")
    @Override
    public void setSModel(Signal value) {
        appendDepVal(DataFlowData.Metadata.SModelDep(), (SmObjectImpl)value);
    }

    @objid ("68b7967d-6e25-43c5-8117-30b9f9bae217")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DataFlowData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("68a905a6-3554-4647-9e9a-30ab9de7d03e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(DataFlowData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(DataFlowData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f250c716-032e-48c3-b285-ed6103d4fedb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitDataFlow(this);
        else
          return null;
    }

}
