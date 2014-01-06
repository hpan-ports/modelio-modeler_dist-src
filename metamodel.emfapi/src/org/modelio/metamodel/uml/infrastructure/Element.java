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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("00867d60-c4be-1fd8-97fe-001ec947cd2a")
public interface Element extends EObject, MObject {
    @objid ("b95f006e-2b45-4f82-8d6d-d2d5de69a9d5")
    EList<AbstractDiagram> getDiagramElement();

    @objid ("50556acc-55dc-48fc-a236-b6f41b1d315f")
    <T extends AbstractDiagram> List<T> getDiagramElement(java.lang.Class<T> filterClass);

    @objid ("7a6c49cc-0750-426b-ab39-4c0c04155bca")
    EList<NamespaceUse> getCausing();

    @objid ("e2e94a26-ba26-4203-b131-b6987d2d3de7")
    <T extends NamespaceUse> List<T> getCausing(java.lang.Class<T> filterClass);

    @objid ("320dfe0c-677d-46e0-a0c0-dcdf7566e562")
    EList<QueryDefinition> getAddedToQuery();

    @objid ("6205bd53-c9e3-4dd7-85df-52d698e16d44")
    <T extends QueryDefinition> List<T> getAddedToQuery(java.lang.Class<T> filterClass);

}
