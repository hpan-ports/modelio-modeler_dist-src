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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.NaryConnector;

/**
 * Binding v0.0.9054
 * 
 * 
 * A Binding is used to define the mapping between the Features of the Collaboration and the Features of the Classifier or Operation in the CollaborationUse.
 * 
 * This mapping indicates which connectable element of the Classifier or Operation plays which role(s) in the Collaboration. A connectable element may be bound to multiple roles in the same Collaboration occurrence (that is, it may play multiple roles).  
 * 
 * In Modelio, a Binding binds an occurrence to an element.  The Binding can be realized (Role->RepresentedFeature) :
 * From a BindableInstance to: 
 *    - a BindableInstance
 *    - an Attribute
 *    - a Parameter 
 *    - an AssociationEnd 
 * From a Connector to:
 *    - an Association
 *    - a Link
 * From a ConnectorEnd to:
 *    - an AssociationEnd
 *    - a LinkEnd
 * 
 * This Binding is generally independent of the Model or the Base of the occurrence (that is, it is not necessary to express the type of a role if it is bound to typed elements).
 *          
 * In Modelio, a Binding belongs to a CollaborationUse.
 */
@objid ("00015824-c4bf-1fd8-97fe-001ec947cd2a")
public interface Binding extends ModelElement {
    @objid ("08a72cb0-3f5e-45c8-8dde-04cd3d8086d8")
    public static final String MNAME = "Binding";

    /**
     * Getter for relation 'Binding->ConnectorEndRole'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("40fb80c2-4b1f-41f9-b009-85b96c9b9ff5")
    ConnectorEnd getConnectorEndRole();

    /**
     * Setter for relation 'Binding->ConnectorEndRole'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0b819434-f5b9-41d2-bf20-96590ea23007")
    void setConnectorEndRole(ConnectorEnd value);

    /**
     * Getter for relation 'Binding->ConnectorRole'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7152c9e3-6580-448e-b1ee-f3f14dac297f")
    NaryConnector getConnectorRole();

    /**
     * Setter for relation 'Binding->ConnectorRole'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("35ea8be5-d54e-4621-ab8d-ae9de7dab708")
    void setConnectorRole(NaryConnector value);

    /**
     * Getter for relation 'Binding->Role'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("964fbf8f-f709-4998-99d4-bd016da7bada")
    BindableInstance getRole();

    /**
     * Setter for relation 'Binding->Role'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("34e610f9-9d2a-4105-bca4-9b4ef52487e9")
    void setRole(BindableInstance value);

    /**
     * Getter for relation 'Binding->RepresentedFeature'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a18cb121-9319-429f-af05-bf8f490112a0")
    ModelElement getRepresentedFeature();

    /**
     * Setter for relation 'Binding->RepresentedFeature'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fa1d3e72-def9-486d-adfe-08f175473479")
    void setRepresentedFeature(ModelElement value);

    /**
     * Getter for relation 'Binding->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cff3de82-623b-42fc-bce1-68dfbcb6cb1e")
    CollaborationUse getOwner();

    /**
     * Setter for relation 'Binding->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0f283271-b334-42dd-b6b0-ec37c9ff54c4")
    void setOwner(CollaborationUse value);

}
