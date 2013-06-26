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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnScriptTask;
import org.modelio.metamodel.data.bpmn.activities.BpmnScriptTaskData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00822bd4-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnScriptTaskImpl extends BpmnTaskImpl implements BpmnScriptTask {
    @objid ("61b5e884-b9d3-48fd-b9d9-934157e1efc7")
    @Override
    public String getScriptLanguage() {
        return (String) getAttVal(BpmnScriptTaskData.Metadata.ScriptLanguageAtt());
    }

    @objid ("4dbe3e91-0ace-47d9-a866-d76abac381d4")
    @Override
    public void setScriptLanguage(String value) {
        setAttVal(BpmnScriptTaskData.Metadata.ScriptLanguageAtt(), value);
    }

    @objid ("4bcebd02-fed1-41ff-b523-4730310ea4bd")
    @Override
    public String getScript() {
        return (String) getAttVal(BpmnScriptTaskData.Metadata.ScriptAtt());
    }

    @objid ("956979dc-d824-4e29-bceb-e0084cc385e4")
    @Override
    public void setScript(String value) {
        setAttVal(BpmnScriptTaskData.Metadata.ScriptAtt(), value);
    }

    @objid ("9a5633d9-0fd3-4344-9dc1-388e0319bc78")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e7a42c01-794b-43f6-9a32-c50ff3395098")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("a52dfa89-a49c-4533-a537-26e5aef28da4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnScriptTask(this);
        else
          return null;
    }

}
