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
    @objid ("250b02bb-156b-44e9-a79b-efbb6f1fc747")
    boolean isIsMultipleInstance();

    @objid ("19dbd748-ddc2-42e3-ad84-fcca20091f15")
    void setIsMultipleInstance(boolean value);

    @objid ("00ec6854-e2e2-4c41-93f6-37b295fab7d4")
    boolean isIsCompensation();

    @objid ("c42a7a5d-aa5b-47ea-9768-3ac2879449f0")
    void setIsCompensation(boolean value);

    @objid ("b4ba5098-ce9c-4b46-a945-9f88d5874c6a")
    EList<OutputPin> getOutput();

    @objid ("df1810eb-8aab-4e05-abe7-5ef2b56c808d")
    <T extends OutputPin> List<T> getOutput(java.lang.Class<T> filterClass);

    @objid ("2e823faf-7b22-427e-afe7-a2b6159e284a")
    EList<InputPin> getInput();

    @objid ("ec438b6b-0d1d-42ed-9cb7-f043daa519f4")
    <T extends InputPin> List<T> getInput(java.lang.Class<T> filterClass);

    @objid ("1ed5425c-7eec-4c0b-811c-7a0d7b895d0d")
    EList<ExceptionHandler> getHandler();

    @objid ("4c12da7c-e7a8-4444-850a-2ba07fbcfdf6")
    <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass);

}
