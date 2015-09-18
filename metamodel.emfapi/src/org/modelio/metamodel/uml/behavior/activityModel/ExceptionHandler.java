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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("00307956-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExceptionHandler extends ModelElement {
    @objid ("867ebcfc-de33-4af3-b5fd-6c47486a20e4")
    String getGuard();

    @objid ("90371590-7a5d-4951-b045-b7c883fc82ea")
    void setGuard(String value);

    @objid ("3ec7f92c-e503-4292-8606-cf8fb21d1f71")
    String getWeight();

    @objid ("18b60a12-9d46-4a39-89ec-1e865dbad45d")
    void setWeight(String value);

    @objid ("13d5341c-4b61-4a87-899c-2e2f3f358aee")
    ActivityAction getProtectedNode();

    @objid ("ddb34233-cc43-4ec8-b47f-4c19ef2cf2cf")
    void setProtectedNode(ActivityAction value);

    @objid ("a3f2d1b6-a4a1-44f2-91a2-ce75f73be41a")
    InputPin getExceptionInput();

    @objid ("d9b0a276-16aa-4aa6-8857-b1d84ff50909")
    void setExceptionInput(InputPin value);

    @objid ("764467d9-9114-4930-825c-e442be78065f")
    EList<GeneralClass> getExceptionType();

    @objid ("115223c5-715b-42f5-b00e-dc40b76a1bb6")
    <T extends GeneralClass> List<T> getExceptionType(java.lang.Class<T> filterClass);

}
