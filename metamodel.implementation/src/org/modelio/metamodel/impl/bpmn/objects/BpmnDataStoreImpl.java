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
    @objid ("2c0692bf-fe54-47b2-8673-c6ceb328b5e2")
    @Override
    public int getCapacity() {
        return (Integer) getAttVal(BpmnDataStoreData.Metadata.CapacityAtt());
    }

    @objid ("dfa63dbb-a4dd-4195-a732-1ed039edcb84")
    @Override
    public void setCapacity(int value) {
        setAttVal(BpmnDataStoreData.Metadata.CapacityAtt(), value);
    }

    @objid ("e754ef93-436a-4621-83db-1b8e641286e9")
    @Override
    public boolean isIsUnlimited() {
        return (Boolean) getAttVal(BpmnDataStoreData.Metadata.IsUnlimitedAtt());
    }

    @objid ("0ebae6da-44a7-4d5a-b488-6fc426fd51fe")
    @Override
    public void setIsUnlimited(boolean value) {
        setAttVal(BpmnDataStoreData.Metadata.IsUnlimitedAtt(), value);
    }

    @objid ("5b08dcb3-b133-44ec-b44d-bf9f217ab93b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("09f2d50a-8253-46d9-9921-cb99c603fb9a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("164e7eb4-82e6-4026-a434-34244edb1e7a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataStore(this);
        else
          return null;
    }

}
