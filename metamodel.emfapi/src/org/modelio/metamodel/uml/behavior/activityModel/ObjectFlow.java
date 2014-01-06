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
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;

@objid ("00388c90-c4bf-1fd8-97fe-001ec947cd2a")
public interface ObjectFlow extends ActivityEdge {
    @objid ("60b48bb2-dff2-4ef6-a8f8-34c9f96ae344")
    String getTransformationBehavior();

    @objid ("5b761fe9-8e99-460f-abc7-5e93baa7572f")
    void setTransformationBehavior(String value);

    @objid ("ca0bfe5d-8097-4e18-a66f-ff9918586016")
    String getSelectionBehavior();

    @objid ("0c85e672-94a1-4117-896e-f61f284a886a")
    void setSelectionBehavior(String value);

    @objid ("cf54cbd3-cd65-4c48-851d-3597e96b1458")
    boolean isIsMultiCast();

    @objid ("b8648cb5-b36a-4a6b-9628-5405283dba70")
    void setIsMultiCast(boolean value);

    @objid ("beb9583f-7b61-4244-a407-5d9b5b50b8de")
    boolean isIsMultiReceive();

    @objid ("8caffe89-4002-4e7b-b78d-1a8514981a24")
    void setIsMultiReceive(boolean value);

    @objid ("4978c557-2752-413f-8ddb-13a46081bf6f")
    ObjectFlowEffectKind getEffect();

    @objid ("0778f060-b472-4dbf-80d7-6845fcb432b7")
    void setEffect(ObjectFlowEffectKind value);

}
