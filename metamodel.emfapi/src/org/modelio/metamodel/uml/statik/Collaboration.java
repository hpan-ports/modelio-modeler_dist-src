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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("0003f692-c4bf-1fd8-97fe-001ec947cd2a")
public interface Collaboration extends NameSpace {
    @objid ("b8f43560-2e27-4938-be6f-7bef046e7a9d")
    boolean isIsConcurrent();

    @objid ("b2c389c2-0346-435b-a361-5d2129b99981")
    void setIsConcurrent(boolean value);

    @objid ("fee50aa0-2386-4b48-a79b-b94ad3ded0a1")
    Operation getORepresented();

    @objid ("90ce0b99-17fb-49c3-b63d-8ba08dafa8b1")
    void setORepresented(Operation value);

    @objid ("20497c27-5020-487a-ae90-5041b902ec03")
    Behavior getBRepresented();

    @objid ("a4b888a5-1870-4c37-a408-c188ed98127c")
    void setBRepresented(Behavior value);

    @objid ("80dabab4-1f42-43c6-bbb5-3880d6ce3486")
    EList<CollaborationUse> getOccurrence();

    @objid ("1e7d63d6-94a3-4c5c-9b34-50125c2cd648")
    <T extends CollaborationUse> List<T> getOccurrence(java.lang.Class<T> filterClass);

}
