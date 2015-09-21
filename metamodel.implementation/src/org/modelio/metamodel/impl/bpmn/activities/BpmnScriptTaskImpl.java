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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnScriptTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnScriptTaskData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00822bd4-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnScriptTaskImpl extends BpmnTaskImpl implements BpmnScriptTask {
    @objid ("a8333402-aaa2-4f63-9512-cc0ff4bed92d")
    @Override
    public String getScriptLanguage() {
        return (String) getAttVal(((BpmnScriptTaskSmClass)getClassOf()).getScriptLanguageAtt());
    }

    @objid ("d44802d1-9137-4eef-b326-b3e0c4d42839")
    @Override
    public void setScriptLanguage(String value) {
        setAttVal(((BpmnScriptTaskSmClass)getClassOf()).getScriptLanguageAtt(), value);
    }

    @objid ("0255dd05-c9a4-4354-9a49-26687a86f804")
    @Override
    public String getScript() {
        return (String) getAttVal(((BpmnScriptTaskSmClass)getClassOf()).getScriptAtt());
    }

    @objid ("deaad119-20c2-4022-b716-da16ae284741")
    @Override
    public void setScript(String value) {
        setAttVal(((BpmnScriptTaskSmClass)getClassOf()).getScriptAtt(), value);
    }

    @objid ("9bcd4da1-2138-418f-95b6-b07d120a7f13")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a501baec-87db-4588-aa94-ff2e94aad5a0")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("030ad89c-ad49-431b-a189-75abcd43b67f")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnScriptTask(this);
        else
          return null;
    }

}
