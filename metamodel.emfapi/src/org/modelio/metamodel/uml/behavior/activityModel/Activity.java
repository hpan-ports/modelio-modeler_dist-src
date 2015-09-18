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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;

@objid ("0026094e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Activity extends Behavior {
    @objid ("a0c6481f-e350-44ea-8b72-857f72916891")
    boolean isIsSingleExecution();

    @objid ("15cd60d4-b3eb-4604-a158-9bafcf40a7a9")
    void setIsSingleExecution(boolean value);

    @objid ("76f09a0e-f4b1-469b-8826-2e4edcc8ae9f")
    boolean isIsReadOnly();

    @objid ("ce36f357-15f3-4b34-907c-9e0dabde59a3")
    void setIsReadOnly(boolean value);

    @objid ("899fc6f3-da76-4380-9259-616658d4281d")
    EList<ActivityGroup> getOwnedGroup();

    @objid ("6c67bd53-c502-4d65-afa9-40d4dab02a0a")
    <T extends ActivityGroup> List<T> getOwnedGroup(java.lang.Class<T> filterClass);

    @objid ("0dad78a4-e7a3-4d24-9d51-b0fffba912fd")
    EList<ActivityNode> getOwnedNode();

    @objid ("6fed77ee-5e97-4324-bc06-70627e671613")
    <T extends ActivityNode> List<T> getOwnedNode(java.lang.Class<T> filterClass);

}
