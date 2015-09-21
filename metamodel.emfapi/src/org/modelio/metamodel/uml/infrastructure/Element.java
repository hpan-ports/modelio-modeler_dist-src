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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Element v0.0.9054
 * 
 * 
 * Element de modélisation
 * Element représente tous les éléments sémantiques d'une modélisation, au niveau le plus abstrait. Les Element sont structurés par projet, qui constitue pour eux un espace clos de définition
 * Son utilisation est surtout apparente lors de la rédaction de règles H, pour procurer des règles générales
 * Vérifie si l'élément est bien rattaché à son composant.\CR\
 */
@objid ("00867d60-c4be-1fd8-97fe-001ec947cd2a")
public interface Element extends EObject, MObject {
    @objid ("4ed1fcec-f2b7-4f3f-9ffa-ba39d9c2e1ee")
    public static final String MNAME = "Element";

    /**
     * Getter for relation 'Element->DiagramElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d0a827a6-8021-43e6-b400-52d3d7068396")
    EList<AbstractDiagram> getDiagramElement();

    /**
     * Filtered Getter for relation 'Element->DiagramElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("36f4319e-d23a-4b64-8eb5-09c67107dc6d")
    <T extends AbstractDiagram> List<T> getDiagramElement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Element->Causing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("44a5dbca-d946-452c-a254-2a835505b41d")
    EList<NamespaceUse> getCausing();

    /**
     * Filtered Getter for relation 'Element->Causing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a1cc1ef2-0a13-4529-865d-35bf9a40c527")
    <T extends NamespaceUse> List<T> getCausing(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Element->AddedToQuery'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d3e94305-3ea6-4472-adcd-11faab1a2c3e")
    EList<QueryDefinition> getAddedToQuery();

    /**
     * Filtered Getter for relation 'Element->AddedToQuery'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f498ee2e-07dc-4a1c-be5b-d0eb0e67ccd2")
    <T extends QueryDefinition> List<T> getAddedToQuery(java.lang.Class<T> filterClass);

}
