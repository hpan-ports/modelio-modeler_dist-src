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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("009893c4-c4be-1fd8-97fe-001ec947cd2a")
public interface AttributeLink extends ModelElement {
    @objid ("f8521394-638e-4e7a-a6d8-01f8d30a7545")
    String getValue();

    @objid ("f16d2140-1385-4b95-859d-9a7777c6a38d")
    void setValue(String value);

    @objid ("a705d7e7-a3a7-4a28-930c-e37e7e51846c")
    Instance getAttributed();

    @objid ("2637c9e5-54ab-4829-869c-50283a350d0c")
    void setAttributed(Instance value);

    @objid ("17fa2565-30ca-4f25-8197-626b8d7b164e")
    Attribute getBase();

    @objid ("1db219b7-3606-48da-9885-347ba32aef47")
    void setBase(Attribute value);

}
