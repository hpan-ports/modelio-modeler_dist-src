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
import org.modelio.metamodel.analyst.RequirementContainer;

@objid ("2a1baa12-05dd-4955-bc67-2839831d9bb9")
public interface Requirement extends AnalystElement {
    @objid ("8cf37caa-8de0-44a8-9145-3b1bf4b5808f")
    EList<Requirement> getSubRequirement();

    @objid ("6ac6a322-a34f-4631-806c-483535b8fdd4")
    <T extends Requirement> List<T> getSubRequirement(java.lang.Class<T> filterClass);

    @objid ("04a5fa69-af16-4ff2-881d-a20dc01cd8b9")
    RequirementContainer getOwnerContainer();

    @objid ("5f4796fd-9198-4a26-b8d1-e07b67c605d5")
    void setOwnerContainer(RequirementContainer value);

    @objid ("54d771ff-c10d-4f05-b800-0d1492d80e39")
    Requirement getParentRequirement();

    @objid ("99703459-50e0-421d-8f2d-e59b41cd5481")
    void setParentRequirement(Requirement value);

    @objid ("94012233-1670-4987-9bcc-5e10d4afb023")
    EList<Requirement> getArchivedRequirementVersion();

    @objid ("9e82dbc6-7d43-46b9-9767-65b9301a84dd")
    <T extends Requirement> List<T> getArchivedRequirementVersion(java.lang.Class<T> filterClass);

    @objid ("78454e6c-685b-4f49-90b1-b892a7835e7e")
    Requirement getLastRequirementVersion();

    @objid ("a4d71a30-6b39-494f-9c2b-5dd3ca0e9550")
    void setLastRequirementVersion(Requirement value);

}
