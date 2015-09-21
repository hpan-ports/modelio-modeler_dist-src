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
import org.modelio.metamodel.uml.statik.NameSpace;

/**
 * Generalization v0.0.9054
 * 
 * 
 * Each instance of the specific Classifier is also an instance of the general Classifier. Thus, the specific Classifier indirectly has Features of the more general Classifier. Generalization corresponds to the usual Inheritance concept.  
 * 
 * In Modelio, a Generalization belongs to its SpecializationNameSpace.
 */
@objid ("000c7bb4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Generalization extends ModelElement {
    @objid ("18ad41ef-5196-4361-b422-216ebe060fd8")
    public static final String MNAME = "Generalization";

    /**
     * Getter for attribute 'Generalization.Discriminator'
     * 
     * Metamodel description:
     * <i>Designates a family of sub-classes with the same parent Class. The name appears graphically, by linking the Generalizations belonging to this family.</i>
     */
    @objid ("7862e575-65a3-4cc2-96a3-692e2f2ae7ad")
    String getDiscriminator();

    /**
     * Setter for attribute 'Generalization.Discriminator'
     * 
     * Metamodel description:
     * <i>Designates a family of sub-classes with the same parent Class. The name appears graphically, by linking the Generalizations belonging to this family.</i>
     */
    @objid ("80dec3d2-7d34-43e3-8537-0c407b0bfe8f")
    void setDiscriminator(String value);

    /**
     * Getter for relation 'Generalization->SuperType'
     * 
     * Metamodel description:
     * <i>Defines the parent element.</i>
     */
    @objid ("6cb7c43b-2b63-4cce-a4f1-5f46f1e33fd7")
    NameSpace getSuperType();

    /**
     * Setter for relation 'Generalization->SuperType'
     * 
     * Metamodel description:
     * <i>Defines the parent element.</i>
     */
    @objid ("1839b9d3-cba4-4de6-b49d-4b794e491c09")
    void setSuperType(NameSpace value);

    /**
     * Getter for relation 'Generalization->SubType'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("df8d5bea-d8b7-423c-b0e3-c5baa2f29a69")
    NameSpace getSubType();

    /**
     * Setter for relation 'Generalization->SubType'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("12507fb3-da8a-4236-a210-d000d08326e8")
    void setSubType(NameSpace value);

}
