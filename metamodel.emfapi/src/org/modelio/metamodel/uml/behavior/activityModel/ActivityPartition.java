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
    @objid ("fe0dfe95-08e6-47de-91f8-4c38e934efd4")
    boolean isIsDimension();

    @objid ("e2dfb63a-65dd-44bd-93eb-87c2e3239d8f")
    void setIsDimension(boolean value);

    @objid ("702fd2ba-3a64-4247-b348-14e81e76ed91")
    boolean isIsExternal();

    @objid ("616ba9d5-bd78-4468-984d-3a7660c29b03")
    void setIsExternal(boolean value);

    @objid ("88b72504-911d-4cd1-9e9c-74405d1de993")
    ModelElement getRepresented();

    @objid ("2a180e2d-648c-40db-ad0d-5e5f8ff15163")
    void setRepresented(ModelElement value);

    @objid ("223d6ec7-d43a-4fc4-bbf7-a81b9c6fa5f9")
    EList<ActivityNode> getContainedNode();

    @objid ("6800a350-02a8-464c-9d5e-69ab405857aa")
    <T extends ActivityNode> List<T> getContainedNode(java.lang.Class<T> filterClass);

    @objid ("6aa57d34-51c0-4c81-85e0-5afb427cb4f0")
    EList<MessageFlow> getOutgoing();

    @objid ("bf170fed-ad72-4ced-8c80-38074d8f7454")
    <T extends MessageFlow> List<T> getOutgoing(java.lang.Class<T> filterClass);

    @objid ("afe2e7b9-1de4-4450-8684-146471cf7f56")
    ActivityPartition getSuperPartition();

    @objid ("76df5eab-8031-48b7-b118-d2fa62f643d3")
    void setSuperPartition(ActivityPartition value);

    @objid ("33799dd0-ce77-49b5-b422-c3719a0dd139")
    EList<ActivityPartition> getSubPartition();

    @objid ("5bba803a-abd6-45f8-9575-019945df16e9")
    <T extends ActivityPartition> List<T> getSubPartition(java.lang.Class<T> filterClass);

    @objid ("1978e06d-69e1-4344-9d17-37e506ecaf49")
    EList<MessageFlow> getIncoming();

    @objid ("61fcb88f-3a3b-4a78-a653-460daaabcaf0")
    <T extends MessageFlow> List<T> getIncoming(java.lang.Class<T> filterClass);

}
