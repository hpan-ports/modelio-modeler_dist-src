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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Binding;

@objid ("00068bc8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConnectorEnd extends LinkEnd {
    @objid ("83f57b77-55b3-4a2a-a1ff-a53103d4abd9")
    EList<Binding> getRepresentation();

    @objid ("84afd737-1039-4960-a39d-3001da2f8cf3")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("f830a275-645e-46d6-94c5-906aceacc728")
    ModelElement getRepresentedFeature();

    @objid ("bc059099-674f-45b3-9961-7a25192e7325")
    void setRepresentedFeature(ModelElement value);

}
