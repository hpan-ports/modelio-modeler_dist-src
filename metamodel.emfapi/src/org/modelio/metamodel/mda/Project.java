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
package org.modelio.metamodel.mda;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;

@objid ("006602e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface Project extends ModelElement {
    @objid ("810926d5-12e3-4e88-afea-df3b255f06ba")
    String getProjectContext();

    @objid ("ce179aad-9f96-4353-8d23-cc71d5dbc202")
    void setProjectContext(String value);

    @objid ("260e349a-8ffe-4553-9e17-4dce26b36c57")
    String getProjectDescr();

    @objid ("a344d6b4-5750-42f6-875a-ceed0b31e1c5")
    void setProjectDescr(String value);

    @objid ("25df9471-004c-496f-b00c-f2202d919df7")
    DiagramSet getDiagramRoot();

    @objid ("fd98c984-6846-44e5-ad22-270964dbe37a")
    void setDiagramRoot(DiagramSet value);

    @objid ("e8852a4e-ad33-44f5-85ca-a2e9566e31dc")
    Package getModel();

    @objid ("ae965f26-ddbd-4ee9-9be6-9c0f64439fe1")
    void setModel(Package value);

}
