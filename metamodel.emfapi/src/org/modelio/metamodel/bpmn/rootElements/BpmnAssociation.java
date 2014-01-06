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
package org.modelio.metamodel.bpmn.rootElements;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("00772770-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnAssociation extends BpmnArtifact {
    @objid ("5d9e24e5-8c59-4f0a-9a72-85e4d4fdf7a9")
    BpmnAssociationDirection getAssociationDirection();

    @objid ("93d3a27f-b13b-452b-868f-e086ebf397ca")
    void setAssociationDirection(BpmnAssociationDirection value);

    @objid ("9ecf36cd-029d-4bc7-980d-f21cc006febd")
    BpmnBaseElement getTargetRef();

    @objid ("8eed1e1e-a60f-4137-a4a7-306536ff12cf")
    void setTargetRef(BpmnBaseElement value);

    @objid ("15dead0b-3e8d-4098-a236-cfd13a00ca52")
    BpmnBaseElement getSourceRef();

    @objid ("b2141de7-6c89-4eb0-98d0-c0f198a7efb4")
    void setSourceRef(BpmnBaseElement value);

}
