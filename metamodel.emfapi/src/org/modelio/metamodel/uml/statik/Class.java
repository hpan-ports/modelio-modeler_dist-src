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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.ClassAssociation;

@objid ("0002155c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Class extends GeneralClass {
    @objid ("b4c34c35-9bad-4e5f-8884-94fd65229166")
    boolean isIsActive();

    @objid ("bd290daf-d6ac-4b0c-a588-51510f636172")
    void setIsActive(boolean value);

    @objid ("dd15092f-cf78-4704-82b8-9a103caef83d")
    boolean isIsMain();

    @objid ("eb0fd7c0-a5f3-4bd0-91d9-c43fe37c8282")
    void setIsMain(boolean value);

    @objid ("c8c1ae1d-78d9-4321-abc7-88b04928de2d")
    ClassAssociation getLinkToAssociation();

    @objid ("785a2824-7265-4f40-a638-1910b309f182")
    void setLinkToAssociation(ClassAssociation value);

}
