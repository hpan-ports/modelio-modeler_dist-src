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
package org.modelio.metamodel.uml.behavior.usecaseModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("00588716-c4bf-1fd8-97fe-001ec947cd2a")
public interface UseCase extends GeneralClass {
    @objid ("7f5ed782-2183-46b2-9986-54a07241ecfd")
    EList<UseCaseDependency> getUsed();

    @objid ("34807b8c-52d4-49fc-96e6-dfbba8cfed50")
    <T extends UseCaseDependency> List<T> getUsed(java.lang.Class<T> filterClass);

    @objid ("d014638a-a515-45cc-b548-f5b3c52ccf7a")
    EList<ExtensionPoint> getOwnedExtension();

    @objid ("28dc0b85-443e-43dc-b863-9390250a60dd")
    <T extends ExtensionPoint> List<T> getOwnedExtension(java.lang.Class<T> filterClass);

    @objid ("d97fa3f5-0cdb-452a-af41-bbcd85bfa5f1")
    EList<UseCaseDependency> getUser();

    @objid ("daa6fbc9-5446-45a7-9f52-3fdcadb7b8e9")
    <T extends UseCaseDependency> List<T> getUser(java.lang.Class<T> filterClass);

}
