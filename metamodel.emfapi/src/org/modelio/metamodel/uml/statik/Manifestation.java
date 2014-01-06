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
import org.modelio.metamodel.uml.statik.Artifact;

@objid ("00108470-c4bf-1fd8-97fe-001ec947cd2a")
public interface Manifestation extends ModelElement {
    @objid ("cdac6531-8916-4790-a508-83449d6dd23d")
    ModelElement getUtilizedElement();

    @objid ("7dee8fb7-433e-498c-8a06-8101ae231207")
    void setUtilizedElement(ModelElement value);

    @objid ("0af88d69-27d4-466a-bb5f-40b64532f60b")
    Artifact getOwner();

    @objid ("a8d15b64-bb93-4848-adf2-5bf63ee2621b")
    void setOwner(Artifact value);

}
