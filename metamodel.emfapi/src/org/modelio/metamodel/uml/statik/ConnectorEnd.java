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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Binding;

@objid ("00068bc8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConnectorEnd extends LinkEnd {
    @objid ("d3d68096-a95e-4957-b733-928ce58e914f")
    EList<Binding> getRepresentation();

    @objid ("8390fc06-ec4f-468c-9e18-ab3ed7afdc36")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("41871b26-245c-4319-a3b1-48d3a4c6f8b1")
    ModelElement getRepresentedFeature();

    @objid ("97e6ea39-5443-4473-a80c-a1945e819a6f")
    void setRepresentedFeature(ModelElement value);

}
