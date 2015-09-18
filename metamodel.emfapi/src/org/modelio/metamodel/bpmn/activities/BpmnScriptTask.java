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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("0082028a-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnScriptTask extends BpmnTask {
    @objid ("fd076afa-f79e-4752-973d-7bc428cd294f")
    String getScriptLanguage();

    @objid ("7c603b6b-9f9b-4279-897a-00ce40c986d4")
    void setScriptLanguage(String value);

    @objid ("a64efa1f-f375-4c04-879c-83af7abceb1c")
    String getScript();

    @objid ("55a0ed31-c7a1-41d6-91ed-ca031d684076")
    void setScript(String value);

}
