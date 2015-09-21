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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Component;

/**
 * ComponentRealization v0.0.9054
 * 
 * 
 * A Component may be realized (or implemented) by a number of Classifiers. In that case, a Component owns a set of
 * ComponentRealizations to these Classifiers.
 */
@objid ("62efa8ac-4b66-4ce6-bc08-86fd413905ce")
public interface ComponentRealization extends ModelElement {
    @objid ("87bf802a-2fe0-4f99-b8cc-c2e3be21368f")
    public static final String MNAME = "ComponentRealization";

    /**
     * Getter for relation 'ComponentRealization->RealizingClassifier'
     * 
     * Metamodel description:
     * <i>The Classifiers that are involved in the implementation of the Component that owns this Realization.</i>
     */
    @objid ("ceb3e6c4-3ea3-4ee0-80c2-38a171f692fd")
    Classifier getRealizingClassifier();

    /**
     * Setter for relation 'ComponentRealization->RealizingClassifier'
     * 
     * Metamodel description:
     * <i>The Classifiers that are involved in the implementation of the Component that owns this Realization.</i>
     */
    @objid ("fdc0d689-7359-45a2-86f6-85bcaf3499b1")
    void setRealizingClassifier(Classifier value);

    /**
     * Getter for relation 'ComponentRealization->Abstraction'
     * 
     * Metamodel description:
     * <i>The Component that owns this ComponentRealization and which is implemented by its realizing Classifiers.
     * </i>
     */
    @objid ("9720afc7-e3a2-47c1-875f-38200ee489a1")
    Component getAbstraction();

    /**
     * Setter for relation 'ComponentRealization->Abstraction'
     * 
     * Metamodel description:
     * <i>The Component that owns this ComponentRealization and which is implemented by its realizing Classifiers.
     * </i>
     */
    @objid ("4223d17b-ba24-4e0d-aca3-9cfb4b7cfe57")
    void setAbstraction(Component value);

}
