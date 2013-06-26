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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.Node;

@objid ("0093d3de-c4be-1fd8-97fe-001ec947cd2a")
public interface Artifact extends Classifier {
    @objid ("306175f8-facb-46b5-ba9a-55ae1f223aa8")
    String getFileName();

    @objid ("508ec0ac-60db-421f-a310-afda81a51888")
    void setFileName(String value);

    @objid ("338f9363-d840-4b2c-b3dd-e424a75d3515")
    EList<Manifestation> getUtilized();

    @objid ("7a842fda-ae14-4938-9392-bf0afba017ee")
    <T extends Manifestation> List<T> getUtilized(java.lang.Class<T> filterClass);

    @objid ("5e984589-266b-471b-8e85-f08a17d1ce28")
    EList<Node> getDeploymentLocation();

    @objid ("0c3fdcb1-7bf1-4579-badc-aab8476d7930")
    <T extends Node> List<T> getDeploymentLocation(java.lang.Class<T> filterClass);

}
