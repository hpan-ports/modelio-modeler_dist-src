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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Classifier;

/**
 * Substitution v0.0.9054
 * 
 * 
 * A Substitution is a relationship between two Classifiers, which signifies that the substituting Classifier complies with the contract specified by the contract Classifier. 
 * 
 * This implies that Instances of the substituting Classifier are runtime substitutable where instances of the contract Classifier are expected.  
 * 
 * The Substitution relationship denotes runtime substitutability that is not based on specialization. Substitution, unlike specialization, does not imply inheritance of structure, but only compliance of publicly available contracts. 
 * 
 * A Substitution like relationship is instrumental to specify runtime substitutability for domains that do not support specialization such as certain component technologies. It requires that (1) Interfaces implemented by the contract Classifier are also implemented by the substituting Classifier, or else the substituting Classifier implements a more specialized Interface type. And, (2) the any Port owned by the contract Classifier has a matching Port (see Ports) owned by the substituting Classifier.  
 * 
 * In Modelio, contrary to UML 2.0, Substitution derives from ModelElement. A Substitution is owned by its substituting Classifier.
 */
@objid ("008dd736-c4be-1fd8-97fe-001ec947cd2a")
public interface Substitution extends ModelElement {
    @objid ("0c748d35-7a15-47db-a20a-5d9422d23a64")
    public static final String MNAME = "Substitution";

    /**
     * Getter for relation 'Substitution->Contract'
     * 
     * Metamodel description:
     * <i>Designates the Classifier that is substituted.</i>
     */
    @objid ("5142c47a-923b-48a7-959b-983c18785f34")
    Classifier getContract();

    /**
     * Setter for relation 'Substitution->Contract'
     * 
     * Metamodel description:
     * <i>Designates the Classifier that is substituted.</i>
     */
    @objid ("b0bd4bdd-e214-4461-9a71-93195f36af58")
    void setContract(Classifier value);

    /**
     * Getter for relation 'Substitution->SubstitutingClassifier'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2aeffc89-ac67-4b8d-b55c-6739f5a54ed4")
    Classifier getSubstitutingClassifier();

    /**
     * Setter for relation 'Substitution->SubstitutingClassifier'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("78b7397a-0e3e-4780-8dda-f57f372a798a")
    void setSubstitutingClassifier(Classifier value);

}
