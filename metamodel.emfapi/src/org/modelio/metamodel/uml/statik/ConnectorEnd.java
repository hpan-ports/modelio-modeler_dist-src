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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Binding;

@objid ("00068bc8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConnectorEnd extends LinkEnd {
    @objid ("e97d7726-a61c-49b2-a868-2ad1e7e1a503")
    EList<Binding> getRepresentation();

    @objid ("53d706da-303d-4828-b59f-9db150a73dfa")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("2fbd745b-48fc-4813-89a5-c861631044ce")
    ModelElement getRepresentedFeature();

    @objid ("b745c226-1236-4624-ab17-450785c95916")
    void setRepresentedFeature(ModelElement value);

}
