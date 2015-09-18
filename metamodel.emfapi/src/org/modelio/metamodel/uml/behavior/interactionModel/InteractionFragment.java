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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("004713c8-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionFragment extends ModelElement {
    @objid ("adf5c3d8-a0c0-41b8-91b0-c236552b1772")
    int getLineNumber();

    @objid ("9c1af61d-f2af-40bc-b3b3-d49480d7db15")
    void setLineNumber(int value);

    @objid ("3be9558e-5a04-4eda-9e32-c4e6d331217d")
    InteractionOperand getEnclosingOperand();

    @objid ("712e7aef-b5d0-4b61-9bf2-8d0e1e4bdee6")
    void setEnclosingOperand(InteractionOperand value);

    @objid ("f4535798-343f-4b11-b6f4-0ceeb7ea5b9e")
    Interaction getEnclosingInteraction();

    @objid ("8c1cf469-2f6b-4710-aae4-4e54f18acad5")
    void setEnclosingInteraction(Interaction value);

    @objid ("d2d58d5a-afe8-4f38-a10a-17e0ed409d41")
    EList<Lifeline> getCovered();

    @objid ("114032e2-ba0b-4068-bcfa-ec4d522333fc")
    <T extends Lifeline> List<T> getCovered(java.lang.Class<T> filterClass);

}
