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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * Constraint v0.0.9054
 * 
 * 
 * Constraints can express restrictions and relationships that cannot be expressed using UML notation. They are particularly useful for stating global conditions or conditions that affect a number of elements. 
 * 
 * Constraints can have predefined names, and can also represent pre-conditions, post-conditions and invariants (pre-defined stereotypes). 
 * 
 * The language specific MDACs (C++, Java) add a specific stereotype for the pre-conditions, post-conditions and invariants expressed in these languages, such as, for example, C++Invariant or JavaPreCondition. 
 * 
 * In Modelio, a Constraint is not made up of anything. It is only  managed by specific copy/transfer rules.
 */
@objid ("008538a6-c4be-1fd8-97fe-001ec947cd2a")
public interface Constraint extends ModelElement {
    @objid ("b5566120-9e39-48c3-b18b-d495bb429306")
    public static final String MNAME = "Constraint";

    /**
     * Getter for attribute 'Constraint.BaseClass'
     * 
     * Metamodel description:
     * <i>MetaClass whose instances can be constrained by the current Constraint.</i>
     */
    @objid ("8d5ee42e-1e88-446f-b1d4-5dff58e0f24a")
    String getBaseClass();

    /**
     * Setter for attribute 'Constraint.BaseClass'
     * 
     * Metamodel description:
     * <i>MetaClass whose instances can be constrained by the current Constraint.</i>
     */
    @objid ("888206c2-988d-47d3-9d87-47053e97154d")
    void setBaseClass(String value);

    /**
     * Getter for attribute 'Constraint.Body'
     * 
     * Metamodel description:
     * <i>If the Constraint is not predefined (for example, ordered), then it is expressed in the body. 
     * 
     * Modelio supports natural language. For every generator (C++, Java) some constraints have a dedicated stereotype (JavaPrecondition, C++Invariant), and are taken into account during code generation.</i>
     */
    @objid ("f5acd337-2b1e-47f5-8367-4fe94cf42192")
    String getBody();

    /**
     * Setter for attribute 'Constraint.Body'
     * 
     * Metamodel description:
     * <i>If the Constraint is not predefined (for example, ordered), then it is expressed in the body. 
     * 
     * Modelio supports natural language. For every generator (C++, Java) some constraints have a dedicated stereotype (JavaPrecondition, C++Invariant), and are taken into account during code generation.</i>
     */
    @objid ("ec7f83bb-34bd-42bf-a368-9f09db2accb3")
    void setBody(String value);

    /**
     * Getter for attribute 'Constraint.Language'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fb9b21f4-2234-492f-8bd2-82e7834166aa")
    String getLanguage();

    /**
     * Setter for attribute 'Constraint.Language'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8cd66d7b-a95f-474d-aa77-dda624c20e4c")
    void setLanguage(String value);

    /**
     * Getter for relation 'Constraint->ConstrainedElement'
     * 
     * Metamodel description:
     * <i>Defines which elements are concerned by the Constraint.</i>
     */
    @objid ("a2849e90-df88-4120-9a6b-5a3b0c59888f")
    EList<ModelElement> getConstrainedElement();

    /**
     * Filtered Getter for relation 'Constraint->ConstrainedElement'
     * 
     * Metamodel description:
     * <i>Defines which elements are concerned by the Constraint.</i>
     */
    @objid ("796d35c5-0f3b-45f1-b520-f106356f551a")
    <T extends ModelElement> List<T> getConstrainedElement(java.lang.Class<T> filterClass);

}
