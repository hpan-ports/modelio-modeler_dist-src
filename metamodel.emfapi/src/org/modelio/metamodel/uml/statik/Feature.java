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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("000b00cc-c4bf-1fd8-97fe-001ec947cd2a")
public interface Feature extends ModelElement {
    @objid ("03a6f776-8d65-4760-9d08-3490d8ba8d58")
    VisibilityMode getVisibility();

    @objid ("99570495-6236-4a29-be28-574125f24872")
    void setVisibility(VisibilityMode value);

    @objid ("39fafc18-647d-4ed1-8b11-ca21be2ad760")
    boolean isIsClass();

    @objid ("0f4bf0bf-c5a2-47b7-97a5-f0cad3ef9a20")
    void setIsClass(boolean value);

    @objid ("d5b07c6d-6103-477b-a26a-1901cfcff44c")
    boolean isIsAbstract();

    @objid ("94c04ab3-de32-4d9e-a560-6c9841878998")
    void setIsAbstract(boolean value);

}
