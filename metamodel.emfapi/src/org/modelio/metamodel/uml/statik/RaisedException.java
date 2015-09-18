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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("001a6e72-c4bf-1fd8-97fe-001ec947cd2a")
public interface RaisedException extends ModelElement {
    @objid ("304b7f51-429c-4efc-aebb-fd24309af2d7")
    Classifier getThrownType();

    @objid ("b3c00961-dfd2-4c32-8535-2eb0574e357e")
    void setThrownType(Classifier value);

    @objid ("45715d13-af97-459a-b5c9-3dcfe908a208")
    Operation getThrower();

    @objid ("43a1ca48-38bb-4ad5-a5d3-9e26bdf48655")
    void setThrower(Operation value);

}
