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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;

/**
 * Interaction v0.0.9054
 * 
 * 
 * Interactions are units of behavior of an enclosing Classifier. Interactions focus on the passing of information with Messages between the Instances, Attributes, Parameters, ...  of the Classifier or the Operation.
 * 
 * An Interaction belongs to a NameSpace or an Operation.
 * 
 * The interaction is composed of Lifelines and InteractionFragments, some of them send or receive Messages.
 * 
 * InteractionFragments are ordered by an internal feature that is not directly accessible.
 * 
 * The Joni Java API provides methods to access the ordering of InteractionFragments.
 */
@objid ("004683fe-c4bf-1fd8-97fe-001ec947cd2a")
public interface Interaction extends Behavior {
    @objid ("0609744a-a7f9-4803-b95d-147837ea3b40")
    public static final String MNAME = "Interaction";

    /**
     * Getter for relation 'Interaction->FormalGate'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("025c1107-c757-4ea1-8b3c-4663b65d9ce3")
    EList<Gate> getFormalGate();

    /**
     * Filtered Getter for relation 'Interaction->FormalGate'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("04134902-cfcc-47dd-b2e6-1a21aab8da5f")
    <T extends Gate> List<T> getFormalGate(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Interaction->Fragment'
     * 
     * Metamodel description:
     * <i>The set of fragments in the Interaction.</i>
     */
    @objid ("af12e6a1-aab4-47c1-8ab2-5da668d41de1")
    EList<InteractionFragment> getFragment();

    /**
     * Filtered Getter for relation 'Interaction->Fragment'
     * 
     * Metamodel description:
     * <i>The set of fragments in the Interaction.</i>
     */
    @objid ("5a35d2c4-d1f9-4463-b6b1-43452ae7b7d3")
    <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Interaction->OwnedLine'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("5a218116-13f0-45cd-80cb-3a854d1fb1a6")
    EList<Lifeline> getOwnedLine();

    /**
     * Filtered Getter for relation 'Interaction->OwnedLine'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("b4de588d-6a80-4e87-a9d3-f442442b19bb")
    <T extends Lifeline> List<T> getOwnedLine(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Interaction->ReferedUse'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9a94c0bc-ed33-411e-9818-6c5b1c023a85")
    EList<InteractionUse> getReferedUse();

    /**
     * Filtered Getter for relation 'Interaction->ReferedUse'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e4e133f0-21c5-44a9-bec1-54ccc9c60813")
    <T extends InteractionUse> List<T> getReferedUse(java.lang.Class<T> filterClass);

}
