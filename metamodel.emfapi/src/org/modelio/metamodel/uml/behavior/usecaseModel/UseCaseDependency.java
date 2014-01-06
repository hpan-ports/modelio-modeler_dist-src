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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0058fd18-c4bf-1fd8-97fe-001ec947cd2a")
public interface UseCaseDependency extends ModelElement {
    @objid ("704b84b6-7dcd-44db-aaae-d7255ad70ad3")
    UseCase getOrigin();

    @objid ("f250c123-5bf7-4bf2-b955-094dfe2254eb")
    void setOrigin(UseCase value);

    @objid ("add6984f-c9cd-44fd-8af3-527b4b16ba00")
    EList<ExtensionPoint> getExtensionLocation();

    @objid ("128c5b8b-e38d-41c7-aefb-261cb22ae6af")
    <T extends ExtensionPoint> List<T> getExtensionLocation(java.lang.Class<T> filterClass);

    @objid ("c10aa049-95b4-4828-8e18-bce24a86ef98")
    UseCase getTarget();

    @objid ("05f10201-7f76-438d-94f3-f3bea762d9bd")
    void setTarget(UseCase value);

}
