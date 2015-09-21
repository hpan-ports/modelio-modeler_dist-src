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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;

/**
 * Note v0.0.9054
 * 
 * 
 * Notes correspond to the UML notes appearing in diagrams on  ModelElements. They can include implementation code, documentation and every possible kind of textual information. 
 * 
 * Notes are related to NoteTypes, which declare the Notes permitted in a model. 
 * 
 * In Modelio, Notes belong to their annotated ModelElement. Notes correspond to the UML 2.0 Comment metaclass.
 * 
 * The Note name defines the purpose of the Note, and has to conform to the NoteType name, where this is defined.
 */
@objid ("0089d1ea-c4be-1fd8-97fe-001ec947cd2a")
public interface Note extends ModelElement {
    @objid ("b784b63b-0428-47ab-8baf-2e7cf855db72")
    public static final String MNAME = "Note";

    /**
     * Getter for attribute 'Note.Content'
     * 
     * Metamodel description:
     * <i>Textual content of the Note. This text can be a description or any syntax used for a target language.</i>
     */
    @objid ("72a52b6b-97f5-4695-a483-2eb2aaff4917")
    String getContent();

    /**
     * Setter for attribute 'Note.Content'
     * 
     * Metamodel description:
     * <i>Textual content of the Note. This text can be a description or any syntax used for a target language.</i>
     */
    @objid ("233cef2f-fa62-4470-8cbb-3c1ccf4dd987")
    void setContent(String value);

    /**
     * Getter for attribute 'Note.MimeType'
     * 
     * Metamodel description:
     * <i>The mime type of the note. 
     * This is an indication about the contents of the note and about the fromat of this content.
     * If no value is set (null or empty string), the mime type for the Note is taken from the NoteType.
     * 
     * </i>
     */
    @objid ("19de606f-bb1a-43d2-9d8c-3b215793e8e4")
    String getMimeType();

    /**
     * Setter for attribute 'Note.MimeType'
     * 
     * Metamodel description:
     * <i>The mime type of the note. 
     * This is an indication about the contents of the note and about the fromat of this content.
     * If no value is set (null or empty string), the mime type for the Note is taken from the NoteType.
     * 
     * </i>
     */
    @objid ("4098aa8f-6703-4ebd-937f-e5d7ca1563ca")
    void setMimeType(String value);

    /**
     * Getter for relation 'Note->Model'
     * 
     * Metamodel description:
     * <i>The NoteType defines the different kinds of Notes that are allowed in a particular context (in specific MDACs, for example).</i>
     */
    @objid ("424c384d-00fe-45cc-b91e-06e122b9b04f")
    NoteType getModel();

    /**
     * Setter for relation 'Note->Model'
     * 
     * Metamodel description:
     * <i>The NoteType defines the different kinds of Notes that are allowed in a particular context (in specific MDACs, for example).</i>
     */
    @objid ("f3d99fc9-6082-4c0c-b439-c4a803c1625d")
    void setModel(NoteType value);

    /**
     * Getter for relation 'Note->Subject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2f6f3a07-00f6-4a50-98b7-6b328dd2f9d6")
    ModelElement getSubject();

    /**
     * Setter for relation 'Note->Subject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7b71a4bc-3dba-4414-a028-d66024cb299d")
    void setSubject(ModelElement value);

}
