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
    @objid ("65af9819-4edb-47ce-a34c-1b2c34343fb1")
    int getLineNumber();

    @objid ("fd4b716c-45a8-4371-b3e6-6c4a30c35d72")
    void setLineNumber(int value);

    @objid ("754f0086-8dc8-4ede-9f25-287defb67c72")
    InteractionOperand getEnclosingOperand();

    @objid ("8df8b93d-1241-44c0-b18d-e42b691565f5")
    void setEnclosingOperand(InteractionOperand value);

    @objid ("0f36f8a8-3808-4a4f-a7cb-8e2608a6f1a6")
    Interaction getEnclosingInteraction();

    @objid ("1c89fb5e-1296-4eb3-89b9-a489c69bde31")
    void setEnclosingInteraction(Interaction value);

    @objid ("50f83166-115d-44be-b579-68357e5cfb29")
    EList<Lifeline> getCovered();

    @objid ("4bec7790-89f3-43c3-92cf-d69a4dbdb09f")
    <T extends Lifeline> List<T> getCovered(java.lang.Class<T> filterClass);

}
