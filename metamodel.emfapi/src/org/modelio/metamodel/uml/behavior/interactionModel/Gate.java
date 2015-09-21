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
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;

/**
 * Gate v0.0.9054
 * 
 * 
 * Gates are connected through Messages. A Gate is actually a representative of an OccurrenceSpecification that is not in the same scope as the Gate.
 * 
 * Gates play different roles: we have formal gates on Interactions, and actual gates on InteractionUses.
 */
@objid ("004545ca-c4bf-1fd8-97fe-001ec947cd2a")
public interface Gate extends MessageEnd {
    @objid ("9dcdac62-4393-4f14-9cab-efeadd8df3b0")
    public static final String MNAME = "Gate";

    /**
     * Getter for relation 'Gate->OwnerUse'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d8452597-e578-4060-9ad0-3621a0a2cf80")
    InteractionUse getOwnerUse();

    /**
     * Setter for relation 'Gate->OwnerUse'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7d811a72-2f07-40d9-9721-90292a89bddb")
    void setOwnerUse(InteractionUse value);

    /**
     * Getter for relation 'Gate->Actual'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b1ac3b23-6892-4ea7-a7b6-dd99b14bfdb2")
    EList<Gate> getActual();

    /**
     * Filtered Getter for relation 'Gate->Actual'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("79cb7fd7-8d05-4a07-8c43-7fe9312e2a11")
    <T extends Gate> List<T> getActual(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Gate->OwnerInteraction'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("09d05065-0288-40bc-98cf-f9dfaead1496")
    Interaction getOwnerInteraction();

    /**
     * Setter for relation 'Gate->OwnerInteraction'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("74c66d90-556f-400f-9084-c138e5f08a41")
    void setOwnerInteraction(Interaction value);

    /**
     * Getter for relation 'Gate->OwnerFragment'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1f4a770e-10a2-4f37-901c-f4c5d10c4d89")
    CombinedFragment getOwnerFragment();

    /**
     * Setter for relation 'Gate->OwnerFragment'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ddd831bd-904e-4f9a-a336-ba5dbff2c298")
    void setOwnerFragment(CombinedFragment value);

    /**
     * Getter for relation 'Gate->Formal'
     * 
     * Metamodel description:
     * <i>If the gate belongs to an InteractionUse, then it is connected to a formal gate belonging to the referred interaction.</i>
     */
    @objid ("5349ad09-2238-4168-822e-e5d4b614e676")
    Gate getFormal();

    /**
     * Setter for relation 'Gate->Formal'
     * 
     * Metamodel description:
     * <i>If the gate belongs to an InteractionUse, then it is connected to a formal gate belonging to the referred interaction.</i>
     */
    @objid ("74d9e7e0-973c-4b17-a48f-a8be9a37f87e")
    void setFormal(Gate value);

}
