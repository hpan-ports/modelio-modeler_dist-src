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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;

/**
 * TemplateParameter v0.0.9054
 * 
 * 
 * NameSpaces and Operations can be templated by TemplateParameters. 
 * 
 * Concerning NameSpaces, this particularly applies for Classes, Packages and Collaborations. 
 * 
 * In Modelio, TemplateParameters belong to their parameterized NameSpace or Operation.
 */
@objid ("001d18e8-c4bf-1fd8-97fe-001ec947cd2a")
public interface TemplateParameter extends GeneralClass {
    @objid ("b4c59131-90c0-4c1f-ac00-02711fdc71cb")
    public static final String MNAME = "TemplateParameter";

    /**
     * Getter for attribute 'TemplateParameter.DefaultValue'
     * 
     * Metamodel description:
     * <i>Default parameter value, when the IsValueParameter is true.</i>
     */
    @objid ("188cf679-3e95-45eb-ace0-53aa12b3d004")
    String getDefaultValue();

    /**
     * Setter for attribute 'TemplateParameter.DefaultValue'
     * 
     * Metamodel description:
     * <i>Default parameter value, when the IsValueParameter is true.</i>
     */
    @objid ("21aa2e9c-ec34-4bc4-bb78-93638201e277")
    void setDefaultValue(String value);

    /**
     * Getter for attribute 'TemplateParameter.IsValueParameter'
     * 
     * Metamodel description:
     * <i>Expresses if the parameter is a value, which is in this case "DefaultValue".</i>
     */
    @objid ("668c0774-68f4-4018-aca7-d230386612c9")
    boolean isIsValueParameter();

    /**
     * Setter for attribute 'TemplateParameter.IsValueParameter'
     * 
     * Metamodel description:
     * <i>Expresses if the parameter is a value, which is in this case "DefaultValue".</i>
     */
    @objid ("4c78d93c-7397-4bc6-90a5-ca3c20b0836c")
    void setIsValueParameter(boolean value);

    /**
     * Getter for relation 'TemplateParameter->ParameterSubstitution'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1e1f488f-f0c3-470a-884d-2c626dede39e")
    EList<TemplateParameterSubstitution> getParameterSubstitution();

    /**
     * Filtered Getter for relation 'TemplateParameter->ParameterSubstitution'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("789a798e-7c39-4e54-8b82-6dbcc25bbe28")
    <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'TemplateParameter->Type'
     * 
     * Metamodel description:
     * <i>Default parameter type, when IsValueParameter is false.</i>
     */
    @objid ("d265f634-8931-4645-85a9-c66acc416042")
    ModelElement getType();

    /**
     * Setter for relation 'TemplateParameter->Type'
     * 
     * Metamodel description:
     * <i>Default parameter type, when IsValueParameter is false.</i>
     */
    @objid ("d160db6c-f2de-4216-9f71-f8e2bdd53304")
    void setType(ModelElement value);

    /**
     * Getter for relation 'TemplateParameter->Parameterized'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6a626708-cacf-4b2b-83b5-413d8a6af8ba")
    NameSpace getParameterized();

    /**
     * Setter for relation 'TemplateParameter->Parameterized'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("011f46d4-ad20-4f59-aa81-0cf02d565cb2")
    void setParameterized(NameSpace value);

    /**
     * Getter for relation 'TemplateParameter->OwnedParameterElement'
     * 
     * Metamodel description:
     * <i>A TemplateParameter references a ParameterableElement that is exposed as a formal template parameter in the container template. This parameterizable element is meaningful only within the template, or other templates that may have access to its content (for example, if the template supports specialization). The exposed parameterizable element may not be used in other parts of the model. A TemplateParameter may own the exposed ParameterableElement in situations where that element is only referenced from within the template.</i>
     */
    @objid ("0ce79fa8-d69d-43df-a4bc-7b844ca52b90")
    ModelElement getOwnedParameterElement();

    /**
     * Setter for relation 'TemplateParameter->OwnedParameterElement'
     * 
     * Metamodel description:
     * <i>A TemplateParameter references a ParameterableElement that is exposed as a formal template parameter in the container template. This parameterizable element is meaningful only within the template, or other templates that may have access to its content (for example, if the template supports specialization). The exposed parameterizable element may not be used in other parts of the model. A TemplateParameter may own the exposed ParameterableElement in situations where that element is only referenced from within the template.</i>
     */
    @objid ("125713e9-0fec-4545-a737-6d5fa6c0558a")
    void setOwnedParameterElement(ModelElement value);

    /**
     * Getter for relation 'TemplateParameter->DefaultType'
     * 
     * Metamodel description:
     * <i>Value that the parameter takes if no specific value is specified.</i>
     */
    @objid ("0f2227f5-34b9-47b7-a5fa-6b2a001d6ed7")
    ModelElement getDefaultType();

    /**
     * Setter for relation 'TemplateParameter->DefaultType'
     * 
     * Metamodel description:
     * <i>Value that the parameter takes if no specific value is specified.</i>
     */
    @objid ("307d9bb0-457a-4cf8-81ff-10e9ff8d3ce8")
    void setDefaultType(ModelElement value);

    /**
     * Getter for relation 'TemplateParameter->ParameterizedOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("58a8608d-c560-4267-88f8-7e0280f66712")
    Operation getParameterizedOperation();

    /**
     * Setter for relation 'TemplateParameter->ParameterizedOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7cf5ba5b-9458-45dc-90a8-d742e123f986")
    void setParameterizedOperation(Operation value);

}
