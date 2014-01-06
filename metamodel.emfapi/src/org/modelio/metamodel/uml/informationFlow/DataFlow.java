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
package org.modelio.metamodel.uml.informationFlow;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("00645dc0-c4bf-1fd8-97fe-001ec947cd2a")
public interface DataFlow extends ModelElement {
    @objid ("dee1f83f-1edf-4390-b5cc-5d2142c2d529")
    NameSpace getDestination();

    @objid ("a22447f2-79be-4e9a-b3e6-4d5fabf4bcfd")
    void setDestination(NameSpace value);

    @objid ("ca2b8e21-81ec-45d2-a697-02c3d943c8ca")
    NameSpace getOrigin();

    @objid ("c35e9753-8987-418e-b86b-65f1a5c4bf8f")
    void setOrigin(NameSpace value);

    @objid ("691bdaf8-dbda-4f77-a88d-1b9624efe36a")
    NameSpace getOwner();

    @objid ("6bb1fd66-76e1-4ce9-9f3f-81a9ee5e38bd")
    void setOwner(NameSpace value);

    @objid ("a5e71a89-c022-47fa-932a-e749c5954ad5")
    Signal getSModel();

    @objid ("1a22f057-6953-4d7e-8a48-7b0021592ac2")
    void setSModel(Signal value);

}
