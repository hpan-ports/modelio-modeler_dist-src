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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

/**
 * BpmnAssociation v0.0.9054
 * 
 * 
 * An Association is used to associate information and Artifacts with Flow Objects. Text and graphical non-Flow Objects can be associated with the Flow Objects and Flow. An Association is also used to show the Activity used for
 * compensation. 
 * 
 * Within Modelio, Text Annotation is implemented by Notes: association is thus not used to connect Notes to Model elements.
 */
@objid ("00772770-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnAssociation extends BpmnArtifact {
    @objid ("62986613-e6fd-4626-9258-94f70d298819")
    public static final String MNAME = "BpmnAssociation";

    /**
     * Getter for attribute 'BpmnAssociation.AssociationDirection'
     * 
     * Metamodel description:
     * <i>associationDirection is an attribute that defines whether or not the Association shows any directionality with an arrowhead. 
     * The default is None (no arrowhead). 
     * A value of One means that the arrowhead SHALL be at the Target Object. 
     * A value of Both means that there SHALL be an arrowhead at both ends of the Association line.</i>
     */
    @objid ("d5f2ee56-eafb-48f3-b2f4-17543bd5d9a7")
    BpmnAssociationDirection getAssociationDirection();

    /**
     * Setter for attribute 'BpmnAssociation.AssociationDirection'
     * 
     * Metamodel description:
     * <i>associationDirection is an attribute that defines whether or not the Association shows any directionality with an arrowhead. 
     * The default is None (no arrowhead). 
     * A value of One means that the arrowhead SHALL be at the Target Object. 
     * A value of Both means that there SHALL be an arrowhead at both ends of the Association line.</i>
     */
    @objid ("2c9d75c9-46e6-483a-9e6b-7458e1c699f5")
    void setAssociationDirection(BpmnAssociationDirection value);

    /**
     * Getter for relation 'BpmnAssociation->TargetRef'
     * 
     * Metamodel description:
     * <i>The BaseElement that the Association is connecting to.</i>
     */
    @objid ("08e4a8db-e894-41b5-a809-2709994c6729")
    BpmnBaseElement getTargetRef();

    /**
     * Setter for relation 'BpmnAssociation->TargetRef'
     * 
     * Metamodel description:
     * <i>The BaseElement that the Association is connecting to.</i>
     */
    @objid ("b7172c24-28fe-4271-9a53-f6e4b0e3e982")
    void setTargetRef(BpmnBaseElement value);

    /**
     * Getter for relation 'BpmnAssociation->SourceRef'
     * 
     * Metamodel description:
     * <i>The BaseElement that the Association is connecting from.</i>
     */
    @objid ("b84b3238-35c7-496c-a4cc-0315e8569f1e")
    BpmnBaseElement getSourceRef();

    /**
     * Setter for relation 'BpmnAssociation->SourceRef'
     * 
     * Metamodel description:
     * <i>The BaseElement that the Association is connecting from.</i>
     */
    @objid ("05e0709c-6435-4eaa-bc48-e72ae4026798")
    void setSourceRef(BpmnBaseElement value);

}
