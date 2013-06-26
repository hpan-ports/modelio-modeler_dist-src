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
package org.modelio.metamodel.uml.infrastructure.properties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;

@objid ("00640c80-ec87-1098-b22e-001ec947cd2a")
public interface PropertyDefinition extends ModelElement {
    @objid ("1407473e-415d-4147-8b2e-e7cbdce4cba8")
    boolean isIsEditable();

    @objid ("3a4e9ded-a775-47cd-a966-a5ca6ef60787")
    void setIsEditable(boolean value);

    @objid ("c3097daa-3de1-46d3-8426-bd0a9985e072")
    String getDefaultValue();

    @objid ("d0769745-b34c-46a5-b72a-7603c093ffbc")
    void setDefaultValue(String value);

    @objid ("40947573-5583-4a0f-b762-489c8e8dc829")
    PropertyType getType();

    @objid ("14605a5c-fa89-4f47-bceb-122887d4677a")
    void setType(PropertyType value);

    @objid ("4c04fee0-2f84-44d9-8e2b-155913bfc791")
    PropertyTableDefinition getOwner();

    @objid ("da8bac98-d4ae-4f9b-9a2c-eddaab61f1af")
    void setOwner(PropertyTableDefinition value);

}
