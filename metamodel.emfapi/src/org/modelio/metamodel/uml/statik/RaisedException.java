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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("001a6e72-c4bf-1fd8-97fe-001ec947cd2a")
public interface RaisedException extends ModelElement {
    @objid ("74ac4a6e-3f39-47a8-9777-689982cb5254")
    Classifier getThrownType();

    @objid ("9b35a523-7e5b-49fb-9dd3-87021f669816")
    void setThrownType(Classifier value);

    @objid ("6db7eb5c-8b4f-47d8-a6d6-a816549043af")
    Operation getThrower();

    @objid ("68521542-b8e0-4a3d-8d89-c3c71fcac657")
    void setThrower(Operation value);

}
