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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("0003f692-c4bf-1fd8-97fe-001ec947cd2a")
public interface Collaboration extends NameSpace {
    @objid ("8e6499c0-9e4e-4e91-a7a3-caed787e799e")
    boolean isIsConcurrent();

    @objid ("d30ce4f1-2c83-4845-b034-cbc443547a99")
    void setIsConcurrent(boolean value);

    @objid ("26aa4ae1-abc8-401f-a705-036b6238d7dd")
    Operation getORepresented();

    @objid ("5ccdf660-067f-45c7-8bd0-c5be91f9a58c")
    void setORepresented(Operation value);

    @objid ("e88345b9-c4b6-4514-be21-fcb74ddb5a69")
    Behavior getBRepresented();

    @objid ("a54e1db1-a435-45ca-8e09-0076e8feda12")
    void setBRepresented(Behavior value);

    @objid ("5ff5f04e-57e7-4432-8777-0b10e623b9b2")
    EList<CollaborationUse> getOccurrence();

    @objid ("8413c9e9-395a-420e-9030-d9a71263283a")
    <T extends CollaborationUse> List<T> getOccurrence(java.lang.Class<T> filterClass);

}
