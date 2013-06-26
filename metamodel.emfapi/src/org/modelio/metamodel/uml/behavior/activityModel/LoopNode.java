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

@objid ("00372b20-c4bf-1fd8-97fe-001ec947cd2a")
public interface LoopNode extends StructuredActivityNode {
    @objid ("b7396285-e278-45d2-86a5-bcedad449142")
    boolean isIsTestedFirst();

    @objid ("fac36ebb-c3d3-4eb7-82d7-1f4499aa3067")
    void setIsTestedFirst(boolean value);

    @objid ("01d02b37-fdfe-4e4f-a064-b8edfb8be248")
    String getSetup();

    @objid ("332047a8-c25b-4745-8810-91d3887ee300")
    void setSetup(String value);

    @objid ("f17a94a6-83da-4c14-b03d-daff73f448a6")
    String getTest();

    @objid ("3fe2c746-2633-4e68-b144-a0cf775612f7")
    void setTest(String value);

}
