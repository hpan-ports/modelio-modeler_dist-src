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
package org.modelio.metamodel.uml.informationFlow;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("00645dc0-c4bf-1fd8-97fe-001ec947cd2a")
public interface DataFlow extends ModelElement {
    @objid ("736993c4-26ac-4395-aca3-f4afbe1e3103")
    NameSpace getDestination();

    @objid ("605780d6-7ae2-41b8-98f7-e5d660f9af7a")
    void setDestination(NameSpace value);

    @objid ("d34f9d4e-8c5a-4ffb-a9ac-034ca7368de6")
    NameSpace getOrigin();

    @objid ("bf1a5462-7ad7-4393-a8a1-fa48baaf5080")
    void setOrigin(NameSpace value);

    @objid ("150b6e08-6966-42bb-a42a-66b64b0f590a")
    NameSpace getOwner();

    @objid ("4543d414-1055-43a1-8027-fd7d65d90ef8")
    void setOwner(NameSpace value);

    @objid ("0e91f0e7-41fb-4204-9c9a-85f686f6b863")
    Signal getSModel();

    @objid ("381ad0ad-7e07-4cf8-bd63-ab80f09c4299")
    void setSModel(Signal value);

}
