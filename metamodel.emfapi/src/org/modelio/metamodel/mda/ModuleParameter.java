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
    @objid ("30d084e9-2f73-4278-b224-52552f65179f")
    String getSetName();

    @objid ("e69b2e73-ca0a-4e1f-9da5-c2e6a8d53347")
    void setSetName(String value);

    @objid ("a9b8ae0c-140a-4d60-a9a5-3523d117a9ba")
    ModuleParameterType getAssociatedType();

    @objid ("3faf138e-3c5b-4144-91b2-819cdd8a7bc5")
    void setAssociatedType(ModuleParameterType value);

    @objid ("b50a3f60-3d3f-4cf9-b34c-1f7809ef0e6a")
    boolean isIsUserRead();

    @objid ("3237a94d-b332-4d92-af49-bdcc95d9da5e")
    void setIsUserRead(boolean value);

    @objid ("7bd469aa-dd0c-490b-ae64-ca19fc753114")
    boolean isIsUserWrite();

    @objid ("e95324f4-a786-40d4-8535-9cd90b817d99")
    void setIsUserWrite(boolean value);

    @objid ("f270aff4-a3f1-4094-b74a-e4ea1927953a")
    boolean isIsApiRead();

    @objid ("a16fcd42-4117-4cb7-9889-af62e63a05f4")
    void setIsApiRead(boolean value);

    @objid ("a33ddf96-6abd-40ab-901a-4b775795fe1d")
    boolean isIsApiWrite();

    @objid ("b55e323f-a923-4fae-a57a-0e2d4bf4b9af")
    void setIsApiWrite(boolean value);

    @objid ("9e306880-04e0-400b-94da-5547d268ed75")
    GeneralClass getType();

    @objid ("cb55ca99-0f9d-4408-afe9-e92250f7f4c2")
    void setType(GeneralClass value);

    @objid ("316a3741-021a-48f5-ac5f-09e6ee72e150")
    ModuleComponent getOwner();

    @objid ("20f39b97-9274-41aa-836a-0d2eea93d239")
    void setOwner(ModuleComponent value);

}
