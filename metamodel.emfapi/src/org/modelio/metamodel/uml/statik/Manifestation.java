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
import org.modelio.metamodel.uml.statik.Artifact;

@objid ("00108470-c4bf-1fd8-97fe-001ec947cd2a")
public interface Manifestation extends ModelElement {
    @objid ("17ce82bd-7d42-4073-816f-b7480297e9ff")
    ModelElement getUtilizedElement();

    @objid ("164c4d76-e769-4a30-9aa5-b5cb7e2a82dc")
    void setUtilizedElement(ModelElement value);

    @objid ("494b66ee-d499-4b7a-a0d5-371a9f0f5b54")
    Artifact getOwner();

    @objid ("406276c0-4e43-448a-930c-f1c3c3277ead")
    void setOwner(Artifact value);

}
