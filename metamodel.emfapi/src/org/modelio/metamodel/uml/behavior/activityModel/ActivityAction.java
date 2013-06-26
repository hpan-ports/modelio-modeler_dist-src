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
    @objid ("600b64a5-a111-4637-b159-7d66cde7fbe4")
    boolean isIsMultipleInstance();

    @objid ("d1cf1c2c-025c-43bc-9d41-792a948ad06c")
    void setIsMultipleInstance(boolean value);

    @objid ("2a2d4745-235b-4674-a140-f08ed8b0fa4c")
    boolean isIsCompensation();

    @objid ("06bcd925-e754-4b9e-a4be-4ff02070aa1c")
    void setIsCompensation(boolean value);

    @objid ("4a8cd628-c070-44c0-9e54-e7f8d861d4a6")
    EList<OutputPin> getOutput();

    @objid ("84493e14-92bf-4a5b-815b-cf22ea356a5d")
    <T extends OutputPin> List<T> getOutput(java.lang.Class<T> filterClass);

    @objid ("b8c3d88d-90ae-444f-b190-47d40285d5c7")
    EList<InputPin> getInput();

    @objid ("21669fd1-92b6-46a4-872a-0d1a8fa201dc")
    <T extends InputPin> List<T> getInput(java.lang.Class<T> filterClass);

    @objid ("11b846b7-90e0-4924-8a6f-8df6bc3073e1")
    EList<ExceptionHandler> getHandler();

    @objid ("b8adf2f5-cd59-4e35-bd99-7492d0fdb05a")
    <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass);

}
