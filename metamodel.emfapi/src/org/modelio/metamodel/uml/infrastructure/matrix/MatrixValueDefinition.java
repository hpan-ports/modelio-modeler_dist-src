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
    @objid ("8585915d-6d5b-4355-b7c1-10ebcce2fde2")
    ExternProcessor getProcessor();

    @objid ("3f1b8549-bded-4791-a066-a9f88807dae2")
    void setProcessor(ExternProcessor value);

    @objid ("e8e3cac2-bcca-4687-b36b-8d87648cd3ed")
    PropertyTable getParameters();

    @objid ("b016bc8c-78a2-4495-88fd-384f80c37cd2")
    void setParameters(PropertyTable value);

    @objid ("df7e5546-7530-4861-a4cc-bdc4936284ad")
    MatrixDefinition getMatrix();

    @objid ("1053e455-e29e-47aa-8e38-13f512888924")
    void setMatrix(MatrixDefinition value);

}
