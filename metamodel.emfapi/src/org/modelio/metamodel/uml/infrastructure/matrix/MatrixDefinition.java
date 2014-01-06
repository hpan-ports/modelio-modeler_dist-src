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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

@objid ("8a02f9a1-ae38-48d8-8f92-04ce8b6edc5c")
public interface MatrixDefinition extends ModelElement {
    @objid ("5c0b84ec-6c08-4f22-a085-54f76f2848d2")
    QueryDefinition getLinesDefinition();

    @objid ("166871a1-eccd-4f98-8fb2-a4e795de6ad5")
    void setLinesDefinition(QueryDefinition value);

    @objid ("13600580-7d4e-4dc2-b61b-da58bd69d8cb")
    QueryDefinition getColumnsDefinition();

    @objid ("99df4cfb-83d2-41e4-8630-792709c27654")
    void setColumnsDefinition(QueryDefinition value);

    @objid ("618ad855-7ca0-4adc-84a9-60c3a9f77d4a")
    MatrixValueDefinition getValuesDefinition();

    @objid ("905e7e78-8462-40b9-915e-d25702d4d288")
    void setValuesDefinition(MatrixValueDefinition value);

    @objid ("5b1d9b90-dfa4-4049-a5ce-7887761b0318")
    QueryDefinition getDepthDefinition();

    @objid ("2bb8ec3a-1e56-4dad-8693-7ba1dff42a70")
    void setDepthDefinition(QueryDefinition value);

    @objid ("1cb096ab-c3ee-433a-9eb7-7ceebf161e5c")
    ModelElement getOwner();

    @objid ("0431a1d1-8872-42fc-837b-c60637268649")
    void setOwner(ModelElement value);

}
