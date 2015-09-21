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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;

/**
 * ConditionalNode v0.0.9054
 * 
 * 
 * A conditional node consists of one or more clauses. Each clause consists of a test section and a body section. When the conditional node begins execution, the test sections of the clauses are executed. If one or more test sections yield a true value, one of the corresponding body sections will be executed. If more than one test section yields a true value, only one body section will be executed. If no test section yields a true value, then no body section is executed; this may be a semantic error if output values are expected from the conditional node.
 * 
 * An �??else�?� clause is a clause that is a successor to all other clauses in the conditional and whose test part always returns true.
 */
@objid ("002d52f8-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConditionalNode extends StructuredActivityNode {
    @objid ("641d5186-feba-4499-8703-ded2823312db")
    public static final String MNAME = "ConditionalNode";

    /**
     * Getter for attribute 'ConditionalNode.IsDeterminate'
     * 
     * Metamodel description:
     * <i>If true, the modeler asserts that at most one test will succeed. The default value is false. </i>
     */
    @objid ("4936b7a8-11e6-4f37-9b07-f5d4912aebad")
    boolean isIsDeterminate();

    /**
     * Setter for attribute 'ConditionalNode.IsDeterminate'
     * 
     * Metamodel description:
     * <i>If true, the modeler asserts that at most one test will succeed. The default value is false. </i>
     */
    @objid ("783377dc-6aaf-4926-87c3-d960b3797ffc")
    void setIsDeterminate(boolean value);

    /**
     * Getter for attribute 'ConditionalNode.IsAssured'
     * 
     * Metamodel description:
     * <i>If true, the modeler asserts that at least one test will succeed. The default value is false.</i>
     */
    @objid ("a0a5dcfa-77c7-4572-8e7d-61a746f8644e")
    boolean isIsAssured();

    /**
     * Setter for attribute 'ConditionalNode.IsAssured'
     * 
     * Metamodel description:
     * <i>If true, the modeler asserts that at least one test will succeed. The default value is false.</i>
     */
    @objid ("209bb675-091d-4bd9-aeae-5430be3c2c05")
    void setIsAssured(boolean value);

    /**
     * Getter for relation 'ConditionalNode->OwnedClause'
     * 
     * Metamodel description:
     * <i>Set of clauses composing the conditional.</i>
     */
    @objid ("065b6e5f-0311-474b-ae75-3742d860c9c9")
    EList<Clause> getOwnedClause();

    /**
     * Filtered Getter for relation 'ConditionalNode->OwnedClause'
     * 
     * Metamodel description:
     * <i>Set of clauses composing the conditional.</i>
     */
    @objid ("40c919cd-82db-4de9-a803-4e9a0a144b29")
    <T extends Clause> List<T> getOwnedClause(java.lang.Class<T> filterClass);

}
