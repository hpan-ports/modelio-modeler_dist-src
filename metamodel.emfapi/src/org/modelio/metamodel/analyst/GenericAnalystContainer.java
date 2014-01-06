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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.GenericAnalystElement;

@objid ("57374567-a655-4223-8606-596d9088326b")
public interface GenericAnalystContainer extends AnalystContainer {
    @objid ("b26001b1-e4e5-4690-9d13-7f3d34c9336e")
    EList<GenericAnalystElement> getOwnedElement();

    @objid ("ccdaf086-f881-4b58-9bee-c8d2b5f7ecdd")
    <T extends GenericAnalystElement> List<T> getOwnedElement(java.lang.Class<T> filterClass);

    @objid ("dac9d800-f1ac-454c-847c-fcd210e75009")
    GenericAnalystContainer getOwnerContainer();

    @objid ("1576f8f9-4f6e-46af-97e6-be901dc72213")
    void setOwnerContainer(GenericAnalystContainer value);

    @objid ("48f567eb-39ed-4145-9524-9cecc8730b25")
    EList<GenericAnalystContainer> getOwnedContainer();

    @objid ("33e05f01-f282-4f10-83ed-9ad258a7bb63")
    <T extends GenericAnalystContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("c8bd6810-3850-487e-934c-883dd8da918c")
    AnalystProject getOwnerProject();

    @objid ("79f8e8f3-09a6-4806-a8f8-a486ea9be6bb")
    void setOwnerProject(AnalystProject value);

}
