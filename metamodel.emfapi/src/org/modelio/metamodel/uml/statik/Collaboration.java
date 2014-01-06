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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("0003f692-c4bf-1fd8-97fe-001ec947cd2a")
public interface Collaboration extends NameSpace {
    @objid ("acdd533f-62a9-4ff8-85f7-a2464af72ce2")
    boolean isIsConcurrent();

    @objid ("7741b6a4-8ed2-4876-bc79-2f0e6898a35f")
    void setIsConcurrent(boolean value);

    @objid ("cd89251a-e124-47a9-ae98-0366b814b654")
    Operation getORepresented();

    @objid ("c3574232-35d4-4d16-be50-417185925b4d")
    void setORepresented(Operation value);

    @objid ("2d9b9f83-6b8b-4626-9aae-320f3ffd0ebd")
    Behavior getBRepresented();

    @objid ("9b9593df-21d0-4ccf-9a59-f53d997270ad")
    void setBRepresented(Behavior value);

    @objid ("829b081a-645a-4fe6-97ee-b62360890fbf")
    EList<CollaborationUse> getOccurrence();

    @objid ("497ebd4b-baf9-47a2-9ad0-b0e4cf747eaf")
    <T extends CollaborationUse> List<T> getOccurrence(java.lang.Class<T> filterClass);

}
