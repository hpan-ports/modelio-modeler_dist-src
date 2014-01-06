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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0029d8f8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityPartition extends ActivityGroup {
    @objid ("4ed7971d-9eb9-4308-ae98-73d23bf5c864")
    boolean isIsDimension();

    @objid ("21729afd-3e96-4608-b93c-1aca8d8c227a")
    void setIsDimension(boolean value);

    @objid ("be7ce4c0-0faa-4846-8259-44435b1c7170")
    boolean isIsExternal();

    @objid ("2f41155d-9608-4d84-a53f-96445e32d92b")
    void setIsExternal(boolean value);

    @objid ("dfbd3750-a04e-428b-bfb0-d31261de0deb")
    ModelElement getRepresented();

    @objid ("4f8ca295-56a5-4bef-8d7a-5c64cfe707aa")
    void setRepresented(ModelElement value);

    @objid ("1a43d002-37fd-4222-9361-84a97b5ab3ca")
    EList<ActivityNode> getContainedNode();

    @objid ("da87c6ef-55c5-4a45-9834-e48baf9d4f69")
    <T extends ActivityNode> List<T> getContainedNode(java.lang.Class<T> filterClass);

    @objid ("345def31-0dd4-4118-9af6-cd62e463f0ea")
    EList<MessageFlow> getOutgoing();

    @objid ("a4e92617-0ece-4e1a-a43c-83685885d2be")
    <T extends MessageFlow> List<T> getOutgoing(java.lang.Class<T> filterClass);

    @objid ("b2f3451a-5310-430a-9f60-30d231cd63d5")
    ActivityPartition getSuperPartition();

    @objid ("c5982fc6-c1ad-45f2-b7b3-e29660bee927")
    void setSuperPartition(ActivityPartition value);

    @objid ("a242ad4c-ea5e-4fe6-b5a0-6cc5212f2754")
    EList<ActivityPartition> getSubPartition();

    @objid ("c954f214-3b15-41b8-96e2-643d44dedf5d")
    <T extends ActivityPartition> List<T> getSubPartition(java.lang.Class<T> filterClass);

    @objid ("3b5aa61e-7a4d-4de1-9255-20f5fecb7ba0")
    EList<MessageFlow> getIncoming();

    @objid ("02749ea2-671a-43c5-b805-3c5f0d7b100b")
    <T extends MessageFlow> List<T> getIncoming(java.lang.Class<T> filterClass);

}
