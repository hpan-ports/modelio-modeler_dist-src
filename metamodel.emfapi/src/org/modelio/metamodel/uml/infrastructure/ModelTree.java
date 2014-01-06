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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("00891e1c-c4be-1fd8-97fe-001ec947cd2a")
public interface ModelTree extends ModelElement {
    @objid ("8442fe23-92a8-49ac-a1f4-c042cc4a5ff5")
    ModelTree getOwner();

    @objid ("5f13be47-7ec5-4c76-b412-49a5ada82c7c")
    void setOwner(ModelTree value);

    @objid ("afa1985c-a468-4834-8533-e9df66b73398")
    EList<ModelTree> getOwnedElement();

    @objid ("f9bf94a0-2ca4-4443-ba3f-3ba88ab8c09b")
    <T extends ModelTree> List<T> getOwnedElement(java.lang.Class<T> filterClass);

}
