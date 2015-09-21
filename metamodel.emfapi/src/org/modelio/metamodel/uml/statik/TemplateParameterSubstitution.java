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
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;

/**
 * TemplateParameterSubstitution v0.0.9054
 * 
 * 
 * A TemplateParameterSubstitution associates one or more actual Parameters with a formal template Parameter within the context of a TemplateBinding.  
 * 
 * In Modelio, a TemplateParameterSubstitution cannot own its actual value. The actual value can be referenced by the Actual dependency or defined by the StringValue attribute.
 */
@objid ("001dff92-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateParameterSubstitution extends ModelElement {
    @objid ("8becfe66-1cb2-4a14-85e8-b5463145910b")
    public static final String MNAME = "TemplateParameterSubstitution";

    /**
     * Getter for attribute 'TemplateParameterSubstitution.Value'
     * 
     * Metamodel description:
     * <i>The value that is the actual parameter for this substitution. It is used for value template parameters.</i>
     */
    @objid ("fddc54ae-e660-445e-9df5-54de3280f755")
    String getValue();

    /**
     * Setter for attribute 'TemplateParameterSubstitution.Value'
     * 
     * Metamodel description:
     * <i>The value that is the actual parameter for this substitution. It is used for value template parameters.</i>
     */
    @objid ("3e9dd246-dca4-49ca-a188-127c5afd79e9")
    void setValue(String value);

    /**
     * Getter for relation 'TemplateParameterSubstitution->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c598ac06-17e8-42d6-9bf4-7cba541695ed")
    TemplateBinding getOwner();

    /**
     * Setter for relation 'TemplateParameterSubstitution->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b70c0de8-1661-4e6d-81f8-1b93004aad9d")
    void setOwner(TemplateBinding value);

    /**
     * Getter for relation 'TemplateParameterSubstitution->Actual'
     * 
     * Metamodel description:
     * <i>The elements that are the actual parameters for this substitution.</i>
     */
    @objid ("38b5e6bc-bc91-47ea-99a1-239cf346a840")
    ModelElement getActual();

    /**
     * Setter for relation 'TemplateParameterSubstitution->Actual'
     * 
     * Metamodel description:
     * <i>The elements that are the actual parameters for this substitution.</i>
     */
    @objid ("6dc340ed-94b9-4c42-8973-fbd6220ae018")
    void setActual(ModelElement value);

    /**
     * Getter for relation 'TemplateParameterSubstitution->FormalParameter'
     * 
     * Metamodel description:
     * <i>The formal template parameter that is associated with this substitution.</i>
     */
    @objid ("62b7e1bf-edfc-4847-a192-2e39628e2e4e")
    TemplateParameter getFormalParameter();

    /**
     * Setter for relation 'TemplateParameterSubstitution->FormalParameter'
     * 
     * Metamodel description:
     * <i>The formal template parameter that is associated with this substitution.</i>
     */
    @objid ("c7271cce-766b-4244-8fe0-4f8421190227")
    void setFormalParameter(TemplateParameter value);

}
