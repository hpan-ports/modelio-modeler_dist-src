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
package org.modelio.metamodel.uml.infrastructure.matrix;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;

@objid ("6ae11939-6513-44a4-b535-1daf76e27f63")
public interface MatrixValueDefinition extends Element {
    @objid ("3058aabb-03d2-493e-9572-43e6efc5330d")
    ExternProcessor getProcessor();

    @objid ("cb360ae0-ce8a-4d43-8875-2f9048fb3378")
    void setProcessor(ExternProcessor value);

    @objid ("f58594b0-9f99-4fc3-87bf-94354f038650")
    PropertyTable getParameters();

    @objid ("285d1990-6479-4b58-8f2d-ae228e4541c1")
    void setParameters(PropertyTable value);

    @objid ("b6d54dbe-23d9-44bb-afe5-bdd639bfd923")
    MatrixDefinition getMatrix();

    @objid ("b8348eae-4b5f-4286-ab4e-6d4a0b8102c8")
    void setMatrix(MatrixDefinition value);

}
