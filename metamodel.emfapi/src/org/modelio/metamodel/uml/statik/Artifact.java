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
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.Node;

@objid ("0093d3de-c4be-1fd8-97fe-001ec947cd2a")
public interface Artifact extends Classifier {
    @objid ("56602582-0183-41d2-8dea-8c5864bb35f2")
    String getFileName();

    @objid ("6fc7a3cf-64d0-4e0a-8f10-d95d037f8ee5")
    void setFileName(String value);

    @objid ("7bd47303-21fd-476a-8931-47baebbf28de")
    EList<Manifestation> getUtilized();

    @objid ("425f4c2d-3570-45a2-8562-f055380cb008")
    <T extends Manifestation> List<T> getUtilized(java.lang.Class<T> filterClass);

    @objid ("edde65f0-e34d-47e7-b4ce-b66c3b3953ae")
    EList<Node> getDeploymentLocation();

    @objid ("67f240f1-a07b-486b-abae-1a9ba41fb34c")
    <T extends Node> List<T> getDeploymentLocation(java.lang.Class<T> filterClass);

}
