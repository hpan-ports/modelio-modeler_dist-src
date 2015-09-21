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
import org.modelio.metamodel.uml.infrastructure.TaggedValue;

/**
 * TagParameter v0.0.9054
 * 
 * 
 * TaggedValues are a powerful mechanism in Modelio. They can have Parameters that must conform to the TagType structure. 
 * 
 * TagParameters belong to their TaggedValue.
 */
@objid ("008e8d34-c4be-1fd8-97fe-001ec947cd2a")
public interface TagParameter extends Element {
    @objid ("6df31e46-1f59-426a-97f5-ea191c9cde8f")
    public static final String MNAME = "TagParameter";

    /**
     * Getter for attribute 'TagParameter.Value'
     * 
     * Metamodel description:
     * <i>Parameter value.</i>
     */
    @objid ("2b4ea11c-bb79-4f15-bc02-921037aa2b21")
    String getValue();

    /**
     * Setter for attribute 'TagParameter.Value'
     * 
     * Metamodel description:
     * <i>Parameter value.</i>
     */
    @objid ("51ef6177-a25f-4242-abd8-74484baa5b54")
    void setValue(String value);

    /**
     * Getter for relation 'TagParameter->Annoted'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("78afe2c1-e62f-436b-a6be-a836357198dc")
    TaggedValue getAnnoted();

    /**
     * Setter for relation 'TagParameter->Annoted'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("60be3c05-0bee-4edf-94d3-074cc3d71de5")
    void setAnnoted(TaggedValue value);

    /**
     * Getter for relation 'TagParameter->Qualified'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b0dd92a1-cb5d-4962-ac85-48b22e5fff94")
    TaggedValue getQualified();

    /**
     * Setter for relation 'TagParameter->Qualified'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("59b9452c-eee8-4130-8b36-5e1665d80724")
    void setQualified(TaggedValue value);

}
