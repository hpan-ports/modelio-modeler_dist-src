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
package org.modelio.metamodel.bpmn.rootElements;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("00772770-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnAssociation extends BpmnArtifact {
    @objid ("8cf5b933-bf09-480f-ba4a-3fd53efc42a9")
    BpmnAssociationDirection getAssociationDirection();

    @objid ("b9bcecdf-5a86-4359-8d6f-412c8f4613a8")
    void setAssociationDirection(BpmnAssociationDirection value);

    @objid ("f073da67-ef5d-45e1-89d5-35b904ece689")
    BpmnBaseElement getTargetRef();

    @objid ("51d50cf4-ce99-4271-8114-4325c1367e56")
    void setTargetRef(BpmnBaseElement value);

    @objid ("9a3b4aaf-5bda-49c5-a1eb-80ddbeb9e99b")
    BpmnBaseElement getSourceRef();

    @objid ("64e06ca5-3f6f-4b17-8253-8b0a0159bc48")
    void setSourceRef(BpmnBaseElement value);

}
