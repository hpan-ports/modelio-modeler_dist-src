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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.ClassAssociation;

@objid ("0002155c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Class extends GeneralClass {
    @objid ("751fb3ec-0916-44e6-acc7-3dae91f332ae")
    boolean isIsActive();

    @objid ("76dd6f28-a976-4cdd-977e-7b52e2cbcbc1")
    void setIsActive(boolean value);

    @objid ("790260e9-c8a0-48d9-8656-e8e3ca315fe7")
    boolean isIsMain();

    @objid ("721c3eb0-c788-46c6-af9b-01b21f2a88b7")
    void setIsMain(boolean value);

    @objid ("4c806b6f-70ac-48e2-9dbf-b41036e42f11")
    ClassAssociation getLinkToAssociation();

    @objid ("84c45d88-15d8-449d-b866-14a37a3fff47")
    void setLinkToAssociation(ClassAssociation value);

}
