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
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.ParameterEffectKind;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.PassingMode;

/**
 * Parameter v0.0.9054
 * 
 * 
 * The main characteristics of a Parameter are its name, passing mode and type. 
 * 
 * The return value of an Operation is a specific case managed by a specific Association between Operation and Parameter. 
 * 
 * In Modelio, a Parameter belongs to its Operation.
 */
@objid ("0017c640-c4bf-1fd8-97fe-001ec947cd2a")
public interface Parameter extends ModelElement {
    @objid ("4b0a386e-0bb9-4d82-95f6-323229513a78")
    public static final String MNAME = "Parameter";

    /**
     * Getter for attribute 'Parameter.ParameterPassing'
     * 
     * Metamodel description:
     * <i>Defines the passing mode (in, out or inout) of the Parameter.</i>
     */
    @objid ("0acaba0e-c7ab-4c02-87b3-0bff557df913")
    PassingMode getParameterPassing();

    /**
     * Setter for attribute 'Parameter.ParameterPassing'
     * 
     * Metamodel description:
     * <i>Defines the passing mode (in, out or inout) of the Parameter.</i>
     */
    @objid ("03dcfe5c-211f-4641-ad17-5c69821f02ac")
    void setParameterPassing(PassingMode value);

    /**
     * Getter for attribute 'Parameter.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>Minimum value of the association's multiplicity. When placed on a target end, the multiplicity specifies the number of target instances that may be associated with a single source instance via the given Association.</i>
     */
    @objid ("ea5f3451-0e91-4e0e-9759-832f81955440")
    String getMultiplicityMin();

    /**
     * Setter for attribute 'Parameter.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>Minimum value of the association's multiplicity. When placed on a target end, the multiplicity specifies the number of target instances that may be associated with a single source instance via the given Association.</i>
     */
    @objid ("b8696e9b-9e72-440c-9f37-c7e5db5f49aa")
    void setMultiplicityMin(String value);

    /**
     * Getter for attribute 'Parameter.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>Maximum value of the multiplicity.</i>
     */
    @objid ("f55cc589-082b-4fdc-8f4d-3649503ec650")
    String getMultiplicityMax();

    /**
     * Setter for attribute 'Parameter.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>Maximum value of the multiplicity.</i>
     */
    @objid ("09439074-1585-47db-8a98-55e4514a5228")
    void setMultiplicityMax(String value);

    /**
     * Getter for attribute 'Parameter.TypeConstraint'
     * 
     * Metamodel description:
     * <i>Construction parameter of the Parameter's class (for example, the size of a characters string).</i>
     */
    @objid ("9907b2e8-7670-4cc3-9b42-4e472d14ca56")
    String getTypeConstraint();

    /**
     * Setter for attribute 'Parameter.TypeConstraint'
     * 
     * Metamodel description:
     * <i>Construction parameter of the Parameter's class (for example, the size of a characters string).</i>
     */
    @objid ("1f340f3c-b933-48d9-bcee-5f17a8d41f71")
    void setTypeConstraint(String value);

    /**
     * Getter for attribute 'Parameter.DefaultValue'
     * 
     * Metamodel description:
     * <i>Default value of the Parameter. When the caller does not specify a value, then the default value is applied.</i>
     */
    @objid ("cbf3f7cf-5bf8-41f5-ad53-238736e4dbd0")
    String getDefaultValue();

    /**
     * Setter for attribute 'Parameter.DefaultValue'
     * 
     * Metamodel description:
     * <i>Default value of the Parameter. When the caller does not specify a value, then the default value is applied.</i>
     */
    @objid ("82adddc9-dd61-4367-aa83-cefbdb1b41e6")
    void setDefaultValue(String value);

    /**
     * Getter for attribute 'Parameter.IsOrdered'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6529b30a-eedd-448d-9f14-161b97ed7486")
    boolean isIsOrdered();

    /**
     * Setter for attribute 'Parameter.IsOrdered'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("41027037-4fdb-4446-97e4-fb7479c2cdc7")
    void setIsOrdered(boolean value);

    /**
     * Getter for attribute 'Parameter.IsUnique'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5734727c-9da7-4a64-945c-d187ada2b6de")
    boolean isIsUnique();

    /**
     * Setter for attribute 'Parameter.IsUnique'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("814b5002-a6cf-409b-acbe-3ff14c1c3138")
    void setIsUnique(boolean value);

    /**
     * Getter for attribute 'Parameter.IsException'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("60b45e3b-094b-4748-b0cb-a222c8041226")
    boolean isIsException();

    /**
     * Setter for attribute 'Parameter.IsException'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("56ec8d6d-4c78-4821-a09a-e2ab1d266545")
    void setIsException(boolean value);

    /**
     * Getter for attribute 'Parameter.IsStream'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d6b1d17b-2adb-43bc-bff4-7b82c5b344d8")
    boolean isIsStream();

    /**
     * Setter for attribute 'Parameter.IsStream'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6a281cce-0dae-4c30-b3ea-da95a1a628da")
    void setIsStream(boolean value);

    /**
     * Getter for attribute 'Parameter.Effect'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f522aa7e-4008-45d0-bdf4-24b87ba5a5a7")
    ParameterEffectKind getEffect();

    /**
     * Setter for attribute 'Parameter.Effect'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("938155df-c4ca-40da-9886-62ccdbe1f9ec")
    void setEffect(ParameterEffectKind value);

    /**
     * Getter for relation 'Parameter->BpmnRepresentingDataInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f1365247-ea4b-4c1f-a64c-4f889dddd1ee")
    EList<BpmnDataInput> getBpmnRepresentingDataInput();

    /**
     * Filtered Getter for relation 'Parameter->BpmnRepresentingDataInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("45ff5226-3afd-48c3-bf68-5a1e4d048f5b")
    <T extends BpmnDataInput> List<T> getBpmnRepresentingDataInput(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Parameter->Type'
     * 
     * Metamodel description:
     * <i>Defines the Class to which the Parameter belongs.</i>
     */
    @objid ("7f9fc0f7-2b96-4cdb-8c80-16140e9c8c49")
    GeneralClass getType();

    /**
     * Setter for relation 'Parameter->Type'
     * 
     * Metamodel description:
     * <i>Defines the Class to which the Parameter belongs.</i>
     */
    @objid ("36cb5cd2-f42c-4510-b7ef-ebc1bf04d3be")
    void setType(GeneralClass value);

    /**
     * Getter for relation 'Parameter->Composed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6eb4ef9a-ab98-4516-a8e3-408ad89bb3a2")
    Operation getComposed();

    /**
     * Setter for relation 'Parameter->Composed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a59f8912-28cb-4a3f-b5f4-98e8306e033c")
    void setComposed(Operation value);

    /**
     * Getter for relation 'Parameter->Matching'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("45bbbab2-fce6-4d76-bcd1-7296573ddbe7")
    EList<Pin> getMatching();

    /**
     * Filtered Getter for relation 'Parameter->Matching'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("4228509e-7297-4842-bc77-ceb623c275c4")
    <T extends Pin> List<T> getMatching(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Parameter->BpmnRepresentingDataOutput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("03644d48-f695-4612-8586-fb7500cd1e2e")
    EList<BpmnDataOutput> getBpmnRepresentingDataOutput();

    /**
     * Filtered Getter for relation 'Parameter->BpmnRepresentingDataOutput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("71de61e4-78f7-4916-b3e4-a121dff375b3")
    <T extends BpmnDataOutput> List<T> getBpmnRepresentingDataOutput(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Parameter->SRepresentation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("76090b26-c7c1-4376-8e3b-d04d04a2b0e4")
    EList<Signal> getSRepresentation();

    /**
     * Filtered Getter for relation 'Parameter->SRepresentation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4943bd87-0464-49d6-87f5-6b5e54f72f80")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Parameter->Returned'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6bc888dc-a4fd-4861-8c31-42eb6e75ba47")
    Operation getReturned();

    /**
     * Setter for relation 'Parameter->Returned'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d93b3c09-1ab5-4e8c-af2a-068a07afd8e8")
    void setReturned(Operation value);

    /**
     * Getter for relation 'Parameter->BehaviorParam'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f87bcaad-8792-4c18-be03-33331bbef705")
    EList<BehaviorParameter> getBehaviorParam();

    /**
     * Filtered Getter for relation 'Parameter->BehaviorParam'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0f7afc0e-76b9-4c5e-a344-ee40dea74c50")
    <T extends BehaviorParameter> List<T> getBehaviorParam(java.lang.Class<T> filterClass);

}
