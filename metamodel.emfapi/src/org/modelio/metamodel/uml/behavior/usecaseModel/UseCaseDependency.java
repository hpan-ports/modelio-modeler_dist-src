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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0058fd18-c4bf-1fd8-97fe-001ec947cd2a")
public interface UseCaseDependency extends ModelElement {
    @objid ("3d1caa61-5da7-4ee1-8f1e-975566b613ba")
    UseCase getOrigin();

    @objid ("7d179b2c-ebdc-4bda-9ee9-b63f08de6d32")
    void setOrigin(UseCase value);

    @objid ("159152ad-e279-4001-8adb-31423dac7c2d")
    EList<ExtensionPoint> getExtensionLocation();

    @objid ("32a16fcb-466a-43a6-b6aa-dae85657b3f5")
    <T extends ExtensionPoint> List<T> getExtensionLocation(java.lang.Class<T> filterClass);

    @objid ("25d35d81-6193-4958-946b-0b2e8c92e818")
    UseCase getTarget();

    @objid ("8076c2fb-8c88-4cf0-b991-70cdb5a7e633")
    void setTarget(UseCase value);

}
