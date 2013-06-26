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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00047d6a-c4bf-1fd8-97fe-001ec947cd2a")
public interface CollaborationUse extends ModelElement {
    @objid ("20c9dcd1-d8c3-4e25-9b28-c3d7a1b4951e")
    Collaboration getType();

    @objid ("8f4d71a4-5c46-4ed3-bb9e-c65edb564f48")
    void setType(Collaboration value);

    @objid ("63970105-ddbb-41bd-a443-bf339198444e")
    NameSpace getNRepresented();

    @objid ("8db73d37-b4fb-4302-a615-7b7afc621ecc")
    void setNRepresented(NameSpace value);

    @objid ("cd524a55-e699-45d6-9721-089d64c9be4e")
    Operation getORepresented();

    @objid ("c744d5ef-461b-405d-b4dc-b50167f5b60b")
    void setORepresented(Operation value);

    @objid ("1dc93094-992b-427f-8dd0-9f54708b93ab")
    EList<Binding> getRoleBinding();

    @objid ("108115ce-c0a2-44f2-a206-b808e9ad4396")
    <T extends Binding> List<T> getRoleBinding(java.lang.Class<T> filterClass);

}
