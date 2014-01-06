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
package org.modelio.metamodel.uml.infrastructure.properties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;

@objid ("006e6798-ec87-1098-b22e-001ec947cd2a")
public interface PropertyType extends ModelElement {
    @objid ("61a154b7-ab7b-4b35-9e15-f7b89e7f7088")
    PropertyBaseType getBaseType();

    @objid ("b61f0ea4-c9da-4d61-ba8c-f79407ee3b49")
    void setBaseType(PropertyBaseType value);

    @objid ("1fcf65c6-77ec-4a6c-8024-361489a18e5e")
    PropertyContainer getAnalystOwner();

    @objid ("6ab92e94-733a-4cb9-b6f1-ccb7eee41841")
    void setAnalystOwner(PropertyContainer value);

    @objid ("27b2f955-2d32-4422-b6f8-b22c46b922de")
    EList<PropertyDefinition> getTyped();

    @objid ("db87f54f-5f0f-4ad9-bc43-f6393c0fc228")
    <T extends PropertyDefinition> List<T> getTyped(java.lang.Class<T> filterClass);

    @objid ("15c39d5c-bed6-46b8-bf95-a0434ab86195")
    ModuleComponent getModuleOwner();

    @objid ("34518f8d-bb6e-4a60-8c51-ac0de41c82c8")
    void setModuleOwner(ModuleComponent value);

}
