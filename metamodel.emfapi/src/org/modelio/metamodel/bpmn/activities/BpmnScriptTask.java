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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("0082028a-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnScriptTask extends BpmnTask {
    @objid ("19b6a358-0fae-4921-9791-46bee15d4db0")
    String getScriptLanguage();

    @objid ("98c8a88d-4778-418d-bf04-3a10e76f7c55")
    void setScriptLanguage(String value);

    @objid ("3994d582-966a-43cd-b80e-3d0c699c4066")
    String getScript();

    @objid ("27fa26e4-53fc-4cd0-8a78-8632d741c064")
    void setScript(String value);

}
