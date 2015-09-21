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
 Metamodel: Standard, version 0.0.9024, by Modeliosoft
 Generator version: 3.2.10.9023
 Generated on: Mar 19, 2015
 */
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
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;

/**
 * PropertyTableDefinition v0.0.9054
 * 
 * 
 * Definition of a typed property table.
 */
@objid ("00669770-ec87-1098-b22e-001ec947cd2a")
public interface PropertyTableDefinition extends ModelElement {
    @objid ("8ecf7bd2-7f54-4f36-ade5-f774e46fd0c2")
    public static final String MNAME = "PropertyTableDefinition";

    /**
     * Getter for relation 'PropertyTableDefinition->Owned' Return the {@link PropertyDefinition} named 'propName' or
     * <code>null</code>.
     * 
     * Metamodel description: <i>null</i>
     */
    @objid ("52247448-83e6-4569-89fe-5e7b0dd2e9e8")
    PropertyDefinition getOwned(String propName);

    /**
     * Getter for relation 'PropertyTableDefinition->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("87bd6932-2cdb-43b4-8b17-1e7b9fa03cb4")
    PropertyContainer getOwner();

    /**
     * Setter for relation 'PropertyTableDefinition->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0050a45a-8914-462b-a663-276eddbeb82d")
    void setOwner(PropertyContainer value);

    /**
     * Getter for relation 'PropertyTableDefinition->TypedTable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("320e87f0-2856-4f70-8641-c93648fa4367")
    EList<TypedPropertyTable> getTypedTable();

    /**
     * Filtered Getter for relation 'PropertyTableDefinition->TypedTable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7c598f0d-368c-40bd-9673-82d77caf8fe9")
    <T extends TypedPropertyTable> List<T> getTypedTable(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'PropertyTableDefinition->OwnerReference'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("94774fbe-8c4d-47ad-b298-03e91a9a95ec")
    MetaclassReference getOwnerReference();

    /**
     * Setter for relation 'PropertyTableDefinition->OwnerReference'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c8a7d8e5-a9d6-466a-9066-60ea8bbf0ca1")
    void setOwnerReference(MetaclassReference value);

    /**
     * Getter for relation 'PropertyTableDefinition->OwnerStereotype'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("100dd491-b85e-49cd-a5fd-6f30774beaba")
    Stereotype getOwnerStereotype();

    /**
     * Setter for relation 'PropertyTableDefinition->OwnerStereotype'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6b5722e0-d565-45c3-a216-0a99c5db62cc")
    void setOwnerStereotype(Stereotype value);

    /**
     * Getter for relation 'PropertyTableDefinition->Owned'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2a99b9ac-d0ed-4502-b434-21db05a1020b")
    EList<PropertyDefinition> getOwned();

    /**
     * Filtered Getter for relation 'PropertyTableDefinition->Owned'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cbb5c323-7801-47cd-912e-2bd4023b0fdd")
    <T extends PropertyDefinition> List<T> getOwned(java.lang.Class<T> filterClass);

}
