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
package org.modelio.metamodel.bpmn.activities;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;

@objid ("0084bb4c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnTask extends BpmnActivity {
    @objid ("51b0db9d-4dd3-4a98-a306-0805f4125a95")
    boolean isIsGlobal();

    @objid ("7f5701f5-3cfb-47e8-b38f-ee3ff3a54719")
    void setIsGlobal(boolean value);

    @objid ("0a631fb7-f5c1-4211-838e-46fb65fff2f7")
    EList<BpmnCallActivity> getCaller();

    @objid ("5916814c-cc74-4f4f-8fd5-5714361e6705")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

}
