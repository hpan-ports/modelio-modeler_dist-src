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
    @objid ("9e424d88-4aab-4f87-979a-5c70a9677f10")
    @Override
    public String getScriptLanguage() {
        return (String) getAttVal(BpmnScriptTaskData.Metadata.ScriptLanguageAtt());
    }

    @objid ("a9c8f4c8-4237-48d2-aa61-9513d6caa9f6")
    @Override
    public void setScriptLanguage(String value) {
        setAttVal(BpmnScriptTaskData.Metadata.ScriptLanguageAtt(), value);
    }

    @objid ("eda37c5d-08ed-4e9f-8c46-f2a24f9d97e8")
    @Override
    public String getScript() {
        return (String) getAttVal(BpmnScriptTaskData.Metadata.ScriptAtt());
    }

    @objid ("e4d24471-ac10-467b-a2db-8527de0abfe6")
    @Override
    public void setScript(String value) {
        setAttVal(BpmnScriptTaskData.Metadata.ScriptAtt(), value);
    }

    @objid ("72e84b6e-f2e5-4eb6-b811-b83df722dca7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("01b3adcf-a67f-478e-b19d-fbf53297a87d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1b67f275-fa73-44ce-8786-dcf2b18e18ca")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnScriptTask(this);
        else
          return null;
    }

}
