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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("0005b81a-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataOutput extends BpmnItemAwareElement {
    @objid ("85390dbf-041f-49df-bf30-f27e7b55ee93")
    Parameter getRepresentedParameter();

    @objid ("bb7d3409-9d94-4146-b239-f246912e9f56")
    void setRepresentedParameter(Parameter value);

    @objid ("1a4a9486-5c6c-4c28-afea-c0264cdb348f")
    BpmnActivity getOwnerActivity();

    @objid ("36a4cda1-5e7a-48a6-bee5-074a8dd9ba25")
    void setOwnerActivity(BpmnActivity value);

    @objid ("db18a200-fc73-4f13-94c0-cdab3f3c671e")
    BpmnCatchEvent getCatched();

    @objid ("1a55fbf0-dd8b-4f0e-ad3f-38631b0a3304")
    void setCatched(BpmnCatchEvent value);

    @objid ("61283b19-6ce8-470e-a456-8e86af19b8a1")
    BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics();

    @objid ("1c3525ad-3bdb-4681-a89c-7e68ad8bdd50")
    void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value);

}
