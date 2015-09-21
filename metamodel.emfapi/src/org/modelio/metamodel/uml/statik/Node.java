/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.statik.Artifact;

/**
 * Node v0.0.9054
 * 
 * 
 * In the metamodel, a Node is a subclass of Classifier.  
 * 
 * Nodes may have an internal structure defined in terms of the Parts and Connectors associated with them, which is used to model the deployment of Artifact on Nodes, and also the imbrications of Nodes.  
 * 
 * In Modelio, Nodes belong to their owner NameSpace, which can be a Package, a Class or a Node.
 */
@objid ("0012fb88-c4bf-1fd8-97fe-001ec947cd2a")
public interface Node extends Classifier {
    @objid ("b096c267-673c-4af0-8085-d0b9f09a32c0")
    public static final String MNAME = "Node";

    /**
     * Getter for relation 'Node->Resident'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("95849a0b-249d-4ccb-a93f-b1db7779e621")
    EList<Artifact> getResident();

    /**
     * Filtered Getter for relation 'Node->Resident'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6845ecaa-cfaf-4b23-aa10-db210b0eee2e")
    <T extends Artifact> List<T> getResident(java.lang.Class<T> filterClass);

}
