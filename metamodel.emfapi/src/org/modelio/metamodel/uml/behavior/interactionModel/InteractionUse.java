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
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;

/**
 * InteractionUse v0.0.9054
 * 
 * 
 * An InteractionUse refers to an Interaction. The InteractionUse is a shorthand for copying the contents of the referred Interaction where the InteractionUse is. To be accurate the copying must connect the formal gates with the actual ones.
 * 
 * It is common to want to share portions of an interaction between several other interactions. An InteractionUse allows multiple interactions to reference an interaction that represents a common portion of their specification.
 */
@objid ("00482c5e-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionUse extends InteractionFragment {
    @objid ("ccb48c67-b8b3-4782-b4b1-f8b7f567efa1")
    public static final String MNAME = "InteractionUse";

    /**
     * Getter for attribute 'InteractionUse.EndLineNumber'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f546679e-1d33-4f31-a20c-6c2e6564fbaf")
    int getEndLineNumber();

    /**
     * Setter for attribute 'InteractionUse.EndLineNumber'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4dd0a163-22e3-4fd9-b17d-d3870942f569")
    void setEndLineNumber(int value);

    /**
     * Getter for relation 'InteractionUse->ActualGate'
     * 
     * Metamodel description:
     * <i>The actual gates of the InteractionUse.</i>
     */
    @objid ("3b096efc-dd05-4fc4-b6a2-1e226a3be071")
    EList<Gate> getActualGate();

    /**
     * Filtered Getter for relation 'InteractionUse->ActualGate'
     * 
     * Metamodel description:
     * <i>The actual gates of the InteractionUse.</i>
     */
    @objid ("edd8b05d-7adf-43f5-9647-663cb0279c56")
    <T extends Gate> List<T> getActualGate(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'InteractionUse->RefersTo'
     * 
     * Metamodel description:
     * <i>Refers to the Interaction that defines its meaning.</i>
     */
    @objid ("5a4eaf05-abef-484c-ba84-f5894d04b26d")
    Interaction getRefersTo();

    /**
     * Setter for relation 'InteractionUse->RefersTo'
     * 
     * Metamodel description:
     * <i>Refers to the Interaction that defines its meaning.</i>
     */
    @objid ("2e8b9609-77ba-4012-89c8-9c06c264d40f")
    void setRefersTo(Interaction value);

}
