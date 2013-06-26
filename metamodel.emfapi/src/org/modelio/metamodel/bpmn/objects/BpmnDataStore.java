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
package org.modelio.metamodel.bpmn.objects;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("0003e1c0-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataStore extends BpmnItemAwareElement {
    @objid ("9fbe678e-81cf-4396-89ed-e8ad4c1205ee")
    int getCapacity();

    @objid ("fad82c14-3814-4d47-9af2-509c9400f61f")
    void setCapacity(int value);

    @objid ("4b50edbd-da3d-454f-937a-f19a7155413e")
    boolean isIsUnlimited();

    @objid ("b0a3cc1c-02e3-405b-a8f4-a9e1e82d8412")
    void setIsUnlimited(boolean value);

}
