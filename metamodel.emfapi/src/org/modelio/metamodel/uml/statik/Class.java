/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.ClassAssociation;

/**
 * Class v0.0.9054
 * 
 * 
 * The Class is the main concept used in object-oriented modeling. It specifies which Instances can exist in an application. 
 * 
 * In Modelio, a Class is owned by a NameSpace (ModelTree) that can be a Package or a Class.
 */
@objid ("0002155c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Class extends GeneralClass {
    @objid ("bea90852-220d-4566-ac59-d70c45b7dc4e")
    public static final String MNAME = "Class";

    /**
     * Getter for attribute 'Class.IsActive'
     * 
     * Metamodel description:
     * <i>Specifies whether an Object of the Class maintains its own thread of control. If true, then an Object has its own thread of control and runs concurrently with other active Objects. If false, then Operations run in the address space and under the control of the active Object that controls the caller.</i>
     */
    @objid ("bbc1bf10-ae89-4635-b2cf-3df9966bcdf6")
    boolean isIsActive();

    /**
     * Setter for attribute 'Class.IsActive'
     * 
     * Metamodel description:
     * <i>Specifies whether an Object of the Class maintains its own thread of control. If true, then an Object has its own thread of control and runs concurrently with other active Objects. If false, then Operations run in the address space and under the control of the active Object that controls the caller.</i>
     */
    @objid ("3f40b425-85fb-447c-a830-eed6a47fb748")
    void setIsActive(boolean value);

    /**
     * Getter for attribute 'Class.IsMain'
     * 
     * Metamodel description:
     * <i>A main Class is a Class whose unique instance represents the application.</i>
     */
    @objid ("4f4b54bf-70c0-48a7-9652-5fdb406e056e")
    boolean isIsMain();

    /**
     * Setter for attribute 'Class.IsMain'
     * 
     * Metamodel description:
     * <i>A main Class is a Class whose unique instance represents the application.</i>
     */
    @objid ("3d60e06a-4aa7-4b67-93e3-1357f1e587bd")
    void setIsMain(boolean value);

    /**
     * Getter for relation 'Class->LinkToAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cd50f26f-45da-4541-88b3-96cae9af1c86")
    ClassAssociation getLinkToAssociation();

    /**
     * Setter for relation 'Class->LinkToAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ffc98bfa-6386-4e53-80a4-73be8051abfd")
    void setLinkToAssociation(ClassAssociation value);

}
