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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.events.BpmnTimerEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnTimerEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00969aa6-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnTimerEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnTimerEventDefinition {
    @objid ("fe5d3699-7257-4ac0-b502-483bcfb249b2")
    @Override
    public String getTimeCycle() {
        return (String) getAttVal(((BpmnTimerEventDefinitionSmClass)getClassOf()).getTimeCycleAtt());
    }

    @objid ("b1bdc080-ca48-44ff-aacc-8770c9b25ce4")
    @Override
    public void setTimeCycle(String value) {
        setAttVal(((BpmnTimerEventDefinitionSmClass)getClassOf()).getTimeCycleAtt(), value);
    }

    @objid ("c12bff0d-561d-4a1e-9609-3ba47a1ab179")
    @Override
    public String getTimeD() {
        return (String) getAttVal(((BpmnTimerEventDefinitionSmClass)getClassOf()).getTimeDAtt());
    }

    @objid ("75cef023-f841-4d2a-880a-1388535cc6d9")
    @Override
    public void setTimeD(String value) {
        setAttVal(((BpmnTimerEventDefinitionSmClass)getClassOf()).getTimeDAtt(), value);
    }

    @objid ("3d87b587-44c3-4026-80cb-68ebbb5d802f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bb9f64e4-9020-488f-9fa1-f066317907ea")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("de959b62-5b69-445d-b6ee-d4e556d658f4")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTimerEventDefinition(this);
        else
          return null;
    }

}
