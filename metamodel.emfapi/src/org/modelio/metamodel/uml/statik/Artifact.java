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
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.Node;

@objid ("0093d3de-c4be-1fd8-97fe-001ec947cd2a")
public interface Artifact extends Classifier {
    @objid ("1a494d1a-7f09-4f52-b991-8ec2dcbd2f1e")
    String getFileName();

    @objid ("d1527997-01a7-4915-8fe5-b73210c431b8")
    void setFileName(String value);

    @objid ("d5873f46-b2e5-44f4-aa79-7552a677e57b")
    EList<Manifestation> getUtilized();

    @objid ("2a116488-23e0-4a82-9c56-1b7d716bcc89")
    <T extends Manifestation> List<T> getUtilized(java.lang.Class<T> filterClass);

    @objid ("82026220-fd81-4864-a91e-3cebdb25fb46")
    EList<Node> getDeploymentLocation();

    @objid ("619820eb-4cf4-4596-901c-d10938eedf23")
    <T extends Node> List<T> getDeploymentLocation(java.lang.Class<T> filterClass);

}
