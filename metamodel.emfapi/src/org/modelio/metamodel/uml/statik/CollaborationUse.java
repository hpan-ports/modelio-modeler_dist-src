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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * CollaborationUse v0.0.9054
 * 
 * 
 * (UML 2.0) A CollaborationUse (or collaboration occurrence) represents one particular use of a Collaboration to explain the relationships between the properties of a Classifier. A CollaborationUse indicates a set of roles and Connectors that cooperate within the Classifier according to a given Collaboration, indicated by the type of the collaboration occurrence. 
 * 
 * There may be multiple uses of a given Collaboration within a Classifier, each involving a different set of roles and Connectors. A given role or Connector may be involved in multiple occurrences of the same or different Collaborations. Associated Bindings map Features of the Collaboration type to Features in the Classifier. These Bindings indicate which role in the Classifier plays which role in the Collaboration.
 * 
 * In Modelio, a CollaborationUse can belong to a NameSpace (Classifier or Collaboration) or to an Operation.
 */
@objid ("00047d6a-c4bf-1fd8-97fe-001ec947cd2a")
public interface CollaborationUse extends ModelElement {
    @objid ("2f7e3920-141a-4280-a644-28055bf7d834")
    public static final String MNAME = "CollaborationUse";

    /**
     * Getter for relation 'CollaborationUse->Type'
     * 
     * Metamodel description:
     * <i>Defines the Collaboration whose CollaborationUse is an occurrence.</i>
     */
    @objid ("d2a7955d-2098-4a38-abf7-33871cc84b5e")
    Collaboration getType();

    /**
     * Setter for relation 'CollaborationUse->Type'
     * 
     * Metamodel description:
     * <i>Defines the Collaboration whose CollaborationUse is an occurrence.</i>
     */
    @objid ("6094c317-40ec-4025-8420-3f0c6f7dfe50")
    void setType(Collaboration value);

    /**
     * Getter for relation 'CollaborationUse->NRepresented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("10af0c09-1e0f-40f2-86e0-4bf3a41dab26")
    NameSpace getNRepresented();

    /**
     * Setter for relation 'CollaborationUse->NRepresented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6f06080e-2f73-4250-80f9-62da53cb4b14")
    void setNRepresented(NameSpace value);

    /**
     * Getter for relation 'CollaborationUse->ORepresented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f3d62ef1-db62-414f-a7f9-86f541f764c0")
    Operation getORepresented();

    /**
     * Setter for relation 'CollaborationUse->ORepresented'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1ee9eb83-5f32-4c67-bee7-c98dca28ad35")
    void setORepresented(Operation value);

    /**
     * Getter for relation 'CollaborationUse->RoleBinding'
     * 
     * Metamodel description:
     * <i>The CollaborationUse owns the Binding links that bind elements of the Type Collaboration to elements accessible from the owner NameSpace of the CollaborationUse.</i>
     */
    @objid ("b1b191aa-994b-4bc7-b48b-6ddb8b4a6986")
    EList<Binding> getRoleBinding();

    /**
     * Filtered Getter for relation 'CollaborationUse->RoleBinding'
     * 
     * Metamodel description:
     * <i>The CollaborationUse owns the Binding links that bind elements of the Type Collaboration to elements accessible from the owner NameSpace of the CollaborationUse.</i>
     */
    @objid ("9e39bce4-145d-4afc-a55a-746f7eecef5b")
    <T extends Binding> List<T> getRoleBinding(java.lang.Class<T> filterClass);

}
