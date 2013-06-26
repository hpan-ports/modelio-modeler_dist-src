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
package org.modelio.metamodel.mda;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameterType;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("0064e9a2-c4bf-1fd8-97fe-001ec947cd2a")
public interface ModuleParameter extends ModelElement {
    @objid ("ce2a6147-8d26-413c-9bd0-76703d6bbe4c")
    String getSetName();

    @objid ("7d51a3e3-4950-49c1-b8d4-b4faa338ef89")
    void setSetName(String value);

    @objid ("8a8e3def-bfbe-40c6-929a-51f4d9b82c6d")
    ModuleParameterType getAssociatedType();

    @objid ("420bf641-5a1c-485d-bc1a-66ca007b93c2")
    void setAssociatedType(ModuleParameterType value);

    @objid ("7828cbeb-9596-4428-a47f-1690ed237e2f")
    boolean isIsUserRead();

    @objid ("76ac0f8f-de6d-438e-8d4b-156dca25a838")
    void setIsUserRead(boolean value);

    @objid ("4d2d7000-d413-4c64-a7a9-7188838c83b0")
    boolean isIsUserWrite();

    @objid ("5478d663-40ad-4d76-a9fb-6c6c95297363")
    void setIsUserWrite(boolean value);

    @objid ("c1c105b8-dc03-4770-83f5-f13d4f23f80c")
    boolean isIsApiRead();

    @objid ("82436510-d0ba-4284-a832-6e433de139b6")
    void setIsApiRead(boolean value);

    @objid ("0c4e97ba-7482-4814-a403-b4280c96566f")
    boolean isIsApiWrite();

    @objid ("6fdecb7e-1676-49a2-85f0-913f282f3aad")
    void setIsApiWrite(boolean value);

    @objid ("9dc19d74-22a6-4db3-802e-b88e2a51d6af")
    GeneralClass getType();

    @objid ("d2294f59-2026-45a6-bfe5-ff35b364a1e5")
    void setType(GeneralClass value);

    @objid ("78b3afed-e16a-4c81-af2d-0b19b6155c20")
    ModuleComponent getOwner();

    @objid ("53a24cfb-0b24-4e52-9760-105e66fba613")
    void setOwner(ModuleComponent value);

}
