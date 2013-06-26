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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.NaryConnector;

@objid ("00015824-c4bf-1fd8-97fe-001ec947cd2a")
public interface Binding extends ModelElement {
    @objid ("467dbdf1-cbe7-4255-ac10-64978219c93e")
    ConnectorEnd getConnectorEndRole();

    @objid ("eaf588d6-18fe-41f6-baa5-ea729b54e3ae")
    void setConnectorEndRole(ConnectorEnd value);

    @objid ("40992e37-6126-481f-ab71-225d05f7593b")
    NaryConnector getConnectorRole();

    @objid ("26bf34f0-7dff-435f-b5c6-7e26c7c93b86")
    void setConnectorRole(NaryConnector value);

    @objid ("b6412d55-1b39-4ede-87ef-cba395c60f0f")
    BindableInstance getRole();

    @objid ("ff47673d-be66-4e7b-868f-23ed1de423b0")
    void setRole(BindableInstance value);

    @objid ("7ca9c601-864f-426b-b01d-6899495d7086")
    ModelElement getRepresentedFeature();

    @objid ("632026b5-bc3d-403d-b267-910a9d15148d")
    void setRepresentedFeature(ModelElement value);

    @objid ("4a87f65b-f707-4f48-afef-41e52679c268")
    CollaborationUse getOwner();

    @objid ("f9693149-2c3a-4620-87d6-8fff529afb2e")
    void setOwner(CollaborationUse value);

}
