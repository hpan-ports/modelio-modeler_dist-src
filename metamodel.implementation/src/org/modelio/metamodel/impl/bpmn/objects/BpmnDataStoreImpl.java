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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataStore;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataStoreData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00041136-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataStoreImpl extends BpmnItemAwareElementImpl implements BpmnDataStore {
    @objid ("dc482514-86b2-4803-b48b-b5b129b99c7a")
    @Override
    public int getCapacity() {
        return (Integer) getAttVal(((BpmnDataStoreSmClass)getClassOf()).getCapacityAtt());
    }

    @objid ("f093efc1-66c6-4483-b534-f110ac59db05")
    @Override
    public void setCapacity(int value) {
        setAttVal(((BpmnDataStoreSmClass)getClassOf()).getCapacityAtt(), value);
    }

    @objid ("8a28dd44-3f7a-4a92-8450-3137754fbe3b")
    @Override
    public boolean isIsUnlimited() {
        return (Boolean) getAttVal(((BpmnDataStoreSmClass)getClassOf()).getIsUnlimitedAtt());
    }

    @objid ("94c08aba-de3c-4692-8b9f-bf9fa2c0a476")
    @Override
    public void setIsUnlimited(boolean value) {
        setAttVal(((BpmnDataStoreSmClass)getClassOf()).getIsUnlimitedAtt(), value);
    }

    @objid ("a6be0f60-144a-4e5a-ad79-f8ad29b1b304")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("59504890-a394-4790-beaa-eba895dd7768")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("c21a9cf3-9565-4472-b9f7-bee61fb6d076")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataStore(this);
        else
          return null;
    }

}
