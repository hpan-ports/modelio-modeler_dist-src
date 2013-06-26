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
package org.modelio.metamodel.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;

@objid ("00956d84-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnThrowEvent extends BpmnEvent {
    @objid ("e6398ee1-2867-4b2f-9ad2-06dfc9d3d409")
    EList<BpmnDataAssociation> getDataInputAssociation();

    @objid ("205ef1c1-a83b-4900-941a-1489de706ccd")
    <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass);

    @objid ("50944f48-2dec-454b-9430-dd1604ced96b")
    BpmnDataInput getDataInput();

    @objid ("15241db1-a51c-4032-9d81-da0a4936b531")
    void setDataInput(BpmnDataInput value);

}
