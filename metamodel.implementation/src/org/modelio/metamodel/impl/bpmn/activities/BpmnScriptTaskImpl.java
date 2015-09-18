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
    @objid ("2d89ea7e-fb0b-4a2b-9acf-55b1eaf358f2")
    @Override
    public String getScriptLanguage() {
        return (String) getAttVal(BpmnScriptTaskData.Metadata.ScriptLanguageAtt());
    }

    @objid ("b72dda88-6832-47ad-98f7-3f4dcc4043ca")
    @Override
    public void setScriptLanguage(String value) {
        setAttVal(BpmnScriptTaskData.Metadata.ScriptLanguageAtt(), value);
    }

    @objid ("c7e7aa98-dca3-4f64-b84e-20d0b660dba3")
    @Override
    public String getScript() {
        return (String) getAttVal(BpmnScriptTaskData.Metadata.ScriptAtt());
    }

    @objid ("5e9b0ae8-4f41-411d-a29e-5b0afbb5e7a5")
    @Override
    public void setScript(String value) {
        setAttVal(BpmnScriptTaskData.Metadata.ScriptAtt(), value);
    }

    @objid ("33a84c75-c513-4b66-9b3e-65d4b54e2408")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("be4d0cfe-64ad-4336-a82d-a7d892fd9a39")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f160a029-a37f-4151-9996-ea1a8379d2b4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnScriptTask(this);
        else
          return null;
    }

}
