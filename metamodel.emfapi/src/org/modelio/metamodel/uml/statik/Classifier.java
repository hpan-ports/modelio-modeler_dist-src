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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.RaisedException;

/**
 * Classifier v0.0.9054
 * 
 * 
 * A Classifier is an abstract view of the most important metaclasses such as Class, UseCase, Actor, Component and Node. 
 * 
 * A Classifier notably factorizes the aggregation to Features. The Classifier can act as a structured Classifier (as defined in UML 2.0). In this case, its internal structure, which expresses its configuration in terms of Parts and Ports, is defined through a dedicated Collaboration. 
 * 
 * A Classifier is owned by a NameSpace.
 */
@objid ("0003645c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Classifier extends NameSpace {
    @objid ("4c3a8e24-7db5-4422-b59b-c863ed24add1")
    public static final String MNAME = "Classifier";

    /**
     * Getter for relation 'Classifier->OwnedOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("70062830-3bcd-45e7-8dc1-d0ed535a0def")
    EList<Operation> getOwnedOperation();

    /**
     * Filtered Getter for relation 'Classifier->OwnedOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5784fb5e-ebad-436c-8874-bd30bccadf21")
    <T extends Operation> List<T> getOwnedOperation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->Representation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8b16d444-ba86-4554-9eed-288f8e47597d")
    EList<InformationItem> getRepresentation();

    /**
     * Filtered Getter for relation 'Classifier->Representation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4fa41481-1e52-4e13-a3cf-1d6df050d762")
    <T extends InformationItem> List<T> getRepresentation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->Substitued'
     * 
     * Metamodel description:
     * <i>Specifies the Classifier to which it can be substituted.</i>
     */
    @objid ("7833831c-5ef3-4e49-ab29-3691f40c6a46")
    EList<Substitution> getSubstitued();

    /**
     * Filtered Getter for relation 'Classifier->Substitued'
     * 
     * Metamodel description:
     * <i>Specifies the Classifier to which it can be substituted.</i>
     */
    @objid ("f8c429d0-2eff-4239-a987-25f53d7c1082")
    <T extends Substitution> List<T> getSubstitued(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->OwnedAttribute'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a52befcd-0cdd-4522-a962-dbdb3d518106")
    EList<Attribute> getOwnedAttribute();

    /**
     * Filtered Getter for relation 'Classifier->OwnedAttribute'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6f915110-1eac-480c-a069-045c4c12e36d")
    <T extends Attribute> List<T> getOwnedAttribute(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->OwnedNaryEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ad5d6d42-d727-422a-9b99-2331f7ef1c16")
    EList<NaryAssociationEnd> getOwnedNaryEnd();

    /**
     * Filtered Getter for relation 'Classifier->OwnedNaryEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("57e3b4a5-b23b-40ed-a906-b8aa72180959")
    <T extends NaryAssociationEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->Conveyer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e9fe4087-b915-447b-889b-12052ceab53e")
    EList<InformationFlow> getConveyer();

    /**
     * Filtered Getter for relation 'Classifier->Conveyer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b007a09b-e193-4267-9d65-4d529ab2c1c7")
    <T extends InformationFlow> List<T> getConveyer(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->SubstitutingSubstitution'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0aa7fee8-2cdb-400b-95c4-0eddc3da8255")
    EList<Substitution> getSubstitutingSubstitution();

    /**
     * Filtered Getter for relation 'Classifier->SubstitutingSubstitution'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("28dd31ee-dba0-42db-b733-8a64245de9ef")
    <T extends Substitution> List<T> getSubstitutingSubstitution(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->TargetingEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6247b8e4-9ddc-4ad0-8dcb-9887aacaac36")
    EList<AssociationEnd> getTargetingEnd();

    /**
     * Filtered Getter for relation 'Classifier->TargetingEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1a3c485f-7ddd-4f4a-a737-b19be4138ad1")
    <T extends AssociationEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->OwnedEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("85ac8f75-eb2f-448f-a58d-af1eb960618f")
    EList<AssociationEnd> getOwnedEnd();

    /**
     * Filtered Getter for relation 'Classifier->OwnedEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("14df626d-d264-4cf0-91fa-c0064af2ad1c")
    <T extends AssociationEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->BpmnRepresents'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bfbe80ed-5659-461c-a3cf-65ea8621b04a")
    EList<BpmnParticipant> getBpmnRepresents();

    /**
     * Filtered Getter for relation 'Classifier->BpmnRepresents'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2be94d09-2f20-4ff5-8115-f09cda4ec449")
    <T extends BpmnParticipant> List<T> getBpmnRepresents(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->Throwing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("84313c37-bf13-4473-bd1f-b08261a655b7")
    EList<RaisedException> getThrowing();

    /**
     * Filtered Getter for relation 'Classifier->Throwing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("47acee51-a816-4c08-bf5d-8d71365820eb")
    <T extends RaisedException> List<T> getThrowing(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->InternalStructure'
     * 
     * Metamodel description:
     * <i>Parts owned by the internal structure of the Class. These Parts represent the structure of instances of the Class, once they are instanciated.</i>
     */
    @objid ("7a1b9619-615b-4610-9ef2-32b0d12c1893")
    EList<BindableInstance> getInternalStructure();

    /**
     * Filtered Getter for relation 'Classifier->InternalStructure'
     * 
     * Metamodel description:
     * <i>Parts owned by the internal structure of the Class. These Parts represent the structure of instances of the Class, once they are instanciated.</i>
     */
    @objid ("9cf07d6a-9545-45b8-9a04-ac432642a5bd")
    <T extends BindableInstance> List<T> getInternalStructure(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Classifier->RealizedComponent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("308fff29-4119-40a4-a87f-2cf5db6d034f")
    EList<ComponentRealization> getRealizedComponent();

    /**
     * Filtered Getter for relation 'Classifier->RealizedComponent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5b80c846-0b1a-4d66-9c7d-9d8f42f60f19")
    <T extends ComponentRealization> List<T> getRealizedComponent(java.lang.Class<T> filterClass);

}
