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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;

@objid ("00388c90-c4bf-1fd8-97fe-001ec947cd2a")
public interface ObjectFlow extends ActivityEdge {
    @objid ("86c2109a-3b5e-4b0f-a385-bb8cdf40d651")
    String getTransformationBehavior();

    @objid ("79b0509a-4e69-4cf6-a7a5-4e5a997535df")
    void setTransformationBehavior(String value);

    @objid ("ce308d31-28cf-442c-af8e-930fbdc071a6")
    String getSelectionBehavior();

    @objid ("b065e0b4-1eb5-47a7-875b-029f38ea0ad2")
    void setSelectionBehavior(String value);

    @objid ("dc8e7536-5427-4751-a26c-32f6bd58d93e")
    boolean isIsMultiCast();

    @objid ("c3ea829f-d2a1-49fa-b6b2-6a1d004d00a0")
    void setIsMultiCast(boolean value);

    @objid ("b660e81b-b06a-4fd9-8e26-c4dbc46464b2")
    boolean isIsMultiReceive();

    @objid ("fecc1e21-2ff5-4307-a6d2-6b255b20a5e7")
    void setIsMultiReceive(boolean value);

    @objid ("4ea82880-ae28-4f09-86da-980ca37917db")
    ObjectFlowEffectKind getEffect();

    @objid ("1e148ee2-3e91-4c84-a826-ecf9f637604d")
    void setEffect(ObjectFlowEffectKind value);

}
