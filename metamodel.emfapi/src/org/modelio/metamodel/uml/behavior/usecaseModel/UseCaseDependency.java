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
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0058fd18-c4bf-1fd8-97fe-001ec947cd2a")
public interface UseCaseDependency extends ModelElement {
    @objid ("cb2961f2-daae-43c4-b970-ca94b53f3578")
    UseCase getOrigin();

    @objid ("410cee66-c682-4c59-8126-9665f3d38459")
    void setOrigin(UseCase value);

    @objid ("9ccbe7a8-b131-44b4-93c5-3feaac635f6e")
    EList<ExtensionPoint> getExtensionLocation();

    @objid ("43cc4357-a401-4ddd-8c6d-08069ace0c54")
    <T extends ExtensionPoint> List<T> getExtensionLocation(java.lang.Class<T> filterClass);

    @objid ("12d090cf-b987-4bb5-8886-3393a9fcc1d8")
    UseCase getTarget();

    @objid ("e06c3cb3-aa28-4117-aaec-7a701b684d48")
    void setTarget(UseCase value);

}
