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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("00307956-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExceptionHandler extends ModelElement {
    @objid ("9b026ab5-9e05-48f1-a7d8-3ee9e5895020")
    String getGuard();

    @objid ("04df00e2-11ae-4338-9d80-c5f4a7d2099b")
    void setGuard(String value);

    @objid ("3b629ffb-a958-40a2-85a5-a3db33f46aba")
    String getWeight();

    @objid ("4dbab200-6da7-4bc3-bce0-d14ba50c2dc0")
    void setWeight(String value);

    @objid ("0bdb615c-5fff-4cf4-80b4-a36a3c64d354")
    ActivityAction getProtectedNode();

    @objid ("30f02884-5351-49aa-a3f1-ad4aceacf5c5")
    void setProtectedNode(ActivityAction value);

    @objid ("9005ae47-8399-43bd-99fc-e9db6e80f878")
    InputPin getExceptionInput();

    @objid ("58597bfb-47cc-4bf6-b3bf-7f34b640307b")
    void setExceptionInput(InputPin value);

    @objid ("b6010d7c-8b02-4f6c-99bc-93a05c83c50b")
    EList<GeneralClass> getExceptionType();

    @objid ("fd4545f3-8743-48ed-9a6d-3c3692758b9a")
    <T extends GeneralClass> List<T> getExceptionType(java.lang.Class<T> filterClass);

}
