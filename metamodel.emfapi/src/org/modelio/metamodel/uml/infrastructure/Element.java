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
    @objid ("58b97a97-0592-4a0a-955c-467fe34f2a9a")
    EList<AbstractDiagram> getDiagramElement();

    @objid ("8e214478-c665-42d4-b1a1-e37114de695f")
    <T extends AbstractDiagram> List<T> getDiagramElement(java.lang.Class<T> filterClass);

    @objid ("bc6ef83f-cfd2-4482-99f3-90411ba38078")
    EList<NamespaceUse> getCausing();

    @objid ("82b36764-ee05-4449-8f05-88ee1ff3bc11")
    <T extends NamespaceUse> List<T> getCausing(java.lang.Class<T> filterClass);

    @objid ("315ec46a-532a-404e-b868-e9feb5e423aa")
    EList<QueryDefinition> getAddedToQuery();

    @objid ("4526b520-a8c2-4aa0-a11e-f8d2bf32a526")
    <T extends QueryDefinition> List<T> getAddedToQuery(java.lang.Class<T> filterClass);

}
