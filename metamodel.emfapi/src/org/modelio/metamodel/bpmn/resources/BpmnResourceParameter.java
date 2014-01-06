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
    @objid ("a5cd9b80-03cc-4587-848e-4890e1c07b0f")
    boolean isIsRequired();

    @objid ("f07e6a26-2994-4daf-a14a-d64dfff3542e")
    void setIsRequired(boolean value);

    @objid ("df78f964-892f-410e-b3bd-0002d903d4bb")
    BpmnResource getResource();

    @objid ("ffd48ffd-0528-415a-8918-8d5addbb3a01")
    void setResource(BpmnResource value);

    @objid ("cd76b667-2aec-4cb5-8a1f-9ef44b952286")
    BpmnItemDefinition getType();

    @objid ("382595da-9ede-4382-a625-b56771038d06")
    void setType(BpmnItemDefinition value);

    @objid ("668eddf9-8fa4-4126-a55c-e95b2e6b8446")
    EList<BpmnResourceParameterBinding> getParameterBindingRefs();

    @objid ("41864664-eafe-41a3-955d-17960207fe6a")
    <T extends BpmnResourceParameterBinding> List<T> getParameterBindingRefs(java.lang.Class<T> filterClass);

}
