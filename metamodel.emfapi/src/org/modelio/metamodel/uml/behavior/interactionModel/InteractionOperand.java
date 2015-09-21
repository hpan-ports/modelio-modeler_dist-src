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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;

/**
 * InteractionOperand v0.0.9054
 * 
 * 
 * An InteractionOperand is contained in a CombinedFragment and contains an ordered set of InteractionFragments. It represents one operand of the expression given by the enclosing CombinedFragment. 
 * 
 * An InteractionOperand has an optional guard expression. Only InteractionOperands with a guard that evaluates to true at this point in the interaction will be considered for the production of the traces for the enclosing CombinedFragment.
 */
@objid ("00479758-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionOperand extends InteractionFragment {
    @objid ("8ff0a5f7-4c75-49ff-b833-ba2b9fc6f48c")
    public static final String MNAME = "InteractionOperand";

    /**
     * Getter for attribute 'InteractionOperand.Guard'
     * 
     * Metamodel description:
     * <i>Constraint of the operand.</i>
     */
    @objid ("c4098a15-8628-4d3c-90cc-d475de7ac6de")
    String getGuard();

    /**
     * Setter for attribute 'InteractionOperand.Guard'
     * 
     * Metamodel description:
     * <i>Constraint of the operand.</i>
     */
    @objid ("c5ca138a-2c98-4a8f-ba5b-5d44d3e850ee")
    void setGuard(String value);

    /**
     * Getter for attribute 'InteractionOperand.EndLineNumber'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5e032ba7-f5d4-4945-a0f4-b4d88d0454d1")
    int getEndLineNumber();

    /**
     * Setter for attribute 'InteractionOperand.EndLineNumber'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("21d9b15a-1326-4ebb-8d6b-00404b48824b")
    void setEndLineNumber(int value);

    /**
     * Getter for relation 'InteractionOperand->Fragment'
     * 
     * Metamodel description:
     * <i>The fragments of the operand.</i>
     */
    @objid ("0ab608ff-ed2a-4178-9cfc-1e2c98e76fbd")
    EList<InteractionFragment> getFragment();

    /**
     * Filtered Getter for relation 'InteractionOperand->Fragment'
     * 
     * Metamodel description:
     * <i>The fragments of the operand.</i>
     */
    @objid ("b8a1a28d-e17a-4f65-bda1-dd456903ac39")
    <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InteractionOperand->OwnerFragment'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("73290896-12a2-4fc8-9ea5-16adf814da5d")
    CombinedFragment getOwnerFragment();

    /**
     * Setter for relation 'InteractionOperand->OwnerFragment'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("398aaed2-1313-43d9-8d1b-f6a29c1c9fe4")
    void setOwnerFragment(CombinedFragment value);

}
