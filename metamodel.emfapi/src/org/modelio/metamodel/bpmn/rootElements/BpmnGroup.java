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
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;

/**
 * BpmnGroup v0.0.9054
 * 
 * 
 * The Group object is an Artifact that provides a visual mechanism to group elements of a diagram informally. The
 * grouping is tied to the Category supporting element . That is, a Group is a visual depiction of a single Category. The graphical elements within the Group will be assigned the Category of the Group. (Note -- Categories can be  ighlighted through other mechanisms, such as color, as defined by a modeler or a modeling tool). Categories, which have  user-defined semantics, can be used for documentation or analysis purposes. For example,
 * FlowElements can be categorized has being customer oriented vs. support oriented. For example, the cost and time of each Category of each Activity can be calculated.
 * Groups are one way in which Categories of objects can be visually displayed on the diagram. That is, a Group is a visual depiction of a single Category. The graphical elements within the Group will be assigned the Category of the
 * Group. The Category name appears on the diagram as the Group label. (Note -- Categories can be highlighted through other mechanisms, such as color, as defined by a modeler or a modeling tool). A single Category can be used for multiple Groups in a diagram.
 */
@objid ("007a3514-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnGroup extends BpmnArtifact {
    @objid ("17a58a4d-e92b-4529-a46c-09baf72bb99d")
    public static final String MNAME = "BpmnGroup";

    /**
     * Getter for attribute 'BpmnGroup.Category'
     * 
     * Metamodel description:
     * <i>specifies the Category that the Group represents (Further details about the definition of a Category can be found on page 92). The name of the Category provides the label for the Group.
     * The graphical elements within the boundaries of the Group will be assigned the Category.</i>
     */
    @objid ("7485ac89-8f09-418f-ba30-76d4f72cd835")
    String getCategory();

    /**
     * Setter for attribute 'BpmnGroup.Category'
     * 
     * Metamodel description:
     * <i>specifies the Category that the Group represents (Further details about the definition of a Category can be found on page 92). The name of the Category provides the label for the Group.
     * The graphical elements within the boundaries of the Group will be assigned the Category.</i>
     */
    @objid ("fb4c5668-03bf-4951-912d-6f6b41f4a098")
    void setCategory(String value);

    /**
     * Getter for relation 'BpmnGroup->Categorized'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5a4dffac-c89b-4dfd-95a8-3a06fb636c95")
    EList<BpmnFlowElement> getCategorized();

    /**
     * Filtered Getter for relation 'BpmnGroup->Categorized'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("39b2b47f-b74a-44ef-b017-ae024e47b4de")
    <T extends BpmnFlowElement> List<T> getCategorized(java.lang.Class<T> filterClass);

}
