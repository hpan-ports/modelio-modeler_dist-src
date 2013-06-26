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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Requirement;

@objid ("0ba1c716-f645-446a-a591-f70aa2d0071d")
public interface RequirementContainer extends AnalystContainer {
    @objid ("937c0b37-cf8a-4d7b-9f9c-23ab670203f3")
    EList<Requirement> getOwnedRequirement();

    @objid ("ad3a9786-214d-4322-b421-1bdaffe6de69")
    <T extends Requirement> List<T> getOwnedRequirement(java.lang.Class<T> filterClass);

    @objid ("7d0917a2-6c49-4182-b92b-07795a175e81")
    RequirementContainer getOwnerContainer();

    @objid ("ca4cab20-39a3-4925-a9df-35872d06b846")
    void setOwnerContainer(RequirementContainer value);

    @objid ("df034bb6-52f3-493f-a499-35da20b94453")
    EList<RequirementContainer> getOwnedContainer();

    @objid ("feeaed33-6814-4c0b-9017-9fbc5e322568")
    <T extends RequirementContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass);

    @objid ("8855f3c4-369c-4ca6-9016-f4c7ad10dae1")
    AnalystProject getOwnerProject();

    @objid ("8f01b793-f46a-4b90-b553-177a5707cd34")
    void setOwnerProject(AnalystProject value);

}
