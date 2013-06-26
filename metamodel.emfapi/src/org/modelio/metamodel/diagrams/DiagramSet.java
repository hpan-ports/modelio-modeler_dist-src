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
    @objid ("da9d2686-7568-44e9-b3be-63e5bfbcce8b")
    EList<DiagramSet> getSub();

    @objid ("3fe3b94f-40cc-4b05-9b0a-e79d8e4c032c")
    <T extends DiagramSet> List<T> getSub(java.lang.Class<T> filterClass);

    @objid ("be449d1b-79f5-4023-b929-a99c2fbf5afe")
    DiagramSet getParent();

    @objid ("9842f3a5-0b80-45eb-9e35-8136f19cbb74")
    void setParent(DiagramSet value);

    @objid ("9a1c6889-8856-4e77-baeb-d38dcbb510c1")
    EList<AbstractDiagram> getReferencedDiagram();

    @objid ("bff8cd50-1bec-4a5f-b1f3-855a4102c7ac")
    <T extends AbstractDiagram> List<T> getReferencedDiagram(java.lang.Class<T> filterClass);

    @objid ("d6a96337-cf90-4469-90e6-b24a898ab312")
    Project getOwner();

    @objid ("dad4caf7-c3a6-49ca-bf7f-10377430efad")
    void setOwner(Project value);

}
