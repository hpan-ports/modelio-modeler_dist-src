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
package org.modelio.metamodel.uml.behavior.usecaseModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("00598058-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExtensionPoint extends ModelElement {
    @objid ("1482d94a-b3e3-46a7-9b7c-138aa31fcfb4")
    VisibilityMode getVisibility();

    @objid ("a04e5531-ab7a-4d21-8c7d-68bb465e05b6")
    void setVisibility(VisibilityMode value);

    @objid ("aaeb5d75-1f66-46d3-b409-fa5c19d4106c")
    EList<UseCaseDependency> getExtended();

    @objid ("066923f5-24f8-43ef-9bb1-329d68d60c09")
    <T extends UseCaseDependency> List<T> getExtended(java.lang.Class<T> filterClass);

    @objid ("1a3e6ad5-9744-463d-a3bf-c26932f3a37d")
    UseCase getOwner();

    @objid ("695e0ddd-a911-49da-92a4-758b08eb5d29")
    void setOwner(UseCase value);

}
