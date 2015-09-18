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
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;

@objid ("00388c90-c4bf-1fd8-97fe-001ec947cd2a")
public interface ObjectFlow extends ActivityEdge {
    @objid ("d91cf17a-8f21-4904-a172-acff16e4b9e6")
    String getTransformationBehavior();

    @objid ("8b91407e-dc76-41f2-b55a-8299b650da92")
    void setTransformationBehavior(String value);

    @objid ("0a34200d-e598-4085-80ab-a0fafef7ce13")
    String getSelectionBehavior();

    @objid ("8c3fed64-2317-43d3-9b76-ed6c875312ba")
    void setSelectionBehavior(String value);

    @objid ("b76aa890-b235-4542-b30f-5b89e5a5a778")
    boolean isIsMultiCast();

    @objid ("1f0b9904-290a-4ed4-80ce-87574784d923")
    void setIsMultiCast(boolean value);

    @objid ("5e46fffb-f8ee-403a-9137-96aa62b2e559")
    boolean isIsMultiReceive();

    @objid ("104cea2f-6b82-4b14-97f3-153c3e76dec4")
    void setIsMultiReceive(boolean value);

    @objid ("8e4ba461-064c-4498-96bc-e9ced16d82e6")
    ObjectFlowEffectKind getEffect();

    @objid ("48936c3c-6993-4b86-90a5-b4ddc91f0557")
    void setEffect(ObjectFlowEffectKind value);

}
