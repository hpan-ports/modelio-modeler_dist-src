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
package org.modelio.metamodel.bpmn.flows;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("007c58ee-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessageFlow extends BpmnBaseElement {
    @objid ("8f1a35e5-d2da-4e6f-a838-f6826431420a")
    BpmnMessage getMessageRef();

    @objid ("b948ee18-d4fa-44aa-a6cc-ffba591c5c2d")
    void setMessageRef(BpmnMessage value);

    @objid ("22c9e8bb-fdda-4d38-9fd4-4dbfcdd247e5")
    BpmnBaseElement getSourceRef();

    @objid ("31f5b2d8-581b-4c94-b618-d35fd8bdf803")
    void setSourceRef(BpmnBaseElement value);

    @objid ("96a2d88b-3951-4162-9fd9-32e16ead2669")
    BpmnBaseElement getTargetRef();

    @objid ("a72fa3d0-ec75-4a98-9a09-b1f785c9dc3d")
    void setTargetRef(BpmnBaseElement value);

    @objid ("8c6aa502-9059-4f1f-8685-759edeae311f")
    BpmnCollaboration getCollaboration();

    @objid ("da0115f1-9b05-4f80-a2d5-d5a338109c24")
    void setCollaboration(BpmnCollaboration value);

}
