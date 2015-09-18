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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;

@objid ("002688d8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityAction extends ActivityNode {
    @objid ("e9bea070-012b-4e1d-9416-0ec3aa0b6573")
    boolean isIsMultipleInstance();

    @objid ("15bc603b-9cea-42ca-a4f2-a8e91f380d40")
    void setIsMultipleInstance(boolean value);

    @objid ("9effc5de-33b1-4df3-99c1-8aad26e400d6")
    boolean isIsCompensation();

    @objid ("01c7a2ad-978d-4679-a39f-82e91d955fcd")
    void setIsCompensation(boolean value);

    @objid ("909b9c3c-3c6e-4d3e-84e0-92984669a1e2")
    EList<OutputPin> getOutput();

    @objid ("57a56525-e047-4e22-96e3-39b50458bf1d")
    <T extends OutputPin> List<T> getOutput(java.lang.Class<T> filterClass);

    @objid ("e33c64d7-265a-4196-b48b-c84fdadce9bd")
    EList<InputPin> getInput();

    @objid ("38065dbc-935e-406f-89c1-4c4fa4f62bd2")
    <T extends InputPin> List<T> getInput(java.lang.Class<T> filterClass);

    @objid ("8dd42120-159f-4a41-8230-145efffd3ddc")
    EList<ExceptionHandler> getHandler();

    @objid ("25d50f9d-dede-4fe8-bb1d-a1ca02e97840")
    <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass);

}
