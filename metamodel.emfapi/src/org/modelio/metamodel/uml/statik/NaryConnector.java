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

@objid ("0005d2fa-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryConnector extends NaryLink {
    @objid ("6c4a3ed3-8cd4-495c-8b0e-b30dca16d2b1")
    EList<Binding> getRepresentation();

    @objid ("01dd6e16-bfa8-4da6-b24d-843a393c07ca")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    @objid ("20c0a369-fa4c-4b71-a7a7-cd17a9796fd4")
    ModelElement getRepresentedFeature();

    @objid ("65f5e079-1e5c-469f-91f0-74a352487d69")
    void setRepresentedFeature(ModelElement value);

}
