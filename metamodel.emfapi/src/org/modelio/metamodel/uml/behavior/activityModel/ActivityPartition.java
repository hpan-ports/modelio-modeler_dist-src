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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0029d8f8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityPartition extends ActivityGroup {
    @objid ("14e4653a-da55-43d1-bfe0-c22101f45c84")
    boolean isIsDimension();

    @objid ("679b5b42-690c-4ef1-a0cd-9594559d7311")
    void setIsDimension(boolean value);

    @objid ("49c27e54-e30a-483d-91fb-e1a96157c77b")
    boolean isIsExternal();

    @objid ("70fe9112-7865-4e5e-9021-b5415cd40012")
    void setIsExternal(boolean value);

    @objid ("6fc75f72-9e43-40ec-af03-4154d8f293f8")
    ModelElement getRepresented();

    @objid ("ef6f174b-2063-46fd-9da2-e1b4f145dfe1")
    void setRepresented(ModelElement value);

    @objid ("6692ee4d-7282-42d5-941f-c0f2c307dbc3")
    EList<ActivityNode> getContainedNode();

    @objid ("3d59708c-a0d0-45f9-b0c8-2428e33007d4")
    <T extends ActivityNode> List<T> getContainedNode(java.lang.Class<T> filterClass);

    @objid ("a43374e3-2dda-4fac-b361-e17fa6198a43")
    EList<MessageFlow> getOutgoing();

    @objid ("2f5c1881-ec3d-44e8-8ebb-1f8d5bfa5984")
    <T extends MessageFlow> List<T> getOutgoing(java.lang.Class<T> filterClass);

    @objid ("0d298e86-c057-47a6-a8c6-5c349f4286fe")
    ActivityPartition getSuperPartition();

    @objid ("8f51aaca-7237-406b-856c-bba443d9e0b0")
    void setSuperPartition(ActivityPartition value);

    @objid ("ec9d7a5a-b86e-46e8-aa1a-5de1c5213eda")
    EList<ActivityPartition> getSubPartition();

    @objid ("c4b27ecb-80dd-4274-be20-93cd78b2e494")
    <T extends ActivityPartition> List<T> getSubPartition(java.lang.Class<T> filterClass);

    @objid ("46d5df67-24cd-485a-9ebe-ca06fe3f81d5")
    EList<MessageFlow> getIncoming();

    @objid ("8e04426a-34b9-456b-96f2-8a0665aae376")
    <T extends MessageFlow> List<T> getIncoming(java.lang.Class<T> filterClass);

}
