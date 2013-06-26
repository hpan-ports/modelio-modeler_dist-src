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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;

@objid ("0089d1ea-c4be-1fd8-97fe-001ec947cd2a")
public interface Note extends ModelElement {
    @objid ("2a30125e-aba1-4b29-a69b-e706e39ecd6b")
    String getContent();

    @objid ("db7221f9-6713-4ed0-a314-1e73fe194991")
    void setContent(String value);

    @objid ("f97066db-27a7-42d3-b456-5cd9b37fb1cc")
    NoteType getModel();

    @objid ("f7b6724d-3876-4e07-bb7b-972cbddff01a")
    void setModel(NoteType value);

    @objid ("111d850a-df43-4b44-aa44-dd50e70a6ae8")
    ModelElement getSubject();

    @objid ("24b226ba-78d2-4550-9194-df60fdacf365")
    void setSubject(ModelElement value);

}
