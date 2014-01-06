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
    @objid ("b9523c5b-312c-4cf2-a517-36bbcdc7a2ee")
    @Override
    public int getCapacity() {
        return (Integer) getAttVal(BpmnDataStoreData.Metadata.CapacityAtt());
    }

    @objid ("903ee7bb-352c-4733-be0f-2e926b90f5de")
    @Override
    public void setCapacity(int value) {
        setAttVal(BpmnDataStoreData.Metadata.CapacityAtt(), value);
    }

    @objid ("7989c0ad-405a-46e4-b3dc-36ebb05560e8")
    @Override
    public boolean isIsUnlimited() {
        return (Boolean) getAttVal(BpmnDataStoreData.Metadata.IsUnlimitedAtt());
    }

    @objid ("ebc45e64-dee3-490a-8b17-802e7207e8f6")
    @Override
    public void setIsUnlimited(boolean value) {
        setAttVal(BpmnDataStoreData.Metadata.IsUnlimitedAtt(), value);
    }

    @objid ("99305452-9703-45f3-9e94-87aca444bb58")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("73cc8a07-102c-42d3-8d3c-0009b7111139")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("7f761128-ff03-4f06-915d-a64ef104f0c2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataStore(this);
        else
          return null;
    }

}
