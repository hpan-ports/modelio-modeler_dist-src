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
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;

@objid ("003503ea-c4bf-1fd8-97fe-001ec947cd2a")
public interface InputPin extends Pin {
    @objid ("9881c27c-5896-4a1c-b690-7f0945883848")
    boolean isIsSelf();

    @objid ("9a40c864-fdea-4338-9169-4bfdaaab6bc7")
    void setIsSelf(boolean value);

    @objid ("55d855bc-ecfe-449c-9f57-928d54815381")
    EList<ExceptionHandler> getHandler();

    @objid ("5e7365c0-60cc-4145-8903-e33f75ab4e1b")
    <T extends ExceptionHandler> List<T> getHandler(java.lang.Class<T> filterClass);

    @objid ("c2261858-8bc0-4826-9b41-b324dc05ead2")
    ActivityAction getInputing();

    @objid ("891a8fac-d6c7-43ec-a465-cfc92d839f56")
    void setInputing(ActivityAction value);

}
