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
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("004713c8-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionFragment extends ModelElement {
    @objid ("421d7ea5-bb4b-4725-be16-e58aa3e363e6")
    int getLineNumber();

    @objid ("03ce4a9a-8148-408e-8e90-438faa371f2f")
    void setLineNumber(int value);

    @objid ("13590b27-4443-479e-8ff9-f660cc7a4817")
    InteractionOperand getEnclosingOperand();

    @objid ("1ca7404a-7fe0-43b4-a4e7-6c3c3e2905f8")
    void setEnclosingOperand(InteractionOperand value);

    @objid ("f36f7e0c-f9e5-403d-a7f9-f192b7050c96")
    Interaction getEnclosingInteraction();

    @objid ("1a26f7e5-c0d1-473a-b303-9751a34e7714")
    void setEnclosingInteraction(Interaction value);

    @objid ("0843d29c-b969-461f-a8b6-6c22c55494e6")
    EList<Lifeline> getCovered();

    @objid ("c45be727-b2a8-455f-9358-2d4b443cd26a")
    <T extends Lifeline> List<T> getCovered(java.lang.Class<T> filterClass);

}
