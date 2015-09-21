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
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.Node;

/**
 * Artifact v0.0.9054
 * 
 * 
 * In the metamodel, an Artifact is a Classifier that represents a physical entity. 
 * 
 * Artifacts can have Properties that represent features of the Artifact, and Operations that can be performed on its instances. Artifacts can be involved in Associations to other Artifacts, for example composition associations to Artifacts that are contained within it. 
 * 
 * Artifacts can be instantiated to represent detailed copy semantics, where different instances of the same Artifact may be deployed to various Node instances (and where each may have separate property values, for example for a time-stamp property).  
 * 
 * In Modelio, deployment or imbrications of Artifacts are modeled using the internalStructure mechanism. This provides a simpler, more formal and general mechanism that justifies metamodel differences to the standard, but enhances usability. 
 * 
 * In Modelio, an Artifact is a NameSpace, and therefore belongs to its owner NameSpace, which can be a Component, a Package, an Artifact or a TemplateParameter.
 */
@objid ("0093d3de-c4be-1fd8-97fe-001ec947cd2a")
public interface Artifact extends Classifier {
    @objid ("6303da36-a981-47fb-ae59-9e90f7b1a5f7")
    public static final String MNAME = "Artifact";

    /**
     * Getter for attribute 'Artifact.FileName'
     * 
     * Metamodel description:
     * <i>The file system name for the Artifact.</i>
     */
    @objid ("ea2e6433-ed7c-4aeb-8547-259ab21b265d")
    String getFileName();

    /**
     * Setter for attribute 'Artifact.FileName'
     * 
     * Metamodel description:
     * <i>The file system name for the Artifact.</i>
     */
    @objid ("05f4a1f6-da0f-4e30-937e-f4e4087a0308")
    void setFileName(String value);

    /**
     * Getter for relation 'Artifact->Utilized'
     * 
     * Metamodel description:
     * <i>The set of model elements that are manifested in the Artifact. These model elements are utilized in the construction (or generation) of the artifact.</i>
     */
    @objid ("63979ec8-f0dc-4004-a23c-45bf7fe88645")
    EList<Manifestation> getUtilized();

    /**
     * Filtered Getter for relation 'Artifact->Utilized'
     * 
     * Metamodel description:
     * <i>The set of model elements that are manifested in the Artifact. These model elements are utilized in the construction (or generation) of the artifact.</i>
     */
    @objid ("74e41959-097f-4894-a589-30b5643a4d3b")
    <T extends Manifestation> List<T> getUtilized(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Artifact->DeploymentLocation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ac9c280f-04a4-4f15-946a-d046c8534d49")
    EList<Node> getDeploymentLocation();

    /**
     * Filtered Getter for relation 'Artifact->DeploymentLocation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("308af6b8-99d2-4edb-a369-1a97be2a756c")
    <T extends Node> List<T> getDeploymentLocation(java.lang.Class<T> filterClass);

}
