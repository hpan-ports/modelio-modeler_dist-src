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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataStore;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataStoreData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00041136-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataStoreImpl extends BpmnItemAwareElementImpl implements BpmnDataStore {
    @objid ("62cc0321-20da-47e2-bbf3-ccbc420bf7d9")
    @Override
    public int getCapacity() {
        return (Integer) getAttVal(BpmnDataStoreData.Metadata.CapacityAtt());
    }

    @objid ("e713f15e-d5a3-4fc2-b09b-e2d7d255a731")
    @Override
    public void setCapacity(int value) {
        setAttVal(BpmnDataStoreData.Metadata.CapacityAtt(), value);
    }

    @objid ("2a4ee648-6fc5-40e1-ae12-13346ca4eed0")
    @Override
    public boolean isIsUnlimited() {
        return (Boolean) getAttVal(BpmnDataStoreData.Metadata.IsUnlimitedAtt());
    }

    @objid ("065e273d-e28e-4f13-9960-83105358ade5")
    @Override
    public void setIsUnlimited(boolean value) {
        setAttVal(BpmnDataStoreData.Metadata.IsUnlimitedAtt(), value);
    }

    @objid ("9ccbf318-e177-47de-8265-b2d87434e122")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d614d56b-c6bb-4015-aafc-9a413ad437c9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("9582f498-b19d-429c-b328-2deff302295d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataStore(this);
        else
          return null;
    }

}
