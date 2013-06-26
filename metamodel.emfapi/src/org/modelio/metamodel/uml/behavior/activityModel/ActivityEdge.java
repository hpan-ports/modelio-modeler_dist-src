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
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00270a1a-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityEdge extends ModelElement {
    @objid ("dffaa132-797f-4a70-83f5-137385d379f6")
    String getGuard();

    @objid ("62f7170d-4b9a-432b-a9d0-73dee366637c")
    void setGuard(String value);

    @objid ("f3ed7c6f-e098-4bc3-85d9-b00ffae82375")
    String getWeight();

    @objid ("a670c901-e4fe-4eee-8155-8498e6b29f4d")
    void setWeight(String value);

    @objid ("547642f0-2173-4094-b43e-b4b0c47946e3")
    ActivityNode getTarget();

    @objid ("18bc9295-c4c0-48e9-924e-23f2d271ae3a")
    void setTarget(ActivityNode value);

    @objid ("3b9572a4-f8b9-4b91-90b4-7cd608e0a5e4")
    ActivityNode getSource();

    @objid ("41218fa8-2e04-4978-a90f-eb99a4335301")
    void setSource(ActivityNode value);

    @objid ("cae48487-3320-4b0c-a32f-89e005012a81")
    InterruptibleActivityRegion getInterrupts();

    @objid ("b4b0c006-b780-4314-bf80-1fcf3c1c0736")
    void setInterrupts(InterruptibleActivityRegion value);

    @objid ("ac35315f-1d3b-4dd2-a7ed-6254646c2392")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("0d145be6-cceb-48cc-9cbb-f94b8044357d")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
