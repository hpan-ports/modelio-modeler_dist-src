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
package org.modelio.metamodel.diagrams;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * DiagramSet v0.0.9054
 * 
 * 
 * null
 */
@objid ("006e175c-c4bf-1fd8-97fe-001ec947cd2a")
public interface DiagramSet extends ModelElement {
    @objid ("52233f00-61f9-4510-a830-f0ebf484e907")
    public static final String MNAME = "DiagramSet";

    /**
     * Getter for relation 'DiagramSet->Sub'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0d14add3-92b6-4487-8c9a-278658e3d015")
    EList<DiagramSet> getSub();

    /**
     * Filtered Getter for relation 'DiagramSet->Sub'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3bde7698-e644-4290-a1b4-ac6d73a61608")
    <T extends DiagramSet> List<T> getSub(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'DiagramSet->Parent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2bd3079b-c91e-47e7-bc34-5f94907b240a")
    DiagramSet getParent();

    /**
     * Setter for relation 'DiagramSet->Parent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4963e6bf-9c62-482d-9df0-10ab045fe619")
    void setParent(DiagramSet value);

    /**
     * Getter for relation 'DiagramSet->ReferencedDiagram'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b3a94a3d-6706-40ed-94c7-41b661fa6c40")
    EList<AbstractDiagram> getReferencedDiagram();

    /**
     * Filtered Getter for relation 'DiagramSet->ReferencedDiagram'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("22908732-8d33-4abb-85b4-f3b6758331d5")
    <T extends AbstractDiagram> List<T> getReferencedDiagram(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'DiagramSet->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3b099b97-85ac-4937-ab58-1041727f29b1")
    Project getOwner();

    /**
     * Setter for relation 'DiagramSet->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("768e3ed3-6219-49c8-bfc5-e7eff2daa397")
    void setOwner(Project value);

}
