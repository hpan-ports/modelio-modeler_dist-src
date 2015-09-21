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
package org.modelio.metamodel.uml.infrastructure.properties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;

/**
 * PropertyType v0.0.9054
 * 
 * 
 * Type of property. Default PropertyTypes already exist in the requirements project: "Text", "MultiText", "Integer", "Real", "Date", "Boolean". No other PropertyTypes should be created in a requirement project. All property types belong to the PropertyContainer.
 */
@objid ("006e6798-ec87-1098-b22e-001ec947cd2a")
public interface PropertyType extends ModelElement {
    @objid ("208caba8-613e-44fb-8274-baf729e2cc63")
    public static final String MNAME = "PropertyType";

    /**
     * Getter for attribute 'PropertyType.BaseType'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("30bf3590-ab05-438a-9237-87d3308eff49")
    PropertyBaseType getBaseType();

    /**
     * Setter for attribute 'PropertyType.BaseType'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("03040708-fbd3-4593-86cc-94872961083b")
    void setBaseType(PropertyBaseType value);

    /**
     * Getter for relation 'PropertyType->AnalystOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b54576c6-d48e-4f83-8782-f7a9c3a70c38")
    PropertyContainer getAnalystOwner();

    /**
     * Setter for relation 'PropertyType->AnalystOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("639aafd1-3ca6-4dec-8313-203e09f9cffc")
    void setAnalystOwner(PropertyContainer value);

    /**
     * Getter for relation 'PropertyType->Typed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6aa23853-8c92-40df-9b40-3b6e7ac718c8")
    EList<PropertyDefinition> getTyped();

    /**
     * Filtered Getter for relation 'PropertyType->Typed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5c721e95-3d14-4b96-b1ed-7e82a43e7259")
    <T extends PropertyDefinition> List<T> getTyped(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'PropertyType->ModuleOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("894e9f89-cbd9-4b68-91c8-2ab74886b99f")
    ModuleComponent getModuleOwner();

    /**
     * Setter for relation 'PropertyType->ModuleOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4cf5dc13-05d5-46b4-a9b8-91ae63d3286c")
    void setModuleOwner(ModuleComponent value);

}
