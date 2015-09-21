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
import org.modelio.metamodel.uml.statik.VisibilityMode;

/**
 * Feature v0.0.9054
 * 
 * 
 * In the metamodel, a Feature declares a behavioral or structural characteristic of an Instance of a Classifier or of the Classifier itself. Properties of a Class can be handled in an abstract way. 
 * 
 * In Modelio, an AssociationEnd is also a Feature. The name of a Feature corresponds to the name of the role of the opposite related Class. 
 * 
 * In Modelio, a Feature belongs to its Classifier.
 */
@objid ("000b00cc-c4bf-1fd8-97fe-001ec947cd2a")
public interface Feature extends ModelElement {
    @objid ("23e51cff-18ff-4f1c-8fbf-ff115724e6e1")
    public static final String MNAME = "Feature";

    /**
     * Getter for attribute 'Feature.Visibility'
     * 
     * Metamodel description:
     * <i>Member visibility (public, protected, private, or package).</i>
     */
    @objid ("572f979a-fa4e-4adc-8f2b-4e59d84644c2")
    VisibilityMode getVisibility();

    /**
     * Setter for attribute 'Feature.Visibility'
     * 
     * Metamodel description:
     * <i>Member visibility (public, protected, private, or package).</i>
     */
    @objid ("d4003872-77b0-4cb5-9ba3-64a2f209ecf9")
    void setVisibility(VisibilityMode value);

    /**
     * Getter for attribute 'Feature.IsClass'
     * 
     * Metamodel description:
     * <i>Specifies a Class member that is shared by all instances of the Class.</i>
     */
    @objid ("047438c8-4d93-4d8c-8387-5b608d4a5dbe")
    boolean isIsClass();

    /**
     * Setter for attribute 'Feature.IsClass'
     * 
     * Metamodel description:
     * <i>Specifies a Class member that is shared by all instances of the Class.</i>
     */
    @objid ("a0a51c5e-665b-46a2-b090-f8d37469d308")
    void setIsClass(boolean value);

    /**
     * Getter for attribute 'Feature.IsAbstract'
     * 
     * Metamodel description:
     * <i>Determines abstract features, that is to say, those not implemented at this level.</i>
     */
    @objid ("0b9b08e9-7214-4a2b-b1cd-36719f13cbcd")
    boolean isIsAbstract();

    /**
     * Setter for attribute 'Feature.IsAbstract'
     * 
     * Metamodel description:
     * <i>Determines abstract features, that is to say, those not implemented at this level.</i>
     */
    @objid ("75426ee8-5db7-43a1-908a-a516c95b6f3b")
    void setIsAbstract(boolean value);

}
