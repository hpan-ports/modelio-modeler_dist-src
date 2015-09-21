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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.events.BpmnLinkEventDefinition;
import org.modelio.metamodel.impl.bpmn.events.BpmnLinkEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00904a52-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnLinkEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnLinkEventDefinition {
    @objid ("d018492f-9ddf-4b25-a21e-c230739a1cbc")
    @Override
    public EList<BpmnLinkEventDefinition> getSource() {
        return new SmList<>(this, ((BpmnLinkEventDefinitionSmClass)getClassOf()).getSourceDep());
    }

    @objid ("92f1f543-218b-4441-85b8-3d216e5b89b9")
    @Override
    public <T extends BpmnLinkEventDefinition> List<T> getSource(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnLinkEventDefinition element : getSource()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("58268191-140d-404d-9703-edb067fa4d94")
    @Override
    public BpmnLinkEventDefinition getTarget() {
        Object obj = getDepVal(((BpmnLinkEventDefinitionSmClass)getClassOf()).getTargetDep());
        return (obj instanceof BpmnLinkEventDefinition)? (BpmnLinkEventDefinition)obj : null;
    }

    @objid ("1ba26846-9f99-4047-a2aa-70ce9fc67a48")
    @Override
    public void setTarget(BpmnLinkEventDefinition value) {
        appendDepVal(((BpmnLinkEventDefinitionSmClass)getClassOf()).getTargetDep(), (SmObjectImpl)value);
    }

    @objid ("9ba74300-582a-41f3-8524-734454f5cda6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("5e36c7ee-aa13-461a-b5a2-3b902e96a1b1")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("3b164bfd-d582-45f7-9cd6-70e6fe8a6d39")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLinkEventDefinition(this);
        else
          return null;
    }

}
