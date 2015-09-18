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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.VisibilityMode;

@objid ("000b00cc-c4bf-1fd8-97fe-001ec947cd2a")
public interface Feature extends ModelElement {
    @objid ("5b8d1629-9c71-4f03-ace1-fac3ad3badef")
    VisibilityMode getVisibility();

    @objid ("e2b1cd7c-fa81-4072-9b95-16805f7603e3")
    void setVisibility(VisibilityMode value);

    @objid ("ec04b077-5351-440a-af0e-f67b8c74412e")
    boolean isIsClass();

    @objid ("0b81857e-328a-4549-aa47-dad4c3963c2b")
    void setIsClass(boolean value);

    @objid ("4e011858-66e6-46fb-9d95-fbedf83b201d")
    boolean isIsAbstract();

    @objid ("e900e0e3-3061-48e1-8986-192f917373e4")
    void setIsAbstract(boolean value);

}
