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

@objid ("0005d2fa-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryConnector extends NaryLink {
    @objid ("5cf96a04-f544-4e96-8546-d59ce6d356d6")
    EList<Binding> getRepresentation();

    @objid ("425222a5-c6c6-4019-9ab2-b9fd023a0308")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("65746012-0b60-49f0-bf16-59ab5c19c39c")
    ModelElement getRepresentedFeature();

    @objid ("658d65a8-6711-4989-a2f5-6dbb2fc4464a")
    void setRepresentedFeature(ModelElement value);

}
