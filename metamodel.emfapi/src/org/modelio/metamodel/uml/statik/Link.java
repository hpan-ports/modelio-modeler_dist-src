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
    @objid ("ffb0e530-5737-4ac8-9c0d-e7bcaf006769")
    Association getModel();

    @objid ("33f2ae35-558e-4ab3-be42-1f45b7eeee32")
    void setModel(Association value);

    @objid ("3a48194d-f9b4-42b6-a0e1-5a26b3f6b99b")
    EList<LinkEnd> getLinkEnd();

    @objid ("bb572ab4-492c-4e52-bc09-142e0f9fd417")
    <T extends LinkEnd> List<T> getLinkEnd(java.lang.Class<T> filterClass);

    @objid ("9ee31ef5-1eff-44f3-b3ea-273ebaf61dea")
    CommunicationChannel getSent();

    @objid ("9c57ca47-7296-4b79-ad55-5cddd973a4b6")
    void setSent(CommunicationChannel value);

}
