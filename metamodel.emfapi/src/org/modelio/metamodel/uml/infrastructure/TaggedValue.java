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
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;

/**
 * TaggedValue v0.0.9054
 * 
 * 
 * In Modelio, TaggedValues can have parameters, and must comply with TagTypes that define which kind of TaggedValues may exist. 
 * 
 * TaggedValues belong to their annotated ModelElement, or to their annotated Note.
 */
@objid ("0090006a-c4be-1fd8-97fe-001ec947cd2a")
public interface TaggedValue extends ModelElement {
    @objid ("f662de76-3cab-4ade-a458-98b1e161db99")
    public static final String MNAME = "TaggedValue";

    /**
     * Getter for relation 'TaggedValue->Annoted'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("aa18dfda-9e5e-446a-89c9-d29ca4d06b5a")
    ModelElement getAnnoted();

    /**
     * Setter for relation 'TaggedValue->Annoted'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2986dafe-6b7b-4b26-893c-87e007504c8c")
    void setAnnoted(ModelElement value);

    /**
     * Getter for relation 'TaggedValue->Actual'
     * 
     * Metamodel description:
     * <i>Parameters of the TaggedValue.</i>
     */
    @objid ("558778a3-1f08-45c9-b5ac-fb2e6a02bd1b")
    EList<TagParameter> getActual();

    /**
     * Filtered Getter for relation 'TaggedValue->Actual'
     * 
     * Metamodel description:
     * <i>Parameters of the TaggedValue.</i>
     */
    @objid ("432ac809-2661-4865-b3b9-4247eb7ce772")
    <T extends TagParameter> List<T> getActual(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'TaggedValue->Qualifier'
     * 
     * Metamodel description:
     * <i>Current Qualifier of the TaggedValue. A qualifier is a parameter that is placed in first place Tag:Qualifier (Parameters).</i>
     */
    @objid ("acc5e1aa-3f6f-44fd-a206-f3349f7d07dc")
    TagParameter getQualifier();

    /**
     * Setter for relation 'TaggedValue->Qualifier'
     * 
     * Metamodel description:
     * <i>Current Qualifier of the TaggedValue. A qualifier is a parameter that is placed in first place Tag:Qualifier (Parameters).</i>
     */
    @objid ("d1328d40-7fba-48f2-ae44-cc9a73da1ee2")
    void setQualifier(TagParameter value);

    /**
     * Getter for relation 'TaggedValue->Definition'
     * 
     * Metamodel description:
     * <i>Determines the TagType that is the model of the current TaggedValue.</i>
     */
    @objid ("71eefdf3-2b19-40bd-81b4-23da8314598d")
    TagType getDefinition();

    /**
     * Setter for relation 'TaggedValue->Definition'
     * 
     * Metamodel description:
     * <i>Determines the TagType that is the model of the current TaggedValue.</i>
     */
    @objid ("046bac6a-70e4-42a7-9923-363eacd54cf4")
    void setDefinition(TagType value);

}
