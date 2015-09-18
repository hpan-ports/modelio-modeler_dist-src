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
import org.modelio.metamodel.analyst.Requirement;

@objid ("0ba1c716-f645-446a-a591-f70aa2d0071d")
public interface RequirementContainer extends AnalystContainer {
    @objid ("6527f97e-e43f-4e6d-82f0-e5abceda5b16")
    EList<Requirement> getOwnedRequirement();

    @objid ("e1f7309a-9482-439a-b930-a79400cb4eab")
    <T extends Requirement> List<T> getOwnedRequirement(java.lang.Class<T> filterClass);

    @objid ("abf76185-d654-4acf-b12e-39b895559ff9")
    RequirementContainer getOwnerContainer();

    @objid ("896dd5ce-e735-4819-b2f4-72ac846f0022")
    void setOwnerContainer(RequirementContainer value);

    @objid ("0ab2e916-0eb8-4801-aaac-b282559f5fe7")
    EList<RequirementContainer> getOwnedContainer();

    @objid ("686a3916-532c-4134-816c-f693d7f221fc")
    <T extends RequirementContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("d4a52311-10cc-43b6-98da-e83eb3b7fae4")
    AnalystProject getOwnerProject();

    @objid ("651f656b-3aba-4f55-a664-687281521c84")
    void setOwnerProject(AnalystProject value);

}
