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
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00270a1a-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityEdge extends ModelElement {
    @objid ("eaa557eb-9640-4bb9-964d-496d0d1274b6")
    String getGuard();

    @objid ("04ba39bf-f4c3-4324-8e09-660ea6632bb2")
    void setGuard(String value);

    @objid ("81a5365b-9b48-40d2-b0f9-089376f8717e")
    String getWeight();

    @objid ("d52b126c-267d-4755-8714-decedc6ad378")
    void setWeight(String value);

    @objid ("9cb54b8e-dce5-476b-96ca-d1c54652279d")
    ActivityNode getTarget();

    @objid ("e2233571-dac8-458d-b262-96bdc99ff61d")
    void setTarget(ActivityNode value);

    @objid ("ae46a93e-5aaf-4968-87af-e9f077b000d0")
    ActivityNode getSource();

    @objid ("56bfd9b9-6a1d-4539-9722-f92df3685a97")
    void setSource(ActivityNode value);

    @objid ("23582339-b51b-4b5a-88ab-f194e407bba6")
    InterruptibleActivityRegion getInterrupts();

    @objid ("28bb639f-05fd-4556-b128-76a0887fe5da")
    void setInterrupts(InterruptibleActivityRegion value);

    @objid ("f1124824-5c5b-45b4-a8fb-7eb3a1e96f1f")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("08822536-68cb-4ff1-acad-3fdc6e9318c7")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
