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

@objid ("0033b2ec-c4bf-1fd8-97fe-001ec947cd2a")
public interface ForkJoinNode extends ControlNode {
    @objid ("40971517-5561-47ac-9527-97f616a7f8ca")
    boolean isIsCombineDuplicate();

    @objid ("3bd4b325-2c2b-4d34-8475-2917b5cf78f1")
    void setIsCombineDuplicate(boolean value);

    @objid ("c96eb35d-2187-41aa-857b-0820165d7080")
    String getJoinSpec();

    @objid ("07cde95e-48a4-40d9-a6fc-4534267cd307")
    void setJoinSpec(String value);

}
