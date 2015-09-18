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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("003b6582-c4bf-1fd8-97fe-001ec947cd2a")
public interface Pin extends ObjectNode {
    @objid ("22fba80a-9c1d-42fd-9a75-1ed718e69328")
    boolean isIsControl();

    @objid ("aaff3056-58b1-45e1-a2e8-9537801bf425")
    void setIsControl(boolean value);

    @objid ("f67be29c-f575-415f-ae3f-7b18ba1431c5")
    boolean isIsExpansion();

    @objid ("4ea698fe-f67b-456a-a7da-4e939e4e01c3")
    void setIsExpansion(boolean value);

    @objid ("499b5e37-dd61-4d4d-ab0a-ab078e7e6a25")
    Parameter getMatched();

    @objid ("87fe9688-1923-43b0-ab10-41d626afe3fd")
    void setMatched(Parameter value);

}
