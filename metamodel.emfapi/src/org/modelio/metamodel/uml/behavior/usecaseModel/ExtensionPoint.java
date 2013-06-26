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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("00598058-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExtensionPoint extends ModelElement {
    @objid ("a0075cea-15f4-4d48-ad51-aa8072de31d3")
    VisibilityMode getVisibility();

    @objid ("c953bc7f-6b18-4e38-b2ae-0440aa3c41ed")
    void setVisibility(VisibilityMode value);

    @objid ("3951f7bc-c28b-45d0-a9a4-5ef9f559200b")
    EList<UseCaseDependency> getExtended();

    @objid ("be130047-021e-4650-97d5-569a2bdcb1a6")
    <T extends UseCaseDependency> List<T> getExtended(java.lang.Class<T> filterClass);

    @objid ("6592414b-a364-4b5f-8002-b87d232cf673")
    UseCase getOwner();

    @objid ("331cc32a-ceff-42ee-90f6-54088b06b670")
    void setOwner(UseCase value);

}
