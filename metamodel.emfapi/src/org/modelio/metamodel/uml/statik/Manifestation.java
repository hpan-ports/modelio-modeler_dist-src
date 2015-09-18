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
import org.modelio.metamodel.uml.statik.Artifact;

@objid ("00108470-c4bf-1fd8-97fe-001ec947cd2a")
public interface Manifestation extends ModelElement {
    @objid ("70ce19ca-ff13-4e32-b61a-74eb221d6354")
    ModelElement getUtilizedElement();

    @objid ("b19ec04e-f9ed-4a49-91dc-7b292a57bf7c")
    void setUtilizedElement(ModelElement value);

    @objid ("b6d15e93-b489-49a3-b103-27945ad5afff")
    Artifact getOwner();

    @objid ("b0caa1a4-0a10-42b3-8acb-5a7dd4b8c424")
    void setOwner(Artifact value);

}
