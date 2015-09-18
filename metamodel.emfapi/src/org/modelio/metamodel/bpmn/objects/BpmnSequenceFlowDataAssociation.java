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
package org.modelio.metamodel.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("00051888-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnSequenceFlowDataAssociation extends BpmnBaseElement {
    @objid ("47c2e6eb-237a-438b-bb95-99c5d1398e63")
    BpmnSequenceFlow getConnected();

    @objid ("f9a37836-131a-480f-84f7-73f99bbc4a54")
    void setConnected(BpmnSequenceFlow value);

    @objid ("d92824c8-5b18-4d7e-a24a-c8943aaccf99")
    EList<BpmnDataAssociation> getDataAssociation();

    @objid ("b712efde-7a4d-4b73-a0e7-038efdb87f76")
    <T extends BpmnDataAssociation> List<T> getDataAssociation(java.lang.Class<T> filterClass);

}
