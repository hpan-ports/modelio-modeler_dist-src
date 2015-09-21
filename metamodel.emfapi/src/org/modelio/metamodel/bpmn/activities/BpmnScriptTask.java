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


/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * BpmnScriptTask v0.0.9054
 * 
 * 
 * A Script Task is executed by a business process engine. The modeler or implementer defines a script in a language that the engine can interpret. When the Task is ready to start, the engine will execute the script. When the script is completed, the Task will also be completed.
 */
@objid ("0082028a-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnScriptTask extends BpmnTask {
    @objid ("17ce8e9c-dc52-468f-9eae-49c5bd878c6a")
    public static final String MNAME = "BpmnScriptTask";

    /**
     * Getter for attribute 'BpmnScriptTask.ScriptLanguage'
     * 
     * Metamodel description:
     * <i>Defines the script language. The script language MUST be provided if a
     * script is provided.</i>
     */
    @objid ("824ca527-395c-4f80-9f46-83911d55c795")
    String getScriptLanguage();

    /**
     * Setter for attribute 'BpmnScriptTask.ScriptLanguage'
     * 
     * Metamodel description:
     * <i>Defines the script language. The script language MUST be provided if a
     * script is provided.</i>
     */
    @objid ("1bafd144-2dd2-4787-be61-e6769f55cbe4")
    void setScriptLanguage(String value);

    /**
     * Getter for attribute 'BpmnScriptTask.Script'
     * 
     * Metamodel description:
     * <i>The modeler MAY include a script that can be run when the Task is performed.
     * If a script is not included, then the Task will act as the equivalent of an Abstract Task</i>
     */
    @objid ("2cc7d4ab-29f9-4d51-b112-9aeca8e45609")
    String getScript();

    /**
     * Setter for attribute 'BpmnScriptTask.Script'
     * 
     * Metamodel description:
     * <i>The modeler MAY include a script that can be run when the Task is performed.
     * If a script is not included, then the Task will act as the equivalent of an Abstract Task</i>
     */
    @objid ("716313b6-c4d9-4b35-9532-b1f7c74f9a29")
    void setScript(String value);

}
