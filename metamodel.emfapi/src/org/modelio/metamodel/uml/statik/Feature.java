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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("000b00cc-c4bf-1fd8-97fe-001ec947cd2a")
public interface Feature extends ModelElement {
    @objid ("d824c2d0-976e-49b2-8332-ab858a780ed9")
    VisibilityMode getVisibility();

    @objid ("a107f946-eb43-4ba4-92c2-c0f86cd4f28d")
    void setVisibility(VisibilityMode value);

    @objid ("1541784f-0d18-48ae-9449-1614e0eeecdf")
    boolean isIsClass();

    @objid ("3382cf59-39e8-4a33-8b47-da1e422ea247")
    void setIsClass(boolean value);

    @objid ("3ee146c5-5392-472d-b85a-a423de8e6eab")
    boolean isIsAbstract();

    @objid ("25131e30-ae51-461e-be78-6bd44568e9db")
    void setIsAbstract(boolean value);

}
