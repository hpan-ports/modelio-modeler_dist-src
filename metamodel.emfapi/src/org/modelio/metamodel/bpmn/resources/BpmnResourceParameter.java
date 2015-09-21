/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.bpmn.resources;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

/**
 * BpmnResourceParameter v0.0.9054
 * 
 * 
 * null
 */
@objid ("0009e2dc-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceParameter extends BpmnBaseElement {
    @objid ("13085852-fd65-4750-b53b-42935c08a594")
    public static final String MNAME = "BpmnResourceParameter";

    /**
     * Getter for attribute 'BpmnResourceParameter.IsRequired'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("29c14708-529e-4a20-a3f7-fa9f752cab4f")
    boolean isIsRequired();

    /**
     * Setter for attribute 'BpmnResourceParameter.IsRequired'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c6710555-638b-4357-b086-7c04f8cdbab8")
    void setIsRequired(boolean value);

    /**
     * Getter for relation 'BpmnResourceParameter->Resource'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bc0e027d-bd87-439f-955a-00b9d31feace")
    BpmnResource getResource();

    /**
     * Setter for relation 'BpmnResourceParameter->Resource'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("08550a01-7412-425f-aeff-c863b24e6d15")
    void setResource(BpmnResource value);

    /**
     * Getter for relation 'BpmnResourceParameter->Type'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e5c066f3-8e0d-4757-bfa4-381157676132")
    BpmnItemDefinition getType();

    /**
     * Setter for relation 'BpmnResourceParameter->Type'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("06def4d5-f0ad-4306-bcb6-6a0d7ac1b878")
    void setType(BpmnItemDefinition value);

    /**
     * Getter for relation 'BpmnResourceParameter->ParameterBindingRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("82ef79f6-6d45-4e4f-90eb-79c005f9778e")
    EList<BpmnResourceParameterBinding> getParameterBindingRefs();

    /**
     * Filtered Getter for relation 'BpmnResourceParameter->ParameterBindingRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("977755c5-4a9c-4335-919d-854930ceef7f")
    <T extends BpmnResourceParameterBinding> List<T> getParameterBindingRefs(java.lang.Class<T> filterClass);

}
