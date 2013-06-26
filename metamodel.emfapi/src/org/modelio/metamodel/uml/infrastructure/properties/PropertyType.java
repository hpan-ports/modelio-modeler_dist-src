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
    @objid ("982ab65e-847c-4002-ba65-e28cbb533801")
    PropertyBaseType getBaseType();

    @objid ("944960c1-5133-4639-86d7-6e721c0bc38c")
    void setBaseType(PropertyBaseType value);

    @objid ("cc8fa5ca-7676-44f2-a284-cabcbbaab195")
    PropertyContainer getAnalystOwner();

    @objid ("e894daf4-4305-4592-a57e-561f56f0f14b")
    void setAnalystOwner(PropertyContainer value);

    @objid ("6110f1b2-f8be-4f93-ac4b-f8e235859670")
    EList<PropertyDefinition> getTyped();

    @objid ("89ff1c76-f36d-490f-af94-2483aee9e807")
    <T extends PropertyDefinition> List<T> getTyped(java.lang.Class<T> filterClass);

    @objid ("fce05c8f-a560-4096-b469-352e26a1ded9")
    ModuleComponent getModuleOwner();

    @objid ("2f357482-7424-4241-b36e-477166a29b73")
    void setModuleOwner(ModuleComponent value);

}
