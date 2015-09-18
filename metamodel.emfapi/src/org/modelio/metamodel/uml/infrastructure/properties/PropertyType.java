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
    @objid ("878ffb65-a1f6-45e4-b43f-a59ba0c3020d")
    PropertyBaseType getBaseType();

    @objid ("60d002ef-77c9-4da0-bfcd-0618b57a19ac")
    void setBaseType(PropertyBaseType value);

    @objid ("01697970-b5ca-4134-ac1d-1b0851622fd1")
    PropertyContainer getAnalystOwner();

    @objid ("e54e01b9-00dc-4114-9aa2-fae54c7a3eaa")
    void setAnalystOwner(PropertyContainer value);

    @objid ("fbbdcf2c-da83-4938-8a70-fee5030559bf")
    EList<PropertyDefinition> getTyped();

    @objid ("8909caa9-ce8b-44f3-bfe6-33388f0c59ca")
    <T extends PropertyDefinition> List<T> getTyped(java.lang.Class<T> filterClass);

    @objid ("f38712a9-ac7e-4c4d-8e1c-1cf69301f086")
    ModuleComponent getModuleOwner();

    @objid ("18358a1f-c285-47ad-baaf-4440615242df")
    void setModuleOwner(ModuleComponent value);

}
