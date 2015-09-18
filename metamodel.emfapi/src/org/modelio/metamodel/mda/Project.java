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
package org.modelio.metamodel.mda;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;

@objid ("006602e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface Project extends ModelElement {
    @objid ("0871f1e3-5c52-4308-9661-dac9b9006e3c")
    String getProjectContext();

    @objid ("face1ec1-84a9-4166-887c-3e33d5eb2bd8")
    void setProjectContext(String value);

    @objid ("0e02cc67-fde6-4e17-9999-4871251394b8")
    String getProjectDescr();

    @objid ("50fa654d-2ee1-4710-8043-d429a5a69290")
    void setProjectDescr(String value);

    @objid ("27566ca4-4a9a-45fa-a8d9-6583486a1893")
    DiagramSet getDiagramRoot();

    @objid ("5beeacdc-604c-41c6-af16-c5d7a70f47f6")
    void setDiagramRoot(DiagramSet value);

    @objid ("f64251cd-48bf-4120-9830-61e05e34f436")
    Package getModel();

    @objid ("8e094d2f-95cc-4b35-a9c6-8118c3829cb0")
    void setModel(Package value);

}
