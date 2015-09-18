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

@objid ("00839f78-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnStandardLoopCharacteristics extends BpmnLoopCharacteristics {
    @objid ("f946ef6c-833c-422e-b34c-001560739642")
    boolean isTestBefore();

    @objid ("77916b70-a79e-46ee-b3be-ee76b6a80846")
    void setTestBefore(boolean value);

    @objid ("1496e64d-4a41-4ea7-a5a8-f002ec6aa075")
    String getLoopCondition();

    @objid ("d7192093-27ee-4d6e-9f18-55d383662669")
    void setLoopCondition(String value);

    @objid ("6d73ca68-e093-4ebe-a081-b96617f04d1c")
    String getLoopMaximum();

    @objid ("49e3aae8-b2d0-4c33-a322-a310863132b2")
    void setLoopMaximum(String value);

}
