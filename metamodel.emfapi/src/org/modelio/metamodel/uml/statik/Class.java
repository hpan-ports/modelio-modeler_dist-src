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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.ClassAssociation;

@objid ("0002155c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Class extends GeneralClass {
    @objid ("c83a19f7-43d5-4be8-a809-b1f433f288ce")
    boolean isIsActive();

    @objid ("73de84df-4359-46eb-853b-acb326a70486")
    void setIsActive(boolean value);

    @objid ("5b360997-9f7c-4fe1-9f0d-bf7c9755cb3c")
    boolean isIsMain();

    @objid ("b431fe3c-ef94-4e04-b2f3-b1f28647106c")
    void setIsMain(boolean value);

    @objid ("b8763d21-e776-410a-bcc4-9448a0e15bac")
    ClassAssociation getLinkToAssociation();

    @objid ("a422cf34-2796-4e5d-90a6-d458c3d44ced")
    void setLinkToAssociation(ClassAssociation value);

}
