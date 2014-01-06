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
    @objid ("619cc122-110c-4797-a63c-0af0da8f6133")
    EList<UseCaseDependency> getUsed();

    @objid ("1c6a86f8-ab0a-46a8-af8d-bcde12db4c0d")
    <T extends UseCaseDependency> List<T> getUsed(java.lang.Class<T> filterClass);

    @objid ("4167fdfd-882e-45fa-a1c5-1167d1e6132e")
    EList<ExtensionPoint> getOwnedExtension();

    @objid ("e6cfae17-5fca-4e38-80f3-198f700512ae")
    <T extends ExtensionPoint> List<T> getOwnedExtension(java.lang.Class<T> filterClass);

    @objid ("ed7fff39-b414-4c3b-b108-ce9a6aca23cb")
    EList<UseCaseDependency> getUser();

    @objid ("1332396e-368b-4a67-a98a-9ee55ff6f10a")
    <T extends UseCaseDependency> List<T> getUser(java.lang.Class<T> filterClass);

}
