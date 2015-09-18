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
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00270a1a-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityEdge extends ModelElement {
    @objid ("170c2143-2298-430c-8d68-59ab8741b286")
    String getGuard();

    @objid ("1258014f-0cc2-4a7d-a02d-307a34071b5d")
    void setGuard(String value);

    @objid ("91e86ba4-db2d-4395-a715-be9e449d1c52")
    String getWeight();

    @objid ("dc2e1336-ac0e-4fef-ba8f-4b462090f732")
    void setWeight(String value);

    @objid ("caaca909-8965-454e-89af-3df9b573db50")
    ActivityNode getTarget();

    @objid ("eb27103d-0c39-46ed-a4bd-258aab5f4b67")
    void setTarget(ActivityNode value);

    @objid ("da5e0cc6-ae15-4b58-9bee-172b6674329e")
    ActivityNode getSource();

    @objid ("7c4de554-4010-4273-83e5-4ae851ab7bb2")
    void setSource(ActivityNode value);

    @objid ("eb3fa8ac-45b5-4bc5-88a3-9f470094c314")
    InterruptibleActivityRegion getInterrupts();

    @objid ("9fdc0903-80c1-43ce-a61f-08966380d2d1")
    void setInterrupts(InterruptibleActivityRegion value);

    @objid ("45c50fef-9a83-4297-8de4-6ea0b66b1b91")
    EList<InformationFlow> getRealizedInformationFlow();

    @objid ("fbab7d6e-806f-4327-b660-0bd11649bc1e")
    <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass);

}
