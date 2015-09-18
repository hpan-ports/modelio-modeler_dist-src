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
package org.modelio.metamodel.uml.behavior.interactionModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.Constraint;

@objid ("0043d1ea-c4bf-1fd8-97fe-001ec947cd2a")
public interface DurationConstraint extends Constraint {
    @objid ("53335b79-e3f6-4796-b3f6-b7a78dd731c8")
    String getDurationMin();

    @objid ("bf44a6a3-3122-43ea-a0d8-3bb82c1830f1")
    void setDurationMin(String value);

    @objid ("58149e44-7d84-40cf-b5e2-b748fb3348ed")
    String getDurationMax();

    @objid ("b823f2ea-f9f1-4fb0-b319-dbebeda0860d")
    void setDurationMax(String value);

}
