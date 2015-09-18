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
    @objid ("00c6b101-02e0-4ece-9375-c82940911a06")
    ConnectorEnd getConnectorEndRole();

    @objid ("f2e4488a-0483-4383-8cdb-8f9e64fd7e43")
    void setConnectorEndRole(ConnectorEnd value);

    @objid ("a4b7750f-e55b-49a3-a085-80b63bd757f1")
    NaryConnector getConnectorRole();

    @objid ("3640ad0c-8e65-4a4e-b24c-dd3672e78fb6")
    void setConnectorRole(NaryConnector value);

    @objid ("5c8f4e21-4d72-42bc-b028-8194e699e4d5")
    BindableInstance getRole();

    @objid ("ac84bed4-856c-4fc3-8c07-4959b7a3adbe")
    void setRole(BindableInstance value);

    @objid ("893b08f4-1b4c-40d9-b1fc-a46cfe68c98d")
    ModelElement getRepresentedFeature();

    @objid ("caf635c4-9b03-4675-ab27-9e8b571118e9")
    void setRepresentedFeature(ModelElement value);

    @objid ("0bd1ab2e-1c2c-417b-a67f-d09863d8f40c")
    CollaborationUse getOwner();

    @objid ("b9646486-a6b9-4ed8-9eb0-abf866d22a42")
    void setOwner(CollaborationUse value);

}
