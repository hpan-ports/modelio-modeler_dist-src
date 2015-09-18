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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.GenericAnalystElement;

@objid ("57374567-a655-4223-8606-596d9088326b")
public interface GenericAnalystContainer extends AnalystContainer {
    @objid ("add98275-5330-43a8-8571-19b0a6d2d787")
    EList<GenericAnalystElement> getOwnedElement();

    @objid ("837458da-0f2a-461b-b743-6a8794e64442")
    <T extends GenericAnalystElement> List<T> getOwnedElement(java.lang.Class<T> filterClass);

    @objid ("781543d3-0da9-407f-95a0-bea657862d9e")
    GenericAnalystContainer getOwnerContainer();

    @objid ("51d8f1ce-74a5-47b5-a7bc-01e453960125")
    void setOwnerContainer(GenericAnalystContainer value);

    @objid ("5694150e-dd98-4bfd-af31-951ac8f011d3")
    EList<GenericAnalystContainer> getOwnedContainer();

    @objid ("286ada86-26d8-4019-b41d-546396f30a37")
    <T extends GenericAnalystContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("90ee9b09-f99c-4a2e-9aaf-4c13865de7e7")
    AnalystProject getOwnerProject();

    @objid ("898cdb3d-5e66-46c4-9288-acc7f8b0543a")
    void setOwnerProject(AnalystProject value);

}
