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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("009893c4-c4be-1fd8-97fe-001ec947cd2a")
public interface AttributeLink extends ModelElement {
    @objid ("70b2d0b6-cbb0-4d15-ac5d-fe9660804a03")
    String getValue();

    @objid ("0408ad16-6fc6-4cd5-a04c-81be79f6067f")
    void setValue(String value);

    @objid ("5af35654-03a8-4dd0-b015-f99ed5062cfc")
    Instance getAttributed();

    @objid ("386002e6-112f-4391-b0d3-32aa9b9d1652")
    void setAttributed(Instance value);

    @objid ("873208a0-f10c-4d9b-96a8-90025e497f7d")
    Attribute getBase();

    @objid ("66879fd6-3ec1-445c-9ee0-9d5e619e6f7d")
    void setBase(Attribute value);

}
