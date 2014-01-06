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
    @objid ("e1d69385-8ecb-49e0-8223-36a3aebdb8e4")
    String getSetName();

    @objid ("1bfb2d16-9e1a-413c-b58f-45a14c8376d1")
    void setSetName(String value);

    @objid ("10cef076-8006-4aea-9a7a-6dfb69ac43e5")
    ModuleParameterType getAssociatedType();

    @objid ("3203a582-06eb-411b-831b-b6fd850a5c7f")
    void setAssociatedType(ModuleParameterType value);

    @objid ("f5d9665f-2213-46eb-8080-75d8435c0d0f")
    boolean isIsUserRead();

    @objid ("4966a05d-f2ae-4cb1-854b-dacf8ba1e33f")
    void setIsUserRead(boolean value);

    @objid ("a5401313-75d3-443f-a716-57556710013b")
    boolean isIsUserWrite();

    @objid ("c337a6c1-e8e7-4954-b81d-8cef0e00a1a4")
    void setIsUserWrite(boolean value);

    @objid ("7c911a76-765e-422e-beb1-5ddb415ecaed")
    boolean isIsApiRead();

    @objid ("1d71a762-cee7-4b48-9d88-ff8a965c4f07")
    void setIsApiRead(boolean value);

    @objid ("ce46d35d-1661-4aa8-acbf-2262da75303a")
    boolean isIsApiWrite();

    @objid ("72855071-5e98-45a6-8eaf-ecb0428e163d")
    void setIsApiWrite(boolean value);

    @objid ("989e79b3-a81a-41ea-9710-df37b992055f")
    GeneralClass getType();

    @objid ("ee24b940-d991-4e54-a864-2c03c0f3482e")
    void setType(GeneralClass value);

    @objid ("b536b972-0c74-48c7-bd9a-9ed65939fddf")
    ModuleComponent getOwner();

    @objid ("b71ba6f6-0758-4c10-bb4b-764ba7b19ba3")
    void setOwner(ModuleComponent value);

}
