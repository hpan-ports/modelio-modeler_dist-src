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
package org.modelio.metamodel.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;

@objid ("00956d84-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnThrowEvent extends BpmnEvent {
    @objid ("3b7fc658-78f3-43dc-bb21-c6795e3efd71")
    EList<BpmnDataAssociation> getDataInputAssociation();

    @objid ("dbf52e09-6cb4-48a0-b046-1e6ba6fc3a28")
    <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass);

    @objid ("62257d9a-3f93-4723-84e7-2eb775a181ea")
    BpmnDataInput getDataInput();

    @objid ("139892c4-0d0a-4ec0-b479-86ef81871b23")
    void setDataInput(BpmnDataInput value);

}
