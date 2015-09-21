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
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;

/**
 * BpmnResource v0.0.9054
 * 
 * 
 * The Resource class is used to specify resources that can be referenced by Activities or processes or other BPMN elements such as datastores. These Resources can be Human Resources as well as any other resource assigned to Activities during Process execution time.
 * The definition of a Resource is ?abstract,? because it only defines the Resource, without detailing how e.g., actual user IDs are associated at runtime. Multiple Activities can utilize the same Resource.
 * Every Resource can define a set of ResourceParameters. These parameters can be used at runtime to define query e.g., into an Organizational Directory. Every Activity referencing a parameterized Resource can bind values available in the scope of the Activity to these parameters.
 * 
 * Note: M�tamod�le � discutter (rapport avec "Analysis". Ownership � d�finir.
 */
@objid ("00093d64-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResource extends BpmnRootElement {
    @objid ("50271971-aefe-42f1-9e4d-3b836a58ad6e")
    public static final String MNAME = "BpmnResource";

    /**
     * Getter for relation 'BpmnResource->ResourceroleRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6f34b019-7e5c-437a-8642-343572c8fdd1")
    EList<BpmnResourceRole> getResourceroleRefs();

    /**
     * Filtered Getter for relation 'BpmnResource->ResourceroleRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("12099a8c-21bf-42ab-a16f-b0118e501f10")
    <T extends BpmnResourceRole> List<T> getResourceroleRefs(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnResource->Parameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cfa1d638-8b8d-4d08-8d3b-7588ec6e2549")
    EList<BpmnResourceParameter> getParameter();

    /**
     * Filtered Getter for relation 'BpmnResource->Parameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6866f995-78f6-4fd9-b7bd-d8f44cec6a04")
    <T extends BpmnResourceParameter> List<T> getParameter(java.lang.Class<T> filterClass);

}
