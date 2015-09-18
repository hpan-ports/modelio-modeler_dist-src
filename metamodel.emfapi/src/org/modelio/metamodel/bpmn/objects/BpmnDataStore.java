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
package org.modelio.metamodel.bpmn.objects;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("0003e1c0-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataStore extends BpmnItemAwareElement {
    @objid ("23b43c18-a0b3-4611-ab8c-c9025bb09187")
    int getCapacity();

    @objid ("16d583bd-a174-40c5-8a3d-4524095c5919")
    void setCapacity(int value);

    @objid ("0f7da332-b3aa-4f99-8979-1e8750589023")
    boolean isIsUnlimited();

    @objid ("e0337d6d-92f5-48d8-a696-50976465ab1d")
    void setIsUnlimited(boolean value);

}
