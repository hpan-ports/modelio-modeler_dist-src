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
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;

@objid ("001b5224-c4bf-1fd8-97fe-001ec947cd2a")
public interface RequiredInterface extends ModelElement {
    @objid ("239bfc8a-bed4-47a6-b1f9-9215bc3f8a93")
    EList<Interface> getRequiredElement();

    @objid ("58713459-c7e1-4f49-9ffb-09595ff19366")
    <T extends Interface> List<T> getRequiredElement(java.lang.Class<T> filterClass);

    @objid ("1eba319a-c1e3-4a00-a606-38f8c0368b1d")
    EList<LinkEnd> getProvider();

    @objid ("3c664efc-7bb0-4d60-9745-7fa03069acd0")
    <T extends LinkEnd> List<T> getProvider(java.lang.Class<T> filterClass);

    @objid ("92d0c139-4014-4276-b27b-69bb121fac42")
    Port getRequiring();

    @objid ("c9164e02-863e-405a-a35f-d17b7035f069")
    void setRequiring(Port value);

    @objid ("7c288326-8f4f-4244-9a10-c1f19507ed66")
    EList<NaryLinkEnd> getNaryProvider();

    @objid ("ececd50c-d27e-4097-bcde-9fbf5d2d0cb2")
    <T extends NaryLinkEnd> List<T> getNaryProvider(java.lang.Class<T> filterClass);

}
