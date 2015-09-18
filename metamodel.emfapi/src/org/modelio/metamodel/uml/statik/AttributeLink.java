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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("009893c4-c4be-1fd8-97fe-001ec947cd2a")
public interface AttributeLink extends ModelElement {
    @objid ("9330ce9a-4c4a-4dbc-ad1f-367f8086514f")
    String getValue();

    @objid ("b42ef897-6b0c-468e-97c3-d384f0cf4e1c")
    void setValue(String value);

    @objid ("0ad8bd51-79df-41cd-8d23-f3ea87946f1d")
    Instance getAttributed();

    @objid ("da0b80b7-9825-449c-bd5f-312216ee8208")
    void setAttributed(Instance value);

    @objid ("ac396bdf-cb91-46c8-aa21-5aec525107c9")
    Attribute getBase();

    @objid ("0367bf76-457e-4a27-a0a1-3f20dd1ab72b")
    void setBase(Attribute value);

}
