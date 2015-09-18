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
import org.modelio.metamodel.analyst.RequirementContainer;

@objid ("2a1baa12-05dd-4955-bc67-2839831d9bb9")
public interface Requirement extends AnalystElement {
    @objid ("93ef46ce-ba2d-44e0-9362-e1c64ca37b8e")
    EList<Requirement> getSubRequirement();

    @objid ("d9a077c7-1ef5-406a-9847-09b6c3e1c69c")
    <T extends Requirement> List<T> getSubRequirement(java.lang.Class<T> filterClass);

    @objid ("a132eaba-20fb-49e1-b014-d9cca0bf7ec4")
    RequirementContainer getOwnerContainer();

    @objid ("44758141-5809-4031-bc8f-bb970a4bec45")
    void setOwnerContainer(RequirementContainer value);

    @objid ("66ece3a2-0139-4388-aacc-f58dd132aa2f")
    Requirement getParentRequirement();

    @objid ("c737cd83-4827-48e8-b49e-c1f21706268e")
    void setParentRequirement(Requirement value);

    @objid ("e6c81b0a-3093-4689-8f61-2076080c060f")
    EList<Requirement> getArchivedRequirementVersion();

    @objid ("d8948b8d-ee98-469c-b00a-89438d07b142")
    <T extends Requirement> List<T> getArchivedRequirementVersion(java.lang.Class<T> filterClass);

    @objid ("0c12c15e-e619-4087-80c1-d819343bfb65")
    Requirement getLastRequirementVersion();

    @objid ("233a6943-628e-443f-96f0-5004eb5780f6")
    void setLastRequirementVersion(Requirement value);

}
