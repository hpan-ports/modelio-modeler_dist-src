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
/*   Metamodel version: 9019              */
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
    @objid ("ab73826a-d58a-4b3c-be21-67cc88019837")
    ConnectorEnd getConnectorEndRole();

    @objid ("b39557e6-8a14-42a1-9180-d53be9f0613f")
    void setConnectorEndRole(ConnectorEnd value);

    @objid ("85fc1d1e-a54c-4dcc-a04c-15442eb14bc0")
    NaryConnector getConnectorRole();

    @objid ("ed47fc94-8951-4fcf-bb2c-a1f36e53ae0c")
    void setConnectorRole(NaryConnector value);

    @objid ("4ed088cc-8fbe-4442-a0da-968cdb7f2922")
    BindableInstance getRole();

    @objid ("6bd19bb9-0c0e-4528-bbba-d47c4c3670b5")
    void setRole(BindableInstance value);

    @objid ("031c3c04-0dbe-4194-b8da-d8f951e59836")
    ModelElement getRepresentedFeature();

    @objid ("754d8137-26cd-49ce-ac10-c06aa0fc1857")
    void setRepresentedFeature(ModelElement value);

    @objid ("7d9696eb-4f84-4675-ace9-232fcf675c3f")
    CollaborationUse getOwner();

    @objid ("cb34a046-6725-4cba-aa7e-65f35072c063")
    void setOwner(CollaborationUse value);

}
