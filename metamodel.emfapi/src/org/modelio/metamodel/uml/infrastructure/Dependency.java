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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * Dependency v0.0.9054
 * 
 * 
 * In the metamodel, a Dependency is a directed relationship from a client (or clients) to a supplier (or suppliers), stating that the client is dependent on the supplier (in other words, the client element requires the presence and knowledge of the supplier element). 
 * 
 * In the metamodel, an Abstraction is a Dependency in which there is mapping between the supplier and the client. Depending on the specific stereotype of Abstraction, mapping may be formal or informal, and may be unidirectional or bidirectional. If an Abstraction element has more than one client element, the supplier element maps into the set of client elements as a group. For example, an analysis-level Class might be split into several design-level Classes. The situation is similar if there is more than one supplier element. 
 * 
 * Dependencies are widely used inside Modelio to manage traceability. Any ModelElement can be traced to another ModelElement using this association.  
 * 
 * In Modelio, a Dependency can only have one client and one supplier. 
 * 
 * In Modelio, in order to comply with UML 2.0, the roles are swapped and renamed. The correspondence from UML 2.0 is now as follows: Dependency.client = Dependency.Impacted; Dependency.supplier = Dependency.DependsOn; Element.supplierDependency = ModelElement.ImpactedDependency; Element.clientDependency = ModelElement.DependsOnDependency. 
 * 
 * A Dependency now belongs to the impacted element (the client in UML 2.0).
 */
@objid ("0085d9be-c4be-1fd8-97fe-001ec947cd2a")
public interface Dependency extends ModelElement {
    @objid ("9f265a82-9a07-4ea6-9003-831de43c2e7e")
    public static final String MNAME = "Dependency";

    /**
     * Getter for attribute 'Dependency.DependsOnId'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("af91dde2-fa4e-40ff-85ae-e97a469ff6aa")
    String getDependsOnId();

    /**
     * Setter for attribute 'Dependency.DependsOnId'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cbdcc1cb-632d-4742-913f-767a9193a289")
    void setDependsOnId(String value);

    /**
     * Getter for attribute 'Dependency.DependsOnName'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c23b369b-90d4-4aad-ab6c-bbe520ddcee0")
    String getDependsOnName();

    /**
     * Setter for attribute 'Dependency.DependsOnName'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("28f9a379-9ea8-4249-aa41-a6c4b8173546")
    void setDependsOnName(String value);

    /**
     * Getter for relation 'Dependency->DependsOn'
     * 
     * Metamodel description:
     * <i>The element independent of the client element, in the same respect and the same dependency relationship.</i>
     */
    @objid ("851c6f78-fd69-48fc-ae28-e3df85da865d")
    ModelElement getDependsOn();

    /**
     * Setter for relation 'Dependency->DependsOn'
     * 
     * Metamodel description:
     * <i>The element independent of the client element, in the same respect and the same dependency relationship.</i>
     */
    @objid ("f9630eb5-6cfc-4d1b-8235-9711953d20a9")
    void setDependsOn(ModelElement value);

    /**
     * Getter for relation 'Dependency->Impacted'
     * 
     * Metamodel description:
     * <i>Client</i>
     */
    @objid ("563f5088-d4bb-494d-8c83-3f97cf0b70df")
    ModelElement getImpacted();

    /**
     * Setter for relation 'Dependency->Impacted'
     * 
     * Metamodel description:
     * <i>Client</i>
     */
    @objid ("68bf744c-d529-460e-8de1-a2dd1538bef4")
    void setImpacted(ModelElement value);

}
