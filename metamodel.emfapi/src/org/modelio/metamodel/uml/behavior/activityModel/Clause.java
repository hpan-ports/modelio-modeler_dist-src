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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * Clause v0.0.9054
 * 
 * 
 * A clause is an element that represents a single branch of a conditional construct, including a test and a body section. The body section is executed only (but not necessarily) if the test section is true.
 */
@objid ("002cb618-c4bf-1fd8-97fe-001ec947cd2a")
public interface Clause extends ModelElement {
    @objid ("424ba721-bfc2-41b2-bf70-6f38da6d8396")
    public static final String MNAME = "Clause";

    /**
     * Getter for attribute 'Clause.Test'
     * 
     * Metamodel description:
     * <i>Specifies the result of the test.</i>
     */
    @objid ("064a900f-68fd-473f-92ca-22f2c7c3bdf4")
    String getTest();

    /**
     * Setter for attribute 'Clause.Test'
     * 
     * Metamodel description:
     * <i>Specifies the result of the test.</i>
     */
    @objid ("98ac36b6-e969-4902-993f-0eb58d7a8d17")
    void setTest(String value);

    /**
     * Getter for relation 'Clause->Body'
     * 
     * Metamodel description:
     * <i>A nested activity fragment that is executed if the test is true and the clause is chosen over any concurrent clauses that are also true.</i>
     */
    @objid ("78b215de-2b38-452f-becb-6dc8ba3b32a4")
    EList<ActivityNode> getBody();

    /**
     * Filtered Getter for relation 'Clause->Body'
     * 
     * Metamodel description:
     * <i>A nested activity fragment that is executed if the test is true and the clause is chosen over any concurrent clauses that are also true.</i>
     */
    @objid ("63de3ecb-704a-4c84-a1ff-9b82a1a6febc")
    <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Clause->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d0ddb47a-d04c-472d-ac64-12d772f754f8")
    ConditionalNode getOwner();

    /**
     * Setter for relation 'Clause->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("781bfbf9-fd13-4212-afcb-9d4889cc8575")
    void setOwner(ConditionalNode value);

}
