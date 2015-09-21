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
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * InteractionFragment v0.0.9054
 * 
 * 
 * InteractionFragment is an abstract notion of the most general interaction unit. An interaction fragment is a piece of an interaction. 
 * 
 * InteractionFragments sequencing information is handled by an internal feature that is not directly accessible.
 * 
 * The Joni Java API provides methods to access the ordering of InteractionFragments.
 */
@objid ("004713c8-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionFragment extends ModelElement {
    @objid ("2224434e-b1aa-4311-905f-1ac5d96cfd09")
    public static final String MNAME = "InteractionFragment";

    /**
     * Getter for attribute 'InteractionFragment.LineNumber'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("25c52edc-bbaf-4631-b9b2-a83410f22f64")
    int getLineNumber();

    /**
     * Setter for attribute 'InteractionFragment.LineNumber'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("7621e973-8b4c-4def-901a-ae2a05124e8e")
    void setLineNumber(int value);

    /**
     * Getter for relation 'InteractionFragment->EnclosingOperand'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f2ee80ce-58a9-4d65-8d8b-8130d949e43e")
    InteractionOperand getEnclosingOperand();

    /**
     * Setter for relation 'InteractionFragment->EnclosingOperand'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("db660cd0-4447-4be8-b72a-580cf2822266")
    void setEnclosingOperand(InteractionOperand value);

    /**
     * Getter for relation 'InteractionFragment->EnclosingInteraction'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fde20af7-5264-4db7-ba11-fed8c387b7d0")
    Interaction getEnclosingInteraction();

    /**
     * Setter for relation 'InteractionFragment->EnclosingInteraction'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f69ccace-b4f1-4740-a1e9-ee28d46152d6")
    void setEnclosingInteraction(Interaction value);

    /**
     * Getter for relation 'InteractionFragment->Covered'
     * 
     * Metamodel description:
     * <i>References the Lifelines that the InteractionFragment involves.</i>
     */
    @objid ("f55e3de9-4d93-4482-af15-f49177461441")
    EList<Lifeline> getCovered();

    /**
     * Filtered Getter for relation 'InteractionFragment->Covered'
     * 
     * Metamodel description:
     * <i>References the Lifelines that the InteractionFragment involves.</i>
     */
    @objid ("ec3b4664-53dc-4e3b-8f4f-e948364c237d")
    <T extends Lifeline> List<T> getCovered(java.lang.Class<T> filterClass);

}
