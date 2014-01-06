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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("00839f78-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnStandardLoopCharacteristics extends BpmnLoopCharacteristics {
    @objid ("c6ad1f94-cf39-4346-8d1a-42a9775fc4b8")
    boolean isTestBefore();

    @objid ("e4a54072-343c-4c92-b3c7-5c24b18cde59")
    void setTestBefore(boolean value);

    @objid ("f059f59d-2385-499f-b90e-2c15223404ac")
    String getLoopCondition();

    @objid ("7ef94625-7383-4ff7-8918-5bc57096a0bc")
    void setLoopCondition(String value);

    @objid ("8638fd3f-7acb-4acf-9488-eb6b7a8b23a0")
    String getLoopMaximum();

    @objid ("2cdd349f-a020-45bd-9ed9-598f182d410a")
    void setLoopMaximum(String value);

}
