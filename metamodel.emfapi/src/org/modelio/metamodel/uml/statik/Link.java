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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.LinkEnd;

@objid ("815acdf3-5af8-48c5-894b-85d62dbe2e9b")
public interface Link extends ModelElement {
    @objid ("65789039-d705-44ba-a067-fb18e1ee9a2a")
    Association getModel();

    @objid ("e23ea78b-8797-4a9c-8dac-da8314cd9d10")
    void setModel(Association value);

    @objid ("e051ed7d-bfd5-4dc2-a215-ea4dd85ec9a4")
    EList<LinkEnd> getLinkEnd();

    @objid ("3ca70b3d-e287-4c0b-b16e-7f5f40e6bb31")
    <T extends LinkEnd> List<T> getLinkEnd(java.lang.Class<T> filterClass);

    @objid ("e9ca254b-60b1-4813-9292-0402645b9b4e")
    CommunicationChannel getSent();

    @objid ("f0e8cdc8-2d4e-4dc8-88e6-83211bc2cedf")
    void setSent(CommunicationChannel value);

}
