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
    @objid ("e5beb030-9c31-4c53-b293-e8dbc9f153a9")
    EList<DiagramSet> getSub();

    @objid ("a386e3dc-fc62-497e-94f3-ff575346279b")
    <T extends DiagramSet> List<T> getSub(java.lang.Class<T> filterClass);

    @objid ("c15e7415-35e9-4c9d-a674-802da0434959")
    DiagramSet getParent();

    @objid ("664eaf8a-be5f-41e5-ab8f-fa54d81232f7")
    void setParent(DiagramSet value);

    @objid ("09fcc139-706a-4d4f-b2d7-e40d2a1efff9")
    EList<AbstractDiagram> getReferencedDiagram();

    @objid ("c9480680-d618-4374-b182-447d841fba87")
    <T extends AbstractDiagram> List<T> getReferencedDiagram(java.lang.Class<T> filterClass);

    @objid ("e681e823-6924-43bc-9b8c-e2d5b37bf0ce")
    Project getOwner();

    @objid ("73a3c05d-b90d-4b9f-a7f9-e86ec826e845")
    void setOwner(Project value);

}
