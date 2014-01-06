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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("00307956-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExceptionHandler extends ModelElement {
    @objid ("e5135b25-795c-4322-8132-a5f4b330ba32")
    String getGuard();

    @objid ("5c638b1b-64e4-4d1a-9e13-9a189e644e02")
    void setGuard(String value);

    @objid ("58a2de97-a62c-4e80-a289-f59d7a34ce34")
    String getWeight();

    @objid ("52307cb5-37a7-4847-90bb-bffaf5a89606")
    void setWeight(String value);

    @objid ("a99127db-c06d-4a7a-b3ea-5c6e445b0b29")
    ActivityAction getProtectedNode();

    @objid ("281d7fe0-9f29-4795-ab1a-c7728d6a4384")
    void setProtectedNode(ActivityAction value);

    @objid ("c853a4e1-c077-4a41-bc5a-a10dcf684b0b")
    InputPin getExceptionInput();

    @objid ("5ffe6dd4-29e4-4386-b8f3-081a872a2132")
    void setExceptionInput(InputPin value);

    @objid ("09f35cce-c27b-4b60-beb5-844a7110263a")
    EList<GeneralClass> getExceptionType();

    @objid ("73e4ede4-a448-4b92-b4a7-175ecc216268")
    <T extends GeneralClass> List<T> getExceptionType(java.lang.Class<T> filterClass);

}
