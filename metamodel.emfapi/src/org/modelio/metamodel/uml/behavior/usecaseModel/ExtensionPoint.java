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
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("00598058-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExtensionPoint extends ModelElement {
    @objid ("8cd79bbb-ecd1-42e2-aa76-65931c30ac31")
    VisibilityMode getVisibility();

    @objid ("ff1027cb-0861-4c7e-ab3a-78fb1d1f9e72")
    void setVisibility(VisibilityMode value);

    @objid ("226a283f-f896-4c8f-9808-9118942eaa5e")
    EList<UseCaseDependency> getExtended();

    @objid ("620ac3e6-f474-4559-bb18-513a1efc2202")
    <T extends UseCaseDependency> List<T> getExtended(java.lang.Class<T> filterClass);

    @objid ("de6a323e-4e46-410d-9d11-67be1c45a3f3")
    UseCase getOwner();

    @objid ("8554602b-bd7b-4693-90ac-8d1b879e945d")
    void setOwner(UseCase value);

}
