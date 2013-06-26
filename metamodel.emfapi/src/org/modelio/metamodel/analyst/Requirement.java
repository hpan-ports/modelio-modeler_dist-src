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
import org.modelio.metamodel.analyst.RequirementContainer;

@objid ("2a1baa12-05dd-4955-bc67-2839831d9bb9")
public interface Requirement extends AnalystElement {
    @objid ("c30d3781-2aac-43ec-b997-ed5ecb4df78b")
    EList<Requirement> getSubRequirement();

    @objid ("81abff7d-9ecf-4c6e-9747-1c71f415789e")
    <T extends Requirement> List<T> getSubRequirement(java.lang.Class<T> filterClass);

    @objid ("52601762-7400-4456-8548-0d20d76e0afa")
    RequirementContainer getOwnerContainer();

    @objid ("a0d1b507-f83b-4f37-ba56-af7da7e09c0a")
    void setOwnerContainer(RequirementContainer value);

    @objid ("239d7d69-4521-45ba-b138-da6525b1b9bb")
    Requirement getParentRequirement();

    @objid ("28c606a2-5c42-43b2-b001-2967814316c3")
    void setParentRequirement(Requirement value);

}
