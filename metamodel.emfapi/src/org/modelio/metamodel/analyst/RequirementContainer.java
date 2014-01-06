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
import org.modelio.metamodel.analyst.Requirement;

@objid ("0ba1c716-f645-446a-a591-f70aa2d0071d")
public interface RequirementContainer extends AnalystContainer {
    @objid ("7defe8be-f487-4bd9-bf7a-e474e48c28bd")
    EList<Requirement> getOwnedRequirement();

    @objid ("5b4b7d9e-eff9-495d-b389-aa7ac737af0b")
    <T extends Requirement> List<T> getOwnedRequirement(java.lang.Class<T> filterClass);

    @objid ("4ec13ad1-937c-4f72-95e8-ec3b7907e5d9")
    RequirementContainer getOwnerContainer();

    @objid ("773c501d-affe-4688-abe4-4778dd4aadd3")
    void setOwnerContainer(RequirementContainer value);

    @objid ("bed8471d-0559-4c7e-a892-e931e613a1dd")
    EList<RequirementContainer> getOwnedContainer();

    @objid ("6b588194-4324-41c2-9d6f-f8c80af56712")
    <T extends RequirementContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("d08e1a77-bd5c-470d-a0dc-2bf56ddf6649")
    AnalystProject getOwnerProject();

    @objid ("49045850-1a69-4305-8a29-655eefd71d4b")
    void setOwnerProject(AnalystProject value);

}
