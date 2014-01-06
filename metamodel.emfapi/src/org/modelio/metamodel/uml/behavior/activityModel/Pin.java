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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("003b6582-c4bf-1fd8-97fe-001ec947cd2a")
public interface Pin extends ObjectNode {
    @objid ("69a6de26-294a-4368-8d71-f1b3d536e9d9")
    boolean isIsControl();

    @objid ("60b70207-21e5-4721-83c3-76e391e27e71")
    void setIsControl(boolean value);

    @objid ("b3df3228-5654-4bf8-b99d-29669ef7ba15")
    boolean isIsExpansion();

    @objid ("302883aa-267c-422c-844c-c51cc6858268")
    void setIsExpansion(boolean value);

    @objid ("e14e5f48-42f7-4a5c-9916-17a25b42f3b1")
    Parameter getMatched();

    @objid ("068138cb-7d1f-42de-8f41-6f2dab9662c1")
    void setMatched(Parameter value);

}
