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
 Metamodel: Standard, version 0.0.9024, by Modeliosoft
 Generator version: 3.2.10.9023
 Generated on: Mar 19, 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.analyst.RiskContainer;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * AnalystProject v0.0.9054
 * 
 * 
 * Working space for the requirements model. The AnalystProject owns PropertyContainer, the root RequirementContainer and the root Dictionary.
 * 
 * The AnalystProject belongs to a Project.
 */
@objid ("0061ba52-c4bf-1fd8-97fe-001ec947cd2a")
public interface AnalystProject extends ModelElement {
    @objid ("080a6a3e-f2c8-4bea-8620-ef19c53b706c")
    public static final String MNAME = "AnalystProject";

    /**
     * Getter for relation 'AnalystProject->PropertyRoot'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ba03b1e7-41d9-4010-a2a9-e048ba6975a1")
    PropertyContainer getPropertyRoot();

    /**
     * Setter for relation 'AnalystProject->PropertyRoot'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("44e0456e-efd7-46a1-bd5b-0a2d22696e54")
    void setPropertyRoot(PropertyContainer value);

    /**
     * Getter for relation 'AnalystProject->GoalRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("6d02c29c-facb-4e7c-992d-19e207406ab3")
    EList<GoalContainer> getGoalRoot();

    /**
     * Filtered Getter for relation 'AnalystProject->GoalRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("1333a03d-ef6c-4cd3-a66e-8b5beef6963a")
    <T extends GoalContainer> List<T> getGoalRoot(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'AnalystProject->BusinessRuleRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("4f43bedb-50a1-4f69-b373-f554498a1e50")
    EList<BusinessRuleContainer> getBusinessRuleRoot();

    /**
     * Filtered Getter for relation 'AnalystProject->BusinessRuleRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("ff8ca174-7ace-444a-8705-6f4920d05ed1")
    <T extends BusinessRuleContainer> List<T> getBusinessRuleRoot(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'AnalystProject->DictionaryRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("74a85533-5e46-4f71-93bd-7a5d3849d516")
    EList<Dictionary> getDictionaryRoot();

    /**
     * Filtered Getter for relation 'AnalystProject->DictionaryRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("8e26f72e-4db0-4640-98f4-0c72e87e3227")
    <T extends Dictionary> List<T> getDictionaryRoot(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'AnalystProject->RequirementRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("61f6bf2c-00b2-402b-814a-ecf6f3bb2872")
    EList<RequirementContainer> getRequirementRoot();

    /**
     * Filtered Getter for relation 'AnalystProject->RequirementRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("e6c31b81-0784-4793-87f9-d48b7709b0ae")
    <T extends RequirementContainer> List<T> getRequirementRoot(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'AnalystProject->GenericRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("bbdba39a-6699-4492-b520-41783c0dd4d0")
    EList<GenericAnalystContainer> getGenericRoot();

    /**
     * Filtered Getter for relation 'AnalystProject->GenericRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("95d45738-2ef4-45ba-8cea-512e3f26e5fc")
    <T extends GenericAnalystContainer> List<T> getGenericRoot(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'AnalystProject->RiskRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("297bb376-058d-45cc-b894-0473ef948981")
    EList<RiskContainer> getRiskRoot();

    /**
     * Filtered Getter for relation 'AnalystProject->RiskRoot'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("5aa6ed7b-379e-40ca-9052-fefc4c818845")
    <T extends RiskContainer> List<T> getRiskRoot(java.lang.Class<T> filterClass);

}
