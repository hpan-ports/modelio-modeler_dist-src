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
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;

@objid ("004545ca-c4bf-1fd8-97fe-001ec947cd2a")
public interface Gate extends MessageEnd {
    @objid ("ecdcd149-44c6-435c-a18d-4f68153aa616")
    InteractionUse getOwnerUse();

    @objid ("cd8404ca-a2ca-48dc-88c7-515adbb3ff6d")
    void setOwnerUse(InteractionUse value);

    @objid ("78e9bb35-066f-46f0-b9a7-1ecc699bc8a7")
    EList<Gate> getActual();

    @objid ("97644d19-6cda-4abf-8a8a-2d701462e3db")
    <T extends Gate> List<T> getActual(java.lang.Class<T> filterClass);

    @objid ("b87bb896-8d34-4e57-b836-02184b37fae8")
    Interaction getOwnerInteraction();

    @objid ("12acf25e-60a5-48d3-ad76-5e9e3c0cb00a")
    void setOwnerInteraction(Interaction value);

    @objid ("cf2a2869-f9bd-4833-83f6-617c71bcc140")
    CombinedFragment getOwnerFragment();

    @objid ("f7825c92-5272-4f9b-ac86-89119099ea9e")
    void setOwnerFragment(CombinedFragment value);

    @objid ("e235a8ce-135d-4103-8144-fa846abb14f8")
    Gate getFormal();

    @objid ("3be5a77c-ea17-47f0-995f-5c533d6511e2")
    void setFormal(Gate value);

}
