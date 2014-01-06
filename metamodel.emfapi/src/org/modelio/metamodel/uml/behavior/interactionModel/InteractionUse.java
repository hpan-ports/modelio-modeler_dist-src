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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;

@objid ("00482c5e-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionUse extends InteractionFragment {
    @objid ("6243e1c7-97df-4564-bf66-e7d220398df2")
    int getEndLineNumber();

    @objid ("16b665e3-e1e1-45e0-ad4c-8ff3e4f1edc7")
    void setEndLineNumber(int value);

    @objid ("1c001827-0cbe-48dc-ad76-78f669d89e1d")
    EList<Gate> getActualGate();

    @objid ("f3094772-b276-4415-a6cb-784960737223")
    <T extends Gate> List<T> getActualGate(java.lang.Class<T> filterClass);

    @objid ("d59f57ff-58af-462a-92b6-e8069e432510")
    Interaction getRefersTo();

    @objid ("6d960d54-4c11-4a61-8d67-1a0cc53e1ef5")
    void setRefersTo(Interaction value);

}
