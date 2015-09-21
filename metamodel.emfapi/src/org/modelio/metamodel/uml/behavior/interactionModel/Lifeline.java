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
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;

/**
 * Lifeline v0.0.9054
 * 
 * 
 * A lifeline represents an individual participant in the Interaction. While Parts and StructuralFeatures may have multiplicity greater than 1, Lifelines represent only one interacting entity.
 * 
 * If the referenced Instance is multivalued (i.e, has a multiplicity > 1), then the Lifeline may have an expression (the �??selector�??) that specifies which particular part is represented by this Lifeline. If the selector is omitted, this means that an arbitrary representative of the multivalued ConnectableElement is chosen.
 */
@objid ("0048b5b6-c4bf-1fd8-97fe-001ec947cd2a")
public interface Lifeline extends ModelElement {
    @objid ("f96f64ba-5ae5-4981-9d4a-aa06644a193b")
    public static final String MNAME = "Lifeline";

    /**
     * Getter for attribute 'Lifeline.Selector'
     * 
     * Metamodel description:
     * <i>If the referenced ConnectableElement is multivalued, then this specifies the specific individual part within that set.</i>
     */
    @objid ("a3853a6a-bb0c-4d12-8dc5-513c909b933c")
    String getSelector();

    /**
     * Setter for attribute 'Lifeline.Selector'
     * 
     * Metamodel description:
     * <i>If the referenced ConnectableElement is multivalued, then this specifies the specific individual part within that set.</i>
     */
    @objid ("beeb2b8b-63ce-42da-a36b-5818d2ed7d1c")
    void setSelector(String value);

    /**
     * Getter for relation 'Lifeline->CoveredBy'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2c79b20e-3cbe-4456-8487-399262a75c7b")
    EList<InteractionFragment> getCoveredBy();

    /**
     * Filtered Getter for relation 'Lifeline->CoveredBy'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("813dac5b-eeb2-4cd0-a1bf-b65d73b37012")
    <T extends InteractionFragment> List<T> getCoveredBy(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Lifeline->DecomposedAs'
     * 
     * Metamodel description:
     * <i>References the Interaction that represents the decomposition.</i>
     */
    @objid ("31b02f7e-c013-41f1-aa0c-9de74fb7b73b")
    PartDecomposition getDecomposedAs();

    /**
     * Setter for relation 'Lifeline->DecomposedAs'
     * 
     * Metamodel description:
     * <i>References the Interaction that represents the decomposition.</i>
     */
    @objid ("11a632e9-e353-4181-a0c6-705cc674251c")
    void setDecomposedAs(PartDecomposition value);

    /**
     * Getter for relation 'Lifeline->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("490bd701-4f7f-431d-9a7a-6d2a07ee235d")
    Interaction getOwner();

    /**
     * Setter for relation 'Lifeline->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8d0bd04b-5fff-4555-9f9b-ee923590072c")
    void setOwner(Interaction value);

    /**
     * Getter for relation 'Lifeline->Represented'
     * 
     * Metamodel description:
     * <i>References the Instance the Lifeline represents.</i>
     */
    @objid ("e61dd6cb-58ed-49f9-83be-444ab837b199")
    Instance getRepresented();

    /**
     * Setter for relation 'Lifeline->Represented'
     * 
     * Metamodel description:
     * <i>References the Instance the Lifeline represents.</i>
     */
    @objid ("812c4d42-f1cc-440b-b171-cf6b3b92357c")
    void setRepresented(Instance value);

}
