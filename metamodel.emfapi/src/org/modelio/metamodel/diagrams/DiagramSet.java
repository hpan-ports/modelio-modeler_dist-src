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
package org.modelio.metamodel.diagrams;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("006e175c-c4bf-1fd8-97fe-001ec947cd2a")
public interface DiagramSet extends ModelElement {
    @objid ("6582d239-c8e7-450e-8a2c-53e0b7e37ec1")
    EList<DiagramSet> getSub();

    @objid ("3880a544-dcf7-43a2-86da-cfd3e263a6da")
    <T extends DiagramSet> List<T> getSub(java.lang.Class<T> filterClass);

    @objid ("23f356ef-af93-4eb2-934d-59b2aaadc41a")
    DiagramSet getParent();

    @objid ("52ae256f-4ad3-4ee8-a353-46afd4cff6c7")
    void setParent(DiagramSet value);

    @objid ("ea004e02-6328-45e4-bab7-ce12a6b64364")
    EList<AbstractDiagram> getReferencedDiagram();

    @objid ("d2e525a0-6265-4529-95d9-abe290eec983")
    <T extends AbstractDiagram> List<T> getReferencedDiagram(java.lang.Class<T> filterClass);

    @objid ("cd976e10-e6de-4281-b803-7d26562e7ad8")
    Project getOwner();

    @objid ("fad84c53-5ea3-43f9-8631-8c7e5e64ea32")
    void setOwner(Project value);

}
