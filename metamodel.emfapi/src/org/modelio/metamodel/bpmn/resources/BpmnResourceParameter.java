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
package org.modelio.metamodel.bpmn.resources;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("0009e2dc-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceParameter extends BpmnBaseElement {
    @objid ("28ddf10c-d064-4372-819b-0051a878a4c7")
    boolean isIsRequired();

    @objid ("fec58818-8663-46aa-82b8-46920a14eb5e")
    void setIsRequired(boolean value);

    @objid ("df7f129c-9be8-4e81-837e-d8dba4eaf6c4")
    BpmnResource getResource();

    @objid ("fb88d7f1-9aee-4b80-a55e-c4ed2b79dda0")
    void setResource(BpmnResource value);

    @objid ("51e5e700-c032-4d8c-b795-6a1c66b83e05")
    BpmnItemDefinition getType();

    @objid ("1863614b-0a51-4f2d-b9e1-102b61015bd9")
    void setType(BpmnItemDefinition value);

    @objid ("0732736e-df91-47bc-aa71-5126ba392b22")
    EList<BpmnResourceParameterBinding> getParameterBindingRefs();

    @objid ("05d9a9ee-0f94-441e-b302-c80d8a4817fe")
    <T extends BpmnResourceParameterBinding> List<T> getParameterBindingRefs(java.lang.Class<T> filterClass);

}
