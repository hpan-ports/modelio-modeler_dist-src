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

@objid ("00839f78-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnStandardLoopCharacteristics extends BpmnLoopCharacteristics {
    @objid ("f3954283-0e1b-4901-a33c-0c0d2f936406")
    boolean isTestBefore();

    @objid ("96def958-5d34-4d18-825d-62f655d3e467")
    void setTestBefore(boolean value);

    @objid ("d535bbc9-5236-4a24-aca9-6751194fd412")
    String getLoopCondition();

    @objid ("1a844e65-216b-4548-b3c0-eea44a6130d5")
    void setLoopCondition(String value);

    @objid ("7fa23435-9992-41f3-b1cc-4eefeb05cc6b")
    String getLoopMaximum();

    @objid ("f97d3505-5af3-45b3-a14f-762d06f68c24")
    void setLoopMaximum(String value);

}
