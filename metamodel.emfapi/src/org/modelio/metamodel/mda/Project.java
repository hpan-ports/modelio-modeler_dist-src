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
package org.modelio.metamodel.mda;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;

/**
 * Project v0.0.9054
 * 
 * 
 * A project in Modelio corresponds to the UML Model concept. 
 * 
 * A Project in Modelio has a root Package, and in addition a specific configuration, detailing deployed MDACs, MDAC parameter values, and so on. 
 * 
 * A Project does not belong to any other element.
 */
@objid ("006602e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface Project extends ModelElement {
    @objid ("15a3ec8c-92f4-421b-9fdc-bb51e8ba344b")
    public static final String MNAME = "Project";

    /**
     * Getter for attribute 'Project.ProjectContext'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("56d6075f-600d-4a78-9999-2dc9673d36b4")
    String getProjectContext();

    /**
     * Setter for attribute 'Project.ProjectContext'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("05457276-fdb8-4d86-80fc-c69818c80b86")
    void setProjectContext(String value);

    /**
     * Getter for attribute 'Project.ProjectDescr'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f8c4520f-4a7f-4abc-bfa8-933ccdb605ef")
    String getProjectDescr();

    /**
     * Setter for attribute 'Project.ProjectDescr'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8981baff-0ab4-4323-bbd2-79aae324a948")
    void setProjectDescr(String value);

    /**
     * Getter for relation 'Project->DiagramRoot'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0b679548-91a5-4f44-8b7f-d76a5e7ff179")
    DiagramSet getDiagramRoot();

    /**
     * Setter for relation 'Project->DiagramRoot'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("df49fd12-b2d6-474f-8e77-cbcb9eb9a49b")
    void setDiagramRoot(DiagramSet value);

    /**
     * Getter for relation 'Project->Model'
     * 
     * Metamodel description:
     * <i>Defines the Package associated to the Project (equivalent to the UML Model notion) that is the root of the Project's Package organization.</i>
     */
    @objid ("9b175111-35d1-4411-80b5-73b610cfe87e")
    Package getModel();

    /**
     * Setter for relation 'Project->Model'
     * 
     * Metamodel description:
     * <i>Defines the Package associated to the Project (equivalent to the UML Model notion) that is the root of the Project's Package organization.</i>
     */
    @objid ("bb61e313-9658-4927-9d4e-ae223f8882d0")
    void setModel(Package value);

}
