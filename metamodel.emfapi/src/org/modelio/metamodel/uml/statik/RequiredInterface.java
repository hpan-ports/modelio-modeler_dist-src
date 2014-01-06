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
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;

@objid ("001b5224-c4bf-1fd8-97fe-001ec947cd2a")
public interface RequiredInterface extends ModelElement {
    @objid ("73f05916-c971-4222-82d3-0b8e04ccfd91")
    EList<Interface> getRequiredElement();

    @objid ("a57700c9-85b0-4a19-a91d-e1bdc132b513")
    <T extends Interface> List<T> getRequiredElement(java.lang.Class<T> filterClass);

    @objid ("d19f12f8-3911-435c-94e3-07ff610701e3")
    EList<LinkEnd> getProvider();

    @objid ("85749d29-09eb-48df-a36b-4a4b5d2fe69d")
    <T extends LinkEnd> List<T> getProvider(java.lang.Class<T> filterClass);

    @objid ("8e7c8d82-2f86-440f-89e1-6d528d855b4a")
    Port getRequiring();

    @objid ("336baf02-28d8-43e5-af58-4f3ae843c4bf")
    void setRequiring(Port value);

    @objid ("bb37bc83-3cbd-49f7-b011-c3f1c9768035")
    EList<NaryLinkEnd> getNaryProvider();

    @objid ("4b458049-47b1-4833-8c53-d6821da67b3d")
    <T extends NaryLinkEnd> List<T> getNaryProvider(java.lang.Class<T> filterClass);

}
