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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("00588716-c4bf-1fd8-97fe-001ec947cd2a")
public interface UseCase extends GeneralClass {
    @objid ("5dd4764a-50a2-406e-9c63-d2a3153bc194")
    EList<UseCaseDependency> getUsed();

    @objid ("ad421931-aeb0-4c42-be1e-34b2f207832d")
    <T extends UseCaseDependency> List<T> getUsed(java.lang.Class<T> filterClass);

    @objid ("de381e14-252f-41f1-8be9-b489dde8bf4d")
    EList<ExtensionPoint> getOwnedExtension();

    @objid ("fcce935b-838c-4a61-aeba-aa1da96c9dd4")
    <T extends ExtensionPoint> List<T> getOwnedExtension(java.lang.Class<T> filterClass);

    @objid ("98348ac7-f97f-4113-bb1b-4ccebb42c7ca")
    EList<UseCaseDependency> getUser();

    @objid ("a1ebc43b-1ca1-47cb-bb77-4714ba83831e")
    <T extends UseCaseDependency> List<T> getUser(java.lang.Class<T> filterClass);

}
