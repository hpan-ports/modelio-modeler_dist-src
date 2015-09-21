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
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperator;

/**
 * CombinedFragment v0.0.9054
 * 
 * 
 * A combined fragment is defined by an interaction operator and corresponding interaction operands. Through the use of CombinedFragments the user will be able to describe a number of traces in a compact and concise manner. The semantics of a CombinedFragment depend on the interaction operator.
 * 
 * Modelio specific:
 * Gates on CombinedFragments are not supported. In order to model the call and return from a CombinedFragment, create messages just before or just after the CombinedFragment.
 */
@objid ("00435a1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface CombinedFragment extends InteractionFragment {
    @objid ("adb8cfe3-e11b-4f7d-9f70-3c071c8d4dcd")
    public static final String MNAME = "CombinedFragment";

    /**
     * Getter for attribute 'CombinedFragment.Operator'
     * 
     * Metamodel description:
     * <i>Specifies the operation that defines the semantics of this combination of InteractionFragments. The default value is seq.</i>
     */
    @objid ("76a76e9e-c83f-480f-bc05-de8034d36c71")
    InteractionOperator getOperator();

    /**
     * Setter for attribute 'CombinedFragment.Operator'
     * 
     * Metamodel description:
     * <i>Specifies the operation that defines the semantics of this combination of InteractionFragments. The default value is seq.</i>
     */
    @objid ("2a569ca5-0992-4e95-a3d0-875089d0e6ce")
    void setOperator(InteractionOperator value);

    /**
     * Getter for relation 'CombinedFragment->Operand'
     * 
     * Metamodel description:
     * <i>The set of operands of the combined fragment. </i>
     */
    @objid ("d22697f9-6b5c-4a9e-b9ac-492d440ce09c")
    EList<InteractionOperand> getOperand();

    /**
     * Filtered Getter for relation 'CombinedFragment->Operand'
     * 
     * Metamodel description:
     * <i>The set of operands of the combined fragment. </i>
     */
    @objid ("5000c536-dbf3-444c-9891-06b3c7e200b2")
    <T extends InteractionOperand> List<T> getOperand(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'CombinedFragment->FragmentGate'
     * 
     * Metamodel description:
     * <i>Not supported in sequence diagrams:
     * Specifies the gates that form the interface between this CombinedFragment and its surroundings.</i>
     */
    @objid ("65685031-e665-415f-8e71-a0e712d161ec")
    EList<Gate> getFragmentGate();

    /**
     * Filtered Getter for relation 'CombinedFragment->FragmentGate'
     * 
     * Metamodel description:
     * <i>Not supported in sequence diagrams:
     * Specifies the gates that form the interface between this CombinedFragment and its surroundings.</i>
     */
    @objid ("36c60b43-8455-4651-b4ad-6c5c20e58d92")
    <T extends Gate> List<T> getFragmentGate(java.lang.Class<T> filterClass);

}
