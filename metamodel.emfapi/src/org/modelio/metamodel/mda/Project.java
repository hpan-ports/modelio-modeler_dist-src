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
package org.modelio.metamodel.mda;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;

@objid ("006602e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface Project extends ModelElement {
    @objid ("beecef2c-cf37-4b47-8e8a-961cc4f2f501")
    String getProjectContext();

    @objid ("f20fd451-ff63-41d3-9296-228c8a43e973")
    void setProjectContext(String value);

    @objid ("0e8a776a-6622-42ae-a866-3f0d429c211d")
    String getProjectDescr();

    @objid ("41d443b1-6895-4590-ab76-7a5014998f3a")
    void setProjectDescr(String value);

    @objid ("922e4369-3eeb-4dab-805d-99c47da4d10b")
    DiagramSet getDiagramRoot();

    @objid ("aa452de0-63f7-4a9a-b808-3f69576fa012")
    void setDiagramRoot(DiagramSet value);

    @objid ("7e7478ff-e70a-4620-bba1-d3001c0ab330")
    Package getModel();

    @objid ("ebb7b47a-bda3-42fe-a2d7-1b104c2ead22")
    void setModel(Package value);

}
